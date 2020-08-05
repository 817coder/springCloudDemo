package com.wang.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements ScheduleService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
