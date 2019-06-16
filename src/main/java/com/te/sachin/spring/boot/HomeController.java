package com.te.sachin.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET,value="/hello/s1")  
    public String hello(){  
        return"Hello sachin!";  
    }  
	@RequestMapping(method=RequestMethod.GET,value="/hello/s2")  
    public String hello1(){  
        return"Hello sachin!";  
    }
    @RequestMapping(method=RequestMethod.GET,value="/hello/s3")  
    public String hello2(){  
        return"Hello banny!";  
    }    

}
