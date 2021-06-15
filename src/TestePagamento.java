
public class TestePagamento {

	public static void main(String[] args) 
	{
		EmpregadoAssalariado ea = new EmpregadoAssalariado("Jhon", "Smith", "111111", 800.00);
		
		EmpregadoHorista eh = new EmpregadoHorista("Karen", "Price", "222222", 16.75, 40);
		
		EmpregadoComissionado ec = new EmpregadoComissionado("Sue", "Jones", "333333", 1000.00, 00.06);
		
		EmpregadoComissionadoAssalariado eca = new EmpregadoComissionadoAssalariado("Bob", "Lewis", "4444444444", 5000, 0.04, 300);
		
		System.out.println("Processando Individualmente\n");
		
		System.out.printf("%.2f\n", ea.salario());
		System.out.printf("%.2f\n", eh.salario());
		System.out.printf("%.2f\n", ec.salario());
		System.out.printf("%.2f\n", eca.salario());

		
		Empregado vetor[] = new Empregado [4];
		
		vetor[0] = ea;
		vetor[1] = eh;
		vetor[2] = ec;
		vetor[3] = eca;
		
		System.out.println("\nProcessando polimorficamentezn");
		
		for (Empregado atual:vetor)
		{
			System.out.println(atual);
			System.out.println();
			
			if(atual instanceof EmpregadoComissionadoAssalariado)
			{
				EmpregadoComissionadoAssalariado temp = (EmpregadoComissionadoAssalariado) atual;
				
				temp.setSalarioMensal(temp.getSalarioMensal()*1.1);
				
				System.out.println(temp);
			}
			
			System.out.printf("Salario: %.2f\n", atual.salario());
			System.out.println();
		}
		
		for (int j=0; j<vetor.length; j++)
		{
			System.out.printf("O empregado %d é %s\n", j, vetor[j].getClass().getName());
		}


	}

}
