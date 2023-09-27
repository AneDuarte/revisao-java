public class Teste {
    public static void main(String[] args) {
        /*Sobrecarga é a possibilidade de declarar vários métodos ou construtores
        com mesmo nome mas com assinaturas diferentes*/
        Calculadora calc = new Calculadora();
        int[] vetorTeste = new int[]{1,2,3,4,5};

        System.out.println("Método soma 1: " + calc.soma(1, 3)); //4
        System.out.println("Método soma 2: " + calc.soma(2.5, 4)); //6.5
        System.out.println("Método soma 3: " + calc.soma(1, 1, 1)); //3
        System.out.println("Método soma 4: " + calc.soma(vetorTeste)); //15
    }
}
