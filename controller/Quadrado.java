package controller;

public class Quadrado extends Quadrilatero {
    public float lado;

    public void setLado(float lado){
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    @Override
    public float calcularArea() {
        float vArea = lado * lado;
        System.out.println(vArea);
        return vArea;
    }

    @Override
    public float calcularPerimetro() {
        float vPerimetro = lado * 4;
        System.out.println(vPerimetro);
        return vPerimetro;
    }

    @Override
    public String toString() {
        return "Lado: " + lado;
    }

}
