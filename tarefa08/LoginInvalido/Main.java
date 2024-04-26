public class Main {
    public static void main(String[] args) {
        Login login = new Login("admin", "admin");

        try {
            boolean loginSucesso = login.fazerLogin("admin", "Admin");
            if (loginSucesso) {
                System.out.println("Login bem-sucedido!");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}