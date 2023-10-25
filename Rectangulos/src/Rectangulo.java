
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diana
 */
public class Rectangulo {

    //temporales
    int x = 0;
    int y = 0;
    int xf = 0;
    int yf = 0;
    //finales
    int ancho = 0;
    int alto = 0;
    int x1 = 0;
    int y1 = 0;
    Color color;

    public Rectangulo(int x, int y, int xf, int yf, Color color) {
        this.x = x;
        this.y = y;
        this.xf = xf;
        this.yf = yf;
        this.color = color;
        calcularValores();
        
    }

    public void calcularValores() {
        x1 = Math.min(x, xf);
        y1 = Math.min(y, yf);
        ancho = Math.abs(x-xf);
        alto = Math.abs(y-yf);
    }

    public void Paint(Graphics g) {
        g.drawRect(getX(), getY(), getXf(), getYf());
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getXf() {
        return xf;
    }

    public void setXf(int xf) {
        this.xf = xf;
    }

    public int getYf() {
        return yf;
    }

    public void setYf(int yf) {
        this.yf = yf;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
