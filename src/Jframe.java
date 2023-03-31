import javax.swing.*;
import java.awt.*;

public class Jframe extends JFrame {
    Jframe(){

        JPanel orangePanel = new JPanel();
        orangePanel.setBackground(Color.orange);
        orangePanel.setBounds(0, 0, 140, 140);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(140, 0, 140, 140);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(280, 0, 140, 140);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 140, 140, 140);

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.cyan);
        cyanPanel.setBounds(140, 140, 140, 140);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(280, 140, 140, 140);

        JPanel grayPanel = new JPanel();
        grayPanel.setBackground(Color.gray);
        grayPanel.setBounds(0, 280, 140, 140);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.magenta);
        magentaPanel.setBounds(140, 280, 140, 140);

        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(280, 280, 140, 140);

        this.setTitle("Luffarshack"); // ger en titel till frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stänger ner porgramet när man trycker på exit
        this.setResizable(false); // gör så man inte kan byta storlek på från framet
        this.setSize(420,440); // Ger en storlek till frame
        this.setLayout(new GridLayout(3,3));


        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));







        this.add(orangePanel);
        this.add(bluePanel);
        this.add(greenPanel);
        this.add(redPanel);
        this.add(cyanPanel);
        this.add(yellowPanel);
        this.add(grayPanel);
        this.add(magentaPanel);
        this.add(pinkPanel);


        ImageIcon image = new ImageIcon("baguete.jpg");
        this.setIconImage(image.getImage());
        this.setVisible(true);

    }
}
