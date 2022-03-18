package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class MmFadingEdgeLayout extends FrameLayout {

    /* renamed from: a */
    private static final int[] f118729a = {0, -16777216, -16777216, 0};

    /* renamed from: b */
    private static final int[] f118730b = {-16777216, 0};

    /* renamed from: c */
    private boolean f118731c;

    /* renamed from: d */
    private boolean f118732d;

    /* renamed from: e */
    private boolean f118733e;

    /* renamed from: f */
    private boolean f118734f;

    /* renamed from: g */
    private int f118735g;

    /* renamed from: h */
    private int f118736h;

    /* renamed from: i */
    private int f118737i;

    /* renamed from: j */
    private int f118738j;

    /* renamed from: k */
    private Paint f118739k;

    /* renamed from: l */
    private Paint f118740l;

    /* renamed from: m */
    private Paint f118741m;

    /* renamed from: n */
    private Paint f118742n;

    /* renamed from: o */
    private Rect f118743o;

    /* renamed from: p */
    private Rect f118744p;

    /* renamed from: q */
    private Rect f118745q;

    /* renamed from: r */
    private Rect f118746r;

    /* renamed from: s */
    private int f118747s;

    /* renamed from: b */
    private void m186646b() {
        int min = Math.min(this.f118737i, (getWidth() - getPaddingLeft()) - getPaddingRight());
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i = min + paddingLeft;
        this.f118745q.set(paddingLeft, paddingTop, i, getHeight() - getPaddingBottom());
        float f = (float) paddingTop;
        this.f118741m.setShader(new LinearGradient((float) paddingLeft, f, (float) i, f, f118729a, (float[]) null, Shader.TileMode.CLAMP));
    }

    /* renamed from: a */
    private void m186644a() {
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i = height + paddingTop;
        this.f118743o.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), i);
        float f = (float) paddingLeft;
        this.f118739k.setShader(new LinearGradient(f, (float) paddingTop, f, (float) i, f118729a, new float[]{0.05f, 0.09f, 0.3f, 0.92f}, Shader.TileMode.CLAMP));
    }

    /* renamed from: c */
    private void m186647c() {
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(this.f118736h, height);
        int paddingLeft = getPaddingLeft();
        int paddingTop = (getPaddingTop() + height) - min;
        int i = min + paddingTop;
        this.f118744p.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), i);
        float f = (float) paddingLeft;
        this.f118740l.setShader(new LinearGradient(f, (float) paddingTop, f, (float) i, f118730b, (float[]) null, Shader.TileMode.CLAMP));
    }

    /* renamed from: d */
    private void m186648d() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(this.f118738j, width);
        int paddingLeft = (getPaddingLeft() + width) - min;
        int paddingTop = getPaddingTop();
        int i = min + paddingLeft;
        this.f118746r.set(paddingLeft, paddingTop, i, getHeight() - getPaddingBottom());
        float f = (float) paddingTop;
        this.f118742n.setShader(new LinearGradient((float) paddingLeft, f, (float) i, f, f118730b, (float[]) null, Shader.TileMode.CLAMP));
    }

    public MmFadingEdgeLayout(Context context) {
        super(context);
        m186645a(null, 0);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        int width = getWidth();
        int height = getHeight();
        if (this.f118731c || this.f118732d || this.f118733e || this.f118734f) {
            z = true;
        } else {
            z = false;
        }
        if (getVisibility() == 8 || width == 0 || height == 0 || !z) {
            super.dispatchDraw(canvas);
            return;
        }
        int i = this.f118747s;
        if ((i & 1) == 1) {
            this.f118747s = i & -2;
            m186644a();
        }
        int i2 = this.f118747s;
        if ((i2 & 4) == 4) {
            this.f118747s = i2 & -5;
            m186646b();
        }
        int i3 = this.f118747s;
        if ((i3 & 2) == 2) {
            this.f118747s = i3 & -3;
            m186647c();
        }
        int i4 = this.f118747s;
        if ((i4 & 8) == 8) {
            this.f118747s = i4 & -9;
            m186648d();
        }
        int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), null, 31);
        super.dispatchDraw(canvas);
        if (this.f118731c && this.f118735g > 0) {
            canvas.drawRect(this.f118743o, this.f118739k);
        }
        if (this.f118732d && this.f118736h > 0) {
            canvas.drawRect(this.f118744p, this.f118740l);
        }
        if (this.f118733e && this.f118737i > 0) {
            canvas.drawRect(this.f118745q, this.f118741m);
        }
        if (this.f118734f && this.f118738j > 0) {
            canvas.drawRect(this.f118746r, this.f118742n);
        }
        canvas.restoreToCount(saveLayer);
    }

    public MmFadingEdgeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m186645a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m186645a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int applyDimension = (int) TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        if (attributeSet != null) {
            boolean z4 = false;
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.fel_edge, R.attr.fel_size_bottom, R.attr.fel_size_left, R.attr.fel_size_right, R.attr.fel_size_top}, i, 0);
            int i2 = obtainStyledAttributes.getInt(0, 0);
            if ((i2 & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f118731c = z;
            if ((i2 & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f118732d = z2;
            if ((i2 & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f118733e = z3;
            if ((i2 & 8) == 8) {
                z4 = true;
            }
            this.f118734f = z4;
            this.f118735g = obtainStyledAttributes.getDimensionPixelSize(4, applyDimension);
            this.f118736h = obtainStyledAttributes.getDimensionPixelSize(1, applyDimension);
            this.f118737i = obtainStyledAttributes.getDimensionPixelSize(2, applyDimension);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, applyDimension);
            this.f118738j = dimensionPixelSize;
            if (this.f118731c && this.f118735g > 0) {
                this.f118747s |= 1;
            }
            if (this.f118733e && this.f118737i > 0) {
                this.f118747s |= 4;
            }
            if (this.f118732d && this.f118736h > 0) {
                this.f118747s |= 2;
            }
            if (this.f118734f && dimensionPixelSize > 0) {
                this.f118747s |= 8;
            }
            obtainStyledAttributes.recycle();
        } else {
            this.f118738j = applyDimension;
            this.f118737i = applyDimension;
            this.f118736h = applyDimension;
            this.f118735g = applyDimension;
        }
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Paint paint = new Paint(1);
        this.f118739k = paint;
        paint.setXfermode(porterDuffXfermode);
        Paint paint2 = new Paint(1);
        this.f118740l = paint2;
        paint2.setXfermode(porterDuffXfermode);
        Paint paint3 = new Paint(1);
        this.f118741m = paint3;
        paint3.setXfermode(porterDuffXfermode);
        Paint paint4 = new Paint(1);
        this.f118742n = paint4;
        paint4.setXfermode(porterDuffXfermode);
        this.f118743o = new Rect();
        this.f118745q = new Rect();
        this.f118744p = new Rect();
        this.f118746r = new Rect();
    }

    public MmFadingEdgeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m186645a(attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f118747s | 4;
            this.f118747s = i5;
            this.f118747s = i5 | 8;
        }
        if (i2 != i4) {
            int i6 = this.f118747s | 1;
            this.f118747s = i6;
            this.f118747s = i6 | 2;
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (getPaddingLeft() != i) {
            this.f118747s |= 4;
        }
        if (getPaddingTop() != i2) {
            this.f118747s |= 1;
        }
        if (getPaddingRight() != i3) {
            this.f118747s |= 8;
        }
        if (getPaddingBottom() != i4) {
            this.f118747s |= 2;
        }
        super.setPadding(i, i2, i3, i4);
    }
}
