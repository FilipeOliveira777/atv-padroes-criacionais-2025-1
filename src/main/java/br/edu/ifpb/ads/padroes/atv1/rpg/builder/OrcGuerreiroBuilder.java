package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Armadura;

public class OrcGuerreiroBuilder implements PersonagemBuilder {

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
        this.forca = 20;
        this.inteligencia = 6;
        this.agilidade = 8;
        this.vida = 150;
        this.mana = 20;
    }

    @Override
    public void definirEquipamentos() {
        this.arma = new Arma("Machado de Guerra", 30, "Machado");
        this.armadura = new Armadura("Armadura Brutal", 25, "Pesada");
    }

    @Override
    public void definirHabilidades() {
        this.habilidades = new String[]{"Fúria", "Pancada Devastadora"};
    }

    @Override
    public Personagem construir() {
        return new Personagem(nome, "Orc", "Guerreiro", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
