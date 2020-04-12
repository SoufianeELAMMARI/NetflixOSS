package com.test.controllers;


import com.test.entities.Website;
import com.test.services.WebSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebSiteController {

    @Autowired
    WebSiteService webSiteService;

    @GetMapping("/getAll")
    public List<Website> getAllWebSites(){
        return webSiteService.getAllWebSites();
    }
}
