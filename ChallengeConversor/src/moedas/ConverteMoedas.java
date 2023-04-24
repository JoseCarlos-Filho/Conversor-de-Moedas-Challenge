package moedas;

import javax.swing.JOptionPane;

public class ConverteMoedas {
	//teste de branch
	public void converteReaisParaDolar(double inputValor) {
		double dolar = inputValor / 5.13;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + dolar + " Dólares");

	}

	public void converteReaisParaEuro(double inputValor) {
		double moedaEuro = inputValor / 10.85;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Euros");
	}

	public void converteReaisParaLibras(double inputValor) {
		double moedaLibra = inputValor / 6.33;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Libras Esterlinas");
	}
	
	public void converteReaisParaPesosArgentinos(double inputValor) {
		double moedaPesoArgentino = inputValor / 0.039;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + "Pesos Argentinos");
	}

	public void converteReaisParaPesosChilenos(double inputValor) {
		double moedaPesoChileno = inputValor / 0.0040;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Pesos Chilenos");
	}

}
