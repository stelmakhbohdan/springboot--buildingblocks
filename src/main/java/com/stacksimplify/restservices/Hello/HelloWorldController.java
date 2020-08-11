package com.stacksimplify.restservices.Hello;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
//Controller
@RestController
public class HelloWorldController {
	
	@Autowired
	private ResourceBundleMessageSource messageSource;
//	@RequestMapping(method=RequestMethod.GET, path ="/helloWorld")
	@GetMapping("/helloWorld1")
	public String helloWorld() {
		return "Hello World1";
	}
	@GetMapping("/helloWorld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Kalyan", "Reddy", "Hyderarab");
		
	}
	
	@GetMapping("/hello-int")
	public String getMessagesInI18NFormat(@RequestHeader(name = "Accept-Language",required=false)String locale) {
		return messageSource.getMessage("label.hello",null,new Locale(locale));
	}
	
	@GetMapping("/hello-int2")
	public String getMessagesInI18NFormat2() {
		return messageSource.getMessage("label.hello",null,LocaleContextHolder.getLocale());
	}

}
