package br.com.gerenciamento.enums;

public enum Status {
    ATIVO("Ativo"),
    INATIVO("Inativo"),
    TRANCADO("Trancado");

    private String status;

    Status(String status){
        this.status = status;
    }

    Status criacao(){
        return ATIVO;
    }
}
