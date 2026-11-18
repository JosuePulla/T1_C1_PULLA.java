import java.util.Scanner;

//public static double volumen(double lado) 
// — Calcula el volumen de un cubo a partir de la longitud de su arista ($l^3$).   
// public static double volumen(double radio, double altura) 

// — Calcula el volumen de un cilindro circular recto a partir de su radio y altura ($\pi \cdot r^2 \cdot h$). 
//   public static double volumen(double largo, double ancho, double alto)

//  — Calcula el volumen de un prisma rectangular multiplicando sus tres dimensiones.  
//  (b) Código fuente:Javaimport java.util.Scanner;

public class GeometriaCarrera {

    // Volumen de un cubo
    public static double volumen(double lado) {
        return lado * lado * lado;
    }

    // Volumen de un cilindro
    public static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    // Volumen de un prisma rectangular
    public static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== CÁLCULO DE VOLÚMENES ===");
            System.out.println("1. Cubo");
            System.out.println("2. Cilindro");
            System.out.println("3. Prisma rectangular");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cubo: ");
                    double l = sc.nextDouble();
                    System.out.printf("Volumen del cubo: %.2f%n%n", volumen(l));
                    break;
                case 2:
                    System.out.print("Ingrese el radio del cilindro: ");
                    double r = sc.nextDouble();
                    System.out.print("Ingrese la altura del cilindro: ");
                    double h = sc.nextDouble();
                    System.out.printf("Volumen del cilindro: %.2f%n%n", volumen(r, h));
                    break;
                case 3:
                    System.out.print("Ingrese el largo: ");
                    double largo = sc.nextDouble();
                    System.out.print("Ingrese el ancho: ");
                    double ancho = sc.nextDouble();
                    System.out.print("Ingrese el alto: ");
                    double alto = sc.nextDouble();
                    System.out.printf("Volumen del prisma: %.2f%n%n", volumen(largo, ancho, alto));
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.\n");
            }
        } while (opcion != 0);

        sc.close();
    }
}