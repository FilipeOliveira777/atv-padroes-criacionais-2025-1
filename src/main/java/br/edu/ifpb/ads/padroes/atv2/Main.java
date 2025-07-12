package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.di.PagamentoModule;
import br.edu.ifpb.ads.padroes.atv2.service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        // Pagamento via PayPal
        System.out.println("=== Pagamento com PayPal ===");
        Injector injectorPayPal = Guice.createInjector(new PagamentoModule("paypal"));
        PagamentoService pagamentoPayPal = injectorPayPal.getInstance(PagamentoService.class);
        pagamentoPayPal.pagar(150.00);

        // Pagamento via Stripe
        System.out.println("=== Pagamento com Stripe ===");
        Injector injectorStripe = Guice.createInjector(new PagamentoModule("stripe"));
        PagamentoService pagamentoStripe = injectorStripe.getInstance(PagamentoService.class);
        pagamentoStripe.pagar(200.00);

        // Pagamento via PagSeguro
        System.out.println("=== Pagamento com PagSeguro ===");
        Injector injectorPagSeguro = Guice.createInjector(new PagamentoModule("pagseguro"));
        PagamentoService pagamentoPagSeguro = injectorPagSeguro.getInstance(PagamentoService.class);
        pagamentoPagSeguro.pagar(100.00);
    }
}
