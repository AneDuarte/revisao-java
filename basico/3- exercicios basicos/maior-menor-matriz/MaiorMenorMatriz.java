import java.util.Random;
import java.util.Scanner;

public class MaiorMenorMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int linha;
        int maiorLinha = 0;
        int menorLinha = 0;

        System.out.println("Escolha uma linha");
        linha = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("MATRIZ:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
                if (i == linha-1 && j == 0) menorLinha = matriz[i][j];
                if (i == linha-1 && matriz[i][j] > maiorLinha) maiorLinha = matriz[i][j];
                if (i == linha-1 && matriz[i][j] < menorLinha) menorLinha = matriz[i][j];
            }
            System.out.println("");
        }

        System.out.println(String.format("O maior número nessa linha é %d e o menor é %d", maiorLinha, menorLinha));
    }
}
