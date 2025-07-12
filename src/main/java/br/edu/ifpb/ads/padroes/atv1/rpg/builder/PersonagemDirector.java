package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;

public class PersonagemDirector {
    private final PersonagemBuilder builder;

    public PersonagemDirector(PersonagemBuilder builder) {
        this.builder = builder;
    }

    public Personagem construirPersonagem(String nome) {
        builder.definirNome(nome);
        builder.definirAtributos();
        builder.definirEquipamentos();
        builder.definirHabilidades();
        return builder.construir();
    }
}
