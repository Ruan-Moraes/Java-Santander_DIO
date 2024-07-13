package desafios.ruan.terceiro_pjt.conta;

public interface ContratoConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, ContratoConta contaDestino);

    void imprimirExtrato();

    void imprimirInfo();
}
