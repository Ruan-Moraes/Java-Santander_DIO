package edu.ruan.etapa2.poo.interface_aula.Equipamentos.multifuncional;

import edu.ruan.etapa2.poo.interface_aula.Equipamentos.copiadora.Copiadora;
import edu.ruan.etapa2.poo.interface_aula.Equipamentos.digitalizadora.Digitalizadora;
import edu.ruan.etapa2.poo.interface_aula.Equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via EquipamentoMultiFuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via EquipamentoMultiFuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via EquipamentoMultiFuncional");
    }
}
