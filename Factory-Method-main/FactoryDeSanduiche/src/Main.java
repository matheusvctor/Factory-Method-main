import SanduicheFactory.SanduicheFactory;
import Sanduiches.*;

public class Main {
	public static void main(String args[]) {
		SanduicheFactory sanduiche1 = new SanduicheClassico();
		SanduicheFactory sanduiche2 = new SanduicheFrangoIntegral();
		SanduicheFactory sanduiche3 = new SanduichePeruCapoeira();
		
		System.out.println(sanduiche1.montaSanduiche());
		System.out.println(sanduiche2.montaSanduiche());
		System.out.println(sanduiche3.montaSanduiche());
	}
}
