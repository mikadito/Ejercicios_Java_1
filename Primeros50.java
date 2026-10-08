import java.util.Scanner;

public class Primeros50 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int suma = 0;
     for (int i = 1; i <= 50; i++) {
    suma += i;
}
  System.out.println("El resultado de la suma de los primeros 50 números es: " + suma);
  scanner.close();


 }

}