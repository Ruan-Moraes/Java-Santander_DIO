package exs.primeiro_exercicio;

import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println(String.format("Voce esta elegivel para criar uma conta bancaria."));
        } else {
            System.out.println(String.format("Voce nao esta elegivel para criar uma conta bancaria."));
        }

        scanner.close();
    }
}
