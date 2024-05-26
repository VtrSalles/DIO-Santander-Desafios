import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro valor.");
        int param1 = teclado.nextInt();
        System.out.println("Informe o segundo valor.");
        int param2 = teclado.nextInt();
        try {
            realizaInteracao(param1, param2);
        } catch (ParametrosInvalidosException exception) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void realizaInteracao(int param1, int param2) throws ParametrosInvalidosException {

        if (param1 > param2)
            throw new  ParametrosInvalidosException();
        int totalInteracao = param2 - param1;
        for (int i = 1; i <= totalInteracao; i++) {
            System.out.println("Imprimindo o " + i + "º número.");
        }
    }
}