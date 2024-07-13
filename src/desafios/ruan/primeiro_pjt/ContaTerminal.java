package desafios.ruan.primeiro_pjt;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numberAccount = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a agência da conta: ");
        String agencyAccount = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nameAccount = scanner.nextLine();

        System.out.print("Qual é o saldo da conta: ");
        String balanceAccount = scanner.nextLine();

        System.out.println("-------------------------------------------------------------");

        System.out.println(STR."O numero da conta é: \{numberAccount}");
        System.out.println(STR."A agência da conta é: \{agencyAccount}");
        System.out.println(STR."O nome da conta é: \{nameAccount}");
        System.out.println(STR."O saldo da conta é: \{balanceAccount}");
    }
}
