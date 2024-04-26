public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(200.0);
        ContaBancaria conta2 = new ContaBancaria();

        System.out.println("Saldo inicial da conta1: " + conta1.getSaldo());
        System.out.println("Saldo inicial da conta2: " + conta2.getSaldo());
        try{
            conta1.sacar(300.0); // tentando sacar mais que o saldo inicial
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}