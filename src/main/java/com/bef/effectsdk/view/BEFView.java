package com.bef.effectsdk.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.GLTextureView;
import com.bef.effectsdk.ResourceFinder;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.view.ViewControllerInterface;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class BEFView extends GLTextureView implements GLSurfaceView.Renderer, MessageCenter.AbstractC2081a, ViewControllerInterface.NativeMessageListener {

    /* renamed from: A */
    private AssetResourceFinder f7193A;

    /* renamed from: k */
    protected long f7194k;

    /* renamed from: l */
    protected String f7195l;

    /* renamed from: m */
    protected boolean f7196m;

    /* renamed from: n */
    protected int f7197n;

    /* renamed from: o */
    protected float[] f7198o;

    /* renamed from: p */
    protected HashSet<AbstractC2097a> f7199p;

    /* renamed from: q */
    protected Queue<Runnable> f7200q;

    /* renamed from: r */
    private long f7201r;

    /* renamed from: s */
    private Builder.C2096a f7202s;

    /* renamed from: t */
    private int[] f7203t;

    /* renamed from: u */
    private float[] f7204u;

    /* renamed from: v */
    private float[] f7205v;

    /* renamed from: w */
    private boolean f7206w;

    /* renamed from: x */
    private long f7207x;

    /* renamed from: y */
    private long f7208y;

    /* renamed from: z */
    private boolean f7209z;

    public enum FitMode {
        FIT_WIDTH,
        FIT_HEIGHT,
        FILL_SCREEN,
        FIT_WIDTH_BOTTOM,
        NO_CLIP
    }

    /* renamed from: com.bef.effectsdk.view.BEFView$a */
    public interface AbstractC2097a {
        /* renamed from: a */
        void mo10288a(long j, long j2, long j3, String str);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    public static class Color {

        /* renamed from: a */
        private float f7261a;

        /* renamed from: b */
        private float f7262b;

        /* renamed from: c */
        private float f7263c;

        /* renamed from: d */
        private float f7264d;

        public float alpha() {
            return this.f7264d;
        }

        public float blue() {
            return this.f7263c;
        }

        public float green() {
            return this.f7262b;
        }

        public float red() {
            return this.f7261a;
        }

        public Color() {
            setColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }

        public Color(float f, float f2, float f3, float f4) {
            setColor(f, f2, f3, f4);
        }

        public void setColor(float f, float f2, float f3, float f4) {
            this.f7261a = f;
            this.f7262b = f2;
            this.f7263c = f3;
            this.f7264d = f4;
        }
    }

    public synchronized boolean getNativeInited() {
        return this.f7196m;
    }

    public static final class Builder {

        /* renamed from: a */
        private C2096a f7254a = new C2096a();

        private Builder() {
        }

        public static Builder obtain() {
            Builder builder = new Builder();
            builder.f7254a.f7255a = 720;
            builder.f7254a.f7256b = 1280;
            builder.f7254a.f7257c = 30.0d;
            builder.f7254a.f7258d = FitMode.FILL_SCREEN;
            builder.f7254a.f7259e = null;
            return builder;
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bef.effectsdk.view.BEFView$Builder$a */
        public class C2096a {

            /* renamed from: a */
            public int f7255a;

            /* renamed from: b */
            public int f7256b;

            /* renamed from: c */
            public double f7257c;

            /* renamed from: d */
            public FitMode f7258d;

            /* renamed from: e */
            public ResourceFinder f7259e;

            private C2096a() {
            }
        }

        public Builder setFPS(double d) {
            this.f7254a.f7257c = d;
            return this;
        }

        public Builder setFitMode(FitMode fitMode) {
            this.f7254a.f7258d = fitMode;
            return this;
        }

        public Builder setResourceFinder(ResourceFinder resourceFinder) {
            this.f7254a.f7259e = resourceFinder;
            return this;
        }

        public BEFView build(Context context) {
            BEFView bEFView = new BEFView(context);
            bEFView.setParams(this.f7254a);
            return bEFView;
        }

        public Builder setRenderSize(int i, int i2) {
            this.f7254a.f7255a = i;
            this.f7254a.f7256b = i2;
            return this;
        }

        public BEFView build(Context context, AttributeSet attributeSet) {
            BEFView bEFView = new BEFView(context, attributeSet);
            bEFView.setParams(this.f7254a);
            return bEFView;
        }
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onDestroy() {
        Log.d("BEFView", "onDestroy start");
        if (this.f7209z) {
            Log.e("BEFView", "onDestroy Duplicate!");
            return;
        }
        mo10183a(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC20883 */

            public void run() {
                BEFView.this.mo10249c();
            }
        });
        super.onDestroy();
        this.f7209z = true;
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onPause() {
        Log.d("BEFView", "onPause start");
        if (this.f7209z) {
            Log.e("BEFView", "onPause called after onDestroy!");
            return;
        }
        mo10183a(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.AnonymousClass14 */

            public void run() {
                BEFView.this.mo10249c();
            }
        });
        super.onPause();
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onResume() {
        Log.d("BEFView", "onResume start");
        if (this.f7209z) {
            Log.e("BEFView", "onResume called after onDestroy!");
            return;
        }
        super.onResume();
        mo10183a(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC20872 */

            public void run() {
                if (!BEFView.this.getNativeInited()) {
                    BEFView.this.mo10248b();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bef.effectsdk.view.BEFView$6 */
    public static /* synthetic */ class C20916 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7239a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bef.effectsdk.view.BEFView$FitMode[] r0 = com.bef.effectsdk.view.BEFView.FitMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bef.effectsdk.view.BEFView.C20916.f7239a = r0
                com.bef.effectsdk.view.BEFView$FitMode r1 = com.bef.effectsdk.view.BEFView.FitMode.FIT_WIDTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bef.effectsdk.view.BEFView.C20916.f7239a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bef.effectsdk.view.BEFView$FitMode r1 = com.bef.effectsdk.view.BEFView.FitMode.FIT_HEIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bef.effectsdk.view.BEFView.C20916.f7239a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bef.effectsdk.view.BEFView$FitMode r1 = com.bef.effectsdk.view.BEFView.FitMode.FILL_SCREEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bef.effectsdk.view.BEFView.C20916.f7239a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bef.effectsdk.view.BEFView$FitMode r1 = com.bef.effectsdk.view.BEFView.FitMode.NO_CLIP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.view.BEFView.C20916.<clinit>():void");
        }
    }

    /* renamed from: c */
    public void mo10249c() {
        Log.d("BEFView", "destoryRender start");
        if (getNativeInited()) {
            Log.d("BEFView", "destoryRender do destroy");
            setNativeInited(false);
            if (this.f7202s.f7259e != null) {
                this.f7202s.f7259e.release(this.f7194k);
            }
            AssetResourceFinder assetResourceFinder = this.f7193A;
            if (assetResourceFinder != null) {
                assetResourceFinder.release(0);
            }
            ViewControllerInterface.m9076b(this.f7194k, this);
            ViewControllerInterface.m9064a(this.f7194k);
            this.f7194k = 0;
            ViewControllerInterface.m9063a(this.f7197n);
            this.f7197n = 0;
            MessageCenter.m9051b(this);
            MessageCenter.m9050b();
            this.f7208y = 0;
        }
        Log.d("BEFView", "destoryRender end");
    }

    /* renamed from: b */
    public void mo10248b() {
        Log.d("BEFView", "initRender start");
        setNativeInited(false);
        long j = this.f7194k;
        if (j != 0) {
            try {
                ViewControllerInterface.m9064a(j);
                this.f7194k = 0;
            } catch (Exception unused) {
                Log.e("BEFView", "Destroy old effect handle failed");
            }
        }
        int i = this.f7197n;
        if (i > 0) {
            ViewControllerInterface.m9063a(i);
        }
        if (this.f7194k == 0) {
            long[] jArr = new long[2];
            ViewControllerInterface.m9075a(jArr);
            this.f7194k = jArr[0];
            if (this.f7202s.f7259e != null) {
                ViewControllerInterface.m9068a(this.f7194k, this.f7202s.f7259e.createNativeResourceFinder(this.f7194k), 0);
            } else {
                ViewControllerInterface.m9068a(this.f7194k, 0L, 0L);
            }
            ViewControllerInterface.m9065a(this.f7194k, this.f7202s.f7255a, this.f7202s.f7256b);
        }
        ViewControllerInterface.m9070a(this.f7194k, this);
        MessageCenter.m9047a();
        MessageCenter.m9049a(this);
        this.f7201r = System.nanoTime();
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, this.f7202s.f7255a, this.f7202s.f7256b, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GLES20.glGetIntegerv(36006, iArr3, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glViewport(0, 0, this.f7202s.f7255a, this.f7202s.f7256b);
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        GLES20.glClear(16384);
        GLES20.glBindFramebuffer(36160, iArr3[0]);
        GLES20.glDeleteFramebuffers(1, iArr2, 0);
        this.f7197n = iArr[0];
        String str = this.f7195l;
        if (str != "") {
            ViewControllerInterface.m9071a(this.f7194k, str);
        }
        this.f7208y = 0;
        setNativeInited(true);
        Log.d("BEFView", "initRender end");
    }

    public void setParams(Builder.C2096a aVar) {
        this.f7202s = aVar;
    }

    public synchronized void attachEffect(long j) {
        this.f7207x = j;
    }

    /* access modifiers changed from: protected */
    public synchronized void setNativeInited(boolean z) {
        this.f7196m = z;
    }

    public synchronized void setStickerPath(final String str) {
        mo10183a(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC20861 */

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    BEFView.this.f7195l = str;
                    ViewControllerInterface.m9071a(BEFView.this.f7194k, str);
                }
            }
        });
    }

    public synchronized int addMessageListener(AbstractC2097a aVar) {
        if (aVar == null) {
            return -1;
        }
        this.f7199p.add(aVar);
        return 0;
    }

    public synchronized int removeMessageListener(AbstractC2097a aVar) {
        if (aVar == null) {
            return -1;
        }
        this.f7199p.remove(aVar);
        return 0;
    }

    private BEFView(Context context) {
        super(context);
        this.f7195l = "";
        this.f7198o = new float[16];
        this.f7203t = new int[10];
        this.f7204u = new float[10];
        this.f7205v = new float[10];
        this.f7206w = true;
        m9058a(context);
    }

    /* renamed from: a */
    private void m9058a(Context context) {
        setPreserveEGLContextOnPause(true);
        mo10182a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
        setRenderMode(1);
        this.f7199p = new HashSet<>();
        this.f7200q = new LinkedList();
        AssetResourceFinder assetResourceFinder = new AssetResourceFinder(context.getAssets(), "");
        this.f7193A = assetResourceFinder;
        assetResourceFinder.createNativeResourceFinder(0);
        this.f7209z = false;
    }

    public void onDrawFrame(GL10 gl10) {
        if (getNativeInited()) {
            if (this.f7207x != this.f7208y) {
                Log.d("BEFView", "attach new effectHandle");
                ViewControllerInterface.m9067a(this.f7194k, this.f7207x);
                this.f7208y = this.f7207x;
            }
            long nanoTime = System.nanoTime() - this.f7201r;
            double d = (1.0d / this.f7202s.f7257c) * 1.0E9d;
            double d2 = (double) nanoTime;
            if (d2 < d) {
                try {
                    Thread.sleep((long) (((d - d2) * 1.0d) / 1000000.0d));
                } catch (Exception unused) {
                }
            }
            this.f7201r = System.nanoTime();
            while (!this.f7200q.isEmpty()) {
                this.f7200q.poll().run();
            }
            double nanoTime2 = ((double) System.nanoTime()) / 1.0E9d;
            int width = getWidth();
            int height = getHeight();
            Matrix.setIdentityM(this.f7198o, 0);
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f7202s.f7255a, (float) this.f7202s.f7256b);
            float f = (float) width;
            RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, (float) height);
            PointF a = m9057a(new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), rectF, rectF2, this.f7202s.f7258d);
            PointF a2 = m9057a(new PointF((float) this.f7202s.f7255a, (float) this.f7202s.f7256b), rectF, rectF2, this.f7202s.f7258d);
            if (this.f7202s.f7258d == FitMode.FIT_WIDTH_BOTTOM) {
                a = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                a2 = new PointF(f, (float) ((this.f7202s.f7256b * width) / this.f7202s.f7255a));
            }
            ViewControllerInterface.m9066a(this.f7194k, this.f7197n, this.f7202s.f7255a, this.f7202s.f7256b, this.f7198o, new float[]{a.x, a.y, a2.x - a.x, a2.y - a.y}, nanoTime2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!getNativeInited() || this.f7195l == "") {
            return false;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i = 0; i < pointerCount; i++) {
            this.f7203t[i] = motionEvent.getPointerId(i);
            this.f7204u[i] = motionEvent.getX(i);
            this.f7205v[i] = motionEvent.getY(i);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            m9059a(this.f7204u, this.f7205v, 1);
            final int[] iArr = {this.f7203t[0]};
            final float[] fArr = {this.f7204u[0]};
            final float[] fArr2 = {this.f7205v[0]};
            mo10183a(new Runnable() {
                /* class com.bef.effectsdk.view.BEFView.RunnableC20959 */

                public void run() {
                    ViewControllerInterface.m9074a(BEFView.this.f7194k, iArr, fArr, fArr2);
                }
            });
        } else if (action == 1) {
            m9059a(this.f7204u, this.f7205v, 1);
            final int[] iArr2 = {this.f7203t[0]};
            final float[] fArr3 = {this.f7204u[0]};
            final float[] fArr4 = {this.f7205v[0]};
            mo10183a(new Runnable() {
                /* class com.bef.effectsdk.view.BEFView.AnonymousClass13 */

                public void run() {
                    ViewControllerInterface.m9078c(BEFView.this.f7194k, iArr2, fArr3, fArr4);
                }
            });
        } else if (action == 2) {
            m9059a(this.f7204u, this.f7205v, pointerCount);
            if (!this.f7206w) {
                final int[] iArr3 = {this.f7203t[0]};
                final float[] fArr5 = {this.f7204u[0]};
                final float[] fArr6 = {this.f7205v[0]};
                mo10183a(new Runnable() {
                    /* class com.bef.effectsdk.view.BEFView.AnonymousClass10 */

                    public void run() {
                        ViewControllerInterface.m9077b(BEFView.this.f7194k, iArr3, fArr5, fArr6);
                    }
                });
            } else {
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    final int[] iArr4 = {this.f7203t[i2]};
                    final float[] fArr7 = {this.f7204u[i2]};
                    final float[] fArr8 = {this.f7205v[i2]};
                    mo10183a(new Runnable() {
                        /* class com.bef.effectsdk.view.BEFView.AnonymousClass11 */

                        public void run() {
                            ViewControllerInterface.m9077b(BEFView.this.f7194k, iArr4, fArr7, fArr8);
                        }
                    });
                }
            }
        } else if (action == 5) {
            int action2 = motionEvent.getAction() >> 8;
            if (this.f7206w || action2 == 0) {
                m9059a(this.f7204u, this.f7205v, pointerCount);
                final int[] iArr5 = {this.f7203t[action2]};
                final float[] fArr9 = {this.f7204u[action2]};
                final float[] fArr10 = {this.f7205v[action2]};
                mo10183a(new Runnable() {
                    /* class com.bef.effectsdk.view.BEFView.RunnableC20948 */

                    public void run() {
                        ViewControllerInterface.m9074a(BEFView.this.f7194k, iArr5, fArr9, fArr10);
                    }
                });
            }
        } else if (action == 6) {
            int action3 = motionEvent.getAction() >> 8;
            if (this.f7206w || action3 == 0) {
                m9059a(this.f7204u, this.f7205v, pointerCount);
                final int[] iArr6 = {this.f7203t[action3]};
                final float[] fArr11 = {this.f7204u[action3]};
                final float[] fArr12 = {this.f7205v[action3]};
                mo10183a(new Runnable() {
                    /* class com.bef.effectsdk.view.BEFView.AnonymousClass12 */

                    public void run() {
                        ViewControllerInterface.m9078c(BEFView.this.f7194k, iArr6, fArr11, fArr12);
                    }
                });
            }
        }
        ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.d("BEFView", "onSurfaceCreated start");
        mo10248b();
    }

    public synchronized void setRenderCacheTexture(final String str, final String str2) {
        mo10183a(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC20894 */

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    ViewControllerInterface.m9072a(BEFView.this.f7194k, str, str2);
                }
            }
        });
    }

    private BEFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7195l = "";
        this.f7198o = new float[16];
        this.f7203t = new int[10];
        this.f7204u = new float[10];
        this.f7205v = new float[10];
        this.f7206w = true;
        m9058a(context);
    }

    /* renamed from: a */
    private void m9059a(float[] fArr, float[] fArr2, int i) {
        PointF pointF;
        int width = getWidth();
        int height = getHeight();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            float f2 = fArr2[i2];
            PointF pointF2 = new PointF(f, f2);
            float f3 = (float) width;
            float f4 = (float) height;
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, f4);
            new PointF();
            if (this.f7202s.f7258d == FitMode.FILL_SCREEN) {
                pointF = m9057a(pointF2, rectF, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f7202s.f7255a, (float) this.f7202s.f7256b), FitMode.NO_CLIP);
            } else if (this.f7202s.f7258d == FitMode.NO_CLIP) {
                pointF = m9057a(pointF2, rectF, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f7202s.f7255a, (float) this.f7202s.f7256b), FitMode.FILL_SCREEN);
            } else if (this.f7202s.f7258d == FitMode.FIT_WIDTH_BOTTOM) {
                float f5 = ((f3 * 1.0f) / ((float) this.f7202s.f7255a)) * ((float) this.f7202s.f7256b);
                fArr[i2] = (f * 1.0f) / f3;
                fArr2[i2] = ((f2 - (f4 - f5)) * 1.0f) / f5;
            } else {
                pointF = m9057a(pointF2, rectF, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f7202s.f7255a, (float) this.f7202s.f7256b), this.f7202s.f7258d);
            }
            fArr[i2] = pointF.x / ((float) this.f7202s.f7255a);
            fArr2[i2] = pointF.y / ((float) this.f7202s.f7256b);
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.AbstractC2081a
    public void onMessageReceived(int i, int i2, int i3, String str) {
        postMessage((long) i, (long) i2, (long) i3, str);
    }

    public synchronized int postMessage(final long j, final long j2, final long j3, final String str) {
        mo10183a(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC20927 */

            public void run() {
                BEFView.this.f7200q.add(new Runnable() {
                    /* class com.bef.effectsdk.view.BEFView.RunnableC20927.RunnableC20931 */

                    public void run() {
                        ViewControllerInterface.m9069a(BEFView.this.f7194k, j, j2, j3, str);
                    }
                });
            }
        });
        return 0;
    }

    public synchronized void setRenderCacheTextureWithBuffer(final String str, final byte[] bArr, final int i, final int i2) {
        mo10183a(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC20905 */

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    ViewControllerInterface.m9073a(BEFView.this.f7194k, str, bArr, i, i2);
                }
            }
        });
    }

    public synchronized int nativeOnMsgReceived(long j, long j2, long j3, String str) {
        Iterator<AbstractC2097a> it = this.f7199p.iterator();
        while (it.hasNext()) {
            it.next().mo10288a(j, j2, j3, str);
        }
        return 0;
    }

    /* renamed from: a */
    private PointF m9057a(PointF pointF, RectF rectF, RectF rectF2, FitMode fitMode) {
        PointF pointF2 = new PointF();
        float f = rectF2.left;
        float f2 = rectF2.top;
        float width = rectF2.width();
        float height = rectF2.height();
        float width2 = (pointF.x - rectF.left) / rectF.width();
        float height2 = (pointF.y - rectF.top) / rectF.height();
        int i = C20916.f7239a[fitMode.ordinal()];
        if (i == 1) {
            float width3 = width / rectF.width();
            pointF2.x = (float) ((int) (f + (width2 * width)));
            pointF2.y = (float) ((int) (f2 + ((height - (rectF.height() * width3)) / 2.0f) + (height2 * width3 * rectF.height())));
        } else if (i == 2) {
            float height3 = height / rectF.height();
            pointF2.x = (float) ((int) (f + ((width - (rectF.width() * height3)) / 2.0f) + (width2 * height3 * rectF.width())));
            pointF2.y = (float) ((int) (f2 + (height2 * height)));
        } else if (i != 3) {
            if (i == 4) {
                if (width / rectF.width() > height / rectF.height()) {
                    return m9057a(pointF, rectF, rectF2, FitMode.FIT_HEIGHT);
                }
                return m9057a(pointF, rectF, rectF2, FitMode.FIT_WIDTH);
            }
        } else if (width / rectF.width() < height / rectF.height()) {
            return m9057a(pointF, rectF, rectF2, FitMode.FIT_HEIGHT);
        } else {
            return m9057a(pointF, rectF, rectF2, FitMode.FIT_WIDTH);
        }
        return pointF2;
    }
}
