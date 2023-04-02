package modules;

import javax.swing.JOptionPane;

public class MenuConversaoDeMoedas extends MenuPrincipal {

	EntradaDeValores edv = new EntradaDeValores();
	 
	public void TelaInicial(Object[] valores, String inicial) {
		super.TelaInicial(valores, inicial);
		
		for (Object valor : valores) {
			if(valor == "real para dolar") {
				edv.InputValor();
			}
		}
		
	}

	
	
}
