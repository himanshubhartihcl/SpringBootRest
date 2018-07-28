package com.vin.test.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("1", "ABC", "dec 1"),
			new Topic("2", "CDE", "dec 2"),
			new Topic("3", "EFG", "dec 3")));
	
	public List<Topic> getAllTopic(){
		return topics;
	}
	
	public Topic getSelectedTopic(String id) {
		
	   return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopicInList(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		if(topics.size()>0) {
			for(int i=0;i<topics.size();i++) {
				Topic t1 = topics.get(i);
				if(t1.getId().equals(id)) {
					topics.set(i, topic);
					
				}
			}
		}
		
	}

	public void deleteTopic(String id) {
		
		topics.removeIf(t -> t.getId().equals(id));
	}
}
