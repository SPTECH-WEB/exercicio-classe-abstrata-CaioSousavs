package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma = 0.0;
        for(Figura f: figuras){
            soma += f.calcularArea();
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> maiorQue20 = new ArrayList<>();

        for(Figura f : figuras){
            if(f.calcularArea() > 20){
                maiorQue20.add(f);
            }
        }
        return maiorQue20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();

        for(Figura f: figuras){
            if(f instanceof Quadrado){
                quadrados.add(f);
            }
        }
        return quadrados;
    }

}
