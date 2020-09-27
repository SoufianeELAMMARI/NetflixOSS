package com.user.services;


import com.user.feignServices.TestServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    private TestServiceFeign testServiceFeign;

    public Map<String,String> getAll(){

        return testServiceFeign.getTest();
    }
}
