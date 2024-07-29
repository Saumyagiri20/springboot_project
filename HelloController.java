package com.saumyacodes.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String requestMethodName(@RequestParam String param) {
        // You can use the 'param' variable here if needed
        return hello();
    }

    // This method can be private since it is only used internally
    private String hello() {
        return "Hello World";
    }

}

