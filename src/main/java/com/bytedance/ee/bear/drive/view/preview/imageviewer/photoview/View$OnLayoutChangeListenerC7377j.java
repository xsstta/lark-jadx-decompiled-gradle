package com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7356a;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7357b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.j */
public class View$OnLayoutChangeListenerC7377j implements View.OnLayoutChangeListener, View.OnTouchListener {

    /* renamed from: a */
    public static float f19723a = 10.0f;

    /* renamed from: b */
    public static float f19724b = 1.0f;

    /* renamed from: c */
    public static int f19725c = 1;

    /* renamed from: x */
    private static float f19726x = 2.0f;

    /* renamed from: y */
    private static int f19727y = 200;

    /* renamed from: A */
    private final Matrix f19728A = new Matrix();

    /* renamed from: B */
    private final Matrix f19729B = new Matrix();

    /* renamed from: C */
    private final RectF f19730C = new RectF();

    /* renamed from: D */
    private final float[] f19731D = new float[9];

    /* renamed from: E */
    private AbstractC7356a f19732E;

    /* renamed from: F */
    private AbstractC7357b f19733F;

    /* renamed from: G */
    private int f19734G = 2;

    /* renamed from: H */
    private int f19735H = 2;

    /* renamed from: I */
    private float f19736I;

    /* renamed from: J */
    private boolean f19737J = true;

    /* renamed from: K */
    private ImageView.ScaleType f19738K = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: L */
    private float f19739L;

    /* renamed from: M */
    private float f19740M;

    /* renamed from: d */
    public Interpolator f19741d = new AccelerateDecelerateInterpolator();

    /* renamed from: e */
    public int f19742e = f19727y;

    /* renamed from: f */
    public float f19743f = f19724b;

    /* renamed from: g */
    public float f19744g = f19723a;

    /* renamed from: h */
    public float f19745h = f19726x;

    /* renamed from: i */
    public boolean f19746i = true;

    /* renamed from: j */
    public boolean f19747j = false;

    /* renamed from: k */
    public ImageView f19748k;

    /* renamed from: l */
    public C7368b f19749l;

    /* renamed from: m */
    public final Matrix f19750m = new Matrix();

    /* renamed from: n */
    public AbstractC7372e f19751n;

    /* renamed from: o */
    public AbstractC7371d f19752o;

    /* renamed from: p */
    public AbstractC7376i f19753p;

    /* renamed from: q */
    public View.OnClickListener f19754q;

    /* renamed from: r */
    public View.OnLongClickListener f19755r;

    /* renamed from: s */
    public AbstractC7373f f19756s;

    /* renamed from: t */
    public AbstractC7374g f19757t;

    /* renamed from: u */
    public AbstractC7375h f19758u;

    /* renamed from: v */
    public RunnableC7383b f19759v;

