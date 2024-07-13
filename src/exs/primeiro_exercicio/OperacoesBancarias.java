package exs.primeiro_exercicio;

import java.util.Scanner;

public class OperacoesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean continuar = true;

        double saldo = 0;

        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    saldo = scanner.nextInt();

                    System.out.println(String.format("Saldo atual: " + saldo));

                    break;
                }

                case 2: {
                    double saquePretendido = scanner.nextInt();

                    if (saldo < saquePretendido) {
                        System.out.println(String.format("Saldo insuficiente."));
                    } else {
                        saldo = saldo - saquePretendido;

                        System.out.println(String.format("Saldo atual: " + saldo));
                    }

                    break;
                }

                case 3: {
                    System.out.println(String.format("Saldo atual: " + saldo));

                    break;
                }

                case 0: {
                    System.out.println(String.format("Programa encerrado."));

                    continuar = false;

                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");

                    continuar = false;
                }
            }
        }
    }
}
