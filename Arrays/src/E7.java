import java.util.Random;
import java.util.Scanner;

/*7. Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
    x- Ver todas las palabras: mostrarla todas las palabras del array
    x(con ayudaGPT)- Obtener una palabra al azar: mostrará una palabra de las que existen en el array
    x(con ayudaGPT)- Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
    x- Ver media de letras: mostrará el número medio de letras entre todas las palabas
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



        // MOSTRAR PALABRA ALEATORIA
        Random random = new Random();
        int indicePalabras = random.nextInt(palabras.length); //creamos un indice enlazado al random y a las palabras.length
        String palabraAleatoria = palabras[indicePalabras];
        System.out.println("\n La palabra aleatoria es: "+palabraAleatoria);// esto me da la palabra

        //MOSTRAR NÚMERO DE LETRAS DE TODAS LAS PALABRAS y MEDIA DE LETRAS
        int numeroPalabras = palabras.length;
        int numetroLetras = 0;
        for (String item : palabras) {
            numetroLetras += item.length();// ojo el parentesis IMPORTANTE
            System.out.println("numero de letras contadas: "+ numetroLetras);

            System.out.println("la formula para la media es: " +numetroLetras+"/"+palabras.length);
            System.out.println("Por tanto la media de letras es: " + numetroLetras/palabras.length);

        }
        //MOSTRAR PALABRA CON MAS LETRAS Y CON MENOS
       // if (palabras.split("")[0]>){

        }
        }

        }
    }


