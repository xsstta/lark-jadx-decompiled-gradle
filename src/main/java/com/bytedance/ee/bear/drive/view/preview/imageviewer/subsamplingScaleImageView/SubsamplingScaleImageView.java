package com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView;

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
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7356a;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.p373a.AbstractC7357b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13605c;
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
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SubsamplingScaleImageView extends View {

    /* renamed from: A */
    private static final List<Integer> f19776A = Arrays.asList(2, 1, 3, 4);

    /* renamed from: a */
    private static final List<Integer> f19777a = Arrays.asList(0, 90, 180, 270, -1);
    private static Bitmap.Config aD;

    /* renamed from: b */
    private static final List<Integer> f19778b = Arrays.asList(1, 2, 3);

    /* renamed from: c */
    public static final List<Integer> f19779c = Arrays.asList(2, 1);

    /* renamed from: z */
    private static final List<Integer> f19780z = Arrays.asList(1, 2, 3);

    /* renamed from: B */
    private Bitmap f19781B;

    /* renamed from: C */
    private boolean f19782C;

    /* renamed from: D */
    private boolean f19783D;

    /* renamed from: E */
    private Uri f19784E;

    /* renamed from: F */
    private int f19785F;

    /* renamed from: G */
    private Map<Integer, List<C7396i>> f19786G;

    /* renamed from: H */
    private boolean f19787H;

    /* renamed from: I */
    private int f19788I;

    /* renamed from: J */
    private float f19789J;

    /* renamed from: K */
    private float f19790K;

    /* renamed from: L */
    private int f19791L;

    /* renamed from: M */
    private int f19792M;

    /* renamed from: N */
    private int f19793N;

    /* renamed from: O */
    private int f19794O;

    /* renamed from: P */
    private int f19795P;

    /* renamed from: Q */
    private Executor f19796Q;

    /* renamed from: R */
    private boolean f19797R;

    /* renamed from: S */
    private float f19798S;

    /* renamed from: T */
    private int f19799T;

    /* renamed from: U */
    private int f19800U;

    /* renamed from: V */
    private PointF f19801V;

    /* renamed from: W */
    private Float f19802W;
    private final float[] aA;
    private final float[] aB;
    private final float aC;
    private float aE;
    private RectF aF;
    private PointF aa;
    private PointF ab;
    private int ac;
    private int ad;
    private int ae;
    private Rect af;
    private boolean ag;
    private GestureDetector ah;

    /* renamed from: ai  reason: collision with root package name */
    private GestureDetector f175418ai;
    private ImageRegionDecoder aj;
    private DecoderFactory<? extends ImageDecoder> ak;
    private DecoderFactory<? extends ImageRegionDecoder> al;
    private float am;
    private final float an;
    private boolean ao;
    private AbstractC7394g ap;
    private AbstractC7357b aq;
    private AbstractC7356a ar;
    private final Handler as;
    private Paint at;
    private Paint au;
    private Paint av;
    private Paint aw;
    private C7395h ax;
    private Matrix ay;
    private RectF az;

    /* renamed from: d */
    public boolean f19803d;

    /* renamed from: e */
    public boolean f19804e;

    /* renamed from: f */
    public boolean f19805f;

    /* renamed from: g */
    public float f19806g;

    /* renamed from: h */
    public float f19807h;

    /* renamed from: i */
    public PointF f19808i;

    /* renamed from: j */
    public PointF f19809j;

    /* renamed from: k */
    public Rect f19810k;

    /* renamed from: l */
    public boolean f19811l;

    /* renamed from: m */
    public boolean f19812m;

    /* renamed from: n */
    public int f19813n;

    /* renamed from: o */
    public final ReadWriteLock f19814o;

    /* renamed from: p */
    public PointF f19815p;

    /* renamed from: q */
    public float f19816q;

    /* renamed from: r */
    public boolean f19817r;

    /* renamed from: s */
    public PointF f19818s;

    /* renamed from: t */
    public PointF f19819t;

    /* renamed from: u */
    public PointF f19820u;

    /* renamed from: v */
    public C7388a f19821v;

    /* renamed from: w */
    public boolean f19822w;

    /* renamed from: x */
    public AbstractC7393f f19823x;

    /* renamed from: y */
    public View.OnLongClickListener f19824y;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$d */
    public static class C7391d implements AbstractC7393f {
        @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.AbstractC7393f
        /* renamed from: a */
        public void mo28650a() {
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.AbstractC7393f
        /* renamed from: a */
        public void mo28651a(Exception exc) {
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.AbstractC7393f
        /* renamed from: b */
        public void mo28861b() {
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.AbstractC7393f
        /* renamed from: b */
        public void mo28862b(Exception exc) {
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.AbstractC7393f
        /* renamed from: c */
        public void mo28863c() {
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.AbstractC7393f
        /* renamed from: c */
        public void mo28864c(Exception exc) {
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$e */
    public interface AbstractC7392e {
        /* renamed from: a */
        void mo28865a();

        /* renamed from: b */
        void mo28866b();

        /* renamed from: c */
        void mo28867c();
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$f */
    public interface AbstractC7393f {
        /* renamed from: a */
        void mo28650a();

        /* renamed from: a */
        void mo28651a(Exception exc);

        /* renamed from: b */
        void mo28861b();

        /* renamed from: b */
        void mo28862b(Exception exc);

        /* renamed from: c */
        void mo28863c();

        /* renamed from: c */
        void mo28864c(Exception exc);
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$g */
    public interface AbstractC7394g {
        /* renamed from: a */
        void mo28868a(float f, int i);

        /* renamed from: a */
        void mo28869a(PointF pointF, int i);
    }

    /* renamed from: a */
    private float m29478a(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    /* renamed from: b */
    private float m29490b(long j, float f, float f2, long j2) {
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
    public void mo28794c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo28796e() {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$i */
    public static class C7396i {

        /* renamed from: a */
        public Rect f19861a;

        /* renamed from: b */
        public int f19862b;

        /* renamed from: c */
        public Bitmap f19863c;

        /* renamed from: d */
        public boolean f19864d;

        /* renamed from: e */
        public boolean f19865e;

        /* renamed from: f */
        public Rect f19866f;

        /* renamed from: g */
        public Rect f19867g;

        private C7396i() {
        }
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return aD;
    }

    /* renamed from: d */
    public final boolean mo28795d() {
        return this.ao;
    }

    public float getMaxScale() {
        return this.f19789J;
    }

    public final int getOrientation() {
        return this.f19788I;
    }

    public final int getSHeight() {
        return this.ad;
    }

    public final int getSWidth() {
        return this.ac;
    }

    public final float getScale() {
        return this.f19806g;
    }

    /* renamed from: a */
    public final void mo28786a(C7399a aVar, ImageViewState imageViewState) {
        mo28787a(aVar, (C7399a) null, imageViewState);
    }

    /* renamed from: a */
    public final void mo28787a(C7399a aVar, C7399a aVar2, ImageViewState imageViewState) {
        Objects.requireNonNull(aVar, "imageSource must not be null");
        m29486a(true);
        if (imageViewState != null) {
            m29484a(imageViewState);
        }
        if (aVar2 != null) {
            if (aVar.mo28881c() != null) {
                throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            } else if (aVar.mo28884f() <= 0 || aVar.mo28885g() <= 0) {
                throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            } else {
                this.ac = aVar.mo28884f();
                this.ad = aVar.mo28885g();
                this.af = aVar2.mo28886h();
                if (aVar2.mo28881c() != null) {
                    this.f19783D = aVar2.mo28887i();
                    mo28782a(aVar2.mo28881c());
                } else {
                    Uri b = aVar2.mo28880b();
                    if (b == null && aVar2.mo28882d() != null) {
                        b = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + aVar2.mo28882d());
                    }
                    m29483a(new AsyncTaskC7390c(this, getContext(), this.ak, b, true));
                }
            }
        }
        if (aVar.mo28881c() != null && aVar.mo28886h() != null) {
            mo28783a(Bitmap.createBitmap(aVar.mo28881c(), aVar.mo28886h().left, aVar.mo28886h().top, aVar.mo28886h().width(), aVar.mo28886h().height()), 0, false);
        } else if (aVar.mo28881c() != null) {
            mo28783a(aVar.mo28881c(), 0, aVar.mo28887i());
        } else {
            this.f19810k = aVar.mo28886h();
            Uri b2 = aVar.mo28880b();
            this.f19784E = b2;
            if (b2 == null && aVar.mo28882d() != null) {
                this.f19784E = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + aVar.mo28882d());
            }
            if (aVar.mo28883e() || this.f19810k != null) {
                m29483a(new AsyncTaskC7398k(this, getContext(), this.al, this.f19784E));
            } else {
                m29483a(new AsyncTaskC7390c(this, getContext(), this.ak, this.f19784E, false));
            }
        }
    }

    /* renamed from: a */
    private boolean m29488a(MotionEvent motionEvent) {
        boolean z;
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        boolean z2 = false;
        if (action != 0) {
            if (action == 1) {
                float scale = getScale();
                if (this.aq != null && !C13605c.m55243a(scale, this.aE)) {
                    this.aq.onScaleEvent(this.aE, scale);
                }
            } else if (action == 2) {
                if (this.f19813n > 0) {
                    if (pointerCount >= 2) {
                        float a = m29476a(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                        float x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                        float y = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                        if (this.f19804e && (m29476a(this.f19815p.x, x, this.f19815p.y, y) > 5.0f || Math.abs(a - this.am) > 5.0f || this.ag)) {
                            this.f19811l = true;
                            this.ag = true;
                            double d = (double) this.f19806g;
                            float min = Math.min(this.f19789J, (a / this.am) * this.f19807h);
                            this.f19806g = min;
                            if (min <= m29511m()) {
                                this.am = a;
                                this.f19807h = m29511m();
                                this.f19815p.set(x, y);
                                this.f19809j.set(this.f19808i);
                            } else if (this.f19803d) {
                                float f = this.f19815p.x - this.f19809j.x;
                                float f2 = this.f19815p.y - this.f19809j.y;
                                float f3 = this.f19806g;
                                float f4 = this.f19807h;
                                this.f19808i.x = x - (f * (f3 / f4));
                                this.f19808i.y = y - (f2 * (f3 / f4));
                                if ((((double) m29510l()) * d < ((double) getHeight()) && this.f19806g * ((float) m29510l()) >= ((float) getHeight())) || (d * ((double) m29509k()) < ((double) getWidth()) && this.f19806g * ((float) m29509k()) >= ((float) getWidth()))) {
                                    m29501d(true);
                                    this.f19815p.set(x, y);
                                    this.f19809j.set(this.f19808i);
                                    this.f19807h = this.f19806g;
                                    this.am = a;
                                }
                            } else if (this.ab != null) {
                                this.f19808i.x = ((float) (getWidth() / 2)) - (this.f19806g * this.ab.x);
                                this.f19808i.y = ((float) (getHeight() / 2)) - (this.f19806g * this.ab.y);
                            } else {
                                this.f19808i.x = ((float) (getWidth() / 2)) - (this.f19806g * ((float) (m29509k() / 2)));
                                this.f19808i.y = ((float) (getHeight() / 2)) - (this.f19806g * ((float) (m29510l() / 2)));
                            }
                            m29501d(true);
                            m29499c(this.f19797R);
                        }
                    } else if (this.f19812m) {
                        float abs = (Math.abs(this.f19820u.y - motionEvent.getY()) * 2.0f) + this.an;
                        if (this.f19816q == -1.0f) {
                            this.f19816q = abs;
                        }
                        if (motionEvent.getY() > this.f19818s.y) {
                            z2 = true;
                        }
                        this.f19818s.set(BitmapDescriptorFactory.HUE_RED, motionEvent.getY());
                        float f5 = 1.0f;
                        float abs2 = Math.abs(1.0f - (abs / this.f19816q)) * 0.5f;
                        if (abs2 > 0.03f || this.f19817r) {
                            this.f19817r = true;
                            if (this.f19816q > BitmapDescriptorFactory.HUE_RED) {
                                f5 = z2 ? abs2 + 1.0f : 1.0f - abs2;
                            }
                            double d2 = (double) this.f19806g;
                            this.f19806g = Math.max(m29511m(), Math.min(this.f19789J, this.f19806g * f5));
                            if (this.f19803d) {
                                float f6 = this.f19815p.x - this.f19809j.x;
                                float f7 = this.f19815p.y - this.f19809j.y;
                                float f8 = this.f19806g;
                                float f9 = this.f19807h;
                                this.f19808i.x = this.f19815p.x - (f6 * (f8 / f9));
                                this.f19808i.y = this.f19815p.y - (f7 * (f8 / f9));
                                if ((((double) m29510l()) * d2 < ((double) getHeight()) && this.f19806g * ((float) m29510l()) >= ((float) getHeight())) || (d2 * ((double) m29509k()) < ((double) getWidth()) && this.f19806g * ((float) m29509k()) >= ((float) getWidth()))) {
                                    m29501d(true);
                                    this.f19815p.set(mo28792b(this.f19819t));
                                    this.f19809j.set(this.f19808i);
                                    this.f19807h = this.f19806g;
                                    abs = BitmapDescriptorFactory.HUE_RED;
                                }
                            } else if (this.ab != null) {
                                this.f19808i.x = ((float) (getWidth() / 2)) - (this.f19806g * this.ab.x);
                                this.f19808i.y = ((float) (getHeight() / 2)) - (this.f19806g * this.ab.y);
                            } else {
                                this.f19808i.x = ((float) (getWidth() / 2)) - (this.f19806g * ((float) (m29509k() / 2)));
                                this.f19808i.y = ((float) (getHeight() / 2)) - (this.f19806g * ((float) (m29510l() / 2)));
                            }
                        }
                        this.f19816q = abs;
                        m29501d(true);
                        m29499c(this.f19797R);
                    } else if (!this.f19811l) {
                        float abs3 = Math.abs(motionEvent.getX() - this.f19815p.x);
                        float abs4 = Math.abs(motionEvent.getY() - this.f19815p.y);
                        float f10 = this.aC * 5.0f;
                        int i = (abs3 > f10 ? 1 : (abs3 == f10 ? 0 : -1));
                        if (i > 0 || abs4 > f10 || this.ag) {
                            this.f19808i.x = this.f19809j.x + (motionEvent.getX() - this.f19815p.x);
                            this.f19808i.y = this.f19809j.y + (motionEvent.getY() - this.f19815p.y);
                            float f11 = this.f19808i.x;
                            float f12 = this.f19808i.y;
                            m29501d(true);
                            boolean z3 = f11 != this.f19808i.x;
                            boolean z4 = f12 != this.f19808i.y;
                            boolean z5 = z3 && abs3 > abs4 && !this.ag;
                            boolean z6 = z4 && abs4 > abs3 && !this.ag;
                            boolean z7 = f12 == this.f19808i.y && abs4 > 3.0f * f10;
                            if (!z5 && !z6 && (!z3 || !z4 || z7 || this.ag)) {
                                this.ag = true;
                            } else if (i > 0 || abs4 > f10) {
                                this.f19813n = 0;
                                this.as.removeMessages(1);
                                m29496b(false);
                            }
                            if (!this.f19803d) {
                                this.f19808i.x = this.f19809j.x;
                                this.f19808i.y = this.f19809j.y;
                                m29496b(false);
                            }
                            m29499c(this.f19797R);
                        }
                    }
                    z2 = true;
                }
                if (z2) {
                    this.as.removeMessages(1);
                    invalidate();
                }
                return true;
            } else if (action != 5) {
                if (action != 6) {
                    if (action != 261) {
                        if (action != 262) {
                            return false;
                        }
                    }
                }
            }
            this.as.removeMessages(1);
            if (this.f19812m) {
                this.f19812m = false;
                if (!this.f19817r) {
                    mo28784a(this.f19819t, this.f19815p);
                }
            }
            if (this.f19813n <= 0 || (!(z = this.f19811l) && !this.ag)) {
                if (pointerCount == 1) {
                    this.f19811l = false;
                    this.ag = false;
                    this.f19813n = 0;
                }
                return true;
            }
            if (z && pointerCount == 2) {
                this.ag = true;
                this.f19809j.set(this.f19808i.x, this.f19808i.y);
                if (motionEvent.getActionIndex() == 1) {
                    this.f19815p.set(motionEvent.getX(0), motionEvent.getY(0));
                } else {
                    this.f19815p.set(motionEvent.getX(1), motionEvent.getY(1));
                }
            }
            if (pointerCount < 3) {
                this.f19811l = false;
            }
            if (pointerCount < 2) {
                this.ag = false;
                this.f19813n = 0;
            }
            m29499c(true);
            return true;
        }
        this.aE = getScale();
        this.f19821v = null;
        m29496b(true);
        this.f19813n = Math.max(this.f19813n, pointerCount);
        if (pointerCount >= 2) {
            if (this.f19804e) {
                float a2 = m29476a(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                this.f19807h = this.f19806g;
                this.am = a2;
                this.f19809j.set(this.f19808i.x, this.f19808i.y);
                this.f19815p.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
            } else {
                this.f19813n = 0;
            }
            this.as.removeMessages(1);
        } else if (!this.f19812m) {
            this.f19809j.set(this.f19808i.x, this.f19808i.y);
            this.f19815p.set(motionEvent.getX(), motionEvent.getY());
            this.as.sendEmptyMessageDelayed(1, 600);
        }
        return true;
    }

    /* renamed from: a */
    public void mo28784a(PointF pointF, PointF pointF2) {
        if (!this.f19803d) {
            PointF pointF3 = this.ab;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = this.ab.y;
            } else {
                pointF.x = (float) (m29509k() / 2);
                pointF.y = (float) (m29510l() / 2);
            }
        }
        float min = Math.min(this.f19789J, this.f19798S);
        float f = this.f19806g;
        boolean z = ((double) f) <= ((double) min) * 0.9d || f == this.f19790K;
        if (!z) {
            min = m29511m();
        }
        int i = this.f19799T;
        if (i == 3) {
            mo28781a(min, pointF);
        } else if (i == 2 || !z || !this.f19803d) {
            new C7389b(min, pointF).mo28853a(false).mo28852a((long) this.f19800U).mo28855b(4).mo28854a();
        } else if (i == 1) {
            new C7389b(min, pointF, pointF2).mo28853a(false).mo28852a((long) this.f19800U).mo28855b(4).mo28854a();
        }
        invalidate();
        AbstractC7357b bVar = this.aq;
        if (bVar != null) {
            bVar.onScaleEvent(getScale(), min);
        }
    }

    /* renamed from: a */
    private void m29487a(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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
    private boolean m29489a(C7396i iVar) {
        return m29497c(BitmapDescriptorFactory.HUE_RED) <= ((float) iVar.f19861a.right) && ((float) iVar.f19861a.left) <= m29497c((float) getWidth()) && m29500d(BitmapDescriptorFactory.HUE_RED) <= ((float) iVar.f19861a.bottom) && ((float) iVar.f19861a.top) <= m29500d((float) getHeight());
    }

    /* renamed from: a */
    public void mo28790a(boolean z, C7395h hVar) {
        float f;
        float f2;
        int i;
        if (this.f19792M == 2 && mo28793b()) {
            z = false;
        }
        PointF pointF = hVar.f19860b;
        float a = mo28773a(hVar.f19859a);
        float k = ((float) m29509k()) * a;
        float l = ((float) m29510l()) * a;
        if (this.f19792M == 3 && mo28793b()) {
            pointF.x = Math.max(pointF.x, ((float) (getWidth() / 2)) - k);
            pointF.y = Math.max(pointF.y, ((float) (getHeight() / 2)) - l);
        } else if (z) {
            pointF.x = Math.max(pointF.x, ((float) getWidth()) - k);
            pointF.y = Math.max(pointF.y, ((float) getHeight()) - l);
        } else {
            pointF.x = Math.max(pointF.x, -k);
            pointF.y = Math.max(pointF.y, -l);
        }
        float f3 = 0.5f;
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? ((float) getPaddingLeft()) / ((float) (getPaddingLeft() + getPaddingRight())) : 0.5f;
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            f3 = ((float) getPaddingTop()) / ((float) (getPaddingTop() + getPaddingBottom()));
        }
        if (this.f19792M == 3 && mo28793b()) {
            f = (float) Math.max(0, getWidth() / 2);
            i = Math.max(0, getHeight() / 2);
        } else if (z) {
            f = Math.max((float) BitmapDescriptorFactory.HUE_RED, (((float) getWidth()) - k) * paddingLeft);
            f2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, (((float) getHeight()) - l) * f3);
            pointF.x = Math.min(pointF.x, f);
            pointF.y = Math.min(pointF.y, f2);
            hVar.f19859a = a;
        } else {
            f = (float) Math.max(0, getWidth());
            i = Math.max(0, getHeight());
        }
        f2 = (float) i;
        pointF.x = Math.min(pointF.x, f);
        pointF.y = Math.min(pointF.y, f2);
        hVar.f19859a = a;
    }

    /* renamed from: a */
    public void mo28780a(float f, float f2, float f3) {
        PointF pointF;
        PointF a;
        if (mo28795d() && mo28793b() && (a = mo28778a((pointF = new PointF(f2, f3)))) != null) {
            new C7389b(f / getScaleFactor(), a, pointF).mo28853a(false).mo28852a((long) this.f19800U).mo28855b(4).mo28854a();
        }
    }

    /* renamed from: a */
    public void mo28647a(float f, boolean z) {
        if (mo28795d() && mo28793b() && getCenter() != null) {
            if (z) {
                new C7389b(f / getScaleFactor(), getCenter()).mo28853a(false).mo28852a((long) this.f19800U).mo28855b(4).mo28854a();
            } else {
                new C7389b(f / getScaleFactor(), getCenter()).mo28853a(false).mo28852a(1L).mo28855b(4).mo28854a();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo28788a(ImageRegionDecoder imageRegionDecoder, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        mo28789a("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f19788I));
        int i7 = this.ac;
        if (i7 > 0 && (i6 = this.ad) > 0 && !(i7 == i && i6 == i2)) {
            m29486a(false);
            Bitmap bitmap = this.f19781B;
            if (bitmap != null) {
                if (!this.f19783D) {
                    bitmap.recycle();
                }
                this.f19781B = null;
                AbstractC7393f fVar = this.f19823x;
                if (fVar != null && this.f19783D) {
                    fVar.mo28863c();
                }
                this.f19782C = false;
                this.f19783D = false;
            }
        }
        this.aj = imageRegionDecoder;
        this.ac = i;
        this.ad = i2;
        this.ae = i3;
        m29505g();
        if (!m29506h() && (i4 = this.f19794O) > 0 && i4 != Integer.MAX_VALUE && (i5 = this.f19795P) > 0 && i5 != Integer.MAX_VALUE && getWidth() > 0 && getHeight() > 0) {
            m29482a(new Point(this.f19794O, this.f19795P));
        }
        invalidate();
        requestLayout();
    }

    /* renamed from: a */
    public synchronized void mo28779a() {
        Bitmap bitmap;
        mo28789a("onTileLoaded", new Object[0]);
        m29505g();
        m29506h();
        if (m29504f() && (bitmap = this.f19781B) != null) {
            if (!this.f19783D) {
                bitmap.recycle();
            }
            this.f19781B = null;
            AbstractC7393f fVar = this.f19823x;
            if (fVar != null && this.f19783D) {
                fVar.mo28863c();
            }
            this.f19782C = false;
            this.f19783D = false;
        }
        invalidate();
    }

    /* renamed from: a */
    public synchronized void mo28782a(Bitmap bitmap) {
        mo28789a("onPreviewLoaded", new Object[0]);
        if (this.f19781B == null) {
            if (!this.ao) {
                Rect rect = this.af;
                if (rect != null) {
                    this.f19781B = Bitmap.createBitmap(bitmap, rect.left, this.af.top, this.af.width(), this.af.height());
                } else {
                    this.f19781B = bitmap;
                }
                this.f19782C = true;
                if (m29505g()) {
                    invalidate();
                    requestLayout();
                }
                return;
            }
        }
        bitmap.recycle();
    }

    /* renamed from: a */
    public synchronized void mo28783a(Bitmap bitmap, int i, boolean z) {
        AbstractC7393f fVar;
        mo28789a("onImageLoaded", new Object[0]);
        int i2 = this.ac;
        if (i2 > 0 && this.ad > 0 && !(i2 == bitmap.getWidth() && this.ad == bitmap.getHeight())) {
            m29486a(false);
        }
        Bitmap bitmap2 = this.f19781B;
        if (bitmap2 != null && !this.f19783D) {
            bitmap2.recycle();
        }
        if (!(this.f19781B == null || !this.f19783D || (fVar = this.f19823x) == null)) {
            fVar.mo28863c();
        }
        this.f19782C = false;
        this.f19783D = z;
        this.f19781B = bitmap;
        this.ac = bitmap.getWidth();
        this.ad = bitmap.getHeight();
        this.ae = i;
        boolean g = m29505g();
        boolean h = m29506h();
        if (g || h) {
            invalidate();
            requestLayout();
        }
    }

    /* renamed from: a */
    public int mo28774a(Context context, String str) {
        int i = 0;
        if (str.startsWith("content")) {
            Cursor cursor = null;
            try {
                cursor = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
                if (cursor != null && cursor.moveToFirst()) {
                    int i2 = cursor.getInt(0);
                    if (!f19777a.contains(Integer.valueOf(i2)) || i2 == -1) {
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
    public void mo28785a(Rect rect, Rect rect2) {
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
    public final PointF mo28778a(PointF pointF) {
        return mo28777a(pointF.x, pointF.y, new PointF());
    }

    /* renamed from: a */
    public final PointF mo28775a(float f, float f2) {
        return mo28777a(f, f2, new PointF());
    }

    /* renamed from: a */
    public final PointF mo28777a(float f, float f2, PointF pointF) {
        if (this.f19808i == null) {
            return null;
        }
        pointF.set(m29497c(f), m29500d(f2));
        return pointF;
    }

    /* renamed from: a */
    public PointF mo28776a(float f, float f2, float f3, PointF pointF) {
        PointF b = m29492b(f, f2, f3);
        pointF.set((((float) (getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2))) - b.x) / f3, (((float) (getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2))) - b.y) / f3);
        return pointF;
    }

    /* renamed from: a */
    public float mo28773a(float f) {
        return Math.min(this.f19789J, Math.max(m29511m(), f));
    }

    /* renamed from: a */
    public void mo28789a(String str, Object... objArr) {
        if (this.f19787H) {
            C13479a.m54772d("SubsamplingScaleImageView", String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public final void mo28781a(float f, PointF pointF) {
        this.f19821v = null;
        this.f19802W = Float.valueOf(f);
        this.aa = pointF;
        this.ab = pointF;
        invalidate();
    }

    private int getRequiredRotation() {
        int i = this.f19788I;
        if (i == -1) {
            return this.ae;
        }
        return i;
    }

    /* renamed from: b */
    public final boolean mo28793b() {
        return this.f19822w;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public float getMaximumScale() {
        return getMaxScale();
    }

    public final float getMinScale() {
        return m29511m();
    }

    public float getMinimumScale() {
        return getMinScale();
    }

    public float getScaleFactor() {
        return 1.0f / getMinScale();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$a */
    public static class C7388a {

        /* renamed from: a */
        public float f19829a;

        /* renamed from: b */
        public float f19830b;

        /* renamed from: c */
        public PointF f19831c;

        /* renamed from: d */
        public PointF f19832d;

        /* renamed from: e */
        public PointF f19833e;

        /* renamed from: f */
        public PointF f19834f;

        /* renamed from: g */
        public PointF f19835g;

        /* renamed from: h */
        public long f19836h;

        /* renamed from: i */
        public boolean f19837i;

        /* renamed from: j */
        public int f19838j;

        /* renamed from: k */
        public int f19839k;

        /* renamed from: l */
        public long f19840l;

        /* renamed from: m */
        public AbstractC7392e f19841m;

        private C7388a() {
            this.f19836h = 500;
            this.f19837i = true;
            this.f19838j = 2;
            this.f19839k = 1;
            this.f19840l = System.currentTimeMillis();
        }
    }

    /* renamed from: k */
    private int m29509k() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.ad;
        }
        return this.ac;
    }

    /* renamed from: l */
    private int m29510l() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.ac;
        }
        return this.ad;
    }

    public final PointF getCenter() {
        return mo28775a((float) (getWidth() / 2), (float) (getHeight() / 2));
    }

    public final ImageViewState getState() {
        if (this.f19808i == null || this.ac <= 0 || this.ad <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    /* renamed from: g */
    private boolean m29505g() {
        boolean z;
        if (getWidth() <= 0 || getHeight() <= 0 || this.ac <= 0 || this.ad <= 0 || (this.f19781B == null && !m29504f())) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f19822w && z) {
            m29508j();
            this.f19822w = true;
            mo28794c();
            AbstractC7393f fVar = this.f19823x;
            if (fVar != null) {
                fVar.mo28861b();
            }
        }
        return z;
    }

    /* renamed from: h */
    private boolean m29506h() {
        boolean f = m29504f();
        if (!this.ao && f) {
            m29508j();
            this.ao = true;
            mo28796e();
            AbstractC7393f fVar = this.f19823x;
            if (fVar != null) {
                fVar.mo28650a();
            }
            if (this.ar != null) {
                m29498c(this.f19808i);
                this.ar.onMatrixChanged(this.aF);
            }
        }
        return f;
    }

    /* renamed from: f */
    private boolean m29504f() {
        boolean z = true;
        if (!(this.f19781B == null || this.f19782C)) {
            return true;
        }
        Map<Integer, List<C7396i>> map = this.f19786G;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, List<C7396i>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.f19785F) {
                for (C7396i iVar : entry.getValue()) {
                    if (iVar.f19864d || iVar.f19863c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private void m29507i() {
        if (this.at == null) {
            Paint paint = new Paint();
            this.at = paint;
            paint.setAntiAlias(true);
            this.at.setFilterBitmap(true);
            this.at.setDither(true);
        }
        if ((this.au == null || this.av == null) && this.f19787H) {
            Paint paint2 = new Paint();
            this.au = paint2;
            paint2.setTextSize((float) m29479a(12));
            this.au.setColor(-65281);
            this.au.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.av = paint3;
            paint3.setColor(-65281);
            this.av.setStyle(Paint.Style.STROKE);
            this.av.setStrokeWidth((float) m29479a(1));
        }
    }

    /* renamed from: j */
    private void m29508j() {
        Float f;
        if (getWidth() != 0 && getHeight() != 0 && this.ac > 0 && this.ad > 0) {
            if (!(this.aa == null || (f = this.f19802W) == null)) {
                this.f19806g = f.floatValue();
                if (this.f19808i == null) {
                    this.f19808i = new PointF();
                }
                this.f19808i.x = ((float) (getWidth() / 2)) - (this.f19806g * this.aa.x);
                this.f19808i.y = ((float) (getHeight() / 2)) - (this.f19806g * this.aa.y);
                this.aa = null;
                this.f19802W = null;
                m29501d(true);
                m29499c(true);
            }
            m29501d(false);
        }
    }

    /* renamed from: m */
    private float m29511m() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.f19793N;
        if (i == 2 || i == 4) {
            return Math.max(((float) (getWidth() - paddingLeft)) / ((float) m29509k()), ((float) (getHeight() - paddingBottom)) / ((float) m29510l()));
        }
        if (i == 3) {
            float f = this.f19790K;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                return f;
            }
        }
        return Math.min(((float) (getWidth() - paddingLeft)) / ((float) m29509k()), ((float) (getHeight() - paddingBottom)) / ((float) m29510l()));
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$b */
    public final class C7389b {

        /* renamed from: b */
        private final float f19843b;

        /* renamed from: c */
        private final PointF f19844c;

        /* renamed from: d */
        private final PointF f19845d;

        /* renamed from: e */
        private long f19846e;

        /* renamed from: f */
        private int f19847f;

        /* renamed from: g */
        private int f19848g;

        /* renamed from: h */
        private boolean f19849h;

        /* renamed from: i */
        private boolean f19850i;

        /* renamed from: j */
        private AbstractC7392e f19851j;

        /* renamed from: a */
        public void mo28854a() {
            PointF pointF;
            if (!(SubsamplingScaleImageView.this.f19821v == null || SubsamplingScaleImageView.this.f19821v.f19841m == null)) {
                try {
                    SubsamplingScaleImageView.this.f19821v.f19841m.mo28867c();
                } catch (Exception e) {
                    C13479a.m54773d("SubsamplingScaleImageView", "Error thrown by animation listener", e);
                }
            }
            int paddingLeft = SubsamplingScaleImageView.this.getPaddingLeft() + (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = SubsamplingScaleImageView.this.getPaddingTop() + (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float a = SubsamplingScaleImageView.this.mo28773a(this.f19843b);
            if (this.f19850i) {
                pointF = SubsamplingScaleImageView.this.mo28776a(this.f19844c.x, this.f19844c.y, a, new PointF());
            } else {
                pointF = this.f19844c;
            }
            SubsamplingScaleImageView.this.f19821v = new C7388a();
            SubsamplingScaleImageView.this.f19821v.f19829a = SubsamplingScaleImageView.this.f19806g;
            SubsamplingScaleImageView.this.f19821v.f19830b = a;
            SubsamplingScaleImageView.this.f19821v.f19840l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f19821v.f19833e = pointF;
            SubsamplingScaleImageView.this.f19821v.f19831c = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.f19821v.f19832d = pointF;
            SubsamplingScaleImageView.this.f19821v.f19834f = SubsamplingScaleImageView.this.mo28792b(pointF);
            SubsamplingScaleImageView.this.f19821v.f19835g = new PointF((float) paddingLeft, (float) paddingTop);
            SubsamplingScaleImageView.this.f19821v.f19836h = this.f19846e;
            SubsamplingScaleImageView.this.f19821v.f19837i = this.f19849h;
            SubsamplingScaleImageView.this.f19821v.f19838j = this.f19847f;
            SubsamplingScaleImageView.this.f19821v.f19839k = this.f19848g;
            SubsamplingScaleImageView.this.f19821v.f19840l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.f19821v.f19841m = this.f19851j;
            PointF pointF2 = this.f19845d;
            if (pointF2 != null) {
                float f = pointF2.x - (SubsamplingScaleImageView.this.f19821v.f19831c.x * a);
                float f2 = this.f19845d.y - (SubsamplingScaleImageView.this.f19821v.f19831c.y * a);
                C7395h hVar = new C7395h(a, new PointF(f, f2));
                SubsamplingScaleImageView.this.mo28790a(true, hVar);
                SubsamplingScaleImageView.this.f19821v.f19835g = new PointF(this.f19845d.x + (hVar.f19860b.x - f), this.f19845d.y + (hVar.f19860b.y - f2));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        /* renamed from: a */
        public C7389b mo28852a(long j) {
            this.f19846e = j;
            return this;
        }

        /* renamed from: b */
        public C7389b mo28855b(int i) {
            this.f19848g = i;
            return this;
        }

        /* renamed from: a */
        public C7389b mo28853a(boolean z) {
            this.f19849h = z;
            return this;
        }

        /* renamed from: b */
        public C7389b mo28856b(boolean z) {
            this.f19850i = z;
            return this;
        }

        /* renamed from: a */
        public C7389b mo28851a(int i) {
            if (SubsamplingScaleImageView.f19779c.contains(Integer.valueOf(i))) {
                this.f19847f = i;
                return this;
            }
            throw new IllegalArgumentException("Unknown easing type: " + i);
        }

        private C7389b(PointF pointF) {
            this.f19846e = 500;
            this.f19847f = 2;
            this.f19848g = 1;
            this.f19849h = true;
            this.f19850i = true;
            this.f19843b = SubsamplingScaleImageView.this.f19806g;
            this.f19844c = pointF;
        }

        private C7389b(float f, PointF pointF) {
            this.f19846e = 500;
            this.f19847f = 2;
            this.f19848g = 1;
            this.f19849h = true;
            this.f19850i = true;
            this.f19843b = f;
            this.f19844c = pointF;
        }

        private C7389b(float f, PointF pointF, PointF pointF2) {
            this.f19846e = 500;
            this.f19847f = 2;
            this.f19848g = 1;
            this.f19849h = true;
            this.f19850i = true;
            this.f19843b = f;
            this.f19844c = pointF;
            this.f19845d = pointF2;
        }
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        aD = config;
    }

    public final void setDebug(boolean z) {
        this.f19787H = z;
    }

    public final void setDoubleTapZoomScale(float f) {
        this.f19798S = f;
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.f19797R = z;
    }

    public final void setMaxScale(float f) {
        this.f19789J = f;
    }

    public final void setMinScale(float f) {
        this.f19790K = f;
    }

    public void setOnImageEventListener(AbstractC7393f fVar) {
        this.f19823x = fVar;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f19824y = onLongClickListener;
    }

    public void setOnMatrixChangeListener(AbstractC7356a aVar) {
        this.ar = aVar;
    }

    public void setOnMatrixChangedListener(AbstractC7356a aVar) {
        this.ar = aVar;
    }

    public void setOnScaleEventListener(AbstractC7357b bVar) {
        this.aq = bVar;
    }

    public void setOnStateChangedListener(AbstractC7394g gVar) {
        this.ap = gVar;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.f19805f = z;
    }

    public final void setZoomEnabled(boolean z) {
        this.f19804e = z;
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m29479a(int i) {
        return (int) (this.aC * ((float) i));
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.f19800U = Math.max(0, i);
    }

    public final void setDrivePhotoViewDoubleTapZoomScale(float f) {
        this.f19798S = f / getScaleFactor();
    }

    public void setExecutor(Executor executor) {
        Objects.requireNonNull(executor, "Executor must not be null");
        this.f19796Q = executor;
    }

    public final void setImage(C7399a aVar) {
        mo28787a(aVar, (C7399a) null, (ImageViewState) null);
    }

    public void setMaxTileSize(int i) {
        this.f19794O = i;
        this.f19795P = i;
    }

    /* renamed from: b */
    private void m29496b(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private float m29497c(float f) {
        PointF pointF = this.f19808i;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.f19806g;
    }

    /* renamed from: d */
    private float m29500d(float f) {
        PointF pointF = this.f19808i;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.f19806g;
    }

    /* renamed from: e */
    private float m29502e(float f) {
        PointF pointF = this.f19808i;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f19806g) + pointF.x;
    }

    /* renamed from: f */
    private float m29503f(float f) {
        PointF pointF = this.f19808i;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f19806g) + pointF.y;
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
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.C73862 */

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (!SubsamplingScaleImageView.this.f19804e || !SubsamplingScaleImageView.this.f19822w || SubsamplingScaleImageView.this.f19808i == null) {
                    return super.onDoubleTapEvent(motionEvent);
                }
                SubsamplingScaleImageView.this.setGestureDetector(context);
                if (SubsamplingScaleImageView.this.f19805f) {
                    SubsamplingScaleImageView.this.f19815p = new PointF(motionEvent.getX(), motionEvent.getY());
                    SubsamplingScaleImageView.this.f19809j = new PointF(SubsamplingScaleImageView.this.f19808i.x, SubsamplingScaleImageView.this.f19808i.y);
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    subsamplingScaleImageView.f19807h = subsamplingScaleImageView.f19806g;
                    SubsamplingScaleImageView.this.f19812m = true;
                    SubsamplingScaleImageView.this.f19811l = true;
                    SubsamplingScaleImageView.this.f19816q = -1.0f;
                    SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                    subsamplingScaleImageView2.f19819t = subsamplingScaleImageView2.mo28778a(subsamplingScaleImageView2.f19815p);
                    SubsamplingScaleImageView.this.f19820u = new PointF(motionEvent.getX(), motionEvent.getY());
                    SubsamplingScaleImageView.this.f19818s = new PointF(SubsamplingScaleImageView.this.f19819t.x, SubsamplingScaleImageView.this.f19819t.y);
                    SubsamplingScaleImageView.this.f19817r = false;
                    return false;
                }
                SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                subsamplingScaleImageView3.mo28784a(subsamplingScaleImageView3.mo28778a(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!SubsamplingScaleImageView.this.f19803d || !SubsamplingScaleImageView.this.f19822w || SubsamplingScaleImageView.this.f19808i == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.f19811l))) {
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
                PointF pointF = new PointF(SubsamplingScaleImageView.this.f19808i.x + (f * 0.25f), SubsamplingScaleImageView.this.f19808i.y + (f2 * 0.25f));
                new C7389b(new PointF((((float) (SubsamplingScaleImageView.this.getWidth() / 2)) - pointF.x) / SubsamplingScaleImageView.this.f19806g, (((float) (SubsamplingScaleImageView.this.getHeight() / 2)) - pointF.y) / SubsamplingScaleImageView.this.f19806g)).mo28851a(1).mo28856b(false).mo28855b(3).mo28854a();
                return true;
            }
        });
        this.f175418ai = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.C73873 */

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
            this.aw = null;
        } else {
            Paint paint = new Paint();
            this.aw = paint;
            paint.setStyle(Paint.Style.FILL);
            this.aw.setColor(i);
        }
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$c */
    public static class AsyncTaskC7390c extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private final WeakReference<SubsamplingScaleImageView> f19852a;

        /* renamed from: b */
        private final WeakReference<Context> f19853b;

        /* renamed from: c */
        private final WeakReference<DecoderFactory<? extends ImageDecoder>> f19854c;

        /* renamed from: d */
        private final Uri f19855d;

        /* renamed from: e */
        private final boolean f19856e;

        /* renamed from: f */
        private Bitmap f19857f;

        /* renamed from: g */
        private Exception f19858g;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f19852a.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f19857f;
                if (bitmap == null || num == null) {
                    if (this.f19858g != null && subsamplingScaleImageView.f19823x != null) {
                        if (this.f19856e) {
                            subsamplingScaleImageView.f19823x.mo28862b(this.f19858g);
                        } else {
                            subsamplingScaleImageView.f19823x.mo28651a(this.f19858g);
                        }
                    }
                } else if (this.f19856e) {
                    subsamplingScaleImageView.mo28782a(bitmap);
                } else {
                    subsamplingScaleImageView.mo28783a(bitmap, num.intValue(), false);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            try {
                String uri = this.f19855d.toString();
                Context context = this.f19853b.get();
                DecoderFactory<? extends ImageDecoder> decoderFactory = this.f19854c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f19852a.get();
                if (context == null || decoderFactory == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.mo28789a("BitmapLoadTask.doInBackground", new Object[0]);
                this.f19857f = ((ImageDecoder) decoderFactory.make()).decode(context, this.f19855d);
                return Integer.valueOf(subsamplingScaleImageView.mo28774a(context, uri));
            } catch (Exception e) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to load bitmap", e);
                this.f19858g = e;
                return null;
            } catch (OutOfMemoryError e2) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to load bitmap - OutOfMemoryError", e2);
                this.f19858g = new RuntimeException(e2);
                return null;
            }
        }

        AsyncTaskC7390c(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageDecoder> decoderFactory, Uri uri, boolean z) {
            this.f19852a = new WeakReference<>(subsamplingScaleImageView);
            this.f19853b = new WeakReference<>(context);
            this.f19854c = new WeakReference<>(decoderFactory);
            this.f19855d = uri;
            this.f19856e = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$j */
    public static class AsyncTaskC7397j extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        private final WeakReference<SubsamplingScaleImageView> f19868a;

        /* renamed from: b */
        private final WeakReference<ImageRegionDecoder> f19869b;

        /* renamed from: c */
        private final WeakReference<C7396i> f19870c;

        /* renamed from: d */
        private Exception f19871d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f19868a.get();
            C7396i iVar = this.f19870c.get();
            if (subsamplingScaleImageView != null && iVar != null) {
                if (bitmap != null) {
                    iVar.f19863c = bitmap;
                    iVar.f19864d = false;
                    subsamplingScaleImageView.mo28779a();
                } else if (this.f19871d != null && subsamplingScaleImageView.f19823x != null) {
                    subsamplingScaleImageView.f19823x.mo28864c(this.f19871d);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.f19868a.get();
                ImageRegionDecoder imageRegionDecoder = this.f19869b.get();
                C7396i iVar = this.f19870c.get();
                if (imageRegionDecoder != null && iVar != null && subsamplingScaleImageView != null && imageRegionDecoder.isReady() && iVar.f19865e) {
                    subsamplingScaleImageView.mo28789a("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", iVar.f19861a, Integer.valueOf(iVar.f19862b));
                    subsamplingScaleImageView.f19814o.readLock().lock();
                    try {
                        if (imageRegionDecoder.isReady()) {
                            subsamplingScaleImageView.mo28785a(iVar.f19861a, iVar.f19867g);
                            if (subsamplingScaleImageView.f19810k != null) {
                                iVar.f19867g.offset(subsamplingScaleImageView.f19810k.left, subsamplingScaleImageView.f19810k.top);
                            }
                            return imageRegionDecoder.decodeRegion(iVar.f19867g, iVar.f19862b);
                        }
                        iVar.f19864d = false;
                        subsamplingScaleImageView.f19814o.readLock().unlock();
                        return null;
                    } finally {
                        subsamplingScaleImageView.f19814o.readLock().unlock();
                    }
                } else if (iVar == null) {
                    return null;
                } else {
                    iVar.f19864d = false;
                    return null;
                }
            } catch (Exception e) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to decode tile", e);
                this.f19871d = e;
                return null;
            } catch (OutOfMemoryError e2) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to decode tile - OutOfMemoryError", e2);
                this.f19871d = new RuntimeException(e2);
                return null;
            }
        }

        AsyncTaskC7397j(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, C7396i iVar) {
            this.f19868a = new WeakReference<>(subsamplingScaleImageView);
            this.f19869b = new WeakReference<>(imageRegionDecoder);
            this.f19870c = new WeakReference<>(iVar);
            iVar.f19864d = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$k */
    public static class AsyncTaskC7398k extends AsyncTask<Void, Void, int[]> {

        /* renamed from: a */
        private final WeakReference<SubsamplingScaleImageView> f19872a;

        /* renamed from: b */
        private final WeakReference<Context> f19873b;

        /* renamed from: c */
        private final WeakReference<DecoderFactory<? extends ImageRegionDecoder>> f19874c;

        /* renamed from: d */
        private final Uri f19875d;

        /* renamed from: e */
        private ImageRegionDecoder f19876e;

        /* renamed from: f */
        private Exception f19877f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.f19872a.get();
            if (subsamplingScaleImageView != null) {
                ImageRegionDecoder imageRegionDecoder = this.f19876e;
                if (imageRegionDecoder != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.mo28788a(imageRegionDecoder, iArr[0], iArr[1], iArr[2]);
                } else if (this.f19877f != null && subsamplingScaleImageView.f19823x != null) {
                    subsamplingScaleImageView.f19823x.mo28651a(this.f19877f);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int[] doInBackground(Void... voidArr) {
            try {
                String uri = this.f19875d.toString();
                Context context = this.f19873b.get();
                DecoderFactory<? extends ImageRegionDecoder> decoderFactory = this.f19874c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f19872a.get();
                if (context == null || decoderFactory == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.mo28789a("TilesInitTask.doInBackground", new Object[0]);
                ImageRegionDecoder imageRegionDecoder = (ImageRegionDecoder) decoderFactory.make();
                this.f19876e = imageRegionDecoder;
                Point init = imageRegionDecoder.init(context, this.f19875d);
                int i = init.x;
                int i2 = init.y;
                int a = subsamplingScaleImageView.mo28774a(context, uri);
                if (subsamplingScaleImageView.f19810k != null) {
                    subsamplingScaleImageView.f19810k.left = Math.max(0, subsamplingScaleImageView.f19810k.left);
                    subsamplingScaleImageView.f19810k.top = Math.max(0, subsamplingScaleImageView.f19810k.top);
                    subsamplingScaleImageView.f19810k.right = Math.min(i, subsamplingScaleImageView.f19810k.right);
                    subsamplingScaleImageView.f19810k.bottom = Math.min(i2, subsamplingScaleImageView.f19810k.bottom);
                    i = subsamplingScaleImageView.f19810k.width();
                    i2 = subsamplingScaleImageView.f19810k.height();
                }
                return new int[]{i, i2, a};
            } catch (Exception e) {
                C13479a.m54759a("SubsamplingScaleImageView", "Failed to initialise bitmap decoder", e);
                this.f19877f = e;
                return null;
            }
        }

        AsyncTaskC7398k(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri) {
            this.f19872a = new WeakReference<>(subsamplingScaleImageView);
            this.f19873b = new WeakReference<>(context);
            this.f19874c = new WeakReference<>(decoderFactory);
            this.f19875d = uri;
        }
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (f19778b.contains(Integer.valueOf(i))) {
            this.f19799T = i;
            return;
        }
        throw new IllegalArgumentException("Invalid zoom style: " + i);
    }

    public final void setMinimumScaleType(int i) {
        if (f19776A.contains(Integer.valueOf(i))) {
            this.f19793N = i;
            if (mo28793b()) {
                m29501d(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid scale type: " + i);
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f19791L = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i);
        if (mo28793b()) {
            m29486a(false);
            invalidate();
        }
    }

    public final void setOrientation(int i) {
        if (f19777a.contains(Integer.valueOf(i))) {
            this.f19788I = i;
            m29486a(false);
            invalidate();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i);
    }

    public final void setPanLimit(int i) {
        if (f19780z.contains(Integer.valueOf(i))) {
            this.f19792M = i;
            if (mo28793b()) {
                m29501d(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid pan limit: " + i);
    }

    /* renamed from: a */
    private Point m29480a(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.f19794O), Math.min(canvas.getMaximumBitmapHeight(), this.f19795P));
    }

    /* renamed from: b */
    private int m29491b(float f) {
        int i;
        if (this.f19791L > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= ((float) this.f19791L) / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int k = (int) (((float) m29509k()) * f);
        int l = (int) (((float) m29510l()) * f);
        if (k == 0 || l == 0) {
            return 32;
        }
        int i2 = 1;
        if (m29510l() > l || m29509k() > k) {
            i = Math.round(((float) m29510l()) / ((float) l));
            int round = Math.round(((float) m29509k()) / ((float) k));
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

    /* renamed from: c */
    private void m29498c(PointF pointF) {
        this.aF.left = pointF.x;
        this.aF.top = pointF.y;
        if (getRequiredRotation() == 90 || getRequiredRotation() == 270) {
            this.aF.right = pointF.x + (((float) this.ad) * this.f19806g);
            this.aF.bottom = pointF.y + (((float) this.ac) * this.f19806g);
            return;
        }
        this.aF.right = pointF.x + (((float) this.ac) * this.f19806g);
        this.aF.bottom = pointF.y + (((float) this.ad) * this.f19806g);
    }

    /* renamed from: d */
    private void m29501d(boolean z) {
        boolean z2;
        if (this.f19808i == null) {
            z2 = true;
            this.f19808i = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            z2 = false;
        }
        if (this.ax == null) {
            this.ax = new C7395h(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        }
        this.ax.f19859a = this.f19806g;
        this.ax.f19860b.set(this.f19808i);
        mo28790a(z, this.ax);
        this.f19806g = this.ax.f19859a;
        this.f19808i.set(this.ax.f19860b);
        if (z2 && this.f19793N != 4) {
            this.f19808i.set(m29492b((float) (m29509k() / 2), (float) (m29510l() / 2), this.f19806g));
        }
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.f19803d = z;
        if (!z && (pointF = this.f19808i) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.f19806g * ((float) (m29509k() / 2)));
            this.f19808i.y = ((float) (getHeight() / 2)) - (this.f19806g * ((float) (m29510l() / 2)));
            if (mo28793b()) {
                m29499c(true);
                invalidate();
            }
        }
    }

    /* renamed from: c */
    private void m29499c(boolean z) {
        if (!(this.aj == null || this.f19786G == null)) {
            int min = Math.min(this.f19785F, m29491b(this.f19806g));
            for (Map.Entry<Integer, List<C7396i>> entry : this.f19786G.entrySet()) {
                for (C7396i iVar : entry.getValue()) {
                    if (iVar.f19862b < min || (iVar.f19862b > min && iVar.f19862b != this.f19785F)) {
                        iVar.f19865e = false;
                        if (iVar.f19863c != null) {
                            iVar.f19863c.recycle();
                            iVar.f19863c = null;
                        }
                    }
                    if (iVar.f19862b == min) {
                        if (m29489a(iVar)) {
                            iVar.f19865e = true;
                            if (!iVar.f19864d && iVar.f19863c == null && z) {
                                m29483a(new AsyncTaskC7397j(this, this.aj, iVar));
                            }
                        } else if (iVar.f19862b != this.f19785F) {
                            iVar.f19865e = false;
                            if (iVar.f19863c != null) {
                                iVar.f19863c.recycle();
                                iVar.f19863c = null;
                            }
                        }
                    } else if (iVar.f19862b == this.f19785F) {
                        iVar.f19865e = true;
                    }
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        C7388a aVar = this.f19821v;
        if (aVar == null || aVar.f19837i) {
            C7388a aVar2 = this.f19821v;
            if (!(aVar2 == null || aVar2.f19841m == null)) {
                try {
                    this.f19821v.f19841m.mo28866b();
                } catch (Exception e) {
                    C13479a.m54773d("SubsamplingScaleImageView", "Error thrown by animation listener", e);
                }
            }
            this.f19821v = null;
            if (this.f19808i == null) {
                GestureDetector gestureDetector2 = this.f175418ai;
                if (gestureDetector2 != null) {
                    gestureDetector2.onTouchEvent(motionEvent);
                }
                return true;
            } else if (this.f19812m || ((gestureDetector = this.ah) != null && !gestureDetector.onTouchEvent(motionEvent))) {
                if (this.f19809j == null) {
                    this.f19809j = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.f19801V == null) {
                    this.f19801V = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.f19815p == null) {
                    this.f19815p = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                float f = this.f19806g;
                this.f19801V.set(this.f19808i);
                boolean a = m29488a(motionEvent);
                m29481a(f, this.f19801V, 2);
                if (a || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            } else {
                this.f19811l = false;
                this.ag = false;
                this.f19813n = 0;
                return true;
            }
        } else {
            m29496b(true);
            return true;
        }
    }

    /* renamed from: a */
    private synchronized void m29482a(Point point) {
        mo28789a("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        C7395h hVar = new C7395h(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        this.ax = hVar;
        mo28790a(true, hVar);
        int b = m29491b(this.ax.f19859a);
        this.f19785F = b;
        if (b > 1) {
            this.f19785F = b / 2;
        }
        if (this.f19785F != 1 || this.f19810k != null || m29509k() >= point.x || m29510l() >= point.y) {
            m29493b(point);
            for (C7396i iVar : this.f19786G.get(Integer.valueOf(this.f19785F))) {
                m29483a(new AsyncTaskC7397j(this, this.aj, iVar));
            }
            m29499c(true);
        } else {
            this.aj.recycle();
            this.aj = null;
            m29483a(new AsyncTaskC7390c(this, getContext(), this.ak, this.f19784E, false));
        }
    }

    /* renamed from: b */
    private void m29493b(Point point) {
        boolean z;
        int i;
        int i2;
        int i3 = 1;
        mo28789a("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.f19786G = new LinkedHashMap();
        int i4 = this.f19785F;
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int k = m29509k() / i5;
            int l = m29510l() / i6;
            int i7 = k / i4;
            int i8 = l / i4;
            while (true) {
                if (i7 + i5 + i3 > point.x || (((double) i7) > ((double) getWidth()) * 1.25d && i4 < this.f19785F)) {
                    i5++;
                    k = m29509k() / i5;
                    i7 = k / i4;
                    i3 = 1;
                }
            }
            while (true) {
                if (i8 + i6 + i3 > point.y || (((double) i8) > ((double) getHeight()) * 1.25d && i4 < this.f19785F)) {
                    i6++;
                    l = m29510l() / i6;
                    i8 = l / i4;
                    i3 = 1;
                }
            }
            ArrayList arrayList = new ArrayList(i5 * i6);
            for (int i9 = 0; i9 < i5; i9++) {
                for (int i10 = 0; i10 < i6; i10++) {
                    C7396i iVar = new C7396i();
                    iVar.f19862b = i4;
                    if (i4 == this.f19785F) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iVar.f19865e = z;
                    int i11 = i9 * k;
                    int i12 = i10 * l;
                    if (i9 == i5 - 1) {
                        i = m29509k();
                    } else {
                        i = (i9 + 1) * k;
                    }
                    if (i10 == i6 - 1) {
                        i2 = m29510l();
                    } else {
                        i2 = (i10 + 1) * l;
                    }
                    iVar.f19861a = new Rect(i11, i12, i, i2);
                    iVar.f19866f = new Rect(0, 0, 0, 0);
                    iVar.f19867g = new Rect(iVar.f19861a);
                    arrayList.add(iVar);
                }
            }
            this.f19786G.put(Integer.valueOf(i4), arrayList);
            if (i4 != 1) {
                i4 /= 2;
                i3 = 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m29483a(AsyncTask<Void, Void, ?> asyncTask) {
        asyncTask.executeOnExecutor(this.f19796Q, new Void[0]);
    }

    /* renamed from: a */
    private void m29484a(ImageViewState imageViewState) {
        if (imageViewState != null && f19777a.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            this.f19788I = imageViewState.getOrientation();
            this.f19802W = Float.valueOf(imageViewState.getScale());
            this.aa = imageViewState.getCenter();
            invalidate();
        }
    }

    /* renamed from: b */
    public final PointF mo28792b(PointF pointF) {
        return mo28791b(pointF.x, pointF.y, new PointF());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0392 A[Catch:{ Exception -> 0x0722 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r35) {
        /*
        // Method dump skipped, instructions count: 1843
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.onDraw(android.graphics.Canvas):void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m29486a(boolean z) {
        AbstractC7393f fVar;
        mo28789a("reset newImage=" + z, new Object[0]);
        this.f19806g = BitmapDescriptorFactory.HUE_RED;
        this.f19807h = BitmapDescriptorFactory.HUE_RED;
        this.f19808i = null;
        this.f19809j = null;
        this.f19801V = null;
        this.f19802W = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        this.aa = null;
        this.ab = null;
        this.f19811l = false;
        this.ag = false;
        this.f19812m = false;
        this.f19813n = 0;
        this.f19785F = 0;
        this.f19815p = null;
        this.am = BitmapDescriptorFactory.HUE_RED;
        this.f19816q = BitmapDescriptorFactory.HUE_RED;
        this.f19817r = false;
        this.f19819t = null;
        this.f19818s = null;
        this.f19820u = null;
        this.f19821v = null;
        this.ax = null;
        this.ay = null;
        this.az = null;
        if (z) {
            this.f19784E = null;
            this.f19814o.writeLock().lock();
            try {
                ImageRegionDecoder imageRegionDecoder = this.aj;
                if (imageRegionDecoder != null) {
                    imageRegionDecoder.recycle();
                    this.aj = null;
                }
                this.f19814o.writeLock().unlock();
                Bitmap bitmap = this.f19781B;
                if (bitmap != null && !this.f19783D) {
                    bitmap.recycle();
                }
                if (!(this.f19781B == null || !this.f19783D || (fVar = this.f19823x) == null)) {
                    fVar.mo28863c();
                }
                this.ac = 0;
                this.ad = 0;
                this.ae = 0;
                this.f19810k = null;
                this.af = null;
                this.f19822w = false;
                this.ao = false;
                this.f19781B = null;
                this.f19782C = false;
                this.f19783D = false;
            } catch (Throwable th) {
                this.f19814o.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<C7396i>> map = this.f19786G;
        if (map != null) {
            for (Map.Entry<Integer, List<C7396i>> entry : map.entrySet()) {
                for (C7396i iVar : entry.getValue()) {
                    iVar.f19865e = false;
                    if (iVar.f19863c != null) {
                        iVar.f19863c.recycle();
                        iVar.f19863c = null;
                    }
                }
            }
            this.f19786G = null;
        }
        setGestureDetector(getContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView$h */
    public static class C7395h {

        /* renamed from: a */
        public float f19859a;

        /* renamed from: b */
        public final PointF f19860b;

        private C7395h(float f, PointF pointF) {
            this.f19859a = f;
            this.f19860b = pointF;
        }
    }

    /* renamed from: b */
    private void m29494b(Rect rect, Rect rect2) {
        rect2.set((int) m29502e((float) rect.left), (int) m29503f((float) rect.top), (int) m29502e((float) rect.right), (int) m29503f((float) rect.bottom));
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
                size = m29509k();
                size2 = m29510l();
            } else if (z2) {
                size2 = (int) ((((double) m29510l()) / ((double) m29509k())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) m29509k()) / ((double) m29510l())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        this.f19788I = -1;
        this.f19789J = 2.0f;
        this.f19790K = m29511m();
        this.f19791L = -1;
        this.f19792M = 1;
        this.f19793N = 1;
        this.f19794O = Integer.MAX_VALUE;
        this.f19795P = Integer.MAX_VALUE;
        this.f19796Q = AsyncTask.THREAD_POOL_EXECUTOR;
        this.f19797R = true;
        this.f19803d = true;
        this.f19804e = true;
        this.f19805f = true;
        this.f19798S = 1.0f;
        this.f19799T = 1;
        this.f19800U = ParticipantRepo.f117150c;
        this.f19814o = new ReentrantReadWriteLock(true);
        this.ak = new CompatDecoderFactory(SkiaImageDecoder.class);
        this.al = new CompatDecoderFactory(SkiaImageRegionDecoder.class);
        this.aA = new float[8];
        this.aB = new float[8];
        this.aF = new RectF();
        this.aC = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.as = new Handler(new Handler.Callback() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.C73851 */

            public boolean handleMessage(Message message) {
                if (message.what == 1 && SubsamplingScaleImageView.this.f19824y != null) {
                    SubsamplingScaleImageView.this.f19813n = 0;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.f19824y);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.assetName, R.attr.panEnabled, R.attr.quickScaleEnabled, R.attr.src, R.attr.tileBackgroundColor, R.attr.zoomEnabled});
            if (obtainStyledAttributes.hasValue(0) && (string = obtainStyledAttributes.getString(0)) != null && string.length() > 0) {
                setImage(C7399a.m29567a(string).mo28878a());
            }
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
                setImage(C7399a.m29566a(resourceId).mo28878a());
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
    private void m29481a(float f, PointF pointF, int i) {
        AbstractC7394g gVar = this.ap;
        if (gVar != null) {
            float f2 = this.f19806g;
            if (f2 != f) {
                gVar.mo28868a(f2, i);
            }
        }
        if (this.ap != null && !this.f19808i.equals(pointF)) {
            this.ap.mo28869a(getCenter(), i);
        }
        if (this.ar == null) {
            return;
        }
        if (this.f19806g != f || !this.f19808i.equals(pointF)) {
            m29498c(this.f19808i);
            this.ar.onMatrixChanged(this.aF);
        }
    }

    /* renamed from: b */
    private PointF m29492b(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.ax == null) {
            this.ax = new C7395h(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        }
        this.ax.f19859a = f3;
        this.ax.f19860b.set(((float) paddingLeft) - (f * f3), ((float) paddingTop) - (f2 * f3));
        mo28790a(true, this.ax);
        return this.ax.f19860b;
    }

    /* renamed from: b */
    public final PointF mo28791b(float f, float f2, PointF pointF) {
        if (this.f19808i == null) {
            return null;
        }
        pointF.set(m29502e(f), m29503f(f2));
        return pointF;
    }

    /* renamed from: a */
    private float m29476a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo28789a("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (this.f19822w && center != null) {
            this.f19821v = null;
            this.f19802W = Float.valueOf(this.f19806g);
            this.aa = center;
        }
        if (i4 != 0 && i3 != 0 && this.ar != null) {
            m29501d(true);
            m29498c(this.f19808i);
            this.ar.onMatrixChanged(this.aF);
        }
    }

    /* renamed from: a */
    private float m29477a(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return m29478a(j, f, f2, j2);
        }
        if (i == 2) {
            return m29490b(j, f, f2, j2);
        }
        throw new IllegalStateException("Unexpected easing type: " + i);
    }
}
