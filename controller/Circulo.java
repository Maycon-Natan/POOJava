package controller;

public class Circulo extends Quadrilatero {
    public float raio;

    public void setRaio(float raio){
        this.raio = raio;
    }
    public float getRaio() {
        return raio;
    }

    @Override
    public float calcularArea(){
        float vArea =  3.14f * raio * raio;
        System.out.println(vArea);
        return vArea;
    }

    @Override
    public float calcularPerimetro(){
        float vPerimetro = 2 * 3.14f * raio;
        System.out.println(vPerimetro);
        return vPerimetro;
    }

    @Override
    public String toString() {
        return "Raio: " + raio;
    }

}
