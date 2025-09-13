package taller10eje3;

    class Animal {

    public void Moverse(){
        System.out.println("El Animal empezo a Moverse ");
     }
    }
    class Perro extends Animal{
    
    public void Moverse(){
        System.out.println("El Perro empezo a Moverse ");
     }
    }
     

    public class Prueba {
    public static void main(String[] args) {
        Animal v1 = new Animal();
        Animal v2 = new Perro();

        v1.Moverse();
        v2.Moverse(); 
    }
}
