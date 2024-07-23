package io.javabrains.springbootstarter.springbootquickstart.topics;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topics> getAllTopics(){
		List<Topics> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}

	public Optional<Topics> getTopic(String id) {
		if (topicRepository.existsById(id)) {
			return topicRepository.findById(id);			
		}
		else {
			throw new Message("Topic with id " + id + " not found.");			
		}
	}

	public void addTopics(Topics topics2) {
		topicRepository.save(topics2);
		throw new Message("Topic added successfully!");		
	}

	public void updateTopics(String id, Topics topics2) {
		if (topicRepository.existsById(id)) {
			topicRepository.save(topics2);
			throw new Message("Topic updated successfully!");
		}
		else {
			throw new Message("Topic with ID " + id + " not found");
			
		}
				
	}

	public void deleteTopic(String id) {
		if (topicRepository.existsById(id)) {
			topicRepository.deleteById(id);
			throw new Message("Topic deleted successfully!");
			
		}
		else {
			 throw new Message("Topic not found with id: " + id);
	         
		}
		
	}

	
}
