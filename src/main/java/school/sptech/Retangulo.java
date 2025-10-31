package school.sptech;

public class Retangulo extends Figura{

    private Double base;
    private  Double altura;

    public Retangulo(){}

    @Override
    public Double calcularArea() {
        return base*altura;
    }

    @Override
    public Integer getEspessura() {
        return super.getEspessura();
    }

    @Override
    public String getCor() {
        return super.getCor();
    }

    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    @Override
    public void setEspessura(Integer espessura) {
        super.setEspessura(espessura);
    }

    @Override
    public void setCor(String cor) {
        super.setCor(cor);
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }
    public String toString(){
        return "esta figura tem a espessura de " + getEspessura() +" e a cor " + getCor();
    }
}
