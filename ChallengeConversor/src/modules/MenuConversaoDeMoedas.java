
package modules;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MenuConversaoDeMoedas extends MenuPrincipal {

	private Object[] valores = { "De Reais a Dolar", "De Reais a Euros", "De Reais a Libras",
			"De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais",
			"De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais" };
	private String inicial = "real para dolar";

	ConverteMoedas converteMoedas = new ConverteMoedas();
	MoedasParaReais converteReais = new MoedasParaReais();

	public void selecionaTipoDeConversao(double valorOk) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		String selection = (String) JOptionPane.showInputDialog(null, "Selecione uma opção", "Conversores",
				JOptionPane.QUESTION_MESSAGE, null, valores, inicial);
		System.out.println(selection);

		switch (selection) {
			case "De Reais a Dolar":
				converteMoedas.converteReaisParaDolar(valorOk);
				break;
			case "De Reais a Euros":
				converteMoedas.converteReaisParaEuro(valorOk);
				break;
			case "De Reais a Libras":
				converteMoedas.converteReaisParaLibras(valorOk);
				break;
			case "De Reais a Peso Argentino":
				converteMoedas.converteReaisParaPesosArgentinos(valorOk);
				break;
			case "De Reais a Peso Chileno":
				converteMoedas.converteReaisParaPesosChilenos(valorOk);
				break;
			case "De Dólares a Reais":
				converteReais.converteDolarParaReais(valorOk);
				break;
			case "De Euros a Reais":
				converteReais.converteEuroParaReais(valorOk);
				break;
		}

	}

}
