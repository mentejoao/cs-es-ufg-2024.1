import java.util.InputMismatchException;
import java.util.Scanner;

public class InputAndVerify {
    public double dividirNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return numero1 / numero2;
    }

    public static double lerNumero(Scanner scanner) {
        double numero;
        while (true) {
            try {
                numero = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido:");
                scanner.next(); // Limpar o buffer
            }
        }
        return numero;
    }
}