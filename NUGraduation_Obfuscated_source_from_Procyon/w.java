// 
// Decompiled by Procyon v0.5.36
// 

public final class w
{
    public double a;
    public double b;
    
    public w(final double a, final double b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final w w) {
        this.a = w.a;
        this.b = w.b;
    }
    
    public final void b(final w w) {
        this.a += w.a;
        this.b += w.b;
    }
    
    public final double a(final w w) {
        return Math.sqrt(Math.pow(this.a - w.a, 2.0) + Math.pow(this.b - w.b, 2.0));
    }
    
    public final w a() {
        final double sqrt = Math.sqrt(Math.pow(this.a, 2.0) + Math.pow(this.b, 2.0));
        return new w(this.a / sqrt, this.b / sqrt);
    }
    
    public final w a(final w w) {
        return new w(this.a + w.a, this.b + w.b);
    }
    
    public final w b(final w w) {
        return new w(this.a - w.a, this.b - w.b);
    }
    
    public final w a(final double n) {
        return new w(this.a * n, this.b * n);
    }
}
