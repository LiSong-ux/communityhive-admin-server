package net.industryhive.controller;

import net.industryhive.been.wrap.WrapReply;
import net.industryhive.been.wrap.WrapTopic;
import net.industryhive.entity.UnifiedResult;
import net.industryhive.service.ContentService;
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
    private ContentService contentService;

    @RequestMapping("/allTopic")
    @ResponseBody
    public UnifiedResult getAllTopic(Integer page) {
        if (page == null) {
            page = 1;
        }
        Map<String, Object> map = new HashMap<>();
        List<WrapTopic> wrapTopicList = contentService.getAllTopic(page);
        long topicCount = contentService.getTopicCount();
        map.put("topicList", wrapTopicList);
        map.put("topicCount", topicCount);
        return UnifiedResult.ok(map);
    }

    @RequestMapping("/topic")
    @ResponseBody
    public UnifiedResult getTopic(Integer id, Integer page) {
        if (id == null || page == null) {
            return UnifiedResult.build(400, "帖子id为空", null);
        }
        Map<String, Object> topicMap = new HashMap<>();

        WrapTopic wrapTopic = contentService.getWrapTopic(id);
        if (wrapTopic == null) {
            return UnifiedResult.build(400, "帖子不存在", null);
        }
        List<WrapReply> wrapReplyList = contentService.getWrapReplyList(id, page);
        long replyCount = contentService.getReplyCountByTopicId(id);

        topicMap.put("topic", wrapTopic);
        topicMap.put("replyList", wrapReplyList);
        topicMap.put("replyCount", replyCount);
        return UnifiedResult.ok(topicMap);

    }

    @RequestMapping("/deleteTopic")
    @ResponseBody
    public UnifiedResult deleteTopic(Integer id) {
        if (id == null) {
            return UnifiedResult.build(400, "请指定帖子ID", null);
        }
        UnifiedResult result = contentService.deleteTopic(id);
        return result;
    }

}
