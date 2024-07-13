package edu.ruan.etapa1.estrutura_try_catch;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            System.out.println(formatarCep("12345678"));
        } catch (cepInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    static String formatarCep(String cep) throws cepInvalidoException {
        if (cep.length() != 8) {
            throw new cepInvalidoException("CEP deve conter 8 caracteres");
        }
        return cep.substring(0, 5) + "-" + cep.substring(5);
    }
}



