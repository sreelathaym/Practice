package com.spring.Practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//which means we ready to spring mvc use by web request
@RestController
@Controller
public class HelloController {
   // path variable
    @GetMapping("/hello/{name}")
    public HelloResponse hello(@PathVariable String name){
        return  new HelloResponse("Hello World "+name);
    }
    @GetMapping("/hello")
    public HelloResponse hello(){
        return  new HelloResponse("Hello World ");
    }
    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello "+ name+ "!");
    }


}
