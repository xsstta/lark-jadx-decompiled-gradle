package com.bytedance.ee.bear.screenshot;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
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
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.ee.log.C13479a;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
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
    private static final List<Integer> f28751A = Arrays.asList(2, 1, 3, 4);

    /* renamed from: a */
    public static final List<Integer> f28752a = Arrays.asList(2, 1);
    private static Bitmap.Config aB;

    /* renamed from: x */
    private static final List<Integer> f28753x = Arrays.asList(0, 90, 180, 270, -1);

    /* renamed from: y */
    private static final List<Integer> f28754y = Arrays.asList(1, 2, 3);

    /* renamed from: z */
    private static final List<Integer> f28755z = Arrays.asList(1, 2, 3);

    /* renamed from: B */
    private Bitmap f28756B;

    /* renamed from: C */
    private boolean f28757C;

    /* renamed from: D */
    private boolean f28758D;

    /* renamed from: E */
    private Uri f28759E;

    /* renamed from: F */
    private int f28760F;

    /* renamed from: G */
    private Map<Integer, List<C10776h>> f28761G;

    /* renamed from: H */
    private boolean f28762H;

    /* renamed from: I */
    private int f28763I;

    /* renamed from: J */
    private float f28764J;

    /* renamed from: K */
    private float f28765K;

    /* renamed from: L */
    private int f28766L;

    /* renamed from: M */
    private int f28767M;

    /* renamed from: N */
    private int f28768N;

    /* renamed from: O */
    private int f28769O;

    /* renamed from: P */
    private int f28770P;

    /* renamed from: Q */
    private Executor f28771Q;

    /* renamed from: R */
    private boolean f28772R;

    /* renamed from: S */
    private float f28773S;

    /* renamed from: T */
    private int f28774T;

    /* renamed from: U */
    private int f28775U;

    /* renamed from: V */
    private PointF f28776V;

    /* renamed from: W */
    private Float f28777W;
    private final float aA;
    private PointF aa;
    private PointF ab;
    private int ac;
    private int ad;
    private int ae;
    private Rect af;
    private boolean ag;
    private GestureDetector ah;

    /* renamed from: ai  reason: collision with root package name */
    private GestureDetector f175422ai;
    private ImageRegionDecoder aj;
    private DecoderFactory<? extends ImageDecoder> ak;
    private DecoderFactory<? extends ImageRegionDecoder> al;
    private float am;
    private final float an;
    private boolean ao;
    private AbstractC10774f ap;
    private final Handler aq;
    private Paint ar;
    private Paint as;
    private Paint at;
    private Paint au;
    private C10775g av;
    private Matrix aw;
    private RectF ax;
    private final float[] ay;
    private final float[] az;

    /* renamed from: b */
    public boolean f28778b;

    /* renamed from: c */
    public boolean f28779c;

    /* renamed from: d */
    public boolean f28780d;

    /* renamed from: e */
    public float f28781e;

    /* renamed from: f */
    public float f28782f;

    /* renamed from: g */
    public PointF f28783g;

    /* renamed from: h */
    public PointF f28784h;

    /* renamed from: i */
    public Rect f28785i;

    /* renamed from: j */
    public boolean f28786j;

    /* renamed from: k */
    public boolean f28787k;

    /* renamed from: l */
    public int f28788l;

    /* renamed from: m */
    public final ReadWriteLock f28789m;

    /* renamed from: n */
    public PointF f28790n;

    /* renamed from: o */
    public float f28791o;

    /* renamed from: p */
    public boolean f28792p;

    /* renamed from: q */
    public PointF f28793q;

    /* renamed from: r */
    public PointF f28794r;

    /* renamed from: s */
    public PointF f28795s;

    /* renamed from: t */
    public C10769a f28796t;

    /* renamed from: u */
    public boolean f28797u;

    /* renamed from: v */
    public AbstractC10773e f28798v;

    /* renamed from: w */
    public View.OnLongClickListener f28799w;

    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$d */
    public interface AbstractC10772d {
        /* renamed from: a */
        void mo40756a();

        /* renamed from: b */
        void mo40757b();

        /* renamed from: c */
        void mo40758c();
    }

    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$e */
    public interface AbstractC10773e {
        /* renamed from: a */
        void mo40759a();

        /* renamed from: a */
        void mo40760a(Exception exc);

        /* renamed from: b */
        void mo40761b();

        /* renamed from: b */
        void mo40762b(Exception exc);

        /* renamed from: c */
        void mo40763c();

        /* renamed from: c */
        void mo40764c(Exception exc);
    }

    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$f */
    public interface AbstractC10774f {
        /* renamed from: a */
        void mo40765a(float f, int i);

        /* renamed from: a */
        void mo40766a(PointF pointF, int i);
    }

    /* renamed from: a */
    private float m44582a(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    /* renamed from: b */
    private float m44595b(long j, float f, float f2, long j2) {
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
    public void mo40697c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo40698d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$h */
    public static class C10776h {

        /* renamed from: a */
        public Rect f28836a;

        /* renamed from: b */
        public int f28837b;

        /* renamed from: c */
        public Bitmap f28838c;

        /* renamed from: d */
        public boolean f28839d;

        /* renamed from: e */
        public boolean f28840e;

        /* renamed from: f */
        public Rect f28841f;

        /* renamed from: g */
        public Rect f28842g;

        private C10776h() {
        }
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return aB;
    }

    public float getMaxScale() {
        return this.f28764J;
    }

    public final int getOrientation() {
        return this.f28763I;
    }

    public final int getSHeight() {
        return this.ad;
    }

    public final int getSWidth() {
        return this.ac;
    }

    public final float getScale() {
        return this.f28781e;
    }

    /* renamed from: a */
    public final void mo40690a(C10780b bVar, ImageViewState imageViewState) {
        mo40689a(bVar, (C10780b) null, imageViewState);
    }

    /* renamed from: a */
    public final void mo40689a(C10780b bVar, C10780b bVar2, ImageViewState imageViewState) {
        Objects.requireNonNull(bVar, "imageSource must not be null");
        m44591a(true);
        if (imageViewState != null) {
            m44590a(imageViewState);
        }
        if (bVar2 != null) {
            if (bVar.mo40778c() != null) {
                throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            } else if (bVar.mo40781f() <= 0 || bVar.mo40782g() <= 0) {
                throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            } else {
                this.ac = bVar.mo40781f();
                this.ad = bVar.mo40782g();
                this.af = bVar2.mo40783h();
                if (bVar2.mo40778c() != null) {
                    this.f28758D = bVar2.mo40784i();
                    mo40685a(bVar2.mo40778c());
                } else {
                    Uri b = bVar2.mo40777b();
                    if (b == null && bVar2.mo40779d() != null) {
                        b = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + bVar2.mo40779d());
                    }
                    m44588a(new AsyncTaskC10771c(this, getContext(), this.ak, b, true));
                }
            }
        }
        if (bVar.mo40778c() != null && bVar.mo40783h() != null) {
            mo40686a(Bitmap.createBitmap(bVar.mo40778c(), bVar.mo40783h().left, bVar.mo40783h().top, bVar.mo40783h().width(), bVar.mo40783h().height()), 0, false);
        } else if (bVar.mo40778c() != null) {
            mo40686a(bVar.mo40778c(), 0, bVar.mo40784i());
        } else {
            this.f28785i = bVar.mo40783h();
            Uri b2 = bVar.mo40777b();
            this.f28759E = b2;
            if (b2 == null && bVar.mo40779d() != null) {
                this.f28759E = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + bVar.mo40779d());
            }
            if (bVar.mo40780e() || this.f28785i != null) {
                m44588a(new AsyncTaskC10778j(this, getContext(), this.al, this.f28759E));
            } else {
                m44588a(new AsyncTaskC10771c(this, getContext(), this.ak, this.f28759E, false));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m44591a(boolean z) {
        AbstractC10773e eVar;
        mo40692a("reset newImage=" + z, new Object[0]);
        this.f28781e = BitmapDescriptorFactory.HUE_RED;
        this.f28782f = BitmapDescriptorFactory.HUE_RED;
        this.f28783g = null;
        this.f28784h = null;
        this.f28776V = null;
        this.f28777W = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        this.aa = null;
        this.ab = null;
        this.f28786j = false;
        this.ag = false;
        this.f28787k = false;
        this.f28788l = 0;
        this.f28760F = 0;
        this.f28790n = null;
        this.am = BitmapDescriptorFactory.HUE_RED;
        this.f28791o = BitmapDescriptorFactory.HUE_RED;
        this.f28792p = false;
        this.f28794r = null;
        this.f28793q = null;
        this.f28795s = null;
        this.f28796t = null;
        this.av = null;
        this.aw = null;
        this.ax = null;
        if (z) {
            this.f28759E = null;
            this.f28789m.writeLock().lock();
            try {
                ImageRegionDecoder imageRegionDecoder = this.aj;
                if (imageRegionDecoder != null) {
                    imageRegionDecoder.recycle();
                    this.aj = null;
                }
                this.f28789m.writeLock().unlock();
                Bitmap bitmap = this.f28756B;
                if (bitmap != null && !this.f28758D) {
                    bitmap.recycle();
                }
                if (!(this.f28756B == null || !this.f28758D || (eVar = this.f28798v) == null)) {
                    eVar.mo40763c();
                }
                this.ac = 0;
                this.ad = 0;
                this.ae = 0;
                this.f28785i = null;
                this.af = null;
                this.f28797u = false;
                this.ao = false;
                this.f28756B = null;
                this.f28757C = false;
                this.f28758D = false;
            } catch (Throwable th) {
                this.f28789m.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<C10776h>> map = this.f28761G;
        if (map != null) {
            for (Map.Entry<Integer, List<C10776h>> entry : map.entrySet()) {
                for (C10776h hVar : entry.getValue()) {
                    hVar.f28840e = false;
                    if (hVar.f28838c != null) {
                        hVar.f28838c.recycle();
                        hVar.f28838c = null;
                    }
                }
            }
            this.f28761G = null;
        }
        setGestureDetector(getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 != 262) goto L_0x03e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m44593a(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 1238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView.m44593a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public void mo40687a(PointF pointF, PointF pointF2) {
        if (!this.f28778b) {
            PointF pointF3 = this.ab;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = this.ab.y;
            } else {
                pointF.x = (float) (m44612j() / 2);
                pointF.y = (float) (m44613k() / 2);
            }
        }
        float min = Math.min(this.f28764J, this.f28773S);
        float f = this.f28781e;
        boolean z = ((double) f) <= ((double) min) * 0.9d || f == this.f28765K;
        if (!z) {
            min = m44614l();
        }
        int i = this.f28774T;
        if (i == 3) {
            mo40684a(min, pointF);
        } else if (i == 2 || !z || !this.f28778b) {
            new C10770b(min, pointF).mo40748a(false).mo40747a((long) this.f28775U).mo40750b(4).mo40749a();
        } else if (i == 1) {
            new C10770b(min, pointF, pointF2).mo40748a(false).mo40747a((long) this.f28775U).mo40750b(4).mo40749a();
        }
        invalidate();
    }

    /* renamed from: a */
    private void m44592a(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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
    private boolean m44594a(C10776h hVar) {
        return m44601c(BitmapDescriptorFactory.HUE_RED) <= ((float) hVar.f28836a.right) && ((float) hVar.f28836a.left) <= m44601c((float) getWidth()) && m44603d(BitmapDescriptorFactory.HUE_RED) <= ((float) hVar.f28836a.bottom) && ((float) hVar.f28836a.top) <= m44603d((float) getHeight());
    }

    /* renamed from: a */
    public void mo40693a(boolean z, C10775g gVar) {
        float f;
        float f2;
        int i;
        if (this.f28767M == 2 && mo40696b()) {
            z = false;
        }
        PointF pointF = gVar.f28835b;
        float a = mo40677a(gVar.f28834a);
        float j = ((float) m44612j()) * a;
        float k = ((float) m44613k()) * a;
        if (this.f28767M == 3 && mo40696b()) {
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
        if (this.f28767M == 3 && mo40696b()) {
            f = (float) Math.max(0, getWidth() / 2);
            i = Math.max(0, getHeight() / 2);
        } else if (z) {
            f = Math.max((float) BitmapDescriptorFactory.HUE_RED, (((float) getWidth()) - j) * paddingLeft);
            f2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, (((float) getHeight()) - k) * f3);
            pointF.x = Math.min(pointF.x, f);
            pointF.y = Math.min(pointF.y, f2);
            gVar.f28834a = a;
        } else {
            f = (float) Math.max(0, getWidth());
            i = Math.max(0, getHeight());
        }
        f2 = (float) i;
        pointF.x = Math.min(pointF.x, f);
        pointF.y = Math.min(pointF.y, f2);
        gVar.f28834a = a;
    }

    /* renamed from: a */
    public synchronized void mo40691a(ImageRegionDecoder imageRegionDecoder, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        mo40692a("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f28763I));
        int i7 = this.ac;
        if (i7 > 0 && (i6 = this.ad) > 0 && !(i7 == i && i6 == i2)) {
            m44591a(false);
            Bitmap bitmap = this.f28756B;
            if (bitmap != null) {
                if (!this.f28758D) {
                    bitmap.recycle();
                }
                this.f28756B = null;
                AbstractC10773e eVar = this.f28798v;
                if (eVar != null && this.f28758D) {
                    eVar.mo40763c();
                }
                this.f28757C = false;
                this.f28758D = false;
            }
        }
        this.aj = imageRegionDecoder;
        this.ac = i;
        this.ad = i2;
        this.ae = i3;
        m44608f();
        if (!m44609g() && (i4 = this.f28769O) > 0 && i4 != Integer.MAX_VALUE && (i5 = this.f28770P) > 0 && i5 != Integer.MAX_VALUE && getWidth() > 0 && getHeight() > 0) {
            m44587a(new Point(this.f28769O, this.f28770P));
        }
        invalidate();
        requestLayout();
    }

    /* renamed from: a */
    public synchronized void mo40683a() {
        Bitmap bitmap;
        mo40692a("onTileLoaded", new Object[0]);
        m44608f();
        m44609g();
        if (m44606e() && (bitmap = this.f28756B) != null) {
            if (!this.f28758D) {
                bitmap.recycle();
            }
            this.f28756B = null;
            AbstractC10773e eVar = this.f28798v;
            if (eVar != null && this.f28758D) {
                eVar.mo40763c();
            }
            this.f28757C = false;
            this.f28758D = false;
        }
        invalidate();
    }

    /* renamed from: a */
    public synchronized void mo40685a(Bitmap bitmap) {
        mo40692a("onPreviewLoaded", new Object[0]);
        if (this.f28756B == null) {
            if (!this.ao) {
                Rect rect = this.af;
                if (rect != null) {
                    this.f28756B = Bitmap.createBitmap(bitmap, rect.left, this.af.top, this.af.width(), this.af.height());
                } else {
                    this.f28756B = bitmap;
                }
                this.f28757C = true;
                if (m44608f()) {
                    invalidate();
                    requestLayout();
                }
                return;
            }
        }
        bitmap.recycle();
    }

    /* renamed from: a */
    public synchronized void mo40686a(Bitmap bitmap, int i, boolean z) {
        AbstractC10773e eVar;
        mo40692a("onImageLoaded", new Object[0]);
        int i2 = this.ac;
        if (i2 > 0 && this.ad > 0 && !(i2 == bitmap.getWidth() && this.ad == bitmap.getHeight())) {
            m44591a(false);
        }
        Bitmap bitmap2 = this.f28756B;
        if (bitmap2 != null && !this.f28758D) {
            bitmap2.recycle();
        }
        if (!(this.f28756B == null || !this.f28758D || (eVar = this.f28798v) == null)) {
            eVar.mo40763c();
        }
        this.f28757C = false;
        this.f28758D = z;
        this.f28756B = bitmap;
        this.ac = bitmap.getWidth();
        this.ad = bitmap.getHeight();
        this.ae = i;
        boolean f = m44608f();
        boolean g = m44609g();
        if (f || g) {
            invalidate();
            requestLayout();
        }
    }

    /* renamed from: a */
    public int mo40678a(Context context, String str) {
        int i = 0;
        if (str.startsWith("content")) {
            Cursor cursor = null;
            try {
                cursor = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
                if (cursor != null && cursor.moveToFirst()) {
                    int i2 = cursor.getInt(0);
                    if (!f28753x.contains(Integer.valueOf(i2)) || i2 == -1) {
                        C13479a.m54775e("SubsamplingScaleImageView", "Unsupported orientation: " + i2);
                    } else {
                        i = i2;
                    }
                }
                if (cursor == null) {
                    return i;
                }
            } catch (Exception unused) {
                C13479a.m54775e("SubsamplingScaleImageView", "Could not get orientation of image from media store");
                if (0 == 0) {
                    return 0;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
            cursor.close();
            return i;
        } else if (!str.startsWith("file:///") || str.startsWith("file:///android_asset/")) {
            return 0;
        } else {
            try {
                int a = new ExifInterface(str.substring(7)).mo4995a("Orientation", 1);
                if (a == 1) {
                    return 0;
                }
                if (a == 0) {
                    return 0;
                }
                if (a == 6) {
                    return 90;
                }
                if (a == 3) {
                    return 180;
                }
                if (a == 8) {
                    return 270;
                }
                C13479a.m54775e("SubsamplingScaleImageView", "Unsupported EXIF orientation: " + a);
                return 0;
            } catch (Exception unused2) {
                C13479a.m54775e("SubsamplingScaleImageView", "Could not get EXIF orientation of image");
                return 0;
            }
        }
    }

    /* renamed from: a */
    public void mo40688a(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
        } else if (getRequiredRotation() == 90) {
            rect2.set(rect.top, this.ad - rect.right, rect.bottom, this.ad - rect.left);
        } else if (getRequiredRotation() == 180) {
            rect2.set(this.ac - rect.right, this.ad - rect.bottom, this.ac - rect.left, this.ad - rect.top);
        } else {
            rect2.set(this.ac - rect.bottom, rect.left, this.ac - rect.top, rect.right);
        }
    }

    /* renamed from: a */
    public final PointF mo40682a(PointF pointF) {
        return mo40681a(pointF.x, pointF.y, new PointF());
    }

    /* renamed from: a */
    public final PointF mo40679a(float f, float f2) {
        return mo40681a(f, f2, new PointF());
    }

    /* renamed from: a */
    public final PointF mo40681a(float f, float f2, PointF pointF) {
        if (this.f28783g == null) {
            return null;
        }
        pointF.set(m44601c(f), m44603d(f2));
        return pointF;
    }

    /* renamed from: a */
    public PointF mo40680a(float f, float f2, float f3, PointF pointF) {
        PointF a = m44585a(f, f2, f3);
        pointF.set((((float) (getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2))) - a.x) / f3, (((float) (getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2))) - a.y) / f3);
        return pointF;
    }

    /* renamed from: a */
    public float mo40677a(float f) {
        return Math.min(this.f28764J, Math.max(this.f28765K, f));
    }

    /* renamed from: a */
    public void mo40692a(String str, Object... objArr) {
        if (this.f28762H) {
            C13479a.m54772d("SubsamplingScaleImageView", String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public final void mo40684a(float f, PointF pointF) {
        this.f28796t = null;
        this.f28777W = Float.valueOf(f);
        this.aa = pointF;
        this.ab = pointF;
        invalidate();
    }

    private int getRequiredRotation() {
        int i = this.f28763I;
        if (i == -1) {
            return this.ae;
        }
        return i;
    }

    /* renamed from: b */
    public final boolean mo40696b() {
        return this.f28797u;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final float getMinScale() {
        return m44614l();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$a */
    public static class C10769a {

        /* renamed from: a */
        public float f28804a;

        /* renamed from: b */
        public float f28805b;

        /* renamed from: c */
        public PointF f28806c;

        /* renamed from: d */
        public PointF f28807d;

        /* renamed from: e */
        public PointF f28808e;

        /* renamed from: f */
        public PointF f28809f;

        /* renamed from: g */
        public PointF f28810g;

        /* renamed from: h */
        public long f28811h;

        /* renamed from: i */
        public boolean f28812i;

        /* renamed from: j */
        public int f28813j;

        /* renamed from: k */
        public int f28814k;

        /* renamed from: l */
        public long f28815l;

        /* renamed from: m */
        public AbstractC10772d f28816m;

        private C10769a() {
            this.f28811h = 500;
            this.f28812i = true;
            this.f28813j = 2;
            this.f28814k = 1;
            this.f28815l = System.currentTimeMillis();
        }
    }

    /* renamed from: g */
    private boolean m44609g() {
        boolean e = m44606e();
        if (!this.ao && e) {
            m44611i();
            this.ao = true;
            mo40698d();
            AbstractC10773e eVar = this.f28798v;
            if (eVar != null) {
                eVar.mo40761b();
            }
        }
        return e;
    }

    /* renamed from: j */
    private int m44612j() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.ad;
        }
        return this.ac;
    }

    /* renamed from: k */
    private int m44613k() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.ac;
        }
        return this.ad;
    }

    public final PointF getCenter() {
        return mo40679a((float) (getWidth() / 2), (float) (getHeight() / 2));
    }

    public final ImageViewState getState() {
        if (this.f28783g == null || this.ac <= 0 || this.ad <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    /* renamed from: f */
    private boolean m44608f() {
        boolean z;
        if (getWidth() <= 0 || getHeight() <= 0 || this.ac <= 0 || this.ad <= 0 || (this.f28756B == null && !m44606e())) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f28797u && z) {
            m44611i();
            this.f28797u = true;
            mo40697c();
            AbstractC10773e eVar = this.f28798v;
            if (eVar != null) {
                eVar.mo40759a();
            }
        }
        return z;
    }

    /* renamed from: e */
    private boolean m44606e() {
        boolean z = true;
        if (!(this.f28756B == null || this.f28757C)) {
            return true;
        }
        Map<Integer, List<C10776h>> map = this.f28761G;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, List<C10776h>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.f28760F) {
                for (C10776h hVar : entry.getValue()) {
                    if (hVar.f28839d || hVar.f28838c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: h */
    private void m44610h() {
        if (this.ar == null) {
            Paint paint = new Paint();
            this.ar = paint;
            paint.setAntiAlias(true);
            this.ar.setFilterBitmap(true);
            this.ar.setDither(true);
        }
        if ((this.as == null || this.at == null) && this.f28762H) {
            Paint paint2 = new Paint();
            this.as = paint2;
            paint2.setTextSize((float) m44583a(12));
            this.as.setColor(-65281);
            this.as.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.at = paint3;
            paint3.setColor(-65281);
            this.at.setStyle(Paint.Style.STROKE);
            this.at.setStrokeWidth((float) m44583a(1));
        }
    }

    /* renamed from: i */
    private void m44611i() {
        Float f;
        if (getWidth() != 0 && getHeight() != 0 && this.ac > 0 && this.ad > 0) {
            if (!(this.aa == null || (f = this.f28777W) == null)) {
                this.f28781e = f.floatValue();
                if (this.f28783g == null) {
                    this.f28783g = new PointF();
                }
                this.f28783g.x = ((float) (getWidth() / 2)) - (this.f28781e * this.aa.x);
                this.f28783g.y = ((float) (getHeight() / 2)) - (this.f28781e * this.aa.y);
                this.aa = null;
                this.f28777W = null;
                m44604d(true);
                m44602c(true);
            }
            m44604d(false);
        }
    }

    /* renamed from: l */
    private float m44614l() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.f28768N;
        if (i == 2 || i == 4) {
            return Math.max(((float) (getWidth() - paddingLeft)) / ((float) m44612j()), ((float) (getHeight() - paddingBottom)) / ((float) m44613k()));
        }
        if (i == 3) {
            float f = this.f28765K;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                return f;
            }
        }
        return Math.min(((float) (getWidth() - paddingLeft)) / ((float) m44612j()), ((float) (getHeight() - paddingBottom)) / ((float) m44613k()));
    }

    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$b */
    public final class C10770b {

        /* renamed from: b */
        private final float f28818b;

        /* renamed from: c */
        private final PointF f28819c;

        /* renamed from: d */
        private final PointF f28820d;

        /* renamed from: e */
        private long f28821e;

        /* renamed from: f */
        private int f28822f;

        /* renamed from: g */
        private int f28823g;

        /* renamed from: h */
        private boolean f28824h;

        /* renamed from: i */
        private boolean f28825i;

        /* renamed from: j */
        private AbstractC10772d f28826j;

        /* renamed from: a */
        public void mo40749a() {
            PointF pointF;
            if (!(SubsamplingScaleImageView.this.f28796t == null || SubsamplingScaleImageView.this.f28796t.f28816m == null)) {
                try {
                    SubsamplingScaleImageView.this.f28796t.f28816m.mo40758c();
                } catch (Exception e) {
                    C13479a.m54773d("SubsamplingScaleImageView", "Error thrown by animation listener", e);
                }
            }
            int paddingLeft = SubsamplingScaleImageView.this.getPaddingLeft() + (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = SubsamplingScaleImageView.this.getPaddingTop() + (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float a = SubsamplingScaleImageView.this.mo40677a(this.f28818b);
            if (this.f28825i) {
                pointF = SubsamplingScaleImageView.this.mo40680a(this.f28819c.x, this.f28819c.y, a, new PointF());
            } else {
                pointF = this.f28819c;
            }
            SubsamplingScaleImageView.this.f28796t = new C10769a();
            SubsamplingScaleImageView.this.f28796t.f28804a = SubsamplingScaleImageView.this.f28781e;
            SubsamplingScaleImageView.this.f28796t.f28805b = a;
            SubsamplingScaleImageView.this.f28796t.f28815l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f28796t.f28808e = pointF;
            SubsamplingScaleImageView.this.f28796t.f28806c = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.f28796t.f28807d = pointF;
            SubsamplingScaleImageView.this.f28796t.f28809f = SubsamplingScaleImageView.this.mo40695b(pointF);
            SubsamplingScaleImageView.this.f28796t.f28810g = new PointF((float) paddingLeft, (float) paddingTop);
            SubsamplingScaleImageView.this.f28796t.f28811h = this.f28821e;
            SubsamplingScaleImageView.this.f28796t.f28812i = this.f28824h;
            SubsamplingScaleImageView.this.f28796t.f28813j = this.f28822f;
            SubsamplingScaleImageView.this.f28796t.f28814k = this.f28823g;
            SubsamplingScaleImageView.this.f28796t.f28815l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f28796t.f28816m = this.f28826j;
            PointF pointF2 = this.f28820d;
            if (pointF2 != null) {
                float f = pointF2.x - (SubsamplingScaleImageView.this.f28796t.f28806c.x * a);
                float f2 = this.f28820d.y - (SubsamplingScaleImageView.this.f28796t.f28806c.y * a);
                C10775g gVar = new C10775g(a, new PointF(f, f2));
                SubsamplingScaleImageView.this.mo40693a(true, gVar);
                SubsamplingScaleImageView.this.f28796t.f28810g = new PointF(this.f28820d.x + (gVar.f28835b.x - f), this.f28820d.y + (gVar.f28835b.y - f2));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        /* renamed from: a */
        public C10770b mo40747a(long j) {
            this.f28821e = j;
            return this;
        }

        /* renamed from: b */
        public C10770b mo40750b(int i) {
            this.f28823g = i;
            return this;
        }

        /* renamed from: a */
        public C10770b mo40748a(boolean z) {
            this.f28824h = z;
            return this;
        }

        /* renamed from: b */
        public C10770b mo40751b(boolean z) {
            this.f28825i = z;
            return this;
        }

        /* renamed from: a */
        public C10770b mo40746a(int i) {
            if (SubsamplingScaleImageView.f28752a.contains(Integer.valueOf(i))) {
                this.f28822f = i;
                return this;
            }
            throw new IllegalArgumentException("Unknown easing type: " + i);
        }

        private C10770b(PointF pointF) {
            this.f28821e = 500;
            this.f28822f = 2;
            this.f28823g = 1;
            this.f28824h = true;
            this.f28825i = true;
            this.f28818b = SubsamplingScaleImageView.this.f28781e;
            this.f28819c = pointF;
        }

        private C10770b(float f, PointF pointF) {
            this.f28821e = 500;
            this.f28822f = 2;
            this.f28823g = 1;
            this.f28824h = true;
            this.f28825i = true;
            this.f28818b = f;
            this.f28819c = pointF;
        }

        private C10770b(float f, PointF pointF, PointF pointF2) {
            this.f28821e = 500;
            this.f28822f = 2;
            this.f28823g = 1;
            this.f28824h = true;
            this.f28825i = true;
            this.f28818b = f;
            this.f28819c = pointF;
            this.f28820d = pointF2;
        }
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        aB = config;
    }

    public final void setDebug(boolean z) {
        this.f28762H = z;
    }

    public final void setDoubleTapZoomScale(float f) {
        this.f28773S = f;
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.f28772R = z;
    }

    public final void setMaxScale(float f) {
        this.f28764J = f;
    }

    public final void setMinScale(float f) {
        this.f28765K = f;
    }

    public void setOnImageEventListener(AbstractC10773e eVar) {
        this.f28798v = eVar;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f28799w = onLongClickListener;
    }

    public void setOnStateChangedListener(AbstractC10774f fVar) {
        this.ap = fVar;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.f28780d = z;
    }

    public final void setZoomEnabled(boolean z) {
        this.f28779c = z;
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m44583a(int i) {
        return (int) (this.aA * ((float) i));
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.f28775U = Math.max(0, i);
    }

    public void setExecutor(Executor executor) {
        Objects.requireNonNull(executor, "Executor must not be null");
        this.f28771Q = executor;
    }

    public final void setImage(C10780b bVar) {
        mo40689a(bVar, (C10780b) null, (ImageViewState) null);
    }

    public void setMaxTileSize(int i) {
        this.f28769O = i;
        this.f28770P = i;
    }

    /* renamed from: b */
    private void m44600b(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private float m44601c(float f) {
        PointF pointF = this.f28783g;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.f28781e;
    }

    /* renamed from: d */
    private float m44603d(float f) {
        PointF pointF = this.f28783g;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.f28781e;
    }

    /* renamed from: e */
    private float m44605e(float f) {
        PointF pointF = this.f28783g;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f28781e) + pointF.x;
    }

    /* renamed from: f */
    private float m44607f(float f) {
        PointF pointF = this.f28783g;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f28781e) + pointF.y;
    }

    public final void setBitmapDecoderFactory(DecoderFactory<? extends ImageDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.ak = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setRegionDecoderFactory(DecoderFactory<? extends ImageRegionDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.al = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setBitmapDecoderClass(Class<? extends ImageDecoder> cls) {
        if (cls != null) {
            this.ak = new CompatDecoderFactory(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public void setGestureDetector(final Context context) {
        this.ah = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView.C107672 */

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (!SubsamplingScaleImageView.this.f28779c || !SubsamplingScaleImageView.this.f28797u || SubsamplingScaleImageView.this.f28783g == null) {
                    return super.onDoubleTapEvent(motionEvent);
                }
                SubsamplingScaleImageView.this.setGestureDetector(context);
                if (SubsamplingScaleImageView.this.f28780d) {
                    SubsamplingScaleImageView.this.f28790n = new PointF(motionEvent.getX(), motionEvent.getY());
                    SubsamplingScaleImageView.this.f28784h = new PointF(SubsamplingScaleImageView.this.f28783g.x, SubsamplingScaleImageView.this.f28783g.y);
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    subsamplingScaleImageView.f28782f = subsamplingScaleImageView.f28781e;
                    SubsamplingScaleImageView.this.f28787k = true;
                    SubsamplingScaleImageView.this.f28786j = true;
                    SubsamplingScaleImageView.this.f28791o = -1.0f;
                    SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                    subsamplingScaleImageView2.f28794r = subsamplingScaleImageView2.mo40682a(subsamplingScaleImageView2.f28790n);
                    SubsamplingScaleImageView.this.f28795s = new PointF(motionEvent.getX(), motionEvent.getY());
                    SubsamplingScaleImageView.this.f28793q = new PointF(SubsamplingScaleImageView.this.f28794r.x, SubsamplingScaleImageView.this.f28794r.y);
                    SubsamplingScaleImageView.this.f28792p = false;
                    return false;
                }
                SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                subsamplingScaleImageView3.mo40687a(subsamplingScaleImageView3.mo40682a(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!SubsamplingScaleImageView.this.f28778b || !SubsamplingScaleImageView.this.f28797u || SubsamplingScaleImageView.this.f28783g == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.f28786j))) {
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
                PointF pointF = new PointF(SubsamplingScaleImageView.this.f28783g.x + (f * 0.25f), SubsamplingScaleImageView.this.f28783g.y + (f2 * 0.25f));
                new C10770b(new PointF((((float) (SubsamplingScaleImageView.this.getWidth() / 2)) - pointF.x) / SubsamplingScaleImageView.this.f28781e, (((float) (SubsamplingScaleImageView.this.getHeight() / 2)) - pointF.y) / SubsamplingScaleImageView.this.f28781e)).mo40746a(1).mo40751b(false).mo40750b(3).mo40749a();
                return true;
            }
        });
        this.f175422ai = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView.C107683 */

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

    public final void setRegionDecoderClass(Class<? extends ImageRegionDecoder> cls) {
        if (cls != null) {
            this.al = new CompatDecoderFactory(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.au = null;
        } else {
            Paint paint = new Paint();
            this.au = paint;
            paint.setStyle(Paint.Style.FILL);
            this.au.setColor(i);
        }
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$c */
    public static class AsyncTaskC10771c extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private final WeakReference<SubsamplingScaleImageView> f28827a;

        /* renamed from: b */
        private final WeakReference<Context> f28828b;

        /* renamed from: c */
        private final WeakReference<DecoderFactory<? extends ImageDecoder>> f28829c;

        /* renamed from: d */
        private final Uri f28830d;

        /* renamed from: e */
        private final boolean f28831e;

        /* renamed from: f */
        private Bitmap f28832f;

        /* renamed from: g */
        private Exception f28833g;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f28827a.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f28832f;
                if (bitmap == null || num == null) {
                    if (this.f28833g != null && subsamplingScaleImageView.f28798v != null) {
                        if (this.f28831e) {
                            subsamplingScaleImageView.f28798v.mo40760a(this.f28833g);
                        } else {
                            subsamplingScaleImageView.f28798v.mo40762b(this.f28833g);
                        }
                    }
                } else if (this.f28831e) {
                    subsamplingScaleImageView.mo40685a(bitmap);
                } else {
                    subsamplingScaleImageView.mo40686a(bitmap, num.intValue(), false);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            try {
                String uri = this.f28830d.toString();
                Context context = this.f28828b.get();
                DecoderFactory<? extends ImageDecoder> decoderFactory = this.f28829c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f28827a.get();
                if (context == null || decoderFactory == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.mo40692a("BitmapLoadTask.doInBackground", new Object[0]);
                this.f28832f = ((ImageDecoder) decoderFactory.make()).decode(context, this.f28830d);
                return Integer.valueOf(subsamplingScaleImageView.mo40678a(context, uri));
            } catch (Exception e) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to load bitmap", e);
                this.f28833g = e;
                return null;
            } catch (OutOfMemoryError e2) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to load bitmap - OutOfMemoryError", e2);
                this.f28833g = new RuntimeException(e2);
                return null;
            }
        }

        AsyncTaskC10771c(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageDecoder> decoderFactory, Uri uri, boolean z) {
            this.f28827a = new WeakReference<>(subsamplingScaleImageView);
            this.f28828b = new WeakReference<>(context);
            this.f28829c = new WeakReference<>(decoderFactory);
            this.f28830d = uri;
            this.f28831e = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$i */
    public static class AsyncTaskC10777i extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        private final WeakReference<SubsamplingScaleImageView> f28843a;

        /* renamed from: b */
        private final WeakReference<ImageRegionDecoder> f28844b;

        /* renamed from: c */
        private final WeakReference<C10776h> f28845c;

        /* renamed from: d */
        private Exception f28846d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f28843a.get();
            C10776h hVar = this.f28845c.get();
            if (subsamplingScaleImageView != null && hVar != null) {
                if (bitmap != null) {
                    hVar.f28838c = bitmap;
                    hVar.f28839d = false;
                    subsamplingScaleImageView.mo40683a();
                } else if (this.f28846d != null && subsamplingScaleImageView.f28798v != null) {
                    subsamplingScaleImageView.f28798v.mo40764c(this.f28846d);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.f28843a.get();
                ImageRegionDecoder imageRegionDecoder = this.f28844b.get();
                C10776h hVar = this.f28845c.get();
                if (imageRegionDecoder != null && hVar != null && subsamplingScaleImageView != null && imageRegionDecoder.isReady() && hVar.f28840e) {
                    subsamplingScaleImageView.mo40692a("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", hVar.f28836a, Integer.valueOf(hVar.f28837b));
                    subsamplingScaleImageView.f28789m.readLock().lock();
                    try {
                        if (imageRegionDecoder.isReady()) {
                            subsamplingScaleImageView.mo40688a(hVar.f28836a, hVar.f28842g);
                            if (subsamplingScaleImageView.f28785i != null) {
                                hVar.f28842g.offset(subsamplingScaleImageView.f28785i.left, subsamplingScaleImageView.f28785i.top);
                            }
                            return imageRegionDecoder.decodeRegion(hVar.f28842g, hVar.f28837b);
                        }
                        hVar.f28839d = false;
                        subsamplingScaleImageView.f28789m.readLock().unlock();
                        return null;
                    } finally {
                        subsamplingScaleImageView.f28789m.readLock().unlock();
                    }
                } else if (hVar == null) {
                    return null;
                } else {
                    hVar.f28839d = false;
                    return null;
                }
            } catch (Exception e) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to decode tile", e);
                this.f28846d = e;
                return null;
            } catch (OutOfMemoryError e2) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to decode tile - OutOfMemoryError", e2);
                this.f28846d = new RuntimeException(e2);
                return null;
            }
        }

        AsyncTaskC10777i(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, C10776h hVar) {
            this.f28843a = new WeakReference<>(subsamplingScaleImageView);
            this.f28844b = new WeakReference<>(imageRegionDecoder);
            this.f28845c = new WeakReference<>(hVar);
            hVar.f28839d = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$j */
    public static class AsyncTaskC10778j extends AsyncTask<Void, Void, int[]> {

        /* renamed from: a */
        private final WeakReference<SubsamplingScaleImageView> f28847a;

        /* renamed from: b */
        private final WeakReference<Context> f28848b;

        /* renamed from: c */
        private final WeakReference<DecoderFactory<? extends ImageRegionDecoder>> f28849c;

        /* renamed from: d */
        private final Uri f28850d;

        /* renamed from: e */
        private ImageRegionDecoder f28851e;

        /* renamed from: f */
        private Exception f28852f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f28847a.get();
            if (subsamplingScaleImageView != null) {
                ImageRegionDecoder imageRegionDecoder = this.f28851e;
                if (imageRegionDecoder != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.mo40691a(imageRegionDecoder, iArr[0], iArr[1], iArr[2]);
                } else if (this.f28852f != null && subsamplingScaleImageView.f28798v != null) {
                    subsamplingScaleImageView.f28798v.mo40762b(this.f28852f);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int[] doInBackground(Void... voidArr) {
            try {
                String uri = this.f28850d.toString();
                Context context = this.f28848b.get();
                DecoderFactory<? extends ImageRegionDecoder> decoderFactory = this.f28849c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f28847a.get();
                if (context == null || decoderFactory == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.mo40692a("TilesInitTask.doInBackground", new Object[0]);
                ImageRegionDecoder imageRegionDecoder = (ImageRegionDecoder) decoderFactory.make();
                this.f28851e = imageRegionDecoder;
                Point init = imageRegionDecoder.init(context, this.f28850d);
                int i = init.x;
                int i2 = init.y;
                int a = subsamplingScaleImageView.mo40678a(context, uri);
                if (subsamplingScaleImageView.f28785i != null) {
                    subsamplingScaleImageView.f28785i.left = Math.max(0, subsamplingScaleImageView.f28785i.left);
                    subsamplingScaleImageView.f28785i.top = Math.max(0, subsamplingScaleImageView.f28785i.top);
                    subsamplingScaleImageView.f28785i.right = Math.min(i, subsamplingScaleImageView.f28785i.right);
                    subsamplingScaleImageView.f28785i.bottom = Math.min(i2, subsamplingScaleImageView.f28785i.bottom);
                    i = subsamplingScaleImageView.f28785i.width();
                    i2 = subsamplingScaleImageView.f28785i.height();
                }
                return new int[]{i, i2, a};
            } catch (Exception e) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to initialise bitmap decoder", e);
                this.f28852f = e;
                return null;
            }
        }

        AsyncTaskC10778j(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri) {
            this.f28847a = new WeakReference<>(subsamplingScaleImageView);
            this.f28848b = new WeakReference<>(context);
            this.f28849c = new WeakReference<>(decoderFactory);
            this.f28850d = uri;
        }
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (f28754y.contains(Integer.valueOf(i))) {
            this.f28774T = i;
            return;
        }
        throw new IllegalArgumentException("Invalid zoom style: " + i);
    }

    public final void setMinimumScaleType(int i) {
        if (f28751A.contains(Integer.valueOf(i))) {
            this.f28768N = i;
            if (mo40696b()) {
                m44604d(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid scale type: " + i);
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f28766L = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i);
        if (mo40696b()) {
            m44591a(false);
            invalidate();
        }
    }

    public final void setOrientation(int i) {
        if (f28753x.contains(Integer.valueOf(i))) {
            this.f28763I = i;
            m44591a(false);
            invalidate();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i);
    }

    public final void setPanLimit(int i) {
        if (f28755z.contains(Integer.valueOf(i))) {
            this.f28767M = i;
            if (mo40696b()) {
                m44604d(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid pan limit: " + i);
    }

    /* renamed from: a */
    private Point m44584a(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.f28769O), Math.min(canvas.getMaximumBitmapHeight(), this.f28770P));
    }

    /* renamed from: b */
    private int m44596b(float f) {
        int i;
        if (this.f28766L > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= ((float) this.f28766L) / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int j = (int) (((float) m44612j()) * f);
        int k = (int) (((float) m44613k()) * f);
        if (j == 0 || k == 0) {
            return 32;
        }
        int i2 = 1;
        if (m44613k() > k || m44612j() > j) {
            i = Math.round(((float) m44613k()) / ((float) k));
            int round = Math.round(((float) m44612j()) / ((float) j));
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
    private void m44604d(boolean z) {
        boolean z2;
        if (this.f28783g == null) {
            z2 = true;
            this.f28783g = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            z2 = false;
        }
        if (this.av == null) {
            this.av = new C10775g(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        }
        this.av.f28834a = this.f28781e;
        this.av.f28835b.set(this.f28783g);
        mo40693a(z, this.av);
        this.f28781e = this.av.f28834a;
        this.f28783g.set(this.av.f28835b);
        if (z2 && this.f28768N != 4) {
            this.f28783g.set(m44585a((float) (m44612j() / 2), (float) (m44613k() / 2), this.f28781e));
        }
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.f28778b = z;
        if (!z && (pointF = this.f28783g) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.f28781e * ((float) (m44612j() / 2)));
            this.f28783g.y = ((float) (getHeight() / 2)) - (this.f28781e * ((float) (m44613k() / 2)));
            if (mo40696b()) {
                m44602c(true);
                invalidate();
            }
        }
    }

    /* renamed from: b */
    private void m44597b(Point point) {
        boolean z;
        int i;
        int i2;
        int i3 = 1;
        mo40692a("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.f28761G = new LinkedHashMap();
        int i4 = this.f28760F;
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int j = m44612j() / i5;
            int k = m44613k() / i6;
            int i7 = j / i4;
            int i8 = k / i4;
            while (true) {
                if (i7 + i5 + i3 > point.x || (((double) i7) > ((double) getWidth()) * 1.25d && i4 < this.f28760F)) {
                    i5++;
                    j = m44612j() / i5;
                    i7 = j / i4;
                    i3 = 1;
                }
            }
            while (true) {
                if (i8 + i6 + i3 > point.y || (((double) i8) > ((double) getHeight()) * 1.25d && i4 < this.f28760F)) {
                    i6++;
                    k = m44613k() / i6;
                    i8 = k / i4;
                    i3 = 1;
                }
            }
            ArrayList arrayList = new ArrayList(i5 * i6);
            for (int i9 = 0; i9 < i5; i9++) {
                for (int i10 = 0; i10 < i6; i10++) {
                    C10776h hVar = new C10776h();
                    hVar.f28837b = i4;
                    if (i4 == this.f28760F) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hVar.f28840e = z;
                    int i11 = i9 * j;
                    int i12 = i10 * k;
                    if (i9 == i5 - 1) {
                        i = m44612j();
                    } else {
                        i = (i9 + 1) * j;
                    }
                    if (i10 == i6 - 1) {
                        i2 = m44613k();
                    } else {
                        i2 = (i10 + 1) * k;
                    }
                    hVar.f28836a = new Rect(i11, i12, i, i2);
                    hVar.f28841f = new Rect(0, 0, 0, 0);
                    hVar.f28842g = new Rect(hVar.f28836a);
                    arrayList.add(hVar);
                }
            }
            this.f28761G.put(Integer.valueOf(i4), arrayList);
            if (i4 != 1) {
                i4 /= 2;
                i3 = 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private void m44602c(boolean z) {
        if (!(this.aj == null || this.f28761G == null)) {
            int min = Math.min(this.f28760F, m44596b(this.f28781e));
            for (Map.Entry<Integer, List<C10776h>> entry : this.f28761G.entrySet()) {
                for (C10776h hVar : entry.getValue()) {
                    if (hVar.f28837b < min || (hVar.f28837b > min && hVar.f28837b != this.f28760F)) {
                        hVar.f28840e = false;
                        if (hVar.f28838c != null) {
                            hVar.f28838c.recycle();
                            hVar.f28838c = null;
                        }
                    }
                    if (hVar.f28837b == min) {
                        if (m44594a(hVar)) {
                            hVar.f28840e = true;
                            if (!hVar.f28839d && hVar.f28838c == null && z) {
                                m44588a(new AsyncTaskC10777i(this, this.aj, hVar));
                            }
                        } else if (hVar.f28837b != this.f28760F) {
                            hVar.f28840e = false;
                            if (hVar.f28838c != null) {
                                hVar.f28838c.recycle();
                                hVar.f28838c = null;
                            }
                        }
                    } else if (hVar.f28837b == this.f28760F) {
                        hVar.f28840e = true;
                    }
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        C10769a aVar = this.f28796t;
        if (aVar == null || aVar.f28812i) {
            C10769a aVar2 = this.f28796t;
            if (!(aVar2 == null || aVar2.f28816m == null)) {
                try {
                    this.f28796t.f28816m.mo40757b();
                } catch (Exception e) {
                    C13479a.m54773d("SubsamplingScaleImageView", "Error thrown by animation listener", e);
                }
            }
            this.f28796t = null;
            if (this.f28783g == null) {
                GestureDetector gestureDetector2 = this.f175422ai;
                if (gestureDetector2 != null) {
                    gestureDetector2.onTouchEvent(motionEvent);
                }
                return true;
            } else if (this.f28787k || ((gestureDetector = this.ah) != null && !gestureDetector.onTouchEvent(motionEvent))) {
                if (this.f28784h == null) {
                    this.f28784h = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.f28776V == null) {
                    this.f28776V = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.f28790n == null) {
                    this.f28790n = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                float f = this.f28781e;
                this.f28776V.set(this.f28783g);
                boolean a = m44593a(motionEvent);
                m44586a(f, this.f28776V, 2);
                if (a || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            } else {
                this.f28786j = false;
                this.ag = false;
                this.f28788l = 0;
                return true;
            }
        } else {
            m44600b(true);
            return true;
        }
    }

    /* renamed from: a */
    private synchronized void m44587a(Point point) {
        mo40692a("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        int b = m44596b(m44614l());
        this.f28760F = b;
        if (b > 8) {
            this.f28760F = b / 8;
        } else {
            this.f28760F = 1;
        }
        if (this.f28760F != 1 || this.f28785i != null || m44612j() >= point.x || m44613k() >= point.y) {
            m44597b(point);
            for (C10776h hVar : this.f28761G.get(Integer.valueOf(this.f28760F))) {
                m44588a(new AsyncTaskC10777i(this, this.aj, hVar));
            }
            m44602c(true);
        } else {
            this.aj.recycle();
            this.aj = null;
            m44588a(new AsyncTaskC10771c(this, getContext(), this.ak, this.f28759E, false));
        }
    }

    /* renamed from: b */
    public final PointF mo40695b(PointF pointF) {
        return mo40694b(pointF.x, pointF.y, new PointF());
    }

    /* renamed from: a */
    private void m44588a(AsyncTask<Void, Void, ?> asyncTask) {
        asyncTask.executeOnExecutor(this.f28771Q, new Void[0]);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        C10776h hVar;
        boolean z;
        boolean z2;
        super.onDraw(canvas);
        m44610h();
        if (!(this.ac == 0 || this.ad == 0 || getWidth() == 0 || getHeight() == 0)) {
            if (this.f28761G == null && this.aj != null) {
                m44587a(m44584a(canvas));
            }
            if (m44608f()) {
                m44611i();
                C10769a aVar = this.f28796t;
                if (!(aVar == null || aVar.f28809f == null)) {
                    float f2 = this.f28781e;
                    if (this.f28776V == null) {
                        this.f28776V = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    }
                    this.f28776V.set(this.f28783g);
                    long currentTimeMillis = System.currentTimeMillis() - this.f28796t.f28815l;
                    if (currentTimeMillis > this.f28796t.f28811h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long min = Math.min(currentTimeMillis, this.f28796t.f28811h);
                    this.f28781e = m44581a(this.f28796t.f28813j, min, this.f28796t.f28804a, this.f28796t.f28805b - this.f28796t.f28804a, this.f28796t.f28811h);
                    float a = m44581a(this.f28796t.f28813j, min, this.f28796t.f28809f.x, this.f28796t.f28810g.x - this.f28796t.f28809f.x, this.f28796t.f28811h);
                    float a2 = m44581a(this.f28796t.f28813j, min, this.f28796t.f28809f.y, this.f28796t.f28810g.y - this.f28796t.f28809f.y, this.f28796t.f28811h);
                    this.f28783g.x -= m44605e(this.f28796t.f28807d.x) - a;
                    this.f28783g.y -= m44607f(this.f28796t.f28807d.y) - a2;
                    if (z || this.f28796t.f28804a == this.f28796t.f28805b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m44604d(z2);
                    m44586a(f2, this.f28776V, this.f28796t.f28814k);
                    m44602c(z);
                    if (z) {
                        if (this.f28796t.f28816m != null) {
                            try {
                                this.f28796t.f28816m.mo40756a();
                            } catch (Exception e) {
                                C13479a.m54773d("SubsamplingScaleImageView", "Error thrown by animation listener", e);
                            }
                        }
                        this.f28796t = null;
                    }
                    invalidate();
                }
                if (this.f28761G == null || !m44606e()) {
                    i = 35;
                    Bitmap bitmap = this.f28756B;
                    if (bitmap != null) {
                        float f3 = this.f28781e;
                        if (this.f28757C) {
                            f3 *= ((float) this.ac) / ((float) bitmap.getWidth());
                            f = this.f28781e * (((float) this.ad) / ((float) this.f28756B.getHeight()));
                        } else {
                            f = f3;
                        }
                        if (this.aw == null) {
                            this.aw = new Matrix();
                        }
                        this.aw.reset();
                        this.aw.postScale(f3, f);
                        this.aw.postRotate((float) getRequiredRotation());
                        this.aw.postTranslate(this.f28783g.x, this.f28783g.y);
                        if (getRequiredRotation() == 180) {
                            Matrix matrix = this.aw;
                            float f4 = this.f28781e;
                            matrix.postTranslate(((float) this.ac) * f4, f4 * ((float) this.ad));
                        } else if (getRequiredRotation() == 90) {
                            this.aw.postTranslate(this.f28781e * ((float) this.ad), BitmapDescriptorFactory.HUE_RED);
                        } else if (getRequiredRotation() == 270) {
                            this.aw.postTranslate(BitmapDescriptorFactory.HUE_RED, this.f28781e * ((float) this.ac));
                        }
                        if (this.au != null) {
                            if (this.ax == null) {
                                this.ax = new RectF();
                            }
                            RectF rectF = this.ax;
                            if (this.f28757C) {
                                i2 = this.f28756B.getWidth();
                            } else {
                                i2 = this.ac;
                            }
                            float f5 = (float) i2;
                            if (this.f28757C) {
                                i3 = this.f28756B.getHeight();
                            } else {
                                i3 = this.ad;
                            }
                            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, (float) i3);
                            this.aw.mapRect(this.ax);
                            canvas.drawRect(this.ax, this.au);
                        }
                        canvas.drawBitmap(this.f28756B, this.aw, this.ar);
                    }
                } else {
                    int min2 = Math.min(this.f28760F, m44596b(this.f28781e));
                    boolean z3 = false;
                    for (Map.Entry<Integer, List<C10776h>> entry : this.f28761G.entrySet()) {
                        if (entry.getKey().intValue() == min2) {
                            for (C10776h hVar2 : entry.getValue()) {
                                if (hVar2.f28840e && (hVar2.f28839d || hVar2.f28838c == null)) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                    for (Map.Entry<Integer, List<C10776h>> entry2 : this.f28761G.entrySet()) {
                        if (entry2.getKey().intValue() == min2 || z3) {
                            for (C10776h hVar3 : entry2.getValue()) {
                                m44598b(hVar3.f28836a, hVar3.f28841f);
                                if (hVar3.f28839d || hVar3.f28838c == null) {
                                    hVar = hVar3;
                                    if (hVar.f28839d && this.f28762H) {
                                        canvas.drawText("LOADING", (float) (hVar.f28841f.left + m44583a(5)), (float) (hVar.f28841f.top + m44583a(35)), this.as);
                                        if (hVar.f28840e && this.f28762H) {
                                            canvas.drawText("ISS " + hVar.f28837b + " RECT " + hVar.f28836a.top + "," + hVar.f28836a.left + "," + hVar.f28836a.bottom + "," + hVar.f28836a.right, (float) (hVar.f28841f.left + m44583a(5)), (float) (hVar.f28841f.top + m44583a(15)), this.as);
                                        }
                                    }
                                } else {
                                    if (this.au != null) {
                                        canvas.drawRect(hVar3.f28841f, this.au);
                                    }
                                    if (this.aw == null) {
                                        this.aw = new Matrix();
                                    }
                                    this.aw.reset();
                                    hVar = hVar3;
                                    m44592a(this.ay, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) hVar3.f28838c.getWidth(), BitmapDescriptorFactory.HUE_RED, (float) hVar3.f28838c.getWidth(), (float) hVar3.f28838c.getHeight(), BitmapDescriptorFactory.HUE_RED, (float) hVar3.f28838c.getHeight());
                                    if (getRequiredRotation() == 0) {
                                        m44592a(this.az, (float) hVar.f28841f.left, (float) hVar.f28841f.top, (float) hVar.f28841f.right, (float) hVar.f28841f.top, (float) hVar.f28841f.right, (float) hVar.f28841f.bottom, (float) hVar.f28841f.left, (float) hVar.f28841f.bottom);
                                    } else if (getRequiredRotation() == 90) {
                                        m44592a(this.az, (float) hVar.f28841f.right, (float) hVar.f28841f.top, (float) hVar.f28841f.right, (float) hVar.f28841f.bottom, (float) hVar.f28841f.left, (float) hVar.f28841f.bottom, (float) hVar.f28841f.left, (float) hVar.f28841f.top);
                                    } else if (getRequiredRotation() == 180) {
                                        m44592a(this.az, (float) hVar.f28841f.right, (float) hVar.f28841f.bottom, (float) hVar.f28841f.left, (float) hVar.f28841f.bottom, (float) hVar.f28841f.left, (float) hVar.f28841f.top, (float) hVar.f28841f.right, (float) hVar.f28841f.top);
                                    } else if (getRequiredRotation() == 270) {
                                        m44592a(this.az, (float) hVar.f28841f.left, (float) hVar.f28841f.bottom, (float) hVar.f28841f.left, (float) hVar.f28841f.top, (float) hVar.f28841f.right, (float) hVar.f28841f.top, (float) hVar.f28841f.right, (float) hVar.f28841f.bottom);
                                    }
                                    this.aw.setPolyToPoly(this.ay, 0, this.az, 0, 4);
                                    canvas.drawBitmap(hVar.f28838c, this.aw, this.ar);
                                    if (this.f28762H) {
                                        canvas.drawRect(hVar.f28841f, this.at);
                                    }
                                }
                                canvas.drawText("ISS " + hVar.f28837b + " RECT " + hVar.f28836a.top + "," + hVar.f28836a.left + "," + hVar.f28836a.bottom + "," + hVar.f28836a.right, (float) (hVar.f28841f.left + m44583a(5)), (float) (hVar.f28841f.top + m44583a(15)), this.as);
                            }
                        }
                    }
                    i = 35;
                }
                if (this.f28762H) {
                    canvas.drawText("Scale: " + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.f28781e)) + " (" + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(m44614l())) + " - " + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.f28764J)) + ")", (float) m44583a(5), (float) m44583a(15), this.as);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Translate: ");
                    sb.append(String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.f28783g.x)));
                    sb.append(":");
                    sb.append(String.format(Locale.ENGLISH, "%.2f", Float.valueOf(this.f28783g.y)));
                    canvas.drawText(sb.toString(), (float) m44583a(5), (float) m44583a(30), this.as);
                    PointF center = getCenter();
                    canvas.drawText("Source center: " + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(center.x)) + ":" + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(center.y)), (float) m44583a(5), (float) m44583a(45), this.as);
                    C10769a aVar2 = this.f28796t;
                    if (aVar2 != null) {
                        PointF b = mo40695b(aVar2.f28806c);
                        PointF b2 = mo40695b(this.f28796t.f28808e);
                        PointF b3 = mo40695b(this.f28796t.f28807d);
                        canvas.drawCircle(b.x, b.y, (float) m44583a(10), this.at);
                        this.at.setColor(-65536);
                        canvas.drawCircle(b2.x, b2.y, (float) m44583a(20), this.at);
                        this.at.setColor(-16776961);
                        canvas.drawCircle(b3.x, b3.y, (float) m44583a(25), this.at);
                        this.at.setColor(-16711681);
                        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) m44583a(30), this.at);
                    }
                    if (this.f28790n != null) {
                        this.at.setColor(-65536);
                        canvas.drawCircle(this.f28790n.x, this.f28790n.y, (float) m44583a(20), this.at);
                    }
                    if (this.f28794r != null) {
                        this.at.setColor(-16776961);
                        canvas.drawCircle(m44605e(this.f28794r.x), m44607f(this.f28794r.y), (float) m44583a(i), this.at);
                    }
                    if (this.f28795s != null && this.f28787k) {
                        this.at.setColor(-16711681);
                        canvas.drawCircle(this.f28795s.x, this.f28795s.y, (float) m44583a(30), this.at);
                    }
                    this.at.setColor(-65281);
                }
            }
        }
    }

    /* renamed from: a */
    private void m44590a(ImageViewState imageViewState) {
        if (imageViewState != null && f28753x.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            this.f28763I = imageViewState.getOrientation();
            this.f28777W = Float.valueOf(imageViewState.getScale());
            this.aa = imageViewState.getCenter();
            invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView$g */
    public static class C10775g {

        /* renamed from: a */
        public float f28834a;

        /* renamed from: b */
        public final PointF f28835b;

        private C10775g(float f, PointF pointF) {
            this.f28834a = f;
            this.f28835b = pointF;
        }
    }

    /* renamed from: b */
    private void m44598b(Rect rect, Rect rect2) {
        rect2.set((int) m44605e((float) rect.left), (int) m44607f((float) rect.top), (int) m44605e((float) rect.right), (int) m44607f((float) rect.bottom));
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
        if (this.ac > 0 && this.ad > 0) {
            if (z && z2) {
                size = m44612j();
                size2 = m44613k();
            } else if (z2) {
                size2 = (int) ((((double) m44613k()) / ((double) m44612j())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) m44612j()) / ((double) m44613k())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        this.f28764J = 2.0f;
        this.f28765K = m44614l();
        this.f28766L = -1;
        this.f28767M = 1;
        this.f28768N = 1;
        this.f28769O = Integer.MAX_VALUE;
        this.f28770P = Integer.MAX_VALUE;
        this.f28771Q = AsyncTask.THREAD_POOL_EXECUTOR;
        this.f28772R = true;
        this.f28778b = true;
        this.f28779c = true;
        this.f28780d = true;
        this.f28773S = 1.0f;
        this.f28774T = 1;
        this.f28775U = ParticipantRepo.f117150c;
        this.f28789m = new ReentrantReadWriteLock(true);
        this.ak = new CompatDecoderFactory(SkiaImageDecoder.class);
        this.al = new CompatDecoderFactory(SkiaImageRegionDecoder.class);
        this.ay = new float[8];
        this.az = new float[8];
        this.aA = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.aq = new Handler(new Handler.Callback() {
            /* class com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView.C107661 */

            public boolean handleMessage(Message message) {
                if (message.what == 1 && SubsamplingScaleImageView.this.f28799w != null) {
                    SubsamplingScaleImageView.this.f28788l = 0;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.f28799w);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.assetName, R.attr.panEnabled, R.attr.quickScaleEnabled, R.attr.src, R.attr.tileBackgroundColor, R.attr.zoomEnabled});
            if (obtainStyledAttributes.hasValue(0) && (string = obtainStyledAttributes.getString(0)) != null && string.length() > 0) {
                setImage(C10780b.m44666a(string).mo40775a());
            }
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
                setImage(C10780b.m44664a(resourceId).mo40775a());
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
        this.an = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    private PointF m44585a(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.av == null) {
            this.av = new C10775g(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        }
        this.av.f28834a = f3;
        this.av.f28835b.set(((float) paddingLeft) - (f * f3), ((float) paddingTop) - (f2 * f3));
        mo40693a(true, this.av);
        return this.av.f28835b;
    }

    /* renamed from: a */
    private void m44586a(float f, PointF pointF, int i) {
        AbstractC10774f fVar = this.ap;
        if (fVar != null) {
            float f2 = this.f28781e;
            if (f2 != f) {
                fVar.mo40765a(f2, i);
            }
        }
        if (this.ap != null && !this.f28783g.equals(pointF)) {
            this.ap.mo40766a(getCenter(), i);
        }
    }

    /* renamed from: b */
    public final PointF mo40694b(float f, float f2, PointF pointF) {
        if (this.f28783g == null) {
            return null;
        }
        pointF.set(m44605e(f), m44607f(f2));
        return pointF;
    }

    /* renamed from: a */
    private float m44580a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo40692a("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (this.f28797u && center != null) {
            this.f28796t = null;
            this.f28777W = Float.valueOf(this.f28781e);
            this.aa = center;
        }
    }

    /* renamed from: a */
    private float m44581a(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return m44582a(j, f, f2, j2);
        }
        if (i == 2) {
            return m44595b(j, f, f2, j2);
        }
        throw new IllegalStateException("Unexpected easing type: " + i);
    }
}
