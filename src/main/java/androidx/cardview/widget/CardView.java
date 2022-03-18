package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class CardView extends FrameLayout {

    /* renamed from: e */
    private static final int[] f1814e = {16842801};

    /* renamed from: f */
    private static final AbstractC0508e f1815f;

    /* renamed from: a */
    int f1816a;

    /* renamed from: b */
    int f1817b;

    /* renamed from: c */
    final Rect f1818c;

    /* renamed from: d */
    final Rect f1819d;

    /* renamed from: g */
    private boolean f1820g;

    /* renamed from: h */
    private boolean f1821h;

    /* renamed from: i */
    private final AbstractC0507d f1822i;

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public boolean getPreventCornerOverlap() {
        return this.f1821h;
    }

    public boolean getUseCompatPadding() {
        return this.f1820g;
    }

    public int getContentPaddingBottom() {
        return this.f1818c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1818c.left;
    }

    public int getContentPaddingRight() {
        return this.f1818c.right;
    }

    public int getContentPaddingTop() {
        return this.f1818c.top;
    }

    public ColorStateList getCardBackgroundColor() {
        return f1815f.mo2855i(this.f1822i);
    }

    public float getCardElevation() {
        return f1815f.mo2851e(this.f1822i);
    }

    public float getMaxCardElevation() {
        return f1815f.mo2842a(this.f1822i);
    }

    public float getRadius() {
        return f1815f.mo2850d(this.f1822i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f1815f = new C0504b();
        } else if (Build.VERSION.SDK_INT >= 17) {
            f1815f = new C0502a();
        } else {
            f1815f = new C0505c();
        }
        f1815f.mo2840a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1815f.mo2845a(this.f1822i, colorStateList);
    }

    public void setCardElevation(float f) {
        f1815f.mo2849c(this.f1822i, f);
    }

    public void setMaxCardElevation(float f) {
        f1815f.mo2847b(this.f1822i, f);
    }

    public void setMinimumHeight(int i) {
        this.f1817b = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1816a = i;
        super.setMinimumWidth(i);
    }

    public void setRadius(float f) {
        f1815f.mo2843a(this.f1822i, f);
    }

    public void setCardBackgroundColor(int i) {
        f1815f.mo2845a(this.f1822i, ColorStateList.valueOf(i));
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1821h) {
            this.f1821h = z;
            f1815f.mo2854h(this.f1822i);
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1820g != z) {
            this.f1820g = z;
            f1815f.mo2853g(this.f1822i);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        AbstractC0508e eVar = f1815f;
        if (!(eVar instanceof C0504b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo2846b(this.f1822i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo2848c(this.f1822i)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        float f;
        Rect rect = new Rect();
        this.f1818c = rect;
        this.f1819d = new Rect();
        C05011 r3 = new AbstractC0507d() {
            /* class androidx.cardview.widget.CardView.C05011 */

            /* renamed from: b */
            private Drawable f1824b;

            @Override // androidx.cardview.widget.AbstractC0507d
            /* renamed from: c */
            public Drawable mo2838c() {
                return this.f1824b;
            }

            @Override // androidx.cardview.widget.AbstractC0507d
            /* renamed from: d */
            public View mo2839d() {
                return CardView.this;
            }

            @Override // androidx.cardview.widget.AbstractC0507d
            /* renamed from: b */
            public boolean mo2837b() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // androidx.cardview.widget.AbstractC0507d
            /* renamed from: a */
            public boolean mo2836a() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // androidx.cardview.widget.AbstractC0507d
            /* renamed from: a */
            public void mo2835a(Drawable drawable) {
                this.f1824b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // androidx.cardview.widget.AbstractC0507d
            /* renamed from: a */
            public void mo2833a(int i, int i2) {
                if (i > CardView.this.f1816a) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.f1817b) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            @Override // androidx.cardview.widget.AbstractC0507d
            /* renamed from: a */
            public void mo2834a(int i, int i2, int i3, int i4) {
                CardView.this.f1819d.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i + cardView.f1818c.left, i2 + CardView.this.f1818c.top, i3 + CardView.this.f1818c.right, i4 + CardView.this.f1818c.bottom);
            }
        };
        this.f1822i = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop}, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1814e);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(R.color.cardview_light_background);
            } else {
                i2 = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        float dimension = obtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = obtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = obtainStyledAttributes.getDimension(5, BitmapDescriptorFactory.HUE_RED);
        this.f1820g = obtainStyledAttributes.getBoolean(7, false);
        this.f1821h = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        if (dimension2 > dimension3) {
            f = dimension2;
        } else {
            f = dimension3;
        }
        this.f1816a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1817b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        f1815f.mo2844a(r3, context, valueOf, dimension, dimension2, f);
    }

    /* renamed from: a */
    public void mo2810a(int i, int i2, int i3, int i4) {
        this.f1818c.set(i, i2, i3, i4);
        f1815f.mo2852f(this.f1822i);
    }
}
