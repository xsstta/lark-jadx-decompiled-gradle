package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class NiceImageView extends AppCompatImageView {

    /* renamed from: a */
    private Context f20858a;

    /* renamed from: b */
    private boolean f20859b;

    /* renamed from: c */
    private boolean f20860c;

    /* renamed from: d */
    private int f20861d;

    /* renamed from: e */
    private int f20862e;

    /* renamed from: f */
    private int f20863f;

    /* renamed from: g */
    private int f20864g;

    /* renamed from: h */
    private int f20865h;

    /* renamed from: i */
    private int f20866i;

    /* renamed from: j */
    private int f20867j;

    /* renamed from: k */
    private int f20868k;

    /* renamed from: l */
    private int f20869l;

    /* renamed from: m */
    private int f20870m;

    /* renamed from: n */
    private Xfermode f20871n;

    /* renamed from: o */
    private int f20872o;

    /* renamed from: p */
    private int f20873p;

    /* renamed from: q */
    private float f20874q;

    /* renamed from: r */
    private float[] f20875r;

    /* renamed from: s */
    private float[] f20876s;

    /* renamed from: t */
    private RectF f20877t;

    /* renamed from: u */
    private RectF f20878u;

    /* renamed from: v */
    private Paint f20879v;

    /* renamed from: w */
    private Path f20880w;

    /* renamed from: x */
    private Path f20881x;

    /* renamed from: d */
    private void m30896d() {
        if (!this.f20859b) {
            this.f20863f = 0;
        }
    }

    /* renamed from: a */
    private void m30888a() {
        if (!this.f20859b) {
            RectF rectF = this.f20878u;
            int i = this.f20861d;
            rectF.set(((float) i) / 2.0f, ((float) i) / 2.0f, ((float) this.f20872o) - (((float) i) / 2.0f), ((float) this.f20873p) - (((float) i) / 2.0f));
        }
    }

    /* renamed from: b */
    private void m30894b() {
        if (this.f20859b) {
            float min = ((float) Math.min(this.f20872o, this.f20873p)) / 2.0f;
            this.f20874q = min;
            RectF rectF = this.f20877t;
            int i = this.f20872o;
            int i2 = this.f20873p;
            rectF.set((((float) i) / 2.0f) - min, (((float) i2) / 2.0f) - min, (((float) i) / 2.0f) + min, (((float) i2) / 2.0f) + min);
            return;
        }
        this.f20877t.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f20872o, (float) this.f20873p);
        if (this.f20860c) {
            this.f20877t = this.f20878u;
        }
    }

    /* renamed from: c */
    private void m30895c() {
        if (!this.f20859b) {
            int i = 0;
            if (this.f20865h > 0) {
                while (true) {
                    float[] fArr = this.f20875r;
                    if (i < fArr.length) {
                        int i2 = this.f20865h;
                        fArr[i] = (float) i2;
                        this.f20876s[i] = ((float) i2) - (((float) this.f20861d) / 2.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                float[] fArr2 = this.f20875r;
                int i3 = this.f20866i;
                float f = (float) i3;
                fArr2[1] = f;
                fArr2[0] = f;
                int i4 = this.f20867j;
                float f2 = (float) i4;
                fArr2[3] = f2;
                fArr2[2] = f2;
                int i5 = this.f20869l;
                float f3 = (float) i5;
                fArr2[5] = f3;
                fArr2[4] = f3;
                int i6 = this.f20868k;
                float f4 = (float) i6;
                fArr2[7] = f4;
                fArr2[6] = f4;
                float[] fArr3 = this.f20876s;
                int i7 = this.f20861d;
                float f5 = ((float) i3) - (((float) i7) / 2.0f);
                fArr3[1] = f5;
                fArr3[0] = f5;
                float f6 = ((float) i4) - (((float) i7) / 2.0f);
                fArr3[3] = f6;
                fArr3[2] = f6;
                float f7 = ((float) i5) - (((float) i7) / 2.0f);
                fArr3[5] = f7;
                fArr3[4] = f7;
                float f8 = ((float) i6) - (((float) i7) / 2.0f);
                fArr3[7] = f8;
                fArr3[6] = f8;
            }
        }
    }

    public NiceImageView(Context context) {
        this(context, null);
    }

    public void setBorderColor(int i) {
        this.f20862e = i;
        invalidate();
    }

    public void setInnerBorderColor(int i) {
        this.f20864g = i;
        invalidate();
    }

    public void setMaskColor(int i) {
        this.f20870m = i;
        invalidate();
    }

    /* renamed from: a */
    private void m30893a(boolean z) {
        if (z) {
            this.f20865h = 0;
        }
        m30895c();
        m30888a();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f20861d = C13749l.m55758d(this.f20858a, i);
        m30893a(false);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.f20868k = C13749l.m55758d(this.f20858a, i);
        m30893a(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.f20869l = C13749l.m55758d(this.f20858a, i);
        m30893a(true);
    }

    public void setCornerRadius(int i) {
        this.f20865h = C13749l.m55758d(this.f20858a, i);
        m30893a(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.f20866i = C13749l.m55758d(this.f20858a, i);
        m30893a(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.f20867j = C13749l.m55758d(this.f20858a, i);
        m30893a(true);
    }

    public void setInnerBorderWidth(int i) {
        this.f20863f = C13749l.m55758d(this.f20858a, i);
        m30896d();
        invalidate();
    }

    /* renamed from: a */
    private void m30890a(Canvas canvas) {
        if (this.f20859b) {
            int i = this.f20861d;
            if (i > 0) {
                m30891a(canvas, i, this.f20862e, this.f20874q - (((float) i) / 2.0f));
            }
            int i2 = this.f20863f;
            if (i2 > 0) {
                m30891a(canvas, i2, this.f20864g, (this.f20874q - ((float) this.f20861d)) - (((float) i2) / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.f20861d;
        if (i3 > 0) {
            m30892a(canvas, i3, this.f20862e, this.f20878u, this.f20875r);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.f20877t, null, 31);
        if (!this.f20860c) {
            int i = this.f20872o;
            int i2 = this.f20861d;
            int i3 = this.f20863f;
            int i4 = this.f20873p;
            canvas.scale((((float) ((i - (i2 * 2)) - (i3 * 2))) * 1.0f) / ((float) i), (((float) ((i4 - (i2 * 2)) - (i3 * 2))) * 1.0f) / ((float) i4), ((float) i) / 2.0f, ((float) i4) / 2.0f);
        }
        super.onDraw(canvas);
        this.f20879v.reset();
        this.f20880w.reset();
        if (this.f20859b) {
            this.f20880w.addCircle(((float) this.f20872o) / 2.0f, ((float) this.f20873p) / 2.0f, this.f20874q, Path.Direction.CCW);
        } else {
            this.f20880w.addRoundRect(this.f20877t, this.f20876s, Path.Direction.CCW);
        }
        this.f20879v.setAntiAlias(true);
        this.f20879v.setStyle(Paint.Style.FILL);
        this.f20879v.setXfermode(this.f20871n);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.f20880w, this.f20879v);
        } else {
            this.f20881x.reset();
            this.f20881x.addRect(this.f20877t, Path.Direction.CCW);
            this.f20881x.op(this.f20880w, Path.Op.DIFFERENCE);
            canvas.drawPath(this.f20881x, this.f20879v);
        }
        this.f20879v.setXfermode(null);
        int i5 = this.f20870m;
        if (i5 != 0) {
            this.f20879v.setColor(i5);
            canvas.drawPath(this.f20880w, this.f20879v);
        }
        canvas.restore();
        m30890a(canvas);
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m30889a(int i, int i2) {
        this.f20880w.reset();
        this.f20879v.setStrokeWidth((float) i);
        this.f20879v.setColor(i2);
        this.f20879v.setStyle(Paint.Style.STROKE);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20862e = -1;
        this.f20864g = -1;
        this.f20858a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.border_color, R.attr.border_width, R.attr.corner_bottom_left_radius, R.attr.corner_bottom_right_radius, R.attr.corner_radius, R.attr.corner_top_left_radius, R.attr.corner_top_right_radius, R.attr.inner_border_color, R.attr.inner_border_width, R.attr.is_circle, R.attr.is_cover_src, R.attr.mask_color}, 0, 0);
        for (int i2 = 0; i2 < obtainStyledAttributes.getIndexCount(); i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 10) {
                this.f20860c = obtainStyledAttributes.getBoolean(index, this.f20860c);
            } else if (index == 9) {
                this.f20859b = obtainStyledAttributes.getBoolean(index, this.f20859b);
            } else if (index == 1) {
                this.f20861d = obtainStyledAttributes.getDimensionPixelSize(index, this.f20861d);
            } else if (index == 0) {
                this.f20862e = obtainStyledAttributes.getColor(index, this.f20862e);
            } else if (index == 8) {
                this.f20863f = obtainStyledAttributes.getDimensionPixelSize(index, this.f20863f);
            } else if (index == 7) {
                this.f20864g = obtainStyledAttributes.getColor(index, this.f20864g);
            } else if (index == 4) {
                this.f20865h = obtainStyledAttributes.getDimensionPixelSize(index, this.f20865h);
            } else if (index == 5) {
                this.f20866i = obtainStyledAttributes.getDimensionPixelSize(index, this.f20866i);
            } else if (index == 6) {
                this.f20867j = obtainStyledAttributes.getDimensionPixelSize(index, this.f20867j);
            } else if (index == 2) {
                this.f20868k = obtainStyledAttributes.getDimensionPixelSize(index, this.f20868k);
            } else if (index == 3) {
                this.f20869l = obtainStyledAttributes.getDimensionPixelSize(index, this.f20869l);
            } else if (index == 11) {
                this.f20870m = obtainStyledAttributes.getColor(index, this.f20870m);
            }
        }
        obtainStyledAttributes.recycle();
        this.f20875r = new float[8];
        this.f20876s = new float[8];
        this.f20878u = new RectF();
        this.f20877t = new RectF();
        this.f20879v = new Paint();
        this.f20880w = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.f20871n = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.f20871n = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f20881x = new Path();
        }
        m30895c();
        m30896d();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f20872o = i;
        this.f20873p = i2;
        m30888a();
        m30894b();
    }

    /* renamed from: a */
    private void m30891a(Canvas canvas, int i, int i2, float f) {
        m30889a(i, i2);
        this.f20880w.addCircle(((float) this.f20872o) / 2.0f, ((float) this.f20873p) / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.f20880w, this.f20879v);
    }

    /* renamed from: a */
    private void m30892a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        m30889a(i, i2);
        this.f20880w.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.f20880w, this.f20879v);
    }
}
