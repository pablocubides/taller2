class Persona {
    public void Presentarse() {
        System.out.println("Hola soy una Persona");
    }
}

class Estudiante extends Persona {
    @Override
    public void Presentarse() {
        System.out.println("Hola soy un Estudiante");
    }
}

class Profesor extends Persona {
    @Override
    public void Presentarse() {
        System.out.println("Hola soy un Profesor");
    }
}


public class Prueba {
    public static void main(String[] args) {
        Persona Pr1 = new Persona();
        Persona Pr2 = new Estudiante();
        Persona Pr3 = new Profesor();

        Pr1.Presentarse();
        Pr2.Presentarse();
        Pr3.Presentarse();
    }
}