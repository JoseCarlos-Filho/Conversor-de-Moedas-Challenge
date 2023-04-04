package modules;

import javax.swing.*;

public class MenuPrincipal {


	public void TelaInicial(Object[] selectionValues, String initialSelection) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		Object selection = JOptionPane.showInputDialog(null, "Selecione uma opção", "Conversores",
				JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		System.out.println(selection);
		
		if (selection == "Conversor de Moedas") {
			EntradaDeValores edv = new EntradaDeValores();
			edv.InputValor();
		}
		
	}
	
}
