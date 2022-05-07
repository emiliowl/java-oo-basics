package fit.domain.abstracts;

import fit.domain.behaviors.Movel;

public abstract class Animal implements Movel {
    private String cobertura;
    
    public void comer() {
        System.out.println("Transformar matéria em energia...");
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
}
