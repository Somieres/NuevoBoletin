import java.util.Scanner;
public class EjercicioPacoEnteros {

    static Scanner scanner=new Scanner(System.in);

        public static void main(String[] args) {
            final int MAX=20, MIN=0;
            int numero;
            numero=obtenerEnteroEntre(MIN, MAX);
            System.out.printf("El número " + numero + " es correcto y está entre " + MIN + " y " + MAX);
        }

        public static int obtenerEnteroEntre(int min, int max){
            int numero;
            System.out.println("Introduce un número entero");
            numero=scanner.nextInt();
            while (numero<min || numero>max){
                System.out.println("Introduce un número entero");
                numero=scanner.nextInt();
            }
            return numero;
        }
    }