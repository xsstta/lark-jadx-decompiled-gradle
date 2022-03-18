package com.ss.android.photoeditor.mosaic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.base.C59614a;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59613d;

/* renamed from: com.ss.android.photoeditor.mosaic.e */
public class C59743e extends AbstractMosaicStrategy {

    /* renamed from: n */
    private Bitmap f148394n;

    /* renamed from: o */
    private Bitmap f148395o;

    /* renamed from: p */
    private Bitmap f148396p;

    /* renamed from: q */
    private Canvas f148397q;

    /* renamed from: r */
    private Paint f148398r = new Paint();

    /* renamed from: s */
    private Path f148399s = new Path();

    /* renamed from: t */
    private int f148400t = C59613d.m231216a(50);

    /* renamed from: u */
    private float f148401u;

    /* renamed from: v */
    private float f148402v;

    /* renamed from: w */
    private boolean f148403w = false;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.mosaic.e$a */
    public static class C59744a extends C59622e.AbstractC59624a {

        /* renamed from: b */
        private RectF f148404b;

        /* renamed from: c */
        private RectF f148405c;

        /* renamed from: d */
        private Path f148406d;

        /* renamed from: e */
        private Paint f148407e;

        /* renamed from: f */
        private Bitmap f148408f;

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public C59622e.C59625b mo203106a(C59622e.C59625b bVar) {
            return bVar;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public RectF mo203105a() {
            return this.f148404b;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: b */
        public RectF mo203109b() {
            return this.f148405c;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: c */
        public Bitmap mo203111c() {
            this.f148407e.setXfermode(null);
            Bitmap createBitmap = Bitmap.createBitmap((int) this.f148405c.width(), (int) this.f148405c.height(), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            Bitmap createBitmap2 = Bitmap.createBitmap((int) this.f148405c.width(), (int) this.f148405c.height(), Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(createBitmap2);
            this.f148407e.setColor(-16776961);
            canvas2.drawPath(this.f148406d, this.f148407e);
            Matrix matrix = new Matrix();
            float width = this.f148404b.width() / ((float) this.f148408f.getWidth());
            matrix.postScale(width, width);
            matrix.postTranslate(this.f148404b.left - this.f148405c.left, this.f148404b.top - this.f148405c.top);
            canvas.drawBitmap(this.f148408f, matrix, null);
            this.f148407e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(createBitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f148407e);
            this.f148407e.setXfermode(null);
            return createBitmap;
        }

        C59744a(RectF rectF, RectF rectF2, Path path, Paint paint, Bitmap bitmap) {
            this.f148404b = new RectF(rectF);
            this.f148405c = new RectF(rectF2);
            this.f148406d = new Path(path);
            this.f148407e = new Paint(paint);
            this.f148408f = bitmap;
        }
    }

    /* renamed from: g */
    private void m231718g() {
        m231719h();
        m231721j();
        this.f148293l.mo203361a(this.f148283b, true);
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: f */
    public void mo203360f() {
        super.mo203360f();
        C59610b.m231208a(this.f148394n);
    }

    /* renamed from: h */
    private void m231719h() {
        if (this.f148394n == null) {
            this.f148394n = Bitmap.createBitmap((int) this.f148288g.width(), (int) this.f148288g.height(), Bitmap.Config.ARGB_4444);
        }
        m231722k();
        Canvas canvas = new Canvas(this.f148394n);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f148398r.setColor(-16776961);
        canvas.drawPath(this.f148399s, this.f148398r);
    }

    /* renamed from: k */
    private void m231722k() {
        this.f148398r.reset();
        this.f148398r.setStyle(Paint.Style.STROKE);
        this.f148398r.setAntiAlias(true);
        this.f148398r.setPathEffect(new CornerPathEffect(10.0f));
        this.f148398r.setStrokeWidth((float) this.f148400t);
        this.f148398r.setStrokeJoin(Paint.Join.ROUND);
        this.f148398r.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: l */
    private void m231723l() {
        C59622e.m231233a().mo203093b(new C59744a(this.f148287f, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) ((int) this.f148288g.width()), (float) ((int) this.f148288g.height())), this.f148399s, this.f148398r, this.f148395o));
    }

    /* renamed from: i */
    private void m231720i() {
        Matrix matrix = new Matrix();
        matrix.setScale(this.f148286e.width() / ((float) this.f148282a.getWidth()), this.f148286e.height() / ((float) this.f148282a.getHeight()));
        Bitmap createBitmap = Bitmap.createBitmap(this.f148282a, 0, 0, this.f148282a.getWidth(), this.f148282a.getHeight(), matrix, true);
        this.f148395o = createBitmap;
        this.f148395o = C59742d.m231712a(createBitmap);
    }

    /* renamed from: j */
    private void m231721j() {
        this.f148284c.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f148397q.drawColor(0, PorterDuff.Mode.CLEAR);
        float width = this.f148286e.width() / this.f148287f.width();
        float f = (BitmapDescriptorFactory.HUE_RED - this.f148287f.left) * width;
        float f2 = (BitmapDescriptorFactory.HUE_RED - this.f148287f.top) * width;
        this.f148292k.reset();
        this.f148292k.postScale(width, width);
        this.f148292k.postTranslate(f, f2);
        this.f148397q.drawBitmap(this.f148394n, this.f148292k, this.f148398r);
        this.f148284c.drawBitmap(this.f148395o, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        this.f148398r.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f148284c.drawBitmap(this.f148396p, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f148398r);
        this.f148398r.setXfermode(null);
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: e */
    public void mo203359e() {
        this.f148283b = Bitmap.createBitmap((int) this.f148286e.width(), (int) this.f148286e.height(), Bitmap.Config.ARGB_4444);
        this.f148284c = new Canvas(this.f148283b);
        this.f148396p = Bitmap.createBitmap((int) this.f148286e.width(), (int) this.f148286e.height(), Bitmap.Config.ARGB_4444);
        this.f148397q = new Canvas(this.f148396p);
        m231720i();
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: a */
    public void mo203346a(int i) {
        this.f148400t = i;
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: a */
    public void mo203347a(Bitmap bitmap) {
        super.mo203347a(bitmap);
    }

    public C59743e(Context context) {
        super(context);
    }

    /* renamed from: b */
    private void m231716b(MotionEvent motionEvent) {
        this.f148399s.reset();
        this.f148399s.moveTo(motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: c */
    private void m231717c(MotionEvent motionEvent) {
        this.f148399s.lineTo(motionEvent.getX(), motionEvent.getY());
        m231718g();
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
                    } else if (this.f148403w || C59614a.m231217a(this.f148294m, this.f148401u, this.f148402v, motionEvent.getX(), motionEvent.getY())) {
                        this.f148403w = true;
                        m231717c(motionEvent);
                        return;
                    } else {
                        return;
                    }
                }
                if (this.f148403w) {
                    m231723l();
                    return;
                }
                return;
            }
            this.f148403w = false;
            this.f148401u = motionEvent.getX();
            this.f148402v = motionEvent.getY();
            m231716b(motionEvent);
        }
    }
}
