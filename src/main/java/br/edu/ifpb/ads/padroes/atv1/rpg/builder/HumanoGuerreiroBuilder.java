package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Armadura;

public class HumanoGuerreiroBuilder implements PersonagemBuilder {

    private String nome;
    private int forca, inteligencia, agilidade, vida, mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    @Override
    public void definirNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void definirAtributos() {
        this.forca = 15;
        this.inteligencia = 8;
        this.agilidade = 10;
        this.vida = 120;
        this.mana = 30;
    }

    @Override
    public void definirEquipamentos() {
        this.arma = new Arma("Espada de Ferro", 25, "Espada");
        this.armadura = new Armadura("Armadura de Placas", 20, "Pesada");
    }

    @Override
    public void definirHabilidades() {
        this.habilidades = new String[]{"Investida", "Bloqueio"};
    }

    @Override
    public Personagem construir() {
        return new Personagem(nome, "Humano", "Guerreiro", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
