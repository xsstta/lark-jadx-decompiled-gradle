package com.ss.android.lark.keyboard.plugin.tool.voice.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.b */
public class C41098b extends LinearLayout {

    /* renamed from: a */
    private final int f104751a;

    /* renamed from: b */
    private final int f104752b;

    /* renamed from: c */
    private final int f104753c;

    /* renamed from: d */
    private final int f104754d;

    /* renamed from: e */
    private final Paint f104755e;

    /* renamed from: f */
    private final RectF f104756f = new RectF();

    /* renamed from: g */
    private final boolean f104757g;

    /* renamed from: h */
    private final boolean f104758h;

    /* renamed from: i */
    private final boolean f104759i;

    /* renamed from: j */
    private final int f104760j;

    /* renamed from: k */
    private final int f104761k;

    /* renamed from: l */
    private final int f104762l;

    /* renamed from: m */
    private final float f104763m;

    /* renamed from: n */
    private final Paint f104764n;

    /* renamed from: o */
    private final int f104765o;

    /* renamed from: p */
    private final Paint f104766p;

    /* renamed from: q */
    private final float f104767q;

    /* renamed from: r */
    private final C41100a f104768r;

    /* renamed from: s */
    private final boolean f104769s;

    /* renamed from: t */
    private int f104770t;

    /* renamed from: u */
    private int f104771u;

    /* renamed from: v */
    private float f104772v;

    /* renamed from: w */
    private AbstractC41095a f104773w;

    /* renamed from: x */
    private SmartTabLayout.AbstractC41093f f104774x;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.b$a */
    public static class C41100a implements SmartTabLayout.AbstractC41093f {

        /* renamed from: a */
        private int[] f104775a;

        /* renamed from: b */
        private int[] f104776b;

