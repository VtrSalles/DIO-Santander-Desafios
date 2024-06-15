import java.util.List;

public abstract class Conta implements IConta {
    //    Atributos
    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

//    Métodos

    @Override
    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    @Override
    public void sacar(double saque) {
        this.saldo -= saque;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
//    Getters
    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
