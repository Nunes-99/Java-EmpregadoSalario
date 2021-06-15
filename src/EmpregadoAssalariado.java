
public class EmpregadoAssalariado extends Empregado
{
	private double salarioSemanal;
	
	public EmpregadoAssalariado(String n, String s, String d, double ss) 
	{
		super(n, s, d);
		setSalarioSemanal(ss);
	}

	private void setSalarioSemanal(double ss) 
	{
		salarioSemanal = ss;
	}
	
	public double salario()
	{
		return salarioSemanal;
	}
	
	public String toString()
	{
		return String.format("%s\nSalario Semanal: %s", super.toString(),salarioSemanal);
	}
	
	

}
