
public class EmpregadoComissionadoAssalariado extends EmpregadoComissionado
{
	double salarioMensal;

	public EmpregadoComissionadoAssalariado(String n, String s, String d, double v, double c, double sm) 
	{
		super(n, s, d, v, c);
		setSalarioMensal(sm);
	}

	public void setSalarioMensal(double sm) 
	{
		salarioMensal = sm;
	}
	
	public double getSalarioMensal()
	{
		return salarioMensal;
	}
	
	public double salario()
	{
		return getSalarioMensal() + super.salario();
	}
	
	public String toString()
	{
		return String.format("%s\nSalario Mensal: %.2f", super.toString(), getSalarioMensal());
	}
	

}
