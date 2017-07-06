package com.mycompany.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengziyi on 2017/7/6.
 */
@RestController
public class DemoController {
    @RequestMapping("/hello1222")
    String hello() {
        return "this is a test111222";
    }
}
