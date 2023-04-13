package modules;

import javax.swing.JOptionPane;

import application.Program;

public class EntradaDeValores extends MenuPrincipal  {

	public void InputValor() {
		
		MenuConversaoDeMoedas mcm = new MenuConversaoDeMoedas();

		String input = JOptionPane.showInputDialog("Digite um valor: ");

		if (verifica(input)) {
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

	private boolean verifica(String input) {
		double valor = Double.parseDouble(input);
		if (valor >= 0 || valor < 0) {
			return true;
		}
		throw new NumberFormatException("Numero não pode ser 0 ou menor que 0");
	}
}
