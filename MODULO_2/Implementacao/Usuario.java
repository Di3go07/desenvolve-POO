public class Usuario extends Pessoa{
	private int idade;
	
	public int getIdade(){
		return this.idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public Livro[] getEmprestimos(){
		return this.livros;
	}
	public void setEmprestimos(Livro[] livros) {
		this.livros = livros;
	}
	@Override
  public String toString() {
    return "Nome: " + nome + " / " + "Idade: " + idade + " anos";
  }
}
