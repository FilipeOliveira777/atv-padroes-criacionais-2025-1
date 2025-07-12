package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Armadura;

public class OrcArqueiroBuilder implements PersonagemBuilder {

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
        this.forca = 14;
        this.inteligencia = 8;
        this.agilidade = 12;
        this.vida = 120;
        this.mana = 40;
    }

    @Override
    public void definirEquipamentos() {
        this.arma = new Arma("Arco de Osso", 24, "Arco");
        this.armadura = new Armadura("Couro de Besta", 16, "Média");
    }

    @Override
    public void definirHabilidades() {
        this.habilidades = new String[]{"Tiro Brutal", "Intimidação"};
    }

    @Override
    public Personagem construir() {
        return new Personagem(nome, "Orc", "Arqueiro", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
