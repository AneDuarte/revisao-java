import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a marca, o modelo, a quantidade de passageiros, a capacidade de combustível  e o consumo de combustível: ");

        Carro van = new Carro();
        van.marca = scan.next();
        van.modelo = scan.next();
        van.numPassageiros = scan.nextInt();
        van.capacidadeCombustivel = scan.nextDouble();
        van.consumoCombustivel = scan.nextDouble();

        van.exibirAutonomia();
    }
}
