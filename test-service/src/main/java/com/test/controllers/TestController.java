package com.test.controllers;


import com.test.entities.Test;
import com.test.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    TestService testService;

     @Value("${me}")
     private String author;

  /*  @GetMapping("/getAll")
    public List<Test> getAll(){
        return testService.getAll();
    }*/

    @GetMapping("/check")
    public Map<String,String> getConfig(){
        Map<String ,String> map=new HashMap<>();
        map.put("me",author);
        map.put("ThreadName",Thread.currentThread().getName());
        return map;
    }
}
