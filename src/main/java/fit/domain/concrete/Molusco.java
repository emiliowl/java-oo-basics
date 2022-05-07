package fit.domain.concrete;

import fit.domain.abstracts.Casca;
import fit.domain.abstracts.Invertebrado;

public class Molusco extends Invertebrado {
    private Casca casca;

    @Override
    public String toString() {
        return String.format("Protegido com %s", this.getCasca());
    }

    @Override
    public void mover() {
        System.out.println("Rastejando...");
    }

    public Casca getCasca() {
        return casca;
    }

    public void setCasca(Casca casca) {
        this.casca = casca;
    }
}
