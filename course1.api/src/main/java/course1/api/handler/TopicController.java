package course1.api.handler;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import course1.api.pojo.Topics;
import course1.api.service.TopicService;


@RestController
//@RequestMapping("/app")
public class TopicController {
	
	
	@Autowired
	private TopicService service;
	
	@RequestMapping({"/","/topics"})
	public List<Topics> getAllTopic(){
		return service.getAllTopic();
		
	}
	
	@RequestMapping("/topic/{id}")
	public Topics getTopic(@PathVariable String id){
		
		return service.getTopic(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void add(@RequestBody Topics topic){
		service.add(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void update(@RequestBody Topics topic, @PathVariable String id){
		service.update(topic,id);
	}
	
	
	@RequestMapping("/getMap")
	public Map<String , String> getMap(){
		Map<String , String> testMap= new HashMap<String,String>();
		testMap.put("Name", "Rajan");
		testMap.put("Age", "32");
		testMap.put("Prof", "Software Engineer");
		testMap.put("HomeTown", "GKP");
		testMap.put("Gender", "Male");
		return testMap;
		
	}
	

	@RequestMapping("/getArray")
	public Integer[] array(){
		Integer[] values= {1,2,3,4,5,6,7};
		return values;
		
	}

}
