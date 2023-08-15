package br.com.gerenciamento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/* |-- ANOTAÇÕES
 * |-----------------------------------------------------------------
 * |- Controller responsavel pela página inicial, ou seja o index
 */

@Controller//declara que essa classe é Controller
public class HomeController {

    @GetMapping("/")//mapeia um Get para protocolo HTTP, ou seja lê uma requisição
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index"); //seta o nome da view
        mv.addObject("msg", "insanidade");   
        return mv; //retorna objeto ModelAndView

    }  
}
