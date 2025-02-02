import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una opción:");
        System.out.println("1. Verificar si un número es par.");
        System.out.println("2. Verificar si un número es divisible por 3.");
        System.out.println("3. Verificar si un número es divisible por 5.");
        System.out.println("4. Salir.");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce un numero para saber si es par :P");
                System.out.println(esPar(scanner.nextInt())); // Corregido: ahora se pasa el número ingresado
                break;
            case 2:
                System.out.print("Introduce un número: ");
                System.out.println(esDivisiblePortres(scanner.nextInt())); // Corregido: se pasa un número a la función
                break;
            case 3:
                System.out.print("Introduce un número: ");
                int numero = scanner.nextInt();
                if (esDivisiblePorCinco(numero)) {
                    System.out.println("El número es divisible por 5.");
                } else {
                    System.out.println("El número no es divisible por 5.");
                }
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
                break;
        }

        scanner.close();
    }

    public static boolean esDivisiblePortres(int num){ // Cambiado el tipo de parámetro a int
        return num % 3 == 0; // Corregido la lógica de divisibilidad por 3
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esDivisiblePorCinco(int numero) {
        return numero % 5 == 0;
    }

    //hola

    //cambio en rama david hola

    //tercer cambio
}
