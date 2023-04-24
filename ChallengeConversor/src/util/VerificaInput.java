package util;

public class VerificaInput {

	public boolean verifica(String input) {
        try {
            double valor = Double.parseDouble(input);
            if (valor >= 0 || valor < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
