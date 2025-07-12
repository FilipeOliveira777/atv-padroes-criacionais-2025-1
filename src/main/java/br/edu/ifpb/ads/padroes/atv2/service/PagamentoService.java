package br.edu.ifpb.ads.padroes.atv2.service;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import javax.inject.Inject;

public class PagamentoService {

    private final PagamentoGateway gateway;

    @Inject
    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public void pagar(double valor) {
        System.out.println("Iniciando pagamento...");
        gateway.pagar(valor);
        System.out.println("Pagamento concluído.");
    }
}
