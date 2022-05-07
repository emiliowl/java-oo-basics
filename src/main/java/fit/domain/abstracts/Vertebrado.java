package fit.domain.abstracts;

public abstract class Vertebrado extends Animal {
    private String coluna;
    private String medula;


    public String getColuna() {
        return coluna;
    }
    public String getMedula() {
        return medula;
    }
    public void setMedula(String medula) {
        this.medula = medula;
    }
    public void setColuna(String coluna) {
        this.coluna = coluna;
    }
}
