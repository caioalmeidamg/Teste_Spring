package br.com.gerenciamento.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.gerenciamento.model.Materia;

//DAO = data object acess
//interface de acesso de dados, usada para guardar dados no banco
public interface MateriaDao extends JpaRepository<Materia, Integer>{
    
}
