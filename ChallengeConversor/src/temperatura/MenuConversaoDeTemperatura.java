package temperatura;

import javax.swing.JDialog;
import javax.swing.JOptionPane;



public class MenuConversaoDeTemperatura {
	
	private Object[] valores = { "Graus Celsius para Graus Fahrenheit", "Graus Celsius para Graus Kelvin", "Graus Fahrenheit para Graus Celsius",
			"Graus Kelvin para Graus Celsius", "Graus Kelvin para Graus Fahrenheit"};
	private String inicial = "real para dolar";

	ConverteTemperatura temperatura = new ConverteTemperatura();

	public void selecionaTipoDeConversao(double valorOk) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		String selection = (String) JOptionPane.showInputDialog(null, "Selecione uma opção", "Conversores de Temperatura",
				JOptionPane.QUESTION_MESSAGE, null, valores, inicial);
		System.out.println(selection);

		switch (selection) {
			case "Graus Celsius para Graus Fahrenheit":
				temperatura.CelsiusAFahrenheit(valorOk);
				break;
			case "Graus Celsius para Graus Kelvin":
				temperatura.CelsiusAKelvin(valorOk);
				break;
			case "Graus Fahrenheit para Graus Celsius":
				temperatura.FahrenheitACelsius(valorOk);
				break;
			case "Graus Kelvin para Graus Celsius":
				temperatura.KelvinACelsius(valorOk);
				break;
			case "Graus Kelvin para Graus Fahrenheit":
				temperatura.KelvinAFahrenheit(valorOk);
				break;
		}

	}
}