    /* renamed from: w */
    public AbstractC7370c f19760w = new AbstractC7370c() {
        /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.C73781 */

        @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.AbstractC7370c
        /* renamed from: a */
        public void mo28720a(float f, float f2) {
            if (!View$OnLayoutChangeListenerC7377j.this.f19749l.mo28714a()) {
                if (View$OnLayoutChangeListenerC7377j.this.f19758u != null) {
                    View$OnLayoutChangeListenerC7377j.this.f19758u.mo28727a(f, f2);
                }
                View$OnLayoutChangeListenerC7377j.this.f19750m.postTranslate(f, f2);
                View$OnLayoutChangeListenerC7377j.this.mo28758g();
                ViewParent parent = View$OnLayoutChangeListenerC7377j.this.f19748k.getParent();
                if (View$OnLayoutChangeListenerC7377j.this.f19746i && !View$OnLayoutChangeListenerC7377j.this.f19749l.mo28714a() && !View$OnLayoutChangeListenerC7377j.this.f19747j) {
                    RectF a = View$OnLayoutChangeListenerC7377j.this.mo28730a();
                    if (a != null && parent != null) {
                        int i = (int) a.left;
                        int i2 = (int) a.right;
                        View$OnLayoutChangeListenerC7377j jVar = View$OnLayoutChangeListenerC7377j.this;
                        int a2 = jVar.mo28729a(jVar.f19748k);
                        if ((i >= 0 && f > BitmapDescriptorFactory.HUE_RED) || (i2 <= a2 && f < BitmapDescriptorFactory.HUE_RED)) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                } else if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.AbstractC7370c
        /* renamed from: a */
        public void mo28721a(float f, float f2, float f3) {
            if ((View$OnLayoutChangeListenerC7377j.this.mo28753d() <= View$OnLayoutChangeListenerC7377j.this.f19744g && View$OnLayoutChangeListenerC7377j.this.mo28753d() >= View$OnLayoutChangeListenerC7377j.this.f19743f) || ((View$OnLayoutChangeListenerC7377j.this.mo28753d() > View$OnLayoutChangeListenerC7377j.this.f19744g && f <= 1.0f) || (View$OnLayoutChangeListenerC7377j.this.mo28753d() < View$OnLayoutChangeListenerC7377j.this.f19743f && f >= 1.0f))) {
                if (View$OnLayoutChangeListenerC7377j.this.f19756s != null) {
                    View$OnLayoutChangeListenerC7377j.this.f19756s.mo28725a(f, f2, f3);
                }
                View$OnLayoutChangeListenerC7377j.this.f19750m.postScale(f, f, f2, f3);
                View$OnLayoutChangeListenerC7377j.this.mo28758g();
            }
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.AbstractC7370c
        /* renamed from: a */
        public void mo28722a(float f, float f2, float f3, float f4) {
            View$OnLayoutChangeListenerC7377j jVar = View$OnLayoutChangeListenerC7377j.this;
            jVar.f19759v = new RunnableC7383b(jVar.f19748k.getContext());
            RunnableC7383b bVar = View$OnLayoutChangeListenerC7377j.this.f19759v;
            View$OnLayoutChangeListenerC7377j jVar2 = View$OnLayoutChangeListenerC7377j.this;
            int a = jVar2.mo28729a(jVar2.f19748k);
            View$OnLayoutChangeListenerC7377j jVar3 = View$OnLayoutChangeListenerC7377j.this;
            bVar.mo28768a(a, jVar3.mo28748b(jVar3.f19748k), (int) f3, (int) f4);
            View$OnLayoutChangeListenerC7377j.this.f19748k.post(View$OnLayoutChangeListenerC7377j.this.f19759v);
        }
    };

    /* renamed from: z */
    private GestureDetector f19761z;

    /* renamed from: b */
    public float mo28747b() {
        return this.f19743f;
    }

    /* renamed from: c */
    public float mo28751c() {
        return this.f19744g;
    }

    /* renamed from: f */
    public Matrix mo28757f() {
        return this.f19729B;
    }

    /* renamed from: a */
    public void mo28742a(AbstractC7373f fVar) {
        this.f19756s = fVar;
    }

    /* renamed from: a */
    public void mo28743a(AbstractC7374g gVar) {
        this.f19757t = gVar;
    }

    /* renamed from: a */
    public void mo28739a(AbstractC7357b bVar) {
        this.f19733F = bVar;
    }

    /* renamed from: a */
    public void mo28746a(boolean z) {
        this.f19746i = z;
    }

    /* renamed from: a */
    public void mo28737a(View.OnLongClickListener onLongClickListener) {
        this.f19755r = onLongClickListener;
    }

    /* renamed from: a */
    public void mo28738a(AbstractC7356a aVar) {
        this.f19732E = aVar;
    }

    /* renamed from: a */
    public void mo28741a(AbstractC7372e eVar) {
        this.f19751n = eVar;
    }

    /* renamed from: a */
    public void mo28740a(AbstractC7371d dVar) {
        this.f19752o = dVar;
    }

    /* renamed from: a */
    public void mo28745a(AbstractC7376i iVar) {
        this.f19753p = iVar;
    }

    /* renamed from: a */
    public void mo28744a(AbstractC7375h hVar) {
        this.f19758u = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.j$b */
    public class RunnableC7383b implements Runnable {

        /* renamed from: b */
        private final OverScroller f19773b;

        /* renamed from: c */
        private int f19774c;

        /* renamed from: d */
        private int f19775d;

        /* renamed from: a */
        public void mo28767a() {
            this.f19773b.forceFinished(true);
        }

        public void run() {
            if (!this.f19773b.isFinished() && this.f19773b.computeScrollOffset()) {
                int currX = this.f19773b.getCurrX();
                int currY = this.f19773b.getCurrY();
                View$OnLayoutChangeListenerC7377j.this.f19750m.postTranslate((float) (this.f19774c - currX), (float) (this.f19775d - currY));
                View$OnLayoutChangeListenerC7377j.this.mo28758g();
                this.f19774c = currX;
                this.f19775d = currY;
                C7367a.m29413a(View$OnLayoutChangeListenerC7377j.this.f19748k, this);
            }
        }

        public RunnableC7383b(Context context) {
            this.f19773b = new OverScroller(context);
        }

        /* renamed from: a */
        public void mo28768a(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF a = View$OnLayoutChangeListenerC7377j.this.mo28730a();
            if (a != null) {
                int round = Math.round(-a.left);
                float f = (float) i;
                if (f < a.width()) {
                    i5 = Math.round(a.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-a.top);
                float f2 = (float) i2;
                if (f2 < a.height()) {
                    i7 = Math.round(a.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.f19774c = round;
                this.f19775d = round2;
                if (round != i5 || round2 != i7) {
                    this.f19773b.fling(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }
    }

    /* renamed from: i */
    private void m29435i() {
        mo28752c(this.f19736I);
        m29431a(m29434h());
        m29436j();
    }

    /* renamed from: k */
    private void m29437k() {
        RunnableC7383b bVar = this.f19759v;
        if (bVar != null) {
            bVar.mo28767a();
            this.f19759v = null;
        }
    }

    /* renamed from: g */
    public void mo28758g() {
        if (m29436j()) {
            m29431a(m29434h());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.j$a */
    public class RunnableC7382a implements Runnable {

        /* renamed from: b */
        private final float f19767b;

        /* renamed from: c */
        private final float f19768c;

        /* renamed from: d */
        private final long f19769d = System.currentTimeMillis();

        /* renamed from: e */
        private final float f19770e;

        /* renamed from: f */
        private final float f19771f;

        /* renamed from: a */
        private float m29471a() {
            return View$OnLayoutChangeListenerC7377j.this.f19741d.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f19769d)) * 1.0f) / ((float) View$OnLayoutChangeListenerC7377j.this.f19742e)));
        }

        public void run() {
            float a = m29471a();
            float f = this.f19770e;
            View$OnLayoutChangeListenerC7377j.this.f19760w.mo28721a((f + ((this.f19771f - f) * a)) / View$OnLayoutChangeListenerC7377j.this.mo28753d(), this.f19767b, this.f19768c);
            if (a < 1.0f) {
                C7367a.m29413a(View$OnLayoutChangeListenerC7377j.this.f19748k, this);
            }
        }

        public RunnableC7382a(float f, float f2, float f3, float f4) {
            this.f19767b = f3;
            this.f19768c = f4;
            this.f19770e = f;
            this.f19771f = f2;
        }
    }

    /* renamed from: h */
    private Matrix m29434h() {
        this.f19729B.set(this.f19728A);
        this.f19729B.postConcat(this.f19750m);
        return this.f19729B;
    }

    /* renamed from: e */
    public void mo28755e() {
        if (this.f19737J) {
            m29432a(this.f19748k.getDrawable());
        } else {
            m29435i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.j$4 */
    public static /* synthetic */ class C73814 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19765a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.C73814.f19765a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.C73814.f19765a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.C73814.f19765a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.C73814.f19765a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.C73814.<clinit>():void");
        }
    }

    /* renamed from: d */
    public float mo28753d() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) m29430a(this.f19750m, 0), 2.0d)) + ((float) Math.pow((double) m29430a(this.f19750m, 3), 2.0d))));
    }

    /* renamed from: a */
    public RectF mo28730a() {
        m29436j();
        return m29433b(m29434h());
    }

    /* renamed from: j */
    private boolean m29436j() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF b = m29433b(m29434h());
        if (b == null) {
            return false;
        }
        float height = b.height();
        float width = b.width();
        float b2 = (float) mo28748b(this.f19748k);
        float f6 = BitmapDescriptorFactory.HUE_RED;
        if (height <= b2) {
            int i = C73814.f19765a[this.f19738K.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f4 = (b2 - height) / 2.0f;
                    f5 = b.top;
                } else {
                    f4 = b2 - height;
                    f5 = b.top;
                }
                f = f4 - f5;
            } else {
                f = -b.top;
            }
            this.f19735H = 2;
        } else if (b.top > BitmapDescriptorFactory.HUE_RED) {
            this.f19735H = 0;
            f = -b.top;
        } else if (b.bottom < b2) {
            this.f19735H = 1;
            f = b2 - b.bottom;
        } else {
            this.f19735H = -1;
            f = BitmapDescriptorFactory.HUE_RED;
        }
        float a = (float) mo28729a(this.f19748k);
        if (width <= a) {
            int i2 = C73814.f19765a[this.f19738K.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f2 = (a - width) / 2.0f;
                    f3 = b.left;
                } else {
                    f2 = a - width;
                    f3 = b.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -b.left;
            }
            this.f19734G = 2;
        } else if (b.left > BitmapDescriptorFactory.HUE_RED) {
            this.f19734G = 0;
            f6 = -b.left;
        } else if (b.right < a) {
            f6 = a - b.right;
            this.f19734G = 1;
        } else {
            this.f19734G = -1;
        }
        this.f19750m.postTranslate(f6, f);
        return true;
    }

