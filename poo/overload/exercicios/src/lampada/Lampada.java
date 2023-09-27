package lampada;

public class Lampada {
    private boolean status;
    private int voltagem;
    private String marca;

    public Lampada() {
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String estaLigada(boolean status) {
        if (status) return "Lâmpada está ligada!";
        return "Lâmpada está desligada!";
    }
}
