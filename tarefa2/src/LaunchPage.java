import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame("Tela de cadastro");
    JButton livroButton = new JButton("Livros");
    JButton revistaButton = new JButton("Revistas");
    JButton videoButton = new JButton("Video");
    LaunchPage(){
        revistaButton.setBounds(50,50,85,50);
        revistaButton.setFocusable(false);
        revistaButton.addActionListener(this);

        livroButton.setBounds(140,50,85,50);
        livroButton.setFocusable(false);
        livroButton.addActionListener(this);

        videoButton.setBounds(230,50,85,50);
        videoButton.setFocusable(false);
        videoButton.addActionListener(this);


        frame.add(revistaButton);
        frame.add(livroButton);
        frame.add(videoButton);
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
        if(e.getSource()==videoButton){
            JanelaVideo jVideo = new JanelaVideo();
        }
    }
}
