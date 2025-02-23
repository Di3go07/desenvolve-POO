public class Autor extends User {
  private String[] livros;
  public String[] getLivros() {
		return this.livros;
	}
	public String[] getLivros(String livro) {
		String[] novaLista = new String[livros.length - 1];
		int index = 0;

    for (String l : livros) {
      if (!l.equals(livro)) {
        novaLista[index] = l;
        index++;
        }
      }
    
    this.livros = novaLista;
		return this.livros;
	}
	public void setLivros(String[] livros) {
		this.livros = livros;
	}
}
