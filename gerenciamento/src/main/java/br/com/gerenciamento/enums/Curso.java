package br.com.gerenciamento.enums;

public enum Curso {
    ADMINISTRACAO("Administração"),
    INFORMATICA("Informatica"),
    CONTABILIDADE("Contabilidade");

    private String curso;

    private Curso(String curso){
        this.curso = curso;
    }

}
