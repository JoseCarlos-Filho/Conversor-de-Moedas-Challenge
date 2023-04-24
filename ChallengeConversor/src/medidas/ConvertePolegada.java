package medidas;

import javax.swing.JOptionPane;

public class ConvertePolegada {

	public double PolegadaParaMilimetro(double valorOk) {
		double polegadaParaMilimetro = valorOk * 25.4;
		polegadaParaMilimetro = (double) Math.round(polegadaParaMilimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Polegadas são " + polegadaParaMilimetro + " Milímetros ");
        return polegadaParaMilimetro;
		
	}

	public double PolegadaParaCentimetro(double valorOk) {
		double polegadaParaCentimetro = valorOk * 2.54;
		polegadaParaCentimetro = (double) Math.round(polegadaParaCentimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Polegadas são " + polegadaParaCentimetro + " Centímetros ");
        return polegadaParaCentimetro;
		
	}

	public double PolegadaParaMetro(double valorOk) {
		double polegadaParaMetro = valorOk / 39.37;
		polegadaParaMetro = (double) Math.round(polegadaParaMetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Polegadas são " + polegadaParaMetro + " Metros ");
        return polegadaParaMetro;
		
	}

	public double PolegadaParaPes(double valorOk) {
		double polegadaParaPes = valorOk / 12;
		polegadaParaPes = (double) Math.round(polegadaParaPes * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Polegadas são " + polegadaParaPes + " Pés ");
        return polegadaParaPes;
		
	}

}
