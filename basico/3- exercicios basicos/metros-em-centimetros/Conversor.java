import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        float metros = scan.nextFloat();
        float cent = metros * 100;
        System.out.println("O valor em centímetro é " + cent);
    }
}
