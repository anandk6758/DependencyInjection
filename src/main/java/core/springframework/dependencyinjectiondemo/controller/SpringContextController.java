package core.springframework.dependencyinjectiondemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class SpringContextController {
    public String Hello(){
        return "Hello";
    }
}
