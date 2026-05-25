import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        // Declaración e Inicialización de 20 Variables
        byte varByte = 10;
        short varShort = 500;
        int varInt = 15000;
        long varLong = 9876543210L; // Uso de 'L'
        float varFloat = 5.75f;     // Uso de 'f'
        double varDouble = 24.99;
        char varChar = 'A';         // Uso de ''
        boolean varBool = true;
        int edad = 21;
        double pi = 3.1415926535;
        float gravedad = 9.81f;     // Uso de 'f'
        long distanciaEstelar = 150000000L; // Uso de 'L'
        char inicial = 'I';         // Uso de ''
        char simbolo = '$';         // Uso de ''
        boolean esEstudiante = true;
        byte mes = 5;
        short anio = 2026;
        int contador = 100;
        double saldo = 1050.75;
        float peso = 68.5f;         // Uso de 'f'

        // Reasignación con 5 valores de otras variables
        contador = varInt;           // 1
        saldo = varDouble;          // 2
        inicial = varChar;          // 3
        esEstudiante = varBool;     // 4
        distanciaEstelar = varLong; // 5

        // Reasignación del resto con datos nuevos hardcoded
        varByte = 12;
        varShort = 600;
        varInt = 35000;
        varLong = 1234567890L;      // Uso de 'L'
        varFloat = 12.34f;          // Uso de 'f'
        varDouble = 99.98;
        varChar = 'Z';              // Uso de ''
        varBool = false;
        edad = 25;
        pi = 3.1416;
        gravedad = 9.8f;            // Uso de 'f'
        simbolo = '#';              // Uso de ''
        mes = 12;
        anio = 2027;
        peso = 72.3f;               // Uso de 'f'

        // Menú Interactivo de Ecuaciones
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n========================================");
            System.out.println("          MENÚ DE OPCIONES");
            System.out.println("========================================");
            System.out.println("1. Solución ecuación 1");
            System.out.println("2. Solución ecuación 2");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); 
                continue;
            }

            if (opcion == 1 || opcion == 2) {
                System.out.print("Ingrese el valor de x: ");
                double x = scanner.nextDouble();
                System.out.print("Ingrese el valor de z: ");
                double z = scanner.nextDouble();
                double y = 0;

                if (opcion == 1) {
                    // Ecuación 1
                    double numPrincipal = (3 * x) / (1 + (3 * x) / (3 * Math.pow(z, 2) + 2));
                    double denPrincipal = 1 / ((1 / (1 + z)) + 3 * Math.pow(x, 2) + 2 * z + 3);
                    
                    if (denPrincipal == 0) {
                        System.out.println("Error: División por cero.");
                    } else {
                        y = numPrincipal / denPrincipal;
                        System.out.printf("El resultado de la Ecuación 1 es: %.6f\n", y);
                    }
                } else {
                    // Ecuación 2
                    double numTerm1 = Math.pow(x, 2) + 3 * z + 2;
                    double denTerm1 = 2 + (1 / (1 + 2 * z));
                    double termino1 = numTerm1 / denTerm1;

                    double numSubTerm2 = 2 / (1 + 3 * Math.pow(x, 3) + 3 * z + 2);
                    double denSubTerm2 = 1 / ((1 / (1 + 3 * x)) + (3 * x + 1) / (2 * z + (3 / (1 + 5 / z))));
                    double termino2 = numSubTerm2 / denSubTerm2;

                    y = termino1 + termino2;
                    System.out.printf("El resultado de la Ecuación 2 es: %.6f\n", y);
                }
            } else if (opcion == 3) {
                System.out.println("¡Hasta luego, Ian! Programa finalizado.");
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}