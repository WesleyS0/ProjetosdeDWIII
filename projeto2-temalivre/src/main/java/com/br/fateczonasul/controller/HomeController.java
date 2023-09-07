package com.br.fateczonasul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/album")
    public String album() {
        return "album";
    }

    @GetMapping("/periodos")
    public String periodos() {
        return "periodos";
    }

    @GetMapping("/paginainicial")
    public String paginainicial() {
        return "paginainicial";
    }

    @GetMapping("/ArteContemporanea")
    public String ArteContemporanea() {
        return "ArteContemporanea";
    }

    @GetMapping("/Impressionismo")
    public String Impressionismo() {
        return "Impressionismo";
    }

    @GetMapping("/Renascimento")
    public String Renascimento() {
        return "Renascimento";
    }
    @GetMapping("/recebimentodenotas")
    public String recebimentodenotas() {
        return "recebimentodenotas";
    }

    @Autowired
    @Qualifier("appMedia")
    private double appMedia; // Deve ser do tipo double, não String

    @GetMapping("/calcular")
    public String calcular(
            @RequestParam String nome,
            @RequestParam Double nota1,
            @RequestParam Double nota2,
            Model model) {

        model.addAttribute("nome", nome);
        model.addAttribute("nota1", nota1);
        model.addAttribute("nota2", nota2);

        double media = (nota1 + nota2) / 2;
        model.addAttribute("media", media);

        if (media >= appMedia) {
            return "notasboas";
        } else {
            return "notasruins";
        }
    }

}
