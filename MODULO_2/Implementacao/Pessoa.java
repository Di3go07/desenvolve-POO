public class Pessoa {
	protected String nome;
	protected Livro[] livros;

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public Livro[] getLivros(){
		return this.livros;
	}
	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
}
