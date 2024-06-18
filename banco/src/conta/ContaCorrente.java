package conta;

import banco.Banco;
import cliente.Cliente;

public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.tipoConta = TipoConta.CONTA_CORRENTE;
        super.cliente = cliente;
        Banco.getInstancia().adicionarConta(this);

    }

    @Override
    public void imprimirExtrado() {
        super.imprimirInfosConta();

    }
}
