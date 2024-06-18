package cliente;

import lombok.Getter;

import java.util.Random;

@Getter
public class Cliente {
    private static final long RANDOM_TELEFONE = new Random().nextLong(900000000) + 100000000;
    private static final long RANDOM_CPF = new Random().nextLong(90000000000L) + 10000000000L;
    private String nome;
    private long telefone;
    private long cpf;

    public Cliente(String nome) {
        this.nome = nome;
        this.telefone = RANDOM_TELEFONE;
        this.cpf = RANDOM_CPF;
    }


    @Override
    public String toString() {
        return String.format("Nome: %s,\nCPF: %s,\nTelefone: %d",
                this.nome, this.cpf, this.telefone);
    }
}
