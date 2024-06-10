package edu.ruan.etapa2.visibilidade.lachonete;

import edu.ruan.etapa2.visibilidade.lachonete.area.cliente.Cliente;
import edu.ruan.etapa2.visibilidade.lachonete.atendimento.Atendente;
import edu.ruan.etapa2.visibilidade.lachonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
