package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.*;

public class Main {

    public static void main(String[] args) {

        PersonagemFactory humanoFactory = new HumanoFactory();
        PersonagemFactory elfoFactory = new ElfoFactory();
        PersonagemFactory orcFactory = new OrcFactory();


        Personagem guerreiroHumano = humanoFactory.criarGuerreiro("Arthur");
        Personagem magoElfo = elfoFactory.criarMago("Elandor");
        Personagem arqueiroOrc = orcFactory.criarArqueiro("Gromm");


        Personagem cloneDoMago = magoElfo.clone();


        System.out.println(guerreiroHumano);
        System.out.println(magoElfo);
        System.out.println(arqueiroOrc);
        System.out.println("Clone do mago: " + cloneDoMago);
    }
}
