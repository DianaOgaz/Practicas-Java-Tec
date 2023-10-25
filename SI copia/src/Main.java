
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //Panel
        juego pJuego = new juego();
        jFrame.add(pJuego);
        
        jFrame.setBounds(10, 10, 700, 600);
        jFrame.setResizable(true);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
    
}
