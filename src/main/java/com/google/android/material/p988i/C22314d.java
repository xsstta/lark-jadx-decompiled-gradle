package com.google.android.material.p988i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.C0760e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.i.d */
public class C22314d {

    /* renamed from: a */
    public final float f54593a;

    /* renamed from: b */
    public final ColorStateList f54594b;

    /* renamed from: c */
    public final ColorStateList f54595c;

    /* renamed from: d */
    public final ColorStateList f54596d;

    /* renamed from: e */
    public final int f54597e;

    /* renamed from: f */
    public final int f54598f;

    /* renamed from: g */
    public final String f54599g;

    /* renamed from: h */
    public final boolean f54600h;

    /* renamed from: i */
    public final ColorStateList f54601i;

    /* renamed from: j */
    public final float f54602j;

    /* renamed from: k */
    public final float f54603k;

    /* renamed from: l */
    public final float f54604l;

    /* renamed from: m */
    public boolean f54605m;

    /* renamed from: n */
    public Typeface f54606n;

    /* renamed from: o */
    private final int f54607o;

    /* renamed from: a */
    public Typeface mo77669a() {
        m80799b();
        return this.f54606n;
    }

    /* renamed from: b */
    private void m80799b() {
        String str;
        if (this.f54606n == null && (str = this.f54599g) != null) {
            this.f54606n = Typeface.create(str, this.f54597e);
        }
        if (this.f54606n == null) {
            int i = this.f54598f;
            if (i == 1) {
                this.f54606n = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f54606n = Typeface.SERIF;
            } else if (i != 3) {
                this.f54606n = Typeface.DEFAULT;
            } else {
                this.f54606n = Typeface.MONOSPACE;
            }
            this.f54606n = Typeface.create(this.f54606n, this.f54597e);
        }
    }

    /* renamed from: a */
    public Typeface mo77670a(Context context) {
        if (this.f54605m) {
            return this.f54606n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a = C0760e.m3678a(context, this.f54607o);
                this.f54606n = a;
                if (a != null) {
                    this.f54606n = Typeface.create(a, this.f54597e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f54599g, e);
            }
        }
        m80799b();
        this.f54605m = true;
        return this.f54606n;
    }

    /* renamed from: a */
    public void mo77673a(TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f54597e;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f54593a);
    }

    public C22314d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale});
        this.f54593a = obtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
        this.f54594b = C22313c.m80795a(context, obtainStyledAttributes, 3);
        this.f54595c = C22313c.m80795a(context, obtainStyledAttributes, 4);
        this.f54596d = C22313c.m80795a(context, obtainStyledAttributes, 5);
        this.f54597e = obtainStyledAttributes.getInt(2, 0);
        this.f54598f = obtainStyledAttributes.getInt(1, 1);
        int a = C22313c.m80794a(obtainStyledAttributes, 12, 10);
        this.f54607o = obtainStyledAttributes.getResourceId(a, 0);
        this.f54599g = obtainStyledAttributes.getString(a);
        this.f54600h = obtainStyledAttributes.getBoolean(14, false);
        this.f54601i = C22313c.m80795a(context, obtainStyledAttributes, 6);
        this.f54602j = obtainStyledAttributes.getFloat(7, BitmapDescriptorFactory.HUE_RED);
        this.f54603k = obtainStyledAttributes.getFloat(8, BitmapDescriptorFactory.HUE_RED);
        this.f54604l = obtainStyledAttributes.getFloat(9, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo77672a(Context context, final AbstractC22318f fVar) {
        if (C22317e.m80811a()) {
            mo77670a(context);
        } else {
            m80799b();
        }
        int i = this.f54607o;
        if (i == 0) {
            this.f54605m = true;
        }
        if (this.f54605m) {
            fVar.mo77072a(this.f54606n, true);
            return;
        }
        try {
            C0760e.m3683a(context, i, new C0760e.AbstractC0761a() {
                /* class com.google.android.material.p988i.C22314d.C223151 */

                @Override // androidx.core.content.res.C0760e.AbstractC0761a
                /* renamed from: a */
                public void mo2634a(int i) {
                    C22314d.this.f54605m = true;
                    fVar.mo77071a(i);
                }

                @Override // androidx.core.content.res.C0760e.AbstractC0761a
                /* renamed from: a */
                public void mo2635a(Typeface typeface) {
                    C22314d dVar = C22314d.this;
                    dVar.f54606n = Typeface.create(typeface, dVar.f54597e);
                    C22314d.this.f54605m = true;
                    fVar.mo77072a(C22314d.this.f54606n, false);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.f54605m = true;
            fVar.mo77071a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f54599g, e);
            this.f54605m = true;
            fVar.mo77071a(-3);
        }
    }

    /* renamed from: a */
    public void mo77671a(Context context, final TextPaint textPaint, final AbstractC22318f fVar) {
        mo77673a(textPaint, mo77669a());
        mo77672a(context, new AbstractC22318f() {
            /* class com.google.android.material.p988i.C22314d.C223162 */

            @Override // com.google.android.material.p988i.AbstractC22318f
            /* renamed from: a */
            public void mo77071a(int i) {
                fVar.mo77071a(i);
            }

            @Override // com.google.android.material.p988i.AbstractC22318f
            /* renamed from: a */
            public void mo77072a(Typeface typeface, boolean z) {
                C22314d.this.mo77673a(textPaint, typeface);
                fVar.mo77072a(typeface, z);
            }
        });
    }

    /* renamed from: c */
    public void mo77675c(Context context, TextPaint textPaint, AbstractC22318f fVar) {
        if (C22317e.m80811a()) {
            mo77673a(textPaint, mo77670a(context));
        } else {
            mo77671a(context, textPaint, fVar);
        }
    }

    /* renamed from: b */
    public void mo77674b(Context context, TextPaint textPaint, AbstractC22318f fVar) {
        int i;
        int i2;
        mo77675c(context, textPaint, fVar);
        ColorStateList colorStateList = this.f54594b;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, this.f54594b.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f54604l;
        float f2 = this.f54602j;
        float f3 = this.f54603k;
        ColorStateList colorStateList2 = this.f54601i;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, this.f54601i.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }
}
