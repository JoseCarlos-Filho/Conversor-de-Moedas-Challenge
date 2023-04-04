
package modules;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MenuConversaoDeMoedas extends MenuPrincipal {
	
	private Object[] valores = { "real para dolar", "real para libras", "real para peso argentino" };
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
