package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/str")
    public String getString(){
        return "String";
    }
}
