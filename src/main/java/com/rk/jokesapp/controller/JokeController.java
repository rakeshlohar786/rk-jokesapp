package com.rk.jokesapp.controller;

import com.rk.jokesapp.service.JokesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokesServiceImpl jokesService;

    @Autowired
    public JokeController(JokesServiceImpl jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke",jokesService.getJoke());

        return "chucknorris";

    }



}
