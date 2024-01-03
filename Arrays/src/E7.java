import java.util.Scanner;

/*7. Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
    x- Ver todas las palabras: mostrarla todas las palabras del array
    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
    - Ver palabra con más letras
    - Ver palabra con menos letras
    */
public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] palabras = new String[4];
        System.out.println("Introduce 10 palabras");

        for (int i = 0; i < palabras.length; i++) {
            palabras [i] = sc.next();
        }
        //mostrar todas palabras array
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i]+"\t");
        }
        // LO PROXIMO ES MOSTRAR PALABRA ALEATORIA
        for (int i = 0; i < palabras.length; i++) {


        }
    }
}
