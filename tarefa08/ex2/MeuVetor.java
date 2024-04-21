import java.util.InputMismatchException;
import java.util.Scanner;

public class MeuVetor {
    public static void create() {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int indice = 0;

        try {
            System.out.println("Digite valores inteiros para preencher o vetor (digite 0 para parar):");
            while (true) {
                int valor = scanner.nextInt();
                if (valor == 0) {
                    vetor[indice] = valor;
                    break;
                }
                vetor[indice] = valor;
                indice++;
            }


        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira apenas valores inteiros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            System.out.println("Valores inseridos no vetor:");
            for (int i = 0; i < indice; i++) {
                System.out.println(vetor[i]);
            }
        }
    }
}