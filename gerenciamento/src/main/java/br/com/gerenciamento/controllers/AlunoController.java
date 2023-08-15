package br.com.gerenciamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gerenciamento.dao.AlunoDao;
import br.com.gerenciamento.model.*;
/*
 * Como observado path variables em spring são dadas dentro do controller
 * teste
 */


@Controller
public class AlunoController {
    
    @Autowired
    private AlunoDao alunoRepositorio;

    @GetMapping("/inserirAluno")
    public ModelAndView setAlunos(Aluno aluno) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aluno/formAluno");
        mv.addObject("aluno", new Aluno());
        return mv;

    }

    //Esse post mapping retorna uma view
    @PostMapping("/inserirAluno")
    public ModelAndView inserirAluno(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/");
        alunoRepositorio.save(aluno);  
        return mv; 
    }
}
