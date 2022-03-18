package com.ss.android.photoeditor.mosaic.v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.base.C59627f;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy;
import com.ss.android.photoeditor.mosaic.C59740b;
import com.ss.android.photoeditor.mosaic.v2.C59762c;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59611c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MosaicViewV2 extends AppCompatImageView {

    /* renamed from: A */
    private C59622e.AbstractC59624a f148439A;

    /* renamed from: a */
    RectF f148440a;

    /* renamed from: b */
    boolean f148441b;

    /* renamed from: c */
    public AbstractMosaicStrategy f148442c;

    /* renamed from: d */
    public Bitmap f148443d;

    /* renamed from: e */
    public Bitmap f148444e;

    /* renamed from: f */
    public Canvas f148445f;

    /* renamed from: g */
    public Bitmap f148446g;

    /* renamed from: h */
    public Canvas f148447h;

    /* renamed from: i */
    public RectF f148448i;

    /* renamed from: j */
    public C59761b f148449j;

    /* renamed from: k */
    public Bitmap f148450k;

    /* renamed from: l */
    public Canvas f148451l;

    /* renamed from: m */
    public C59740b f148452m;

    /* renamed from: n */
    public Map<C59740b, C59762c.C59763a> f148453n;

    /* renamed from: o */
    public List<C59740b> f148454o;

    /* renamed from: p */
    public RectF f148455p;

    /* renamed from: q */
    public C59627f f148456q;

    /* renamed from: r */
    public RectF f148457r;

    /* renamed from: s */
    public boolean f148458s;

    /* renamed from: t */
    private AbstractC59760a f148459t;

    /* renamed from: u */
    private int f148460u;

    /* renamed from: v */
    private Matrix f148461v;

    /* renamed from: w */
    private AbstractC59758a f148462w;

    /* renamed from: x */
    private float[] f148463x;

    /* renamed from: y */
    private AbstractMosaicStrategy.AbstractC59722a f148464y;

    /* renamed from: z */
    private Runnable f148465z;

    /* renamed from: com.ss.android.photoeditor.mosaic.v2.MosaicViewV2$a */
    public interface AbstractC59758a {
        /* renamed from: a */
        void mo203416a(MotionEvent motionEvent);
    }

    public RectF getLocation() {
        return this.f148455p;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.mosaic.v2.MosaicViewV2$b */
    public class C59759b implements AbstractC59760a {

        /* renamed from: b */
        private boolean f148475b;

        /* renamed from: c */
        private C59740b f148476c;

        @Override // com.ss.android.photoeditor.mosaic.v2.AbstractC59760a
        /* renamed from: a */
        public C59740b mo203440a() {
            return MosaicViewV2.this.f148452m;
        }

        @Override // com.ss.android.photoeditor.mosaic.v2.AbstractC59760a
        /* renamed from: b */
        public AbstractC59760a mo203447b() {
            if (this.f148475b) {
                MosaicViewV2.this.mo203424a(true);
            }
            this.f148475b = false;
            MosaicViewV2.this.invalidate();
            return this;
        }

        public C59759b() {
        }

        /* renamed from: a */
        private float m231773a(float f) {
            return (f - MosaicViewV2.this.f148455p.left) * (MosaicViewV2.this.f148448i.width() / MosaicViewV2.this.f148455p.width());
        }

        /* renamed from: b */
        private float m231774b(float f) {
            return (f - MosaicViewV2.this.f148455p.top) * (MosaicViewV2.this.f148448i.height() / MosaicViewV2.this.f148455p.height());
        }

        @Override // com.ss.android.photoeditor.mosaic.v2.AbstractC59760a
        /* renamed from: a */
        public AbstractC59760a mo203442a(C59740b bVar) {
            if (bVar != MosaicViewV2.this.f148452m) {
                this.f148475b = true;
                if (MosaicViewV2.this.f148452m != null) {
                    MosaicViewV2.this.f148452m.mo203397a(false);
                }
                MosaicViewV2.this.f148452m = bVar;
            }
            return this;
        }

        @Override // com.ss.android.photoeditor.mosaic.v2.AbstractC59760a
        /* renamed from: b */
        public AbstractC59760a mo203448b(C59740b bVar) {
            if (bVar != null) {
                MosaicViewV2.this.f148454o.remove(bVar);
                if (MosaicViewV2.this.f148453n.containsKey(bVar)) {
                    C59762c.C59763a aVar = MosaicViewV2.this.f148453n.get(bVar);
                    if (aVar != null) {
                        aVar.mo203450j();
                        C59622e.m231233a().mo203095c(aVar);
                        C59622e.C59625b k = C59622e.m231233a().mo203103k();
                        k.mo203122b(aVar);
                        MosaicViewV2.this.mo203422a(k);
                    }
                    MosaicViewV2.this.f148453n.remove(bVar);
                }
                if (MosaicViewV2.this.f148452m == bVar) {
                    this.f148475b = true;
                    MosaicViewV2.this.f148452m = null;
                }
            }
            return this;
        }

        @Override // com.ss.android.photoeditor.mosaic.v2.AbstractC59760a
        /* renamed from: a */
        public void mo203445a(C59762c.C59763a aVar) {
            if (!aVar.mo203116h()) {
                C59740b bVar = new C59740b(MosaicViewV2.this, m231773a(aVar.f148496c[0]), m231774b(aVar.f148496c[1]), m231773a(aVar.f148497d[0]), m231774b(aVar.f148497d[1]), MosaicViewV2.this.f148448i.width() / MosaicViewV2.this.f148455p.width(), 0);
                aVar.mo203449a(bVar);
                MosaicViewV2.this.f148454o.add(bVar);
                MosaicViewV2.this.f148453n.put(bVar, aVar);
                mo203443a(bVar, true).mo203442a(bVar).mo203447b();
                this.f148476c = null;
            }
            C59622e.m231233a().mo203093b(aVar);
        }

        @Override // com.ss.android.photoeditor.mosaic.v2.AbstractC59760a
        /* renamed from: a */
        public AbstractC59760a mo203443a(C59740b bVar, boolean z) {
            bVar.mo203397a(z);
            this.f148475b = true;
            return this;
        }

        @Override // com.ss.android.photoeditor.mosaic.v2.AbstractC59760a
        /* renamed from: a */
        public C59740b mo203441a(float f, float f2) {
            float a = m231773a(f);
            float b = m231774b(f2);
            for (int size = MosaicViewV2.this.f148454o.size() - 1; size >= 0; size--) {
                C59740b bVar = MosaicViewV2.this.f148454o.get(size);
                if (bVar.mo203398a(a, b)) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.ss.android.photoeditor.mosaic.v2.AbstractC59760a
        /* renamed from: a */
        public AbstractC59760a mo203444a(float[] fArr, float[] fArr2) {
            float width = MosaicViewV2.this.f148448i.width() / MosaicViewV2.this.f148455p.width();
            C59740b bVar = this.f148476c;
            if (bVar == null) {
                this.f148476c = new C59740b(MosaicViewV2.this, m231773a(fArr[0]), m231774b(fArr[1]), m231773a(fArr2[0]), m231774b(fArr2[1]), width, 0);
            } else {
                bVar.mo203393a(m231773a(fArr[0]), m231774b(fArr[1]), m231773a(fArr2[0]), m231774b(fArr2[1]), width, 0);
            }
            this.f148476c.mo203397a(true);
            mo203442a(this.f148476c);
            this.f148475b = true;
            return this;
        }

        @Override // com.ss.android.photoeditor.mosaic.v2.AbstractC59760a
        /* renamed from: a */
        public boolean mo203446a(C59740b bVar, float f, float f2) {
            return bVar.mo203400b(m231773a(f), m231774b(f2));
        }
    }

    /* renamed from: d */
    public void mo203427d() {
        this.f148439A = C59622e.m231233a().mo203097e();
    }

    /* renamed from: f */
    public void mo203429f() {
        C59610b.m231208a(this.f148443d);
        AbstractMosaicStrategy abstractMosaicStrategy = this.f148442c;
        if (abstractMosaicStrategy != null) {
            abstractMosaicStrategy.mo203360f();
        }
    }

    /* renamed from: e */
    public void mo203428e() {
        C59622e.AbstractC59624a h = C59622e.m231233a().mo203100h();
        C59622e.C59625b k = C59622e.m231233a().mo203103k();
        if (h != null) {
            k.mo203122b(h);
        }
        mo203422a(k);
    }

    /* renamed from: g */
    private void m231757g() {
        setBackgroundColor(-16777216);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f148461v = new Matrix();
        this.f148459t = new C59759b();
        this.f148454o = new ArrayList();
        this.f148453n = new HashMap();
        this.f148448i = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        this.f148455p = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
    }

    /* renamed from: b */
    public void mo203425b() {
        RectF rectF = this.f148440a;
        if (rectF == null) {
            return;
        }
        if (!this.f148441b) {
            this.f148456q.mo203129a(new RectF(this.f148440a), this.f148457r);
            this.f148440a = null;
            return;
        }
        this.f148455p.set(rectF);
        this.f148440a = null;
    }

    private Bitmap getStrategyBaseBmp() {
        C59622e.C59625b f = C59622e.m231233a().mo203098f();
        RectF rectF = new RectF(f.f147996b);
        RectF rectF2 = new RectF(f.f147995a);
        float width = ((float) f.mo203118a().getWidth()) / rectF.width();
        C59610b.m231211a(rectF, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
        C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF2.width(), (int) rectF2.height(), Bitmap.Config.ARGB_4444);
        float f2 = rectF.top - rectF2.top;
        new Canvas(createBitmap).drawBitmap(f.mo203118a(), rectF.left - rectF2.left, f2, (Paint) null);
        Matrix matrix = new Matrix();
        matrix.postRotate((float) f.mo203123c());
        return Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
    }

    public RectF getImageRect() {
        RectF rectF = new RectF();
        float width = (float) getWidth();
        float height = (float) getHeight();
        Matrix imageMatrix = getImageMatrix();
        int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * m231753a(imageMatrix, 0));
        int intrinsicHeight = (int) (((float) getDrawable().getIntrinsicHeight()) * m231753a(imageMatrix, 4));
        if (Math.abs(((float) intrinsicWidth) - width) < 3.0f) {
            if (intrinsicHeight <= 0) {
                intrinsicHeight = 1;
            }
            if (width <= BitmapDescriptorFactory.HUE_RED) {
                width = 1.0f;
            }
            float f = (float) intrinsicHeight;
            float f2 = (height - f) / 2.0f;
            rectF.set(BitmapDescriptorFactory.HUE_RED, (float) ((int) f2), (float) ((int) width), (float) ((int) (f2 + f)));
        } else {
            if (intrinsicWidth <= 0) {
                intrinsicWidth = 1;
            }
            if (height <= BitmapDescriptorFactory.HUE_RED) {
                height = 1.0f;
            }
            float f3 = (float) intrinsicWidth;
            float f4 = (width - f3) / 2.0f;
            rectF.set((float) ((int) f4), BitmapDescriptorFactory.HUE_RED, (float) ((int) (f4 + f3)), (float) ((int) height));
        }
        return rectF;
    }

    /* renamed from: a */
    public void mo203419a() {
        Bitmap g = C59622e.m231233a().mo203099g();
        setImageBitmap(g);
        if (C59622e.m231233a().mo203091a(this.f148439A)) {
            C59611c.m231214a(this, new Runnable() {
                /* class com.ss.android.photoeditor.mosaic.v2.MosaicViewV2.RunnableC597563 */

                public void run() {
                    MosaicViewV2.this.f148457r.set(MosaicViewV2.this.getImageRect());
                    MosaicViewV2.this.f148455p.set(MosaicViewV2.this.f148457r);
                    MosaicViewV2.this.f148448i = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, MosaicViewV2.this.f148457r.width(), MosaicViewV2.this.f148457r.height());
                    MosaicViewV2 mosaicViewV2 = MosaicViewV2.this;
                    mosaicViewV2.f148450k = Bitmap.createBitmap((int) mosaicViewV2.f148448i.width(), (int) MosaicViewV2.this.f148448i.height(), Bitmap.Config.ARGB_4444);
                    MosaicViewV2.this.f148451l = new Canvas(MosaicViewV2.this.f148450k);
                    MosaicViewV2 mosaicViewV22 = MosaicViewV2.this;
                    mosaicViewV22.f148444e = Bitmap.createScaledBitmap(mosaicViewV22.f148443d, (int) MosaicViewV2.this.f148457r.width(), (int) MosaicViewV2.this.f148457r.height(), true);
                    MosaicViewV2.this.f148445f = new Canvas(MosaicViewV2.this.f148444e);
                    MosaicViewV2 mosaicViewV23 = MosaicViewV2.this;
                    mosaicViewV23.f148446g = Bitmap.createBitmap(mosaicViewV23.f148444e);
                    MosaicViewV2.this.f148447h = new Canvas(MosaicViewV2.this.f148446g);
                    MosaicViewV2 mosaicViewV24 = MosaicViewV2.this;
                    mosaicViewV24.setStrategy(mosaicViewV24.f148442c);
                    MosaicViewV2.this.mo203426c();
                    MosaicViewV2.this.mo203425b();
                }
            });
            invalidate();
            return;
        }
        this.f148444e = Bitmap.createScaledBitmap(g, (int) this.f148457r.width(), (int) this.f148457r.height(), true);
        this.f148445f = new Canvas(this.f148444e);
        this.f148446g = Bitmap.createBitmap(this.f148444e);
        this.f148447h = new Canvas(this.f148446g);
        setStrategy(this.f148442c);
        mo203425b();
        invalidate();
    }

    /* renamed from: c */
    public void mo203426c() {
        float f;
        float f2;
        float f3;
        float f4;
        C59622e.C59625b f5 = C59622e.m231233a().mo203098f();
        RectF rectF = new RectF(f5.f147995a);
        RectF rectF2 = new RectF(f5.f147996b);
        RectF rectF3 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f148457r.width(), this.f148457r.height());
        int i = f5.f147997c;
        RectF rectF4 = new RectF(this.f148449j.f148477a);
        RectF rectF5 = new RectF(this.f148449j.f148478b);
        RectF rectF6 = new RectF(this.f148449j.f148480d);
        int i2 = this.f148449j.f148479c;
        this.f148449j.f148477a = new RectF(rectF);
        this.f148449j.f148478b = new RectF(rectF2);
        this.f148449j.f148479c = i;
        this.f148449j.f148480d = new RectF(rectF3);
        if ((i2 / 90) % 2 == 0) {
            f2 = rectF4.width();
            f = rectF6.width();
        } else {
            f2 = rectF4.height();
            f = rectF6.width();
        }
        float f6 = f2 / f;
        C59610b.m231211a(rectF6, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f6);
        m231755a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f6);
        int i3 = -i2;
        C59610b.m231213a(rectF6, i3, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
        m231756a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i3);
        float centerX = rectF4.centerX() - rectF6.centerX();
        float centerY = rectF4.centerY() - rectF6.centerY();
        rectF6.offset(centerX, centerY);
        m231754a(centerX, centerY);
        float width = rectF2.width() / rectF5.width();
        C59610b.m231211a(rectF4, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
        C59610b.m231211a(rectF5, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
        m231755a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width);
        float f7 = rectF2.left - rectF5.left;
        float f8 = rectF2.top - rectF5.top;
        rectF4.offset(f7, f8);
        rectF5.offset(f7, f8);
        m231754a(f7, f8);
        if ((i / 90) % 2 == 0) {
            f4 = rectF3.width();
            f3 = rectF.width();
        } else {
            f4 = rectF3.height();
            f3 = rectF.width();
        }
        float f9 = f4 / f3;
        C59610b.m231211a(rectF, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f9);
        C59610b.m231211a(rectF4, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f9);
        m231755a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f9);
        C59610b.m231213a(rectF, i, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
        C59610b.m231213a(rectF4, i, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
        m231756a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i);
        float centerX2 = rectF3.centerX() - rectF.centerX();
        float centerY2 = rectF3.centerY() - rectF.centerY();
        rectF.offset(centerX2, centerY2);
        rectF4.offset(centerX2, centerY2);
        m231754a(centerX2, centerY2);
        mo203424a(true);
    }

    public void setMotionEventListener(AbstractC59758a aVar) {
        this.f148462w = aVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(-16777216);
        mo203420a(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f148443d = bitmap;
        AbstractMosaicStrategy abstractMosaicStrategy = this.f148442c;
        if (abstractMosaicStrategy != null) {
            abstractMosaicStrategy.mo203347a(bitmap);
        }
    }

    public void setPaintSize(int i) {
        this.f148460u = i;
        AbstractMosaicStrategy abstractMosaicStrategy = this.f148442c;
        if (abstractMosaicStrategy != null) {
            abstractMosaicStrategy.mo203346a(i);
        }
    }

    public MosaicViewV2(Context context) {
        super(context);
        this.f148463x = new float[9];
        this.f148464y = new AbstractMosaicStrategy.AbstractC59722a() {
            /* class com.ss.android.photoeditor.mosaic.v2.MosaicViewV2.C597521 */

            @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy.AbstractC59722a
            /* renamed from: a */
            public void mo203361a(Bitmap bitmap, boolean z) {
                if (MosaicViewV2.this.f148446g == null) {
                    MosaicViewV2 mosaicViewV2 = MosaicViewV2.this;
                    mosaicViewV2.f148446g = Bitmap.createBitmap(mosaicViewV2.f148444e);
                    MosaicViewV2.this.f148447h = new Canvas(MosaicViewV2.this.f148446g);
                }
                MosaicViewV2.this.f148447h.drawColor(0, PorterDuff.Mode.CLEAR);
                if (z) {
                    MosaicViewV2.this.f148445f.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, MosaicViewV2.this.f148444e.getWidth(), MosaicViewV2.this.f148444e.getHeight()), (Paint) null);
                } else {
                    MosaicViewV2.this.f148447h.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, MosaicViewV2.this.f148446g.getWidth(), MosaicViewV2.this.f148446g.getHeight()), (Paint) null);
                }
                MosaicViewV2.this.invalidate();
            }
        };
        m231757g();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f148458s) {
            return true;
        }
        this.f148456q.mo203130a(motionEvent);
        AbstractC59758a aVar = this.f148462w;
        if (aVar == null) {
            return true;
        }
        aVar.mo203416a(motionEvent);
        return true;
    }

    public void setStrategy(AbstractMosaicStrategy abstractMosaicStrategy) {
        this.f148442c = abstractMosaicStrategy;
        abstractMosaicStrategy.mo203348a(this.f148457r);
        this.f148442c.mo203352a(this.f148459t);
        this.f148442c.mo203351a(this.f148464y);
        this.f148442c.mo203347a(getStrategyBaseBmp());
        this.f148442c.mo203346a(this.f148460u);
        this.f148442c.mo203354b(this.f148455p);
        this.f148442c.mo203357c(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()));
        this.f148442c.mo203359e();
    }

    /* renamed from: a */
    public void mo203420a(Canvas canvas) {
        C59610b.m231209a(this.f148461v, this.f148444e, this.f148455p);
        canvas.drawBitmap(this.f148444e, this.f148461v, null);
        Bitmap bitmap = this.f148446g;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f148461v, null);
        }
        Bitmap bitmap2 = this.f148450k;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, this.f148461v, null);
        }
    }

    /* renamed from: a */
    public void mo203422a(C59622e.C59625b bVar) {
        final Bitmap g = C59622e.m231233a().mo203099g();
        setImageBitmap(g);
        if (bVar.f147998d) {
            C59611c.m231214a(this, new Runnable() {
                /* class com.ss.android.photoeditor.mosaic.v2.MosaicViewV2.RunnableC597574 */

                public void run() {
                    MosaicViewV2.this.f148457r.set(MosaicViewV2.this.getImageRect());
                    MosaicViewV2.this.f148455p.set(MosaicViewV2.this.f148457r);
                    MosaicViewV2.this.f148448i = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, MosaicViewV2.this.f148457r.width(), MosaicViewV2.this.f148457r.height());
                    MosaicViewV2 mosaicViewV2 = MosaicViewV2.this;
                    mosaicViewV2.f148450k = Bitmap.createBitmap((int) mosaicViewV2.f148448i.width(), (int) MosaicViewV2.this.f148448i.height(), Bitmap.Config.ARGB_4444);
                    MosaicViewV2.this.f148451l = new Canvas(MosaicViewV2.this.f148450k);
                    MosaicViewV2 mosaicViewV22 = MosaicViewV2.this;
                    mosaicViewV22.f148444e = Bitmap.createScaledBitmap(g, (int) mosaicViewV22.f148457r.width(), (int) MosaicViewV2.this.f148457r.height(), true);
                    MosaicViewV2.this.f148445f = new Canvas(MosaicViewV2.this.f148444e);
                    MosaicViewV2 mosaicViewV23 = MosaicViewV2.this;
                    mosaicViewV23.f148446g = Bitmap.createBitmap(mosaicViewV23.f148444e);
                    MosaicViewV2.this.f148447h = new Canvas(MosaicViewV2.this.f148446g);
                    MosaicViewV2 mosaicViewV24 = MosaicViewV2.this;
                    mosaicViewV24.setStrategy(mosaicViewV24.f148442c);
                    MosaicViewV2.this.mo203426c();
                }
            });
            invalidate();
            return;
        }
        this.f148444e = Bitmap.createScaledBitmap(g, (int) this.f148457r.width(), (int) this.f148457r.height(), true);
        this.f148445f = new Canvas(this.f148444e);
        this.f148446g = Bitmap.createBitmap(this.f148444e);
        this.f148447h = new Canvas(this.f148446g);
        setStrategy(this.f148442c);
        invalidate();
    }

    /* renamed from: a */
    public void mo203423a(final Runnable runnable) {
        this.f148465z = runnable;
        C59611c.m231214a(this, new Runnable() {
            /* class com.ss.android.photoeditor.mosaic.v2.MosaicViewV2.RunnableC597532 */

            public void run() {
                MosaicViewV2 mosaicViewV2 = MosaicViewV2.this;
                mosaicViewV2.f148457r = mosaicViewV2.getImageRect();
                MosaicViewV2.this.f148455p = new RectF(MosaicViewV2.this.f148457r);
                MosaicViewV2.this.f148448i = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, MosaicViewV2.this.f148457r.width(), MosaicViewV2.this.f148457r.height());
                MosaicViewV2 mosaicViewV22 = MosaicViewV2.this;
                mosaicViewV22.f148444e = Bitmap.createScaledBitmap(mosaicViewV22.f148443d, (int) MosaicViewV2.this.f148457r.width(), (int) MosaicViewV2.this.f148457r.height(), true);
                MosaicViewV2.this.f148445f = new Canvas(MosaicViewV2.this.f148444e);
                MosaicViewV2 mosaicViewV23 = MosaicViewV2.this;
                mosaicViewV23.f148446g = Bitmap.createBitmap(mosaicViewV23.f148444e);
                MosaicViewV2.this.f148447h = new Canvas(MosaicViewV2.this.f148446g);
                MosaicViewV2 mosaicViewV24 = MosaicViewV2.this;
                mosaicViewV24.f148456q = new C59627f(mosaicViewV24.f148457r, MosaicViewV2.this.f148455p, new C59627f.AbstractC59633b() {
                    /* class com.ss.android.photoeditor.mosaic.v2.MosaicViewV2.RunnableC597532.C597541 */

                    @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59633b
                    /* renamed from: a */
                    public void mo203136a(RectF rectF) {
                        MosaicViewV2.this.f148455p.set(rectF);
                        MosaicViewV2.this.f148448i.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, MosaicViewV2.this.f148457r.width(), MosaicViewV2.this.f148457r.height());
                        MosaicViewV2.this.invalidate();
                    }
                }, new C59627f.AbstractC59634c() {
                    /* class com.ss.android.photoeditor.mosaic.v2.MosaicViewV2.RunnableC597532.C597552 */

                    @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59634c
                    /* renamed from: a */
                    public void mo203139a(MotionEvent motionEvent) {
                        if (MosaicViewV2.this.f148442c != null) {
                            HitPointHelper.f147964l.mo203046b(true);
                            MosaicViewV2.this.f148442c.mo203349a(motionEvent);
                        }
                    }
                });
                MosaicViewV2.this.f148458s = true;
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                C59622e.C59625b f = C59622e.m231233a().mo203098f();
                MosaicViewV2.this.f148449j = new C59761b();
                MosaicViewV2.this.f148449j.f148477a = new RectF(f.f147995a);
                MosaicViewV2.this.f148449j.f148478b = new RectF(f.f147996b);
                MosaicViewV2.this.f148449j.f148479c = f.f147997c;
                MosaicViewV2.this.f148449j.f148480d = new RectF(MosaicViewV2.this.f148448i);
                MosaicViewV2.this.mo203425b();
            }
        });
    }

    /* renamed from: a */
    public void mo203424a(boolean z) {
        C59740b bVar;
        if (this.f148450k == null) {
            this.f148450k = Bitmap.createBitmap(this.f148444e);
            this.f148451l = new Canvas(this.f148450k);
        }
        this.f148451l.drawColor(0, PorterDuff.Mode.CLEAR);
        if (z && (bVar = this.f148452m) != null) {
            bVar.mo203396a(this.f148451l);
        }
    }

    /* renamed from: a */
    public void mo203421a(RectF rectF, boolean z) {
        this.f148440a = rectF;
        this.f148441b = z;
    }

    /* renamed from: a */
    private float m231753a(Matrix matrix, int i) {
        matrix.getValues(this.f148463x);
        return this.f148463x[i];
    }

    public MosaicViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148463x = new float[9];
        this.f148464y = new AbstractMosaicStrategy.AbstractC59722a() {
            /* class com.ss.android.photoeditor.mosaic.v2.MosaicViewV2.C597521 */

            @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy.AbstractC59722a
            /* renamed from: a */
            public void mo203361a(Bitmap bitmap, boolean z) {
                if (MosaicViewV2.this.f148446g == null) {
                    MosaicViewV2 mosaicViewV2 = MosaicViewV2.this;
                    mosaicViewV2.f148446g = Bitmap.createBitmap(mosaicViewV2.f148444e);
                    MosaicViewV2.this.f148447h = new Canvas(MosaicViewV2.this.f148446g);
                }
                MosaicViewV2.this.f148447h.drawColor(0, PorterDuff.Mode.CLEAR);
                if (z) {
                    MosaicViewV2.this.f148445f.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, MosaicViewV2.this.f148444e.getWidth(), MosaicViewV2.this.f148444e.getHeight()), (Paint) null);
                } else {
                    MosaicViewV2.this.f148447h.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, MosaicViewV2.this.f148446g.getWidth(), MosaicViewV2.this.f148446g.getHeight()), (Paint) null);
                }
                MosaicViewV2.this.invalidate();
            }
        };
        m231757g();
    }

    /* renamed from: a */
    private void m231754a(float f, float f2) {
        for (C59740b bVar : this.f148454o) {
            bVar.mo203395a(bVar.mo203391a().x + f, bVar.mo203391a().y + f2, bVar.mo203399b(), bVar.mo203401c());
        }
    }

    /* renamed from: a */
    private void m231755a(float f, float f2, float f3) {
        for (C59740b bVar : this.f148454o) {
            bVar.mo203392a(f, f2, f3);
        }
    }

    public MosaicViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f148463x = new float[9];
        this.f148464y = new AbstractMosaicStrategy.AbstractC59722a() {
            /* class com.ss.android.photoeditor.mosaic.v2.MosaicViewV2.C597521 */

            @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy.AbstractC59722a
            /* renamed from: a */
            public void mo203361a(Bitmap bitmap, boolean z) {
                if (MosaicViewV2.this.f148446g == null) {
                    MosaicViewV2 mosaicViewV2 = MosaicViewV2.this;
                    mosaicViewV2.f148446g = Bitmap.createBitmap(mosaicViewV2.f148444e);
                    MosaicViewV2.this.f148447h = new Canvas(MosaicViewV2.this.f148446g);
                }
                MosaicViewV2.this.f148447h.drawColor(0, PorterDuff.Mode.CLEAR);
                if (z) {
                    MosaicViewV2.this.f148445f.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, MosaicViewV2.this.f148444e.getWidth(), MosaicViewV2.this.f148444e.getHeight()), (Paint) null);
                } else {
                    MosaicViewV2.this.f148447h.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, MosaicViewV2.this.f148446g.getWidth(), MosaicViewV2.this.f148446g.getHeight()), (Paint) null);
                }
                MosaicViewV2.this.invalidate();
            }
        };
        m231757g();
    }

    /* renamed from: a */
    private void m231756a(float f, float f2, int i) {
        for (C59740b bVar : this.f148454o) {
            bVar.mo203394a(f, f2, i);
        }
    }
}
