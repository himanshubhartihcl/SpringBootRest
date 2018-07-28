package com.vin.test.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/getTopic")
	public List<Topic> getAllTopics() {
		
		return topicService.getAllTopic();
	}
	
	@RequestMapping("/getTopic/{id1}")
	public Topic getSelectedTopicByID(@PathVariable("id1") String id) {
		return topicService.getSelectedTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/getTopic")
	public void createTopic(@RequestBody Topic topic){
		
		topicService.addTopicInList(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/getTopic/{id1}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable("id1") String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/getTopic/{id1}")
	public void deleteTopic(@RequestBody Topic topic, @PathVariable("id1") String id) {
		topicService.deleteTopic(id);
	}
}
