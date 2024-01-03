import java.util.Scanner;

/*
3. Escribe un programa que lea 10 números por teclado,
los guarde en un array y que luego los muestre:
    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido
*/
public class E3 {
    public static void main(String[] args) {
        int[] los10 = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tIntroduce 10 numeros cuando se te vaya pidiendo");

        for (int i = 0; i < los10.length; i++) {
            System.out.println("Introduce numero");
            los10[i] = sc.nextInt();
        }

        System.out.println(" SE MUESTRAN AUTOMATICAMENTE LOS NUMEROS EN ORDEN INTRODUCIDO");
        for (int i = 0; i < los10.length; i++) {
            System.out.print("pos: " + i + ", num: " + los10[i] + ",\t");
        }


        System.out.println("\n\n SE MUESTRAN AUTOMATICAMENTE LOS NUMEROS EN ORDEN INVERSO");
        for (int i = 9; i >= 0; i--) {
            System.out.print("pos: " + i + ", num: " + los10[i] + ",\t");
        }

    }
}
