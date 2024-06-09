package edu.ruan.etapa1.estrutura_try_catch;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExercecao {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(valor);
    }
}
