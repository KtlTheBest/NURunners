import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public final class e
{
    private int c;
    public int a;
    public int b;
    public v a;
    public List a;
    public List b;
    public List c;
    public List d;
    public List e;
    public boolean a;
    public final w a;
    public final s a;
    private final Random a;
    private final String[] a;
    
    public e(final int c, int i, final int b) {
        this.a = new String[] { "Abay", "Abilda", "Abilkhaiyr", "Ablan", "Abylaikhan", "Adil", "Adilzhan", "Adlet", "Aidana", "Aidyn", "Aigerim", "Aisana", "Akhmed", "Akmyrza", "Alan", "Aldamzhar", "Alexandra", "Ali", "Alibek", "Alim", "Alisher", "Allan", "Altair", "Altynay", "Altynbek", "Amangeldy", "Amina", "Anel", "Angsar", "Anuar", "Ardan", "Arman", "Askhat", "Assanali", "Assem", "Ayazhan", "Azamat", "Azizkhan", "Bagdat", "Baglan", "Bakdaulet", "Bakdauren", "Bakyt", "Batyrbek", "Batyrkhan", "Bauyrzhan", "Beibarys", "Bekzat", "Bota", "Damir", "Dana", "Danel", "Daniyar", "Darina", "Dastan", "Daulet", "Dauren", "Dnislam", "Dulat", "Eldar", "Emir", "Galym", "Gulnaz", "Islam", "Kamila", "Kamilla", "Karim", "Kassym", "Khadisha", "Khafiz", "Kuanysh", "Kyran", "Madi", "Madiyar", "Magzhan", "Makhambet", "Mansur", "Margulan", "Maxim", "Medet", "Meirzhan", "Miras", "Mokhira", "Murat", "Nargiza", "Nartay", "Nuradil", "Nurbolat", "Nurdaulet", "Nurlan", "Nursultan", "Nurtileu", "Olzhas", "Rabbani", "Raiymbek", "Rakhat", "Ramazan", "Ramilya", "Rauan", "Rollan", "Rustem", "Sabyr", "Sagi", "Saidgaffor", "Saken", "Salavat", "Sandugash", "Sanzhar", "Shapagat", "Sherkhan", "Shynggys", "Shyngys", "Tatyana", "Temirlan", "Temirzhan", "Timur", "Togzhan", "Tomiris", "Turgankhan", "Vladislav", "Yeldos", "Yerkali", "Yerkhan", "Yermek", "Yernar", "Yerzhan", "Yussup", "Zarina", "Zhalgas", "Zhanarys", "Zhandos", "Zhangeldi", "Zhannur", "Zhansaya", "Zhassulan", "Zhibek", "Zhuldyz" };
        this.c = c;
        this.a = i;
        this.b = b;
        this.a = new v("NU", new w(0.0, 0.0), new t(), this, "NUMap-Faded.jpg");
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = false;
        this.a = new w(i * 564 / 800, b * 326 / 400);
        this.a = new t();
        this.a = new Random();
        this.e.add(new l(this));
        this.e.add(new p(this));
        this.e.add(new j(this));
        final a a = new a("Katsu", this.a(25), this.a(), this, "ShigeoKatsu.gif");
        final a a2 = new a("Tourassis", this.a(25), this.a(), this, "VassiliosTourassis.gif");
        final a a3 = new a("Nivelle", this.a(25), this.a(), this, "HansDeNivelle.gif");
        final a a4 = new a("Temizer", this.a(25), this.a(), this, "SelimTemizer.gif");
        this.a.add(a);
        this.a.add(a2);
        this.a.add(a3);
        this.a.add(a4);
        final r r = new r("Tokayev", this.a.a(new w(-100.0, 0.0)), this.a, this, "KassymJomartTokayev.gif");
        final r r2 = new r("Nazarbayev", this.a.a(new w(100.0, 0.0)), this.a, this, "NursultanNazarbayev.gif");
        this.b.add(r);
        this.b.add(r2);
        for (i = 0; i < c; ++i) {
            this.c.add(new u(this.a[this.a(0, 136)], this.a(15), this.b(), this));
        }
    }
    
    public final int a(final int n, final int n2) {
        return this.a.nextInt(n2 - n + 1) + n;
    }
    
    private w a(int a) {
        final int a2 = this.a(a, this.a - a);
        a = this.a(a, this.b - a);
        return new w(a2, a);
    }
    
    private w a() {
        return new w(this.a(-20, 20), this.a(-20, 20));
    }
    
    private s a() {
        switch (this.a(1, 3)) {
            case 1: {
                return new q(this.a(30, 50));
            }
            case 2: {
                return new x(this.a(30, 50), this.a(), this.a(2, 5));
            }
            case 3: {
                return new h(this.a(1), this.a(2, 5));
            }
            default: {
                System.err.println("ERROR");
                return null;
            }
        }
    }
    
    private s b() {
        switch (this.a(1, 4)) {
            case 1: {
                return new q(this.a(30, 50));
            }
            case 2: {
                return new x(this.a(30, 50), this.a(), this.a(2, 5));
            }
            case 3: {
                return new h(this.a(1), this.a(2, 5));
            }
            case 4: {
                return new d(this.a(30, 50), this.a(2, 5));
            }
            default: {
                System.err.println("ERROR");
                return null;
            }
        }
    }
    
    public final void a() {
        final Iterator<a> iterator = (Iterator<a>)this.a.iterator();
        while (iterator.hasNext()) {
            final a a;
            (a = iterator.next()).a();
            if (!(a.a instanceof q) && !(a.a instanceof t) && this.a(1, 8) == 1) {
                final List d = this.d;
                final a a2;
                final c c = (a2 = a).a.e.get(a2.a.a(0, a2.a.e.size() - 1));
                final e a3 = a2.a;
                final w a4 = a2.a;
                final e e = a3;
                int n = (int)a4.a + ((e.a(0, 1) == 0) ? -1 : 1) * e.a(15, 60);
                int n2 = (int)a4.b + ((e.a(0, 1) == 0) ? -1 : 1) * e.a(15, 60);
                if (n <= 0) {
                    n = 1;
                }
                if (n >= e.a) {
                    n = e.a - 1;
                }
                if (n2 <= 0) {
                    n2 = 1;
                }
                if (n2 >= e.b) {
                    n2 = e.b - 1;
                }
                d.add(c.a(new w(n, n2)));
            }
            if (a.a.a) {
                a.a = this.a();
            }
        }
        final Iterator<u> iterator2 = (Iterator<u>)this.c.iterator();
        while (iterator2.hasNext()) {
            final u u;
            (u = iterator2.next()).a();
            if (u.a < 100) {
                for (int i = this.d.size() - 1; i >= 0; --i) {
                    final b b = this.d.get(i);
                    if (u.a.a(b.a) <= 10.0) {
                        final u u2 = u;
                        u2.a += b.a;
                        this.d.remove(i);
                    }
                }
            }
            if (u.a.a) {
                if (u.a < 100) {
                    u.a = this.b();
                }
                else if (u.a.a(this.a) <= 25.0) {
                    u.a = this.a;
                }
                else {
                    u.a = new h(this.a.a(new w(this.a(-10, 10), this.a(-10, 10))), this.a(2, 5));
                }
            }
        }
        boolean a5 = true;
        final Iterator<u> iterator3 = (Iterator<u>)this.c.iterator();
        while (iterator3.hasNext()) {
            if (iterator3.next().a < 100) {
                a5 = false;
                break;
            }
        }
        if (!this.a && a5) {
            for (int j = 0; j < this.a.size(); ++j) {
                final a a6;
                (a6 = this.a.get(j)).a = this.a.a(new w(-150 + j * 100, -120.0));
                a6.a = this.a;
            }
        }
        this.a = a5;
    }
}
