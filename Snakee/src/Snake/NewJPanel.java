/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class NewJPanel extends javax.swing.JPanel {

    int ancho = 600,
            alto = 600,
            xf,
            yf,
            t = 40,
            celdas = ancho / t,
            frutacomida = 0;

    int[] x = new int[celdas * celdas],
            y = new int[celdas * celdas];
    Random r = new Random();
    String iDir = "";
    boolean[] mAx = new boolean[celdas * celdas];
    boolean[] mAy = new boolean[celdas * celdas];

    public NewJPanel() {

        initComponents();
        setFocusable(true);
        requestFocus();

        setSize(ancho, alto);
        setBackground(Color.DARK_GRAY);
        setLayout(null);

        setFruta();
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i < celdas; i++) {
            g.drawLine(i * t, 0, i * t, alto);
            g.drawLine(0, i * t, ancho, i * t);

        }

        g.setColor(Color.red);
        g.fillRect(xf, yf, t, t);

        for (int i = 0; i < frutacomida + 1; i++) {

            if (i == 0) {
                g.setColor(Color.blue);
                System.out.print(x[0] + ",");
                System.out.print(y[0] );
            } else {
                g.setColor(Color.CYAN);

            }
            g.fillRect(x[i], y[i], t, t);

        }
        for (int i = 0; i < celdas; i++) {
            if (g.getColor() == Color.blue || g.getColor() == Color.CYAN) {
                mAx[i] = true;
                mAy[i] = true;
            } else {
                mAx[i] = false;
                mAy[i] = false;
            }
        }
        System.out.println("");
        g.setColor(Color.green);
        g.setFont(new Font("Ink Free", Font.BOLD, 30));
        g.drawString("Puntos: " + frutacomida, ancho - 170, g.getFont().getSize());
    }
    
    public void setFruta() {
        xf = r.nextInt(celdas) * t;
        yf = r.nextInt(celdas) * t;
    }
    public void perdiste(){        
        if (-40 >= x[0]) {
            JOptionPane.showMessageDialog(this, "Perdiste!");
            System.exit(0);           
        }else if (-40 >= y[0]) {
            JOptionPane.showMessageDialog(this, "Perdiste!");
            System.exit(0);
        }else if (560 < x[0]) {
            JOptionPane.showMessageDialog(this, "Perdiste!");
            System.exit(0);
        } else if (560 < y[0]) {
            JOptionPane.showMessageDialog(this, "Perdiste!");
            System.exit(0);
        }
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        for (int i = frutacomida + 1; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        
        if (evt.getKeyCode() == evt.VK_UP && iDir != "DOWN") {
            y[0] -= t;
            System.out.println(y[0]);
            if (iDir != "DOWN") {
                iDir = "UP";
            }
            
        } else if (evt.getKeyCode() == evt.VK_DOWN && iDir != "UP") {
            y[0] += t;
            if (iDir != "UP") {
                iDir = "DOWN";
            }
            
        } else if (evt.getKeyCode() == evt.VK_LEFT && iDir != "RIGHT") {
            x[0] -= t;
            if (iDir != "RIGHT") {
                iDir = "LEFT";
            }
        } else if (evt.getKeyCode() == evt.VK_RIGHT && iDir != "LEFT") {
            x[0] += t;
            if (iDir != "LEFT") {
                iDir = "RIGHT";
            }
        }

        if (x[0] == xf && y[0] == yf) {
            setFruta();
            frutacomida++;
        }
        
        repaint();
        perdiste();
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
