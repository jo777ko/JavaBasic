import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomeTask12 extends JFrame {
    private final int PANEL_SIZE = 500;
    private final int CELL_SIZE = PANEL_SIZE /3;
    private boolean gameOver = false;

    public static void main(String[] args) {

        new HomeTask12();
    }
    public HomeTask12() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        HomeTask6.init();

        PaintPanel paintPanel = new PaintPanel();
        paintPanel.setBackground(Color.white);
        paintPanel.setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
        paintPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / (CELL_SIZE);
                int y = e.getY() / CELL_SIZE;

                if (HomeTask6.isCellValid(x, y) && !gameOver) {
                    HomeTask6.table[x][y] = 'x';
                    if (HomeTask6.isWin('x')) {
                        System.out.println("You Won!");
                        gameOver = true;
                    }
                    if (HomeTask6.isTablefull()) {
                        System.out.println("Sorry, Draw!");
                        gameOver = true;
                    }
                    if (!gameOver) {
                        HomeTask6.turnAI();
                        if (HomeTask6.isWin('o')) {
                            System.out.println("AI Won!");
                            gameOver = true;
                        }
                        if (HomeTask6.isTablefull()) {
                            System.out.println("Sorry, Draw!");
                            gameOver = true;
                        }
                    }
                    paintPanel.repaint();
                }
            }
        });

        Button restart = new Button("Restart");
        restart.addActionListener(e -> {
            HomeTask6.init();
            gameOver = false;
            paintPanel.repaint();
        });
        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));

        JPanel btnPanel = new JPanel();
        btnPanel.add(restart);
        btnPanel.add(exit);

        add(paintPanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        }
    private class PaintPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.LIGHT_GRAY);
            for(int i=1; i < 3; i++){
                g.drawLine(0,(CELL_SIZE) *i, PANEL_SIZE, (CELL_SIZE)* i);
                g.drawLine((CELL_SIZE) *i, 0, (CELL_SIZE) *i, PANEL_SIZE);
            }
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(10f));
            for(int y = 0; y < 3; y++){
                for(int x = 0; x < 3; x++) {
                    if (HomeTask6.table[x][y] == 'x') {
                        g.setColor(Color.blue);
                        g.drawLine(x * CELL_SIZE + CELL_SIZE/5,
                                y * CELL_SIZE + CELL_SIZE/5,
                                (x + 1) * CELL_SIZE - CELL_SIZE/5,
                                (y + 1) * CELL_SIZE - CELL_SIZE/5);
                        g.drawLine((x + 1) * CELL_SIZE - CELL_SIZE/5,
                                y * CELL_SIZE + CELL_SIZE/5,
                                x * CELL_SIZE + CELL_SIZE/5,
                                (y + 1) * CELL_SIZE -CELL_SIZE/5);
                    }
                    if (HomeTask6.table[y][x] == 'o') {
                        g.setColor(Color.red);
                        g.drawOval(x * CELL_SIZE + CELL_SIZE/5, y * CELL_SIZE + CELL_SIZE/5,
                                CELL_SIZE - CELL_SIZE/5 * 2, CELL_SIZE - CELL_SIZE/5 * 2);
                    }
                }
            }
        }
    }
}
