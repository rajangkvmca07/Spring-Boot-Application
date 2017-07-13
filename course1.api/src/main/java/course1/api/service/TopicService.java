package course1.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import course1.api.pojo.Topics;

//A Singleton class

@Service
public class TopicService {
	
	private List<Topics> topic=new ArrayList<Topics>
	(Arrays.asList(new Topics("1","Spring","SpringBoot"),new Topics("2","Spring","SpringCore"),new Topics("3","Spring","SpringMVC"),new Topics("4","Spring","SpringCloud")));
	
	public List<Topics> getAllTopic(){
		return topic;
		
	}
	
	public Topics getTopic(String id){
		Topics object=null;
		for(Topics obj:topic){
			
			if(obj.getId().equals(id)){
			object= obj;	
			}
		}
		return object;
	}
	
	public void add(Topics topic){
		this.topic.add(topic);
	}

	public void update(Topics topic, String id){
		int index=0;
		for(Topics obj:this.topic){
			if(obj.getId().equals(id)){
			 this.topic.set(index, topic);	
			}
			index++;
		}
		
	}
}
