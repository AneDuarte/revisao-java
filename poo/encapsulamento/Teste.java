public class Teste {
    public static void main(String[] args) {
        /*Encapsulamento é o conceito de não expor diretamente
        os atributos para manipulação dos dados.
        Deixar todos como private e utilizar getters e setters */
        Carro van = new Carro();

        van.setMarca("Fiat Blablabla");
        System.out.println(van.getMarca());
    }
}
