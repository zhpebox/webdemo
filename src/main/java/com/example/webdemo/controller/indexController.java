package com.example.webdemo.controller;

import com.example.webdemo.po.Gril;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @Value("${gril.name}")
    private String grilName;

    private Gril gril;

    @Autowired
    public indexController(Gril gril) {
        this.gril = gril;
    }

    @GetMapping(value = {"/hello","/hi"})
    public String getIndex(){
        return "hi you!!"+grilName + "===" + gril.toString();
    }

}
