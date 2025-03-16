import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario user = new Usuario();
        LoginComum loginComum = new LoginComum();
        LoginAdmin loginAdmin = new LoginAdmin();

        boolean sair = false;

        while (!sair) {
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Cadastro de Usuário");
            System.out.println("2 - Login de Usuário Comum");
            System.out.println("3 - Login de Administrador");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha após a entrada do número

            switch (opcao) {
                case 1:
                    // Cadastro de Usuário
                    System.out.println("--- Cadastro de Usuário ---");
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o cpf: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();

                    user.setNome(nome);
                    user.setCpf(cpf);
                    user.setEmail(email);
                    user.setPassword(senha);

                    user.exibirInformacoes();
                    break;

                case 2:
                    // Login de Usuário Comum
                    System.out.println("--- Login de Usuário Comum ---");
                    System.out.print("Digite o número da conta: ");
                    Integer accountNumber = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite a senha: ");
                    String senhaLoginComum = scanner.nextLine();

                    loginComum.fazLogin(accountNumber, senhaLoginComum);
                    break;

                case 3:
                    // Login de Administrador
                    System.out.println("--- Login de Administrador ---");
                    System.out.print("Digite o número da conta (Admin): ");
                    accountNumber = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite a senha (Admin): ");
                    String senhaLoginAdmin = scanner.nextLine();

                    loginAdmin.fazLogin(accountNumber, senhaLoginAdmin);
                    break;

                case 4:
                    sair = true;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}
