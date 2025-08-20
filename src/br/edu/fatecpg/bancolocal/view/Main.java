package br.edu.fatecpg.bancolocal.view;

import br.edu.fatecpg.bancolocal.controller.ConsultaController;
import br.edu.fatecpg.bancolocal.model.Banco;

public class Main {

    public static void main(String[] args) {

        ConsultaController cc = new ConsultaController();

        //String retorno = cc.inserirConsulta("Teste da Costa", "20/08/2025", "18:00");

        String retorno = cc.selecionarConsultas();
        System.out.println(retorno);
    }
}
