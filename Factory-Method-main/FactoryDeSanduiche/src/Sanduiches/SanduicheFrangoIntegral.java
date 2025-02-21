package Sanduiches;

import Interfaces.*;
import ProdutoConcreto.*;
import SanduicheFactory.SanduicheFactory;

public class SanduicheFrangoIntegral extends SanduicheFactory{
	
	@Override
	public Pao criarPao() {
		return new PaoIntegral();
	}
	
	@Override
	public Queijo criarQueijo() {
		return new QueijoPrato();
	}
	
	@Override
	public Presunto criarPresunto() {
		return new PresuntoFrango();
	}

	@Override
	public TomateIF criarTomate() {
		return new Tomate();
	}

	@Override
	public Ovo criarOvo() {
		return new OvoGranja();
	}
	
	public String getNome() {
		return "Sanduiche Frango Integral";
	}
}
