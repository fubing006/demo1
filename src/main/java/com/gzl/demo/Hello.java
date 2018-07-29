package com.gzl.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gzl
 * @description
 * @Date 2018/7/28
 */
@RestController
public class Hello {
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String sayHello(){
        return "hello";
    }
}
