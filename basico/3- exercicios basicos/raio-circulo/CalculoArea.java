import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        float raio = scan.nextFloat();
        double area = Math.pow(raio, 2) * Math.PI;
        System.out.println(String.format("A área do círculo é %.2f",area));
    }
}
