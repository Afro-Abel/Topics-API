package io.javabrains.springbootstarter.springbootquickstart.topics;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topics> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@GetMapping("topics/{id}")	
	public Optional<Topics> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping("/topics")
	public void addTopics(@RequestBody Topics topics) {
		topicService.addTopics(topics);		
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopics(@RequestBody Topics topics, @PathVariable String id) {
		topicService.updateTopics(id, topics);		
	}
	
	@DeleteMapping("/topics/{id}")	
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}


	
	
	
}






