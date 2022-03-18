package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.graphics.drawable.C0281a;
import androidx.collection.C0516c;
import androidx.collection.C0517d;
import androidx.collection.C0525g;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.p042i.p043a.p044a.C1096c;
import androidx.p042i.p043a.p044a.C1106i;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.appcompat.widget.v */
public final class C0472v {

    /* renamed from: a */
    private static final PorterDuff.Mode f1722a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0472v f1723b;

    /* renamed from: c */
    private static final C0475c f1724c = new C0475c(6);

    /* renamed from: d */
    private WeakHashMap<Context, C0525g<ColorStateList>> f1725d;

    /* renamed from: e */
    private SimpleArrayMap<String, AbstractC0476d> f1726e;

    /* renamed from: f */
    private C0525g<String> f1727f;

    /* renamed from: g */
    private final WeakHashMap<Context, C0516c<WeakReference<Drawable.ConstantState>>> f1728g = new WeakHashMap<>(0);

    /* renamed from: h */
    private TypedValue f1729h;

    /* renamed from: i */
    private boolean f1730i;

    /* renamed from: j */
    private AbstractC0477e f1731j;

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v$d */
    public interface AbstractC0476d {
        /* renamed from: a */
        Drawable mo2690a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.v$e */
    public interface AbstractC0477e {
        /* renamed from: a */
        ColorStateList mo2591a(Context context, int i);

        /* renamed from: a */
        PorterDuff.Mode mo2592a(int i);

        /* renamed from: a */
        Drawable mo2593a(C0472v vVar, Context context, int i);

