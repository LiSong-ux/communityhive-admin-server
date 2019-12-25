package net.industryhive.controller;

import net.industryhive.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 未央
 * @create 2019-12-25 15:51
 */
@Controller
public class TopicController {

    @Autowired
    private TopicService topicService;

//    @RequestMapping("/allTopic")
//    public UnifiedResult getAllTopic(){
//    }

}
