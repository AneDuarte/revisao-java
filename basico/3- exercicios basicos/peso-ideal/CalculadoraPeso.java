import java.util.Scanner;

public class CalculadoraPeso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura, seu sexo (m/f) e seu peso atual");
        float altura = scan.nextFloat();
        char sexo = scan.next().charAt(0);

        if(sexo == 'm') {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println(String.format("O seu peso ideal é %.2f", pesoIdeal));

        } else if (sexo == 'f') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println(String.format("O seu peso ideal é %.2f", pesoIdeal));

        } else {
            System.out.println("Valor inválido!");
        }

    }
}
