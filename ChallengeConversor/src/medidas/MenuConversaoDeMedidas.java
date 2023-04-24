package medidas;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MenuConversaoDeMedidas {

	private Object[] valores = { "De Milimetros para Centimetros", "De Milimetros para Metros",
			"De Milimetros para Polegadas", "De Milimetros para Pés", "De Centimetros para Milimetros",
			"De Centimetros para Metros", "De Centimetros para Polegadas", "De Centimetros para Pés",
			"De Metros para Milimetros", "De Metros para Centimetros", "De Metros para Polegadas", "De Metros para Pés",
			"De Polegadas para Milimetros", "De Polegadas para Centimetros", "De Polegadas para Metros",
			"De Polegadas para Pés", "De Pés para Milimetro", "De Pés para Centimetro", "De Pés para Metros",
			"De Pés para Polegadas" };
	private String inicial = "real para dolar";

	ConverteMilimetro mm = new ConverteMilimetro();
	ConverteCentimetro cm = new ConverteCentimetro();
	ConverteMetro m = new ConverteMetro();
	ConvertePolegada pl = new ConvertePolegada();
	ConvertePes pes = new ConvertePes();

	public void selecionaTipoDeConversao(double valorOk) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		String selection = (String) JOptionPane.showInputDialog(null, "Selecione uma opção", "Conversores",
				JOptionPane.QUESTION_MESSAGE, null, valores, inicial);
		System.out.println(selection);

		switch (selection) {
			//MILIMETRO
		case "De Milimetros para Centimetros":
			mm.MilimetroParaCentimetro(valorOk);
			break;
		case "De Milimetros para Metros":
			mm.MilimetroParaMetro(valorOk);
			break;
		case "De Milimetros para Polegadas":
			mm.MilimetroParaPolegada(valorOk);
			break;
		case "De Milimetros para Pés":
			mm.MilimetroParaPes(valorOk);
			break;
			//CENTIMETRO
		case "De Centimetros para Milimetros":
			cm.CentimetroParaMilimetro(valorOk);
			break;
		case "De Centimetros para Metros":
			cm.CentimetroParaMetro(valorOk);
			break;
		case "De Centimetros para Polegadas":
			cm.CentimetroParaPolegada(valorOk);
			break;
		case "De Centimetros para Pés":
			cm.CentimetroParaPes(valorOk);
			break;
			//METRO
		case "De Metros para Milimetros":
			m.MetroParaMilimetro(valorOk);
			break;
		case "De Metros para Centimetros":
			m.MetroParaCentimetro(valorOk);
			break;
		case "De Metros para Polegadas":
			m.MetroParaPolegada(valorOk);
			break;
		case "De Metros para Pés":
			m.MetroParaPes(valorOk);
			break;
			//POLEGADA
		case "De Polegadas para Milimetros":
			pl.PolegadaParaMilimetro(valorOk);
			break;
		case "De Polegadas para Centimetros":
			pl.PolegadaParaCentimetro(valorOk);
			break;
		case "De Polegadas para Metros":
			pl.PolegadaParaMetro(valorOk);
			break;
		case "De Polegadas para Pés":
			pl.PolegadaParaPes(valorOk);
			break;
			//PES
		case "De Pés para Milimetro":
			pes.PesParaMilimetro(valorOk);
			break;
		case "De Pés para Centimetro":
			pes.PesParaCentimetro(valorOk);
			break;
		case "De Pés para Metros":
			pes.PesParaMetro(valorOk);
			break;
		case "De Pés para Polegadas":
			pes.PesParaPolegada(valorOk);
			break;
		}

	}
}
