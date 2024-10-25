package com.anton.curso.springboot.webbapp.springboot_web.controllers;

import org.springframework.context.expression.MapAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

     @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Anton");
        model.addAttribute("lastName", "Mesias");
        return "details";
    }

   /* 
   -> Forma de utilizar el Map en vez de Model. Hay que importar Map de java.util  AQUI NO ME FUNCIONA
   
   @GetMapping("/details")
    public String details(Map<String, Object> model){
        model.put("title", "Hola mundo Spring Boot");
        model.put("name", "Anton");
        model.put("lastName", "Mesias");
        return "details";
    }
*/ 
}
