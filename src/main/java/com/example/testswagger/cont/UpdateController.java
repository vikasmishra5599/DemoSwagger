package com.example.testswagger.cont;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UpdateController {

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String postOutput(){
        return "dont show doc output";
    }
}
