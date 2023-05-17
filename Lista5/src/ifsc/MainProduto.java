package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<>();

		Produto n = new Produto();
		n.setNome("prego");
		n.setCodBarras(123456799989l);
		n.setPreco(0.50);  
		n.setFornecedor("Amazon");
		produtos.add(n);

		Produto p = new Produto();
		p.setNome("tijolo");
		p.setCodBarras(12349989l);
		p.setPreco(1.10);
		p.setFornecedor("Balaroti");
		produtos.add(p);

		Produto f = new Produto();
		f.setNome("MDF");
		f.setCodBarras(123456799l);
		f.setPreco(189.67);
		f.setFornecedor("Leroy Merlin");
		produtos.add(f);

		for (int i = 0; i < produtos.size(); i++) {
			System.out.println(produtos.get(i).getNome());
			System.out.println(produtos.get(i).getCodBarras());
			System.out.println(produtos.get(i).getPreco());
			System.out.println(produtos.get(i).getFornecedor());
			System.out.println("");
		}
	}

}
