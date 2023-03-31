package modules;

import javax.swing.*;

public class TelaInputValor {
	JFrame janela = new JFrame("Exemplo de Tela Java com Input");

    // Cria um campo de texto com 20 colunas
    JTextField campoDeTexto = new JTextField(20);

    // Adiciona o campo de texto à janela
    janela.add(campoDeTexto);

    // Configura o tamanho da janela
    janela.setSize(300, 100);

    // Define que a janela deve ser fechada quando o usuário clicar no botão de fechar
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Exibe a janela
    janela.setVisible(true);
}
