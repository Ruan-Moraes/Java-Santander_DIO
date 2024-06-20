package desafios.ruan.terceiro_pjt.conta.tipos;

import desafios.ruan.terceiro_pjt.cliente.Cliente;
import desafios.ruan.terceiro_pjt.conta.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, double saldo, String numeroConta, String agencia) {
        super(cliente, saldo, numeroConta, agencia);
    }

    public void imprimirExtrato() {
        System.out.println("--- Conta Corrente ---");
        imprimirInfo();
    }
}
