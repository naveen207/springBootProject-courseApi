package com.naveen.personalproject.Topic;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "spring framework", "spring Framework description"),
            new Topic("java", "java framework", "java Framework description"),
            new Topic("python", "python framework", "python Framework description")

    );

    public List<Topic> getAllTopics(){
    return topics;
    }


    public Topic getSingleTopic(String id) {
        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }
}
