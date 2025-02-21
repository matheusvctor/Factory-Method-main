package Sanduiches;

import Interfaces.*;
import ProdutoConcreto.*;
import SanduicheFactory.SanduicheFactory;

public class SanduicheClassico extends SanduicheFactory{
	
	@Override
	public Pao criarPao() {
		return new PaoFrances();
	}
	
	@Override
	public Queijo criarQueijo() {
		return new QueijoMussarela();
	}
	
	@Override
	public Presunto criarPresunto() {
		return new PresuntoPeru();
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
		return "Sanduiche de Presunto";
	}
}
