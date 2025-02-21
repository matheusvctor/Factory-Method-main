package Sanduiches;

import Interfaces.*;
import ProdutoConcreto.*;
import SanduicheFactory.SanduicheFactory;

public class SanduichePeruCapoeira extends SanduicheFactory{
    @Override
    public Pao criarPao() {
        return new PaoBola();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoPeru();
    }

    @Override
    public Tomate criarTomate() {
        return new Tomate();
    }
    
    @Override
    public Ovo criarOvo() {
        return new OvoCapoeira();
    }
    
	public String getNome() {
		return "Sanduiche Peru Capoeira";
	}
}