        private C41100a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo148212a(int... iArr) {
            this.f104775a = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo148213b(int... iArr) {
            this.f104776b = iArr;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout.AbstractC41093f
        /* renamed from: a */
        public final int mo148198a(int i) {
            int[] iArr = this.f104775a;
            return iArr[i % iArr.length];
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout.AbstractC41093f
        /* renamed from: b */
        public final int mo148199b(int i) {
            int[] iArr = this.f104776b;
            return iArr[i % iArr.length];
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo148207a() {
        return this.f104758h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SmartTabLayout.AbstractC41093f mo148208b() {
        SmartTabLayout.AbstractC41093f fVar = this.f104774x;
        if (fVar != null) {
            return fVar;
        }
        return this.f104768r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148204a(SmartTabLayout.AbstractC41093f fVar) {
        this.f104774x = fVar;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f104769s) {
            m162944a(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148205a(AbstractC41095a aVar) {
        this.f104773w = aVar;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo148209b(int... iArr) {
        this.f104774x = null;
        this.f104768r.mo148213b(iArr);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f104769s) {
            m162944a(canvas);
        }
    }

    /* renamed from: a */
    private void m162944a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int height = getHeight();
        int width = getWidth();
        int childCount = getChildCount();
        SmartTabLayout.AbstractC41093f b = mo148208b();
        boolean l = C41101c.m162973l(this);
        if (this.f104759i) {
            m162948b(canvas, 0, width);
            m162946a(canvas, 0, width, height);
        }
        if (childCount > 0) {
            View childAt = getChildAt(this.f104771u);
            int a = C41101c.m162961a(childAt, this.f104757g);
            int b2 = C41101c.m162963b(childAt, this.f104757g);
            if (l) {
                a = b2;
                b2 = a;
            }
            int a2 = b.mo148198a(this.f104771u);
            float f = (float) this.f104760j;
            if (this.f104772v <= BitmapDescriptorFactory.HUE_RED || this.f104771u >= getChildCount() - 1) {
                i = a2;
                i2 = b2;
                i3 = a;
            } else {
                int a3 = b.mo148198a(this.f104771u + 1);
                if (a2 != a3) {
                    a2 = m162943a(a3, a2, this.f104772v);
                }
                float a4 = this.f104773w.mo148200a(this.f104772v);
                float b3 = this.f104773w.mo148201b(this.f104772v);
                float c = this.f104773w.mo148202c(this.f104772v);
                View childAt2 = getChildAt(this.f104771u + 1);
                int a5 = C41101c.m162961a(childAt2, this.f104757g);
                int b4 = C41101c.m162963b(childAt2, this.f104757g);
                if (l) {
                    i4 = (int) ((((float) b4) * b3) + ((1.0f - b3) * ((float) a)));
                    i5 = (int) ((((float) a5) * a4) + ((1.0f - a4) * ((float) b2)));
                } else {
                    i4 = (int) ((((float) a5) * a4) + ((1.0f - a4) * ((float) a)));
                    i5 = (int) ((((float) b4) * b3) + ((1.0f - b3) * ((float) b2)));
                }
                f *= c;
                i2 = i5;
                i3 = i4;
                i = a2;
            }
            m162947a(canvas, i3, i2, height, f, i);
        }
        if (!this.f104759i) {
            m162948b(canvas, 0, width);
            m162946a(canvas, 0, getWidth(), height);
        }
        m162945a(canvas, height, childCount);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148206a(int... iArr) {
        this.f104774x = null;
        this.f104768r.mo148212a(iArr);
        invalidate();
    }

    /* renamed from: a */
    private static int m162942a(int i, byte b) {
        return Color.argb((int) b, Color.red(i), Color.green(i), Color.blue(i));
    }

    C41098b(Context context, AttributeSet attributeSet) {
        super(context);
        int[] iArr;
        int i;
        int[] iArr2;
        setWillNotDraw(false);
        float f = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int i2 = typedValue.data;
        float f2 = BitmapDescriptorFactory.HUE_RED * f;
        int a = m162942a(i2, (byte) 38);
        int i3 = (int) f2;
        int a2 = m162942a(i2, (byte) 38);
        int a3 = m162942a(i2, (byte) 32);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.stl_clickable, R.attr.stl_customTabTextLayoutId, R.attr.stl_customTabTextViewId, R.attr.stl_defaultTabBackground, R.attr.stl_defaultTabTextAllCaps, R.attr.stl_defaultTabTextColor, R.attr.stl_defaultTabTextHorizontalPadding, R.attr.stl_defaultTabTextMinWidth, R.attr.stl_defaultTabTextSize, R.attr.stl_distributeEvenly, R.attr.stl_dividerColor, R.attr.stl_dividerColors, R.attr.stl_dividerThickness, R.attr.stl_drawDecorationAfterTab, R.attr.stl_indicatorAlwaysInCenter, R.attr.stl_indicatorColor, R.attr.stl_indicatorColors, R.attr.stl_indicatorCornerRadius, R.attr.stl_indicatorGravity, R.attr.stl_indicatorInFront, R.attr.stl_indicatorInterpolation, R.attr.stl_indicatorThickness, R.attr.stl_indicatorWidth, R.attr.stl_indicatorWithoutPadding, R.attr.stl_overlineColor, R.attr.stl_overlineThickness, R.attr.stl_titleOffset, R.attr.stl_underlineColor, R.attr.stl_underlineThickness});
        boolean z = obtainStyledAttributes.getBoolean(14, false);
        boolean z2 = obtainStyledAttributes.getBoolean(23, false);
        boolean z3 = obtainStyledAttributes.getBoolean(19, false);
        int i4 = obtainStyledAttributes.getInt(20, 0);
        int i5 = obtainStyledAttributes.getInt(18, 0);
        int color = obtainStyledAttributes.getColor(15, -13388315);
        int resourceId = obtainStyledAttributes.getResourceId(16, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(21, (int) (8.0f * f));
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(22, -1);
        float dimension = obtainStyledAttributes.getDimension(17, f2);
        int color2 = obtainStyledAttributes.getColor(24, a);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(25, i3);
        int color3 = obtainStyledAttributes.getColor(27, a2);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(28, (int) (2.0f * f));
        int color4 = obtainStyledAttributes.getColor(10, a3);
        int resourceId2 = obtainStyledAttributes.getResourceId(11, -1);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(12, (int) (f * 1.0f));
        boolean z4 = obtainStyledAttributes.getBoolean(13, false);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            i = 1;
            iArr = new int[]{color};
        } else {
            i = 1;
            iArr = getResources().getIntArray(resourceId);
        }
        if (resourceId2 == -1) {
            iArr2 = new int[i];
            iArr2[0] = color4;
        } else {
            iArr2 = getResources().getIntArray(resourceId2);
        }
        C41100a aVar = new C41100a();
        this.f104768r = aVar;
        aVar.mo148212a(iArr);
        aVar.mo148213b(iArr2);
        this.f104751a = dimensionPixelSize2;
        this.f104752b = color2;
        this.f104753c = dimensionPixelSize3;
        this.f104754d = color3;
        this.f104755e = new Paint(1);
        this.f104758h = z;
        this.f104757g = z2;
        this.f104759i = z3;
        this.f104760j = dimensionPixelSize;
        this.f104761k = layoutDimension;
        this.f104764n = new Paint(1);
        this.f104763m = dimension;
        this.f104762l = i5;
        this.f104767q = 0.5f;
        Paint paint = new Paint(1);
        this.f104766p = paint;
        paint.setStrokeWidth((float) dimensionPixelSize4);
        this.f104765o = dimensionPixelSize4;
        this.f104769s = z4;
        this.f104773w = AbstractC41095a.m162933a(i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148203a(int i, float f) {
        this.f104771u = i;
        this.f104772v = f;
        if (f == BitmapDescriptorFactory.HUE_RED && this.f104770t != i) {
            this.f104770t = i;
        }
        invalidate();
    }

    /* renamed from: b */
    private void m162948b(Canvas canvas, int i, int i2) {
        if (this.f104751a > 0) {
            this.f104755e.setColor(this.f104752b);
            canvas.drawRect((float) i, BitmapDescriptorFactory.HUE_RED, (float) i2, (float) this.f104751a, this.f104755e);
        }
    }

    /* renamed from: a */
    private static int m162943a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((((float) Color.red(i)) * f) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i)) * f) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i)) * f) + (((float) Color.blue(i2)) * f2)));
    }

