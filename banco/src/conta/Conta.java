package conta;

import cliente.Cliente;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.io.InputStreamReader;
import java.util.Scanner;

@Getter
@Setter
public abstract class Conta implements IConta {
    //    Atributos
    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected TipoConta tipoConta;
    protected Cliente cliente;

    //    Métodos
    @Override
    public void depositar() {
//        System.out.println("Infome o valor de deposito: ");
        this.saldo += Double.parseDouble(JOptionPane.showInputDialog("Infome o valor de deposito:", "Digite aqui"));
    }

    @Override
    public void sacar() {
        double saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de saque:"));
        if (this.saldo < saque)
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque destes valor.");
        else
            this.saldo -= saque;
    }

    @Override
    public void transferir(Conta contaDestino) {
        double valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da transferência", "Digite aqui"));
        if (this.saldo < valorTransferencia)
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar a tranferência");
        else {
            this.saldo -= valorTransferencia;
            contaDestino.saldo = contaDestino.getSaldo() + valorTransferencia;
        }
    }

    protected void imprimirInfosConta() {
        String msg = String.format("Titular: " + this.cliente.getNome() + "\n");
        msg += String.format("Tipo: " + this.getTipoConta().getDescricao());
        msg += String.format("Agencia: " + this.agencia + "\n");
        msg += String.format("Conta: " + this.numero + "\n");
        msg += String.format("Saldo: " + this.saldo);
        JOptionPane.showMessageDialog(null, msg);
//        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
//        System.out.println(String.format("Agencia: %d", this.agencia));
//        System.out.println(String.format("Conta: %d", this.numero));
//        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return String.format("Agencia: %d, Conta: %d, Tipo: %s",
                this.agencia, this.numero, this.tipoConta.getDescricao());
    }
}
