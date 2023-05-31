package controller;

public class Retangulo extends Quadrilatero {
    private float lado;
    private float altura;
    
    public void setLado(float lado){
        this.lado = lado;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }
    public float getAltura() {
        return altura;
    }

    @Override
    public float calcularArea() {
        float vArea = lado * altura;
        System.out.println(vArea);
        return vArea;
    }

    @Override
    public float calcularPerimetro() {
        float vPerimetro = lado * 2 + altura * 2;
        System.out.println(vPerimetro);
        return vPerimetro;
    }

    @Override
    public String toString() {
        return "Lado: " + lado + " Altura: " + altura;
    }

}
