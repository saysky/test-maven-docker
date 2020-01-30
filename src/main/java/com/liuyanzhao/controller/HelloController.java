package com.liuyanzhao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 言曌
 * @date 2020-01-30 11:46
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello docker";
    }
}
