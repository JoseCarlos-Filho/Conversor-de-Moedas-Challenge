package modules;

import javax.swing.JOptionPane;

public class MoedasParaReais {
	
	public void converteDolarParaReais(double inputValor) {
		double moedaDolar = inputValor * 5.13;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Reais");
	}

	public void converteEuroParaReais(double inputValor) {
		double moedaEuro = inputValor * 10.85;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Reais");	
	}

}
