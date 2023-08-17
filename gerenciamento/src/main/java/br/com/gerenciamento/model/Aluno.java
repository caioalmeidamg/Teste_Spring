package br.com.gerenciamento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno{
    
    //Artibutos -------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 

    @Column(name = "nome")
    private String nome;

    @Column(name = "curso")
    private String curso;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "turno"  )
    private String turno;

    @Column(name = "status")
    private String status;

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

    public void seztMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getTurno(){
        return turno;
    }

    public void SetTurno(String turno){
        this.turno = turno;
    } 

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    
}