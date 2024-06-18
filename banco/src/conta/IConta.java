package conta;

public interface IConta {

    void depositar();

    void sacar();

    void transferir(Conta contaDestino);

    void imprimirExtrado();

}
