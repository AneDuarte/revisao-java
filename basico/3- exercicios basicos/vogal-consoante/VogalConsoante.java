import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char vogais[] = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Digite uma letra: ");

        /* FORMA 1
        char letra = scan.next().charAt(0);
        for(char i : vogais) {
            if(letra == i) {
                System.out.println("Vogal!");
            } else {
                System.out.println("Consoante!");
            }
            break;
        }*/

        /* FORMA 2
        String letra = scan.next();
        if(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }*/
    }
}
