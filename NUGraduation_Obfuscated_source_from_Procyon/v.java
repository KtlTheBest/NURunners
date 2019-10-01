import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;

// 
// Decompiled by Procyon v0.5.36
// 

public final class v extends g
{
    private final BufferedImage a;
    
    public v(final String s, final w w, final s s2, final e e, final String pathname) {
        super(s, w, s2, e);
        this.a = ImageIO.read(new File(pathname));
    }
    
    @Override
    public final void a(final Graphics2D graphics2D) {
        graphics2D.drawImage(this.a, 0, 0, this.a.a, this.a.b, null);
    }
}
