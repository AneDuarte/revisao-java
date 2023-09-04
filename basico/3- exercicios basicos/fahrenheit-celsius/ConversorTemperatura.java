import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura e se está em Fahrenheit ou Celsius (f/c)");
        float temp = scan.nextFloat();
        char resposta = scan.next().charAt(0);

        if (resposta == 'f') {
            float celsius = 5 * (temp - 32) / 9;
            System.out.println("A temperatura em Celsius é " + celsius);
        } else if (resposta == 'c') {
            float fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é " + fahrenheit);
        } else {
            System.out.println("Valor inválido");
        }
    }
}
