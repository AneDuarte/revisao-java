public class Fatorial {
    //Função/Método Recursivo
    //-Chama ele mesmo
    //-Precisa de um ponto de parada
    public static int fatorial(int num) {
        if (num == 0) return 1;

        return num * fatorial(num-1);
    }
}
