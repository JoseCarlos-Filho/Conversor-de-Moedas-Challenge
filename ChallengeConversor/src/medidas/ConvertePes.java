package medidas;

import javax.swing.JOptionPane;

public class ConvertePes {

	public double PesParaMilimetro(double valorOk) {
		double pesParaMilimetro = valorOk * 304.8;
		pesParaMilimetro = (double) Math.round(pesParaMilimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Pés são " + pesParaMilimetro + " Milímetros ");
        return pesParaMilimetro;
		
	}
	
	public double PesParaCentimetro(double valorOk) {
		double pesParaCentimetro = valorOk * 30.48;
		pesParaCentimetro = (double) Math.round(pesParaCentimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Pés são " + pesParaCentimetro + " Centímetros ");
        return pesParaCentimetro;
		
	}
	
	public double PesParaMetro(double valorOk) {
		double pesParaMetro = valorOk / 3.281;
		pesParaMetro = (double) Math.round(pesParaMetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Pés são " + pesParaMetro + " Metros ");
        return pesParaMetro;
		
	}
	
	public double PesParaPolegada(double valorOk) {
		double pesParaPolegada = valorOk * 12;
		pesParaPolegada = (double) Math.round(pesParaPolegada * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Pés são " + pesParaPolegada + " Polegadas ");
        return pesParaPolegada;
		
	}

}
