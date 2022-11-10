package com.sangali.desafioAna.controllers;

import com.sangali.desafioAna.repositories.AnaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnaController {

    private final AnaRepository anaRepository;

    public AnaController(AnaRepository anaRepository) {
        this.anaRepository = anaRepository;
    }

    @RequestMapping("/anas")
    public String getAnas(Model model){
        model.addAttribute("anas", anaRepository.findAll());

        return "anas/list";
    }

}
