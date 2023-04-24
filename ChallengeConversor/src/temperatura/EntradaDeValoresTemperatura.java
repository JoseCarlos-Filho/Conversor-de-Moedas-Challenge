package temperatura;

import javax.swing.JOptionPane;

import application.Program;
import util.VerificaInput;

public class EntradaDeValoresTemperatura {
	public void InputValor() {

		MenuConversaoDeTemperatura mcTemperatura = new MenuConversaoDeTemperatura();
		VerificaInput verificaInput = new VerificaInput();

		String input = JOptionPane.showInputDialog("Digite um valor: ");

		if (verificaInput.verifica(input)) {
			double valorOk = Double.parseDouble(input);
			mcTemperatura.selecionaTipoDeConversao(valorOk);
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
