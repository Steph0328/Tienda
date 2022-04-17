package com.Tienda.controller;



import com.Tienda.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j

public class IndexController {
    @Autowired
    private ClienteService clienteService;
    
   @GetMapping("/") 
   
 public  String inicio(Model model) {
     log.info("Estamos usando una arquitectura mvc");
          var clientes=clienteService.getCliente();
     
       model.addAttribute("clientes",null);
     return "index";
     
 }
}
