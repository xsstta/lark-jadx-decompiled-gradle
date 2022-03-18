package retrofit2;

import android.os.Build;

/* access modifiers changed from: package-private */
/* renamed from: retrofit2.a */
public class C70209a {

    /* renamed from: a */
    private static final C70209a f175357a = m269043b();

    /* access modifiers changed from: package-private */
    /* renamed from: retrofit2.a$a */
    public static class C70210a extends C70209a {
        C70210a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: retrofit2.a$b */
    public static class C70211b extends C70209a {
        C70211b() {
        }
    }

    C70209a() {
    }

    /* renamed from: a */
    static C70209a m269042a() {
        return f175357a;
    }

    /* renamed from: b */
    private static C70209a m269043b() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C70210a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C70211b();
        } catch (ClassNotFoundException unused2) {
            return new C70209a();
        }
    }
}
