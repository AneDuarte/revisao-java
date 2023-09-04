import java.util.*;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<Integer>();
        int resposta;

        System.out.println("Digite alguns números inteiros. Quando desejar parar digite 0.");
        do {
            resposta = scan.nextInt();
            listaNumeros.add(resposta);
        }
        while(resposta != 0);

        Collections.sort(listaNumeros);
        System.out.println("O menor número é " + listaNumeros.get(1));
        System.out.println("O maior número é " + listaNumeros.get(listaNumeros.size() - 1));
    }
}
