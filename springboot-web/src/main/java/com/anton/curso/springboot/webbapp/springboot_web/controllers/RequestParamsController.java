package com.anton.curso.springboot.webbapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anton.curso.springboot.webbapp.springboot_web.models.dto.ParamDto;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "El mensaje es nulo"/* , name = "mensaje" */) String message){

        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

}