        /* renamed from: a */
        boolean mo2594a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        boolean mo2595b(Context context, int i, Drawable drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.v$a */
    public static class C0473a implements AbstractC0476d {
        C0473a() {
        }

        @Override // androidx.appcompat.widget.C0472v.AbstractC0476d
        /* renamed from: a */
        public Drawable mo2690a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0281a.m1065a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v$b */
    public static class C0474b implements AbstractC0476d {
        C0474b() {
        }

        @Override // androidx.appcompat.widget.C0472v.AbstractC0476d
        /* renamed from: a */
        public Drawable mo2690a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1096c.m5205a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v$f */
    public static class C0478f implements AbstractC0476d {
        C0478f() {
        }

        @Override // androidx.appcompat.widget.C0472v.AbstractC0476d
        /* renamed from: a */
        public Drawable mo2690a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1106i.m5239a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static void m2108a(C0472v vVar) {
        if (Build.VERSION.SDK_INT < 24) {
            vVar.m2109a("vector", new C0478f());
            vVar.m2109a("animated-vector", new C0474b());
            vVar.m2109a("animated-selector", new C0473a());
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo2683a(Context context, int i) {
        return mo2684a(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo2684a(Context context, int i, boolean z) {
        Drawable d;
        m2112b(context);
        d = m2114d(context, i);
        if (d == null) {
            d = m2113c(context, i);
        }
        if (d == null) {
            d = ContextCompat.getDrawable(context, i);
        }
        if (d != null) {
            d = m2103a(context, i, z, d);
        }
        if (d != null) {
            C0460p.m2060b(d);
        }
        return d;
    }

    /* renamed from: a */
    public synchronized void mo2686a(Context context) {
        C0516c<WeakReference<Drawable.ConstantState>> cVar = this.f1728g.get(context);
        if (cVar != null) {
            cVar.mo2971d();
        }
    }

    /* renamed from: a */
    private synchronized boolean m2110a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0516c<WeakReference<Drawable.ConstantState>> cVar = this.f1728g.get(context);
        if (cVar == null) {
            cVar = new C0516c<>();
            this.f1728g.put(context, cVar);
        }
        cVar.mo2965b(j, new WeakReference<>(constantState));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo2685a(Context context, ak akVar, int i) {
        Drawable d = m2114d(context, i);
        if (d == null) {
            d = akVar.mo2543a(i);
        }
        if (d == null) {
            return null;
        }
        return m2103a(context, i, false, d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2688a(Context context, int i, Drawable drawable) {
        AbstractC0477e eVar = this.f1731j;
        return eVar != null && eVar.mo2595b(context, i, drawable);
    }

    /* renamed from: a */
    private void m2109a(String str, AbstractC0476d dVar) {
        if (this.f1726e == null) {
            this.f1726e = new SimpleArrayMap<>();
        }
        this.f1726e.put(str, dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuff.Mode mo2682a(int i) {
        AbstractC0477e eVar = this.f1731j;
        if (eVar == null) {
            return null;
        }
        return eVar.mo2592a(i);
    }

    /* renamed from: a */
    private static boolean m2111a(Drawable drawable) {
        return (drawable instanceof C1106i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    public static synchronized C0472v m2105a() {
        C0472v vVar;
        synchronized (C0472v.class) {
            if (f1723b == null) {
                C0472v vVar2 = new C0472v();
                f1723b = vVar2;
                m2108a(vVar2);
            }
            vVar = f1723b;
        }
        return vVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v$c */
    public static class C0475c extends C0517d<Integer, PorterDuffColorFilter> {
        public C0475c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m2126b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo2691a(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo2974a(Integer.valueOf(m2126b(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo2692a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo2975a(Integer.valueOf(m2126b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: a */
    public synchronized void mo2687a(AbstractC0477e eVar) {
        this.f1731j = eVar;
    }

    /* renamed from: a */
    private static long m2100a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: b */
    private void m2112b(Context context) {
        if (!this.f1730i) {
            this.f1730i = true;
            Drawable a = mo2683a(context, R.drawable.abc_vector_test);
            if (a == null || !m2111a(a)) {
                this.f1730i = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m2101a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0472v.class) {
            C0475c cVar = f1724c;
            a = cVar.mo2691a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                cVar.mo2692a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: e */
    private ColorStateList m2115e(Context context, int i) {
        C0525g<ColorStateList> gVar;
        WeakHashMap<Context, C0525g<ColorStateList>> weakHashMap = this.f1725d;
        if (weakHashMap == null || (gVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return gVar.mo3047a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized ColorStateList mo2689b(Context context, int i) {
        ColorStateList e;
        e = m2115e(context, i);
        if (e == null) {
            AbstractC0477e eVar = this.f1731j;
            if (eVar == null) {
                e = null;
            } else {
                e = eVar.mo2591a(context, i);
            }
            if (e != null) {
                m2106a(context, i, e);
            }
        }
        return e;
    }

    /* renamed from: c */
    private Drawable m2113c(Context context, int i) {
        Drawable drawable;
        if (this.f1729h == null) {
            this.f1729h = new TypedValue();
        }
        TypedValue typedValue = this.f1729h;
        context.getResources().getValue(i, typedValue, true);
        long a = m2100a(typedValue);
        Drawable a2 = m2104a(context, a);
        if (a2 != null) {
            return a2;
        }
        AbstractC0477e eVar = this.f1731j;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.mo2593a(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m2110a(context, a, drawable);
        }
        return drawable;
    }

    /* renamed from: a */
    private synchronized Drawable m2104a(Context context, long j) {
        C0516c<WeakReference<Drawable.ConstantState>> cVar = this.f1728g.get(context);
        if (cVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> a = cVar.mo2959a(j);
        if (a != null) {
            Drawable.ConstantState constantState = a.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            cVar.mo2964b(j);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c A[Catch:{ Exception -> 0x00a4 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2114d(android.content.Context r11, int r12) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0472v.m2114d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m2102a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m2101a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private void m2106a(Context context, int i, ColorStateList colorStateList) {
        if (this.f1725d == null) {
            this.f1725d = new WeakHashMap<>();
        }
        C0525g<ColorStateList> gVar = this.f1725d.get(context);
        if (gVar == null) {
            gVar = new C0525g<>();
            this.f1725d.put(context, gVar);
        }
        gVar.mo3054c(i, colorStateList);
    }

    /* renamed from: a */
    static void m2107a(Drawable drawable, C0425ad adVar, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        if (!C0460p.m2061c(drawable) || drawable.mutate() == drawable) {
            if (adVar.f1544d || adVar.f1543c) {
                if (adVar.f1544d) {
                    colorStateList = adVar.f1541a;
                } else {
                    colorStateList = null;
                }
                if (adVar.f1543c) {
                    mode = adVar.f1542b;
                } else {
                    mode = f1722a;
                }
                drawable.setColorFilter(m2102a(colorStateList, mode, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private Drawable m2103a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo2689b(context, i);
        if (b != null) {
            if (C0460p.m2061c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable g = C0774a.m3779g(drawable);
            C0774a.m3768a(g, b);
            PorterDuff.Mode a = mo2682a(i);
            if (a == null) {
                return g;
            }
            C0774a.m3771a(g, a);
            return g;
        }
        AbstractC0477e eVar = this.f1731j;
        if ((eVar == null || !eVar.mo2594a(context, i, drawable)) && !mo2688a(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }
}
