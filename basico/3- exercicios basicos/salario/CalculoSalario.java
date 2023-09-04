import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu valor/hora e quantas horas mensais você cumpre: ");
        float valorHora = scan.nextFloat();
        int horasMensais = scan.nextInt();
        float salario = valorHora * horasMensais;

        double imposto = salario * 0.11;
        double inss = salario * 0.08;
        double sindicato = salario * 0.05;
        double salarioLiquido = salario - imposto - inss - sindicato;

        System.out.println(String.format("Seu salário bruto é %.2f", salario));
        System.out.println(String.format("Você pagou %.2f pro imposto de renda", imposto));
        System.out.println(String.format("Você pagou %.2f ao INSS", inss));
        System.out.println(String.format("Você pagou %.2f ao sindicato", sindicato));
        System.out.println(String.format("Seu salário líquido é %.2f", salarioLiquido));
    }
}
