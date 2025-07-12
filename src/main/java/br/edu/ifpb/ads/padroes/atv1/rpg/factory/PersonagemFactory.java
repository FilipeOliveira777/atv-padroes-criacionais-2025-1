package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;

public interface PersonagemFactory {
    Personagem criarGuerreiro(String nome);
    Personagem criarMago(String nome);
    Personagem criarArqueiro(String nome);
}
