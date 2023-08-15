package br.com.gerenciamento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import br.com.gerenciamento.enums.*;

@Entity
public class Aluno{
    
    //Artibutos -------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 

    @Column(name = "nome")
    private String nome;

    @Column(name = "curso")
    private Curso curso;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "turno"  )
    private String turno;

    @Column(name = "status")
    private Status status;

    //Métodos ----------------------------------------
    public int getId(){
        return id;
    }

    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso){
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

    public void seztMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getTurno(){
        return turno;
    }

    public void SetTurno(String turno){
        this.turno = turno;
    } 

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
    
}