import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JanelaVideo extends JFrame{

    JFrame frame = new JFrame("Filmes");
    Video video;
    ArrayList<Video> listaVideos = new ArrayList<Video>();
    JanelaVideo() {
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridBagLayout());

        // Criando o layout manager
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes

        // Texto centralizado no topo
        JLabel tituloLabel = new JLabel("Video", SwingConstants.CENTER);
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
        JPanel AnoGen = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JLabel ano = new JLabel("Ano:");
        JTextField campoAno = new JTextField(3);
        JLabel gen = new JLabel("Genero:");
        JTextField campogen = new JTextField(3);
        JLabel duracao = new JLabel("Duração:");
        JTextField campoDuracao = new JTextField(3);
        AnoGen.add(ano);
        AnoGen.add(campoAno);
        AnoGen.add(gen);
        AnoGen.add(campogen);
        AnoGen.add(duracao);
        AnoGen.add(campoDuracao);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        frame.add(AnoGen, gbc);

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

        botaoIncluir.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                String til = campoTitulo.getText();
                String aut = campoAutor.getText();
                String ano = campoAno.getText();
                String gen = campogen.getText();
                String dur = campoDuracao.getText();

                int anos = Integer.parseInt(ano.trim()); //string to int para add abaixo
                int duracao = Integer.parseInt(dur.trim());

                video = new Video(til, aut, gen, duracao, anos);

                listaVideos.add(video);
                campoDuracao.setText("");
                campogen.setText("");
                campoAno .setText("");
                campoAutor.setText("");
                campoTitulo.setText("");
            }

        });


        botaoListagem.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                Listagem listagem = new Listagem(null, null, listaVideos);
            }
        });


        frame.setVisible(true);

    }
}
