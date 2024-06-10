package edu.ruan.etapa2.javabeans_e_construtores.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(20);

        System.out.println("O nome do aluno é " + felipe.getNome() + " e ele tem " + felipe.getIdade() + " anos.");
    }
}
