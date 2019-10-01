import java.awt.geom.AffineTransform;
import java.awt.FontMetrics;
import java.awt.Paint;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

// 
// Decompiled by Procyon v0.5.36
// 

public final class o extends b
{
    public o(final String s, final w w, final s s2, final e e, final int n) {
        super(s, w, s2, e, n);
    }
    
    @Override
    public final void a(final Graphics2D graphics2D) {
        final Font font = graphics2D.getFont();
        graphics2D.setFont(new Font("Sans Serif", 1, 14));
        final FontMetrics fontMetrics = graphics2D.getFontMetrics();
        final AffineTransform transform = graphics2D.getTransform();
        graphics2D.translate((int)this.a.a, (int)this.a.b);
        graphics2D.setPaint(new Color(150, 150, 255));
        graphics2D.fillPolygon(new int[] { 0, 12, -11 }, new int[] { -13, 9, 9 }, 3);
        final String string = new StringBuilder().append(this.a).toString();
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawString(string, (int)(-fontMetrics.stringWidth(string) / 2.0) + 1, 6);
        graphics2D.setTransform(transform);
        graphics2D.setFont(font);
    }
}
