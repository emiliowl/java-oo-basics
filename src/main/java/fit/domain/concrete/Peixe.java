package fit.domain.concrete;

import fit.domain.abstracts.Vertebrado;

public class Peixe extends Vertebrado {
    private Integer qtBarbatanas;

    public Integer getQtBarbatanas() {
        return qtBarbatanas;
    }

    public void setQtBarbatanas(Integer qtBarbatanas) {
        this.qtBarbatanas = qtBarbatanas;
    }

    @Override
    public void mover() {
        System.out.println("Nadando...");
    }
}
