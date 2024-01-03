/*Define tres arrays de 20 números enteros cada una,
con nombres numero, cuadrado y cubo.
Carga el array numero con valores aleatorios entre 0 y 100.
    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.
*/
public class E4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        System.out.println("\n\nLOS NUMEROS: ");
        for (int i = 0; i < numero.length; i++) {
            numero [i] = (int) (Math.random()*100)+1;
            System.out.print("\t" + numero[i]+",");
        }
        System.out.println("\n\nLOS CUADRADOS: ");
        for (int i = 0; i < numero.length; i++) {
            cuadrado [i] = (int) Math.pow(numero[i], 2);
            System.out.print("\t" + cuadrado[i]+",");
        }
        System.out.println("\n\nLOS CUBOS: ");
        for (int i = 0; i < numero.length; i++) {
            cubo [i] = (int) Math.pow(numero[i], 3);
            System.out.print("\t" + cubo[i]+",");
        }
        System.out.println("\n\nLAS COLUMNAS");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]+"\t\t"+cuadrado[i]+"\t\t\t"+cubo[i]);
        }

    }
}
