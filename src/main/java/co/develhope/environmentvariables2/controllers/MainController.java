package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    Environment environment;

    @GetMapping
    public String getWelcome(){
        return environment.getProperty("myCustomEnvs.welcomeMsg");
    }
}