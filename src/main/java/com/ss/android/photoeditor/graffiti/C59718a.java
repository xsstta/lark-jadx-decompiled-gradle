package com.ss.android.photoeditor.graffiti;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.base.C59614a;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.p3010b.C59610b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.photoeditor.graffiti.a */
public class C59718a {

    /* renamed from: a */
    boolean f148256a;

    /* renamed from: b */
    int f148257b = 1;

    /* renamed from: c */
    private RectF f148258c;

    /* renamed from: d */
    private RectF f148259d;

    /* renamed from: e */
    private RectF f148260e;

    /* renamed from: f */
    private AbstractC59720b f148261f;

    /* renamed from: g */
    private AbstractC59721c f148262g;

    /* renamed from: h */
    private float f148263h;

    /* renamed from: i */
    private float f148264i;

    /* renamed from: j */
    private Path f148265j;

    /* renamed from: k */
    private Bitmap f148266k;

    /* renamed from: l */
    private Bitmap f148267l;

    /* renamed from: m */
    private Bitmap f148268m;

    /* renamed from: n */
    private Canvas f148269n;

    /* renamed from: o */
    private Canvas f148270o;

    /* renamed from: p */
    private Canvas f148271p;

    /* renamed from: q */
    private Paint f148272q;

    /* renamed from: r */
    private int f148273r;

    /* renamed from: s */
    private int f148274s;

    /* renamed from: t */
    private Matrix f148275t = new Matrix();

    /* renamed from: u */
    private Context f148276u;