    /* renamed from: a */
    private void m162945a(Canvas canvas, int i, int i2) {
        int i3;
        if (this.f104765o > 0) {
            int min = (int) (Math.min(Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f104767q), 1.0f) * ((float) i));
            SmartTabLayout.AbstractC41093f b = mo148208b();
            int i4 = (i - min) / 2;
            int i5 = min + i4;
            boolean l = C41101c.m162973l(this);
            for (int i6 = 0; i6 < i2 - 1; i6++) {
                View childAt = getChildAt(i6);
                int e = C41101c.m162966e(childAt);
                int j = C41101c.m162971j(childAt);
                if (l) {
                    i3 = e - j;
                } else {
                    i3 = e + j;
                }
                this.f104766p.setColor(b.mo148199b(i6));
                float f = (float) i3;
                canvas.drawLine(f, (float) i4, f, (float) i5, this.f104766p);
            }
        }
    }

    /* renamed from: a */
    private void m162946a(Canvas canvas, int i, int i2, int i3) {
        if (this.f104753c > 0) {
            this.f104755e.setColor(this.f104754d);
            canvas.drawRect((float) i, (float) (i3 - this.f104753c), (float) i2, (float) i3, this.f104755e);
        }
    }

    /* renamed from: a */
    private void m162947a(Canvas canvas, int i, int i2, int i3, float f, int i4) {
        float f2;
        float f3;
        int i5 = this.f104760j;
        if (i5 > 0 && this.f104761k != 0) {
            int i6 = this.f104762l;
            if (i6 == 1) {
                f2 = (float) i5;
                f3 = f2 / 2.0f;
            } else if (i6 != 2) {
                f3 = ((float) i3) - (((float) i5) / 2.0f);
            } else {
                f2 = (float) i3;
                f3 = f2 / 2.0f;
            }
            float f4 = f / 2.0f;
            float f5 = f3 - f4;
            float f6 = f3 + f4;
            this.f104764n.setColor(i4);
            if (this.f104761k == -1) {
                this.f104756f.set((float) i, f5, (float) i2, f6);
            } else {
                float abs = ((float) (Math.abs(i - i2) - this.f104761k)) / 2.0f;
                this.f104756f.set(((float) i) + abs, f5, ((float) i2) - abs, f6);
            }
            float f7 = this.f104763m;
            if (f7 > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawRoundRect(this.f104756f, f7, f7, this.f104764n);
            } else {
                canvas.drawRect(this.f104756f, this.f104764n);
            }
        }
    }
}
