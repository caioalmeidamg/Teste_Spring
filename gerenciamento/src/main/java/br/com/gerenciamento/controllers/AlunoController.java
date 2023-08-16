package br.com.gerenciamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import br.com.gerenciamento.dao.AlunoDao;
import br.com.gerenciamento.model.*;
/*
 * Como observado path variables em spring são dadas dentro do controller
 * teste
 */


 //o RestController é fundamental pra se fazer uma apirest 
@RestController
@RequestMapping("/Aluno")
public class AlunoController {
    
    @Autowired
    private AlunoDao alunoRepositorio;

    //Retorna necessariamente um json
    @GetMapping("/{id}")
    public Optional setAlunos(@PathVariable Integer id) {
      Optional <Aluno> retorno =  alunoRepositorio.findById(id);

        return retorno;
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
