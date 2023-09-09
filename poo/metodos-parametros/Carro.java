public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + calcularAutonomia());
    }

    double calcularAutonomia() {
        double autonomia = capacidadeCombustivel * consumoCombustivel;
        return autonomia;
    }

    double calcularCombustivel(double km) {
        return km/consumoCombustivel;
    }
}
