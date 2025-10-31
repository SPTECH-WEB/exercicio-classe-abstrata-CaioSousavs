package school.sptech;

public class Triangulo extends Figura{
    private Double base, altura;

    public Triangulo(){}

    @Override
    public Double calcularArea() {
        return base*altura/2;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }
    public String toString(){
        return "esta figura tem a espessura de " + getEspessura() +" e a cor " + getCor();
    }
}
