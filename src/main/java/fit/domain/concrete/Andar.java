package fit.domain.concrete;

import fit.domain.behaviors.Movel;

public class Andar implements Movel {

    @Override
    public void mover() {
        System.out.println("Andando...");
    }
    
}
