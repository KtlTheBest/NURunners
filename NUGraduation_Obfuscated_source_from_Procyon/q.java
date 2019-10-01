// 
// Decompiled by Procyon v0.5.36
// 

public final class q extends s
{
    private int a;
    
    public q(final int a) {
        super(false, true);
        this.a = a;
    }
    
    @Override
    public final void a(final g g) {
        final int a = this.a - 1;
        this.a = a;
        if (a <= 0) {
            this.a = true;
        }
    }
    
    @Override
    public final String toString() {
        return "Rest";
    }
}
