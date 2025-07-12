package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Armadura;

public class HumanoMagoBuilder implements PersonagemBuilder {

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
        this.forca = 6;
        this.inteligencia = 18;
        this.agilidade = 8;
        this.vida = 80;
        this.mana = 150;
    }

    @Override
    public void definirEquipamentos() {
        this.arma = new Arma("Cajado Mágico", 15, "Cajado");
        this.armadura = new Armadura("Vestes Mágicas", 8, "Leve");
    }

    @Override
    public void definirHabilidades() {
        this.habilidades = new String[]{"Bola de Fogo", "Cura"};
    }

    @Override
    public Personagem construir() {
        return new Personagem(nome, "Humano", "Mago", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
