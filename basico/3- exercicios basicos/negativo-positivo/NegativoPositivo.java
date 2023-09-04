import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float numero = scan.nextFloat();

        if(numero > 0) {
            System.out.println("Positivo!");
        } else if (numero < 0) {
            System.out.println("Negativo!");
        } else {
            System.out.println("Zero!");
        }
    }
}
