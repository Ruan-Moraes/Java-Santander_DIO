package edu.ruan.etapa2.poo.polimorfismo;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void verificarConexao() {
        System.out.println("Verificando conexão");
    }

    protected void salvarHistorico() {
        System.out.println("Salvando histórico");
    }
}
