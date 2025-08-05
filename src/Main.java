import java.util.Scanner;

public class Main {

    public static void contarRegressivamenteRecursivo(int n) {

        if(n == -1) {
            return;
        }
        System.out.println(n);

        contarRegressivamenteRecursivo(n-1);
    }

    public static int converterParaNatural(int n, Scanner scanner) {
        while(n < 0) {
            System.out.println("A solução não suporta valores negativos. Informe um número natural (inteiro positivo).");
            n = scanner.nextInt();
        }
        return n;
    }

    public static int converterParaNaturalRecursivo(int n, Scanner scanner) {
        if(n > 0) {
            return n;
        }
        System.out.println("A solução não suporta valores negativos. Informe um número natural (inteiro positivo).");
        n = scanner.nextInt();
        return converterParaNaturalRecursivo(n, scanner);
    }

    public static void main(String[] args) {
        int numeroNatural;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número natural.");
        numeroNatural = scanner.nextInt();
        if(numeroNatural < 0) {
            numeroNatural = converterParaNaturalRecursivo(numeroNatural, scanner);
        }
        contarRegressivamenteRecursivo(numeroNatural);
    }
}