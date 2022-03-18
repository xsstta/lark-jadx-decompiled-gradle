package io.supercharge.shimmerlayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class ShimmerLayout extends FrameLayout {

    /* renamed from: a */
    public int f173015a;

    /* renamed from: b */
    private Rect f173016b;

    /* renamed from: c */
    private Paint f173017c;

    /* renamed from: d */
    private ValueAnimator f173018d;

    /* renamed from: e */
    private Bitmap f173019e;

    /* renamed from: f */
    private Bitmap f173020f;

    /* renamed from: g */
    private Canvas f173021g;

    /* renamed from: h */
    private boolean f173022h;

    /* renamed from: i */
    private boolean f173023i;

    /* renamed from: j */
    private boolean f173024j;

    /* renamed from: k */
    private int f173025k;

    /* renamed from: l */
    private int f173026l;

    /* renamed from: m */
    private int f173027m;

    /* renamed from: n */
    private float f173028n;

    /* renamed from: o */
    private float f173029o;

    /* renamed from: p */
    private ViewTreeObserver.OnPreDrawListener f173030p;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m265617d();
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    private void m265616c() {
        if (this.f173023i) {
            m265617d();
            mo238795a();
        }
    }

    /* renamed from: e */
    private void m265618e() {
        this.f173021g = null;
        Bitmap bitmap = this.f173020f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f173020f = null;
        }
    }

    /* renamed from: g */
    private Rect m265620g() {
        return new Rect(0, 0, m265621h(), getHeight());
    }

    /* renamed from: d */
    private void m265617d() {
        ValueAnimator valueAnimator = this.f173018d;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f173018d.removeAllUpdateListeners();
        }
        this.f173018d = null;
        this.f173017c = null;
        this.f173023i = false;
        m265618e();
    }

    private float[] getGradientColorDistribution() {
        float[] fArr = new float[4];
        fArr[0] = 0.0f;
        fArr[3] = 1.0f;
        float f = this.f173029o;
        fArr[1] = 0.5f - (f / 2.0f);
        fArr[2] = (f / 2.0f) + 0.5f;
        return fArr;
    }

    private Bitmap getMaskBitmap() {
        if (this.f173020f == null) {
            this.f173020f = m265612a(this.f173016b.width(), getHeight());
        }
        return this.f173020f;
    }

    /* renamed from: h */
    private int m265621h() {
        return (int) ((((double) (((float) (getWidth() / 2)) * this.f173028n)) / Math.cos(Math.toRadians((double) Math.abs(this.f173027m)))) + (((double) getHeight()) * Math.tan(Math.toRadians((double) Math.abs(this.f173027m)))));
    }

    /* renamed from: a */
    public void mo238795a() {
        if (!this.f173023i) {
            if (getWidth() == 0) {
                this.f173030p = new ViewTreeObserver.OnPreDrawListener() {
                    /* class io.supercharge.shimmerlayout.ShimmerLayout.ViewTreeObserver$OnPreDrawListenerC690171 */

                    public boolean onPreDraw() {
                        ShimmerLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                        ShimmerLayout.this.mo238795a();
                        return true;
                    }
                };
                getViewTreeObserver().addOnPreDrawListener(this.f173030p);
                return;
            }
            getShimmerAnimation().start();
            this.f173023i = true;
        }
    }

    private Animator getShimmerAnimation() {
        final int i;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f173018d;
        if (valueAnimator2 != null) {
            return valueAnimator2;
        }
        if (this.f173016b == null) {
            this.f173016b = m265620g();
        }
        int width = getWidth();
        if (getWidth() > this.f173016b.width()) {
            i = -width;
        } else {
            i = -this.f173016b.width();
        }
        final int width2 = this.f173016b.width();
        int i2 = width - i;
        if (this.f173022h) {
            valueAnimator = ValueAnimator.ofInt(i2, 0);
        } else {
            valueAnimator = ValueAnimator.ofInt(0, i2);
        }
        this.f173018d = valueAnimator;
        valueAnimator.setDuration((long) this.f173025k);
        this.f173018d.setRepeatCount(-1);
        this.f173018d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class io.supercharge.shimmerlayout.ShimmerLayout.C690182 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShimmerLayout.this.f173015a = i + ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (ShimmerLayout.this.f173015a + width2 >= 0) {
                    ShimmerLayout.this.invalidate();
                }
            }
        });
        return this.f173018d;
    }

    /* renamed from: b */
    public void mo238796b() {
        if (this.f173030p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f173030p);
        }
        m265617d();
    }

    /* renamed from: f */
    private void m265619f() {
        float f;
        if (this.f173017c == null) {
            int b = m265614b(this.f173026l);
            float width = ((float) (getWidth() / 2)) * this.f173028n;
            if (this.f173027m >= 0) {
                f = (float) getHeight();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            int i = this.f173026l;
            ComposeShader composeShader = new ComposeShader(new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, f, ((float) Math.cos(Math.toRadians((double) this.f173027m))) * width, f + (((float) Math.sin(Math.toRadians((double) this.f173027m))) * width), new int[]{b, i, i, b}, getGradientColorDistribution(), Shader.TileMode.CLAMP), new BitmapShader(this.f173019e, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP), PorterDuff.Mode.DST_IN);
            Paint paint = new Paint();
            this.f173017c = paint;
            paint.setAntiAlias(true);
            this.f173017c.setDither(true);
            this.f173017c.setFilterBitmap(true);
            this.f173017c.setShader(composeShader);
        }
    }

    public ShimmerLayout(Context context) {
        this(context, null);
    }

    public void setAnimationReversed(boolean z) {
        this.f173022h = z;
        m265616c();
    }

    public void setShimmerAnimationDuration(int i) {
        this.f173025k = i;
        m265616c();
    }

    public void setShimmerColor(int i) {
        this.f173026l = i;
        m265616c();
    }

    /* renamed from: a */
    private int m265611a(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return getContext().getColor(i);
        }
        return getResources().getColor(i);
    }

    /* renamed from: b */
    private int m265614b(int i) {
        return Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.f173023i || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
        } else {
            m265613a(canvas);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            mo238796b();
        } else if (this.f173024j) {
            mo238795a();
        }
    }

    /* renamed from: b */
    private void m265615b(Canvas canvas) {
        m265619f();
        canvas.save();
        canvas.translate((float) this.f173015a, BitmapDescriptorFactory.HUE_RED);
        canvas.drawRect((float) this.f173016b.left, BitmapDescriptorFactory.HUE_RED, (float) this.f173016b.width(), (float) this.f173016b.height(), this.f173017c);
        canvas.restore();
    }

    public void setGradientCenterColorWidth(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED || 1.0f <= f) {
            throw new IllegalArgumentException(String.format("gradientCenterColorWidth value must be higher than %d and less than %d", (byte) 0, (byte) 1));
        }
        this.f173029o = f;
        m265616c();
    }

    public void setMaskWidth(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED || 1.0f < f) {
            throw new IllegalArgumentException(String.format("maskWidth value must be higher than %d and less or equal to %d", (byte) 0, (byte) 1));
        }
        this.f173028n = f;
        m265616c();
    }

    public void setShimmerAngle(int i) {
        if (i < -45 || 45 < i) {
            throw new IllegalArgumentException(String.format("shimmerAngle value must be between %d and %d", (byte) -45, (byte) 45));
        }
        this.f173027m = i;
        m265616c();
    }

    /* renamed from: a */
    private void m265613a(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap maskBitmap = getMaskBitmap();
        this.f173019e = maskBitmap;
        if (maskBitmap != null) {
            if (this.f173021g == null) {
                this.f173021g = new Canvas(this.f173019e);
            }
            this.f173021g.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f173021g.save();
            this.f173021g.translate((float) (-this.f173015a), BitmapDescriptorFactory.HUE_RED);
            super.dispatchDraw(this.f173021g);
            this.f173021g.restore();
            m265615b(canvas);
            this.f173019e = null;
        }
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private Bitmap m265612a(int i, int i2) {
        try {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public ShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.shimmer_angle, R.attr.shimmer_animation_duration, R.attr.shimmer_auto_start, R.attr.shimmer_color, R.attr.shimmer_gradient_center_color_width, R.attr.shimmer_mask_width, R.attr.shimmer_reverse_animation}, 0, 0);
        try {
            this.f173027m = obtainStyledAttributes.getInteger(0, 20);
            this.f173025k = obtainStyledAttributes.getInteger(1, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            this.f173026l = obtainStyledAttributes.getColor(3, m265611a(R.color.shimmer_color));
            this.f173024j = obtainStyledAttributes.getBoolean(2, false);
            this.f173028n = obtainStyledAttributes.getFloat(5, 0.5f);
            this.f173029o = obtainStyledAttributes.getFloat(4, 0.1f);
            this.f173022h = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
            setMaskWidth(this.f173028n);
            setGradientCenterColorWidth(this.f173029o);
            setShimmerAngle(this.f173027m);
            if (this.f173024j && getVisibility() == 0) {
                mo238795a();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
