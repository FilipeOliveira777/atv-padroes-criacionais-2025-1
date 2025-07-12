package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Armadura;

public class ElfoMagoBuilder implements PersonagemBuilder {

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
        this.forca = 4;
        this.inteligencia = 20;
        this.agilidade = 14;
        this.vida = 70;
        this.mana = 180;
    }

    @Override
    public void definirEquipamentos() {
        this.arma = new Arma("Cajado da Natureza", 18, "Cajado");
        this.armadura = new Armadura("Mantos Élficos", 10, "Leve");
    }

    @Override
    public void definirHabilidades() {
        this.habilidades = new String[]{"Magia da Natureza", "Teleporte"};
    }

    @Override
    public Personagem construir() {
        return new Personagem(nome, "Elfo", "Mago", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
