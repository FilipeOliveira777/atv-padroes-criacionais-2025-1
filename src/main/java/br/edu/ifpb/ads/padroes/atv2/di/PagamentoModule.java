package br.edu.ifpb.ads.padroes.atv2.di;

import br.edu.ifpb.ads.padroes.atv2.gateway.*;
import com.google.inject.AbstractModule;

public class PagamentoModule extends AbstractModule {

    private final String tipoGateway;

    public PagamentoModule(String tipoGateway) {
        this.tipoGateway = tipoGateway.toLowerCase();
    }

    @Override
    protected void configure() {
        switch (tipoGateway) {
            case "paypal":
                bind(PagamentoGateway.class).to(PayPalPagamentoGateway.class);
                break;
            case "stripe":
                bind(PagamentoGateway.class).to(StripePagamentoGateway.class);
                break;
            case "pagseguro":
                bind(PagamentoGateway.class).to(PagSeguroPagamentoGateway.class);
                break;
            default:
                addError("Gateway de pagamento desconhecido: " + tipoGateway);
        }
    }
}
