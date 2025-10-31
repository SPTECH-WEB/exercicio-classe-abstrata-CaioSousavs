package school.sptech;

public class Quadrado  extends Figura{
    private Double lado;

    public Quadrado(){}

    @Override
    public Double calcularArea() {
        Double area;
        area = Math.pow(lado, 2);
        return area;
    }

    @Override
    public Integer getEspessura() {
        return super.getEspessura();
    }

    @Override
    public String getCor() {
        return super.getCor();
    }

    public Double getLado() {
        return lado;
    }

    @Override
    public void setEspessura(Integer espessura) {
        super.setEspessura(espessura);
    }

    @Override
    public void setCor(String cor) {
        super.setCor(cor);
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public String toString(){
        return "esta figura tem a espessura de " + getEspessura() +" e a cor " + getCor();
    }

}
