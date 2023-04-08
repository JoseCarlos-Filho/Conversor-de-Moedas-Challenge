
package modules;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MenuConversaoDeMoedas extends MenuPrincipal {
	
	private Object[] valores = { "De Reais a Dolar","De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais" };
	private String inicial = "real para dolar";
	
	
	ConverteMoedas cm = new ConverteMoedas();

	public void selecionaTipoDeConversao(double valorOk) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		Object selection = JOptionPane.showInputDialog(null, "Selecione uma opção", "Conversores",
				JOptionPane.QUESTION_MESSAGE, null, valores, inicial);
		System.out.println(selection);
		//teste de branch
		for (Object valor : valores) {
			
			if(valor == "real para dolar") {
				cm.converteReaisParaDolar(valorOk);
			}
		}
		
	}
	
	
}
