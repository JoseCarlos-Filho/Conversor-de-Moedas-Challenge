package medidas;

import javax.swing.JOptionPane;

public class ConverteMilimetro {

	public double MilimetroParaCentimetro(double valorOk) {
		double milimetroParaCentimetro = valorOk / 10;
		milimetroParaCentimetro = (double) Math.round(milimetroParaCentimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Milímetros são " + milimetroParaCentimetro + " Centímetros ");
        return milimetroParaCentimetro;
		
	}

	public double MilimetroParaMetro(double valorOk) {
		double milimetroParaMetro = valorOk / 1000;
		milimetroParaMetro = (double) Math.round(milimetroParaMetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Milímetros são " + milimetroParaMetro + " Metros ");
        return milimetroParaMetro;
		
	}

	public double MilimetroParaPolegada(double valorOk) {
		double milimetroParaPolegada = valorOk / 25.4;
		milimetroParaPolegada = (double) Math.round(milimetroParaPolegada * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Milímetros são " + milimetroParaPolegada + " Polegadas ");
        return milimetroParaPolegada;
	}

	public double MilimetroParaPes(double valorOk) {
		double milimetroParaPes = valorOk / 304.8;
		milimetroParaPes = (double) Math.round(milimetroParaPes * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Milímetros são " + milimetroParaPes + " Pés ");
        return milimetroParaPes;
		
	}

}
