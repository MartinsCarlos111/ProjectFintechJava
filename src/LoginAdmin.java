public class LoginAdmin extends Login {
    public LoginAdmin() {
        super();
    }

    public void fazLogin(Integer accountNumber, String password) {
        setAccountNumber(accountNumber);
        setPassword(password);
        resultLogin();
    }

    @Override
    public void resultLogin() {
        //Validação de login basico para usuario adimin
        if (getAccountNumber() != 123456 || !getPassword().equals("1234")) {
            System.out.println("Conta ou senha incorretos.");
        } else {
            System.out.println("Login realizado com sucesso para o administrador. Conta: " + getAccountNumber());
        }
    }
}
