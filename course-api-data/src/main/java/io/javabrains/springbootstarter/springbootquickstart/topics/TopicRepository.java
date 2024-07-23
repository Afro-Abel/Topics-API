package io.javabrains.springbootstarter.springbootquickstart.topics;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository <Topics, String>{

}