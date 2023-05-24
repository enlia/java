package com.fang.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControl {
    @RequestMapping("/hello")
    @ResponseBody
    String hi(String name) {
        return "hello "+name;
    }

    @RequestMapping("/bye")
    @ResponseBody
    String byt(){
        return "bye";
    }

}
