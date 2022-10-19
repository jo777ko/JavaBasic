import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Java Basic. HomeTask10
 *
 * @authur Geork (Жора)
 * @todo 10.10.2022
 * @date 19.10.2022
 */

public class HomeTask10 extends JFrame{

    final private Color[] COLOR ={Color.red, Color.green, Color.blue, Color.magenta,
            Color.orange, Color.cyan, Color.pink, Color.gray, Color.black};
    private Random random = new Random();

    public static void main(String[] args) {

        new HomeTask10();
    }

    public HomeTask10() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 400);

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setBackground(Color.white);
        Button button = new Button("Repaint");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Repaint");
                canvasPanel.repaint();
            }
        });

        add(canvasPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g){
            super.paint(g);
            for (int i =0; i < 200; i++){
                g.setColor(COLOR[random.nextInt(COLOR.length)]);
                int x = random.nextInt(500);
                int y = random.nextInt(400);
                int dx = random.nextInt(100);
                int dy = random.nextInt(100);
                if (random.nextBoolean()){
                    g.fillRect(x, y, dx, dy);
                } else {
                    g.fillOval(x, y, dx, dy);
                }
            }
        }
    }
}
