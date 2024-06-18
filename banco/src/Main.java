import banco.Banco;
import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        char opAcoes = '0';
        char opCadastro = '0';
        Conta conta1 = null;
        Conta conta2 = new ContaPoupanca(new Cliente("Cliente modelo"));
        Banco banco = Banco.getInstancia();

        JOptionPane.showMessageDialog(null, "Bem vindo ao banco ".concat(banco.getNome()).concat(".\n"));
        opCadastro = (JOptionPane.showInputDialog("Você já é cliente do nosso banco?\nDigite 1 para sim e 2 para não.")).charAt(0);
        switch (opCadastro) {
            case '2': {
                JOptionPane.showMessageDialog(null, "Vamos realizar um cadastro rápido.");
                String nomeCliente = JOptionPane.showInputDialog("Digite o seu nome:");
                char opTipoConta = (JOptionPane.showInputDialog("Qual o tipo de conta deseja criar?\n1 para Conta Corrente.\n2 para Conta Poupança")).charAt(0);
                if (opTipoConta == '1') {
                    conta1 = new ContaCorrente(new Cliente(nomeCliente));
                } else if (opTipoConta == '2') {
                    conta1 = new ContaPoupanca(new Cliente(nomeCliente));
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                    System.exit(0);
                }
                break;
            }
            case '1': {
                String nomeCliente = JOptionPane.showInputDialog("Digite o seu nome:");
                conta1 = new ContaCorrente(new Cliente(nomeCliente)); // Usando ContaCorrente como exemplo
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                System.exit(0);
            }
        }

        if (conta1 == null) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a conta. Encerrando.");
            System.exit(0);
        }
        do {
            assert conta1 != null;
            opAcoes = (JOptionPane.showInputDialog("O que deseja fazer ".concat(conta1.getCliente().getNome()) + "?\n" +
                    "1 para depósito.\n" +
                    "2 para saque.\n" +
                    "3 para transferência." +
                    "\n4 para imprimir extrato." +
                    "\n5 para sair")).charAt(0);

            switch (opAcoes) {
                case '1': {
                    conta1.depositar();
                    break;
                }
                case '2': {
                    conta1.sacar();
                    break;
                }
                case '3': {
                    conta1.transferir(conta2);
                    break;
                }
                case '4': {
                    conta1.imprimirExtrado();
                    break;
                }
                case '5': {
                    System.exit(0);
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
            }
        } while (opAcoes != 5);

    }
}
