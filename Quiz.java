import java.awt.geom.AffineTransform;
import java.awt.FontMetrics;
import java.awt.Paint;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Quiz extends Assessment {
    public Quiz(String name, Vector2D position, State state, Common common, int points){
        super(name, position, state, common, points);
    }

    @Override
    public void draw(Graphics2D g2d){
        Font font = g2d.getFont();
        g2d.setFont(new Font("Sans Serif", 1, 14));
        FontMetrics fontMetrics = g2d.getFontMetrics();
        AffineTransform transform = g2d.getTransform();
        g2d.translate((int)position.x, (int)position.y);
        g2d.setPaint(new Color(150, 150, 255));
        g2d.fillPolygon(new int[] {0, 12, -11}, new int[] {-13, 9, 9}, 3);
        g2d.setPaint(Color.BLACK);
        String pointsString = Integer.toString(points);
        g2d.drawString(pointsString, (int)(-fontMetrics.stringWidth(pointsString) / 2.0) + 1, 6);
        g2d.setTransform(transform);
        g2d.setFont(font);
    }
}
