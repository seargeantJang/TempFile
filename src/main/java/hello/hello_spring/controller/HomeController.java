package hello.hello_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
