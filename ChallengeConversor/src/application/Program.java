
package application;

import moedas.MenuPrincipal;

public class Program {
	static Object[] selectionValues = { "Conversor de Moedas", "Conversor de Medidas", "Conversor de Temperatura" };
	static String initialSelection = "Conversor de Moedas";

	public static void main(String[] args) {
		
		//teste de branch
		
		MenuPrincipal mp = new MenuPrincipal();
		mp.TelaInicial(selectionValues, initialSelection);

	}

}
