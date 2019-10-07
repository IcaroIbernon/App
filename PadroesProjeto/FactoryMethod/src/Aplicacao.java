
public abstract class Aplicacao {

	protected Documento doc;

    /**
    * Abstração do Factory Method
    */
    abstract Documento criaDocumento();

    void novoDocumento() {
        this.doc = this.criaDocumento();
    }

    void abrirDocumento() {
        this.doc.abrir();
    }
	
}
