///ejercicio2


import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número N: ");
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.println("El factorial de " + i + " es: " + calcularFactorial(i));
        }

        scanner.close();
    }

    public static long calcularFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}