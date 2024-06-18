package conta;

import banco.Banco;
import cliente.Cliente;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaPoupanca(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
        super.tipoConta = TipoConta.CONTA_POUPANCA;
        Banco.getInstancia().adicionarConta(this);
    }


    @Override
    public void imprimirExtrado() {
        super.imprimirInfosConta();

    }


}
