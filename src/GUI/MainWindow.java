package GUI;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    final RectanglesComponent rectsComp;
    final LinesComponent linesComp;
    final int SQUARE = 10;

    public MainWindow() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));

        JPanel panel = new JPanel(new SpringLayout());
        frame.getContentPane().add(panel);

        rectsComp = new RectanglesComponent();
        rectsComp.setPreferredSize(new Dimension(800, 600));
        linesComp = new LinesComponent();
        linesComp.setPreferredSize(new Dimension(800, 600));

        panel.add(linesComp);
        panel.add(rectsComp);

        frame.revalidate();

        frame.pack();
        frame.setVisible(true);
    }

    public void Draw(int[] A, int lo, int hi, int i, int j, int p) {
        linesComp.clearLines();
        rectsComp.clearRectangles();
        rectsComp.addRectangle(0, 0, 800, 600, Color.WHITE);

        int START = 100;
        linesComp.addLine(110, 560 - p * SQUARE, 605, 560 - p * SQUARE, Color.MAGENTA);
        rectsComp.addRectangle(START + SQUARE * lo + 5, 0, SQUARE * (hi - lo) + 5, 600, Color.LIGHT_GRAY);

        for (int k = 0; k < A.length; k++) {
            Color color = Color.BLUE;
            if (k == i)
                color = Color.RED;
            if (k == j)
                color = Color.ORANGE;
            else if (A[k] == p)
                color = Color.GREEN;
            rectsComp.addRectangle(START + SQUARE * (k + 1), 560 - SQUARE * A[k], SQUARE / 2, SQUARE * A[k], color);
        }
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
