package com.anton.curso.springboot.webbapp.springboot_web.controllers;

import org.springframework.context.expression.MapAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anton.curso.springboot.webbapp.springboot_web.models.User;

import java.util.List;
import java.util.Arrays;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Anton");
        model.addAttribute("lastName", "Mesias");
        return "details";
    }

    /*
     * -> Forma de utilizar el Map en vez de Model. Hay que importar Map de
     * java.util AQUI NO ME FUNCIONA
     * 
     * @GetMapping("/details")
     * public String details(Map<String, Object> model){
     * model.put("title", "Hola mundo Spring Boot");
     * model.put("name", "Anton");
     * model.put("lastName", "Mesias");
     * return "details";
     * }
     */

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
                new User("Anton", "Mesías"),
                new User("Josu", "Maneiro", "josu@gmail.com"),
                new User("John", "Mundarra", "harrisonfrost@gmail.com"));

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";

    }
}
