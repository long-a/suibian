package com.example.hellob;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Cober
 * @DATE on 22:01 2018/3/20.
 */
@RestController
public class helloBController {
    @RequestMapping(value = "/hellob",method = RequestMethod.GET)
    public String hellob(){

        return "{\"hello\": “A/B\"}";
    }
}
