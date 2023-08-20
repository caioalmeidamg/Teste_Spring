package br.com.gerenciamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciamento.dao.MateriaDao;

@RestController
public class MateriaController {
    
    @Autowired
    private MateriaDao MateriaRepositorio;

    
}
 