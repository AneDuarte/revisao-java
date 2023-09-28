public class Fibonacci {
    public static int fibonacci(int qtd) {
        if(qtd < 2) return 1;

        return fibonacci(qtd-1) + fibonacci(qtd-2);
    }
}
