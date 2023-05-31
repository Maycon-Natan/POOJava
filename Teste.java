import controller.Geometry;

public class Teste {
    public static void main(String[] args) {

       Geometry teste = new Geometry();

       teste.criarRetangulo(7,3);
       teste.criarRetangulo(3,4);
       teste.criarQuadrado(5);

       teste.criarCirculo(10);
       teste.criarCirculo(10);

       teste.listaDeQuadrilateros.get(1).calcularPerimetro();
       teste.listaDeQuadrilateros.get(1).calcularArea();
       teste.listaDeQuadrilateros.get(2).calcularArea();
       teste.listaDeQuadrilateros.get(2).calcularPerimetro();
       
       teste.listaDeCirculos.get(0).calcularArea();
       teste.listaDeCirculos.get(0).calcularPerimetro();
    }
}
