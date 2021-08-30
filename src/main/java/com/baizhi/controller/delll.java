package com.baizhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.StringReader;

@RestController
@CrossOrigin
public class delll {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("dell")
    public void del(String rz){
        redisTemplate.delete(rz);
    }

}
