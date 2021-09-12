import java.util.Scanner;

public class CoverteDolarReal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double cotDolar, valDolar, valReal;
		
		System.out.print("Conversor de dólar em real. \n\n");
		
		System.out.print("Digite a cotação do dólar: ");
		cotDolar = entrada.nextDouble();
		
		System.out.print("Digite o valor em dolares: ");
		valDolar = entrada.nextDouble();
		
		valReal = cotDolar*valDolar;
		
		System.out.println("O valor em reais é: "+valReal+"\n");
		
		entrada.close();

	}

}
