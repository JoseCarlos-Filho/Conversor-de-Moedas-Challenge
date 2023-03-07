package modules;

import javax.swing.*;

public class MenuPrincipal {
	
	static Object[] valores = { "real para dolar", "real para libras", "real para peso argentino" };
	static String inicial = "real para dolar";


	public void TelaInicial(Object[] selectionValues, String initialSelection) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		Object selection = JOptionPane.showInputDialog(null, "Selecione uma opção", "Conversores",
				JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		System.out.println(selection);
		
		if (selection == "Conversor de Moedas") {
			MenuConversaoDeMoedas mcm = new MenuConversaoDeMoedas();
			mcm.TelaInicial(valores, inicial);
		}
		
	}
	
}
