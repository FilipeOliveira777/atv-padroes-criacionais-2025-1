package br.edu.ifpb.ads.padroes.atv2.gateway;


import br.edu.ifpb.ads.padroes.atv2.sdk.StripeSDK;

public class StripePagamentoGateway implements PagamentoGateway {

    private final StripeSDK sdk;

    public StripePagamentoGateway() {
        this.sdk = new StripeSDK();
    }

    @Override
    public void pagar(double valor) {
        sdk.executeCharge(valor);
    }
}
