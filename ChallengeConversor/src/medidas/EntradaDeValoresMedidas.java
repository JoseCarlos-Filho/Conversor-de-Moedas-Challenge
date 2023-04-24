package medidas;

import javax.swing.JOptionPane;

import application.Program;
import util.VerificaInput;

public class EntradaDeValoresMedidas {

	public void InputValor() {

		MenuConversaoDeMedidas mcMedidas = new MenuConversaoDeMedidas();
		VerificaInput verificaInput = new VerificaInput();

		String input = JOptionPane.showInputDialog("Digite um valor: ");

		if (verificaInput.verifica(input)) {
			double valorOk = Double.parseDouble(input);
			mcMedidas.selecionaTipoDeConversao(valorOk);
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (JOptionPane.OK_OPTION == resposta) {
				System.out.println("Escolha opção Afirmativa");
				Program.main(null);
			} else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}

	}
}
