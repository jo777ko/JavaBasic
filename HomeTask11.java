package lesson11;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Java Basic. lesson11.HomeTask11
 *
 * @authur Geork (Жора)
 * @todo 12.10.2022
 * @date 21.10.2022
 */

public class HomeTask11 extends JFrame {

    final int CANVAS_WIDTH = 600;
    final int CANVAS_HEIGHT = 300;

    final int DX = 100;
    int x, y, dx;
    Color color;
    List<Ball> balls;
    final private Color[] COLOR = {Color.red, Color.green, Color.blue, Color.magenta,
            Color.orange, Color.cyan, Color.pink, Color.gray, Color.black};

    private Random random = new Random();

    public static void main(String[] args) {

        new HomeTask11();
    }

    public HomeTask11() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        x = 100;
        y = 100;
        dx = 200;

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        canvasPanel.setBackground(Color.white);

        initBalls();

        canvasPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.out.println(e.getX() + ":" + e.getY());
                for(int i = balls.size() - 1; i > -1; i--) {
                    if(balls.get(i).isInBall(e.getX(), e.getY())){
                        balls.remove(i);
                        break;
                    }
                }
                canvasPanel.repaint();

            }
        });

        randomXYColor();

        Button repaint = new Button("Repaint");
        repaint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Repaint");
                randomXYColor();
                canvasPanel.repaint();
            }
        });
        Button left = new Button("Left");
        left.addActionListener(e -> {
            x -=5;
            canvasPanel.repaint();
        });
        Button right = new Button("Right");
        right.addActionListener(e -> {
            x+=5;
            canvasPanel.repaint();
        });
        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(left);
        buttonPanel.add(repaint);
        buttonPanel.add(exit);
        buttonPanel.add(right);

        add(buttonPanel, BorderLayout.SOUTH);
        add(canvasPanel, BorderLayout.CENTER);
        pack();

    }

    private void randomXYColor() {
        color = COLOR[random.nextInt(COLOR.length)];
        x = random.nextInt(CANVAS_WIDTH - DX);
        y = random.nextInt(CANVAS_HEIGHT - DX);
        dx = DX;
    }

    private void initBalls() {
        balls = new ArrayList<>();
        for (int i =0; i < 100; i++) {
            Color color = COLOR[random.nextInt(COLOR.length)];
            int d = random.nextInt(100);
            int x = random.nextInt(CANVAS_WIDTH - d);
            int y = random.nextInt(CANVAS_HEIGHT - d);
            balls.add(new Ball(x, y, d, color));
        }
    }

    public class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);

            for (Ball ball : balls) {
                ball.paint(g);
            }
        }
    }
}

