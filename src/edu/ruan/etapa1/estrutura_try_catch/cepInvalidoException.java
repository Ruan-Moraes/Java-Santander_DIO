package edu.ruan.etapa1.estrutura_try_catch;

public class cepInvalidoException extends Throwable {
    public cepInvalidoException(String message) {
        // TODO Auto-generated constructor stub
    }

    public String getMessage() {
        return "CEP inválido";
    }
}
