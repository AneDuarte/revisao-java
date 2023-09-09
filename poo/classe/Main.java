import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a marca, o modelo, a quantidade de passageiros, a capacidade de combustível  e o consumo de combustível: ");

        Carro van = new Carro();
        van.marca = scan.next();
        van.modelo = scan.next();
        van.numPassageiros = scan.nextInt();
        van.capacCombustivel = scan.nextDouble();
        van.consumoCombustivel = scan.nextDouble();

        System.out.println(van);
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capacCombustivel);
        System.out.println(van.consumoCombustivel);
    }
}
