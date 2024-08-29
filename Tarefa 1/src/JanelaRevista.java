import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JanelaRevista {

    JFrame frame = new JFrame("Revistas");
    ArrayList<Revistas> listaRevistas = new ArrayList<Revistas>();
    Revistas revista;

    JanelaRevista(){
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new GridBagLayout());

        // Criando o layout manager
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes

        // Texto centralizado no topo
        JLabel tituloLabel = new JLabel("Revista", SwingConstants.CENTER);
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
        JButton botaoIncluir = new JButton("Incluir");
        JButton botaoRevista = new JButton("Livros");
        JButton botaoListagem = new JButton("Listagem");

        painelBotoes.add(botaoIncluir);
        painelBotoes.add(botaoRevista);
        painelBotoes.add(botaoListagem);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        frame.add(painelBotoes, gbc);

        //======CONFIG BOTOES=======//
        botaoIncluir.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                String til = campoTitulo.getText();
                String aut = campoAutor.getText();
                String ano = campoAno.getText();
                String vol = campovol.getText();
                String nr = camponr.getText();

                int volu = Integer.parseInt(vol.trim());
                int anos = Integer.parseInt(ano.trim());
                int num = Integer.parseInt(nr.trim());

                revista = new Revistas (til, aut, volu, num, anos);
                listaRevistas.add(revista);
            }
        });

        botaoListagem.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                Listagem listagem = new Listagem(null, listaRevistas);
            }
        });

        // Exibindo a janela
        frame.setVisible(true);
    }
}
