import java.util.Scanner;

public class Boletin6_1Ejercicio4 {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        pintarMenu();
    }

    public static void pintarMenu() {

        boolean salirProgramaPpal = false, salirSecundario;

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

    }

    public static int mostrarMenuPpal(Scanner sc) {
        System.out.println(""" 
                ----------[MEN?? PRINCIPAL]----------
                [1] - CALCULAR SUMA
                [2] - CALCULAR RESTA
                [3] - CALCULAR MULTIPLICACI??N
                [4] - CALCULAR DIVISI??N
                [5] - SALIR
                -------------------------------""");
        return sc.nextInt();
    }

    public static int mostrarMenuSecundario(Scanner sc) {
        System.out.println("""
                ----------[Men?? Num??rico]----------
                [1] - Enteros
                [2] - Fracciones
                [3] - Reales
                [4] - Salir al Men?? Principal
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