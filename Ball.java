package lesson11;

import java.awt.*;
public class Ball {
    private int x;
    private int y;
    private int d;
    private Color color;

    public Ball(int x, int y, int d, Color color) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.color = color;
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

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isInBall(int x, int y) {
        int centerX = this.x + d / 2;
        int centerY = this.y + d / 2;
        int distance = (int) Math.sqrt(Math.pow(centerX - x, 2) + Math.pow(centerY - y, 2));
        return distance <= d / 2;
    }
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, d, d);
        g.setColor(Color.black);
        g.drawOval(x, y, d, d);
    }
}