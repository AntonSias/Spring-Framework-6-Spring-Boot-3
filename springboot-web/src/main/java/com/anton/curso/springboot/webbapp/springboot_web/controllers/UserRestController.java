package com.anton.curso.springboot.webbapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.expression.MapAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anton.curso.springboot.webbapp.springboot_web.models.User;
import com.anton.curso.springboot.webbapp.springboot_web.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

     @GetMapping(path = "/details")
    public UserDto details(){
        
        User user = new User("Anton", "Mesias");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring Boot");
       
        return userDto;
    }

    @GetMapping(path = "/details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("Anton", "Mesias");
        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Hola mundo Spring Boot");
        body.put("user", user);
        return body;
    }

   
}
