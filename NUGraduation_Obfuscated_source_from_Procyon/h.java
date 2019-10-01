// 
// Decompiled by Procyon v0.5.36
// 

public final class h extends s
{
    private final int a;
    private final w a;
    
    public h(final w a, final int a2) {
        super(false, true);
        this.a = a2;
        this.a = a;
    }
    
    @Override
    public final void a(final g g) {
        if (g.a.a(this.a) < this.a) {
            g.a.a(this.a);
        }
        else {
            g.a.b(this.a.b(g.a).a().a(this.a));
        }
        if (g.a.a(this.a) < 1.0) {
            this.a = true;
        }
    }
    
    @Override
    public final String toString() {
        return "GotoXY";
    }
}
