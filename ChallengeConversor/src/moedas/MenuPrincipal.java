
package moedas;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import medidas.EntradaDeValoresMedidas;
import temperatura.EntradaDeValoresTemperatura;

public class MenuPrincipal {


	public void TelaInicial(Object[] selectionValues, String initialSelection) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		Object selection = JOptionPane.showInputDialog(null, "Selecione uma opção", "Conversores",
				JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		System.out.println(selection);
		//teste de branch
		if (selection == "Conversor de Moedas") {
			EntradaDeValoresMoedas edv = new EntradaDeValoresMoedas();
			edv.InputValor();
		} else if (selection == "Conversor de Temperatura") {
			EntradaDeValoresTemperatura edt = new EntradaDeValoresTemperatura();
			edt.InputValor();
		} else if (selection == "Conversor de Medidas") {
			EntradaDeValoresMedidas edm = new EntradaDeValoresMedidas();
			edm.InputValor();
		}
		
	}
	
}
