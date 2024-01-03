/*2. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30.
Una vez hecho esto realizará las siguientes operaciones:
        - modificar todos los 6 por 8
        - modificar todos los 7 por 15
        - modificar todos los 20 por 10

        Al finalizar el programa deberá indicar cuántas modificaciones se han realizado.
        */
public class E6 {
    public static void main(String[] args) {
        int[] aleatorios = new int[20];
        int modificaciones = 0;
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios [i] = (int) (Math.random()*30)+1;
            if (aleatorios [i]== 6){
                aleatorios [i] = 8;
                modificaciones++;
            } else if (aleatorios [i]== 7) {
                aleatorios [i] = 15;
                modificaciones++;
            }  else if (aleatorios [i]== 20) {
                aleatorios [i] = 10;
                modificaciones++;
            }
            System.out.print(aleatorios[i]+"\t");
        }
        System.out.println("\n\nEl numero total de modificaciones por condicion ha sido: "+ modificaciones);
    }
}
