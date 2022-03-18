package com.ss.android.photoeditor.mosaic.v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.base.C59614a;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy;
import com.ss.android.photoeditor.mosaic.C59740b;
import com.ss.android.photoeditor.mosaic.C59742d;
import com.ss.android.photoeditor.mosaic.p3011a.C59739b;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59613d;
import java.util.List;

/* renamed from: com.ss.android.photoeditor.mosaic.v2.c */
public class C59762c extends AbstractMosaicStrategy {

    /* renamed from: A */
    private boolean f148481A;

    /* renamed from: n */
    private Bitmap f148482n;

    /* renamed from: o */
    private Bitmap f148483o;

    /* renamed from: p */
    private Bitmap f148484p;

    /* renamed from: q */
    private Canvas f148485q;

    /* renamed from: r */
    private Paint f148486r;

    /* renamed from: s */
    private Path f148487s;

    /* renamed from: t */
    private float[] f148488t;

    /* renamed from: u */
    private float[] f148489u;

    /* renamed from: v */
    private AbstractMosaicStrategy.Effect f148490v;

    /* renamed from: w */
    private int f148491w;

    /* renamed from: x */
    private float f148492x;

    /* renamed from: y */
    private float f148493y;

    /* renamed from: z */
    private boolean f148494z;

    /* renamed from: com.ss.android.photoeditor.mosaic.v2.c$a */
    public static class C59763a extends C59622e.AbstractC59624a {

        /* renamed from: b */
        protected AbstractMosaicStrategy.SelectionMode f148495b;

        /* renamed from: c */
        protected float[] f148496c = new float[2];

        /* renamed from: d */
        protected float[] f148497d = new float[2];

        /* renamed from: e */
        private boolean f148498e = true;

        /* renamed from: f */
        private final RectF f148499f;

        /* renamed from: g */
        private final RectF f148500g;

        /* renamed from: h */
        private final Path f148501h;

        /* renamed from: i */
        private final Paint f148502i;

        /* renamed from: j */
        private final Bitmap f148503j;

        /* renamed from: k */
        private final AbstractC59760a f148504k;

        /* renamed from: l */
        private C59740b f148505l;

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public C59622e.C59625b mo203106a(C59622e.C59625b bVar) {
            return bVar;
        }

