public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.conta = SEQUENCIAL++;
        super.cliente = cliente;
    }
    @Override
    public void imprimirExtrado() {
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInfosConta();

    }
}
