package com.ss.android.vc.meeting.module.follow.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class VCShadowLayout extends FrameLayout {

    /* renamed from: a */
    private final Paint f155125a;

    /* renamed from: b */
    private Bitmap f155126b;

    /* renamed from: c */
    private final Canvas f155127c;

    /* renamed from: d */
    private final Rect f155128d;

    /* renamed from: e */
    private boolean f155129e;

    /* renamed from: f */
    private boolean f155130f;

    /* renamed from: g */
    private int f155131g;

    /* renamed from: h */
    private int f155132h;

    /* renamed from: i */
    private float f155133i;

    /* renamed from: j */
    private float f155134j;

    /* renamed from: k */
    private float f155135k;

    /* renamed from: l */
    private float f155136l;

    /* renamed from: m */
    private float f155137m;

    private float getShadowAngle() {
        return this.f155135k;
    }

    public int getShadowColor() {
        return this.f155131g;
    }

    public float getShadowDistance() {
        return this.f155134j;
    }

    public float getShadowDx() {
        return this.f155136l;
    }

    public float getShadowDy() {
        return this.f155137m;
    }

    public float getShadowRadius() {
        return this.f155133i;
    }

    public void requestLayout() {
        this.f155129e = true;
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f155126b;
        if (bitmap != null) {
            bitmap.recycle();
            this.f155126b = null;
        }
    }

    /* renamed from: a */
    private void m241457a() {
        int abs = (int) (Math.abs(this.f155136l) + this.f155133i);
        int abs2 = (int) (Math.abs(this.f155137m) + this.f155133i);
        setPadding(abs, abs2, abs, abs2);
        requestLayout();
    }

    public VCShadowLayout(Context context) {
        this(context, null);
    }

    public void setInvalidateShadow(boolean z) {
        this.f155129e = z;
        postInvalidate();
    }

    public void setIsShadowed(boolean z) {
        this.f155130f = z;
        postInvalidate();
    }

    public void setShadowColor(int i) {
        this.f155131g = i;
        this.f155132h = Color.alpha(i);
        requestLayout();
    }

    /* renamed from: a */
    private int m241456a(boolean z) {
        int i;
        if (z) {
            i = 255;
        } else {
            i = this.f155132h;
        }
        return Color.argb(i, Color.red(this.f155131g), Color.green(this.f155131g), Color.blue(this.f155131g));
    }

    private void setShadowAngle(float f) {
        float max = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(f, 360.0f));
        this.f155135k = max;
        this.f155136l = (float) (((double) this.f155134j) * Math.cos(((double) (max / 180.0f)) * 3.141592653589793d));
        this.f155137m = (float) (((double) this.f155134j) * Math.sin(((double) (this.f155135k / 180.0f)) * 3.141592653589793d));
        m241457a();
    }

    private void setShadowDistance(float f) {
        this.f155134j = f;
        this.f155136l = (float) (((double) f) * Math.cos(((double) (this.f155135k / 180.0f)) * 3.141592653589793d));
        this.f155137m = (float) (((double) this.f155134j) * Math.sin(((double) (this.f155135k / 180.0f)) * 3.141592653589793d));
        m241457a();
    }

    public void setShadowRadius(float f) {
        this.f155133i = Math.max(0.1f, f);
        if (!isInEditMode()) {
            this.f155125a.setMaskFilter(new BlurMaskFilter(this.f155133i, BlurMaskFilter.Blur.NORMAL));
            m241457a();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f155130f) {
            if (this.f155129e) {
                if (this.f155128d.width() == 0 || this.f155128d.height() == 0) {
                    this.f155126b = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(this.f155128d.width(), this.f155128d.height(), Bitmap.Config.ARGB_8888);
                    this.f155126b = createBitmap;
                    this.f155127c.setBitmap(createBitmap);
                    this.f155129e = true;
                    super.dispatchDraw(this.f155127c);
                    Bitmap extractAlpha = this.f155126b.extractAlpha();
                    this.f155127c.drawColor(0, PorterDuff.Mode.CLEAR);
                    this.f155125a.setColor(m241456a(false));
                    this.f155127c.drawBitmap(extractAlpha, this.f155136l, this.f155137m, this.f155125a);
                    extractAlpha.recycle();
                }
            }
            this.f155125a.setColor(m241456a(true));
            if (!(this.f155127c == null || (bitmap = this.f155126b) == null || bitmap.isRecycled())) {
                canvas.drawBitmap(this.f155126b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f155125a);
            }
        }
        super.dispatchDraw(canvas);
    }

    public VCShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f155128d.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public VCShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C618041 r6 = new Paint(1) {
            /* class com.ss.android.vc.meeting.module.follow.common.VCShadowLayout.C618041 */

            {
                setDither(true);
                setFilterBitmap(true);
            }
        };
        this.f155125a = r6;
        this.f155127c = new Canvas();
        this.f155128d = new Rect();
        this.f155129e = true;
        setWillNotDraw(false);
        setLayerType(2, r6);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sl_shadow_angle, R.attr.sl_shadow_color, R.attr.sl_shadow_distance, R.attr.sl_shadow_radius, R.attr.sl_shadowed});
        try {
            setIsShadowed(obtainStyledAttributes.getBoolean(4, true));
            setShadowRadius(obtainStyledAttributes.getDimension(3, 30.0f));
            setShadowDistance(obtainStyledAttributes.getDimension(2, 15.0f));
            setShadowAngle((float) obtainStyledAttributes.getInteger(0, 45));
            setShadowColor(obtainStyledAttributes.getColor(1, -12303292));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
