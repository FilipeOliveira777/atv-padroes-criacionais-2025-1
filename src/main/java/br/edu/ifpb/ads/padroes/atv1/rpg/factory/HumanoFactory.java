package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.*;

public class HumanoFactory implements PersonagemFactory {

    @Override
    public Personagem criarGuerreiro(String nome) {
        return new PersonagemDirector(new HumanoGuerreiroBuilder()).construirPersonagem(nome);
    }

    @Override
    public Personagem criarMago(String nome) {
        return new PersonagemDirector(new HumanoMagoBuilder()).construirPersonagem(nome);
    }

    @Override
    public Personagem criarArqueiro(String nome) {
        return new PersonagemDirector(new HumanoArqueiroBuilder()).construirPersonagem(nome);
    }
}
