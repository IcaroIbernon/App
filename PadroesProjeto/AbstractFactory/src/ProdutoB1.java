
public class ProdutoB1 implements ProdutoAbstratoB{

	@Override
	public void interagir(ProdutoAbstratoA a) {
		System.out.println(this.getClass() + " interage com " + a.getClass());
	}

}
