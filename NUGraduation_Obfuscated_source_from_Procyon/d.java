import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public final class d extends s
{
    private final int a;
    private int b;
    
    public d(final int b, final int a) {
        super(false, true);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final g g) {
        b b = null;
        double n = Double.MAX_VALUE;
        for (final b b2 : g.a.d) {
            final double a;
            if ((a = g.a.a(b2.a)) < n) {
                b = b2;
                n = a;
            }
        }
        if (b != null) {
            if (n < this.a) {
                g.a.a(b.a);
            }
            else {
                g.a.b(b.a.b(g.a).a().a(this.a));
            }
        }
        if (--this.b <= 0) {
            this.a = true;
        }
    }
    
    @Override
    public final String toString() {
        return "Closest";
    }
}
