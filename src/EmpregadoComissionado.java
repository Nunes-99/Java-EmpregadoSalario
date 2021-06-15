
public class EmpregadoComissionado extends Empregado
{
	double vendas;
	double comissao;

	public EmpregadoComissionado(String n, String s, String d, double v, double c) 
	{
		super(n, s, d);
		setEmpregadoComissionado(v, c);
	}

	public void setEmpregadoComissionado(double v, double c) 
	{
		vendas = v;
		comissao = c;
	}
	
	public double salario()
	{
		return vendas*comissao;
	}
	
	public String toString()
	{
		return String.format("%s\nTotal em vendas: %.2f \nComissao: %.2f", super.toString(), vendas, comissao);
	}

}
