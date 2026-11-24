package com.example.agendadortarefas.Infrastructure.exceptions;

public class ResourceNotFoundExcpetion extends RuntimeException {

    public ResourceNotFoundExcpetion(String mensagem){
        super(mensagem);
    }
    public ResourceNotFoundExcpetion(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
