package lampada;

public class Teste {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.setMarca("Boa Luz");
        lampada.setVoltagem(220);
        lampada.setStatus(true);

        System.out.println("Marca: " + lampada.getMarca());
        System.out.println("Voltagem: " + lampada.getVoltagem());
        System.out.println("Status: " + lampada.estaLigada(lampada.getStatus()));
    }
}
