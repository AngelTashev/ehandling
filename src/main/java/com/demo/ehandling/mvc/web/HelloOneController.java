package com.demo.ehandling.mvc.web;

import com.demo.ehandling.mvc.exception.HelloException;
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
