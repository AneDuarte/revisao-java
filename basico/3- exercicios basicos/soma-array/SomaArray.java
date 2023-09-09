public class SomaArray {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int contador = 0;

        /*vetor[0] = 5;
        vetor[1] = 12;
        vetor[2] = 4;
        vetor[3] = 7;
        vetor[4] = 15;*/

        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 5 == 0) {
                contador += vetor[i];
            }
        }
        System.out.println("A soma dos múltiplos de 5 é " + contador);
    }
}