        /* renamed from: j */
        public void mo203450j() {
            this.f148498e = false;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public RectF mo203105a() {
            return this.f148499f;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: b */
        public RectF mo203109b() {
            return this.f148500g;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: e */
        public boolean mo203113e() {
            return this.f148498e;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: h */
        public boolean mo203116h() {
            if (this.f148495b == AbstractMosaicStrategy.SelectionMode.PATH) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: d */
        public void mo203112d() {
            if (this.f148505l == this.f148504k.mo203440a()) {
                this.f148504k.mo203442a((C59740b) null);
            }
            C59740b bVar = this.f148505l;
            if (bVar != null) {
                this.f148504k.mo203448b(bVar).mo203447b();
            }
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: c */
        public Bitmap mo203111c() {
            this.f148502i.setXfermode(null);
            Bitmap createBitmap = Bitmap.createBitmap((int) this.f148500g.width(), (int) this.f148500g.height(), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            Bitmap createBitmap2 = Bitmap.createBitmap((int) this.f148500g.width(), (int) this.f148500g.height(), Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(createBitmap2);
            this.f148502i.setColor(-16776961);
            if (this.f148495b == AbstractMosaicStrategy.SelectionMode.PATH) {
                canvas2.drawPath(this.f148501h, this.f148502i);
            } else if (this.f148495b == AbstractMosaicStrategy.SelectionMode.RECT) {
                canvas2.drawRect(Math.min(this.f148496c[0], this.f148497d[0]), Math.min(this.f148496c[1], this.f148497d[1]), Math.max(this.f148496c[0], this.f148497d[0]), Math.max(this.f148496c[1], this.f148497d[1]), this.f148502i);
            }
            Matrix matrix = new Matrix();
            float width = this.f148499f.width() / ((float) this.f148503j.getWidth());
            matrix.postScale(width, width);
            matrix.postTranslate(this.f148499f.left - this.f148500g.left, this.f148499f.top - this.f148500g.top);
            canvas.drawBitmap(this.f148503j, matrix, null);
            this.f148502i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(createBitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f148502i);
            this.f148502i.setXfermode(null);
            return createBitmap;
        }

        /* renamed from: a */
        public void mo203449a(C59740b bVar) {
            this.f148505l = bVar;
        }

        C59763a(RectF rectF, RectF rectF2, Path path, Paint paint, Bitmap bitmap, AbstractMosaicStrategy.SelectionMode selectionMode, AbstractC59760a aVar) {
            this.f148499f = new RectF(rectF);
            this.f148500g = new RectF(rectF2);
            this.f148501h = new Path(path);
            this.f148502i = new Paint(paint);
            this.f148503j = bitmap;
            this.f148495b = selectionMode;
            this.f148504k = aVar;
            if (selectionMode == AbstractMosaicStrategy.SelectionMode.RECT) {
                PathMeasure pathMeasure = new PathMeasure(path, false);
                float length = pathMeasure.getLength();
                pathMeasure.getPosTan(BitmapDescriptorFactory.HUE_RED, this.f148496c, null);
                pathMeasure.getPosTan(length, this.f148497d, null);
            }
        }
    }

    /* renamed from: g */
    private void m231800g() {
        m231795a(true);
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: f */
    public void mo203360f() {
        super.mo203360f();
        C59610b.m231208a(this.f148482n);
    }

    /* renamed from: l */
    private void m231805l() {
        if (this.f148289h == AbstractMosaicStrategy.SelectionMode.RECT) {
            this.f148285d.mo203444a(this.f148488t, this.f148489u).mo203447b();
        }
    }

    /* renamed from: m */
    private void m231806m() {
        C59763a aVar = new C59763a(this.f148287f, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) ((int) this.f148288g.width()), (float) ((int) this.f148288g.height())), this.f148487s, this.f148486r, this.f148483o, this.f148289h, this.f148285d);
        if (this.f148285d != null) {
            this.f148285d.mo203445a(aVar);
        } else {
            Log.e("NormalMosaicStrategy", "controller is null");
        }
    }

    /* renamed from: i */
    private void m231802i() {
        Matrix matrix = new Matrix();
        matrix.setScale(this.f148286e.width() / ((float) this.f148282a.getWidth()), this.f148286e.height() / ((float) this.f148282a.getHeight()));
        if (this.f148282a != null && !this.f148282a.isRecycled()) {
            this.f148483o = Bitmap.createBitmap(this.f148282a, 0, 0, this.f148282a.getWidth(), this.f148282a.getHeight(), matrix, true);
            if (this.f148490v == AbstractMosaicStrategy.Effect.GAUSSIAN_BLUR) {
                this.f148483o = C59742d.m231711a(this.f148294m, this.f148483o);
            } else {
                this.f148483o = C59742d.m231712a(this.f148483o);
            }
            C59742d.m231714a(this.f148483o, this.f148290i);
        }
    }

    /* renamed from: j */
    private void m231803j() {
        this.f148284c.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f148485q.drawColor(0, PorterDuff.Mode.CLEAR);
        float width = this.f148286e.width() / this.f148287f.width();
        float f = (BitmapDescriptorFactory.HUE_RED - this.f148287f.left) * width;
        float f2 = (BitmapDescriptorFactory.HUE_RED - this.f148287f.top) * width;
        this.f148292k.reset();
        this.f148292k.postScale(width, width);
        this.f148292k.postTranslate(f, f2);
        this.f148485q.drawBitmap(this.f148482n, this.f148292k, this.f148486r);
        this.f148284c.drawBitmap(this.f148483o, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        this.f148486r.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f148284c.drawBitmap(this.f148484p, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f148486r);
        this.f148486r.setXfermode(null);
    }

    /* renamed from: k */
    private void m231804k() {
        this.f148486r.reset();
        if (this.f148289h == AbstractMosaicStrategy.SelectionMode.PATH) {
            this.f148486r.setStyle(Paint.Style.STROKE);
            this.f148486r.setPathEffect(new CornerPathEffect(10.0f));
            this.f148486r.setStrokeWidth((float) this.f148491w);
            this.f148486r.setStrokeJoin(Paint.Join.ROUND);
            this.f148486r.setStrokeCap(Paint.Cap.ROUND);
        } else {
            this.f148486r.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        this.f148486r.setAntiAlias(true);
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: e */
    public void mo203359e() {
        this.f148283b = Bitmap.createBitmap((int) this.f148286e.width(), (int) this.f148286e.height(), Bitmap.Config.ARGB_4444);
        this.f148284c = new Canvas(this.f148283b);
        this.f148484p = Bitmap.createBitmap((int) this.f148286e.width(), (int) this.f148286e.height(), Bitmap.Config.ARGB_4444);
        this.f148485q = new Canvas(this.f148484p);
        m231802i();
        mo203356c();
    }

    /* renamed from: h */
    private void m231801h() {
        if (this.f148482n == null) {
            this.f148482n = Bitmap.createBitmap((int) this.f148288g.width(), (int) this.f148288g.height(), Bitmap.Config.ARGB_4444);
        }
        m231804k();
        Canvas canvas = new Canvas(this.f148482n);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f148486r.setColor(-16776961);
        if (this.f148289h == AbstractMosaicStrategy.SelectionMode.PATH) {
            canvas.drawPath(this.f148487s, this.f148486r);
        } else if (this.f148289h == AbstractMosaicStrategy.SelectionMode.RECT) {
            canvas.drawRect(Math.min(this.f148488t[0], this.f148489u[0]), Math.min(this.f148488t[1], this.f148489u[1]), Math.max(this.f148488t[0], this.f148489u[0]), Math.max(this.f148488t[1], this.f148489u[1]), this.f148486r);
        }
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: a */
    public void mo203346a(int i) {
        this.f148491w = i;
    }

    public C59762c(Context context) {
        this(context, AbstractMosaicStrategy.Effect.NORMAL_MOSAIC);
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: a */
    public void mo203347a(Bitmap bitmap) {
        super.mo203347a(bitmap);
    }

    /* renamed from: a */
    private void m231795a(boolean z) {
        m231801h();
        m231803j();
        this.f148293l.mo203361a(this.f148283b, z);
    }

    /* renamed from: d */
    private void m231798d(MotionEvent motionEvent) {
        this.f148481A = false;
        C59740b a = this.f148285d.mo203440a();
        if (a != null && this.f148285d.mo203446a(a, motionEvent.getX(), motionEvent.getY())) {
            this.f148481A = true;
        }
    }

    /* renamed from: b */
    private void m231796b(MotionEvent motionEvent) {
        this.f148487s.reset();
        this.f148487s.moveTo(motionEvent.getX(), motionEvent.getY());
        this.f148488t[0] = motionEvent.getX();
        this.f148488t[1] = motionEvent.getY();
        this.f148489u[0] = motionEvent.getX();
        this.f148489u[1] = motionEvent.getY();
        m231798d(motionEvent);
    }

    /* renamed from: c */
    private void m231797c(MotionEvent motionEvent) {
        this.f148487s.lineTo(motionEvent.getX(), motionEvent.getY());
        this.f148489u[0] = motionEvent.getX();
        this.f148489u[1] = motionEvent.getY();
        m231795a(false);
        m231805l();
    }

    /* renamed from: e */
    private void m231799e(MotionEvent motionEvent) {
        if (this.f148481A) {
            m231793a(motionEvent.getX(), motionEvent.getY());
        } else {
            m231794a(this.f148285d.mo203440a(), motionEvent.getX(), motionEvent.getY());
        }
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: a */
    public void mo203349a(MotionEvent motionEvent) {
        if (this.f148282a != null && this.f148283b != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return;
                        }
                    } else if (this.f148494z || C59614a.m231217a(this.f148294m, this.f148492x, this.f148493y, motionEvent.getX(), motionEvent.getY())) {
                        this.f148494z = true;
                        m231797c(motionEvent);
                        return;
                    } else {
                        return;
                    }
                }
                if (this.f148494z) {
                    m231800g();
                    m231806m();
                    return;
                }
                m231799e(motionEvent);
                return;
            }
            this.f148494z = false;
            this.f148492x = motionEvent.getX();
            this.f148493y = motionEvent.getY();
            m231796b(motionEvent);
        }
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: a */
    public void mo203353a(List<C59739b> list) {
        super.mo203353a(list);
        if (mo203358d()) {
            m231802i();
        }
    }

    /* renamed from: a */
    private void m231793a(float f, float f2) {
        C59740b a = this.f148285d.mo203440a();
        if (a != null && this.f148285d.mo203446a(a, f, f2)) {
            this.f148285d.mo203448b(a).mo203442a((C59740b) null).mo203447b();
        }
    }

    public C59762c(Context context, AbstractMosaicStrategy.Effect effect) {
        super(context);
        this.f148491w = C59613d.m231216a(50);
        this.f148494z = false;
        this.f148481A = false;
        this.f148487s = new Path();
        this.f148488t = new float[2];
        this.f148489u = new float[2];
        this.f148486r = new Paint();
        this.f148289h = AbstractMosaicStrategy.SelectionMode.RECT;
        this.f148490v = effect;
    }

    /* renamed from: a */
    private void m231794a(C59740b bVar, float f, float f2) {
        C59740b a = this.f148285d.mo203441a(f, f2);
        if (a != null) {
            this.f148285d.mo203443a(a, true).mo203442a(a).mo203447b();
        } else if (bVar != null) {
            this.f148285d.mo203442a((C59740b) null).mo203447b();
        }
    }
}
