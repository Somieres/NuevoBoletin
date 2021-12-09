import java.util.Scanner;

public class Boletin6_1Ejercicio7 {
    /*
    Ejercicio 7: Realizar un programa que solicite al usuario un día, un mes, y un año, e
indique si dicha fecha es válida.
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        calcularMes();
    }


    public static int pedirDia() {

        System.out.println("""
                Introduzca el Dia""");
        return sc.nextInt();
    }

    public static int pedirMes() {

        System.out.println("""
         **********       [Introduzca un Mes]       **********
         
          1 - ENERO
          2 - FEBRERO
          3 - MARZO
          4 - ABRIL
          5 - MAYO
          6 - JUNIO
          7 - JULIO
          8 - AGOSTO
          9 - SEPTIEMBRE
         10 - OCTUBRE
         11 - NOVIEMBRE
         12 - DICIEMBRE
         [ 0 ] SALIR
         
         -------------------------------------------------------""");
        return sc.nextInt();
    }

    public static int pedirAnno() {

        System.out.println("""                
                      Introduzca el Año     """);
        return sc.nextInt();
    }

    public static void calcularBisiesto(int dia) {
        int anno = pedirAnno();

        if (anno % 400 == 0) {
            if (dia >= 1 && dia <= 29) {
                System.out.println("""
                        
                        Esta fecha es valida y ademas es un año bisiesto
                        
                        """);
            }
        }
        if (anno % 4 == 0 && anno % 100 != 0) {
            if (dia >= 1 && dia <= 29) {
                System.out.println("""
                        
                        Esta fecha es valida y ademas es un año bisiesto
                        
                        """);
            }
        } if (dia>=1 && dia<=28){ System.out.println("""
        ---------------------------------------------
        
                      fecha valida
        
        ---------------------------------------------""");
        }else
            System.out.println("""
    -----------------------------------
    
              Fecha incorrecta
                
    -----------------------------------""");

    }


    public static void calcularMes() {

        boolean salirCalMes = false;

        do {
            int mes = pedirMes();
            switch (mes) {
                case 1 -> calcularDiaMes_31();
                case 2 -> calcularBisiesto(pedirDia());
                case 3 -> calcularDiaMes_31();
                case 4 -> calcularDiaMes_30();
                case 5 -> calcularDiaMes_31();
                case 6 -> calcularDiaMes_30();
                case 7 -> calcularDiaMes_31();
                case 8 -> calcularDiaMes_31();
                case 9 -> calcularDiaMes_30();
                case 10 -> calcularDiaMes_31();
                case 11 -> calcularDiaMes_30();
                case 12 -> calcularDiaMes_31();
                case 0 -> {
                    salirCalMes = true;
                }
                default -> System.out.println("Mes incorrecto");
            }
        } while (!salirCalMes);
    }

    public static void calcularDiaMes_31() {

        int dia = pedirDia();

        if (dia >= 1 && dia <= 31) {
            System.out.println("""
        ---------------------------------------------
        
                      fecha valida
        
        ---------------------------------------------""");
        }else{
            System.out.println("""
    -----------------------------------
    
              Fecha incorrecta
                
    -----------------------------------""");
        }

    }

    public static void calcularDiaMes_30() {

        int dia = pedirDia();

        if (dia >= 1 && dia <= 30) {
            System.out.println("""
        ---------------------------------------------
        
                      fecha valida
        
        ---------------------------------------------""");
        }else{
            System.out.println("""
    -----------------------------------
    
              Fecha incorrecta
                
    -----------------------------------""");
        }
    }

}
