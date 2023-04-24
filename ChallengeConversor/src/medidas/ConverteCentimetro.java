package medidas;

import javax.swing.JOptionPane;

public class ConverteCentimetro {

	public double CentimetroParaMilimetro(double valorOk) {
		double centimetroParaMilimetro = valorOk * 10;
		centimetroParaMilimetro = (double) Math.round(centimetroParaMilimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Centímetros são " + centimetroParaMilimetro + " Milímetros ");
        return centimetroParaMilimetro;
		
	}

	public double CentimetroParaMetro(double valorOk) {
		double centimetroParaMetro = valorOk / 100;
		centimetroParaMetro = (double) Math.round(centimetroParaMetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Centímetros são " + centimetroParaMetro + " Metros ");
        return centimetroParaMetro;
		
	}

	public double CentimetroParaPolegada(double valorOk) {
		double centimetroParaPolegada = valorOk / 2.54;
		centimetroParaPolegada = (double) Math.round(centimetroParaPolegada * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Centímetros são " + centimetroParaPolegada + " Polegadas ");
        return centimetroParaPolegada;
		
	}

	public double CentimetroParaPes(double valorOk) {
		double centimetroParaPes = valorOk / 30.48;
		centimetroParaPes = (double) Math.round(centimetroParaPes * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorOk + " Centímetros são " + centimetroParaPes + " Pés ");
        return centimetroParaPes;
	}

}
