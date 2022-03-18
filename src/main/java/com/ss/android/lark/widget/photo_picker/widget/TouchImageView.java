package com.ss.android.lark.widget.photo_picker.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class TouchImageView extends AppCompatImageView {

    /* renamed from: A */
    private float f145655A;

    /* renamed from: B */
    private float f145656B;

    /* renamed from: a */
    public float f145657a;

    /* renamed from: b */
    public Matrix f145658b;

    /* renamed from: c */
    public EnumC58885h f145659c;

    /* renamed from: d */
    public float f145660d;

    /* renamed from: e */
    public float f145661e;

    /* renamed from: f */
    public float[] f145662f;

    /* renamed from: g */
    public Context f145663g;

    /* renamed from: h */
    public RunnableC58880c f145664h;

    /* renamed from: i */
    public int f145665i;

    /* renamed from: j */
    public int f145666j;

    /* renamed from: k */
    public ScaleGestureDetector f145667k;

    /* renamed from: l */
    public GestureDetector f145668l;

    /* renamed from: m */
    public GestureDetector.OnDoubleTapListener f145669m;

    /* renamed from: n */
    public View.OnTouchListener f145670n;

    /* renamed from: o */
    public AbstractC58882e f145671o;

    /* renamed from: p */
    private Matrix f145672p;

    /* renamed from: q */
    private float f145673q;

    /* renamed from: r */
    private float f145674r;

    /* renamed from: s */
    private ImageView.ScaleType f145675s;

    /* renamed from: t */
    private boolean f145676t;

    /* renamed from: u */
    private boolean f145677u;

    /* renamed from: v */
    private C58886i f145678v;

    /* renamed from: w */
    private int f145679w;

    /* renamed from: x */
    private int f145680x;

    /* renamed from: y */
    private float f145681y;

    /* renamed from: z */
    private float f145682z;

    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$e */
    public interface AbstractC58882e {
        /* renamed from: a */
        void mo199547a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$h */
    public enum EnumC58885h {
        NONE,
        DRAG,
        ZOOM,
        FLING,
        ANIMATE_ZOOM
    }

    /* renamed from: c */
    private float m228393c(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= f2) {
            f4 = f2 - f3;
            f5 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f5 = f2 - f3;
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        return f < f5 ? (-f) + f5 : f > f4 ? (-f) + f4 : BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    public float mo199506b(float f, float f2, float f3) {
        return f3 <= f2 ? BitmapDescriptorFactory.HUE_RED : f;
    }

    public float getCurrentZoom() {
        return this.f145657a;
    }

    public float getMaxZoom() {
        return this.f145661e;
    }

    public float getMinZoom() {
        return this.f145660d;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f145675s;
    }

    public float getImageHeight() {
        return this.f145682z * this.f145657a;
    }

    public float getImageWidth() {
        return this.f145681y * this.f145657a;
    }

    /* renamed from: b */
    public void mo199507b() {
        this.f145657a = 1.0f;
        m228395f();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$a */
    public class C58878a {

        /* renamed from: a */
        Scroller f145684a;

        /* renamed from: b */
        OverScroller f145685b;

        /* renamed from: c */
        boolean f145686c;

        /* renamed from: a */
        public boolean mo199535a() {
            if (this.f145686c) {
                return this.f145684a.isFinished();
            }
            return this.f145685b.isFinished();
        }

        /* renamed from: b */
        public boolean mo199536b() {
            if (this.f145686c) {
                return this.f145684a.computeScrollOffset();
            }
            this.f145685b.computeScrollOffset();
            return this.f145685b.computeScrollOffset();
        }

        /* renamed from: c */
        public int mo199537c() {
            if (this.f145686c) {
                return this.f145684a.getCurrX();
            }
            return this.f145685b.getCurrX();
        }

        /* renamed from: d */
        public int mo199538d() {
            if (this.f145686c) {
                return this.f145684a.getCurrY();
            }
            return this.f145685b.getCurrY();
        }

        /* renamed from: a */
        public void mo199534a(boolean z) {
            if (this.f145686c) {
                this.f145684a.forceFinished(z);
            } else {
                this.f145685b.forceFinished(z);
            }
        }

        public C58878a(Context context) {
            if (Build.VERSION.SDK_INT < 9) {
                this.f145686c = true;
                this.f145684a = new Scroller(context);
                return;
            }
            this.f145686c = false;
            this.f145685b = new OverScroller(context);
        }

        /* renamed from: a */
        public void mo199533a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f145686c) {
                this.f145684a.fling(i, i2, i3, i4, i5, i6, i7, i8);
            } else {
                this.f145685b.fling(i, i2, i3, i4, i5, i6, i7, i8);
            }
        }
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$b */
    private class RunnableC58879b implements Runnable {

        /* renamed from: b */
        private long f145689b;

        /* renamed from: c */
        private float f145690c;

        /* renamed from: d */
        private float f145691d;

        /* renamed from: e */
        private float f145692e;

        /* renamed from: f */
        private float f145693f;

        /* renamed from: g */
        private boolean f145694g;

        /* renamed from: h */
        private AccelerateDecelerateInterpolator f145695h = new AccelerateDecelerateInterpolator();

        /* renamed from: i */
        private PointF f145696i;

        /* renamed from: j */
        private PointF f145697j;

        /* renamed from: a */
        private float m228413a() {
            return this.f145695h.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f145689b)) / 500.0f));
        }

        public void run() {
            float a = m228413a();
            TouchImageView.this.mo199501a(m228415b(a), this.f145692e, this.f145693f, this.f145694g);
            m228414a(a);
            TouchImageView.this.mo199510d();
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.setImageMatrix(touchImageView.f145658b);
            if (TouchImageView.this.f145671o != null) {
                TouchImageView.this.f145671o.mo199547a();
            }
            if (a < 1.0f) {
                TouchImageView.this.mo199504a(this);
            } else {
                TouchImageView.this.setState(EnumC58885h.NONE);
            }
        }

        /* renamed from: b */
        private double m228415b(float f) {
            float f2 = this.f145690c;
            return ((double) (f2 + (f * (this.f145691d - f2)))) / ((double) TouchImageView.this.f145657a);
        }

        /* renamed from: a */
        private void m228414a(float f) {
            float f2 = this.f145696i.x + ((this.f145697j.x - this.f145696i.x) * f);
            float f3 = this.f145696i.y + (f * (this.f145697j.y - this.f145696i.y));
            PointF a = TouchImageView.this.mo199499a(this.f145692e, this.f145693f);
            TouchImageView.this.f145658b.postTranslate(f2 - a.x, f3 - a.y);
        }

        RunnableC58879b(float f, float f2, float f3, boolean z) {
            TouchImageView.this.setState(EnumC58885h.ANIMATE_ZOOM);
            this.f145689b = System.currentTimeMillis();
            this.f145690c = TouchImageView.this.f145657a;
            this.f145691d = f;
            this.f145694g = z;
            PointF a = TouchImageView.this.mo199500a(f2, f3, false);
            this.f145692e = a.x;
            float f4 = a.y;
            this.f145693f = f4;
            this.f145696i = TouchImageView.this.mo199499a(this.f145692e, f4);
            this.f145697j = new PointF((float) (TouchImageView.this.f145665i / 2), (float) (TouchImageView.this.f145666j / 2));
        }
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$c */
    private class RunnableC58880c implements Runnable {

        /* renamed from: a */
        C58878a f145698a;

        /* renamed from: b */
        int f145699b;

        /* renamed from: c */
        int f145700c;

        /* renamed from: a */
        public void mo199540a() {
            if (this.f145698a != null) {
                TouchImageView.this.setState(EnumC58885h.NONE);
                this.f145698a.mo199534a(true);
            }
        }

        public void run() {
            if (TouchImageView.this.f145671o != null) {
                TouchImageView.this.f145671o.mo199547a();
            }
            if (this.f145698a.mo199535a()) {
                this.f145698a = null;
            } else if (this.f145698a.mo199536b()) {
                int c = this.f145698a.mo199537c();
                int d = this.f145698a.mo199538d();
                int i = c - this.f145699b;
                int i2 = d - this.f145700c;
                this.f145699b = c;
                this.f145700c = d;
                TouchImageView.this.f145658b.postTranslate((float) i, (float) i2);
                TouchImageView.this.mo199508c();
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.setImageMatrix(touchImageView.f145658b);
                TouchImageView.this.mo199504a(this);
            }
        }

        RunnableC58880c(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            TouchImageView.this.setState(EnumC58885h.FLING);
            this.f145698a = new C58878a(TouchImageView.this.f145663g);
            TouchImageView.this.f145658b.getValues(TouchImageView.this.f145662f);
            int i7 = (int) TouchImageView.this.f145662f[2];
            int i8 = (int) TouchImageView.this.f145662f[5];
            if (TouchImageView.this.getImageWidth() > ((float) TouchImageView.this.f145665i)) {
                i4 = TouchImageView.this.f145665i - ((int) TouchImageView.this.getImageWidth());
                i3 = 0;
            } else {
                i4 = i7;
                i3 = i4;
            }
            if (TouchImageView.this.getImageHeight() > ((float) TouchImageView.this.f145666j)) {
                i6 = TouchImageView.this.f145666j - ((int) TouchImageView.this.getImageHeight());
                i5 = 0;
            } else {
                i6 = i8;
                i5 = i6;
            }
            this.f145698a.mo199533a(i7, i8, i, i2, i4, i3, i6, i5);
            this.f145699b = i7;
            this.f145700c = i8;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$1 */
    public static /* synthetic */ class C588771 {

        /* renamed from: a */
        static final /* synthetic */ int[] f145683a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.widget.photo_picker.widget.TouchImageView.C588771.f145683a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.widget.photo_picker.widget.TouchImageView.C588771.f145683a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.widget.photo_picker.widget.TouchImageView.C588771.f145683a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.widget.photo_picker.widget.TouchImageView.C588771.f145683a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.widget.photo_picker.widget.TouchImageView.C588771.f145683a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.widget.TouchImageView.C588771.<clinit>():void");
        }
    }

    /* renamed from: e */
    private void m228394e() {
        Matrix matrix = this.f145658b;
        if (matrix != null && this.f145666j != 0 && this.f145665i != 0) {
            matrix.getValues(this.f145662f);
            this.f145672p.setValues(this.f145662f);
            this.f145656B = this.f145682z;
            this.f145655A = this.f145681y;
            this.f145680x = this.f145666j;
            this.f145679w = this.f145665i;
        }
    }

    /* renamed from: c */
    public void mo199508c() {
        this.f145658b.getValues(this.f145662f);
        float[] fArr = this.f145662f;
        float f = fArr[2];
        float f2 = fArr[5];
        float c = m228393c(f, (float) this.f145665i, getImageWidth());
        float c2 = m228393c(f2, (float) this.f145666j, getImageHeight());
        if (c != BitmapDescriptorFactory.HUE_RED || c2 != BitmapDescriptorFactory.HUE_RED) {
            this.f145658b.postTranslate(c, c2);
        }
    }

    public PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PointF a = mo199500a((float) (this.f145665i / 2), (float) (this.f145666j / 2), true);
        a.x /= (float) intrinsicWidth;
        a.y /= (float) intrinsicHeight;
        return a;
    }

    /* renamed from: d */
    public void mo199510d() {
        mo199508c();
        this.f145658b.getValues(this.f145662f);
        float imageWidth = getImageWidth();
        int i = this.f145665i;
        if (imageWidth < ((float) i)) {
            this.f145662f[2] = (((float) i) - getImageWidth()) / 2.0f;
        }
        float imageHeight = getImageHeight();
        int i2 = this.f145666j;
        if (imageHeight < ((float) i2)) {
            this.f145662f[5] = (((float) i2) - getImageHeight()) / 2.0f;
        }
        this.f145658b.setValues(this.f145662f);
    }

    public RectF getZoomedRect() {
        if (this.f145675s != ImageView.ScaleType.FIT_XY) {
            PointF a = mo199500a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, true);
            PointF a2 = mo199500a((float) this.f145665i, (float) this.f145666j, true);
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            return new RectF(a.x / intrinsicWidth, a.y / intrinsicHeight, a2.x / intrinsicWidth, a2.y / intrinsicHeight);
        }
        throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.f145657a);
        bundle.putFloat("matchViewHeight", this.f145682z);
        bundle.putFloat("matchViewWidth", this.f145681y);
        bundle.putInt("viewWidth", this.f145665i);
        bundle.putInt("viewHeight", this.f145666j);
        this.f145658b.getValues(this.f145662f);
        bundle.putFloatArray("matrix", this.f145662f);
        bundle.putBoolean("imageRendered", this.f145676t);
        return bundle;
    }

    /* renamed from: f */
    private void m228395f() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0 && this.f145658b != null && this.f145672p != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f = (float) intrinsicWidth;
            float f2 = ((float) this.f145665i) / f;
            float f3 = (float) intrinsicHeight;
            float f4 = ((float) this.f145666j) / f3;
            int i = C588771.f145683a[this.f145675s.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    f2 = Math.max(f2, f4);
                } else if (i == 3) {
                    f2 = Math.min(1.0f, Math.min(f2, f4));
                } else if (i == 4) {
                    f2 = Math.min(f2, f4);
                } else if (i != 5) {
                    throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
                }
                f4 = f2;
            } else {
                f2 = 1.0f;
                f4 = 1.0f;
            }
            int i2 = this.f145665i;
            float f5 = ((float) i2) - (f2 * f);
            int i3 = this.f145666j;
            float f6 = ((float) i3) - (f4 * f3);
            this.f145681y = ((float) i2) - f5;
            this.f145682z = ((float) i3) - f6;
            if (mo199505a() || this.f145676t) {
                if (this.f145655A == BitmapDescriptorFactory.HUE_RED || this.f145656B == BitmapDescriptorFactory.HUE_RED) {
                    m228394e();
                }
                this.f145672p.getValues(this.f145662f);
                float[] fArr = this.f145662f;
                float f7 = this.f145681y / f;
                float f8 = this.f145657a;
                fArr[0] = f7 * f8;
                fArr[4] = (this.f145682z / f3) * f8;
                float f9 = fArr[2];
                float f10 = fArr[5];
                m228391a(2, f9, this.f145655A * f8, getImageWidth(), this.f145679w, this.f145665i, intrinsicWidth);
                m228391a(5, f10, this.f145656B * this.f145657a, getImageHeight(), this.f145680x, this.f145666j, intrinsicHeight);
                this.f145658b.setValues(this.f145662f);
            } else {
                this.f145658b.setScale(f2, f4);
                this.f145658b.postTranslate(f5 / 2.0f, f6 / 2.0f);
                this.f145657a = 1.0f;
            }
            mo199508c();
            setImageMatrix(this.f145658b);
        }
    }

    /* renamed from: a */
    public boolean mo199505a() {
        if (this.f145657a != 1.0f) {
            return true;
        }
        return false;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f145669m = onDoubleTapListener;
    }

    public void setOnTouchImageViewListener(AbstractC58882e eVar) {
        this.f145671o = eVar;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f145670n = onTouchListener;
    }

    public void setState(EnumC58885h hVar) {
        this.f145659c = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$d */
    public class C58881d extends GestureDetector.SimpleOnGestureListener {
        private C58881d() {
        }

        public void onLongPress(MotionEvent motionEvent) {
            TouchImageView.this.performLongClick();
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (TouchImageView.this.f145669m != null) {
                return TouchImageView.this.f145669m.onDoubleTapEvent(motionEvent);
            }
            return false;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (TouchImageView.this.f145669m != null) {
                return TouchImageView.this.f145669m.onSingleTapConfirmed(motionEvent);
            }
            return TouchImageView.this.performClick();
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean z;
            float f;
            if (TouchImageView.this.f145669m != null) {
                z = TouchImageView.this.f145669m.onDoubleTap(motionEvent);
            } else {
                z = false;
            }
            if (TouchImageView.this.f145659c != EnumC58885h.NONE) {
                return z;
            }
            if (TouchImageView.this.f145657a == TouchImageView.this.f145660d) {
                f = TouchImageView.this.f145661e;
            } else {
                f = TouchImageView.this.f145660d;
            }
            TouchImageView.this.mo199504a(new RunnableC58879b(f, motionEvent.getX(), motionEvent.getY(), false));
            return true;
        }

        /* synthetic */ C58881d(TouchImageView touchImageView, C588771 r2) {
            this();
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (TouchImageView.this.f145664h != null) {
                TouchImageView.this.f145664h.mo199540a();
            }
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.f145664h = new RunnableC58880c((int) f, (int) f2);
            TouchImageView touchImageView2 = TouchImageView.this;
            touchImageView2.mo199504a(touchImageView2.f145664h);
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$g */
    public class C58884g extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C58884g() {
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.setState(EnumC58885h.ZOOM);
            return true;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.mo199501a((double) scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            if (TouchImageView.this.f145671o == null) {
                return true;
            }
            TouchImageView.this.f145671o.mo199547a();
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            TouchImageView.this.setState(EnumC58885h.NONE);
            float f = TouchImageView.this.f145657a;
            boolean z = true;
            if (TouchImageView.this.f145657a > TouchImageView.this.f145661e) {
                f = TouchImageView.this.f145661e;
            } else if (TouchImageView.this.f145657a < TouchImageView.this.f145660d) {
                f = TouchImageView.this.f145660d;
            } else {
                z = false;
            }
            if (z) {
                TouchImageView touchImageView = TouchImageView.this;
                TouchImageView.this.mo199504a(new RunnableC58879b(f, (float) (touchImageView.f145665i / 2), (float) (TouchImageView.this.f145666j / 2), true));
            }
        }

        /* synthetic */ C58884g(TouchImageView touchImageView, C588771 r2) {
            this();
        }
    }

    public TouchImageView(Context context) {
        super(context);
        m228392a(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m228394e();
    }

    public void setZoom(float f) {
        mo199502a(f, 0.5f, 0.5f);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$f */
    public class View$OnTouchListenerC58883f implements View.OnTouchListener {

        /* renamed from: b */
        private PointF f145704b;

        private View$OnTouchListenerC58883f() {
            this.f145704b = new PointF();
        }

        /* synthetic */ View$OnTouchListenerC58883f(TouchImageView touchImageView, C588771 r2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
            if (r1 != 6) goto L_0x00ae;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
            // Method dump skipped, instructions count: 208
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.widget.TouchImageView.View$OnTouchListenerC58883f.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m228394e();
        m228395f();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m228394e();
        m228395f();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        m228394e();
        m228395f();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m228394e();
        m228395f();
    }

    public void setMaxZoom(float f) {
        this.f145661e = f;
        this.f145674r = f * 1.25f;
    }

    public void setMinZoom(float f) {
        this.f145660d = f;
        this.f145673q = f * 0.75f;
    }

    /* renamed from: a */
    public void mo199504a(Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            postOnAnimation(runnable);
        } else {
            postDelayed(runnable, 16);
        }
    }

    public void setZoom(TouchImageView touchImageView) {
        PointF scrollPosition = touchImageView.getScrollPosition();
        mo199503a(touchImageView.getCurrentZoom(), scrollPosition.x, scrollPosition.y, touchImageView.getScaleType());
    }

    public boolean canScrollHorizontally(int i) {
        this.f145658b.getValues(this.f145662f);
        float f = this.f145662f[2];
        if (getImageWidth() < ((float) this.f145665i)) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if (Math.abs(f) + ((float) this.f145665i) + 1.0f < getImageWidth() || i <= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f145677u = true;
        this.f145676t = true;
        C58886i iVar = this.f145678v;
        if (iVar != null) {
            mo199503a(iVar.f145707a, this.f145678v.f145708b, this.f145678v.f145709c, this.f145678v.f145710d);
            this.f145678v = null;
        }
        super.onDraw(canvas);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.FIT_START || scaleType == ImageView.ScaleType.FIT_END) {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        } else if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(ImageView.ScaleType.MATRIX);
        } else {
            this.f145675s = scaleType;
            if (this.f145677u) {
                setZoom(this);
            }
        }
    }

    /* renamed from: a */
    private void m228392a(Context context) {
        super.setClickable(true);
        this.f145663g = context;
        this.f145667k = new ScaleGestureDetector(context, new C58884g(this, null));
        this.f145668l = new GestureDetector(context, new C58881d(this, null));
        this.f145658b = new Matrix();
        this.f145672p = new Matrix();
        this.f145662f = new float[9];
        this.f145657a = 1.0f;
        if (this.f145675s == null) {
            this.f145675s = ImageView.ScaleType.FIT_CENTER;
        }
        this.f145660d = 1.0f;
        this.f145661e = 3.0f;
        this.f145673q = 1.0f * 0.75f;
        this.f145674r = 3.0f * 1.25f;
        setImageMatrix(this.f145658b);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(EnumC58885h.NONE);
        this.f145677u = false;
        super.setOnTouchListener(new View$OnTouchListenerC58883f(this, null));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f145657a = bundle.getFloat("saveScale");
            float[] floatArray = bundle.getFloatArray("matrix");
            this.f145662f = floatArray;
            this.f145672p.setValues(floatArray);
            this.f145656B = bundle.getFloat("matchViewHeight");
            this.f145655A = bundle.getFloat("matchViewWidth");
            this.f145680x = bundle.getInt("viewHeight");
            this.f145679w = bundle.getInt("viewWidth");
            this.f145676t = bundle.getBoolean("imageRendered");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m228392a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f145665i = m228390a(mode, size, intrinsicWidth);
        int a = m228390a(mode2, size2, intrinsicHeight);
        this.f145666j = a;
        setMeasuredDimension(this.f145665i, a);
        m228395f();
    }

    /* renamed from: a */
    public PointF mo199499a(float f, float f2) {
        this.f145658b.getValues(this.f145662f);
        return new PointF(this.f145662f[2] + (getImageWidth() * (f / ((float) getDrawable().getIntrinsicWidth()))), this.f145662f[5] + (getImageHeight() * (f2 / ((float) getDrawable().getIntrinsicHeight()))));
    }

    /* renamed from: a */
    public void mo199502a(float f, float f2, float f3) {
        mo199503a(f, f2, f3, this.f145675s);
    }

    /* renamed from: a */
    private int m228390a(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m228392a(context);
    }

    /* renamed from: a */
    public PointF mo199500a(float f, float f2, boolean z) {
        this.f145658b.getValues(this.f145662f);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f145662f;
        float f3 = fArr[2];
        float f4 = fArr[5];
        float imageWidth = ((f - f3) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f2 - f4) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, (float) BitmapDescriptorFactory.HUE_RED), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, (float) BitmapDescriptorFactory.HUE_RED), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    /* renamed from: a */
    public void mo199501a(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        if (z) {
            f3 = this.f145673q;
            f4 = this.f145674r;
        } else {
            f3 = this.f145660d;
            f4 = this.f145661e;
        }
        float f5 = this.f145657a;
        float f6 = (float) (((double) f5) * d);
        this.f145657a = f6;
        if (f6 > f4) {
            this.f145657a = f4;
            d = (double) (f4 / f5);
        } else if (f6 < f3) {
            this.f145657a = f3;
            d = (double) (f3 / f5);
        }
        float f7 = (float) d;
        this.f145658b.postScale(f7, f7, f, f2);
        mo199510d();
    }

    /* renamed from: a */
    public void mo199503a(float f, float f2, float f3, ImageView.ScaleType scaleType) {
        if (!this.f145677u) {
            this.f145678v = new C58886i(f, f2, f3, scaleType);
            return;
        }
        if (scaleType != this.f145675s) {
            setScaleType(scaleType);
        }
        mo199507b();
        mo199501a((double) f, (float) (this.f145665i / 2), (float) (this.f145666j / 2), true);
        this.f145658b.getValues(this.f145662f);
        this.f145662f[2] = -((f2 * getImageWidth()) - (((float) this.f145665i) * 0.5f));
        this.f145662f[5] = -((f3 * getImageHeight()) - (((float) this.f145666j) * 0.5f));
        this.f145658b.setValues(this.f145662f);
        mo199508c();
        setImageMatrix(this.f145658b);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.widget.TouchImageView$i */
    public class C58886i {

        /* renamed from: a */
        public float f145707a;

        /* renamed from: b */
        public float f145708b;

        /* renamed from: c */
        public float f145709c;

        /* renamed from: d */
        public ImageView.ScaleType f145710d;

        public C58886i(float f, float f2, float f3, ImageView.ScaleType scaleType) {
            this.f145707a = f;
            this.f145708b = f2;
            this.f145709c = f3;
            this.f145710d = scaleType;
        }
    }

    /* renamed from: a */
    private void m228391a(int i, float f, float f2, float f3, int i2, int i3, int i4) {
        float f4 = (float) i3;
        if (f3 < f4) {
            float[] fArr = this.f145662f;
            fArr[i] = (f4 - (((float) i4) * fArr[0])) * 0.5f;
        } else if (f > BitmapDescriptorFactory.HUE_RED) {
            this.f145662f[i] = -((f3 - f4) * 0.5f);
        } else {
            this.f145662f[i] = -((((Math.abs(f) + (((float) i2) * 0.5f)) / f2) * f3) - (f4 * 0.5f));
        }
    }
}
