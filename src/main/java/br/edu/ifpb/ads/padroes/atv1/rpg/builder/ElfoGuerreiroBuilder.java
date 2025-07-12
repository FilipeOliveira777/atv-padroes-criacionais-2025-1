package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Armadura;


public class ElfoGuerreiroBuilder implements PersonagemBuilder {

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
        this.forca = 12;
        this.inteligencia = 14;
        this.agilidade = 16;
        this.vida = 100;
        this.mana = 60;
    }

    @Override
    public void definirEquipamentos() {
        this.arma = new Arma("Lâmina Élfica", 22, "Espada");
        this.armadura = new Armadura("Cota de Malha Élfica", 15, "Média");
    }

    @Override
    public void definirHabilidades() {
        this.habilidades = new String[]{"Dança das Lâminas", "Agilidade Élfica"};
    }

    @Override
    public Personagem construir() {
        return new Personagem(nome, "Elfo", "Guerreiro", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
