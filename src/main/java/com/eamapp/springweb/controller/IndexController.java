package com.eamapp.springweb.controller;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("titulo", "Hola spring boot");
        model.addAttribute("parrafo", "la prueba spring");
        return "index";
    }

    
    @GetMapping("/contactenos")
    public String contactenos(Model model) {
        model.addAttribute("contactar", "este numero nos puede contactar");
        return "contactar";
    }
}
