package fit.domain.concrete;

import fit.domain.behaviors.Movel;

public class Rastejar implements Movel {

    @Override
    public void mover() {
        System.out.println("Rastejar...");
    }
    
}
