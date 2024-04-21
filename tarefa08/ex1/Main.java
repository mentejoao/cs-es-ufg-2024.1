import java.util.Scanner;
class Main {
    public static void main(String args[]){

        InputAndVerify digs = new InputAndVerify();

        Scanner sc1 = new Scanner(System.in);

        Scanner sc2 = new Scanner(System.in);

        double numero1 = InputAndVerify.lerNumero(sc1);

        double numero2 = InputAndVerify.lerNumero(sc2);

        double resultado = digs.dividirNumeros(numero1, numero2);

        System.out.println("O resultado da divisão é: " + resultado);
    }
}
