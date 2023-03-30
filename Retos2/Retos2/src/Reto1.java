import java.util.Scanner;

public class Reto1 {
    
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        
        // Pedir al usuario la cantidad de números a ingresar
        System.out.print("Ingresa la cantidad de numeros  ");
        int n = lectura.nextInt();
        
        // Declarar un arreglo para almacenar los números
        int[] numeros = new int[n];
        
        // Pedir al usuario que ingrese los números
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i+1) + ": ");
            numeros[i] = lectura.nextInt();
        }
        
        // Contar los números que son múltiplos de 2
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }
        
        // Mostrar el resultado al usuario
        System.out.println("La cantidad de números que son múltiplos de 2 son " + contador);

        lectura.close();
    }
}


