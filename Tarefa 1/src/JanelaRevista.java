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

        //painel para ano volume e numero da revista
        JPanel AnoVolNro = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JLabel ano = new JLabel("Ano:");
        JTextField campoAno = new JTextField(3);
        JLabel nr = new JLabel("Nro:");
        JTextField camponr = new JTextField(3);
        JLabel vol = new JLabel("Vol:");
        JTextField campovol = new JTextField(3);
        AnoVolNro.add(ano);
        AnoVolNro.add(campoAno);
        AnoVolNro.add(nr);
        AnoVolNro.add(camponr);
        AnoVolNro.add(vol);
        AnoVolNro.add(campovol);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        frame.add(AnoVolNro, gbc);

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
