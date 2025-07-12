package br.edu.ifpb.ads.padroes.atv2.sdk;
public class StripeSDK {
    public void executeCharge(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado via Stripe.");
    }
}