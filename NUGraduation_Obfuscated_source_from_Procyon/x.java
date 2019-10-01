// 
// Decompiled by Procyon v0.5.36
// 

public final class x extends s
{
    private final int a;
    private int b;
    private final w a;
    
    public x(final int b, final w w, final int a) {
        super(false, true);
        this.a = a;
        this.b = b;
        this.a = w.a();
    }
    
    @Override
    public final void a(final g g) {
        g.a.b(this.a.a(this.a));
        if (g.a.a <= 0.0 || g.a.a >= g.a.a) {
            final w a = this.a;
            a.a = -a.a;
        }
        if (g.a.b <= 0.0 || g.a.b >= g.a.b) {
            final w a2 = this.a;
            a2.b = -a2.b;
        }
        if (--this.b <= 0) {
            this.a = true;
        }
    }
    
    @Override
    public final String toString() {
        return "ZigZag";
    }
}
