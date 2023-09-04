import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        float soma = num1 + num2;
        System.out.println("A soma dos números é " + soma);
    }
}
