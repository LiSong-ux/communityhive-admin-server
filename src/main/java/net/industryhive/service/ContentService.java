package net.industryhive.service;

import net.industryhive.bean.Reply;
import net.industryhive.bean.ReplyExample;
import net.industryhive.bean.Topic;
import net.industryhive.bean.TopicExample;
import net.industryhive.bean.wrap.WrapReply;
import net.industryhive.bean.wrap.WrapTopic;
import net.industryhive.dao.ReplyMapper;
import net.industryhive.dao.TopicMapper;
import net.industryhive.entity.UnifiedResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 帖子管理Service
 *
 * @author 未央
 * @create 2019-12-25 15:52
 */
@Service
public class ContentService {

    @Autowired
    private TopicMapper topicMapper;

    @Autowired
    private ReplyMapper replyMapper;

    /**
     * 获取所有帖子
     *
     * @param page
     * @return
     */
    public List<WrapTopic> getAllTopic(int page) {
        int startRow = (page - 1) * 100;
        List<WrapTopic> wrapTopicList = topicMapper.findListWithUsername(startRow);
        return wrapTopicList;
    }

    public WrapTopic getWrapTopic(int id) {
        WrapTopic wrapTopic = topicMapper.findWithUsername(id);
        //如果帖子不存在或已被删除，则返回空
        if (wrapTopic == null || wrapTopic.getDeleted()) {
            return null;
        }
        return wrapTopic;
    }

    /**
     * 获取帖子包装类型回复列表
     *
     * @param topicId
     * @param page
     * @return
     */
    public List<WrapReply> getWrapReplyList(int topicId, int page) {
        int startRow = (page - 1) * 50;
        List<WrapReply> wrapReplyList = replyMapper.findWithUsername(topicId, startRow);
        //遍历回复列表，如果回复已被删除，则将内容替换为“该回复以被删除”
        for (WrapReply wrapReply : wrapReplyList) {
            if (wrapReply.getDeleted()) {
                wrapReply.setContent("<p style='font-style:oblique'>该回复已被删除</p>");
            }
        }
        return wrapReplyList;
    }

    /**
     * 根据帖子ID获取该帖子的回复数量
     *
     * @param topicId
     * @return
     */
    public long getReplyCountByTopicId(int topicId) {
        ReplyExample example = new ReplyExample();
        ReplyExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        long replyCount = replyMapper.countByExample(example);
        return replyCount;
    }

    /**
     * 获取帖子数量
     *
     * @return
     */
    public long getTopicCount() {
        TopicExample example = new TopicExample();
        long topicCount = topicMapper.countByExample(example);
        return topicCount;
    }

    /**
     * 根据id删除帖子
     *
     * @param id
     */
    public UnifiedResult deleteTopic(int id) {
        Topic topic = topicMapper.selectByPrimaryKey(id);
        if (topic == null) {
            return UnifiedResult.build(400, "帖子不存在", null);
        }
        if (topic.getDeleted() == true) {
            return UnifiedResult.build(400, "帖子已被删除", null);
        }
        topic.setDeleted(true);
        topicMapper.updateByPrimaryKeySelective(topic);
        return UnifiedResult.ok();
    }

    /**
     * 根据id删除回复
     *
     * @param id
     * @return
     */
    public UnifiedResult deleteReply(int id) {
        Reply reply = replyMapper.selectByPrimaryKey(id);
        if (reply == null) {
            return UnifiedResult.build(400, "回复不存在", null);
        }
        if (reply.getDeleted() == true) {
            return UnifiedResult.build(400, "该回复已被删除", null);
        }
        reply.setDeleted(true);
        replyMapper.updateByPrimaryKeySelective(reply);
        return UnifiedResult.ok();
    }
}
