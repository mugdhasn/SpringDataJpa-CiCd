package com.mg.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mg.db.TopicRepository;
import com.mg.model.Topic;

@Service
public class TopicService {
//	private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("A1", "Topic name 1", "asdf"),
//			new Topic("A2", "topic name 2", "xcvb"),
//			new Topic("A3", "topic name 3", "asdfefd")));
	
	@Autowired
	private TopicRepository tr;

	public List<Topic> getAllTopics() {
		//return topics;
		List<Topic>topics=new ArrayList<>();
		tr.findAll()
		.forEach(topics::add);
		return topics;
	}

	


	public void addTopic(Topic topic) {
		tr.save(topic);
		
	}

	public void updateTopic(Topic topic, String id) {

		tr.save(topic);
		
	}

	public void deleteTopic(String id) {
		
		tr.deleteById(id);
	}
}
