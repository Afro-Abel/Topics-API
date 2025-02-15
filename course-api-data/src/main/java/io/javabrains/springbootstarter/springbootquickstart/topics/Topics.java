package io.javabrains.springbootstarter.springbootquickstart.topics;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "topics")
public class Topics {
	
	@Id	
	private String id;
	private String name;
	private String description;
	
	public Topics() {
						
	}
	
	public Topics(String id, String name, String description) {
		super();
	
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
