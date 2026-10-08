import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        // Paso 1: Preparar codigo para lectura de datos
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Pedir el número al usuario
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt(); 

        // Paso 3: Iniciar variables clave 
        long factorial = 1;
        int i = 1; 
         
        // Paso 4: Calcular el factorial usando un bucle while
        while (i <= numero) {
           factorial = factorial * i; 
            i++;

        }

        // Paso 4: Imprimir el resultado del factorial
        System.out.println("El factorial de " + numero + " es: " + factorial);

        // Paso 5: Cerrar el scanner para liberar memoria
        scanner.close();
    }















}
