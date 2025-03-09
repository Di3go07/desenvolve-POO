public class Livro {
	private String titulo;
	private Autor autor;
	private String genero;
	private boolean disponivel;

  public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        	this.titulo = titulo;
        	this.autor = autor;
        	this.genero = genero;
		      this.disponivel = disponivel;
  }	

	public String getTitulo(){
		return this.titulo;
	}
	public Autor getAutor(){
		return this.autor;
	}
  public String getGenero(){
    return this.genero;
  }
  public String isDisponivel(){
    if (this.disponivel) {
      return "Disponível para empréstimo";
	  }else{
	    return "Emprestado";
	  }
	}
	public void alterarDisponivel(){
		this.disponivel = !this.disponivel;
	}
	public void exibirDetalhes(){
	  System.out.println("Livro: " + this.getTitulo());
    System.out.println("Autor: " + autor.getNome());
    System.out.println("Genero: " + this.getGenero());
    System.out.println("Status: " + this.isDisponivel());

	}
}
