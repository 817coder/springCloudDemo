package com.wang.controller;


import com.wang.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    ScheduleService service;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return service.sayHiFromClientOne( name );
    }
}
