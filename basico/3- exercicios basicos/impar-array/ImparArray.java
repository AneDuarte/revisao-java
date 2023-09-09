public class ImparArray {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int contador = 0;
        int soma = 0;

        /*vetor[0] = 1;
        vetor[1] = 5;
        vetor[2] = 7;
        vetor[3] = 2;
        vetor[4] = 4;
        vetor[5] = 2;*/

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                soma += vetor[i];
                contador++;
            }
        }
        double media = soma/contador;
        System.out.println("A média dos valores ímpares é " + media);
    }
}

