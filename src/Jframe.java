import javax.swing.*;

public class Jframe extends JFrame {
    Jframe(){
        this.setTitle("Luffarshack"); // ger en titel till frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stänger ner porgramet när man trycker på exit
        this.setResizable(false); // gör så man inte kan byta storlek på från framet
        this.setSize(420,420 ); // Ger en storlek till frame
        this.setVisible(true);

        ImageIcon image = new ImageIcon("baguete.jpg");
        this.setIconImage(image.getImage());

    }
}
