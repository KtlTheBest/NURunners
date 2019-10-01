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

// 
// Decompiled by Procyon v0.5.36
// 

public final class f extends JPanel
{
    private e a;
    
    public f(final e a) {
        this.a = a;
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public final Dimension getPreferredSize() {
        return new Dimension(this.a.a, this.a.b);
    }
    
    public final void paintComponent(final Graphics g) {
        super.paintComponent(g);
        final Graphics2D graphics2D = (Graphics2D)g;
        final e a = this.a;
        final Graphics2D graphics2D2 = graphics2D;
        final e e = a;
        a.a.a(graphics2D2);
        if (e.a) {
            final Iterator iterator = e.b.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(graphics2D2);
            }
            final Font font = graphics2D2.getFont();
            graphics2D2.setFont(new Font("Sans Serif", 1, 14));
            final FontMetrics fontMetrics = graphics2D2.getFontMetrics();
            final AffineTransform transform = graphics2D2.getTransform();
            final String str = "Graduation Ceremony";
            graphics2D2.translate((int)e.a.a, (int)e.a.b + 70);
            graphics2D2.setPaint(Color.BLACK);
            graphics2D2.drawString(str, (int)(-fontMetrics.stringWidth(str) / 2.0), 0);
            graphics2D2.setTransform(transform);
            graphics2D2.setFont(font);
        }
        else {
            final Iterator iterator2 = e.d.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().a(graphics2D2);
            }
        }
        final Iterator iterator3 = e.c.iterator();
        while (iterator3.hasNext()) {
            iterator3.next().a(graphics2D2);
        }
        final Iterator iterator4 = e.a.iterator();
        while (iterator4.hasNext()) {
            iterator4.next().a(graphics2D2);
        }
    }
}
