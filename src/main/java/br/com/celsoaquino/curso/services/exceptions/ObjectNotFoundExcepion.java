package br.com.celsoaquino.curso.services.exceptions;

public class ObjectNotFoundExcepion extends RuntimeException{

    public ObjectNotFoundExcepion(String message){
        super(message);
    }

    public ObjectNotFoundExcepion(String message, Throwable cause){
        super(message, cause);
    }
}
