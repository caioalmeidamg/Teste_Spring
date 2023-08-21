package br.com.gerenciamento.controllers;

import br.com.gerenciamento.model.Aluno;
import br.com.gerenciamento.model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciamento.dao.MateriaDao;

import java.util.Optional;

@RestController
public class MateriaController {
    
    @Autowired
    private MateriaDao MateriaRepositorio;

    @GetMapping("/Materia")
    public Optional<Materia> materia(@RequestParam(value = "id") int id){
        Optional<Materia> retorno =  MateriaRepositorio.findById(id);
        return retorno;
    }

}
 