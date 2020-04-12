package com.test.services;


import com.test.entities.Website;
import com.test.repositories.WebSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSiteService {

    @Autowired
    private WebSiteRepository webSiteRepository;


    public List<Website> getAllWebSites(){

        return webSiteRepository.findAll();
    }

}
