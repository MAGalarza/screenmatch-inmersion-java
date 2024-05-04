import java.util.Scanner;

public class Main {
    private static String[] args;

    public static void main(String[] args) {
        Main.args = args;
        System.out.println("¡Bienvenidos a la inmersión en Java!");

        //  Hago un comentario System.out.println("Película Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";

        // Uso las triple comillas para un block de notas

        String sinopsis = """
                La mejor pelicula de fin del milenio
                yo nunca la vi
                espero que te guste
                """;

        double mediaEvaluacionUsuario = 0;

        System.out.println("Película = " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluaciones = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la Evaluación de " + nombre + " es " + mediaEvaluaciones);

        // Estructuras de decisión - Condicional

        if ( fechaDeLanzamiento > 2023 ) System.out.println("Es una pelicula popular del momento");
        else System.out.println("Es una película retro que vale la pena ver");
        }
    }
    

