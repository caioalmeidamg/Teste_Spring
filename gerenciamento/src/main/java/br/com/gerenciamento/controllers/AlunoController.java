package br.com.gerenciamento.controllers;

import org.hibernate.mapping.List;
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
import jakarta.websocket.server.PathParam;

 //o RestController é fundamental pra se fazer uma apirest 
 //Retorna necessariamente um json
@RestController
public class AlunoController {
    
    @Autowired
    private AlunoDao alunoRepositorio;
    
    //Quando o atributo é declarado como /{id} então é um PahtVariable

    @GetMapping("/inserirAluno/{id}")
    public Optional<Aluno> setAlunos(@PathVariable int id) {
      Optional <Aluno> retorno =  alunoRepositorio.findById(id);
      return retorno;
    }
    
    //Esse post mapping retorna uma view
    @PostMapping("/inserirAluno")
    public Aluno inserirAluno(Aluno aluno){        
        alunoRepositorio.save(aluno);  
        return aluno; 
    }
    
}
