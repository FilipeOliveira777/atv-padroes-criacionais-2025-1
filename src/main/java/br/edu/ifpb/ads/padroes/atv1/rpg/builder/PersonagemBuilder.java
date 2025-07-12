package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;

/**
 * Interface do padrão Builder para construir objetos do tipo Personagem.
 */
public interface PersonagemBuilder {
    void definirNome(String nome);
    void definirAtributos();
    void definirEquipamentos();
    void definirHabilidades();
    Personagem construir();
}
