/*Crear un programa que genere 30 números aleatorios entre 0 - 10
y los guarde en un array. Una vez metidos, se deberá mostrar:
        - Numero de puntos obtenidos
        - Media de puntos obtenidos
*/
public class E2 {
    public static void main(String[] args) {
        int[] notasAleatorias = new int[30];
        int sumaTotal = 0;
        System.out.println(" Tus notas aleatorias en 30 examenes son:");

        for (int i = 0; i < notasAleatorias.length; i++) {
            notasAleatorias[i]= (int) (Math.random()*10)+1;
            sumaTotal = sumaTotal + notasAleatorias[i];
            //probar con este tambien: sumaTotal += notasAleatorias[i];
        }

        System.out.println("El total de puntos obtenidos en 30 examenes es: "+ sumaTotal);
        System.out.println("La media de tu nota es:" + (float) sumaTotal/30);



    }
}
