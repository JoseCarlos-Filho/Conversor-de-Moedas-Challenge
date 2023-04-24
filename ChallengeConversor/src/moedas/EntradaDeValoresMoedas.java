package moedas;

import javax.swing.JOptionPane;

import application.Program;
import util.VerificaInput;

public class EntradaDeValoresMoedas {

	public void InputValor() {

		MenuConversaoDeMoedas mcm = new MenuConversaoDeMoedas();
		VerificaInput verificaInput = new VerificaInput();

		String input = JOptionPane.showInputDialog("Digite um valor: ");

		if (verificaInput.verifica(input)) {
			double valorOk = Double.parseDouble(input);
			mcm.selecionaTipoDeConversao(valorOk);
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
