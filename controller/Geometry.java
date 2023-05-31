package controller;

import java.util.ArrayList;

public class Geometry {

    public ArrayList<Quadrilatero> listaDeQuadrilateros = new ArrayList<>(5);
    public ArrayList<Circulo> listaDeCirculos = new ArrayList<>();

    public void criarRetangulo(float lado, float altura) {

        if(listaDeQuadrilateros.size() >= 5) {
            throw new IndexOutOfBoundsException("Limite atigindo");
        } else if (lado <= 0 || altura <= 0) {
            throw new ArithmeticException("O valor não podem ser igual ou menor que 0");
        }else {
            Retangulo retangulo = new Retangulo();
            retangulo.setLado(lado);
            retangulo.setAltura(altura);
            listaDeQuadrilateros.add(retangulo);
        }
    }

    public void criarQuadrado(float lado) {

        if(listaDeQuadrilateros.size() >= 5) {
            throw new IndexOutOfBoundsException("Limite atigindo");
        } else if (lado <= 0) {
            throw new ArithmeticException("O valor não podem ser igual ou menor que 0");
        }else {
            Quadrado quadrado = new Quadrado();
            quadrado.setLado(lado);
            listaDeQuadrilateros.add(quadrado);
        }
    }

    public void criarCirculo(float raio) {

        Circulo circulo = new Circulo();

        if (raio <= 0) {
            throw new ArithmeticException("O valor não podem ser igual ou menor que 0");
        } else {
            if(listaDeQuadrilateros.size() >= 5) {
                throw new IndexOutOfBoundsException("Limite atigindo");
            } else {
                circulo.setRaio(raio);
                listaDeQuadrilateros.add(circulo);
            }
            listaDeCirculos.add(circulo);
        }
    }

}
