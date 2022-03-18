package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

/* renamed from: androidx.navigation.r */
public final class C1292r {
    /* renamed from: b */
    private static C1259g m5920b(View view) {
        while (view != null) {
            C1259g c = m5921c(view);
            if (c != null) {
                return c;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static C1259g m5921c(View view) {
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (C1259g) ((WeakReference) tag).get();
        }
        if (tag instanceof C1259g) {
            return (C1259g) tag;
        }
        return null;
    }

    /* renamed from: a */
    public static C1259g m5918a(View view) {
        C1259g b = m5920b(view);
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* renamed from: a */
    public static void m5919a(View view, C1259g gVar) {
        view.setTag(R.id.nav_controller_view_tag, gVar);
    }
}
