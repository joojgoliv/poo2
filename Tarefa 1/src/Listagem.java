import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Listagem {
    public static JFrame frame;
    private JTextArea areaTexto;

    public Listagem(ArrayList <Livros> livros,ArrayList <Revistas> revistas) {
        frame = new JFrame ("Listagem");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        areaTexto.append(livros+"\n");
        areaTexto.append(revistas+"\n");
        frame.add(areaTexto);

        frame.getContentPane().add(areaTexto,BorderLayout.CENTER);

        frame.setVisible(true);

    }


}
