package br.com.gerenciamento.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Aluno{
    
    //Artibutos -------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "curso", nullable = false)
    private String curso;

    @Column(name = "matricula", nullable = false)
    private String matricula;

    @Column(name = "turno", nullable = false)
    private String turno;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToMany
    private Set<Materia> materia;


    public Set<Materia> getMaterias() {
        return materia;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materia = materias;
    }

    //Métodos ----------------------------------------
    public int getId(){
        return id;
    }

    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    
}