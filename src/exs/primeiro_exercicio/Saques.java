package exs.primeiro_exercicio;

import java.util.Scanner;

public class Saques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saqueValor = scanner.nextDouble();

        for (int i = 0; limiteDiario != 0; i++) {

            if (saqueValor < limiteDiario) {
                if (saqueValor == 0) {
                    System.out.println("Transacoes encerradas.");

                    break;
                } else {
                    limiteDiario -= saqueValor;

                    System.out.println(String.format("Saque realizado. Limite restante: " + limiteDiario));
                    System.out.println("Transacoes encerradas.");

                    break;
                }


            } else {
                System.out.println(String.format("Limite diario de saque atingido. Transacoes encerradas."));

                break;
            }
        }

        scanner.close();
    }
}
