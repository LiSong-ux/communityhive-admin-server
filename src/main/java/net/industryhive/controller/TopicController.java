package net.industryhive.controller;

import net.industryhive.been.wrap.WrapTopic;
import net.industryhive.entity.UnifiedResult;
import net.industryhive.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 未央
 * @create 2019-12-25 15:51
 */
@Controller
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/allTopic")
    @ResponseBody
    public UnifiedResult getAllTopic(Integer page) {
        if (page == null) {
            page = 1;
        }
        Map<String, Object> map = new HashMap<>();
        List<WrapTopic> wrapTopicList = topicService.getAllTopic(page);
        long topicCount = topicService.getTopicCount();
        map.put("topicList", wrapTopicList);
        map.put("topicCount", topicCount);
        return UnifiedResult.ok(map);
    }

    @RequestMapping("/deleteTopic")
    @ResponseBody
    public UnifiedResult deleteTopic(Integer id) {
        if (id == null) {
            return UnifiedResult.build(400, "请指定帖子ID", null);
        }
        UnifiedResult result = topicService.deleteTopic(id);
        return result;
    }

}
