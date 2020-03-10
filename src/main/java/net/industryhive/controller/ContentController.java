package net.industryhive.controller;

import net.industryhive.bean.wrap.WrapReply;
import net.industryhive.bean.wrap.WrapTopic;
import net.industryhive.entity.UnifiedResult;
import net.industryhive.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 未央
 * @create 2019-12-25 15:51
 */
@RestController
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/allTopic")
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

    @RequestMapping("/lockTopic")
    public UnifiedResult lockTopic(Integer id, Integer locked) {
        if (id == null || locked == null || (locked != 0 && locked != 1)) {
            return UnifiedResult.build(400, "参数错误", null);
        }
        UnifiedResult result = contentService.lockTopic(id, locked);
        return result;
    }

    @RequestMapping("/hideTopic")
    public UnifiedResult hideTopic(Integer id, Integer hided) {
        if (id == null || hided == null || (hided != 0 && hided != 1)) {
            return UnifiedResult.build(400, "参数错误", null);
        }
        UnifiedResult result = contentService.hideTopic(id, hided);
        return result;
    }

    @RequestMapping("/deleteTopic")
    public UnifiedResult deleteTopic(Integer id) {
        if (id == null) {
            return UnifiedResult.build(400, "请指定帖子ID", null);
        }
        UnifiedResult result = contentService.deleteTopic(id);
        return result;
    }

    @RequestMapping("/deleteReply")
    public UnifiedResult deleteReply(Integer id) {
        if (id == null) {
            return UnifiedResult.build(400, "请指定回复ID", null);
        }
        UnifiedResult result = contentService.deleteReply(id);
        return result;
    }

}
