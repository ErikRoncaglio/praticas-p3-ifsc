package visao;

import controle.ProdutoDAO;
import modelo.Produto;

public class MainProduto {
	public static void main(String[] args) {
		
		Produto P = new Produto();
		
		P.setNome("Prego");
		P.setCodBarras(4244l);
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.Inserir(P);
		System.out.println(P.getNome());
		System.out.println("\n");
		dao.Alterar(P);
		System.out.println(P.getNome());
		dao.Excluir(P);
		dao.Lista();
		
		System.out.println(dao.Lista().size());
	
	
	}
	
	
	
}