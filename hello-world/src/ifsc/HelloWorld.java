package ifsc;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitura = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = leitura.nextLine();
		System.out.println("Idade:");
		String idadeStr = leitura.nextLine();
		Double idade = Double.valueOf(idadeStr);
		System.out.println(nome + " tem " + idade);

	}

}
