package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.C0845f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Constructor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.internal.i */
public final class C22351i {

    /* renamed from: a */
    private static boolean f54759a;

    /* renamed from: b */
    private static Constructor<StaticLayout> f54760b;

    /* renamed from: c */
    private static Object f54761c;

    /* renamed from: d */
    private CharSequence f54762d;

    /* renamed from: e */
    private final TextPaint f54763e;

    /* renamed from: f */
    private final int f54764f;

    /* renamed from: g */
    private int f54765g;

    /* renamed from: h */
    private int f54766h;

    /* renamed from: i */
    private Layout.Alignment f54767i = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: j */
    private int f54768j = Integer.MAX_VALUE;

    /* renamed from: k */
    private boolean f54769k = true;

    /* renamed from: l */
    private boolean f54770l;

    /* renamed from: m */
    private TextUtils.TruncateAt f54771m = null;

    /* renamed from: b */
    private void m80977b() throws C22352a {
        boolean z;
        Class<?> cls;
        String str;
        TextDirectionHeuristic textDirectionHeuristic;
        if (!f54759a) {
            try {
                if (!this.f54770l || Build.VERSION.SDK_INT < 23) {
                    z = false;
                } else {
                    z = true;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    }
                    f54761c = textDirectionHeuristic;
                } else {
                    ClassLoader classLoader = C22351i.class.getClassLoader();
                    if (this.f54770l) {
                        str = "RTL";
                    } else {
                        str = "LTR";
                    }
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f54761c = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
                f54760b = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f54759a = true;
            } catch (Exception e) {
                throw new C22352a(e);
            }
        }
    }

    /* renamed from: a */
    public StaticLayout mo77849a() throws C22352a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f54762d == null) {
            this.f54762d = "";
        }
        int max = Math.max(0, this.f54764f);
        CharSequence charSequence = this.f54762d;
        if (this.f54768j == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f54763e, (float) max, this.f54771m);
        }
        this.f54766h = Math.min(charSequence.length(), this.f54766h);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f54770l) {
                this.f54767i = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f54765g, this.f54766h, this.f54763e, max);
            obtain.setAlignment(this.f54767i);
            obtain.setIncludePad(this.f54769k);
            if (this.f54770l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.f54771m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f54768j);
            return obtain.build();
        }
        m80977b();
        try {
            return (StaticLayout) ((Constructor) C0845f.m3991a(f54760b)).newInstance(charSequence, Integer.valueOf(this.f54765g), Integer.valueOf(this.f54766h), this.f54763e, Integer.valueOf(max), this.f54767i, C0845f.m3991a(f54761c), Float.valueOf(1.0f), Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), Boolean.valueOf(this.f54769k), null, Integer.valueOf(max), Integer.valueOf(this.f54768j));
        } catch (Exception e) {
            throw new C22352a(e);
        }
    }

    /* renamed from: a */
    public C22351i mo77850a(int i) {
        this.f54768j = i;
        return this;
    }

    /* renamed from: b */
    public C22351i mo77854b(boolean z) {
        this.f54770l = z;
        return this;
    }

    /* renamed from: a */
    public C22351i mo77851a(Layout.Alignment alignment) {
        this.f54767i = alignment;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.i$a */
    public static class C22352a extends Exception {
        C22352a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public C22351i mo77852a(TextUtils.TruncateAt truncateAt) {
        this.f54771m = truncateAt;
        return this;
    }

    /* renamed from: a */
    public C22351i mo77853a(boolean z) {
        this.f54769k = z;
        return this;
    }

    /* renamed from: a */
    public static C22351i m80976a(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C22351i(charSequence, textPaint, i);
    }

    private C22351i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f54762d = charSequence;
        this.f54763e = textPaint;
        this.f54764f = i;
        this.f54766h = charSequence.length();
    }
}
