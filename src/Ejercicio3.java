
    import java.util.Scanner;

    public class Ejercicio3 {

        public static void main(String[] args) {

            elegirOpciones();
        }

        public static void elegirOpciones(){

            boolean salirProg = false, salirFiguras;

            do {
                salirFiguras = false;

                switch (mostrarMenuPrincipal(new Scanner(System.in))){



                    case 1 -> {
                        do {

                            switch (mostrarMenuFiguras(new Scanner(System.in))){

                                case 1 -> System.out.println("El area del cono equivale a : " + calcularAreaCono(leerRadio(),leerGeneratriz()));
                                case 2 -> System.out.println("El area de la piramide equivale a : " + calcularAreaPiramide(leerLado(),leerAltura()));
                                case 3 -> System.out.println("El area del cilindro equivale a : " + calcularAreaCilindro(leerRadio(),leerAltura()));
                                case 4 -> salirFiguras=true;
                                 default -> System.out.println("Esa opcion no tiene asignada ninguna figura, elija otra.\n");
                            }
                        } while (!salirFiguras);
                    }

                    case 2 -> {
                        do {
                            switch (mostrarMenuFiguras(new Scanner(System.in))){

                                case 1 -> System.out.println("El volumen del cono equivale a : " + calcularVolumenCono(leerRadio(),leerAltura()));
                                case 2 -> System.out.println("El volumen de la piramide equivale a : " + calcularVolumenPiramide(leerLado(),leerAltura()));
                                case 3 -> System.out.println("El volumen del cilindro equivale a : " + calcularVolumenCilindro(leerRadio(),leerAltura()));
                                case 4 -> salirFiguras = true;
                                default -> System.out.println("Esa opcion no tiene asignada ninguna figura, elija otra.\n");
                            }
                        }while(!salirFiguras);

                    }

                    case 3 -> salirProg = true;

                    default -> System.out.println("Esa opcion no tiene asignada ninguna funcion, elija otra.\n");
                }

            }while(!salirProg);
        }

        public static int mostrarMenuPrincipal(Scanner sc){

            System.out.println("""
                
                -----------------------------[Menu Principal]-----------------------------
                [1] - CALCULAR AREA
                [2] - CALCULAR VOLUMEN
                [3] - SALIR DEL PROGRAMA
                --------------------------------------------------------------------------""");


        return sc.nextInt();
        }

        public static int mostrarMenuFiguras(Scanner sc){

            System.out.println("""
                
                -----------------------------[Menu Figuras]-----------------------------
                [1] - CONO
                [2] - PIRAMIDE
                [3] - CILINDRO
                [4] - VOLVER AL MENU PRINCIPAL
                ------------------------------------------------------------------------""");

            return sc.nextInt();
        }

        public static double leerRadio(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Radio: ");

            return sc.nextDouble();
        }

        public static double leerAltura(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Altura: ");

            return sc.nextDouble();
        }

        public static double leerGeneratriz(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Generatriz: ");

            return sc.nextDouble();
        }

        public static double leerLado(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Lado: ");

            return sc.nextDouble();
        }

        public static double calcularAreaCono(double radio,double generatriz) {

            return Math.PI * radio * (radio + generatriz);
        }

        public static double calcularVolumenCono(double radio,double altura){

            return (Math.PI*altura*Math.pow(radio,2))/3;
        }

        public static double calcularAreaPiramide(double lado,double altura){

            return lado*(lado+Math.sqrt(4*Math.pow(altura,2)+Math.pow(lado,2)));
        }

        public static double calcularVolumenPiramide(double lado,double altura){

            return (Math.pow(lado,2) * altura) / 3;
        }

        public static double calcularAreaCilindro(double radio,double altura){

            return 2*Math.PI*radio*(radio+altura);
        }

        public static double calcularVolumenCilindro(double radio,double altura){

            return Math.PI*Math.pow(radio,2)*altura;
        }

    }
