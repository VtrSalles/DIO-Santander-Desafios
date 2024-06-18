package conta;

import lombok.Getter;

@Getter
public enum TipoConta {
    CONTA_CORRENTE("Conta Corrente"),
    CONTA_POUPANCA("Conta poupança"),
    CONTA_INVESTIMENTO("Conta Investimento");

    private final String descricao;


    TipoConta(String descricao) {
        this.descricao = descricao;
    }

}
