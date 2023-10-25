
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.Timer;

public class juego extends JPanel implements KeyListener, ActionListener, MouseListener {

    private boolean comenzar = false;
    private int score = 0;
    private int Vidas = 3;
    //Ladrillos
    private int iLadrillos = 20;
    public int Movx = 0;
    public boolean bMov = true;

    public int iAlien = 20;

    // Cronometro
    private Timer timer;
    private int iRet = 2;

    // Pelotita y plataforma
    private int slider = 310;
    private int iGunx = 310;
    private int iGuny = 500;

    //Alien especial lase
    int isRandom = (int) (Math.random() * 99 + 1);

    private Ladrillos aLadrillos;

    ArrayList<cPistolita> iPistolita = new ArrayList<cPistolita>();

    public juego() {
        aLadrillos = new Ladrillos(3, 8);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(iRet, this);
        timer.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(1, 1, 692, 592);

        aLadrillos.pintar((Graphics2D) g);

        //pistolita}
        g.setColor(Color.red);
        if (!iPistolita.isEmpty()) {
            g.fillRect(iPistolita.get(0).pistolax, iPistolita.get(0).pistolay, 5, 10);

        }

        //Nave
        g.setColor(Color.MAGENTA);
        g.fillRect(slider, 500, 20, 20);

        //Puntos
        System.out.println("");
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Ink Free", Font.BOLD, 30));
        g.drawString("Puntos: " + score, 10, 30);

        //Vidas
        System.out.println("");
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Ink Free", Font.BOLD, 30));
        g.drawString("Vidas: " + Vidas, 550, 30);

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int ladx = 25 + Movx;
        int lady = 50;
        timer.start();
        if (comenzar = true) {
            if (!iPistolita.isEmpty()) {
                iPistolita.get(0).pistolay--;
            }
            //Alien Especial
            for (int i = 0; i < aLadrillos.sAlien.length; i++) {
                Rectangle sAlien = new Rectangle(aLadrillos.sposx, aLadrillos.sposy, 25, 25);
                Rectangle sLaser = new Rectangle(aLadrillos.sposx, aLadrillos.lsposy++, 1, 1);
                if (aLadrillos.lsposy > 850) {
                    aLadrillos.lsposy = 350;
                }
                Rectangle Player = new Rectangle(slider, 500, 20, 20);
                Rectangle cLaser = sLaser;
                if (Player.intersects(cLaser)) {
                    Vidas = 2;
                }
                

                Rectangle ladRect = sAlien;
                if (!iPistolita.isEmpty()) {
                    Rectangle rGun = new Rectangle(iPistolita.get(0).pistolax, iPistolita.get(0).pistolay, 5, 10);
                    if (rGun.intersects(ladRect)) {
                        aLadrillos.sAlienVal(0);
                        iAlien--;
                        iPistolita.clear();
                        score += 200;
                    } else {
                        if (iPistolita.get(0).pistolay <= 0) {
                            iPistolita.clear();
                        }
                    }
                }

            }
            // Aliens
            for (int i = 0; i < aLadrillos.aLadrillos.length; i++) {
                for (int j = 0; j < aLadrillos.aLadrillos[0].length; j++) {
                    if (aLadrillos.aLadrillos[i][j] > 0) {
                        //ladx = aLadrillos.posx;
                        //lady = aLadrillos.posy;
                        int ancho = aLadrillos.ancho;
                        int alto = aLadrillos.alto;

                        Rectangle rect = new Rectangle(ladx, lady, ancho, alto);
                        Rectangle ladRect = rect;
                        if (!iPistolita.isEmpty()) {
                            Rectangle rGun = new Rectangle(iPistolita.get(0).pistolax, iPistolita.get(0).pistolay, 5, 10);
                            if (rGun.intersects(ladRect)) {
                                aLadrillos.ladrilloVal(0, i, j);
                                iLadrillos--;
                                iPistolita.clear();
                                score += 50;
                            } else {
                                if (iPistolita.get(0).pistolay <= 0) {
                                    iPistolita.clear();
                                }
                            }
                        }
                    }
                    ladx += 82;

                }
                lady += 70;
                ladx = 25 + Movx;

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
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {

            if (iPistolita.isEmpty()) {
                iPistolita.add(new cPistolita(slider));

            }

        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (slider >= 600) {
                slider = 600;
            } else {
                iDer();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (slider < 10) {
                slider = 10;

            } else {
                iIzq();
            }
        }

    }

    public void iDer() {
        comenzar = true;
        slider += 20;
    }

    public void iIzq() {
        comenzar = true;
        slider -= 20;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
