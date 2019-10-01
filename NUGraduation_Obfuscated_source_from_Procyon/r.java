import java.awt.geom.AffineTransform;
import java.awt.FontMetrics;
import java.awt.Paint;
import java.awt.Color;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;

// 
// Decompiled by Procyon v0.5.36
// 

public final class r extends g
{
    private final int a;
    private final int b;
    private final BufferedImage a;
    
    public r(final String s, final w w, final s s2, final e e, final String pathname) {
        super(s, w, s2, e);
        this.a = ImageIO.read(new File(pathname));
        this.a = this.a.getWidth() / 4;
        this.b = this.a.getHeight() / 4;
    }
    
    @Override
    public final void a(final Graphics2D graphics2D) {
        final Font font = graphics2D.getFont();
        graphics2D.setFont(new Font("Sans Serif", 1, 14));
        final FontMetrics fontMetrics = graphics2D.getFontMetrics();
        final AffineTransform transform = graphics2D.getTransform();
        graphics2D.translate((int)this.a.a, (int)this.a.b);
        graphics2D.drawImage(this.a, -this.a / 2, -this.b / 2, this.a, this.b, null);
        final String a = this.a;
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawString(a, (int)(-fontMetrics.stringWidth(a) / 2.0) + 1, -this.b / 2 - 2);
        graphics2D.setTransform(transform);
        graphics2D.setFont(font);
    }
}
