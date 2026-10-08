import java.util.Scanner;
public class NumMayor3 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  System.out.print("Primer número: ");
        int n1 = scanner.nextInt();

   System.out.print("Segundo número: ");
        int n2 = scanner.nextInt();

    System.out.print("Tercer número: ");
        int n3 = scanner.nextInt();

        int mayor = n1;

        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }

        System.out.println("El mayor numero es " + mayor);
        scanner.close();
 }
}
