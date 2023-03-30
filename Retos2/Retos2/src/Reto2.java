import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        
        // Pedir al usuario la cantidad de competidores
        
        System.out.println("BIENVENIDOS A LA COMPETENCIA,ingresa los datos y GANARA el competidor con menor tiempo");

        System.out.print("Ingrese la cantidad de competidores: ");
        int n = lectura.nextInt();
        
        // Declarar arreglos para almacenar los nombres y los tiempos de cada competidor
        String[] nombres = new String[n];
        double[] tiempos = new double[n];
        
        // Pedir al usuario que ingrese los nombres y los tiempos de cada competidor
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del competidor " + (i+1) + ": ");
            nombres[i] = lectura.next();
            System.out.print("Ingrese el tiempo que tuvo el competidor " + (i+1) + " (en segundos): ");
            tiempos[i] = lectura.nextDouble();
        }
        
        // Encontrar al competidor con el tiempo más bajo (es decir, al ganador)
        int indiceGanador = 0;
        for (int i = 1; i < n; i++) {
            if (tiempos[i] < tiempos[indiceGanador]) {
                indiceGanador = i;
            }
        }
        
        // Mostrar al ganador al usuario
        System.out.println("El ganador es: " + nombres[indiceGanador] + ", con un tiempo de " + tiempos[indiceGanador] + " segundos.");
    }
}
    

