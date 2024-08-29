import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton livroButton = new JButton("Cadastrar Livro");
    JButton revistaButton = new JButton("Cadastrar Revista");
    LaunchPage(){
        revistaButton.setBounds(50,50,150,50);
        revistaButton.setFocusable(false);
        revistaButton.addActionListener(this);

        livroButton.setBounds(200,50,150,50);
        livroButton.setFocusable(false);
        livroButton.addActionListener(this);

        frame.add(revistaButton);
        frame.add(livroButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==livroButton){
            JanelaLivro jlivro = new JanelaLivro();
        }
        if(e.getSource()==revistaButton){
            JanelaRevista jRevista = new JanelaRevista();
        }
    }
}
