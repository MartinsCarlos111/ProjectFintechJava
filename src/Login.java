public class Login {
    private Integer accountNumber;
    private String password;

    // Construtor padrão
    public Login() {
    }

    // Construtor com parâmetros (caso precise de um construtor parametrizado)
    public Login(Integer accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.password = password;
    }

    // Getters e setters
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método para exibir o resultado do login
    public void resultLogin() {
        System.out.println("Login realizado com sucesso para a conta: " + accountNumber);
    }
}
