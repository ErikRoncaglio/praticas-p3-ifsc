package ifsc;

public class MainAnimal {
	public static void main(String[] args) {
		
		Cachorro A = new Cachorro ();
		
		A.setNome("Niki");
		A.setRaca("Beagle");
		A.setComprimento(0.33f);
		A.setNumpatas(4);
		A.setCor("Branco e marrom");
		A.setEco("Casa");
		
		GAto B = new GAto ();
		B.setNome("Pipoca");
		B.setRaca("PErsa");
		B.setComprimento(0.28f);
		B.setNumpatas(4);
		B.setCor("Branco e PReto");
		B.setEco("Casa");
		       
		
		System.out.println(A.getNome());	
		System.out.println(A.getRaca());
		System.out.println(A.getComprimento());
		System.out.println(A.getNumpatas());
		System.out.println(A.getCor());
		System.out.println(A.getEco());
		A.late();
		System.out.println("\n");
		
		System.out.println(B.getNome());	
		System.out.println(B.getRaca());
		System.out.println(B.getComprimento());
		System.out.println(B.getNumpatas());
		System.out.println(B.getCor());
		System.out.println(B.getEco());
		B.Mia();
		System.out.println("\n");
		
		
	}
}
