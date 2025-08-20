import java.util.Scanner;

/**
 * A classe realiza a contagem regressiva de um número informado.
 * As funcionalidades dessa classe referem-se a informar a contagem regressiva
 * de um número natural, com versões iterativas e recursivas.
 * @author Ricardo Petri Silva
 * @version 1.0
 */
public class ContarRegressivo {

    /**
     * Informa regressivamente o número informado até 0.
     * @param n representa um número natural
     */
    public static void contarRegressivamenteRecursivo(int n) {

        if(n == -1) {
            return;
        }
        System.out.println(n);

        contarRegressivamenteRecursivo(n-1);
    }

    /**
     * Converte o número n informado para um valor positivo.
     * @param n representa um número.
     * @param scanner é um objeto para realização de leituras
     * @return retorna um número natural.
     */
    public static int converterParaNatural(int n, Scanner scanner) {
        while(n < 0) {
            System.out.println("A solução não suporta valores negativos. Informe um número natural (inteiro positivo).");
            n = scanner.nextInt();
        }
        return n;
    }

    /**
     * Converte o número n informado para um valor positivo de forma recursiva.
     * @param n representa um número.
     * @param scanner é um objeto para realização de leituras
     * @return retorna um número natural.
     */
    public static int converterParaNaturalRecursivo(int n, Scanner scanner) {
        if(n > 0) {
            return n;
        }
        System.out.println("A solução não suporta valores negativos. Informe um número natural (inteiro positivo).");
        n = scanner.nextInt();
        return converterParaNaturalRecursivo(n, scanner);
    }


    /**
     * Método principal da classe ContarRegressivo.
     * @param args parâmetro opcional quando o código é executado via terminal e com parâmetros.
     */
    public static void main(String[] args) {
        int numeroNatural;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número natural:");
        numeroNatural = scanner.nextInt();
        if(numeroNatural < 0) {
            numeroNatural = converterParaNaturalRecursivo(numeroNatural, scanner);
        }
        contarRegressivamenteRecursivo(numeroNatural);
    }
}
