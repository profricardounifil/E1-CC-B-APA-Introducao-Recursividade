import java.util.Scanner;

public class Fibonacci {

    /**
     * Método responsável por calcular o fibonacci do número informado.
     * @param n número informado para cálculo do fibonacci
     * @return retorna o número que representa o cálculo do Fib(n).
     */
    public static int calcularFibonacci(int n) {
        int resultado = 0, penultimo = 1, antepenultimo = 0;
        if(n<2) {
            return n;
        } else {
            for (int i = 2; i <= n; i++) {
                resultado = penultimo + antepenultimo;
                antepenultimo = penultimo;
                penultimo = resultado;
            }
        }
        return resultado;
    }

    public static int calcularFibonacciRecursivo(int n) {
        if(n < 2) {
            return n;
        }
        return calcularFibonacciRecursivo(n-1) + calcularFibonacciRecursivo(n-2);

    }

    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe um número natural para cáclulo do Fibonacci.");
        numero = scanner.nextInt();
        System.out.println("O Fib(" + numero + ")= " + calcularFibonacciRecursivo(numero));
    }
}
