package com.naveen.personalproject.Topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public String getAllTopic(){
        return "All Topics";
    }

    @RequestMapping("/listTopics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getSingleTopic(id);
    }

    
}
