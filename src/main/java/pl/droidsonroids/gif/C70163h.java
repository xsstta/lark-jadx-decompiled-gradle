package pl.droidsonroids.gif;

import android.content.Context;
import com.C1711a;
import pl.droidsonroids.relinker.C70185b;

/* renamed from: pl.droidsonroids.gif.h */
public class C70163h {

    /* renamed from: a */
    private static Context f175281a;

    /* renamed from: a */
    static void m268955a() {
        try {
            C1711a.m7628a("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            C70185b.m268984a(m268956b(), "pl_droidsonroids_gif");
        }
    }

    /* renamed from: b */
    private static Context m268956b() {
        if (f175281a == null) {
            try {
                f175281a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return f175281a;
    }
}
