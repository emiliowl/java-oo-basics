package fit;

import java.util.ArrayList;
import java.util.List;

import fit.domain.abstracts.Animal;
import fit.domain.behaviors.Voar;
import fit.domain.concrete.Andar;
import fit.domain.concrete.Artropode;
import fit.domain.concrete.Ave;
import fit.domain.concrete.Concha;
import fit.domain.concrete.Molusco;
import fit.domain.concrete.Rastejar;
import fit.domain.concrete.TampaDeGarrafa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Animal borboleta = new Artropode(new Rastejar());
        Animal canario = new Ave(new Andar());
        Molusco molusco = new Molusco();

        borboleta.comer();
        canario.comer();

        borboleta.mover();
        canario.mover();

        var voadores = new ArrayList<Voar>() {
            {
                add(new Artropode(new Rastejar()));
                add(new Ave(new Andar()));
            }
        };

        for (Voar animal : voadores) {
            animal.voar();
        }

        molusco.setCasca(new Concha());
        System.out.println(molusco);
        molusco.setCasca(new TampaDeGarrafa());
        System.out.println(molusco);
    }
}
