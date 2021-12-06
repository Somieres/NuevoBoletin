import java.util.Scanner;

public class Boletin6_1Ejercicio_2 {

    static Scanner sc = new Scanner(System.in);

    /*
    Ejercicio 2: Crear un programa, para el cual, dado el radio de una circunferencia calcule
según opción del usuario la longitud de la misma, el área y el volumen de la esfera que
determina.
     */

    public static void main(String[] args) {

        char respuesta;

        System.out.println("¿Desea conocer la longitud, el area o el volumen de uan esfera?");
        respuesta = leerCaracter();
        boolean salir = false;

        if (respuesta == 's' || respuesta == 'S') {


            mostrarMenu();
            do {
                int opcion = leerDatos();


                switch (opcion) {
                    case 1 -> System.out.println(hallarLongitud());
                    case 2 -> System.out.println(hallarArea());
                    case 3 -> System.out.println(hallarVolumen());
                    case 0 -> {
                        System.out.println("Hasta la vista");
                        salir = true;
                    }
                    default -> System.out.println("opcion incorrecta");
                }

            } while (!salir);

        } else {

            System.out.println("Ha sido un placer");
        }


    }

    public static char leerCaracter() {

        return sc.next().charAt(0);
    }

    public static int leerDatos() {

        return sc.nextInt();
    }

    public static void mostrarMenu() {


        System.out.println("**********     MENU DE OPCIONES     **********" +
                "\n1 - hallar la Longitud de una Esfera " +
                "\n2 - hallar el Area de una Esfera" +
                "\n3 - hallar el Volumen de una Esfera" +
                "\n0 - salir" +
                "\n****************************************");
    }

    public static void pedirRadio() {
        System.out.println("Introduzca el Radio de la Esfera");
    }

    public static float hallarLongitud() {
        pedirRadio();
        float radio = (float) leerDatos();
        float longitud = 2 * (float) (Math.PI) * radio;

        return longitud;

    }

    public static float hallarArea() {
        pedirRadio();
        float radio = (float) leerDatos();
        float area = 4 * (float) (Math.PI) * (float) (Math.pow(radio, 2));

        return area;

    }

    public static double hallarVolumen() {
        pedirRadio();
        float radio = (float) leerDatos();
        double volumen = (4 * (Math.PI) * (Math.pow(radio, 3)) / 3);

        return volumen;

    }


}
