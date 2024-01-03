import java.util.Scanner;

/*Realiza un programa que pida 10 números por teclado
y que los almacene en un array. A continuación se mostrará
el contenido de ese array junto al índice (0 – 9)*/
public class E1 {
    public static void main(String[] args) {
        int[] losNumeros = new int[10];
        System.out.println("\t\nVAMOS A INTRODUCIR 10 NUMEROS");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < losNumeros.length; i++) {
            System.out.println("Introduce siguiente numero por teclado");
            losNumeros [i]=sc.nextInt();

        }
        for (int i = 0; i < losNumeros.length; i++) {
            System.out.println("Indice: "+i+ ", losNumeros: "+ losNumeros[i]);
        }


    }
}
