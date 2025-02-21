package SanduicheFactory;

import Interfaces.Ovo;
import Interfaces.Pao;
import Interfaces.Presunto;
import Interfaces.Queijo;
import Interfaces.TomateIF;

public abstract class SanduicheFactory {
	
	protected String nome;
	
    protected Pao pao;
    protected Queijo queijo;
    protected Presunto presunto;
    protected Ovo ovo;
    protected TomateIF tomate;

    protected abstract Pao criarPao();
    protected abstract Queijo criarQueijo();
    protected abstract Presunto criarPresunto();
    protected abstract Ovo criarOvo();
    protected abstract TomateIF criarTomate();
    protected abstract String getNome();
	
	public String montaSanduiche() {
		Pao pao = criarPao();
		Queijo queijo = criarQueijo();
		TomateIF tomate = criarTomate();
		Presunto presunto = criarPresunto();
		Ovo ovo = criarOvo();
		
	    return String.format(
	    		"====== %s ======\n" +
	            "Ingredientes:\n" +
	            "Pão - %s\n" +
	            "Queijo - %s\n" +
	            "Tomate - %s\n" +
	            "Presunto - %s\n" +
	            "Ovo - %s\n",
	            getNome(),
	            pao.getTipo(),
	            queijo.getTipo(),
	            tomate.getTipo(),
	            presunto.getTipo(),
	            ovo.getTipo()
	        );
	}
}
