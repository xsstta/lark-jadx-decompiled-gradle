package com.ss.android.videoshop.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.bytedance.common.utility.reflect.ReflectUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.videoshop.api.AbstractC64094c;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3203i.C64174c;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TextureVideoView extends TextureView {

    /* renamed from: a */
    public TextureView.SurfaceTextureListener f162245a;

    /* renamed from: b */
    public boolean f162246b;

    /* renamed from: c */
    public boolean f162247c;

    /* renamed from: d */
    public Surface f162248d;

    /* renamed from: e */
    public SurfaceTexture f162249e;

    /* renamed from: f */
    private boolean f162250f;

    /* renamed from: g */
    private boolean f162251g;

    /* renamed from: h */
    private boolean f162252h;

    /* renamed from: i */
    private boolean f162253i;

    /* renamed from: j */
    private float f162254j;

    /* renamed from: k */
    private float f162255k;

    /* renamed from: l */
    private final String f162256l;

    /* renamed from: m */
    private AbstractC64094c f162257m;

    /* renamed from: n */
    private boolean f162258n;

    /* renamed from: o */
    private int f162259o;

    /* renamed from: p */
    private int f162260p;

    /* renamed from: q */
    private int f162261q;

    /* renamed from: r */
    private int f162262r;

    /* renamed from: s */
    private int f162263s;

    /* renamed from: t */
    private C64194c f162264t;

    /* renamed from: u */
    private int f162265u;

    /* renamed from: v */
    private int f162266v;

    /* renamed from: w */
    private int f162267w;

    /* renamed from: x */
    private int f162268x;

    /* renamed from: y */
    private int f162269y;

    /* renamed from: z */
    private int f162270z;

    public float getCenterInsideScaleFactor() {
        return 1.0f;
    }

    public Surface getSurface() {
        return this.f162248d;
    }

    public int getVideoHeight() {
        return this.f162262r;
    }

    public int getVideoWidth() {
        return this.f162261q;
    }

    /* renamed from: c */
    public void mo222537c() {
        AbstractC64094c cVar = this.f162257m;
        if (cVar != null) {
            cVar.mo221869a(this);
        }
    }

    /* renamed from: d */
    private void m252433d() {
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.videoshop.widget.TextureVideoView.TextureView$SurfaceTextureListenerC641911 */

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (TextureVideoView.this.f162245a != null) {
                    TextureVideoView.this.f162245a.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (TextureVideoView.this.f162246b && !TextureVideoView.this.f162247c && TextureVideoView.this.f162248d != null) {
                    TextureVideoView.this.f162248d.release();
                    TextureVideoView.this.f162248d = null;
                    TextureVideoView.this.f162249e = null;
                }
                if (TextureVideoView.this.f162245a != null) {
                    TextureVideoView.this.f162245a.onSurfaceTextureDestroyed(surfaceTexture);
                }
                if (!TextureVideoView.this.f162246b) {
                    TextureVideoView.this.mo222533a(false);
                }
                return !TextureVideoView.this.f162246b;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C64159a.m252083b("TextureVideoView", "onSurfaceTextureSizeChanged width:" + i + " height:" + i2);
                if (TextureVideoView.this.f162245a != null) {
                    TextureVideoView.this.f162245a.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C64116b bVar;
                if (TextureVideoView.this.f162246b) {
                    C64116b bVar2 = null;
                    if (TextureVideoView.this.f162248d != null && (!TextureVideoView.this.f162247c || !TextureVideoView.this.f162248d.isValid())) {
                        TextureVideoView.this.f162248d.release();
                        TextureVideoView.this.f162248d = null;
                        TextureVideoView.this.f162249e = null;
                    }
                    if (TextureVideoView.this.f162248d == null) {
                        TextureVideoView.this.f162248d = new Surface(surfaceTexture);
                        TextureVideoView.this.f162249e = surfaceTexture;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT >= 16) {
                                if (TextureVideoView.this.f162249e != null) {
                                    TextureVideoView textureVideoView = TextureVideoView.this;
                                    if (!textureVideoView.mo222535a(textureVideoView.f162249e)) {
                                        if (TextureVideoView.this.f162249e == TextureVideoView.this.getSurfaceTexture()) {
                                            C64159a.m252079a("onSurfaceTextureAvailable surface equal.");
                                            if (VideoContext.m251724a(TextureVideoView.this.getContext()) != null) {
                                                bVar = VideoContext.m251724a(TextureVideoView.this.getContext()).mo222060m();
                                            } else {
                                                bVar = null;
                                            }
                                            C64159a.m252077a(bVar, "onSurfaceTextureAvailable surface equal.");
                                            C64159a.m252083b("TextureVideoView", "surface_texture_available surface equal");
                                        } else {
                                            TextureVideoView textureVideoView2 = TextureVideoView.this;
                                            textureVideoView2.setSurfaceTexture(textureVideoView2.f162249e);
                                        }
                                    }
                                }
                                TextureVideoView.this.f162249e = surfaceTexture;
                                TextureVideoView.this.f162248d = new Surface(surfaceTexture);
                            } else if (TextureVideoView.this.f162249e != null) {
                                TextureVideoView.this.f162248d = new Surface(surfaceTexture);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            C64159a.m252079a("onSurfaceTextureAvailable:" + e.getMessage());
                            if (VideoContext.m251724a(TextureVideoView.this.getContext()) != null) {
                                bVar2 = VideoContext.m251724a(TextureVideoView.this.getContext()).mo222060m();
                            }
                            C64159a.m252077a(bVar2, "onSurfaceTextureAvailable:" + e.getMessage());
                            C64159a.m252083b("TextureVideoView", "surface_texture_available:" + e.getMessage());
                            TextureVideoView.this.f162249e = surfaceTexture;
                            TextureVideoView.this.f162248d = new Surface(surfaceTexture);
                        }
                    }
                    TextureVideoView.this.f162247c = true;
                } else {
                    TextureVideoView.this.f162248d = new Surface(surfaceTexture);
                    TextureVideoView.this.f162249e = surfaceTexture;
                }
                if (TextureVideoView.this.f162245a != null) {
                    TextureVideoView.this.f162245a.onSurfaceTextureAvailable(TextureVideoView.this.f162249e, i, i2);
                }
            }
        });
    }

    private int getMaxTranslateX() {
        int i = this.f162259o;
        int i2 = this.f162265u;
        if (i > i2) {
            return (i - i2) / 2;
        }
        return 0;
    }

    private int getMaxTranslateY() {
        int i = this.f162260p;
        int i2 = this.f162266v;
        if (i > i2) {
            return (i - i2) / 2;
        }
        return 0;
    }

    public float getRealBottom() {
        return getRealTop() + getRealHeight();
    }

    public float getRealHeight() {
        return ((float) getHeight()) * getScaleY();
    }

    public float getRealRight() {
        return getRealLeft() + getRealWidth();
    }

    public float getRealWidth() {
        return ((float) getWidth()) * getScaleX();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        this.f162258n = true;
        this.f162267w = 0;
        this.f162268x = 0;
        super.onAttachedToWindow();
    }

    /* renamed from: e */
    private void m252434e() {
        if (this.f162269y != 0 || this.f162270z != 0) {
            this.f162269y = 0;
            this.f162270z = 0;
            this.f162264t.reset();
            setTransform(this.f162264t);
            invalidate();
        }
    }

    /* renamed from: b */
    public boolean mo222536b() {
        float scaleX = getScaleX();
        if (!C64174c.m252211a(scaleX, getScaleY()) || !C64174c.m252211a(scaleX, getCenterCropScaleFactor())) {
            return false;
        }
        return true;
    }

    public float getLayoutScaleFactor() {
        int i = this.f162263s;
        if (i == 0) {
            return getCenterInsideScaleFactor();
        }
        if (i != 2) {
            return 1.0f;
        }
        return getCenterCropScaleFactor();
    }

    public float getRealLeft() {
        return ((float) getLeft()) + ((((float) getWidth()) - getRealWidth()) / 2.0f) + getTranslationX();
    }

    public float getRealTop() {
        return ((float) getTop()) + ((((float) getHeight()) - getRealHeight()) / 2.0f) + getTranslationY();
    }

    public Rect getRealViewRect() {
        return new Rect((int) getRealLeft(), (int) getRealTop(), (int) getRealRight(), (int) getRealBottom());
    }

    public RectF getRealViewRectF() {
        return new RectF(getRealLeft(), getRealTop(), getRealRight(), getRealBottom());
    }

    /* renamed from: f */
    private void m252435f() {
        if (this.f162269y != 0 || this.f162270z != 0) {
            this.f162269y = 0;
            this.f162270z = 0;
            C64194c cVar = this.f162264t;
            if (cVar != null) {
                cVar.mo222585d((float) 0);
                this.f162264t.mo222586e((float) this.f162270z);
            }
            setTranslationX((float) this.f162269y);
            setTranslationY((float) this.f162270z);
            invalidate();
        }
    }

    public float getCenterCropScaleFactor() {
        int i;
        float f;
        float f2;
        int i2 = this.f162265u;
        if (i2 == 0 || (i = this.f162261q) == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f3 = ((float) this.f162266v) / ((float) i2);
        float f4 = ((float) this.f162262r) / ((float) i);
        Pair<Integer, Integer> centerInsideDimension = getCenterInsideDimension();
        int intValue = ((Integer) centerInsideDimension.first).intValue();
        int intValue2 = ((Integer) centerInsideDimension.second).intValue();
        if (f4 > f3) {
            f2 = ((float) this.f162265u) * 1.0f;
            f = (float) intValue;
        } else {
            f2 = ((float) this.f162266v) * 1.0f;
            f = (float) intValue2;
        }
        return f2 / f;
    }

    /* renamed from: g */
    private void m252436g() {
        Surface surface;
        if (this.f162246b && Build.VERSION.SDK_INT >= 16 && this.f162249e != null && this.f162247c && (surface = this.f162248d) != null && surface.isValid() && this.f162249e != getSurfaceTexture()) {
            boolean a = mo222535a(this.f162249e);
            PrintStream printStream = System.err;
            printStream.println("isSurfaceTextureReleased:" + a);
            if (!a) {
                setSurfaceTexture(this.f162249e);
                C64159a.m252083b("TextureVideoView", "onWindowVisibilityChanged setSurfaceTexture");
                TextureView.SurfaceTextureListener surfaceTextureListener = this.f162245a;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(this.f162249e, 0, 0);
                }
            }
        }
    }

    private Pair<Integer, Integer> getCenterInsideDimension() {
        int i;
        int i2 = this.f162261q;
        if (i2 <= 0 || (i = this.f162262r) <= 0) {
            return new Pair<>(0, 0);
        }
        int i3 = this.f162266v;
        int i4 = this.f162265u;
        int i5 = (int) (((float) i) * ((((float) i4) * 1.0f) / ((float) i2)));
        if (i5 > i3) {
            i4 = (int) (((float) i2) * ((((float) i3) * 1.0f) / ((float) i)));
        } else {
            i3 = i5;
        }
        return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i3));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f162258n = false;
        if (Build.VERSION.SDK_INT < 21) {
            try {
                super.onDetachedFromWindow();
            } catch (Exception e) {
                C64159a.m252083b("TextureVideoView", "onDetachedFromWindow exception:" + Log.getStackTraceString(e));
            }
        } else {
            super.onDetachedFromWindow();
        }
        try {
            if (Build.VERSION.SDK_INT < 21) {
                SurfaceTexture surfaceTexture = this.f162249e;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f162249e = null;
                }
                Surface surface = this.f162248d;
                if (surface != null) {
                    surface.release();
                    this.f162248d = null;
                }
                this.f162247c = false;
                this.f162248d = null;
                this.f162249e = null;
            }
        } catch (Exception e2) {
            C64159a.m252083b("TextureVideoView", "onDetachedFromWindow release exception:" + Log.getStackTraceString(e2));
        }
    }

    /* renamed from: a */
    public boolean mo222534a() {
        float scaleX = getScaleX();
        if (!C64174c.m252211a(scaleX, getScaleY()) || !C64174c.m252211a(scaleX, getCenterInsideScaleFactor())) {
            return false;
        }
        return true;
    }

    public void setMaxScaleFactor(float f) {
        this.f162254j = f;
    }

    public void setMinScaleFactor(float f) {
        this.f162255k = f;
    }

    public void setResizeListener(AbstractC64094c cVar) {
        this.f162257m = cVar;
    }

    public void setRotatable(boolean z) {
        this.f162251g = z;
    }

    public void setScalable(boolean z) {
        this.f162252h = z;
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f162245a = surfaceTextureListener;
    }

    public void setTranslatable(boolean z) {
        this.f162253i = z;
    }

    public TextureVideoView(Context context) {
        this(context, null);
    }

    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        mo222537c();
    }

    /* renamed from: a */
    private float m252430a(float f) {
        return Math.max(Math.min(f, this.f162254j), this.f162255k);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (getVisibility() == 0 && i == 0) {
            m252436g();
        }
    }

    public void setReuseSurfaceTexture(boolean z) {
        this.f162246b = z;
        if (Build.VERSION.SDK_INT < 21) {
            this.f162246b = false;
        }
    }

    public void setTextureLayout(int i) {
        if (this.f162263s != i) {
            this.f162263s = i;
            this.f162250f = false;
            requestLayout();
            m252434e();
        }
    }

    /* renamed from: a */
    private boolean m252432a(int i) {
        if (i == 0) {
            return mo222534a();
        }
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return mo222536b();
        } else if (this.f162263s == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void setKeepScreenOn(boolean z) {
        super.setKeepScreenOn(z);
        C64159a.m252083b("TextureVideoView", "keep_screen_on:" + Boolean.valueOf(z).toString());
    }

    /* renamed from: a */
    public void mo222533a(boolean z) {
        Surface surface;
        if ((z || !this.f162246b) && (surface = this.f162248d) != null) {
            surface.release();
            this.f162248d = null;
        }
        this.f162247c = false;
        this.f162248d = null;
        this.f162249e = null;
    }

    /* renamed from: a */
    public boolean mo222535a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return surfaceTexture.isReleased();
        }
        Method method = ReflectUtils.getMethod(SurfaceTexture.class, "isReleased", null);
        if (method == null) {
            return false;
        }
        try {
            Object invoke = method.invoke(surfaceTexture, new Object[0]);
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (Exception unused) {
        }
        if (view == this && i == 0) {
            m252436g();
        }
    }

    public TextureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162254j = Float.MAX_VALUE;
        this.f162256l = "TextureVideoView";
        this.f162264t = new C64194c();
        m252433d();
    }

    /* renamed from: a */
    private void m252431a(float f, float f2) {
        float a = m252430a(f);
        float a2 = m252430a(f2);
        C64194c cVar = this.f162264t;
        if (cVar != null) {
            cVar.postScale(a / Math.abs(getScaleX()), a2 / Math.abs(getScaleY()));
        }
        setScaleX(a);
        setScaleY(a2);
        mo222537c();
    }

    /* renamed from: a */
    public void mo222531a(int i, int i2) {
        if (this.f162261q != i || this.f162262r != i2) {
            this.f162261q = i;
            this.f162262r = i2;
            this.f162267w = 0;
            this.f162268x = 0;
            C64159a.m252083b("TextureVideoView", "setVideoSize videoWidth:" + i + " videoHeight:" + i2);
            requestLayout();
            m252434e();
        }
    }

    /* renamed from: a */
    public void mo222532a(int i, C64193b bVar) {
        C64159a.m252083b("TextureVideoView", "Set TextureLayout. oldTextureLayout=" + this.f162263s + ", newTextureLayout=" + i);
        if (bVar == null) {
            setTextureLayout(i);
            C64159a.m252083b("TextureVideoView", "Set TextureLayout and requestLayout.");
        } else {
            m252435f();
            this.f162263s = i;
            if (this.f162265u == 0 || this.f162266v == 0) {
                C64159a.m252083b("TextureVideoView", "Set TextureLayout failed. Parent size error!");
            } else if (!m252432a(i)) {
                float layoutScaleFactor = getLayoutScaleFactor();
                bVar.mo222577a(layoutScaleFactor).mo222580b(layoutScaleFactor);
                if (bVar.mo222579a()) {
                    bVar.mo222578a(this);
                    C64159a.m252083b("TextureVideoView", "Set TextureLayout with animation. ScaleFactor=" + layoutScaleFactor);
                } else {
                    this.f162264t.reset();
                    bVar.mo222581b(this);
                    C64159a.m252083b("TextureVideoView", "Set TextureLayout without animation. ScaleFactor=" + layoutScaleFactor);
                }
            } else {
                C64159a.m252083b("TextureVideoView", "Set TextureLayout failed. Same layout!");
            }
        }
        C64159a.m252083b("TextureVideoView", "Set TextureLayout over. parentSize:" + this.f162265u + "*" + this.f162266v + ", videoSize:" + this.f162261q + "*" + this.f162262r + ", newScaleFactor:" + getLayoutScaleFactor() + ", newScaledSize:" + (((float) this.f162267w) * getLayoutScaleFactor()) + "*" + (((float) this.f162268x) * getLayoutScaleFactor()));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C64159a.m252080a("TextureVideoView", "widthMeasureSpec:" + View.MeasureSpec.toString(i));
        C64159a.m252080a("TextureVideoView", "heightMeasureSpec:" + View.MeasureSpec.toString(i2));
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        } else if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        this.f162265u = suggestedMinimumWidth;
        this.f162266v = suggestedMinimumHeight;
        Pair<Integer, Integer> centerInsideDimension = getCenterInsideDimension();
        int intValue = ((Integer) centerInsideDimension.first).intValue();
        int intValue2 = ((Integer) centerInsideDimension.second).intValue();
        float scaleX = getScaleX();
        int i3 = this.f162263s;
        if (i3 == 1 || this.f162261q <= 0 || this.f162262r <= 0) {
            intValue = suggestedMinimumWidth;
            intValue2 = suggestedMinimumHeight;
        } else if ((i3 == 0 || i3 == 2) && !this.f162250f) {
            scaleX = getLayoutScaleFactor();
            this.f162264t.mo222582a(scaleX);
            m252431a(scaleX, scaleX);
        }
        if (!(this.f162267w == intValue && this.f162268x == intValue2)) {
            this.f162267w = intValue;
            this.f162268x = intValue2;
            C64159a.m252083b("TextureVideoView", "tv_size_Measure:" + intValue + "*" + intValue2 + " Parent:" + suggestedMinimumWidth + "*" + suggestedMinimumHeight + " textureLayout:" + this.f162263s + " Video:" + this.f162261q + "*" + this.f162262r + " scaleFactor:" + scaleX + " scaled_size:" + (((float) intValue) * scaleX) + "*" + (((float) intValue2) * scaleX));
        }
        setMeasuredDimension(intValue, intValue2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C64116b bVar;
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (this.f162259o != width || this.f162260p != height) {
            this.f162259o = width;
            this.f162260p = height;
            C64159a.m252079a("TextureView size:" + width + "*" + height + " parent:" + this.f162265u + "*" + this.f162266v);
            if (VideoContext.m251724a(getContext()) != null) {
                bVar = VideoContext.m251724a(getContext()).mo222060m();
            } else {
                bVar = null;
            }
            C64159a.m252077a(bVar, "TextureView size:" + width + "*" + height + " parent:" + this.f162265u + "*" + this.f162266v);
            C64159a.m252083b("TextureVideoView", "tv_size_layout:" + width + "*" + height + " parent:" + this.f162265u + "*" + this.f162266v);
        }
    }
}
