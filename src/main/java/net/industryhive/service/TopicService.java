package net.industryhive.service;

import net.industryhive.dao.TopicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 帖子管理Service
 * @author 未央
 * @create 2019-12-25 15:52
 */
@Service
public class TopicService {

    @Autowired
    private TopicMapper topicMapper;

//    public List<Topic> getAllTopic(){
//    }

}