    /* renamed from: a */
    public void mo28734a(int i) {
        this.f19742e = i;
    }

    /* renamed from: d */
    public void mo28754d(float f) {
        this.f19743f = f;
    }

    /* renamed from: e */
    public void mo28756e(float f) {
        this.f19744g = f;
    }

    /* renamed from: a */
    public void mo28735a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f19761z.setOnDoubleTapListener(onDoubleTapListener);
    }

    /* renamed from: b */
    public void mo28750b(boolean z) {
        this.f19737J = z;
        mo28755e();
    }

    /* renamed from: b */
    public int mo28748b(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: c */
    public void mo28752c(float f) {
        this.f19750m.postRotate(f % 360.0f);
        mo28758g();
    }

    /* renamed from: a */
    private void m29431a(Matrix matrix) {
        RectF b;
        this.f19748k.setImageMatrix(matrix);
        if (this.f19732E != null && (b = m29433b(matrix)) != null) {
            this.f19732E.onMatrixChanged(b);
        }
    }

    /* renamed from: b */
    public void mo28749b(float f) {
        this.f19750m.setRotate(f % 360.0f);
        mo28758g();
    }

    /* renamed from: b */
    private RectF m29433b(Matrix matrix) {
        Drawable drawable = this.f19748k.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f19730C.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.f19730C);
        return this.f19730C;
    }

    /* renamed from: a */
    public int mo28729a(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public View$OnLayoutChangeListenerC7377j(ImageView imageView) {
        this.f19748k = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.f19736I = BitmapDescriptorFactory.HUE_RED;
            this.f19749l = new C7368b(imageView.getContext(), this.f19760w);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.C73792 */

                public void onLongPress(MotionEvent motionEvent) {
                    if (View$OnLayoutChangeListenerC7377j.this.f19755r != null) {
                        View$OnLayoutChangeListenerC7377j.this.f19755r.onLongClick(View$OnLayoutChangeListenerC7377j.this.f19748k);
                    }
                }

                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (View$OnLayoutChangeListenerC7377j.this.f19757t == null || View$OnLayoutChangeListenerC7377j.this.mo28753d() > View$OnLayoutChangeListenerC7377j.f19724b || motionEvent.getPointerCount() > View$OnLayoutChangeListenerC7377j.f19725c || motionEvent2.getPointerCount() > View$OnLayoutChangeListenerC7377j.f19725c) {
                        return false;
                    }
                    return View$OnLayoutChangeListenerC7377j.this.f19757t.mo28726a(motionEvent, motionEvent2, f, f2);
                }
            });
            this.f19761z = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.GestureDetector$OnDoubleTapListenerC73803 */

                public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                    return false;
                }

                public boolean onDoubleTap(MotionEvent motionEvent) {
                    try {
                        float d = View$OnLayoutChangeListenerC7377j.this.mo28753d();
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (d < View$OnLayoutChangeListenerC7377j.this.f19745h) {
                            View$OnLayoutChangeListenerC7377j jVar = View$OnLayoutChangeListenerC7377j.this;
                            jVar.mo28732a(jVar.f19745h, x, y, true);
                        } else {
                            View$OnLayoutChangeListenerC7377j jVar2 = View$OnLayoutChangeListenerC7377j.this;
                            jVar2.mo28732a(jVar2.f19743f, x, y, true);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                    return true;
                }

                public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (View$OnLayoutChangeListenerC7377j.this.f19754q != null) {
                        View$OnLayoutChangeListenerC7377j.this.f19754q.onClick(View$OnLayoutChangeListenerC7377j.this.f19748k);
                    }
                    RectF a = View$OnLayoutChangeListenerC7377j.this.mo28730a();
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (View$OnLayoutChangeListenerC7377j.this.f19753p != null) {
                        View$OnLayoutChangeListenerC7377j.this.f19753p.mo28728a(View$OnLayoutChangeListenerC7377j.this.f19748k, x, y);
                    }
                    if (a == null) {
                        return false;
                    }
                    if (a.contains(x, y)) {
                        float width = (x - a.left) / a.width();
                        float height = (y - a.top) / a.height();
                        if (View$OnLayoutChangeListenerC7377j.this.f19751n == null) {
                            return true;
                        }
                        View$OnLayoutChangeListenerC7377j.this.f19751n.mo28724a(View$OnLayoutChangeListenerC7377j.this.f19748k, width, height);
                        return true;
                    } else if (View$OnLayoutChangeListenerC7377j.this.f19752o == null) {
                        return false;
                    } else {
                        View$OnLayoutChangeListenerC7377j.this.f19752o.mo28723a(View$OnLayoutChangeListenerC7377j.this.f19748k);
                        return false;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m29432a(Drawable drawable) {
        if (drawable != null) {
            float a = (float) mo28729a(this.f19748k);
            float b = (float) mo28748b(this.f19748k);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f19728A.reset();
            float f = (float) intrinsicWidth;
            float f2 = a / f;
            float f3 = (float) intrinsicHeight;
            float f4 = b / f3;
            if (this.f19738K == ImageView.ScaleType.CENTER) {
                this.f19728A.postTranslate((a - f) / 2.0f, (b - f3) / 2.0f);
            } else if (this.f19738K == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f2, f4);
                this.f19728A.postScale(max, max);
                this.f19728A.postTranslate((a - (f * max)) / 2.0f, (b - (f3 * max)) / 2.0f);
            } else if (this.f19738K == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f2, f4));
                this.f19728A.postScale(min, min);
                this.f19728A.postTranslate((a - (f * min)) / 2.0f, (b - (f3 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f3);
                RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a, b);
                if (((int) this.f19736I) % 180 != 0) {
                    rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, f);
                }
                int i = C73814.f19765a[this.f19738K.ordinal()];
                if (i == 1) {
                    this.f19728A.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                } else if (i == 2) {
                    this.f19728A.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i == 3) {
                    this.f19728A.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i == 4) {
                    this.f19728A.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            }
            m29435i();
        }
    }

    /* renamed from: a */
    public void mo28731a(float f) {
        this.f19745h = Math.min(f, this.f19744g);
    }

    /* renamed from: a */
    public void mo28736a(View.OnClickListener onClickListener) {
        this.f19754q = onClickListener;
    }

    /* renamed from: a */
    private float m29430a(Matrix matrix, int i) {
        matrix.getValues(this.f19731D);
        return this.f19731D[i];
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public void mo28733a(float f, boolean z) {
        mo28732a(f, ((float) this.f19748k.getRight()) / 2.0f, ((float) this.f19748k.getBottom()) / 2.0f, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28732a(float r9, float r10, float r11, boolean r12) {
        /*
            r8 = this;
            float r0 = r8.f19743f
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0008
        L_0x0006:
            r5 = r0
            goto L_0x0010
        L_0x0008:
            float r0 = r8.f19744g
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x000f
            goto L_0x0006
        L_0x000f:
            r5 = r9
        L_0x0010:
            if (r12 == 0) goto L_0x0025
            android.widget.ImageView r9 = r8.f19748k
            com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.j$a r12 = new com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.j$a
            float r4 = r8.mo28753d()
            r2 = r12
            r3 = r8
            r6 = r10
            r7 = r11
            r2.<init>(r4, r5, r6, r7)
            r9.post(r12)
            goto L_0x002d
        L_0x0025:
            android.graphics.Matrix r9 = r8.f19750m
            r9.setScale(r5, r5, r10, r11)
            r8.mo28758g()
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j.mo28732a(float, float, float, boolean):void");
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            m29432a(this.f19748k.getDrawable());
        }
    }
}
