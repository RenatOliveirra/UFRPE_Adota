package excecao;

public class AnimalNaoCadastradoException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	
	public AnimalNaoCadastradoException(String id){
		super("Animal N�o Existe");
		this.id = id;
	}
	
	public String getId(){
		return id;
	}

}
