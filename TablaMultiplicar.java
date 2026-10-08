import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Paso 1:Preparar la herramienta para leer o que el usuario escribe
        Scanner scanner = new Scanner(System.in);
        

        //Paso 2: Pedir el numero al usuario
        System.out.print("Ingrese un número para generar su tabla de multiplicar: ");
        int numero = scanner.nextInt(); //Aqui se guarda el num q el usuario escribio
        

        //Paso 3: Imprimir el titulo para ayudar a la presentacion
        System.out.println("*+---Tabla del " + numero + " ---+*");

        //Paso 4: El bucle for para generar la tabla de multiplicar del numero ingresado
        for (int i = 1; i <= 10; i++) {
            //Paso 5: Calcular el resultado de la multiplicacion
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        //Paso 6: Cerrar el scanner para liberar memoria
        scanner.close();
    }
}