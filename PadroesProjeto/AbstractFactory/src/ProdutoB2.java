
public class ProdutoB2 implements ProdutoAbstratoB{

	@Override
	public void interagir(ProdutoAbstratoA a) {
		System.out.println(this.getClass() + " interage com " + a.getClass());
	}

}
