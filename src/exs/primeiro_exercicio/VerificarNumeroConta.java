package exs.primeiro_exercicio;

import java.util.Scanner;

public class VerificarNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeroConta = scanner.nextLine();

        try {
            verificarNumeroConta(numeroConta);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8) {
            System.out.println("Numero de conta valido.");
        } else {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
