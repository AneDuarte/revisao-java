public class Agenda {
    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void infosContato(int index) {
        String msg = String.format("Nome: %s; Telefone: %s; Email: %s", contatos[index].getNome(), contatos[index].getTelefone(), contatos[index].getEmail());
        System.out.println(msg);
    }

    public void todosContatos() {
        String text = "";
        for (Contato c : contatos) {
            text += c.infosContato() + "\n";
        }
        System.out.println(text);
    }
}
