package com.eamapp.springweb.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eamapp.springweb.models.entity.Cliente;
import com.eamapp.springweb.models.entity.Vendedores;

@Controller
@RequestMapping("/cliente")
public class ClienteControlle {
    
        @GetMapping({ "/", "", "/cliente" })
        public String indexClienteString(Model model) {
            Cliente cliente = new Cliente();
            model.addAttribute("titulo", "Perfilt");
            model.addAttribute("cliente", cliente);
            cliente.setNombre("sebastian");
            cliente.setApellido("grisales");
            cliente.setEmail("sebazgrisales@gmail.com");
            model.addAttribute("cuerpo","perfil del cliente".concat(cliente.getNombre()));
            return "cliente/index";

        }

        @ModelAttribute("vendedores")
        public List<Vendedores> poblarVededores(){
            List<Vendedores> vendedores = Arrays.asList(new Vendedores("pepiyo","lopez", "pepito@prueba.com"),
        new Vendedores("santi","hernandez", "santiago@prueba.com"));
        return vendedores;
        }
    }
