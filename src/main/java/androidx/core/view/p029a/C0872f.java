package androidx.core.view.p029a;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.a.f */
public class C0872f {

    /* renamed from: a */
    private final AccessibilityRecord f3404a;

    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f3404a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0872f)) {
            return false;
        }
        C0872f fVar = (C0872f) obj;
        AccessibilityRecord accessibilityRecord = this.f3404a;
        if (accessibilityRecord == null) {
            if (fVar.f3404a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(fVar.f3404a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m4265a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m4267b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: a */
    public static void m4266a(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }
}
