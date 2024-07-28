package tarea2;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal{
	private List<Persona> listaPersonas;

    public Principal() {
        listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(int id, String pnombre, String snombre, String papellido, String sapellido, String genero, String DPI,
    		int edad, String ciudad) {
        Persona persona = new Persona(id, "pnombre", "snombre", "papellido", "sapellido", "genero", "DPI", edad, "ciudad");
        listaPersonas.add(persona);
    }

    public List<Persona> obtenerListaPersonas() {
        return listaPersonas;
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        
        principal.agregarPersona(1, "Alyson", "Gabriela", "Villagran", "Cifuentes", "Femenino", "453322660917", 21, "Quetzaltenango");
        principal.agregarPersona(2, "Alma", "Delia", "Cifuentes", "Pineda", "Femenino", "234458901011", 48, "Guatemala");
        principal.agregarPersona(3, "William", "Rene", "Villagran", "Merida", "Masculino", "3456789010917", 44, "Quetzaltenango");
        principal.agregarPersona(4, "Marvin", "Eduardo", "Jimenez", "Granados", "Masculino", "456789010112", 34, "Guatemala");
        principal.agregarPersona(5, "Kevyn", "Isaac","Villagran", "Cifuentes",  "Masculino", "453896200101", 22, "Guatemala");

        // Imprimir nombre completo de cada persona
        principal.obtenerListaPersonas().stream()
            .map(Persona::getNombreCompleto)
            .forEach(System.out::println);
        
     // Buscar personas mayores de edad
        List<Persona> mayoresDeEdad = principal.obtenerListaPersonas().stream()
            .filter(persona -> persona.getEdad() >= 18)
            .collect(Collectors.toList());

        System.out.println("\nPersonas mayores de edad:");
        mayoresDeEdad.forEach(persona -> System.out.println(persona.getNombreCompleto()));

        // Buscar la primera persona que cumpla con las condiciones
        Optional<Persona> personaCondiciones = principal.obtenerListaPersonas().stream()
            .filter(persona -> persona.getEdad() >= 18)
            .filter(persona -> "Guatemala".equalsIgnoreCase(persona.getCiudad()))
            .filter(persona -> persona.getPnombre().contains("Lu"))
            .findFirst();

        personaCondiciones.ifPresent(persona -> 
            System.out.println("\nPrimera persona que cumple las condiciones: " + persona.getNombreCompleto())
        );
    
}

}