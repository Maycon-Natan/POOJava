import controller.Geometry;

public class Teste {
    public static void main(String[] args) {

        try{
            Geometry.start();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
