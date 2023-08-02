public class Pessoa {

	// Atributos
  private String nome = "Bruno";
	private int dataNasc = 21021997;
	private int idade = 26;

	// Metodos construtores

	// Getter e Setter para nome
	public String getNome()
	{
		return nome;
}
	public void setNome(String n)
	{
    this.nome = n;
}

	// Getter e Setter para data de nascimento
	public int getDataNasc() 
	{
		return dataNasc;
}
	public void setNome(int dn)
	{
    this.dataNasc = dn;
	}

	// Getter e Setter para idade
	public int getIdade()
	{
		return idade;
}
	public void setIdade(int i)
	{
    this.idade = i;
}
	}