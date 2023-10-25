
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ladrillos extends JPanel implements ActionListener {

    public int aLadrillos[][];
    public int sAlien[];
    public int ancho;
    public int alto;
    public int posx = 25;
    public int posy = 50;
    private Timer timer;
    public int iRet = 10;

    //ladrillos
    public int Movx = 0;
    public boolean bMov = true;

    //Alien especial
    public int iValR = 0;
    boolean bAlien = true;
    boolean bsAlien = false;
    int sposx = 350;
    int sposy = 350;
    int iCont = 0;

    //laser
    int lsposy = 350;
    int lssposy = 350;
    int iValL = 0;

    //laser aliens 
    int cposy = 50;
    int bposy = 120;
    int aposy = 190;

    public Ladrillos(int fila, int columna) {
        sAlien = new int[1];
        sAlien[0] = 1;
        aLadrillos = new int[fila][columna];
        for (int i = 0; i < aLadrillos.length; i++) {
            for (int j = 0; j < aLadrillos[0].length; j++) {
                aLadrillos[i][j] = 1;

            }

        }
        ancho = 250 / columna; //8
        alto = 50 / fila; //3
        timer = new Timer(iRet, this);
    }

    public int Random() {
        //Alien especial

        int iRandom = (int) (Math.random() * 5 + 1);
        return iRandom;
    }

    public int sRandom() {
        //Alien especial

        int iRandom = (int) (Math.random() * 99 + 1);
        return iRandom;
    }

    public void pintar(Graphics g) {
        posx = 25 + Movx;
        posy = 50;
        //alien especial 

        if (iValR >= 1000) {

            for (int i = 0; i < sAlien.length; i++) {

                if (sAlien[0] > 0) {
                    bsAlien = true;
                    // Alien especial
                    g.setColor(Color.yellow);
                    g.fillRect(sposx, sposy, 25, 25);
                }

                //laser Alien especial
                g.setColor(Color.red);
                g.fillRect(sposx, lsposy++, 5, 30);
                if (lsposy > 850) {
                    lsposy = 350;
                }

                if (bAlien) {
                    sposx++;
                    if (sposx > 680) {
                        bAlien = false;
                        iCont++;

                    }
                } else {
                    sposx--;
                    if (sposx < 0) {
                        bAlien = true;
                        iCont++;
                    }
                }
                if (iCont == 3) {
                    iValR = 0;
                    iCont = 0;
                }

            }

        } else {
            iValR += Random();
            bsAlien = false;
        }
        //Aliens
        for (int i = 0; i < aLadrillos.length; i++) {
            for (int j = 0; j < aLadrillos[0].length; j++) {

                if (aLadrillos[i][j] > 0) {

                    g.setColor(Color.green);
                    g.fillRect(posx, posy, ancho, alto);

                    // posy 50 120 190
                    //posx 634
                }
                posx += 82;
                g.setColor(Color.red);
                g.fillRect(posx, aposy++, 5, 10);
                if (aposy > 1500) {
                    aposy = 190;
                }

            }
            posy += 70;
            posx = 25 + Movx;

        }

        if (bMov) {
            Movx++;
            if (Movx >= 35) {
                bMov = false;
            }
        } else {
            Movx--;
            if (Movx <= -10) {
                bMov = true;
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void ladrilloVal(int iVal, int fila, int columna) {
        aLadrillos[fila][columna] = iVal;
    }

    public void sAlienVal(int iVal) {
        sAlien[0] = iVal;
    }

}
