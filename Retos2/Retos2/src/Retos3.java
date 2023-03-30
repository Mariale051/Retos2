import java.util.Scanner;

public class Retos3 {
    
    public static void main(String[] args) {

        int num;

        Scanner lectura = new Scanner(System.in);

        // Pedir al usuario la cantidad de cuadros
        System.out.print("Ingresa la cantidad de cuadros (debe ser un número par): ");
         num = lectura.nextInt();

        // Verificar que la cantidad de cuadros sea par
        if (num % 2 != 0) {
            System.out.println("La cantidad de cuadros debe ser un número par.");
            return;
        }

        // Declarar un arreglo para almacenar las palabras
        String[] palabras = new String[num];

        // Pedir al usuario que ingrese las palabras
        System.out.println("Ingresa las palabras para el juego de concentración:");
        for (int i = 0; i < num; i++) {
            System.out.print("Palabra " + (i+1) + ": ");
            palabras[i] = lectura.next();
        }

        // Desordenar las palabras (mezclarlas)
        for (int i = 0; i < num; i++) {
            int j = (int) (Math.random() * num);
            String temp = palabras[i];
            palabras[i] = palabras[j];
            palabras[j] = temp;
        }

        // Declarar un arreglo para almacenar las selecciones del usuario
        int[] seleccionados = new int[num];
        for (int i = 0; i < num; i++) {
            seleccionados[i] = -1;
        }

        // Jugar al juego de concentración
        int paresEncontrados = 0;
        while (paresEncontrados < num/2) {
            // Mostrar las palabras desordenadas
            System.out.println("Encuentra las parejas de palabras:");
            for (int i = 0; i < num; i++) {
                if (seleccionados[i] == -1) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[" + palabras[i] + "] ");
                }
            }
            System.out.println();

            // Pedir al usuario que seleccione dos cuadros
            System.out.print("Seleccione el primer cuadro (número de 1 a " + num + "): ");
            int seleccion1 = lectura.nextInt() - 1;
            System.out.print("Seleccione el segundo cuadro (número de 1 a " + num + "): ");
            int seleccion2 = lectura.nextInt() - 1;

            // Verificar que las selecciones sean válidas
            if (seleccion1 < 0 || seleccion1 >= num || seleccion2 < 0 || seleccion2 >= num || seleccion1 == seleccion2) {
                System.out.println("Selecciones inválidas.");
                continue;
            }

            // Verificar si las palabras seleccionadas son iguales
            if (palabras[seleccion1].equals(palabras[seleccion2])) {
                // Las palabras son iguales, marcar los cuadros como encontrados
                seleccionados[seleccion1] = paresEncontrados;
                seleccionados[seleccion2] = paresEncontrados;
            }
        }

        lectura.close();

    }

}