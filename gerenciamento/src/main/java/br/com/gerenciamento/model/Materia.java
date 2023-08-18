package br.com.gerenciamento.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Materia {
     //Artibutos -------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 

    @Column(name = "nome", nullable = false)
    private String nome;

    @OneToMany(mappedBy = "materia")
    private List<Aluno> alunos;

    public Materia(int id, String nome, List<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
