package br.com.celsoaquino.curso.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Integer status, String message, Long timeStamp) {
        super(status, message, timeStamp);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fielName, String message) {
        errors.add(new FieldMessage(fielName, message));
    }
}
