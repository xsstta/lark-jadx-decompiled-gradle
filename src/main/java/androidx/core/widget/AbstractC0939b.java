package androidx.core.widget;

import android.os.Build;

/* renamed from: androidx.core.widget.b */
public interface AbstractC0939b {

    /* renamed from: d */
    public static final boolean f3562d;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        f3562d = z;
    }
}
