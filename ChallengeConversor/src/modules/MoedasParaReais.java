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

	public void converteLibrasParaReais(double inputValor) {
		double moedaLibra = inputValor * 6.33;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Reais");
	}

	public void convertePesoArgentinoParaReais(double inputValor) {
		double moedaPesoArgentino = inputValor * 0.039;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoArgentino + " Reais");
	}

	public void convertePesoChilenoParaReais(double inputValor) {
		 double moedaPesoChileno = inputValor * 0.0040;
	        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
	        JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoChileno + " Reais");
	}

}
