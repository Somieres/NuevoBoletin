import java.util.Scanner;

public class Boletin6_1Ejercicio_3 {

    static Scanner sc = new Scanner(System.in);

    /*
    Ejercicio 3: Diseñar un programa que nos permita calcular áreas y volúmenes de
distintas figuras geométricas, como conos, pirámides y cilindros, según elija el usuario.
     */
    public static void main(String[] args) {

        int opcion;
        char respuesta;

        System.out.println("Desea calcular el area o el volumen de una figura geometrica");
        respuesta = sc.next().charAt(0);

        if (respuesta == 's') {


            do {
                System.out.print("**********        ELIJA UNA OPCION        **********" +
                        "\n1 - Calcular Área" +
                        "\n2 - Calcular Volumen" +
                        "\n0 - Salir ");

                do {

                    System.out.println("\n---------------------------------------" +
                            "\n¿Que opcion desea?");
                    opcion = sc.nextInt();

                } while (opcion < 0 || opcion > 2);


                switch (opcion) {
                    case 1, 2 -> {

                    do {
                        elegirFigura();
                        leerDato();
                    } while (opcion != 0);
                }
                    case 0 -> System.out.println("salir");
                    default -> System.out.println("opcion incorrecta");
                }
            } while (opcion != 0);
                System.out.println("¿desea elegir una nueva opcion?");
                respuesta=sc.next().charAt(0);

        }else{
            System.out.println("Encantados de ayudarle");
        }

    }

    public static int leerDato() {

        return sc.nextInt();
    }

    public static void elegirFigura() {

        System.out.print("------    Elija La Figura    ------" +
                "\n3 - Conos" +
                "\n4 - Piramides" +
                "\n5 - Cilindros" +
                "\n0 - Salir");
    }

    public static void pedirRadio() {
        System.out.println("Introduzca el valor del radio");
    }

    public static void pedirAltura() {
        System.out.println("Introduzca el valor de la altura");
    }

    public static void pedirBase() {
        System.out.println("Introduzca la base");
    }

   /* public static double darVolumenCono(){

        int radio, altura;
        double raizCuadrada, apotema;
        pedirRadio();
        pedirAltura();
        radio=leerDato();
        altura=leerDato();
        raizCuadrada=Math.pow(radio, 2)+Math.pow(altura,2);
        apotema=Math.sqrt(raizCuadrada);
        return apotema;
    }*/

    public static double darAreaCono() {

        int radio, altura;
        double raizCuadrada, apotema, areaLat, areaBase, areaTot;
        pedirRadio();
        pedirAltura();
        radio = leerDato();
        altura = leerDato();
        raizCuadrada = Math.pow(radio, 2) + Math.pow(altura, 2);
        apotema = Math.sqrt(raizCuadrada);
        areaLat = Math.PI * radio * apotema;
        areaBase = Math.PI * Math.pow(radio, 2);
        areaTot = areaLat + areaBase;
        return areaTot;
    }

    public static double darVolumenCono() {
        int radio, altura;
        pedirRadio();
        pedirAltura();
        radio = leerDato();
        altura = leerDato();
        return (Math.PI * Math.pow(radio, 2)) / 3;

    }
}
