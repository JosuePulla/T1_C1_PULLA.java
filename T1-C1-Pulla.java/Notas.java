//public static double promedio(double a, double b, double c) — Calcula y retorna el promedio aritmético de tres calificaciones.
//    public static String estado(double nota) — Determina el estado académico del estudiante (Aprobado, Supletorio o Reprobado)
//  según el rango de su nota.   public static double necesitaEnSupletorio(double nota) — Calcula la nota mínima requerida en el
//  examen supletorio para alcanzar un promedio final de 14 entre ambas calificaciones.   

    public static double promedio(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static String estado(double nota) {
        if (nota >= 14.0) {
            return "Aprobado";
        } else if (nota >= 9.0) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    public static double necesitaEnSupletorio(double nota) {
        // (nota + supletorio) / 2 = 14  =>  supletorio = 28 - nota
        return 28.0 - nota;
    }

    public static void main(String[] args) {
        // Caso de prueba 1: Estudiante en rango de Supletorio
        double prom1 = promedio(11.0, 12.5, 11.0);
        String est1 = estado(prom1);
        System.out.printf("Caso 1 -> Promedio: %.2f | Estado: %s%n", prom1, est1);
        if (est1.equals("Supletorio")) {
            System.out.printf("Nota mínima necesaria en supletorio: %.2f%n%n", necesitaEnSupletorio(prom1));
        }

        // Caso de prueba 2: Estudiante Aprobado
        double prom2 = promedio(15.0, 16.5, 14.5);
        String est2 = estado(prom2);
        System.out.printf("Caso 2 -> Promedio: %.2f | Estado: %s%n", prom2, est2);
        if (est2.equals("Supletorio")) {
            System.out.printf("Nota mínima necesaria en supletorio: %.2f%n", necesitaEnSupletorio(prom2));
        }
    }
