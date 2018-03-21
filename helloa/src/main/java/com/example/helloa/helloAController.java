package com.example.helloa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Cober
 * @DATE on 21:54 2018/3/20.
 */
@RestController
public class helloAController {
    @RequestMapping(value = "/helloa",method = RequestMethod.GET)
    public String helloa(){

        return "{\"hello\": “A/B\"}";
    }
}
