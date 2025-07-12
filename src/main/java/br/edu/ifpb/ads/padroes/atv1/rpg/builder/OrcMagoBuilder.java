package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamentos.Armadura;

public class OrcMagoBuilder implements PersonagemBuilder {

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
        this.inteligencia = 14;
        this.agilidade = 6;
        this.vida = 100;
        this.mana = 120;
    }

    @Override
    public void definirEquipamentos() {
        this.arma = new Arma("Cajado Tribal", 12, "Cajado");
        this.armadura = new Armadura("Vestes Xamânicas", 6, "Leve");
    }

    @Override
    public void definirHabilidades() {
        this.habilidades = new String[]{"Magia Sombria", "Invocação"};
    }

    @Override
    public Personagem construir() {
        return new Personagem(nome, "Orc", "Mago", forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
