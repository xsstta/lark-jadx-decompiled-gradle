package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: androidx.core.view.f */
public final class C0904f {
    /* renamed from: a */
    public static int m4351a(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity(i, i2);
        }
        return i & -8388609;
    }

    /* renamed from: a */
    public static void m4352a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }
}
