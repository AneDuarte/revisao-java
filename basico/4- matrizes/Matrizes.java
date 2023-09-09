import java.util.Random;

public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random rand = new Random();
        int maior = 0;
        int[] posicao = new int[2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("MATRIZ:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    posicao[0] = i;
                    posicao[1] = j;
                }
            }
            System.out.println("");
        }
        System.out.println(String.format("O maior valor da matriz é %d e está/aparece primeiro na posição [%d][%d]", maior, posicao[0], posicao[1]));
    }
}
