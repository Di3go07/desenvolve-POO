import java.util.Arrays;

public class Main {
	  public static void main(String[] args) {
      Autor autor = new Autor();
      autor.setNome("J.R.R Tolkien");
      autor.setLivros(new String[] {"O Hobbit", "Senhor dos Anéis", "Silmarilion"} );
      
      Livro livro = new Livro();
      livro.setTitulo("Senhor dos Anéis");
		  livro.setAutor(autor);
      
      System.out.println("Livro: " + livro.getTitulo());
      System.out.println("Autor: " + autor.getNome());
    	System.out.println("Outros livros: " +  String.join(", ", autor.getLivros(livro.getTitulo())));
	  }
}
