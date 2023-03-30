import java.util.Scanner; 

 
public class Reto4 { 

    
    public static void main(String[] args) { 

        Scanner lectura=new Scanner(System.in); 

        String [][] producto = new String [4][4]; 

 
        for (int i = 0; i < 4; i++) { 

            for (int j = 0; j < 4; j++) { 

                System.out.println("Digita en que posicion deceas poner el producto y su respectivo nombre"+i+","+j); 

                producto[i][j] = lectura.next(); 

            } 

            System.out.println(); 

        } 


        for (int i = 0; i < 4; i++) { 

            for (int j = 0; j < 4; j++) { 


                System.out.print(producto[i][j]+"\t"); 

            } 

            System.out.println(); 

        } 

    } 

}
