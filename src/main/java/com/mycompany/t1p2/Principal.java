
import com.mycompany.t1p2.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {
    
  private List<Persona> personas;

    public Principal() {
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public List<Persona> obtenerPersonas() {
        return personas;
    }

    public void imprimirNombresCompletos() {
        personas.stream()
                .map(Persona::toString)
                .forEach(System.out::println);
    }

    public List<Persona> buscarMayoresDeEdad() {
        return personas.stream()
                       .filter(persona -> persona.getEdad() >= 18)
                       .collect(Collectors.toList());
    }

    public Optional<Persona> buscarPersonaGuatemala() {
        return personas.stream()
                       .filter(persona -> persona.getEdad() >= 18)
                       .filter(persona -> "Guatemala".equalsIgnoreCase(persona.getCiudad()))
                       .findFirst();
    }

    public static void main(String[] args) {
        Principal principal = new Principal();

        principal.agregarPersona(new Persona(1, "Cristian", "Alejandro", "Cruz", "Leonel", "Masculino", "79090982301", 10, "Guatemala"));
        principal.agregarPersona(new Persona(2, "Marlon", "Lucrecio", "Ambrosio", "Pineda", "Masculino", "12312345601", 25, "Guatemala"));
        principal.agregarPersona(new Persona(3, "Rigoberta", "Leticia", "Gutierrez", "Altamira", "Femenino", "78709056346", 17, "Guatemala"));

        System.out.println("Nombres y apellidos del ciudadano:");
        principal.imprimirNombresCompletos();

        System.out.println("ATENCION!!! EXISTE UN DPI FALSO, Todos los civiles son mayores de edad excepto   Lu   y....:");
        List<Persona> mayoresDeEdad = principal.buscarMayoresDeEdad();
        mayoresDeEdad.forEach(System.out::println);


    }
}

