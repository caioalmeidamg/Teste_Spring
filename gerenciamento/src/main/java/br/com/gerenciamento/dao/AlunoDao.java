package br.com.gerenciamento.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.gerenciamento.model.Aluno;

//DAO = data object acess
//interface de acesso de dados, usada para guardar dados no banco
public interface AlunoDao extends JpaRepository<Aluno, Integer>{
    
}
