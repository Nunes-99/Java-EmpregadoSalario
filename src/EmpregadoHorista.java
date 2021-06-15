
public class EmpregadoHorista extends Empregado
{

	double valor;
	double horas;
	
	public EmpregadoHorista(String n, String s, String d, double v, double h) 
	{
		super(n, s, d);
		setEmpregadoHorista(v,h);
	}

	private void setEmpregadoHorista(double v, double h) 
	{
		valor = v;
		horas = h;
	}
	
	public double salario() 
	{
		if (horas<=40)
			return valor*horas;
		else
			return 40*valor+(horas-40)*valor*1.5;
	}
	
	public String toString()
	{
		return String.format("%s\nHoras Trabalhadas: %.2f \nValor por hora: %.2f", super.toString(), horas, valor);
	}
	
}
