package net.industryhive.service;

import net.industryhive.bean.TopicExample;
import net.industryhive.been.wrap.WrapTopic;
import net.industryhive.dao.TopicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 帖子管理Service
 * @author 未央
 * @create 2019-12-25 15:52
 */
@Service
public class TopicService {

    @Autowired
    private TopicMapper topicMapper;

    public List<WrapTopic> getAllTopic(int page){
        int startRow = (page - 1) * 100;
        List<WrapTopic> wrapTopicList = topicMapper.findListWithUsername(startRow);
        return wrapTopicList;
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

}
