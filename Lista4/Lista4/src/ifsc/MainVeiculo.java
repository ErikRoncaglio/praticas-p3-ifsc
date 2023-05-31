package ifsc;

public class MainVeiculo {

	public static void main(String[] args) {
	
		Carro c = new Carro();
		
		c.setNome("Opala Diplomata");
		c.setAno(1992);
		c.setCor("Branco");
		System.out.println(" nome = " + c.getNome() + "\n ano = " + c.getAno() + "\n cor = " + c.getCor());
	}
}
           