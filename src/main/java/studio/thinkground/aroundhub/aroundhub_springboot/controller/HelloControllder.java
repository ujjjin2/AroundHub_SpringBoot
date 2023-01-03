package studio.thinkground.aroundhub.aroundhub_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllder {

    @RequestMapping(value = "/hello")
    public String hello(){return "Hello, World";}

}
