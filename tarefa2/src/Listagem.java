import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Listagem extends JFrame{
    public static JFrame frame;
    private JTextArea areaTexto;

    public Listagem(ArrayList <Livros> livros,ArrayList <Revistas> revistas, ArrayList <Video> videos) {
        frame = new JFrame ("Listagem");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        areaTexto.append("======LIVROS======\n");
        if(livros != null){
            for(Livros l : livros){
                areaTexto.append(l.toString()+"\n");
            }
        }
        if(revistas != null){
            areaTexto.append("======REVISTAS======\n");
            for(Revistas r : revistas){
                areaTexto.append(r.toString()+"\n");
            };
        }
        if(videos != null){
            areaTexto.append("======VIDEOS======\n");
            for(Video video : videos){
                areaTexto.append(video.toString()+"\n");
            }
        }



        frame.add(areaTexto);

        frame.getContentPane().add(areaTexto,BorderLayout.CENTER);

        frame.setVisible(true);

    }


}
/*
  areaTexto.append("======LIVROS======\n");
            areaTexto.append(livros+"\n");
        areaTexto.append("======REVISTAS======\n");
            areaTexto.append(revistas+"\n");
        areaTexto.append("======VIDEOS======\n");
            areaTexto.append(videos+"\n");

 */