import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class JanelaLivro extends JFrame{

    JFrame frame = new JFrame("Livros");
    Livros livro;
    ArrayList<Livros> listaLivros = new ArrayList<Livros>();

    JanelaLivro(){

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new GridBagLayout());

        //manager para grid
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
        JButton botaoIncluir = new JButton("Incluir");
        JButton botaoRevista = new JButton("Revistas");
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

                int num = Integer.parseInt(ano.trim());

                livro = new Livros (til, aut, num);
                listaLivros.add(livro);
                campoAno .setText("");
                campoAutor.setText("");
                campoTitulo.setText("");
            }
        });
        botaoListagem.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                Listagem listagem = new Listagem(listaLivros, null, null);
            }
        });

        // Exibindo a janela
        frame.setVisible(true);
    }
    public ArrayList<Livros> getLista(){
        return listaLivros;
    }
}