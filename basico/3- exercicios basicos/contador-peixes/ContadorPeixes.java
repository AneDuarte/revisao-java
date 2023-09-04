import java.util.Scanner;

public class ContadorPeixes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos quilos de peixe? ");
        float peso = scan.nextFloat();

        if ( peso > 50) {
            float excesso = peso-50;
            float multa = excesso*4;
            System.out.println(String.format("Houve excesso de %.1f kg, logo a multa a pagar é de R$ %.2f", excesso, multa));
        } else {
            System.out.println("Não houve excesso de pesca.");
        }
    }
}
