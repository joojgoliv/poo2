import javax.swing.*;
import java.awt.*;

public class JanelaLivro {

    JFrame frame = new JFrame("Livros");

    JanelaLivro(){
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new GridBagLayout());

        // Criando o layout manager
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes

        // Texto centralizado no topo
        JLabel tituloLabel = new JLabel("Livros", SwingConstants.CENTER);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        frame.add(tituloLabel, gbc);

        // Campo para Título
        JLabel labelTitulo = new JLabel("Título:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        frame.add(labelTitulo, gbc);

        JTextField campoTitulo = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(campoTitulo, gbc);

        // Campo para Autor
        JLabel labelAutor = new JLabel("Autor:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(labelAutor, gbc);

        JTextField campoAutor = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(campoAutor, gbc);


        // Campo para Ano
        JLabel labelAno = new JLabel("Ano:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(labelAno, gbc);

        JTextField campoAno = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(campoAno, gbc);

        //painelk para botoes lado a lado
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton botaoSalvar = new JButton("Incluir");
        JButton botaoCancelar = new JButton("Revistas");
        JButton botaoLimpar = new JButton("Listagem");

        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoCancelar);
        painelBotoes.add(botaoLimpar);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        frame.add(painelBotoes, gbc);

        // Exibindo a janela
        frame.setVisible(true);
    }
}

/*
import javax.swing.*;
import java.awt.*;

public class JanelaRevista {

    JFrame frame = new JFrame("Revistas");

    JanelaRevista(){
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new GridBagLayout());

        // Criando o layout manager
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes

        // Texto centralizado no topo
        JLabel tituloLabel = new JLabel("Livros", SwingConstants.CENTER);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        frame.add(tituloLabel, gbc);

        // Campo para Título
        JLabel labelTitulo = new JLabel("Título:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        frame.add(labelTitulo, gbc);

        JTextField campoTitulo = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(campoTitulo, gbc);

        // Campo para Autor
        JLabel labelAutor = new JLabel("Autor:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(labelAutor, gbc);

        JTextField campoAutor = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(campoAutor, gbc);

        // Campo para Ano
        JLabel labelAno = new JLabel("Ano:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(labelAno, gbc);

        JTextField campoAno = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(campoAno, gbc);

        // Botões lado a lado
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoCancelar = new JButton("Cancelar");
        JButton botaoLimpar = new JButton("Limpar");

        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoCancelar);
        painelBotoes.add(botaoLimpar);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        frame.add(painelBotoes, gbc);

        // Exibindo a janela
        frame.setVisible(true);
    }
}


*/
