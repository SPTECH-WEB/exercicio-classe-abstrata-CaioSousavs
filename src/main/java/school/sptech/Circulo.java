package school.sptech;

public class Circulo extends  Figura{

    private Double raio;

    public Circulo(){}
    @Override
    public Double calcularArea() {
        Double area;
        area = Math.PI * Math.pow(getRaio(), 2);
        return area;
    }

    @Override
    public void setCor(String cor) {
        super.setCor(cor);
    }

    @Override
    public void setEspessura(Integer espessura) {
        super.setEspessura(espessura);
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Integer getEspessura() {
        return super.getEspessura();
    }

    @Override
    public String getCor() {
        return super.getCor();
    }

    public Double getRaio() {
        return raio;
    }
    public String toString(){
        return "esta figura tem a espessura de " + getEspessura() +" e a cor " + getCor();
    }
}
