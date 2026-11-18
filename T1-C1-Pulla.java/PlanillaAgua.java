//Problema 1: Planilla de aguaFirmas y proposito de los metodos:public 
// static double leerConsumo(Scanner sc) Solicita y valida por consola que el consumo ingresado
//  en metros cubicos sea mayor o igual a 0.   public static double calcularValor(double m3) 
// Calcula el monto total a pagar sumando el cargo fijo ($2,50) y el consumo por tramos
//  (hasta 15 m^3 a $0,40 y el exceso a $0,75).   public static void mostrarPlanilla(double m3, double total) 
//  Muestra en consola el detalle formateado del consumo registrado y el valor total de la planilla.
//  (b) Codigo fuente:Javaimport java.util.Scanner;

import java.util.Scanner;

public class PlanillaAgua {

    public static double leerConsumo(Scanner sc) {
        double m3;
        do {
            System.out.print("Ingrese el consumo de agua en m3 (>= 0): ");
            m3 = sc.nextDouble();
            if (m3 < 0) {
                System.out.println("Error: El consumo no puede ser negativo.");
            }
        } while (m3 < 0);
        return m3;
    }

    public static double calcularValor(double m3) {
        double cargoFijo = 2.50;
        double valorConsumo;
        if (m3 <= 15) {
            valorConsumo = m3 * 0.40;
        } else {
            valorConsumo = (15 * 0.40) + ((m3 - 15) * 0.75);
        }
        return cargoFijo + valorConsumo;
    }

    public static void mostrarPlanilla(double m3, double total) {
        System.out.println("=================================");
        System.out.println("        PLANILLA DE AGUA         ");
        System.out.println("Consumo: " + m3 + " m3");
        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.println("=================================\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Caso de prueba 1 (tramo base <= 15 m3, ej. 10 m3 -> $6.50)
        System.out.println("--- Caso de prueba 1 ---");
        double c1 = leerConsumo(sc);
        mostrarPlanilla(c1, calcularValor(c1));

        // Caso de prueba 2 (con exceso > 15 m3, ej. 20 m3 -> $12.25)
        System.out.println("--- Caso de prueba 2 ---");
        double c2 = leerConsumo(sc);
        mostrarPlanilla(c2, calcularValor(c2));

        sc.close();
    }
}