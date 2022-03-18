package com.ss.android.lark.widget.photo_picker.subsampling;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58849b;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58850c;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.C58848a;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaImageDecoder;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaImageRegionDecoder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SubsamplingScaleImageView extends View {

    /* renamed from: A */
    private static final List<Integer> f145451A = Arrays.asList(1, 2, 3);

    /* renamed from: B */
    private static final List<Integer> f145452B = Arrays.asList(2, 1, 3, 4);

    /* renamed from: a */
    public static final String f145453a = "SubsamplingScaleImageView";
    private static Bitmap.Config aC;

    /* renamed from: b */
    public static final List<Integer> f145454b = Arrays.asList(2, 1);

    /* renamed from: y */
    private static final List<Integer> f145455y = Arrays.asList(0, 90, 180, 270, 2, 4, -1);

    /* renamed from: z */
    private static final List<Integer> f145456z = Arrays.asList(1, 2, 3);

    /* renamed from: C */
    private Bitmap f145457C;

    /* renamed from: D */
    private boolean f145458D;

    /* renamed from: E */
    private boolean f145459E;

    /* renamed from: F */
    private Uri f145460F;

    /* renamed from: G */
    private int f145461G;

    /* renamed from: H */
    private Map<Integer, List<C58841h>> f145462H;

    /* renamed from: I */
    private boolean f145463I;

    /* renamed from: J */
    private int f145464J;

    /* renamed from: K */
    private float f145465K;

    /* renamed from: L */
    private float f145466L;

    /* renamed from: M */
    private int f145467M;

    /* renamed from: N */
    private int f145468N;

    /* renamed from: O */
    private int f145469O;

    /* renamed from: P */
    private int f145470P;

    /* renamed from: Q */
    private int f145471Q;

    /* renamed from: R */
    private Executor f145472R;

    /* renamed from: S */
    private boolean f145473S;

    /* renamed from: T */
    private float f145474T;

    /* renamed from: U */
    private int f145475U;

    /* renamed from: V */
    private int f145476V;

    /* renamed from: W */
    private PointF f145477W;
    private final float[] aA;
    private final float aB;
    private Float aa;
    private PointF ab;
    private PointF ac;
    private int ad;
    private int ae;
    private int af;
    private Rect ag;
    private boolean ah;

    /* renamed from: ai  reason: collision with root package name */
    private GestureDetector f175456ai;
    private GestureDetector aj;
    private AbstractC58851d ak;
    private AbstractC58849b<? extends AbstractC58850c> al;
    private AbstractC58849b<? extends AbstractC58851d> am;
    private float an;
    private final float ao;
    private boolean ap;
    private AbstractC58839f aq;
    private final Handler ar;
    private Paint as;
    private Paint at;
    private Paint au;
    private Paint av;
    private C58840g aw;
    private Matrix ax;
    private RectF ay;
    private final float[] az;

    /* renamed from: c */
    public boolean f145478c;

    /* renamed from: d */
    public boolean f145479d;

    /* renamed from: e */
    public boolean f145480e;

    /* renamed from: f */
    public float f145481f;

    /* renamed from: g */
    public float f145482g;

    /* renamed from: h */
    public PointF f145483h;

    /* renamed from: i */
    public PointF f145484i;

    /* renamed from: j */
    public Rect f145485j;

    /* renamed from: k */
    public boolean f145486k;

    /* renamed from: l */
    public boolean f145487l;

    /* renamed from: m */
    public int f145488m;

    /* renamed from: n */
    public final ReadWriteLock f145489n;

    /* renamed from: o */
    public PointF f145490o;

    /* renamed from: p */
    public float f145491p;

    /* renamed from: q */
    public boolean f145492q;

    /* renamed from: r */
    public PointF f145493r;

    /* renamed from: s */
    public PointF f145494s;

    /* renamed from: t */
    public PointF f145495t;

    /* renamed from: u */
    public C58834a f145496u;

    /* renamed from: v */
    public boolean f145497v;

    /* renamed from: w */
    public AbstractC58838e f145498w;

    /* renamed from: x */
    public View.OnLongClickListener f145499x;

    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$d */
    public interface AbstractC58837d {
        /* renamed from: a */
        void mo199406a();

        /* renamed from: b */
        void mo199407b();

        /* renamed from: c */
        void mo199408c();
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$e */
    public interface AbstractC58838e {
        /* renamed from: a */
        void mo199409a();

        /* renamed from: a */
        void mo199410a(Exception exc);

        /* renamed from: b */
        void mo199411b();

        /* renamed from: b */
        void mo199412b(Exception exc);

        /* renamed from: c */
        void mo199413c();

        /* renamed from: c */
        void mo199414c(Exception exc);
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$f */
    public interface AbstractC58839f {
        /* renamed from: a */
        void mo199415a(float f, int i);

        /* renamed from: a */
        void mo199416a(PointF pointF, int i);
    }

    /* renamed from: a */
    private float m228169a(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    /* renamed from: b */
    private float m228182b(long j, float f, float f2, long j2) {
        float f3;
        float f4 = ((float) j) / (((float) j2) / 2.0f);
        if (f4 < 1.0f) {
            f3 = (f2 / 2.0f) * f4;
        } else {
            float f5 = f4 - 1.0f;
            f3 = (-f2) / 2.0f;
            f4 = (f5 * (f5 - 2.0f)) - 1.0f;
        }
        return (f3 * f4) + f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo199347c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo199348d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$h */
    public static class C58841h {

        /* renamed from: a */
        public Rect f145536a;

        /* renamed from: b */
        public int f145537b;

        /* renamed from: c */
        public Bitmap f145538c;

        /* renamed from: d */
        public boolean f145539d;

        /* renamed from: e */
        public boolean f145540e;

        /* renamed from: f */
        public Rect f145541f;

        /* renamed from: g */
        public Rect f145542g;

        private C58841h() {
        }
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return aC;
    }

    public float getMaxScale() {
        return this.f145465K;
    }

    public final int getOrientation() {
        return this.f145464J;
    }

    public final int getSHeight() {
        return this.ae;
    }

    public final int getSWidth() {
        return this.ad;
    }

    public final float getScale() {
        return this.f145481f;
    }

    /* renamed from: a */
    public final void mo199338a(C58844a aVar, C58844a aVar2) {
        mo199339a(aVar, aVar2, (ImageViewState) null);
    }

    /* renamed from: a */
    public final void mo199339a(C58844a aVar, C58844a aVar2, ImageViewState imageViewState) {
        Objects.requireNonNull(aVar, "imageSource must not be null");
        m228178a(true);
        if (imageViewState != null) {
            m228176a(imageViewState);
        }
        if (aVar2 != null) {
            if (aVar.mo199429c() != null) {
                throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            } else if (aVar.mo199432f() <= 0 || aVar.mo199433g() <= 0) {
                throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            } else {
                this.ad = aVar.mo199432f();
                this.ae = aVar.mo199433g();
                this.ag = aVar2.mo199434h();
                if (aVar2.mo199429c() != null) {
                    this.f145459E = aVar2.mo199435i();
                    mo199334a(aVar2.mo199429c());
                } else {
                    Uri b = aVar2.mo199428b();
                    if (b == null && aVar2.mo199430d() != null) {
                        b = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + aVar2.mo199430d());
                    }
                    m228175a(new AsyncTaskC58836c(this, getContext(), this.al, b, true));
                }
            }
        }
        if (aVar.mo199429c() != null && aVar.mo199434h() != null) {
            mo199335a(Bitmap.createBitmap(aVar.mo199429c(), aVar.mo199434h().left, aVar.mo199434h().top, aVar.mo199434h().width(), aVar.mo199434h().height()), 0, false);
        } else if (aVar.mo199429c() != null) {
            mo199335a(aVar.mo199429c(), 0, aVar.mo199435i());
        } else {
            this.f145485j = aVar.mo199434h();
            Uri b2 = aVar.mo199428b();
            this.f145460F = b2;
            if (b2 == null && aVar.mo199430d() != null) {
                this.f145460F = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + aVar.mo199430d());
            }
            if (aVar.mo199431e() || this.f145485j != null) {
                m228175a(new AsyncTaskC58843j(this, getContext(), this.am, this.f145460F));
            } else {
                m228175a(new AsyncTaskC58836c(this, getContext(), this.al, this.f145460F, false));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m228178a(boolean z) {
        AbstractC58838e eVar;
        mo199341a("reset newImage=" + z, new Object[0]);
        this.f145481f = BitmapDescriptorFactory.HUE_RED;
        this.f145482g = BitmapDescriptorFactory.HUE_RED;
        this.f145483h = null;
        this.f145484i = null;
        this.f145477W = null;
        this.aa = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        this.ab = null;
        this.ac = null;
        this.f145486k = false;
        this.ah = false;
        this.f145487l = false;
        this.f145488m = 0;
        this.f145461G = 0;
        this.f145490o = null;
        this.an = BitmapDescriptorFactory.HUE_RED;
        this.f145491p = BitmapDescriptorFactory.HUE_RED;
        this.f145492q = false;
        this.f145494s = null;
        this.f145493r = null;
        this.f145495t = null;
        this.f145496u = null;
        this.aw = null;
        this.ax = null;
        this.ay = null;
        if (z) {
            this.f145460F = null;
            this.f145489n.writeLock().lock();
            try {
                AbstractC58851d dVar = this.ak;
                if (dVar != null) {
                    dVar.mo199437b();
                    this.ak = null;
                }
                this.f145489n.writeLock().unlock();
                Bitmap bitmap = this.f145457C;
                if (bitmap != null && !this.f145459E) {
                    bitmap.recycle();
                }
                if (!(this.f145457C == null || !this.f145459E || (eVar = this.f145498w) == null)) {
                    eVar.mo199413c();
                }
                this.ad = 0;
                this.ae = 0;
                this.af = 0;
                this.f145485j = null;
                this.ag = null;
                this.f145497v = false;
                this.ap = false;
                this.f145457C = null;
                this.f145458D = false;
                this.f145459E = false;
            } catch (Throwable th) {
                this.f145489n.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<C58841h>> map = this.f145462H;
        if (map != null) {
            for (Map.Entry<Integer, List<C58841h>> entry : map.entrySet()) {
                for (C58841h hVar : entry.getValue()) {
                    hVar.f145540e = false;
                    if (hVar.f145538c != null) {
                        hVar.f145538c.recycle();
                        hVar.f145538c = null;
                    }
                }
            }
            this.f145462H = null;
        }
        setGestureDetector(getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 != 262) goto L_0x03ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03e1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m228180a(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 1244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView.m228180a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public void mo199336a(PointF pointF, PointF pointF2) {
        if (!this.f145478c) {
            PointF pointF3 = this.ac;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = this.ac.y;
            } else {
                pointF.x = (float) (m228199j() / 2);
                pointF.y = (float) (m228200k() / 2);
            }
        }
        float min = Math.min(this.f145465K, this.f145474T);
        float f = this.f145481f;
        boolean z = ((double) f) <= ((double) min) * 0.9d || f == this.f145466L;
        if (!z) {
            min = m228201l();
        }
        int i = this.f145475U;
        if (i == 3) {
            mo199333a(min, pointF);
        } else if (i == 2 || !z || !this.f145478c) {
            new C58835b(min, pointF).mo199398a(false).mo199397a((long) this.f145476V).mo199400b(4).mo199399a();
        } else if (i == 1) {
            new C58835b(min, pointF, pointF2).mo199398a(false).mo199397a((long) this.f145476V).mo199400b(4).mo199399a();
        }
        invalidate();
    }

    /* renamed from: a */
    private void m228179a(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    /* renamed from: a */
    private boolean m228181a(C58841h hVar) {
        return m228189d(BitmapDescriptorFactory.HUE_RED) <= ((float) hVar.f145536a.right) && ((float) hVar.f145536a.left) <= m228189d((float) getWidth()) && m228191e(BitmapDescriptorFactory.HUE_RED) <= ((float) hVar.f145536a.bottom) && ((float) hVar.f145536a.top) <= m228191e((float) getHeight());
    }

    /* renamed from: a */
    public void mo199342a(boolean z, C58840g gVar) {
        float f;
        float f2;
        int i;
        if (this.f145468N == 2 && mo199346b()) {
            z = false;
        }
        PointF pointF = gVar.f145535b;
        float a = mo199326a(gVar.f145534a);
        float j = ((float) m228199j()) * a;
        float k = ((float) m228200k()) * a;
        if (this.f145468N == 3 && mo199346b()) {
            pointF.x = Math.max(pointF.x, ((float) (getWidth() / 2)) - j);
            pointF.y = Math.max(pointF.y, ((float) (getHeight() / 2)) - k);
        } else if (z) {
            pointF.x = Math.max(pointF.x, ((float) getWidth()) - j);
            pointF.y = Math.max(pointF.y, ((float) getHeight()) - k);
        } else {
            pointF.x = Math.max(pointF.x, -j);
            pointF.y = Math.max(pointF.y, -k);
        }
        float f3 = 0.5f;
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? ((float) getPaddingLeft()) / ((float) (getPaddingLeft() + getPaddingRight())) : 0.5f;
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            f3 = ((float) getPaddingTop()) / ((float) (getPaddingTop() + getPaddingBottom()));
        }
        if (this.f145468N == 3 && mo199346b()) {
            f = (float) Math.max(0, getWidth() / 2);
            i = Math.max(0, getHeight() / 2);
        } else if (z) {
            f = Math.max((float) BitmapDescriptorFactory.HUE_RED, (((float) getWidth()) - j) * paddingLeft);
            f2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, (((float) getHeight()) - k) * f3);
            pointF.x = Math.min(pointF.x, f);
            pointF.y = Math.min(pointF.y, f2);
            gVar.f145534a = a;
        } else {
            f = (float) Math.max(0, getWidth());
            i = Math.max(0, getHeight());
        }
        f2 = (float) i;
        pointF.x = Math.min(pointF.x, f);
        pointF.y = Math.min(pointF.y, f2);
        gVar.f145534a = a;
    }

    /* renamed from: a */
    public synchronized void mo199340a(AbstractC58851d dVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        mo199341a("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f145464J));
        int i7 = this.ad;
        if (i7 > 0 && (i6 = this.ae) > 0 && !(i7 == i && i6 == i2)) {
            m228178a(false);
            Bitmap bitmap = this.f145457C;
            if (bitmap != null) {
                if (!this.f145459E) {
                    bitmap.recycle();
                }
                this.f145457C = null;
                AbstractC58838e eVar = this.f145498w;
                if (eVar != null && this.f145459E) {
                    eVar.mo199413c();
                }
                this.f145458D = false;
                this.f145459E = false;
            }
        }
        this.ak = dVar;
        this.ad = i;
        this.ae = i2;
        this.af = i3;
        m228194f();
        if (!m228196g() && (i4 = this.f145470P) > 0 && i4 != Integer.MAX_VALUE && (i5 = this.f145471Q) > 0 && i5 != Integer.MAX_VALUE && getWidth() > 0 && getHeight() > 0) {
            m228174a(new Point(this.f145470P, this.f145471Q));
        }
        invalidate();
        requestLayout();
    }

    /* renamed from: a */
    public synchronized void mo199332a() {
        Bitmap bitmap;
        mo199341a("onTileLoaded", new Object[0]);
        m228194f();
        m228196g();
        if (m228192e() && (bitmap = this.f145457C) != null) {
            if (!this.f145459E) {
                bitmap.recycle();
            }
            this.f145457C = null;
            AbstractC58838e eVar = this.f145498w;
            if (eVar != null && this.f145459E) {
                eVar.mo199413c();
            }
            this.f145458D = false;
            this.f145459E = false;
        }
        invalidate();
    }

    /* renamed from: a */
    public synchronized void mo199334a(Bitmap bitmap) {
        mo199341a("onPreviewLoaded", new Object[0]);
        if (this.f145457C == null) {
            if (!this.ap) {
                Rect rect = this.ag;
                if (rect != null) {
                    this.f145457C = Bitmap.createBitmap(bitmap, rect.left, this.ag.top, this.ag.width(), this.ag.height());
                } else {
                    this.f145457C = bitmap;
                }
                this.f145458D = true;
                if (m228194f()) {
                    invalidate();
                    requestLayout();
                }
                return;
            }
        }
        bitmap.recycle();
    }

    /* renamed from: a */
    public synchronized void mo199335a(Bitmap bitmap, int i, boolean z) {
        AbstractC58838e eVar;
        mo199341a("onImageLoaded", new Object[0]);
        int i2 = this.ad;
        if (i2 > 0 && this.ae > 0 && !(i2 == bitmap.getWidth() && this.ae == bitmap.getHeight())) {
            m228178a(false);
        }
        Bitmap bitmap2 = this.f145457C;
        if (bitmap2 != null && !this.f145459E) {
            bitmap2.recycle();
        }
        if (!(this.f145457C == null || !this.f145459E || (eVar = this.f145498w) == null)) {
            eVar.mo199413c();
        }
        this.f145458D = false;
        this.f145459E = z;
        this.f145457C = bitmap;
        this.ad = bitmap.getWidth();
        this.ae = bitmap.getHeight();
        this.af = i;
        boolean f = m228194f();
        boolean g = m228196g();
        if (f || g) {
            invalidate();
            requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        android.util.Log.w(com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView.f145453a, "Could not get orientation of image from media store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r0 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo199327a(android.content.Context r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView.mo199327a(android.content.Context, java.lang.String):int");
    }

    /* renamed from: a */
    public void mo199337a(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
        } else if (getRequiredRotation() == 90) {
            rect2.set(rect.top, this.ae - rect.right, rect.bottom, this.ae - rect.left);
        } else if (getRequiredRotation() == 180) {
            rect2.set(this.ad - rect.right, this.ae - rect.bottom, this.ad - rect.left, this.ae - rect.top);
        } else {
            rect2.set(this.ad - rect.bottom, rect.left, this.ad - rect.top, rect.right);
        }
    }

    /* renamed from: a */
    public final PointF mo199331a(PointF pointF) {
        return mo199330a(pointF.x, pointF.y, new PointF());
    }

    /* renamed from: a */
    public final PointF mo199328a(float f, float f2) {
        return mo199330a(f, f2, new PointF());
    }

    /* renamed from: a */
    public final PointF mo199330a(float f, float f2, PointF pointF) {
        if (this.f145483h == null) {
            return null;
        }
        pointF.set(m228189d(f), m228191e(f2));
        return pointF;
    }

    /* renamed from: a */
    public PointF mo199329a(float f, float f2, float f3, PointF pointF) {
        PointF a = m228172a(f, f2, f3);
        pointF.set((((float) (getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2))) - a.x) / f3, (((float) (getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2))) - a.y) / f3);
        return pointF;
    }

    /* renamed from: a */
    public float mo199326a(float f) {
        return Math.min(this.f145465K, Math.max(m228201l(), f));
    }

    /* renamed from: a */
    public void mo199341a(String str, Object... objArr) {
        if (this.f145463I) {
            Log.d(f145453a, String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public final void mo199333a(float f, PointF pointF) {
        this.f145496u = null;
        this.aa = Float.valueOf(f);
        this.ab = pointF;
        this.ac = pointF;
        invalidate();
    }

    private int getRequiredRotation() {
        int i = this.f145464J;
        if (i == -1) {
            return this.af;
        }
        return i;
    }

    /* renamed from: b */
    public final boolean mo199346b() {
        return this.f145497v;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final float getMinScale() {
        return m228201l();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$a */
    public static class C58834a {

        /* renamed from: a */
        public float f145504a;

        /* renamed from: b */
        public float f145505b;

        /* renamed from: c */
        public PointF f145506c;

        /* renamed from: d */
        public PointF f145507d;

        /* renamed from: e */
        public PointF f145508e;

        /* renamed from: f */
        public PointF f145509f;

        /* renamed from: g */
        public PointF f145510g;

        /* renamed from: h */
        public long f145511h;

        /* renamed from: i */
        public boolean f145512i;

        /* renamed from: j */
        public int f145513j;

        /* renamed from: k */
        public int f145514k;

        /* renamed from: l */
        public long f145515l;

        /* renamed from: m */
        public AbstractC58837d f145516m;

        private C58834a() {
            this.f145511h = 500;
            this.f145512i = true;
            this.f145513j = 2;
            this.f145514k = 1;
            this.f145515l = System.currentTimeMillis();
        }
    }

    /* renamed from: g */
    private boolean m228196g() {
        boolean e = m228192e();
        if (!this.ap && e) {
            m228198i();
            this.ap = true;
            mo199348d();
            AbstractC58838e eVar = this.f145498w;
            if (eVar != null) {
                eVar.mo199411b();
            }
        }
        return e;
    }

    /* renamed from: j */
    private int m228199j() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.ae;
        }
        return this.ad;
    }

    /* renamed from: k */
    private int m228200k() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.ad;
        }
        return this.ae;
    }

    public final PointF getCenter() {
        return mo199328a((float) (getWidth() / 2), (float) (getHeight() / 2));
    }

    public final ImageViewState getState() {
        if (this.f145483h == null || this.ad <= 0 || this.ae <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    /* renamed from: f */
    private boolean m228194f() {
        boolean z;
        if (getWidth() <= 0 || getHeight() <= 0 || this.ad <= 0 || this.ae <= 0 || (this.f145457C == null && !m228192e())) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f145497v && z) {
            m228198i();
            this.f145497v = true;
            mo199347c();
            AbstractC58838e eVar = this.f145498w;
            if (eVar != null) {
                eVar.mo199409a();
            }
        }
        return z;
    }

    /* renamed from: e */
    private boolean m228192e() {
        boolean z = true;
        if (!(this.f145457C == null || this.f145458D)) {
            return true;
        }
        Map<Integer, List<C58841h>> map = this.f145462H;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, List<C58841h>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.f145461G) {
                for (C58841h hVar : entry.getValue()) {
                    if (hVar.f145539d || hVar.f145538c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: h */
    private void m228197h() {
        if (this.as == null) {
            Paint paint = new Paint();
            this.as = paint;
            paint.setAntiAlias(true);
            this.as.setFilterBitmap(true);
            this.as.setDither(true);
        }
        if ((this.at == null || this.au == null) && this.f145463I) {
            Paint paint2 = new Paint();
            this.at = paint2;
            paint2.setTextSize((float) m228170a(12));
            this.at.setColor(-65281);
            this.at.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.au = paint3;
            paint3.setColor(-65281);
            this.au.setStyle(Paint.Style.STROKE);
            this.au.setStrokeWidth((float) m228170a(1));
        }
    }

    /* renamed from: i */
    private void m228198i() {
        Float f;
        if (getWidth() != 0 && getHeight() != 0 && this.ad > 0 && this.ae > 0) {
            if (!(this.ab == null || (f = this.aa) == null)) {
                this.f145481f = f.floatValue();
                if (this.f145483h == null) {
                    this.f145483h = new PointF();
                }
                this.f145483h.x = (((float) getWidth()) / 2.0f) - (this.f145481f * this.ab.x);
                this.f145483h.y = (((float) getHeight()) / 2.0f) - (this.f145481f * this.ab.y);
                this.ab = null;
                this.aa = null;
                m228190d(true);
                m228188c(true);
            }
            m228190d(false);
        }
    }

    /* renamed from: l */
    private float m228201l() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.f145469O;
        if (i == 2 || i == 4) {
            return Math.max(((float) (getWidth() - paddingLeft)) / ((float) m228199j()), ((float) (getHeight() - paddingBottom)) / ((float) m228200k()));
        }
        if (i == 3) {
            float f = this.f145466L;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                return f;
            }
        }
        return Math.min(((float) (getWidth() - paddingLeft)) / ((float) m228199j()), ((float) (getHeight() - paddingBottom)) / ((float) m228200k()));
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$b */
    public final class C58835b {

        /* renamed from: b */
        private final float f145518b;

        /* renamed from: c */
        private final PointF f145519c;

        /* renamed from: d */
        private final PointF f145520d;

        /* renamed from: e */
        private long f145521e;

        /* renamed from: f */
        private int f145522f;

        /* renamed from: g */
        private int f145523g;

        /* renamed from: h */
        private boolean f145524h;

        /* renamed from: i */
        private boolean f145525i;

        /* renamed from: j */
        private AbstractC58837d f145526j;

        /* renamed from: a */
        public void mo199399a() {
            PointF pointF;
            if (!(SubsamplingScaleImageView.this.f145496u == null || SubsamplingScaleImageView.this.f145496u.f145516m == null)) {
                try {
                    SubsamplingScaleImageView.this.f145496u.f145516m.mo199408c();
                } catch (Exception e) {
                    Log.w(SubsamplingScaleImageView.f145453a, "Error thrown by animation listener", e);
                }
            }
            int paddingLeft = SubsamplingScaleImageView.this.getPaddingLeft() + (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = SubsamplingScaleImageView.this.getPaddingTop() + (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float a = SubsamplingScaleImageView.this.mo199326a(this.f145518b);
            if (this.f145525i) {
                pointF = SubsamplingScaleImageView.this.mo199329a(this.f145519c.x, this.f145519c.y, a, new PointF());
            } else {
                pointF = this.f145519c;
            }
            SubsamplingScaleImageView.this.f145496u = new C58834a();
            SubsamplingScaleImageView.this.f145496u.f145504a = SubsamplingScaleImageView.this.f145481f;
            SubsamplingScaleImageView.this.f145496u.f145505b = a;
            SubsamplingScaleImageView.this.f145496u.f145515l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f145496u.f145508e = pointF;
            SubsamplingScaleImageView.this.f145496u.f145506c = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.f145496u.f145507d = pointF;
            SubsamplingScaleImageView.this.f145496u.f145509f = SubsamplingScaleImageView.this.mo199344b(pointF);
            SubsamplingScaleImageView.this.f145496u.f145510g = new PointF((float) paddingLeft, (float) paddingTop);
            SubsamplingScaleImageView.this.f145496u.f145511h = this.f145521e;
            SubsamplingScaleImageView.this.f145496u.f145512i = this.f145524h;
            SubsamplingScaleImageView.this.f145496u.f145513j = this.f145522f;
            SubsamplingScaleImageView.this.f145496u.f145514k = this.f145523g;
            SubsamplingScaleImageView.this.f145496u.f145515l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f145496u.f145516m = this.f145526j;
            PointF pointF2 = this.f145520d;
            if (pointF2 != null) {
                float f = pointF2.x - (SubsamplingScaleImageView.this.f145496u.f145506c.x * a);
                float f2 = this.f145520d.y - (SubsamplingScaleImageView.this.f145496u.f145506c.y * a);
                C58840g gVar = new C58840g(a, new PointF(f, f2));
                SubsamplingScaleImageView.this.mo199342a(true, gVar);
                SubsamplingScaleImageView.this.f145496u.f145510g = new PointF(this.f145520d.x + (gVar.f145535b.x - f), this.f145520d.y + (gVar.f145535b.y - f2));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        /* renamed from: a */
        public C58835b mo199397a(long j) {
            this.f145521e = j;
            return this;
        }

        /* renamed from: b */
        public C58835b mo199400b(int i) {
            this.f145523g = i;
            return this;
        }

        /* renamed from: a */
        public C58835b mo199398a(boolean z) {
            this.f145524h = z;
            return this;
        }

        /* renamed from: b */
        public C58835b mo199401b(boolean z) {
            this.f145525i = z;
            return this;
        }

        /* renamed from: a */
        public C58835b mo199396a(int i) {
            if (SubsamplingScaleImageView.f145454b.contains(Integer.valueOf(i))) {
                this.f145522f = i;
                return this;
            }
            throw new IllegalArgumentException("Unknown easing type: " + i);
        }

        private C58835b(float f) {
            this.f145521e = 500;
            this.f145522f = 2;
            this.f145523g = 1;
            this.f145524h = true;
            this.f145525i = true;
            this.f145518b = f;
            this.f145519c = SubsamplingScaleImageView.this.getCenter();
            this.f145520d = null;
        }

        private C58835b(PointF pointF) {
            this.f145521e = 500;
            this.f145522f = 2;
            this.f145523g = 1;
            this.f145524h = true;
            this.f145525i = true;
            this.f145518b = SubsamplingScaleImageView.this.f145481f;
            this.f145519c = pointF;
        }

        private C58835b(float f, PointF pointF) {
            this.f145521e = 500;
            this.f145522f = 2;
            this.f145523g = 1;
            this.f145524h = true;
            this.f145525i = true;
            this.f145518b = f;
            this.f145519c = pointF;
        }

        private C58835b(float f, PointF pointF, PointF pointF2) {
            this.f145521e = 500;
            this.f145522f = 2;
            this.f145523g = 1;
            this.f145524h = true;
            this.f145525i = true;
            this.f145518b = f;
            this.f145519c = pointF;
            this.f145520d = pointF2;
        }
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        aC = config;
    }

    public final void setDebug(boolean z) {
        this.f145463I = z;
    }

    public final void setDoubleTapZoomScale(float f) {
        this.f145474T = f;
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.f145473S = z;
    }

    public final void setMaxScale(float f) {
        this.f145465K = f;
    }

    public final void setMinScale(float f) {
        this.f145466L = f;
    }

    public void setOnImageEventListener(AbstractC58838e eVar) {
        this.f145498w = eVar;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f145499x = onLongClickListener;
    }

    public void setOnStateChangedListener(AbstractC58839f fVar) {
        this.aq = fVar;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.f145480e = z;
    }

    public final void setZoomEnabled(boolean z) {
        this.f145479d = z;
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m228170a(int i) {
        return (int) (this.aB * ((float) i));
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.f145476V = Math.max(0, i);
    }

    public void setExecutor(Executor executor) {
        Objects.requireNonNull(executor, "Executor must not be null");
        this.f145472R = executor;
    }

    public final void setImage(C58844a aVar) {
        mo199339a(aVar, (C58844a) null, (ImageViewState) null);
    }

    public void setMaxTileSize(int i) {
        this.f145470P = i;
        this.f145471Q = i;
    }

    /* renamed from: b */
    private void m228186b(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: d */
    private float m228189d(float f) {
        PointF pointF = this.f145483h;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.f145481f;
    }

    /* renamed from: e */
    private float m228191e(float f) {
        PointF pointF = this.f145483h;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.f145481f;
    }

    /* renamed from: f */
    private float m228193f(float f) {
        PointF pointF = this.f145483h;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f145481f) + pointF.x;
    }

    /* renamed from: g */
    private float m228195g(float f) {
        PointF pointF = this.f145483h;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f145481f) + pointF.y;
    }

    public final void setBitmapDecoderFactory(AbstractC58849b<? extends AbstractC58850c> bVar) {
        if (bVar != null) {
            this.al = bVar;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setRegionDecoderFactory(AbstractC58849b<? extends AbstractC58851d> bVar) {
        if (bVar != null) {
            this.am = bVar;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setBitmapDecoderClass(Class<? extends AbstractC58850c> cls) {
        if (cls != null) {
            this.al = new C58848a(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public void setGestureDetector(final Context context) {
        this.f175456ai = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            /* class com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView.C588322 */

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (!SubsamplingScaleImageView.this.f145479d || !SubsamplingScaleImageView.this.f145497v || SubsamplingScaleImageView.this.f145483h == null) {
                    return super.onDoubleTapEvent(motionEvent);
                }
                SubsamplingScaleImageView.this.setGestureDetector(context);
                if (SubsamplingScaleImageView.this.f145480e) {
                    SubsamplingScaleImageView.this.f145490o = new PointF(motionEvent.getX(), motionEvent.getY());
                    SubsamplingScaleImageView.this.f145484i = new PointF(SubsamplingScaleImageView.this.f145483h.x, SubsamplingScaleImageView.this.f145483h.y);
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    subsamplingScaleImageView.f145482g = subsamplingScaleImageView.f145481f;
                    SubsamplingScaleImageView.this.f145487l = true;
                    SubsamplingScaleImageView.this.f145486k = true;
                    SubsamplingScaleImageView.this.f145491p = -1.0f;
                    SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                    subsamplingScaleImageView2.f145494s = subsamplingScaleImageView2.mo199331a(subsamplingScaleImageView2.f145490o);
                    SubsamplingScaleImageView.this.f145495t = new PointF(motionEvent.getX(), motionEvent.getY());
                    SubsamplingScaleImageView.this.f145493r = new PointF(SubsamplingScaleImageView.this.f145494s.x, SubsamplingScaleImageView.this.f145494s.y);
                    SubsamplingScaleImageView.this.f145492q = false;
                    return false;
                }
                SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                subsamplingScaleImageView3.mo199336a(subsamplingScaleImageView3.mo199331a(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!SubsamplingScaleImageView.this.f145478c || !SubsamplingScaleImageView.this.f145497v || SubsamplingScaleImageView.this.f145483h == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.f145486k))) {
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
                PointF pointF = new PointF(SubsamplingScaleImageView.this.f145483h.x + (f * 0.25f), SubsamplingScaleImageView.this.f145483h.y + (f2 * 0.25f));
                new C58835b(new PointF((((float) (SubsamplingScaleImageView.this.getWidth() / 2)) - pointF.x) / SubsamplingScaleImageView.this.f145481f, (((float) (SubsamplingScaleImageView.this.getHeight() / 2)) - pointF.y) / SubsamplingScaleImageView.this.f145481f)).mo199396a(1).mo199401b(false).mo199400b(3).mo199399a();
                return true;
            }
        });
        this.aj = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            /* class com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView.C588333 */

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setRegionDecoderClass(Class<? extends AbstractC58851d> cls) {
        if (cls != null) {
            this.am = new C58848a(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.av = null;
        } else {
            Paint paint = new Paint();
            this.av = paint;
            paint.setStyle(Paint.Style.FILL);
            this.av.setColor(i);
        }
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$c */
    public static class AsyncTaskC58836c extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private final WeakReference<SubsamplingScaleImageView> f145527a;

        /* renamed from: b */
        private final WeakReference<Context> f145528b;

        /* renamed from: c */
        private final WeakReference<AbstractC58849b<? extends AbstractC58850c>> f145529c;

        /* renamed from: d */
        private final Uri f145530d;

        /* renamed from: e */
        private final boolean f145531e;

        /* renamed from: f */
        private Bitmap f145532f;

        /* renamed from: g */
        private Exception f145533g;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f145527a.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f145532f;
                if (bitmap == null || num == null) {
                    if (this.f145533g != null && subsamplingScaleImageView.f145498w != null) {
                        if (this.f145531e) {
                            subsamplingScaleImageView.f145498w.mo199410a(this.f145533g);
                        } else {
                            subsamplingScaleImageView.f145498w.mo199412b(this.f145533g);
                        }
                    }
                } else if (this.f145531e) {
                    subsamplingScaleImageView.mo199334a(bitmap);
                } else {
                    subsamplingScaleImageView.mo199335a(bitmap, num.intValue(), false);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            try {
                String uri = this.f145530d.toString();
                Context context = this.f145528b.get();
                AbstractC58849b<? extends AbstractC58850c> bVar = this.f145529c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f145527a.get();
                if (context == null || bVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.mo199341a("BitmapLoadTask.doInBackground", new Object[0]);
                this.f145532f = ((AbstractC58850c) bVar.mo199026b()).mo199033a(context, this.f145530d);
                return Integer.valueOf(subsamplingScaleImageView.mo199327a(context, uri));
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.f145453a, "Failed to load bitmap", e);
                this.f145533g = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(SubsamplingScaleImageView.f145453a, "Failed to load bitmap - OutOfMemoryError", e2);
                this.f145533g = new RuntimeException(e2);
                return null;
            }
        }

        AsyncTaskC58836c(SubsamplingScaleImageView subsamplingScaleImageView, Context context, AbstractC58849b<? extends AbstractC58850c> bVar, Uri uri, boolean z) {
            this.f145527a = new WeakReference<>(subsamplingScaleImageView);
            this.f145528b = new WeakReference<>(context);
            this.f145529c = new WeakReference<>(bVar);
            this.f145530d = uri;
            this.f145531e = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$i */
    public static class AsyncTaskC58842i extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        private final WeakReference<SubsamplingScaleImageView> f145543a;

        /* renamed from: b */
        private final WeakReference<AbstractC58851d> f145544b;

        /* renamed from: c */
        private final WeakReference<C58841h> f145545c;

        /* renamed from: d */
        private Exception f145546d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f145543a.get();
            C58841h hVar = this.f145545c.get();
            if (subsamplingScaleImageView != null && hVar != null) {
                if (bitmap != null) {
                    hVar.f145538c = bitmap;
                    hVar.f145539d = false;
                    subsamplingScaleImageView.mo199332a();
                } else if (this.f145546d != null && subsamplingScaleImageView.f145498w != null) {
                    subsamplingScaleImageView.f145498w.mo199414c(this.f145546d);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.f145543a.get();
                AbstractC58851d dVar = this.f145544b.get();
                C58841h hVar = this.f145545c.get();
                if (dVar != null && hVar != null && subsamplingScaleImageView != null && dVar.mo199436a() && hVar.f145540e) {
                    subsamplingScaleImageView.mo199341a("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", hVar.f145536a, Integer.valueOf(hVar.f145537b));
                    subsamplingScaleImageView.f145489n.readLock().lock();
                    try {
                        if (dVar.mo199436a()) {
                            subsamplingScaleImageView.mo199337a(hVar.f145536a, hVar.f145542g);
                            if (subsamplingScaleImageView.f145485j != null) {
                                hVar.f145542g.offset(subsamplingScaleImageView.f145485j.left, subsamplingScaleImageView.f145485j.top);
                            }
                            return dVar.mo199034a(hVar.f145542g, hVar.f145537b);
                        }
                        hVar.f145539d = false;
                        subsamplingScaleImageView.f145489n.readLock().unlock();
                        return null;
                    } finally {
                        subsamplingScaleImageView.f145489n.readLock().unlock();
                    }
                } else if (hVar == null) {
                    return null;
                } else {
                    hVar.f145539d = false;
                    return null;
                }
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.f145453a, "Failed to decode tile", e);
                this.f145546d = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(SubsamplingScaleImageView.f145453a, "Failed to decode tile - OutOfMemoryError", e2);
                this.f145546d = new RuntimeException(e2);
                return null;
            }
        }

        AsyncTaskC58842i(SubsamplingScaleImageView subsamplingScaleImageView, AbstractC58851d dVar, C58841h hVar) {
            this.f145543a = new WeakReference<>(subsamplingScaleImageView);
            this.f145544b = new WeakReference<>(dVar);
            this.f145545c = new WeakReference<>(hVar);
            hVar.f145539d = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$j */
    public static class AsyncTaskC58843j extends AsyncTask<Void, Void, int[]> {

        /* renamed from: a */
        private final WeakReference<SubsamplingScaleImageView> f145547a;

        /* renamed from: b */
        private final WeakReference<Context> f145548b;

        /* renamed from: c */
        private final WeakReference<AbstractC58849b<? extends AbstractC58851d>> f145549c;

        /* renamed from: d */
        private final Uri f145550d;

        /* renamed from: e */
        private AbstractC58851d f145551e;

        /* renamed from: f */
        private Exception f145552f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f145547a.get();
            if (subsamplingScaleImageView != null) {
                AbstractC58851d dVar = this.f145551e;
                if (dVar != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.mo199340a(dVar, iArr[0], iArr[1], iArr[2]);
                } else if (this.f145552f != null && subsamplingScaleImageView.f145498w != null) {
                    subsamplingScaleImageView.f145498w.mo199412b(this.f145552f);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int[] doInBackground(Void... voidArr) {
            try {
                String uri = this.f145550d.toString();
                Context context = this.f145548b.get();
                AbstractC58849b<? extends AbstractC58851d> bVar = this.f145549c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f145547a.get();
                if (context == null || bVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.mo199341a("TilesInitTask.doInBackground", new Object[0]);
                AbstractC58851d dVar = (AbstractC58851d) bVar.mo199026b();
                this.f145551e = dVar;
                Point a = dVar.mo199035a(context, this.f145550d);
                int i = a.x;
                int i2 = a.y;
                int a2 = subsamplingScaleImageView.mo199327a(context, uri);
                if (subsamplingScaleImageView.f145485j != null) {
                    subsamplingScaleImageView.f145485j.left = Math.max(0, subsamplingScaleImageView.f145485j.left);
                    subsamplingScaleImageView.f145485j.top = Math.max(0, subsamplingScaleImageView.f145485j.top);
                    subsamplingScaleImageView.f145485j.right = Math.min(i, subsamplingScaleImageView.f145485j.right);
                    subsamplingScaleImageView.f145485j.bottom = Math.min(i2, subsamplingScaleImageView.f145485j.bottom);
                    i = subsamplingScaleImageView.f145485j.width();
                    i2 = subsamplingScaleImageView.f145485j.height();
                }
                return new int[]{i, i2, a2};
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.f145453a, "Failed to initialise bitmap decoder", e);
                this.f145552f = e;
                return null;
            }
        }

        AsyncTaskC58843j(SubsamplingScaleImageView subsamplingScaleImageView, Context context, AbstractC58849b<? extends AbstractC58851d> bVar, Uri uri) {
            this.f145547a = new WeakReference<>(subsamplingScaleImageView);
            this.f145548b = new WeakReference<>(context);
            this.f145549c = new WeakReference<>(bVar);
            this.f145550d = uri;
        }
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (f145456z.contains(Integer.valueOf(i))) {
            this.f145475U = i;
            return;
        }
        throw new IllegalArgumentException("Invalid zoom style: " + i);
    }

    public final void setMinimumScaleType(int i) {
        if (f145452B.contains(Integer.valueOf(i))) {
            this.f145469O = i;
            if (mo199346b()) {
                m228190d(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid scale type: " + i);
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f145467M = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i);
        if (mo199346b()) {
            m228178a(false);
            invalidate();
        }
    }

    public final void setOrientation(int i) {
        if (f145455y.contains(Integer.valueOf(i))) {
            this.f145464J = i;
            m228178a(false);
            invalidate();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i);
    }

    public final void setPanLimit(int i) {
        if (f145451A.contains(Integer.valueOf(i))) {
            this.f145468N = i;
            if (mo199346b()) {
                m228190d(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid pan limit: " + i);
    }

    /* renamed from: a */
    private Point m228171a(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.f145470P), Math.min(canvas.getMaximumBitmapHeight(), this.f145471Q));
    }

    /* renamed from: c */
    private int m228187c(float f) {
        int i;
        if (this.f145467M > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= ((float) this.f145467M) / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int j = (int) (((float) m228199j()) * f);
        int k = (int) (((float) m228200k()) * f);
        if (j == 0 || k == 0) {
            return 32;
        }
        int i2 = 1;
        if (m228200k() > k || m228199j() > j) {
            i = Math.round(((float) m228200k()) / ((float) k));
            int round = Math.round(((float) m228199j()) / ((float) j));
            if (i >= round) {
                i = round;
            }
        } else {
            i = 1;
        }
        while (true) {
            int i3 = i2 * 2;
            if (i3 >= i) {
                return i2;
            }
            i2 = i3;
        }
    }

    /* renamed from: d */
    private void m228190d(boolean z) {
        boolean z2;
        if (this.f145483h == null) {
            z2 = true;
            this.f145483h = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            z2 = false;
        }
        if (this.aw == null) {
            this.aw = new C58840g(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        }
        this.aw.f145534a = this.f145481f;
        this.aw.f145535b.set(this.f145483h);
        mo199342a(z, this.aw);
        this.f145481f = this.aw.f145534a;
        this.f145483h.set(this.aw.f145535b);
        if (z2 && this.f145469O != 4) {
            this.f145483h.set(m228172a((float) (m228199j() / 2), (float) (m228200k() / 2), this.f145481f));
        }
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.f145478c = z;
        if (!z && (pointF = this.f145483h) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.f145481f * ((float) (m228199j() / 2)));
            this.f145483h.y = ((float) (getHeight() / 2)) - (this.f145481f * ((float) (m228200k() / 2)));
            if (mo199346b()) {
                m228188c(true);
                invalidate();
            }
        }
    }

    /* renamed from: b */
    private void m228183b(Point point) {
        boolean z;
        int i;
        int i2;
        int i3 = 1;
        mo199341a("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.f145462H = new LinkedHashMap();
        int i4 = this.f145461G;
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int j = m228199j() / i5;
            int k = m228200k() / i6;
            int i7 = j / i4;
            int i8 = k / i4;
            while (true) {
                if (i7 + i5 + i3 > point.x || (((double) i7) > ((double) getWidth()) * 1.25d && i4 < this.f145461G)) {
                    i5++;
                    j = m228199j() / i5;
                    i7 = j / i4;
                    i3 = 1;
                }
            }
            while (true) {
                if (i8 + i6 + i3 > point.y || (((double) i8) > ((double) getHeight()) * 1.25d && i4 < this.f145461G)) {
                    i6++;
                    k = m228200k() / i6;
                    i8 = k / i4;
                    i3 = 1;
                }
            }
            ArrayList arrayList = new ArrayList(i5 * i6);
            for (int i9 = 0; i9 < i5; i9++) {
                for (int i10 = 0; i10 < i6; i10++) {
                    C58841h hVar = new C58841h();
                    hVar.f145537b = i4;
                    if (i4 == this.f145461G) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hVar.f145540e = z;
                    int i11 = i9 * j;
                    int i12 = i10 * k;
                    if (i9 == i5 - 1) {
                        i = m228199j();
                    } else {
                        i = (i9 + 1) * j;
                    }
                    if (i10 == i6 - 1) {
                        i2 = m228200k();
                    } else {
                        i2 = (i10 + 1) * k;
                    }
                    hVar.f145536a = new Rect(i11, i12, i, i2);
                    hVar.f145541f = new Rect(0, 0, 0, 0);
                    hVar.f145542g = new Rect(hVar.f145536a);
                    arrayList.add(hVar);
                }
            }
            this.f145462H.put(Integer.valueOf(i4), arrayList);
            if (i4 != 1) {
                i4 /= 2;
                i3 = 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private void m228188c(boolean z) {
        if (!(this.ak == null || this.f145462H == null)) {
            int min = Math.min(this.f145461G, m228187c(this.f145481f));
            for (Map.Entry<Integer, List<C58841h>> entry : this.f145462H.entrySet()) {
                for (C58841h hVar : entry.getValue()) {
                    if (hVar.f145537b < min || (hVar.f145537b > min && hVar.f145537b != this.f145461G)) {
                        hVar.f145540e = false;
                        if (hVar.f145538c != null) {
                            hVar.f145538c.recycle();
                            hVar.f145538c = null;
                        }
                    }
                    if (hVar.f145537b == min) {
                        if (m228181a(hVar)) {
                            hVar.f145540e = true;
                            if (!hVar.f145539d && hVar.f145538c == null && z) {
                                m228175a(new AsyncTaskC58842i(this, this.ak, hVar));
                            }
                        } else if (hVar.f145537b != this.f145461G) {
                            hVar.f145540e = false;
                            if (hVar.f145538c != null) {
                                hVar.f145538c.recycle();
                                hVar.f145538c = null;
                            }
                        }
                    } else if (hVar.f145537b == this.f145461G) {
                        hVar.f145540e = true;
                    }
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        C58834a aVar = this.f145496u;
        if (aVar == null || aVar.f145512i) {
            C58834a aVar2 = this.f145496u;
            if (!(aVar2 == null || aVar2.f145516m == null)) {
                try {
                    this.f145496u.f145516m.mo199407b();
                } catch (Exception e) {
                    Log.w(f145453a, "Error thrown by animation listener", e);
                }
            }
            this.f145496u = null;
            if (this.f145483h == null) {
                GestureDetector gestureDetector2 = this.aj;
                if (gestureDetector2 != null) {
                    gestureDetector2.onTouchEvent(motionEvent);
                }
                return true;
            } else if (this.f145487l || ((gestureDetector = this.f175456ai) != null && !gestureDetector.onTouchEvent(motionEvent))) {
                if (this.f145484i == null) {
                    this.f145484i = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.f145477W == null) {
                    this.f145477W = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.f145490o == null) {
                    this.f145490o = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                float f = this.f145481f;
                this.f145477W.set(this.f145483h);
                boolean a = m228180a(motionEvent);
                m228173a(f, this.f145477W, 2);
                if (a || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            } else {
                this.f145486k = false;
                this.ah = false;
                this.f145488m = 0;
                return true;
            }
        } else {
            m228186b(true);
            return true;
        }
    }

    /* renamed from: b */
    public final PointF mo199344b(PointF pointF) {
        return mo199343b(pointF.x, pointF.y, new PointF());
    }

    /* renamed from: a */
    private synchronized void m228174a(Point point) {
        mo199341a("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        C58840g gVar = new C58840g(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        this.aw = gVar;
        mo199342a(true, gVar);
        int c = m228187c(this.aw.f145534a);
        this.f145461G = c;
        if (c > 1) {
            this.f145461G = c / 2;
        }
        if (this.f145461G != 1 || this.f145485j != null || m228199j() >= point.x || m228200k() >= point.y) {
            m228183b(point);
            for (C58841h hVar : this.f145462H.get(Integer.valueOf(this.f145461G))) {
                m228175a(new AsyncTaskC58842i(this, this.ak, hVar));
            }
            m228188c(true);
        } else {
            this.ak.mo199437b();
            this.ak = null;
            m228175a(new AsyncTaskC58836c(this, getContext(), this.al, this.f145460F, false));
        }
    }

    /* renamed from: b */
    public C58835b mo199345b(float f) {
        if (!mo199346b()) {
            return null;
        }
        return new C58835b(f);
    }

    /* renamed from: a */
    private void m228175a(AsyncTask<Void, Void, ?> asyncTask) {
        asyncTask.executeOnExecutor(this.f145472R, new Void[0]);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        C58841h hVar;
        boolean z;
        boolean z2;
        super.onDraw(canvas);
        m228197h();
        if (!(this.ad == 0 || this.ae == 0 || getWidth() == 0 || getHeight() == 0)) {
            if (this.f145462H == null && this.ak != null) {
                m228174a(m228171a(canvas));
            }
            if (m228194f()) {
                m228198i();
                C58834a aVar = this.f145496u;
                if (!(aVar == null || aVar.f145509f == null)) {
                    float f2 = this.f145481f;
                    if (this.f145477W == null) {
                        this.f145477W = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    }
                    this.f145477W.set(this.f145483h);
                    long currentTimeMillis = System.currentTimeMillis() - this.f145496u.f145515l;
                    if (currentTimeMillis > this.f145496u.f145511h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long min = Math.min(currentTimeMillis, this.f145496u.f145511h);
                    this.f145481f = m228168a(this.f145496u.f145513j, min, this.f145496u.f145504a, this.f145496u.f145505b - this.f145496u.f145504a, this.f145496u.f145511h);
                    float a = m228168a(this.f145496u.f145513j, min, this.f145496u.f145509f.x, this.f145496u.f145510g.x - this.f145496u.f145509f.x, this.f145496u.f145511h);
                    float a2 = m228168a(this.f145496u.f145513j, min, this.f145496u.f145509f.y, this.f145496u.f145510g.y - this.f145496u.f145509f.y, this.f145496u.f145511h);
                    this.f145483h.x -= m228193f(this.f145496u.f145507d.x) - a;
                    this.f145483h.y -= m228195g(this.f145496u.f145507d.y) - a2;
                    if (z || this.f145496u.f145504a == this.f145496u.f145505b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m228190d(z2);
                    m228173a(f2, this.f145477W, this.f145496u.f145514k);
                    m228188c(z);
                    if (z) {
                        if (this.f145496u.f145516m != null) {
                            try {
                                this.f145496u.f145516m.mo199406a();
                            } catch (Exception e) {
                                Log.w(f145453a, "Error thrown by animation listener", e);
                            }
                        }
                        this.f145496u = null;
                    }
                    invalidate();
                }
                if (this.f145462H == null || !m228192e()) {
                    i = 15;
                    Bitmap bitmap = this.f145457C;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        float f3 = this.f145481f;
                        if (this.f145458D) {
                            f3 *= ((float) this.ad) / ((float) this.f145457C.getWidth());
                            f = this.f145481f * (((float) this.ae) / ((float) this.f145457C.getHeight()));
                        } else {
                            f = f3;
                        }
                        if (this.ax == null) {
                            this.ax = new Matrix();
                        }
                        this.ax.reset();
                        if (!this.f145458D) {
                            if (getRequiredRotation() == 4) {
                                this.ax.postScale(1.0f, -1.0f, ((float) this.f145457C.getWidth()) / 2.0f, ((float) this.f145457C.getHeight()) / 2.0f);
                            } else if (getRequiredRotation() == 2) {
                                this.ax.postScale(-1.0f, 1.0f, ((float) this.f145457C.getWidth()) / 2.0f, ((float) this.f145457C.getHeight()) / 2.0f);
                            }
                        }
                        this.ax.postScale(f3, f);
                        if (getRequiredRotation() == 90 || getRequiredRotation() == 180 || getRequiredRotation() == 270) {
                            this.ax.postRotate((float) getRequiredRotation());
                        }
                        this.ax.postTranslate(this.f145483h.x, this.f145483h.y);
                        if (getRequiredRotation() == 180) {
                            Matrix matrix = this.ax;
                            float f4 = this.f145481f;
                            matrix.postTranslate(((float) this.ad) * f4, f4 * ((float) this.ae));
                        } else if (getRequiredRotation() == 90) {
                            this.ax.postTranslate(this.f145481f * ((float) this.ae), BitmapDescriptorFactory.HUE_RED);
                        } else if (getRequiredRotation() == 270) {
                            this.ax.postTranslate(BitmapDescriptorFactory.HUE_RED, this.f145481f * ((float) this.ad));
                        }
                        if (this.av != null) {
                            if (this.ay == null) {
                                this.ay = new RectF();
                            }
                            RectF rectF = this.ay;
                            if (this.f145458D) {
                                i2 = this.f145457C.getWidth();
                            } else {
                                i2 = this.ad;
                            }
                            float f5 = (float) i2;
                            if (this.f145458D) {
                                i3 = this.f145457C.getHeight();
                            } else {
                                i3 = this.ae;
                            }
                            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, (float) i3);
                            this.ax.mapRect(this.ay);
                            canvas.drawRect(this.ay, this.av);
                        }
                        canvas.drawBitmap(this.f145457C, this.ax, this.as);
                    }
                } else {
                    int min2 = Math.min(this.f145461G, m228187c(this.f145481f));
                    boolean z3 = false;
                    for (Map.Entry<Integer, List<C58841h>> entry : this.f145462H.entrySet()) {
                        if (entry.getKey().intValue() == min2) {
                            for (C58841h hVar2 : entry.getValue()) {
                                if (hVar2.f145540e && (hVar2.f145539d || hVar2.f145538c == null)) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                    for (Map.Entry<Integer, List<C58841h>> entry2 : this.f145462H.entrySet()) {
                        if (entry2.getKey().intValue() == min2 || z3) {
                            for (C58841h hVar3 : entry2.getValue()) {
                                m228184b(hVar3.f145536a, hVar3.f145541f);
                                if (hVar3.f145539d || hVar3.f145538c == null) {
                                    hVar = hVar3;
                                    if (hVar.f145539d && this.f145463I) {
                                        canvas.drawText("LOADING", (float) (hVar.f145541f.left + m228170a(5)), (float) (hVar.f145541f.top + m228170a(35)), this.at);
                                    }
                                } else {
                                    if (this.av != null) {
                                        canvas.drawRect(hVar3.f145541f, this.av);
                                    }
                                    if (this.ax == null) {
                                        this.ax = new Matrix();
                                    }
                                    this.ax.reset();
                                    hVar = hVar3;
                                    m228179a(this.az, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) hVar3.f145538c.getWidth(), BitmapDescriptorFactory.HUE_RED, (float) hVar3.f145538c.getWidth(), (float) hVar3.f145538c.getHeight(), BitmapDescriptorFactory.HUE_RED, (float) hVar3.f145538c.getHeight());
                                    if (getRequiredRotation() == 0) {
                                        m228179a(this.aA, (float) hVar.f145541f.left, (float) hVar.f145541f.top, (float) hVar.f145541f.right, (float) hVar.f145541f.top, (float) hVar.f145541f.right, (float) hVar.f145541f.bottom, (float) hVar.f145541f.left, (float) hVar.f145541f.bottom);
                                    } else if (getRequiredRotation() == 90) {
                                        m228179a(this.aA, (float) hVar.f145541f.right, (float) hVar.f145541f.top, (float) hVar.f145541f.right, (float) hVar.f145541f.bottom, (float) hVar.f145541f.left, (float) hVar.f145541f.bottom, (float) hVar.f145541f.left, (float) hVar.f145541f.top);
                                    } else if (getRequiredRotation() == 180) {
                                        m228179a(this.aA, (float) hVar.f145541f.right, (float) hVar.f145541f.bottom, (float) hVar.f145541f.left, (float) hVar.f145541f.bottom, (float) hVar.f145541f.left, (float) hVar.f145541f.top, (float) hVar.f145541f.right, (float) hVar.f145541f.top);
                                    } else if (getRequiredRotation() == 270) {
                                        m228179a(this.aA, (float) hVar.f145541f.left, (float) hVar.f145541f.bottom, (float) hVar.f145541f.left, (float) hVar.f145541f.top, (float) hVar.f145541f.right, (float) hVar.f145541f.top, (float) hVar.f145541f.right, (float) hVar.f145541f.bottom);
                                    }
                                    this.ax.setPolyToPoly(this.az, 0, this.aA, 0, 4);
                                    canvas.drawBitmap(hVar.f145538c, this.ax, this.as);
                                    if (this.f145463I) {
                                        canvas.drawRect(hVar.f145541f, this.au);
                                    }
                                }
                                if (hVar.f145540e && this.f145463I) {
                                    canvas.drawText("ISS " + hVar.f145537b + " RECT " + hVar.f145536a.top + "," + hVar.f145536a.left + "," + hVar.f145536a.bottom + "," + hVar.f145536a.right, (float) (hVar.f145541f.left + m228170a(5)), (float) (hVar.f145541f.top + m228170a(15)), this.at);
                                }
                            }
                        }
                    }
                    i = 15;
                }
                if (this.f145463I) {
                    canvas.drawText("Scale: " + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.f145481f)) + " (" + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(m228201l())) + " - " + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.f145465K)) + ")", (float) m228170a(5), (float) m228170a(i), this.at);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Translate: ");
                    sb.append(String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.f145483h.x)));
                    sb.append(":");
                    sb.append(String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.f145483h.y)));
                    canvas.drawText(sb.toString(), (float) m228170a(5), (float) m228170a(30), this.at);
                    PointF center = getCenter();
                    canvas.drawText("Source center: " + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(center.x)) + ":" + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(center.y)), (float) m228170a(5), (float) m228170a(45), this.at);
                    C58834a aVar2 = this.f145496u;
                    if (aVar2 != null) {
                        PointF b = mo199344b(aVar2.f145506c);
                        PointF b2 = mo199344b(this.f145496u.f145508e);
                        PointF b3 = mo199344b(this.f145496u.f145507d);
                        canvas.drawCircle(b.x, b.y, (float) m228170a(10), this.au);
                        this.au.setColor(-65536);
                        canvas.drawCircle(b2.x, b2.y, (float) m228170a(20), this.au);
                        this.au.setColor(-16776961);
                        canvas.drawCircle(b3.x, b3.y, (float) m228170a(25), this.au);
                        this.au.setColor(-16711681);
                        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) m228170a(30), this.au);
                    }
                    if (this.f145490o != null) {
                        this.au.setColor(-65536);
                        canvas.drawCircle(this.f145490o.x, this.f145490o.y, (float) m228170a(20), this.au);
                    }
                    if (this.f145494s != null) {
                        this.au.setColor(-16776961);
                        canvas.drawCircle(m228193f(this.f145494s.x), m228195g(this.f145494s.y), (float) m228170a(35), this.au);
                    }
                    if (this.f145495t != null && this.f145487l) {
                        this.au.setColor(-16711681);
                        canvas.drawCircle(this.f145495t.x, this.f145495t.y, (float) m228170a(30), this.au);
                    }
                    this.au.setColor(-65281);
                }
            }
        }
    }

    /* renamed from: a */
    private void m228176a(ImageViewState imageViewState) {
        if (imageViewState != null && f145455y.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            this.f145464J = imageViewState.getOrientation();
            this.aa = Float.valueOf(imageViewState.getScale());
            this.ab = imageViewState.getCenter();
            invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView$g */
    public static class C58840g {

        /* renamed from: a */
        public float f145534a;

        /* renamed from: b */
        public final PointF f145535b;

        private C58840g(float f, PointF pointF) {
            this.f145534a = f;
            this.f145535b = pointF;
        }
    }

    /* renamed from: b */
    private void m228184b(Rect rect, Rect rect2) {
        rect2.set((int) m228193f((float) rect.left), (int) m228195g((float) rect.top), (int) m228193f((float) rect.right), (int) m228195g((float) rect.bottom));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z2 = true;
        if (mode != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (mode2 == 1073741824) {
            z2 = false;
        }
        if (this.ad > 0 && this.ae > 0) {
            if (z && z2) {
                size = m228199j();
                size2 = m228200k();
            } else if (z2) {
                size2 = (int) ((((double) m228200k()) / ((double) m228199j())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) m228199j()) / ((double) m228200k())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        this.f145465K = 2.0f;
        this.f145466L = m228201l();
        this.f145467M = -1;
        this.f145468N = 1;
        this.f145469O = 1;
        this.f145470P = Integer.MAX_VALUE;
        this.f145471Q = Integer.MAX_VALUE;
        this.f145472R = AsyncTask.THREAD_POOL_EXECUTOR;
        this.f145473S = true;
        this.f145478c = true;
        this.f145479d = true;
        this.f145480e = true;
        this.f145474T = 1.0f;
        this.f145475U = 1;
        this.f145476V = ParticipantRepo.f117150c;
        this.f145489n = new ReentrantReadWriteLock(true);
        this.al = new C58848a(SkiaImageDecoder.class);
        this.am = new C58848a(SkiaImageRegionDecoder.class);
        this.az = new float[8];
        this.aA = new float[8];
        this.aB = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.ar = new Handler(new Handler.Callback() {
            /* class com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView.C588311 */

            public boolean handleMessage(Message message) {
                if (message.what == 1 && SubsamplingScaleImageView.this.f145499x != null) {
                    SubsamplingScaleImageView.this.f145488m = 0;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.f145499x);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.assetName, R.attr.panEnabled, R.attr.quickScaleEnabled, R.attr.src, R.attr.tileBackgroundColor, R.attr.zoomEnabled});
            if (obtainStyledAttributes.hasValue(0) && (string = obtainStyledAttributes.getString(0)) != null && string.length() > 0) {
                setImage(C58844a.m228251a(string).mo199425a());
            }
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
                setImage(C58844a.m228248a(resourceId).mo199425a());
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(1, true));
            }
            if (obtainStyledAttributes.hasValue(5)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(5, true));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(2, true));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(4, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.ao = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public final PointF mo199343b(float f, float f2, PointF pointF) {
        if (this.f145483h == null) {
            return null;
        }
        pointF.set(m228193f(f), m228195g(f2));
        return pointF;
    }

    /* renamed from: a */
    private PointF m228172a(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.aw == null) {
            this.aw = new C58840g(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        }
        this.aw.f145534a = f3;
        this.aw.f145535b.set(((float) paddingLeft) - (f * f3), ((float) paddingTop) - (f2 * f3));
        mo199342a(true, this.aw);
        return this.aw.f145535b;
    }

    /* renamed from: a */
    private void m228173a(float f, PointF pointF, int i) {
        AbstractC58839f fVar = this.aq;
        if (fVar != null) {
            float f2 = this.f145481f;
            if (f2 != f) {
                fVar.mo199415a(f2, i);
            }
        }
        if (this.aq != null && !this.f145483h.equals(pointF)) {
            this.aq.mo199416a(getCenter(), i);
        }
    }

    /* renamed from: a */
    private float m228167a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo199341a("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (this.f145497v && center != null) {
            this.f145496u = null;
            this.aa = Float.valueOf(this.f145481f);
            this.ab = center;
        }
    }

    /* renamed from: a */
    private float m228168a(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return m228169a(j, f, f2, j2);
        }
        if (i == 2) {
            return m228182b(j, f, f2, j2);
        }
        throw new IllegalStateException("Unexpected easing type: " + i);
    }
}
