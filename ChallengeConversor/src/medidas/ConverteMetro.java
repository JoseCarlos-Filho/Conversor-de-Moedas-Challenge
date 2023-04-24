package medidas;

import javax.swing.JOptionPane;

public class ConverteMetro {

	public double MetroParaMilimetro(double valorOk) {
		double metroParaMilimetro = valorOk * 1000;
		metroParaMilimetro = (double) Math.round(metroParaMilimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Metros são " + metroParaMilimetro + " Milímetros ");
        return metroParaMilimetro;
		
	}
	
	public double MetroParaCentimetro(double valorOk) {
		double metroParaCentimetro = valorOk * 100;
		metroParaCentimetro = (double) Math.round(metroParaCentimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Metros são " + metroParaCentimetro + " Centímetros ");
        return metroParaCentimetro;
		
	}
	
	public double MetroParaPolegada(double valorOk) {
		double metroParaPolegada = valorOk * 39.37;
		metroParaPolegada = (double) Math.round(metroParaPolegada * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Metros são " + metroParaPolegada + " Polegadas ");
        return metroParaPolegada;
		
	}
	
	public double MetroParaPes(double valorOk) {
		double metroParaPes = valorOk * 3.281;
		metroParaPes = (double) Math.round(metroParaPes * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Metros são " + metroParaPes + " Pés ");
        return metroParaPes;
		
	}

}
