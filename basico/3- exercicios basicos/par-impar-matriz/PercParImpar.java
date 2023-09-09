import java.util.Scanner;

public class PercParImpar {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scan = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        System.out.println("Digite valores para formar uma matriz 3x3");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(String.format("Valor da posição [%d][%d]", i, j));
                matriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] % 2 == 0) pares++;
                else impares++;
            }
            System.out.println("");
        }

        System.out.println(String.format("Nessa matriz tem %d números pares e %d números ímpares", pares, impares));
    }
}
