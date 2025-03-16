public class LoginComum extends Login {
    public LoginComum() {
        super();  // Chama o construtor da classe base Login
    }

    public void fazLogin(Integer accountNumber, String password) {
        setAccountNumber(accountNumber);
        setPassword(password);
        resultLogin();
    }

    @Override
    public void resultLogin() {
        System.out.println("Login realizado com sucesso para o usuário comum. Conta: " + getAccountNumber());
    }
}
