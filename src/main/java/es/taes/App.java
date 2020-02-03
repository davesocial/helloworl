package es.taes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String miMensaje = "Mi hola mundo";
        System.out.println( miMensaje );

        Personas personas = new Personas();
        personas.setEdad(39);
        personas.setNombre("David");
        System.out.println(personas);

    }
}
