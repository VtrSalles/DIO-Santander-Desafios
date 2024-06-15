public class Main {
    public static void main(String[] args) {
        Cliente vitor = new Cliente("Vitor", 99999999999L);
        Conta cc = new ContaCorrente(vitor);
        Conta poupanca = new ContaPoupanca(vitor);

        cc.depositar(100);
        cc.transferir(90, poupanca);
        cc.imprimirExtrado();
        poupanca.imprimirExtrado();

    }
}
