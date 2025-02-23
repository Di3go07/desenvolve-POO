public class Livro {
	private String titulo;
	private String autor;
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(Autor autor) {
	  this.autor = autor.getNome();
	}
}
