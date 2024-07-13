package edu.ruan.etapa2.poo.interface_aula.estabelecimento;

import edu.ruan.etapa2.poo.interface_aula.Equipamentos.copiadora.Copiadora;
import edu.ruan.etapa2.poo.interface_aula.Equipamentos.digitalizadora.Digitalizadora;
import edu.ruan.etapa2.poo.interface_aula.Equipamentos.impressora.Deskjet;
import edu.ruan.etapa2.poo.interface_aula.Equipamentos.impressora.Impressora;
import edu.ruan.etapa2.poo.interface_aula.Equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional multiFuncional = new EquipamentoMultiFuncional();

        Deskjet deskjet = new Deskjet();
        deskjet.imprimir();

        Impressora impressora = multiFuncional;
        Digitalizadora digitalizadora = multiFuncional;
        Copiadora copiadora = multiFuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
