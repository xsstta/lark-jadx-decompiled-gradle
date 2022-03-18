package pl.droidsonroids.relinker;

import android.content.Context;
import java.io.File;

/* renamed from: pl.droidsonroids.relinker.b */
public class C70185b {

    /* renamed from: pl.droidsonroids.relinker.b$a */
    public interface AbstractC70186a {
        /* renamed from: a */
        void mo247324a(Context context, String[] strArr, String str, File file, C70190c cVar);
    }

    /* renamed from: pl.droidsonroids.relinker.b$b */
    public interface AbstractC70187b {
        /* renamed from: a */
        void mo247337a(String str);

        /* renamed from: a */
        String[] mo247338a();

        /* renamed from: b */
        void mo247339b(String str);

        /* renamed from: c */
        String mo247340c(String str);

        /* renamed from: d */
        String mo247341d(String str);
    }

    /* renamed from: pl.droidsonroids.relinker.b$c */
    public interface AbstractC70188c {
        /* renamed from: a */
        void mo247342a();

        /* renamed from: a */
        void mo247343a(Throwable th);
    }

    /* renamed from: pl.droidsonroids.relinker.b$d */
    public interface AbstractC70189d {
        /* renamed from: a */
        void mo247344a(String str);
    }

    /* renamed from: a */
    public static void m268984a(Context context, String str) {
        m268985a(context, str, null, null);
    }

    /* renamed from: a */
    public static void m268985a(Context context, String str, String str2, AbstractC70188c cVar) {
        new C70190c().mo247348a(context, str, str2, cVar);
    }
}
