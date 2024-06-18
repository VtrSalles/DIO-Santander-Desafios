package banco;

import conta.Conta;
import lombok.Getter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
@Getter
public class Banco {
    //    Atributo
    private final String nome = "Banco DIO";
    private static Banco instancia;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }
    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    public void listarContasDoBanco() {
        JOptionPane.showMessageDialog(null, this.contas);
        for (Conta conta : this.contas)
            System.out.println(conta);
        System.out.println("==============================");
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

}