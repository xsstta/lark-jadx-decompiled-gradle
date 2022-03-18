package androidx.core.view.p029a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.a.b */
public final class C0862b {
    /* renamed from: a */
    public static int m4164a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m4165a(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
