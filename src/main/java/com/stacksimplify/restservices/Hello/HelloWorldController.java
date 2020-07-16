package com.stacksimplify.restservices.Hello;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//Controller
@RestController
public class HelloWorldController {
	
//	@RequestMapping(method=RequestMethod.GET, path ="/helloWorld")
	@GetMapping("/helloWorld1")
	public String helloWorld() {
		return "Hello World1";
	}
	@GetMapping("/helloWorld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Kalyan", "Reddy", "Hyderarab");
		
	}

}
