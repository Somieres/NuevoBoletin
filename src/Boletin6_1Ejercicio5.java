import java.util.Scanner;

public class Boletin6_1Ejercicio5 {
    /*
    Ejercicio 5: Crear un método genérico, para solicitar al usuario entradas válidas de
números enteros, el cual solicitará un valor al usuario hasta obtener un valor que se
encuentre entre el número min y max (ambos incluidos). Diseñar el método para que
pueda ser utilizado de forma genérica en la selección de menús. Seguir la siguiente
especificación del método:
/*
Precondiciones: max>=min (max es mayor que min)
Postcondiciones: Devuelve un valor entero introducido por teclado por el usuario (n),
cuyo valor se encuentra entre min y max. min<= n <= max
Entrada: dos números enteros, min y max
Salida: Un número entero.

    public static int validarEntero(int min, int max)
     */
    public class ejercicio5Booleano {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            final int MINIMO = 0, MAXIMO = 10;

            int numero = validarEntero(MINIMO, MAXIMO);

            if (numero >= MINIMO && numero <= MAXIMO) {

                System.out.println("El numero introducido es correcto y esta en el rango de valores");
            } else
                System.out.println("El numero no es correcto ya que no está en el rango deseado");


        }

        public static int leerNumero() {
            System.out.println("""
                    Introduzca un entero""");

            return sc.nextInt();
        }

        public static int validarEntero(int min, int max) {

            int numero = leerNumero();

            if (numero >= min && numero <= max) {

                return numero;
            } else
                return numero;
        }

    }
}



