package com.wug.wiki.controller;

import com.wug.wiki.domain.Test;
import com.wug.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String testhelo;

    @Resource
    private TestService testService;

    /*
    * GET,POST,PUT,DELETE   四种请求方式
    *
    * 使用@RequestMapping，说明用以上四种请求都可以访问
    * 也可以指定用某种方式，eg. @GetMapping
    * */
    @RequestMapping("/hello")
    public String hello(){
        return "hello"+testhelo;
    }

    @PostMapping("/hello")
    public String helloPost(String name){
        return "Hello,POST,"+name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
