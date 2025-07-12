package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PayPalSDK;

public class PayPalPagamentoGateway implements PagamentoGateway {

    private final PayPalSDK sdk;

    public PayPalPagamentoGateway() {
        this.sdk = new PayPalSDK();
    }

    @Override
    public void pagar(double valor) {
        sdk.sendPayment(valor);
    }
}
