package desafios.ruan.terceiro_pjt.cliente;

import desafios.ruan.terceiro_pjt.conta.Conta;

public class Cliente {
    private String nome;
    private Conta[] contasRelacionadas;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Conta[] getContasRelacionadas() {
        return contasRelacionadas;
    }
}
