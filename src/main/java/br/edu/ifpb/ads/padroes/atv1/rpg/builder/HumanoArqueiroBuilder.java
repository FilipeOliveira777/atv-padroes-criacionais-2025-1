package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Armadura;

public class HumanoArqueiroBuilder implements PersonagemBuilder {

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
        this.forca = 10;
        this.inteligencia = 12;
        this.agilidade = 16;
        this.vida = 100;
        this.mana = 70;
    }

    @Override
    public void definirEquipamentos() {
        this.arma = new Arma("Arco Élfico", 20, "Arco");
        this.armadura = new Armadura("Armadura de Couro", 12, "Média");
    }

    @Override
    public void definirHabilidades() {
        this.habilidades = new String[]{"Tiro Certeiro", "Chuva de Flechas"};
    }

    @Override
    public Personagem construir() {
        return new Personagem(nome, "Humano", "Arqueiro", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
