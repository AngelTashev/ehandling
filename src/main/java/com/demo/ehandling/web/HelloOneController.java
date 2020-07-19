package com.demo.ehandling.web;

import com.demo.ehandling.exception.HelloException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloOneController {

    @GetMapping("/crash-me1")
    public ModelAndView crashMe() {
        throw new HelloException("I crashed again");
    }

}
