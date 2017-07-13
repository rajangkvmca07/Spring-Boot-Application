package course1.api.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
	
	@RequestMapping("/hello")
	public String message(){
		return "Welcome";
	}

}
