
public abstract class Empregado 
{
	private String nome;
	private String sobrenome;
	private String documento;
	
	public Empregado (String n, String s, String d)
	{
		setEmpregado(n, s, d);
	}
	
	public void setEmpregado(String n, String s, String d)
	{
		nome = n;
		sobrenome = s;
		documento = d;
	}
	
	public String toString()
	{
		return String.format("Nome: %s \nSobrenome: %s \nDocumento: %s", nome, sobrenome, documento);
	}
	
	public abstract double salario();

}
