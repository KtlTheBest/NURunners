import java.awt.geom.AffineTransform;
import java.awt.FontMetrics;
import java.util.Iterator;
import java.awt.Paint;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;

public class Display extends JPanel {
    private Common common;

    public Display(Common common){
        this.common = common;
        this.setBackground(Color.WHITE);
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(common.windowWidth, common.windowHeight);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        common.map.draw(g2d);
        if(common.graduated){
            for(Speaker s : common.speakers){
                s.draw(g2d);
            }
            Font font = g2d.getFont();
            g2d.setFont(new Font("Sans Serif", 1, 14));
            FontMetrics fontMetrics = g2d.getFontMetrics();
            AffineTransform transform = g2d.getTransform();
            String str = "Graduation Ceremony";
            g2d.translate((int)common.amphitheater.x, (int)common.amphitheater.y + 70);
            g2d.setPaint(Color.BLACK);
            g2d.drawString(str, (int)(-fontMetrics.stringWidth(str) / 2.0), 0);
            g2d.setTransform(transform);
            g2d.setFont(font);
        } else {
            for(Assessment a : common.assessments){
                a.draw(g2d);
            }
        }

        for(Student s : common.students){
            s.draw(g2d);
        }

        for(Academician a : common.academicians){
            a.draw(g2d);
        }
    }
}
