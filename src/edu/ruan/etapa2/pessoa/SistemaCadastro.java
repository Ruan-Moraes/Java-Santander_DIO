package edu.ruan.etapa2.pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "123.456.789-00");
        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
