package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: androidx.core.os.d */
public final class C0799d {
    /* renamed from: a */
    public static C0800e m3883a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0800e.m3884a(configuration.getLocales());
        }
        return C0800e.m3885a(configuration.locale);
    }
}
