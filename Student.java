import java.awt.geom.AffineTransform;
import java.awt.FontMetrics;
import java.awt.Paint;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Student extends Entity {
    public int grade;

    public Student(String name, Vector2D position, State state, Common common){
        super(name, position, state, common);
        grade = 0;
    }

    @Override
    public void draw(Graphics2D g2d){
        Font font = g2d.getFont();
        g2d.setFont(new Font("Sans Serif", 1, 14));
        FontMetrics fontMetrics = g2d.getFontMetrics();
        AffineTransform transform = g2d.getTransform();
        g2d.translate((int)position.x, (int)position.y);

        if(grade >= 100){
            g2d.setPaint(Color.MAGENTA);
        } else {
            g2d.setPaint(Color.CYAN);
        }

        g2d.fillOval(-15, -15, 30, 30);
        g2d.setPaint(Color.BLACK);
        g2d.drawOval(-15, -15, 30, 30);

        g2d.drawString(name, (int)(-fontMetrics.stringWidth(name) / 2.0) + 1, -18);
        String gradeString = Integer.toString(grade);
        g2d.drawString(gradeString, (int)(-fontMetrics.stringWidth(gradeString) / 2.0) + 1, 6);

        String stateName = state.toString();
        g2d.drawString(stateName, (int)(-fontMetrics.stringWidth(stateName) / 2.0) + 1, 30);
        
        g2d.setTransform(transform);
        g2d.setFont(font);
    }
}
