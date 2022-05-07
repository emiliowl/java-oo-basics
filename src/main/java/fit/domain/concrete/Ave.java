package fit.domain.concrete;

import fit.domain.abstracts.Vertebrado;
import fit.domain.behaviors.Movel;
import fit.domain.behaviors.Voar;

public class Ave extends Vertebrado implements Voar {
    private Integer qtPatas;
    private Movel movimento;

    public Ave(Movel movimento) {
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
        System.out.println("Voando como um pássaro...");
    }

    @Override
    public void mover() {
        movimento.mover();        
    }
}
