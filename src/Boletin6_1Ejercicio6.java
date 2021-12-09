import java.util.Scanner;

public class Boletin6_1Ejercicio6 {
/*
Ejercicio 6: Modifica el ejercicio 4 y 5, con la función validarEntero.
 */
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        pintarMenu();
    }

    public static void pintarMenu() {


        final int MIN=1,MAX=5;
        int entero=validarEntero(MIN,MAX);
        boolean salirProgramaPpal = false, salirSecundario;


        if (entero>=1 && entero<=5){
        do {
            salirSecundario = false;

            switch (mostrarMenuPpal(new Scanner(System.in))) {
                case 1 -> {
                    do {
                        switch (mostrarMenuSecundario(new Scanner(System.in))) {

                            case 1 -> System.out.println(suma());
                            case 2 -> System.out.println("En construccion");
                            case 3 -> System.out.println("En construccion");
                            case 4 -> salirSecundario = true;
                            default -> System.out.println("Eleccion incorrecta, try again!!");
                        }
                    } while (!salirSecundario);
                }
                case 2 -> {
                    do {
                        switch (mostrarMenuSecundario(new Scanner(System.in))) {
                            case 1 -> System.out.println("En construccion");
                            case 2 -> System.out.println("En construccion");
                            case 3 -> System.out.println("En construccion");
                            case 4 -> salirSecundario = true;
                            default -> System.out.println("Eleccion incorrecta, try again!!");
                        }
                    } while (!salirSecundario);
                }
                case 3 -> {
                    do {
                        switch (mostrarMenuSecundario(new Scanner(System.in))) {
                            case 1 -> System.out.println("En construccion");
                            case 2 -> System.out.println("En construccion");
                            case 3 -> System.out.println("En construccion");
                            case 4 -> salirSecundario = true;
                            default -> System.out.println("Eleccion incorrecta, try again!!");
                        }
                    } while (!salirSecundario);
                }
                case 4 -> {
                    do {
                        switch (mostrarMenuSecundario(new Scanner(System.in))) {
                            case 1 -> System.out.println("En construccion");
                            case 2 -> System.out.println("En construccion");
                            case 3 -> System.out.println("En construccion");
                            case 4 -> salirSecundario = true;
                            default -> System.out.println("Eleccion incorrecta, try again!!");
                        }
                    } while (!salirSecundario);
                }
                case 5 -> salirProgramaPpal = true;
                default -> System.out.println("NOOOOoOoooOOOoOOooOOOo");
            }

        } while (!salirProgramaPpal);
        }else{
            System.out.println("El numero introdicido no es correcto");
            pintarMenu();
        }


    }
    public static int validarEntero(int min, int max) {

        int numero;
        System.out.println("Introduza un numero entre 1 y 5");
        numero=sc.nextInt();

        if (numero >= 1 && numero <= 5) {

            return numero;
        } else
            return numero;
    }

    public static int mostrarMenuPpal(Scanner sc) {
        System.out.println(""" 
                ----------[MENÚ PRINCIPAL]----------
                [1] - CALCULAR SUMA
                [2] - CALCULAR RESTA
                [3] - CALCULAR MULTIPLICACIÓN
                [4] - CALCULAR DIVISIÓN
                [5] - SALIR
                -------------------------------""");
        return sc.nextInt();
    }

    public static int mostrarMenuSecundario(Scanner sc) {
        System.out.println("""
                ----------[Menú Numérico]----------
                [1] - Enteros
                [2] - Fracciones
                [3] - Reales
                [4] - Salir al Menú Principal
                --------------------------------------------------""");
        return sc.nextInt();
    }

    public static int leerEntero(){
        System.out.println("introduzca un valor");
        return sc.nextInt();
    }

    public static float leerReal(){
        System.out.println("introduzca un valor");
        return sc.nextFloat();
    }

    public static int suma(){
        int a=leerEntero();
        int b=leerEntero();
        return a+b;
    }

}
