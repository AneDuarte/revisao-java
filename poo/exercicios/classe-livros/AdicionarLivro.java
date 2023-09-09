import java.util.Scanner;

public class AdicionarLivro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("CADASTRAR NOVO LIVRO");
        System.out.println("Digite o título, autor, genero, editora, isbn, ano de publicacao e quantidade de páginas: ");

        Livro novoLivro = new Livro();
        novoLivro.titulo = scan.next();
        novoLivro.autor = scan.next();
        novoLivro.genero = scan.next();
        novoLivro.editora = scan.next();
        novoLivro.isbn = scan.next();
        novoLivro.anoPublicacao = scan.nextInt();
        novoLivro.paginas = scan.nextInt();

        System.out.println(novoLivro.titulo);
        System.out.println(novoLivro.autor);
        System.out.println(novoLivro.genero);
        System.out.println(novoLivro.editora);
        System.out.println(novoLivro.isbn);
        System.out.println(novoLivro.anoPublicacao);
        System.out.println(novoLivro.paginas);
    }
}
