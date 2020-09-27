package com.user.feignServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "test-service")
@Component
public interface TestServiceFeign {

    @GetMapping(value = "/check")
    Map<String,String> getTest();


}