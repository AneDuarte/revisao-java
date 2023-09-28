import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato contato = new Contato();
        Contato[] contatos = new Contato[3];

        System.out.println("Digite o nome da agenda: ");
        agenda.setNome(scan.nextLine());

        System.out.println("Insira 3 contatos na agenda.");
        for(int i  = 0; i < 3; i++) {
            System.out.println("Nome, telefone e email (nessa ordem)");
            contato.setNome(scan.next());
            contato.setTelefone(scan.next());
            contato.setEmail(scan.next());

            contatos[i] = contato;
        }
        agenda.setContatos(contatos);

        System.out.println("Nome da agenda: "+agenda.getNome());
        System.out.println("Digite o contato que deseja visualizar (1, 2 ou 3): ");
        int i = scan.nextInt();
        agenda.infosContato(i);
        System.out.println("/-/-/-/-/-/-/-/-/-");
        System.out.println("Todos os contatos: ");
        agenda.todosContatos();
    }
}
