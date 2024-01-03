import java.util.Scanner;

/*Realiza un programa que pida 8 números enteros,
los guarde en un array y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.*/
public class E5 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 8 números");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                System.out.println(numeros[i] + ": ES PAR");
            }else {
                System.out.println(numeros[i] + ": ES IMPAR");
            }
        }
    }
}
