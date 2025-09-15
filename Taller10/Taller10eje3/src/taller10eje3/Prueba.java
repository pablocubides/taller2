package taller10eje3;

class Animal {
    public void moverse() {
        System.out.println("El Animal empezo a moverse");
    }
}

class Perro extends Animal {
    public void moverse(String lugar) {
        System.out.println("El Perro empezo a moverse hacia " + lugar);
    }
}

public class Prueba {
    public static void main(String[] args) {
        Animal v1 = new Animal();
        Animal v2 = new Perro();

        v1.moverse();
        v2.moverse(); 
        ((Perro)v2).moverse("el bosque");
    }
}