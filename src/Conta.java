public class Conta {
    private double saldo;
    private double devido;
    private double investido;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
        this.devido = 0.0;
        this.investido = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositando R$" + valor + ". Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacando R$" + valor + ". Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void setDevido(double valor) {
        this.devido = valor;
    }

    public void totalDevido() {
        if (devido <= saldo) {
            System.out.println("Tudo certo, seu caixa é maior que seus gastos.");
        } else {
            System.out.println("Atenção: Saldo insuficiente para quitar a dívida.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void exibirValorInvestido() {
        System.out.println("Saldo atual investido: R$" + investido);
    }

    public void exibirValorDevido() {
        System.out.println("Saldo total a pagar: R$" + devido);
    }
}
