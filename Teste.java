import java.util.ArrayList;
import java.util.List;

public class Teste {
    public ArrayList<Quadrilatero> listaDeQuadrilateros = new ArrayList<>(5);
    public ArrayList<Circulo> listaDeCirculos = new ArrayList<>();

    void criarRetangulo(float lado, float altura) {
       

        if(listaDeQuadrilateros.size() >= 5) {
            System.out.println("Limite da lista atigindo");
        } else if (lado <= 0 || altura <= 0) {
            throw new ArithmeticException
            ("O valor não podem ser igual ou menor que 0");  
        }else {
            Retangulo retangulo = new Retangulo();
            retangulo.setLado(lado);
            retangulo.setAltura(altura);
            listaDeQuadrilateros.add(retangulo);
        }
    }

    void criarQuadrado(float lado) {
        if(listaDeQuadrilateros.size() >= 5) {
            System.out.println("Limite da lista atigindo");
        } else if (lado <= 0) {
            throw new ArithmeticException
            ("O valor não podem ser igual ou menor que 0");  
        }else {
            Quadrado quadrado = new Quadrado();
            quadrado.setLado(lado);
            listaDeQuadrilateros.add(quadrado);
        }
    }

    void criarCirculo(float raio) {
        
            Circulo circulo = new Circulo();

            if (raio <= 0) {
                throw new ArithmeticException
                ("O valor não podem ser igual ou menor que 0");  
            } else {
                if(listaDeQuadrilateros.size() >= 5) {
                    System.out.println("Limite da lista de quadrilateros atigindo");
                } else {
                    circulo.setRaio(raio);
                    listaDeQuadrilateros.add(circulo);   
                }
                listaDeCirculos.add(circulo);  
            }
            
        
    }

    public static void main(String[] args) {
       Teste teste = new Teste();
       teste.criarRetangulo(7,3);
       teste.criarRetangulo(3,4);
    
       teste.criarQuadrado(5);
       teste.criarCirculo(10);
       
      
       teste.listaDeQuadrilateros.get(1).calcularPerimetro();
       teste.listaDeQuadrilateros.get(1).calcularArea();
       teste.listaDeQuadrilateros.get(2).calcularArea();
       teste.listaDeQuadrilateros.get(2).calcularPerimetro();
       
       teste.listaDeCirculos.get(0).calcularArea();
       teste.listaDeCirculos.get(0).calcularPerimetro();
    }
}
