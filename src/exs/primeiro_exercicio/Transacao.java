package exs.primeiro_exercicio;

import java.util.Scanner;

public class Transacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;
        double saldoMaisLimiteChequeEspecial = saldo + limiteChequeEspecial;

        if (saldo > saque) {
            System.out.println(String.format("Transacao realizada com sucesso."));
        } else if (saldoMaisLimiteChequeEspecial > saque) {
            System.out.println(String.format("Transacao realizada com sucesso utilizando o cheque especial."));
        } else {
            System.out.println(String.format("Transacao nao realizada. Limite do cheque especial excedido."));
        }

        scanner.close();
    }
}
