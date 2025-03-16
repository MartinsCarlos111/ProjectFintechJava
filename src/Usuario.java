import java.util.Random;

// Classe Usuario que herda da classe Pessoa
public class Usuario extends Pessoa {
    private Integer accountNumber;
    private String password;

    public Usuario() {
        super("", "", "");
        this.accountNumber = gerarNumeroConta();
        this.password = "";
    }

    public Usuario(String nome, String cpf, String email, String password) {
        super(nome, cpf, email);
        this.accountNumber = gerarNumeroConta();
        this.password = password;
    }

    public static Usuario cadastrarUsuario(String nome, String cpf, String email, String password) {
        Usuario novoUsuario = new Usuario(nome, cpf, email, password);
        System.out.println("Usuário cadastrado com sucesso!");
        return novoUsuario;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número da conta: " + accountNumber);
    }

    private static int gerarNumeroConta() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

    // Métodos Getters e Setters
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String novaSenha) {
        this.password = novaSenha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
