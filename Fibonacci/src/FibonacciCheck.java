
import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (isFibonacci(numero)){
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci!");
        } else{System.out.println("O número " + numero + " não pertence à sequência de Fibonacci!");}
    }

    public static boolean isFibonacci(int numero){
        if(numero < 0){
            return false;
        }
        int a = 0;
        int b = 1;
        while (a < numero){
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == numero;
    }
}

