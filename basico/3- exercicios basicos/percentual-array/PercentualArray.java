public class PercentualArray {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int pares = 0;
        int impares = 0;
        double percPar, percImpar;

        vetor[0]=1;
        vetor[1]=1;
        vetor[2]=3;
        vetor[3]=4;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                if(vetor[i] % 2 == 0) pares++;
                else impares++;
            }
        }

        percPar = pares*100/(pares+impares);
        percImpar = impares*100/(pares+impares);

        System.out.println("Percentual dos Valores");
        System.out.println("Pares: " + percPar + "%");
        System.out.println("Ímpares: " + percImpar + "%");
    }
}
