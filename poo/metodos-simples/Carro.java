public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        double autonomia = capacidadeCombustivel * consumoCombustivel;
        System.out.println("A autonomia do carro é " + autonomia + "km");
    }
}
