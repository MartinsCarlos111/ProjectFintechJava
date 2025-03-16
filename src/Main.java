import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = null;
        Login login = null;
        Noticias noticia = null;
        Conta conta = null;
        Investimentos investimento = null;
        boolean sair = false;

        while (!sair) {
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Cadastro de Usuário");
            System.out.println("2 - Login de Usuário");
            System.out.println("3 - Login de Administrador");
            System.out.println("4 - Notícias");
            System.out.println("5 - Conta");
            System.out.println("6 - Investimentos");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcao) {
                case 1:
                    // Cadastro de Usuário
                    System.out.println("--- Cadastro de Usuário ---");
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o e-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String password = scanner.nextLine();

                    usuario = Usuario.cadastrarUsuario(nome, cpf, email, password);
                    usuario.exibirInformacoes();
                    System.out.println("Account Number gerado: " + usuario.getAccountNumber());
                    break;

                case 2:
                    System.out.println("--- Login de Usuário Comum ---");
                    //Validação de login basico
                    if (usuario == null) {
                        System.out.println("Usuário não cadastrado. Faça o cadastro primeiro.");
                    } else {
                        System.out.print("Digite o número da conta: ");
                        int accountNumber = Integer.parseInt(scanner.nextLine());
                        System.out.print("Digite a senha: ");
                        String senha = scanner.nextLine();

                        LoginComum loginComum = new LoginComum();

                        loginComum.fazLogin(accountNumber, senha);
                    }
                    break;

                case 3:
                    System.out.println("--- Login de Administrador ---");
                    System.out.print("Digite o número da conta (Admin): ");
                    int accountNumberAdmin = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite a senha (Admin): ");
                    String senhaAdmin = scanner.nextLine();

                    LoginAdmin loginAdmin = new LoginAdmin();

                    loginAdmin.fazLogin(accountNumberAdmin, senhaAdmin);
                    break;


                case 4:
                    System.out.println("--- Notícias ---");
                    System.out.print("Digite o título da notícia: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o conteúdo da notícia: ");
                    String conteudo = scanner.nextLine();
                    System.out.print("Digite o link da notícia: ");
                    String link = scanner.nextLine();

                    noticia = new Noticias(titulo, conteudo, link);
                    noticia.exibirNoticia();
                    System.out.print("Deseja abrir o link? (s/n): ");
                    String resposta = scanner.nextLine();
                    if (resposta.equalsIgnoreCase("s")) {
                        noticia.clicarNoLink();
                    }
                    break;

                case 5:
                    System.out.println("--- Conta ---");
                    if (conta == null) {
                        System.out.print("Digite o saldo inicial para a conta: ");
                        double saldoInicial = scanner.nextDouble();
                        scanner.nextLine();
                        conta = new Conta(saldoInicial);
                    }
                    boolean voltarConta = false;
                    while (!voltarConta) {
                        System.out.println("\nOpções da Conta:");
                        System.out.println("a - Exibir Saldo");
                        System.out.println("b - Exibir Valor Devido");
                        System.out.println("c - Exibir Valor Investido");
                        System.out.println("d - Depositar");
                        System.out.println("e - Sacar");
                        System.out.println("f - Definir Valor Devido");
                        System.out.println("g - Verificar Total Devido");
                        System.out.println("h - Voltar ao Menu Principal");
                        System.out.print("Escolha uma opção: ");
                        String opcaoConta = scanner.nextLine();

                        switch (opcaoConta) {
                            case "a":
                                conta.exibirSaldo();
                                break;
                            case "b":
                                conta.exibirValorDevido();
                                break;
                            case "c":
                                conta.exibirValorInvestido();
                                break;
                            case "d":
                                System.out.print("Digite o valor para depositar: ");
                                double valorDeposito = scanner.nextDouble();
                                scanner.nextLine();
                                conta.depositar(valorDeposito);
                                break;
                            case "e":
                                System.out.print("Digite o valor para sacar: ");
                                double valorSaque = scanner.nextDouble();
                                scanner.nextLine();
                                conta.sacar(valorSaque);
                                break;
                            case "f":
                                System.out.print("Digite o valor devido: ");
                                double valorDevido = scanner.nextDouble();
                                scanner.nextLine();
                                conta.setDevido(valorDevido);
                                break;
                            case "g":
                                conta.totalDevido();
                                break;
                            case "h":
                                voltarConta = true;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("--- Investimentos ---");
                    if (investimento == null) {
                        System.out.print("Digite o nome do investimento: ");
                        String nomeInvestimento = scanner.nextLine();
                        System.out.print("Digite o valor investido inicial: ");
                        double valorInvestido = scanner.nextDouble();
                        scanner.nextLine();
                        investimento = new Investimentos(nomeInvestimento, valorInvestido);
                    }
                    boolean voltarInvestimentos = false;
                    while (!voltarInvestimentos) {
                        System.out.println("\nOpções de Investimentos:");
                        System.out.println("a - Simular Investimento");
                        System.out.println("b - Resgatar Investimento");
                        System.out.println("c - Voltar ao Menu Principal");
                        System.out.print("Escolha uma opção: ");
                        String opcaoInvestimento = scanner.nextLine();

                        switch (opcaoInvestimento) {
                            case "a":
                                System.out.print("Digite o valor para simular o investimento: ");
                                double valorSimulacao = scanner.nextDouble();
                                scanner.nextLine();
                                investimento.simularInvestimento(valorSimulacao);
                                break;
                            case "b":
                                investimento.resgatarInvestimento();
                                break;
                            case "c":
                                voltarInvestimentos = true;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break;

                case 7:
                    sair = true;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
