public class Calculadora {

    public static int soma(int priParcela, int segParcela) {
        return priParcela + segParcela;
    }

    public static int subtracao(int minuendo, int subtraendo) {
        return minuendo - subtraendo;
    }

    public static int multiplicacao(int multiplicando, int multiplicador) {
        return multiplicando * multiplicador;
    }

    public static double divisao(int dividendo, int divisor) {
        return dividendo / divisor;
    }

    public static double elevacao(int base, int expoente) {
        return Math.pow(base, expoente);
    }

}
