package fit.domain.concrete;

import fit.domain.abstracts.Invertebrado;
import fit.domain.behaviors.Movel;
import fit.domain.behaviors.Voar;

public class Artropode extends Invertebrado implements Voar {
    private Integer qtPatas;
    private Movel movimento;

    public Artropode(Movel movimento) {
        super();
        this.movimento = movimento;
    }
    
    public Integer getQtPatas() {
        return qtPatas;
    }

    public void setQtPatas(Integer qtPatas) {
        this.qtPatas = qtPatas;
    }

    @Override
    public void voar() {
        System.out.println("Voando como um inseto...");
    }

    @Override
    public void mover() {
        movimento.mover();
    }
}
