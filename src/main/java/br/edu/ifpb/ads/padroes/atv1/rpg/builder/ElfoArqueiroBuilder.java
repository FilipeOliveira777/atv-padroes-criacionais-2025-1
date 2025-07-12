package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Armadura;

public class ElfoArqueiroBuilder implements PersonagemBuilder {

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
        this.forca = 8;
        this.inteligencia = 16;
        this.agilidade = 20;
        this.vida = 90;
        this.mana = 100;
    }

    @Override
    public void definirEquipamentos() {
        this.arma = new Arma("Arco Longo Élfico", 28, "Arco");
        this.armadura = new Armadura("Armadura de Couro Élfico", 14, "Média");
    }

    @Override
    public void definirHabilidades() {
        this.habilidades = new String[]{"Tiro Múltiplo", "Camuflagem"};
    }

    @Override
    public Personagem construir() {
        return new Personagem(nome, "Elfo", "Arqueiro", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
