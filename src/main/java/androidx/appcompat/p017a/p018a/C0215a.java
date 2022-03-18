package androidx.appcompat.p017a.p018a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0472v;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.C0755a;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.a.a.a */
public final class C0215a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f471a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0216a>> f472b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f473c = new Object();

    /* renamed from: a */
    private static TypedValue m653a() {
        ThreadLocal<TypedValue> threadLocal = f471a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.a.a.a$a */
    public static class C0216a {

        /* renamed from: a */
        final ColorStateList f474a;

        /* renamed from: b */
        final Configuration f475b;

        C0216a(ColorStateList colorStateList, Configuration configuration) {
            this.f474a = colorStateList;
            this.f475b = configuration;
        }
    }

    /* renamed from: b */
    public static Drawable m655b(Context context, int i) {
        return C0472v.m2105a().mo2683a(context, i);
    }

    /* renamed from: e */
    private static boolean m658e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m653a();
        resources.getValue(i, a, true);
        if (a.type < 28 || a.type > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static ColorStateList m652a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m657d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m656c(context, i);
        if (c == null) {
            return ContextCompat.getColorStateList(context, i);
        }
        m654a(context, i, c);
        return c;
    }

    /* renamed from: c */
    private static ColorStateList m656c(Context context, int i) {
        if (m658e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0755a.m3655a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: d */
    private static ColorStateList m657d(Context context, int i) {
        C0216a aVar;
        synchronized (f473c) {
            SparseArray<C0216a> sparseArray = f472b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null)) {
                if (aVar.f475b.equals(context.getResources().getConfiguration())) {
                    return aVar.f474a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static void m654a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f473c) {
            WeakHashMap<Context, SparseArray<C0216a>> weakHashMap = f472b;
            SparseArray<C0216a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C0216a(colorStateList, context.getResources().getConfiguration()));
        }
    }
}
