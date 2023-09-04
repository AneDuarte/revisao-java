import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite suas quatro notas do bimestre: ");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();
        float nota4 = scan.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua média bimestral foi " + media);

        if (media >= 7) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }
    }
}
