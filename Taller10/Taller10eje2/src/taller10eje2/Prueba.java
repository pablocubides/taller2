
package taller10eje2;


    class Vehiculo{

    public void Moverse(){
        System.out.println("El Vehiculo empezo a Moverse ");
    }
    }
    class Bicicleta extends Vehiculo{
     @Override
    public void Moverse(){
        System.out.println("La bicicleta empezo a Moverse ");
    }
    }
    

     
    public class Prueba {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Bicicleta();

        v1.Moverse();
        v2.Moverse(); 
    }
}
