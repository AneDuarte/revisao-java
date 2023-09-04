import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine(); //ler linha completa
        System.out.println("Seu nome é " + nomeCompleto);

        System.out.println("Digite seu nome: ");
        String primeiroNome = scan.next(); //ler primeira palavra
        System.out.println("Seu primeiro nome é " + primeiroNome);
        */

        /*
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt(); //ler dado tipo inteiro
        System.out.println("Sua idade é " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble(); //ler dado tipo double, ler o valor com ,
        System.out.println("Sua altura é " + altura);
        */

        /*A função retira parte da string, observe:

        System.out.println("Digite seu nome completo: ");
        String primeiroNome = scan.next(); //ler primeira palavra
        System.out.println("Seu primeiro nome é " + primeiroNome);
        String nomeCompleto = scan.nextLine(); //ler linha completa
        System.out.println("Seu nome é " + nomeCompleto);
        */

        System.out.println("Digite seu primeiro nome, idade, altura e se tem animal de estimação(s/n): ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        char temAnimal = scan.next().charAt(0);
        if (temAnimal == 's') {
            String msg = String.format("Seu nome é %s, você tem %d anos, %.2f de altura e tem animal de estimação", primeiroNome, idade, altura);
            System.out.println(msg);
        } else if (temAnimal == 'n') {
            String msg = String.format("Seu nome é %s, você tem %d anos, %.2f de altura e não tem animal de estimação", primeiroNome, idade, altura);
            System.out.println(msg);
        }
        else {
            String msg = String.format("Seu nome é %s, você tem %d anos, %.2f de altura e não sei se tem animal de estimação", primeiroNome, idade, altura);
            System.out.println(msg);
        }

        /*
        Outra opção de resposta, sem condicional
            String msg = String.format("Seu nome é %s, você tem %d anos, %.2f de altura e %c tem animal de estimação", primeiroNome, idade, altura, temAnimal);
        */


    }
}
