
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diana
 */
public class Lienzo extends JPanel implements MouseListener {

    ArrayList<Rectangulo> lRect = null;
    int yit;
    int xit;

    public Lienzo() {
        setlRect(new ArrayList<>());
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < lRect.size(); i++) {          
            g.setColor(lRect.get(i).color);
            g.fillRect(lRect.get(i).getX1(), lRect.get(i).getY1(), lRect.get(i).getAncho(), lRect.get(i).getAlto());
        }
    }
    public Color randomColor(){
        int iRandom = (int)(Math.random()*10 + 1);
        switch  (iRandom){
            case 1:
                return Color.RED;           
            case 2:
                return Color.BLUE;
            case 3: 
                return Color.CYAN;
            case 4:
                return Color.YELLOW;
            case 5:
                return Color.WHITE;
            case 6:
                return Color.GREEN;
            case 7:
                return Color.LIGHT_GRAY;
            case 8:
                return Color.MAGENTA;
            case 9: 
                return Color.ORANGE;
            case 10:
                return Color.PINK;
    }
        return Color.black;
    }

    public ArrayList<Rectangulo> getlRect() {
        return lRect;
    }

    public void setlRect(ArrayList<Rectangulo> lRect) {
        this.lRect = lRect;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == 1) {
            xit = e.getX();
            yit = e.getY();
            System.out.println(xit + "," + yit);

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == 1) {
            getlRect().add(new Rectangulo(xit, yit, e.getX(), e.getY(),randomColor()));
            System.out.println(e.getX() + "," + e.getY());
            repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {     
    }

}
