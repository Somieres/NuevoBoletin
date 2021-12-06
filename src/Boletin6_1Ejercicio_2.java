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
        while (respuesta == 's' || respuesta == 'S') {
            do {
                mostrarMenu();


            }while (leerDatos()==0);
            pintarMenu();
            System.out.println("¿Quiere volver a probar?");
            leerCaracter();
        }

    }

    public static char leerCaracter() {

        return sc.next().charAt(0);
    }

    public static int leerDatos() {

        return sc.nextInt();
    }

    public static void mostrarMenu(){

        System.out.println("**********     MENU DE OPCIONES     **********" +
                "\n1 - hallar la Longitud de una Esfera " +
                "\n2 - hallar el Area de una Esfera" +
                "\n3 - hallar el Volumen de una Esfera" +
                "\n" +
                "\n****************************************");
    }
    public static void pintarMenu(){

        boolean salir=false;

        int opcion=leerDatos();

        switch (opcion){
            case 1:
                System.out.println("en construccion");
                break;
            case 2:
                System.out.println("en construccion");
                break;
            case 3:
                System.out.println("en construccion");
                break;
            case 0:{
                System.out.println("en construccion");
                salir=true;
            }
            default:
                System.out.println("opcion incorrecta");
        }
    }

}
