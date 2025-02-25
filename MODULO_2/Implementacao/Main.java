import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	 public static void main(String[] args){
		//Criando instâncias
		Autor autor = new Autor();
		autor.setNome("J.R.R Tolkien");
		autor.setNacionalidade("Britanico");

		Livro livro = new Livro("O Hobbit", autor, "Fantasia", true);

		Usuario user = new Usuario();
		user.setNome("Diego");
		user.setIdade(17);

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmprestimo = LocalDate.parse("24/02/2025", formato);
		LocalDate dataDevolucao = LocalDate.parse("02/03/2025", formato);
		Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, livro, user);

		//Processamento
		System.out.println("--- Dados do livro ---");
		livro.exibirDetalhes();
		System.out.println("--- Usuário ---");
		System.out.println(user);
                System.out.println("--- Detalhes do empréstimo ---");
		System.out.println("Livro: " + livro.getTitulo());
                System.out.println("Autor: " + autor.getNome());
                System.out.println("Data retirada: " + emprestimo.getDataRetirada());
                System.out.println("Data devolução: " + emprestimo.getDataDevolucao());
		livro.alterarDisponivel();
                System.out.println("--- Dados do livro ---");
                livro.exibirDetalhes();
	}
}
