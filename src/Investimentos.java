public class Investimentos {
    private String tipoInvestimento;
    private double valorInvestido;

    public Investimentos() {
    }

    public Investimentos(String tipoInvestimento, double valorInvestido) {
        this.tipoInvestimento = tipoInvestimento;
        this.valorInvestido = valorInvestido;
    }

    public void simularInvestimento(double valor) {
        System.out.println("Simulando investimento de R$" + valor + " em " + tipoInvestimento);
    }

    public void resgatarInvestimento() {
        System.out.println("Resgatando investimento de R$" + valorInvestido + " em " + tipoInvestimento);
    }
}