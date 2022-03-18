package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: androidx.core.view.p */
public final class C0914p {

    /* renamed from: a */
    private Object f3468a;

    /* renamed from: a */
    public Object mo4716a() {
        return this.f3468a;
    }

    private C0914p(Object obj) {
        this.f3468a = obj;
    }

    /* renamed from: a */
    public static C0914p m4401a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C0914p(PointerIcon.getSystemIcon(context, i));
        }
        return new C0914p(null);
    }
}
