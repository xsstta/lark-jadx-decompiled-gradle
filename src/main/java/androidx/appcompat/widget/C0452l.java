package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.res.C0760e;
import androidx.core.widget.AbstractC0939b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.l */
public class C0452l {

    /* renamed from: a */
    private final TextView f1654a;

    /* renamed from: b */
    private C0425ad f1655b;

    /* renamed from: c */
    private C0425ad f1656c;

    /* renamed from: d */
    private C0425ad f1657d;

    /* renamed from: e */
    private C0425ad f1658e;

    /* renamed from: f */
    private C0425ad f1659f;

    /* renamed from: g */
    private C0425ad f1660g;

    /* renamed from: h */
    private C0425ad f1661h;

    /* renamed from: i */
    private final C0454m f1662i;

    /* renamed from: j */
    private int f1663j;

    /* renamed from: k */
    private int f1664k = -1;

    /* renamed from: l */
    private Typeface f1665l;

    /* renamed from: m */
    private boolean f1666m;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2612a() {
        mo2624b();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0113  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2619a(android.util.AttributeSet r24, int r25) {
        /*
        // Method dump skipped, instructions count: 972
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0452l.mo2619a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2620a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1666m) {
            this.f1665l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1663j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2621a(boolean z) {
        this.f1654a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2622a(boolean z, int i, int i2, int i3, int i4) {
        if (!AbstractC0939b.f3562d) {
            mo2625c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2623a(int[] iArr, int i) throws IllegalArgumentException {
        this.f1662i.mo2642a(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2618a(PorterDuff.Mode mode) {
        if (this.f1661h == null) {
            this.f1661h = new C0425ad();
        }
        this.f1661h.f1542b = mode;
        this.f1661h.f1543c = mode != null;
        m1956l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2625c() {
        this.f1662i.mo2648f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2626d() {
        return this.f1662i.mo2649g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo2627e() {
        return this.f1662i.mo2636a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo2628f() {
        return this.f1662i.mo2643b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2629g() {
        return this.f1662i.mo2645c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo2630h() {
        return this.f1662i.mo2646d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int[] mo2631i() {
        return this.f1662i.mo2647e();
    }

    /* renamed from: l */
    private void m1956l() {
        C0425ad adVar = this.f1661h;
        this.f1655b = adVar;
        this.f1656c = adVar;
        this.f1657d = adVar;
        this.f1658e = adVar;
        this.f1659f = adVar;
        this.f1660g = adVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo2632j() {
        C0425ad adVar = this.f1661h;
        if (adVar != null) {
            return adVar.f1541a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo2633k() {
        C0425ad adVar = this.f1661h;
        if (adVar != null) {
            return adVar.f1542b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2624b() {
        if (!(this.f1655b == null && this.f1656c == null && this.f1657d == null && this.f1658e == null)) {
            Drawable[] compoundDrawables = this.f1654a.getCompoundDrawables();
            m1954a(compoundDrawables[0], this.f1655b);
            m1954a(compoundDrawables[1], this.f1656c);
            m1954a(compoundDrawables[2], this.f1657d);
            m1954a(compoundDrawables[3], this.f1658e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1659f != null || this.f1660g != null) {
            Drawable[] compoundDrawablesRelative = this.f1654a.getCompoundDrawablesRelative();
            m1954a(compoundDrawablesRelative[0], this.f1659f);
            m1954a(compoundDrawablesRelative[2], this.f1660g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2613a(int i) {
        this.f1662i.mo2638a(i);
    }

    C0452l(TextView textView) {
        this.f1654a = textView;
        this.f1662i = new C0454m(textView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2617a(ColorStateList colorStateList) {
        boolean z;
        if (this.f1661h == null) {
            this.f1661h = new C0425ad();
        }
        this.f1661h.f1541a = colorStateList;
        C0425ad adVar = this.f1661h;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        adVar.f1544d = z;
        m1956l();
    }

    /* renamed from: b */
    private void m1955b(int i, float f) {
        this.f1662i.mo2639a(i, f);
    }

    /* renamed from: a */
    private void m1954a(Drawable drawable, C0425ad adVar) {
        if (drawable != null && adVar != null) {
            C0445f.m1909a(drawable, adVar, this.f1654a.getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2614a(int i, float f) {
        if (!AbstractC0939b.f3562d && !mo2626d()) {
            m1955b(i, f);
        }
    }

    /* renamed from: a */
    private void m1952a(Context context, C0427af afVar) {
        String d;
        boolean z;
        boolean z2;
        this.f1663j = afVar.mo2474a(2, this.f1663j);
        boolean z3 = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int a = afVar.mo2474a(11, -1);
            this.f1664k = a;
            if (a != -1) {
                this.f1663j = (this.f1663j & 2) | 0;
            }
        }
        int i = 10;
        if (afVar.mo2492g(10) || afVar.mo2492g(12)) {
            this.f1665l = null;
            if (afVar.mo2492g(12)) {
                i = 12;
            }
            final int i2 = this.f1664k;
            final int i3 = this.f1663j;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f1654a);
                try {
                    Typeface a2 = afVar.mo2476a(i, this.f1663j, new C0760e.AbstractC0761a() {
                        /* class androidx.appcompat.widget.C0452l.C04531 */

                        @Override // androidx.core.content.res.C0760e.AbstractC0761a
                        /* renamed from: a */
                        public void mo2634a(int i) {
                        }

                        @Override // androidx.core.content.res.C0760e.AbstractC0761a
                        /* renamed from: a */
                        public void mo2635a(Typeface typeface) {
                            int i;
                            boolean z;
                            if (Build.VERSION.SDK_INT >= 28 && (i = i2) != -1) {
                                if ((i3 & 2) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                typeface = Typeface.create(typeface, i, z);
                            }
                            C0452l.this.mo2620a(weakReference, typeface);
                        }
                    });
                    if (a2 != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.f1664k == -1) {
                            this.f1665l = a2;
                        } else {
                            Typeface create = Typeface.create(a2, 0);
                            int i4 = this.f1664k;
                            if ((this.f1663j & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.f1665l = Typeface.create(create, i4, z2);
                        }
                    }
                    if (this.f1665l == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f1666m = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1665l == null && (d = afVar.mo2486d(i)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1664k == -1) {
                    this.f1665l = Typeface.create(d, this.f1663j);
                    return;
                }
                Typeface create2 = Typeface.create(d, 0);
                int i5 = this.f1664k;
                if ((this.f1663j & 2) != 0) {
                    z3 = true;
                }
                this.f1665l = Typeface.create(create2, i5, z3);
            }
        } else if (afVar.mo2492g(1)) {
            this.f1666m = false;
            int a3 = afVar.mo2474a(1, 1);
            if (a3 == 1) {
                this.f1665l = Typeface.SANS_SERIF;
            } else if (a3 == 2) {
                this.f1665l = Typeface.SERIF;
            } else if (a3 == 3) {
                this.f1665l = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2616a(Context context, int i) {
        String d;
        ColorStateList e;
        C0427af a = C0427af.m1776a(context, i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale});
        if (a.mo2492g(14)) {
            mo2621a(a.mo2478a(14, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.mo2492g(3) && (e = a.mo2488e(3)) != null) {
            this.f1654a.setTextColor(e);
        }
        if (a.mo2492g(0) && a.mo2487e(0, -1) == 0) {
            this.f1654a.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        m1952a(context, a);
        if (Build.VERSION.SDK_INT >= 26 && a.mo2492g(13) && (d = a.mo2486d(13)) != null) {
            this.f1654a.setFontVariationSettings(d);
        }
        a.mo2482b();
        Typeface typeface = this.f1665l;
        if (typeface != null) {
            this.f1654a.setTypeface(typeface, this.f1663j);
        }
    }

    /* renamed from: a */
    private static C0425ad m1951a(Context context, C0445f fVar, int i) {
        ColorStateList b = fVar.mo2590b(context, i);
        if (b == null) {
            return null;
        }
        C0425ad adVar = new C0425ad();
        adVar.f1544d = true;
        adVar.f1541a = b;
        return adVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2615a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1662i.mo2640a(i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m1953a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1654a.getCompoundDrawablesRelative();
            TextView textView = this.f1654a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1654a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1654a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1654a.getCompoundDrawables();
            TextView textView3 = this.f1654a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }
}
