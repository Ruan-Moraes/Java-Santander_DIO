package desafios.ruan.terceiro_pjt.banco;

import desafios.ruan.terceiro_pjt.cliente.Cliente;
import desafios.ruan.terceiro_pjt.conta.Conta;
import desafios.ruan.terceiro_pjt.conta.tipos.ContaCorrente;
import desafios.ruan.terceiro_pjt.conta.tipos.ContaPoupanca;

import java.util.List;

public class Banco {
    public static void main(String[] args) {
        Cliente ruan = new Cliente("Ruan");
        ContaPoupanca conta = new ContaPoupanca(ruan, 1000.0, "1234", "0001");

        Cliente maria = new Cliente("Maria");
        ContaPoupanca conta2 = new ContaPoupanca(maria, 2000.0, "5678", "0002");

        conta.imprimirExtrato();
        conta2.imprimirExtrato();

        conta.depositar(100.0);
        conta2.depositar(200.0);

        conta.imprimirExtrato();
        conta2.imprimirExtrato();

        conta.transferir(250.0, conta2);

        conta.imprimirExtrato();
        conta2.imprimirExtrato();

        Cliente joao = new Cliente("João");
        ContaCorrente conta3 = new ContaCorrente(joao, 3000.0, "91011", "0003");

        conta3.imprimirExtrato();

        conta3.transferir(300.0, conta);

        conta3.imprimirExtrato();


        List<Conta> contas = List.of(conta, conta2, conta3);

        System.out.println("Imprimindo extratos de todas as contas:");
        
        for (Conta c : contas) {
            c.imprimirExtrato();
        }
    }
}
