package controle;

import java.util.ArrayList;
import modelo.Produto;

public class ProdutoDAO {

	private ArrayList <Produto> Produto;
	
	public ProdutoDAO() {
		Produto = new ArrayList<Produto>();
	}
	public Boolean Inserir(Produto P) {
		Produto.add(P);
		return true;
	}
	public Boolean Alterar(Produto P) {
		for (Produto produto : Produto)
			if (produto.getCodBarras() == P.getCodBarras()) {
				produto.setNome("Prego2");
				return true;
			}
		return false;
		
	}
	public Boolean Excluir(Produto P) {
		for(Produto produto : Produto) {
			if (produto.getCodBarras() == P.getCodBarras()) {
				Produto.remove(produto);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Produto> Lista(){
		return this.Produto;
	}
	
	
}