    /* renamed from: v */
    private boolean f148277v = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.graffiti.a$b */
    public interface AbstractC59720b {
        /* renamed from: a */
        void mo203328a(Bitmap bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.graffiti.a$c */
    public interface AbstractC59721c {
        /* renamed from: a */
        int mo203329a();

        /* renamed from: b */
        int mo203330b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.graffiti.a$a */
    public static class C59719a extends C59622e.AbstractC59624a {

        /* renamed from: b */
        private Path f148278b;

        /* renamed from: c */
        private Paint f148279c;

        /* renamed from: d */
        private RectF f148280d;

        /* renamed from: e */
        private RectF f148281e;

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public C59622e.C59625b mo203106a(C59622e.C59625b bVar) {
            return bVar;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public RectF mo203105a() {
            return this.f148280d;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: b */
        public RectF mo203109b() {
            return this.f148281e;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: c */
        public Bitmap mo203111c() {
            Bitmap createBitmap = Bitmap.createBitmap((int) this.f148281e.width(), (int) this.f148281e.height(), Bitmap.Config.ARGB_4444);
            new Canvas(createBitmap).drawPath(this.f148278b, this.f148279c);
            return createBitmap;
        }

        C59719a(Path path, Paint paint, RectF rectF, RectF rectF2) {
            this.f148279c = new Paint(paint);
            this.f148278b = path;
            this.f148280d = new RectF(rectF);
            this.f148281e = rectF2;
        }
    }

    /* renamed from: a */
    public int mo203338a() {
        return this.f148273r;
    }

    /* renamed from: b */
    public int mo203342b() {
        return this.f148274s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo203344c() {
        C59610b.m231208a(this.f148267l);
        C59610b.m231208a(this.f148266k);
    }

    /* renamed from: g */
    private void m231599g() {
        this.f148271p.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f148271p.drawBitmap(this.f148267l, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        this.f148271p.drawBitmap(this.f148266k, m231600h(), null);
    }

    /* renamed from: i */
    private void m231601i() {
        this.f148270o.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f148270o.drawPath(this.f148265j, this.f148272q);
    }

    /* renamed from: f */
    private void m231598f() {
        Log.m165379d("GGGGG", "record()");
        C59622e.m231233a().mo203093b(new C59719a(this.f148265j, this.f148272q, this.f148259d, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f148262g.mo203329a(), (float) this.f148262g.mo203330b())));
    }

    /* renamed from: h */
    private Matrix m231600h() {
        this.f148275t.reset();
        float width = this.f148258c.width() / this.f148259d.width();
        float f = this.f148260e.left - (this.f148259d.left * width);
        float f2 = this.f148260e.top - (this.f148259d.top * width);
        this.f148275t.postScale(width, width);
        this.f148275t.postTranslate(f, f2);
        return this.f148275t;
    }

    /* renamed from: d */
    private void m231596d() {
        this.f148273r = 30;
        Paint paint = new Paint();
        this.f148272q = paint;
        paint.setColor(this.f148274s);
        this.f148272q.setStyle(Paint.Style.STROKE);
        this.f148272q.setAntiAlias(true);
        this.f148272q.setFilterBitmap(true);
        this.f148272q.setPathEffect(new CornerPathEffect(10.0f));
        this.f148272q.setStrokeWidth((float) this.f148273r);
        this.f148272q.setStrokeJoin(Paint.Join.ROUND);
        this.f148272q.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: e */
    private void m231597e() {
        if (this.f148262g.mo203329a() == 0 || this.f148262g.mo203330b() == 0) {
            Log.m165389i("GraffitiDrawHelper", "width or height is 0, " + this.f148260e.toShortString());
            return;
        }
        this.f148266k = Bitmap.createBitmap(this.f148262g.mo203329a(), this.f148262g.mo203330b(), Bitmap.Config.ARGB_4444);
        this.f148270o = new Canvas(this.f148266k);
    }

    /* renamed from: j */
    private void m231602j() {
        this.f148275t.reset();
        float width = this.f148258c.width() / this.f148259d.width();
        float f = this.f148260e.left - (this.f148259d.left * width);
        float f2 = this.f148260e.top - (this.f148259d.top * width);
        this.f148275t.postScale(width, width);
        this.f148275t.postTranslate(f, f2);
        this.f148269n.drawBitmap(this.f148266k, this.f148275t, null);
        this.f148270o.drawColor(0, PorterDuff.Mode.CLEAR);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo203341a(MotionEvent motionEvent) {
        m231595b(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo203343b(int i) {
        this.f148274s = i;
        this.f148272q.setColor(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo203339a(int i) {
        this.f148273r = i;
        this.f148272q.setStrokeWidth((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo203340a(Bitmap bitmap) {
        C59610b.m231208a(this.f148267l);
        this.f148267l = Bitmap.createScaledBitmap(bitmap, (int) this.f148258c.width(), (int) this.f148258c.height(), true);
        this.f148269n = new Canvas(this.f148267l);
        this.f148270o.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f148261f.mo203328a(this.f148267l);
    }

    /* renamed from: b */
    private void m231595b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else if (this.f148277v || C59614a.m231217a(this.f148276u, this.f148263h, this.f148264i, motionEvent.getX(), motionEvent.getY())) {
                    this.f148277v = true;
                    this.f148256a = true;
                    if (this.f148264i == BitmapDescriptorFactory.HUE_RED && this.f148263h == BitmapDescriptorFactory.HUE_RED) {
                        this.f148263h = motionEvent.getX();
                        this.f148264i = motionEvent.getY();
                        Path path = new Path();
                        this.f148265j = path;
                        path.moveTo(this.f148263h, this.f148264i);
                    }
                    this.f148265j.lineTo(motionEvent.getX(), motionEvent.getY());
                    m231601i();
                    m231599g();
                    this.f148261f.mo203328a(this.f148268m);
                    return;
                } else {
                    return;
                }
            }
            if (this.f148256a) {
                m231598f();
                m231602j();
                this.f148261f.mo203328a(this.f148267l);
            }
            this.f148256a = false;
            return;
        }
        this.f148256a = false;
        this.f148277v = false;
        this.f148263h = motionEvent.getX();
        this.f148264i = motionEvent.getY();
        Path path2 = new Path();
        this.f148265j = path2;
        path2.moveTo(this.f148263h, this.f148264i);
    }

    C59718a(Context context, RectF rectF, RectF rectF2, AbstractC59720b bVar, AbstractC59721c cVar) {
        this.f148276u = context;
        this.f148258c = rectF;
        this.f148259d = rectF2;
        this.f148261f = bVar;
        this.f148262g = cVar;
        this.f148260e = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) cVar.mo203329a(), (float) cVar.mo203330b());
        m231596d();
        m231597e();
        this.f148265j = new Path();
        if (rectF.width() <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
            Log.m165383e("GraffitiDrawHelper", "imageRect width or height <= 0, " + rectF + rectF2);
            return;
        }
        this.f148267l = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_4444);
        this.f148269n = new Canvas(this.f148267l);
        this.f148268m = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_4444);
        this.f148271p = new Canvas(this.f148268m);
    }
}
