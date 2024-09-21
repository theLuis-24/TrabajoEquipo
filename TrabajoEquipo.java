import java.util.Scanner;

/*Trabajo presentado por:
 * Luis José Lemus//192239
 * Sergio Andres Diaz// 192357
 * Androw perez//192370
 */

public class TrabajoEquipo {
    public static void main(String[] args) {
        final double NOTA_APROBATORIA = 3.0;
        int estudiantesAprobados = 0;
        int estudiantesReprobados = 0;
        Scanner scanner = new Scanner(System.in);
        
        final int NUM_ESTUDIANTES = 3; 
        final int CANTIDAD_NOTAS = 3; // Usar int para cantidades enteras
        String[] nombreEstudiantes = new String[NUM_ESTUDIANTES];
        int[] IdEstudiantes = new int[NUM_ESTUDIANTES];
        double[][] NotaEstudiantes = new double[NUM_ESTUDIANTES][CANTIDAD_NOTAS];

        /*Nombre del estudiante */
        
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            nombreEstudiantes[i] = scanner.nextLine();

            /*ID del estudiante */

            boolean idValida = false;
            while (!idValida) {
                System.out.println("Ingrese el Codigo del estudiante " + (i + 1) + " (máximo 6 dígitos):");
                
                if (scanner.hasNextInt()) {
                    int id = scanner.nextInt();
                    if (String.valueOf(id).length() <= 6) {
                        IdEstudiantes[i] = id;
                        idValida = true; // ID válida
                    } else {
                        System.out.println("El código estudiantil debe tener un máximo de 6 dígitos.");
                    }
                } else {
                    System.out.println("Este valor no es un código válido, por favor añada su código estudiantil.");
                    scanner.next();
                }
            }
            scanner.nextLine(); 
            /*Suma de notas */
  
            
            double SumaNotas = 0;
            for (int j = 0; j < CANTIDAD_NOTAS; j++) {
                boolean notaValida = false;
                while (!notaValida) {
                    System.out.println("Ingrese la nota " + (j + 1) + ":");
                    if (scanner.hasNextDouble()) {
                       double nota=scanner.nextDouble()

                        if (nota <= 5) {
                            NotaEstudiantes[i][j] = scanner.nextDouble();
                            SumaNotas += NotaEstudiantes[i][j];
                            notaValida = true; // Nota válida
                        }else
                        System.out.println("No se puede sacar mas de 5.0 de nota, rectifique su informacion ;) ")
                    
                      
                    } else {
                        System.out.println("ingresa una verdadera nota porfavor");
                        scanner.next(); 
                    }
                }
            }
            scanner.nextLine();
            
            double promedioEstudiantes = SumaNotas / CANTIDAD_NOTAS;
            if (promedioEstudiantes >= NOTA_APROBATORIA) {
                estudiantesAprobados++;
            } else {
                estudiantesReprobados++;
            }
        System.out.println ("el promedio del estudiante es de: "+ promedioEstudiantes);
        }
        scanner.close();
        System.out.println ("la cantidad de estudiantes que aprovaron fueron: " + estudiantesAprobados);
        System.out.println ("la cantidad de estudiantes que reprobaron fueron: " + estudiantesReprobados);
    }
}