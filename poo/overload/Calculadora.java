public class Calculadora {
    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, int num2) {
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int soma(int[] listaNumeros) {
        int total = 0;

        for(var i = 0; i < listaNumeros.length; i++) {
            total += listaNumeros[i];
        }

        return total;
    }
}
