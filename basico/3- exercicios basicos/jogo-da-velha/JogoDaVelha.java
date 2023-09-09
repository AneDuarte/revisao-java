import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] matriz = new char[3][3];
        Scanner scan = new Scanner(System.in);
        int linha, coluna;
        int posicao = 0;

        System.out.println("=/=/=/ JOGO DA VELHA =/=/=/");
        /*System.out.println("Considere as posições:");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println();*/

        System.out.println("X começa");
        for (var i = 1; i < 10; i++) {
            System.out.println("Digite a posição: ");
            linha = scan.nextInt();
            coluna = scan.nextInt();

            if (i % 2 == 0) matriz[linha][coluna] = 'O';
            else matriz[linha][coluna] = 'X';

            System.out.println("Jogo atual:");
            System.out.println(String.format(" %c | %c | %c ",matriz[0][0], matriz[0][1], matriz[0][2]));
            System.out.println("-----------");
            System.out.println(String.format(" %c | %c | %c ", matriz[1][0], matriz[1][1], matriz[1][2]));
            System.out.println("-----------");
            System.out.println(String.format(" %c | %c | %c ", matriz[2][0], matriz[2][1], matriz[2][2]));
        }

    }
}
