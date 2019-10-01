import java.awt.geom.AffineTransform;
import java.awt.FontMetrics;
import java.awt.Paint;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

// 
// Decompiled by Procyon v0.5.36
// 

public final class u extends g
{
    public int a;
    
    public u(final String s, final w w, final s s2, final e e) {
        super(s, w, s2, e);
    }
    
    @Override
    public final void a(final Graphics2D graphics2D) {
        final Font font = graphics2D.getFont();
        graphics2D.setFont(new Font("Sans Serif", 1, 14));
        final FontMetrics fontMetrics = graphics2D.getFontMetrics();
        final AffineTransform transform = graphics2D.getTransform();
        graphics2D.translate((int)this.a.a, (int)this.a.b);
        if (this.a >= 100) {
            graphics2D.setPaint(Color.MAGENTA);
        }
        else {
            graphics2D.setPaint(Color.CYAN);
        }
        graphics2D.fillOval(-15, -15, 30, 30);
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawOval(-15, -15, 30, 30);
        final String a = this.a;
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawString(a, (int)(-fontMetrics.stringWidth(a) / 2.0) + 1, -18);
        final String string = new StringBuilder().append(this.a).toString();
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawString(string, (int)(-fontMetrics.stringWidth(string) / 2.0) + 1, 6);
        final String string2 = this.a.toString();
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawString(string2, (int)(-fontMetrics.stringWidth(string2) / 2.0) + 1, 30);
        graphics2D.setTransform(transform);
        graphics2D.setFont(font);
    }
}
