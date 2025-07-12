package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PagSeguroSDK;

public class PagSeguroPagamentoGateway implements PagamentoGateway {

    private final PagSeguroSDK sdk;

    public PagSeguroPagamentoGateway() {
        this.sdk = new PagSeguroSDK();
    }

    @Override
    public void pagar(double valor) {
        sdk.efetuarPagamento(valor);
    }
}
