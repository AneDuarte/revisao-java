import com.sun.tools.jconsole.JConsoleContext;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Centro");
        endereco.setCidade("Kings Landing");
        endereco.setEstado("East Westeros");

        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("83");
        telefone.setNumero("99999-9999");
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("celular");
        telefone2.setDdd("21");
        telefone2.setNumero("98888-8888");
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        Contato contato = new Contato();
        contato.setNome("Tyrion");
        contato.setEndereco(endereco);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        System.out.println(contato.getTelefones());

        for (Telefone t : contato.getTelefones()) {
            System.out.println(t.getDdd() + " " + t.getNumero());
        }
    }
}
