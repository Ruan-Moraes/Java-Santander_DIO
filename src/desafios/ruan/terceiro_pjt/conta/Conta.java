package desafios.ruan.terceiro_pjt.conta;

import desafios.ruan.terceiro_pjt.cliente.Cliente;

public abstract class Conta implements ContratoConta {
    private String titularConta;
    private double saldo;
    private String numeroConta;
    private String agencia;

    public Conta(Cliente cliente, double saldo, String numeroConta, String agencia) {
        this.titularConta = cliente.getNome();
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, ContratoConta contaDestino) {
        saldo -= valor;

        contaDestino.depositar(valor);
    }

    public abstract void imprimirExtrato();

    @Override
    public void imprimirInfo() {
        System.out.println("Titular: " + titularConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
    }
}
