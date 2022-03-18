package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.ah */
public class C0431ah {
    /* renamed from: a */
    public static void m1845a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnAttachStateChangeListenerC0432ai.m1846a(view, charSequence);
        }
    }
}
