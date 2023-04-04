package modules;

import javax.swing.JOptionPane;

public class ConverteMoedas {

	public void converteReaisParaDolar(double inputValor) {
		double dolar = inputValor / 5.13;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + dolar + " Dólares");

	}

}
