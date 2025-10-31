package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura){
        this.cor = cor;
        this.espessura = espessura;
    }

    protected Figura() {
    }


    public abstract Double calcularArea();

    public Integer getEspessura() {
        return espessura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }


    @Override
    public String toString(){
        return "esta figura tem a espessura de " + getEspessura() +" e a cor " + getCor();
    }
}

