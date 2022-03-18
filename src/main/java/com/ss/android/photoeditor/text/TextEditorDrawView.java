package com.ss.android.photoeditor.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.base.AbstractC59637h;
import com.ss.android.photoeditor.base.C59615b;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59611c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextEditorDrawView extends AppCompatImageView {

    /* renamed from: A */
    private float f148525A;

    /* renamed from: B */
    private float f148526B;

    /* renamed from: C */
    private C59615b f148527C;

    /* renamed from: a */
    Matrix f148528a;

    /* renamed from: b */
    RectF f148529b;

    /* renamed from: c */
    boolean f148530c;

    /* renamed from: d */
    C59622e.AbstractC59624a f148531d;

    /* renamed from: e */
    public Bitmap f148532e;

    /* renamed from: f */
    public Bitmap f148533f;

    /* renamed from: g */
    public Bitmap f148534g;

    /* renamed from: h */
    public Bitmap f148535h;

    /* renamed from: i */
    public Bitmap f148536i;

    /* renamed from: j */
    public Canvas f148537j;

    /* renamed from: k */
    public Canvas f148538k;

    /* renamed from: l */
    public Canvas f148539l;

    /* renamed from: m */
    public RectF f148540m;

    /* renamed from: n */
    public C59805a f148541n;

    /* renamed from: o */
    public List<C59805a> f148542o;

    /* renamed from: p */
    public C59781e f148543p;

    /* renamed from: q */
    public RectF f148544q;

    /* renamed from: r */
    public int f148545r;

    /* renamed from: s */
    public AbstractC59779c f148546s;

    /* renamed from: t */
    public RectF f148547t;

    /* renamed from: u */
    public C59780d f148548u;

    /* renamed from: v */
    public boolean f148549v;

    /* renamed from: w */
    public final Map<C59805a, C59782f> f148550w;

    /* renamed from: x */
    public AbstractC59637h.AbstractC59638a f148551x;

    /* renamed from: y */
    public AbstractC59777a f148552y;

    /* renamed from: z */
    private final float[] f148553z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.text.TextEditorDrawView$a */
    public interface AbstractC59777a {
        /* renamed from: a */
        void mo203496a(int i);
    }

    /* renamed from: com.ss.android.photoeditor.text.TextEditorDrawView$b */
    interface AbstractC59778b {
        /* renamed from: a */
        PointF mo203497a(C59805a aVar);

        /* renamed from: a */
        AbstractC59778b mo203498a(C59805a aVar, int i);

        /* renamed from: a */
        AbstractC59778b mo203499a(C59805a aVar, int i, float f);

        /* renamed from: a */
        AbstractC59778b mo203500a(C59805a aVar, PointF pointF, float f, float f2);

        /* renamed from: a */
        AbstractC59778b mo203501a(C59805a aVar, boolean z);

        /* renamed from: a */
        AbstractC59778b mo203502a(String str, int i);

        /* renamed from: a */
        C59805a mo203503a();

        /* renamed from: a */
        C59805a mo203504a(float f, float f2);

        /* renamed from: a */
        C59805a mo203505a(int i, int i2);

        /* renamed from: a */
        void mo203506a(RectF rectF);

        /* renamed from: a */
        void mo203507a(RectF rectF, RectF rectF2);

        /* renamed from: a */
        void mo203508a(boolean z);

        /* renamed from: a */
        boolean mo203509a(C59805a aVar, float f, float f2);

        /* renamed from: b */
        AbstractC59778b mo203510b(C59805a aVar);

        /* renamed from: b */
        boolean mo203511b();

        /* renamed from: b */
        boolean mo203512b(C59805a aVar, float f, float f2);

        /* renamed from: c */
        RectF mo203513c();

        /* renamed from: c */
        AbstractC59778b mo203514c(C59805a aVar);

        /* renamed from: c */
        boolean mo203515c(C59805a aVar, float f, float f2);

        /* renamed from: d */
        RectF mo203516d();

        /* renamed from: d */
        AbstractC59778b mo203517d(C59805a aVar, float f, float f2);

        /* renamed from: e */
        AbstractC59778b mo203518e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.text.TextEditorDrawView$c */
    public interface AbstractC59779c {
        /* renamed from: a */
        void mo203519a(boolean z);

        /* renamed from: a */
        boolean mo203520a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.text.TextEditorDrawView$d */
    public static class C59780d {

        /* renamed from: a */
        RectF f148559a;

        /* renamed from: b */
        RectF f148560b;

        /* renamed from: c */
        int f148561c;

        /* renamed from: d */
        RectF f148562d;

        C59780d() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.text.TextEditorDrawView$f */
    public static class C59782f extends C59622e.AbstractC59624a {

        /* renamed from: b */
        public boolean f148564b = true;

        /* renamed from: c */
        public C59805a f148565c;

        /* renamed from: d */
        public C59781e f148566d;

        /* renamed from: e */
        private RectF f148567e;

        /* renamed from: f */
        private RectF f148568f;

        /* renamed from: g */
        private RectF f148569g;

        /* renamed from: h */
        private int f148570h;

        /* renamed from: i */
        private RectF f148571i;

        /* renamed from: j */
        private TextEditorDrawView f148572j;

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public RectF mo203105a() {
            return null;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public C59622e.C59625b mo203106a(C59622e.C59625b bVar) {
            return bVar;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: b */
        public RectF mo203109b() {
            return null;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: c */
        public Bitmap mo203111c() {
            return null;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: h */
        public boolean mo203116h() {
            return false;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: e */
        public boolean mo203113e() {
            return this.f148564b;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: f */
        public boolean mo203114f() {
            if (this.f148565c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public void mo203522j() {
            this.f148564b = false;
            this.f148565c = null;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: d */
        public void mo203112d() {
            if (this.f148565c == this.f148566d.mo203503a()) {
                this.f148566d.mo203510b((C59805a) null);
            }
            this.f148566d.mo203514c(this.f148565c).mo203518e();
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: g */
        public void mo203115g() {
            this.f148572j.f148551x.mo203152a(TextPhotoEditorPlugin.class);
            this.f148572j.post(new Runnable() {
                /* class com.ss.android.photoeditor.text.TextEditorDrawView.C59782f.RunnableC597831 */

                public void run() {
                    C59805a a = C59782f.this.f148566d.mo203503a();
                    if (a != null) {
                        C59782f.this.f148566d.mo203501a(a, false);
                    }
                    C59782f.this.f148566d.mo203501a(C59782f.this.f148565c, true).mo203510b(C59782f.this.f148565c).mo203518e();
                }
            });
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public void mo203107a(Canvas canvas) {
            float f;
            float f2;
            C59805a aVar = this.f148565c;
            if (aVar != null && aVar.f148652d) {
                long currentTimeMillis = System.currentTimeMillis();
                RectF rectF = new RectF(this.f148568f);
                RectF rectF2 = new RectF(this.f148569g);
                float width = ((float) canvas.getWidth()) / rectF2.width();
                C59610b.m231211a(rectF, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
                C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
                float f3 = -rectF2.left;
                float f4 = -rectF2.top;
                rectF.offset(f3, f4);
                rectF2.offset(f3, f4);
                if ((this.f148570h / 90) % 2 == 0) {
                    f2 = rectF.width();
                    f = this.f148567e.width();
                } else {
                    f2 = rectF.height();
                    f = this.f148567e.width();
                }
                float f5 = f2 / f;
                RectF rectF3 = new RectF(this.f148567e);
                C59805a aVar2 = new C59805a(this.f148565c);
                C59610b.m231211a(rectF3, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f5);
                aVar2.mo203573a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5);
                float centerX = rectF.centerX() - rectF3.centerX();
                float centerY = rectF.centerY() - rectF3.centerY();
                rectF3.offset(centerX, centerY);
                aVar2.mo203575a(aVar2.f148650b.x + centerX, aVar2.f148650b.y + centerY, aVar2.f148651c, aVar2.f148649a);
                aVar2.mo203574a(rectF.centerX(), rectF.centerY(), -this.f148570h);
                aVar2.mo203577a(canvas);
                long currentTimeMillis2 = System.currentTimeMillis();
                Log.m165379d("drawOnCanvas", "user time" + (currentTimeMillis2 - currentTimeMillis));
            }
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public boolean mo203108a(PointF pointF, RectF rectF) {
            float f;
            float f2;
            PointF pointF2 = new PointF(pointF.x, pointF.y);
            RectF rectF2 = new RectF(rectF);
            RectF rectF3 = new RectF(this.f148568f);
            float width = this.f148569g.width() / rectF2.width();
            C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
            pointF2.x *= width;
            pointF2.y *= width;
            float centerX = this.f148569g.centerX() - rectF2.centerX();
            float centerY = this.f148569g.centerY() - rectF2.centerY();
            rectF2.offset(centerX, centerY);
            pointF2.x += centerX;
            pointF2.y += centerY;
            if ((this.f148570h / 90) % 2 == 0) {
                f2 = this.f148567e.width();
                f = rectF3.width();
            } else {
                f2 = this.f148567e.height();
                f = rectF3.width();
            }
            float f3 = f2 / f;
            C59610b.m231211a(rectF3, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f3);
            C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f3);
            pointF2.x *= f3;
            pointF2.y *= f3;
            float centerX2 = this.f148567e.centerX() - rectF3.centerX();
            float centerY2 = this.f148567e.centerY() - rectF3.centerY();
            rectF3.offset(centerX2, centerY2);
            rectF2.offset(centerX2, centerY2);
            pointF2.x += centerX2;
            pointF2.y += centerY2;
            C59610b.m231213a(rectF3, this.f148570h, rectF3.centerX(), rectF3.centerY());
            C59610b.m231213a(rectF2, this.f148570h, rectF3.centerX(), rectF3.centerY());
            C59610b.m231210a(pointF2, rectF3.centerX(), rectF3.centerY(), this.f148570h);
            pointF2.x -= this.f148567e.left;
            pointF2.y -= this.f148567e.top;
            return this.f148565c.mo203580a(pointF2.x, pointF2.y);
        }

        /* renamed from: a */
        public void mo203521a(C59805a aVar, RectF rectF, RectF rectF2, RectF rectF3, int i) {
            this.f148568f = new RectF(rectF2);
            this.f148569g = new RectF(rectF3);
            this.f148570h = i;
            this.f148567e = new RectF(rectF);
            this.f148565c = aVar;
            Log.m165379d("updateLocationInfo", "updateLocationInfo");
        }

        public C59782f(TextEditorDrawView textEditorDrawView, RectF rectF, C59805a aVar, C59781e eVar, RectF rectF2, RectF rectF3, int i) {
            this.f148567e = new RectF(rectF);
            this.f148565c = aVar;
            this.f148566d = eVar;
            this.f148568f = new RectF(rectF2);
            this.f148569g = new RectF(rectF3);
            this.f148570h = i;
            this.f148571i = new RectF();
            this.f148572j = textEditorDrawView;
        }
    }

    public C59805a getCurrTextSticker() {
        return this.f148541n;
    }

    /* access modifiers changed from: package-private */
    public RectF getImageRect() {
        return this.f148540m;
    }

    public RectF getLocation() {
        return this.f148544q;
    }

    public AbstractC59778b getTextStickerController() {
        return this.f148543p;
    }

    /* renamed from: a */
    public void mo203475a(Runnable runnable) {
        mo203481f();
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f148540m.width(), this.f148540m.height());
        this.f148547t = rectF;
        if (this.f148533f == null) {
            this.f148533f = Bitmap.createBitmap((int) rectF.width(), (int) this.f148547t.height(), Bitmap.Config.ARGB_4444);
            this.f148537j = new Canvas(this.f148533f);
        }
        if (this.f148534g == null) {
            this.f148534g = Bitmap.createBitmap((int) this.f148547t.width(), (int) this.f148547t.height(), Bitmap.Config.ARGB_4444);
            this.f148539l = new Canvas(this.f148534g);
        }
        if (this.f148535h == null) {
            this.f148535h = Bitmap.createBitmap((int) this.f148547t.width(), (int) this.f148547t.height(), Bitmap.Config.ARGB_4444);
            this.f148538k = new Canvas(this.f148535h);
        }
        this.f148536i = Bitmap.createScaledBitmap(this.f148532e, (int) this.f148547t.width(), (int) this.f148547t.height(), true);
        this.f148542o = new ArrayList();
        this.f148543p = new C59781e();
        this.f148544q = new RectF(this.f148540m);
        if (runnable != null) {
            runnable.run();
        }
        C59622e.C59625b f = C59622e.m231233a().mo203098f();
        C59780d dVar = new C59780d();
        this.f148548u = dVar;
        dVar.f148559a = new RectF(f.f147995a);
        this.f148548u.f148560b = new RectF(f.f147996b);
        this.f148548u.f148561c = f.f147997c;
        this.f148548u.f148562d = new RectF(this.f148547t);
        mo203466a();
        C59805a a = this.f148543p.mo203505a(getWidth() / 2, getHeight() / 2);
        this.f148541n = a;
        if (a != null) {
            a.mo203579a(true);
        }
        mo203476a(true, true);
    }

    /* renamed from: a */
    public void mo203476a(boolean z, boolean z2) {
        this.f148537j.drawColor(0, PorterDuff.Mode.CLEAR);
        C59805a aVar = this.f148541n;
        if (aVar != null && (z || aVar.f148652d)) {
            this.f148541n.mo203577a(this.f148537j);
        }
        if (z2) {
            this.f148539l.drawColor(0, PorterDuff.Mode.CLEAR);
            for (int i = 0; i < this.f148542o.size(); i++) {
                C59805a aVar2 = this.f148542o.get(i);
                if (aVar2 != this.f148541n && (z || aVar2.f148652d)) {
                    aVar2.mo203577a(this.f148539l);
                }
            }
        }
        m231838i();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.text.TextEditorDrawView$e */
    public class C59781e implements AbstractC59778b {
        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public void mo203507a(RectF rectF, RectF rectF2) {
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public boolean mo203509a(C59805a aVar, float f, float f2) {
            return aVar.mo203580a(m231882a(f), m231883b(f2));
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public void mo203508a(boolean z) {
            if (TextEditorDrawView.this.f148546s != null) {
                TextEditorDrawView.this.f148546s.mo203519a(z);
            }
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public void mo203506a(RectF rectF) {
            TextEditorDrawView.this.f148544q.set(rectF);
            TextEditorDrawView.this.invalidate();
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: c */
        public RectF mo203513c() {
            return TextEditorDrawView.this.f148540m;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: d */
        public RectF mo203516d() {
            return TextEditorDrawView.this.f148544q;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: e */
        public AbstractC59778b mo203518e() {
            if (TextEditorDrawView.this.f148549v) {
                TextEditorDrawView.this.mo203476a(true, true);
            } else {
                TextEditorDrawView.this.mo203476a(true, false);
            }
            TextEditorDrawView.this.f148549v = false;
            TextEditorDrawView.this.invalidate();
            return this;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: b */
        public boolean mo203511b() {
            if (TextEditorDrawView.this.f148546s != null) {
                return TextEditorDrawView.this.f148546s.mo203520a();
            }
            return false;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public C59805a mo203503a() {
            return TextEditorDrawView.this.f148541n;
        }

        private C59781e() {
        }

        /* renamed from: a */
        private float m231882a(float f) {
            return (f - TextEditorDrawView.this.f148544q.left) * (TextEditorDrawView.this.f148547t.width() / TextEditorDrawView.this.f148544q.width());
        }

        /* renamed from: b */
        private float m231883b(float f) {
            return (f - TextEditorDrawView.this.f148544q.top) * (TextEditorDrawView.this.f148547t.height() / TextEditorDrawView.this.f148544q.height());
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public PointF mo203497a(C59805a aVar) {
            float f = aVar.f148650b.x;
            float f2 = aVar.f148650b.y;
            float width = TextEditorDrawView.this.f148544q.width() / TextEditorDrawView.this.f148547t.width();
            return new PointF((f * width) + TextEditorDrawView.this.f148544q.left, (f2 * width) + TextEditorDrawView.this.f148544q.top);
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: b */
        public AbstractC59778b mo203510b(C59805a aVar) {
            if (aVar != TextEditorDrawView.this.f148541n) {
                TextEditorDrawView.this.f148549v = true;
                TextEditorDrawView.this.f148541n = aVar;
                if (!(TextEditorDrawView.this.f148552y == null || TextEditorDrawView.this.f148541n == null)) {
                    TextEditorDrawView.this.f148552y.mo203496a(TextEditorDrawView.this.f148541n.mo203572a());
                }
            }
            return this;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: c */
        public AbstractC59778b mo203514c(C59805a aVar) {
            if (aVar != null) {
                TextEditorDrawView.this.f148542o.remove(aVar);
                if (TextEditorDrawView.this.f148550w.containsKey(aVar)) {
                    C59782f fVar = TextEditorDrawView.this.f148550w.get(aVar);
                    if (fVar != null) {
                        fVar.mo203522j();
                    }
                    TextEditorDrawView.this.f148550w.remove(aVar);
                }
                if (TextEditorDrawView.this.f148541n == aVar) {
                    TextEditorDrawView.this.f148541n = null;
                }
            }
            return this;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public AbstractC59778b mo203498a(C59805a aVar, int i) {
            TextEditorDrawView.this.mo203472a(aVar, i);
            return this;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public AbstractC59778b mo203501a(C59805a aVar, boolean z) {
            if (aVar != null) {
                TextEditorDrawView.this.mo203474a(aVar, z);
            }
            return this;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public AbstractC59778b mo203502a(String str, int i) {
            if (TextEditorDrawView.this.f148541n != null) {
                TextEditorDrawView textEditorDrawView = TextEditorDrawView.this;
                textEditorDrawView.mo203473a(textEditorDrawView.f148541n, str, i);
            }
            return this;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public C59805a mo203504a(float f, float f2) {
            float a = m231882a(f);
            float b = m231883b(f2);
            for (int size = TextEditorDrawView.this.f148542o.size() - 1; size >= 0; size--) {
                C59805a aVar = TextEditorDrawView.this.f148542o.get(size);
                if (aVar.mo203580a(a, b)) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public C59805a mo203505a(int i, int i2) {
            if (TextEditorDrawView.this.f148542o.size() >= 15) {
                return null;
            }
            for (int i3 = 0; i3 < TextEditorDrawView.this.f148542o.size(); i3++) {
                if (!TextEditorDrawView.this.f148542o.get(i3).f148652d) {
                    return null;
                }
            }
            int a = (int) m231882a((float) i);
            int b = (int) m231883b((float) i2);
            float width = TextEditorDrawView.this.f148547t.width() / TextEditorDrawView.this.f148544q.width();
            TextEditorDrawView textEditorDrawView = TextEditorDrawView.this;
            C59805a aVar = new C59805a(textEditorDrawView, a, b, textEditorDrawView.getContext().getString(R.string.Lark_Legacy_ClickToEnter), width, 0, TextEditorDrawView.this.f148545r);
            TextEditorDrawView.this.f148542o.add(aVar);
            C59622e.C59625b f = C59622e.m231233a().mo203098f();
            TextEditorDrawView textEditorDrawView2 = TextEditorDrawView.this;
            C59782f fVar = new C59782f(textEditorDrawView2, textEditorDrawView2.f148547t, aVar, TextEditorDrawView.this.f148543p, f.f147995a, f.f147996b, f.f147997c);
            TextEditorDrawView.this.f148550w.put(aVar, fVar);
            C59622e.m231233a().mo203093b(fVar);
            return aVar;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: b */
        public boolean mo203512b(C59805a aVar, float f, float f2) {
            return aVar.mo203583c(m231882a(f), m231883b(f2));
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: c */
        public boolean mo203515c(C59805a aVar, float f, float f2) {
            return aVar.mo203582b(m231882a(f), m231883b(f2));
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: d */
        public AbstractC59778b mo203517d(C59805a aVar, float f, float f2) {
            TextEditorDrawView.this.mo203471a(aVar, m231882a(f), m231883b(f2), aVar.f148651c, aVar.f148649a);
            return this;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public AbstractC59778b mo203499a(C59805a aVar, int i, float f) {
            TextEditorDrawView.this.mo203471a(aVar, aVar.f148650b.x, aVar.f148650b.y, i, f);
            return this;
        }

        @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59778b
        /* renamed from: a */
        public AbstractC59778b mo203500a(C59805a aVar, PointF pointF, float f, float f2) {
            float width = TextEditorDrawView.this.f148547t.width() / TextEditorDrawView.this.f148544q.width();
            TextEditorDrawView.this.mo203471a(aVar, pointF.x + (f * width), pointF.y + (f2 * width), aVar.f148651c, aVar.f148649a);
            return this;
        }
    }

    /* renamed from: g */
    public void mo203482g() {
        C59610b.m231208a(this.f148532e);
        C59610b.m231208a(this.f148533f);
        C59610b.m231208a(this.f148535h);
    }

    /* renamed from: h */
    private void m231837h() {
        setBackgroundColor(-16777216);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f148527C = new C59615b(new C59615b.AbstractC59618a() {
            /* class com.ss.android.photoeditor.text.TextEditorDrawView.C597731 */

            @Override // com.ss.android.photoeditor.base.C59615b.AbstractC59618a
            /* renamed from: a */
            public void mo203072a(RectF rectF) {
                TextEditorDrawView.this.f148544q.set(rectF);
                TextEditorDrawView.this.invalidate();
            }
        });
    }

    /* renamed from: i */
    private void m231838i() {
        new Matrix();
        this.f148538k.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f148538k.drawBitmap(this.f148536i, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        this.f148538k.drawBitmap(this.f148534g, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        this.f148538k.drawBitmap(this.f148533f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }

    /* renamed from: a */
    public void mo203466a() {
        RectF rectF = this.f148529b;
        if (rectF != null) {
            if (!this.f148530c) {
                this.f148527C.mo203066b(new RectF(this.f148529b), this.f148540m);
            } else {
                this.f148544q.set(rectF);
            }
            this.f148529b = null;
        }
    }

    /* renamed from: d */
    public void mo203479d() {
        for (C59805a aVar : this.f148550w.keySet()) {
            this.f148550w.get(aVar).mo203521a(aVar, this.f148548u.f148562d, this.f148548u.f148559a, this.f148548u.f148560b, this.f148548u.f148561c);
        }
    }

    /* renamed from: e */
    public void mo203480e() {
        for (C59805a aVar : this.f148550w.keySet()) {
            this.f148550w.get(aVar).f148564b = true;
        }
        C59805a aVar2 = this.f148541n;
        if (aVar2 != null) {
            aVar2.mo203579a(false);
        }
        this.f148531d = C59622e.m231233a().mo203097e();
        C59622e.m231233a().mo203101i();
    }

    /* renamed from: b */
    public void mo203477b() {
        for (C59805a aVar : this.f148550w.keySet()) {
            this.f148550w.get(aVar).f148564b = false;
        }
        C59805a aVar2 = this.f148541n;
        if (aVar2 != null) {
            aVar2.mo203579a(true);
        }
        setImageBitmap(C59622e.m231233a().mo203099g());
        if (C59622e.m231233a().mo203091a(this.f148531d)) {
            m231836b(new Runnable() {
                /* class com.ss.android.photoeditor.text.TextEditorDrawView.RunnableC597742 */

                public void run() {
                    TextEditorDrawView.this.mo203466a();
                }
            });
        } else {
            this.f148536i = Bitmap.createScaledBitmap(this.f148532e, (int) this.f148547t.width(), (int) this.f148547t.height(), true);
            C59611c.m231214a(this, new Runnable() {
                /* class com.ss.android.photoeditor.text.TextEditorDrawView.RunnableC597753 */

                public void run() {
                    TextEditorDrawView.this.mo203476a(true, true);
                    TextEditorDrawView.this.mo203466a();
                }
            });
        }
        invalidate();
    }

    /* renamed from: c */
    public void mo203478c() {
        C59622e.AbstractC59624a h = C59622e.m231233a().mo203100h();
        if (h != null) {
            setImageBitmap(C59622e.m231233a().mo203099g());
            C59622e.C59625b k = C59622e.m231233a().mo203103k();
            k.mo203122b(h);
            if (k.f147998d) {
                m231836b(null);
            } else {
                this.f148536i = Bitmap.createScaledBitmap(this.f148532e, (int) this.f148547t.width(), (int) this.f148547t.height(), true);
                mo203476a(true, true);
            }
            invalidate();
        }
    }

    /* renamed from: f */
    public void mo203481f() {
        this.f148540m = new RectF();
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float width = (float) getWidth();
        float height = (float) getHeight();
        Matrix imageMatrix = getImageMatrix();
        float a = m231834a(imageMatrix, 0);
        float a2 = m231834a(imageMatrix, 4);
        this.f148525A = a * intrinsicWidth;
        this.f148526B = ((float) getDrawable().getIntrinsicHeight()) * a2;
        Log.m165379d("TextEditorView", "imageRect ImageShowWidth：imageWidth：viewWidth=" + this.f148525A + ":" + intrinsicWidth + "：" + width);
        if (Math.abs(this.f148525A - width) < 3.0f) {
            RectF rectF = this.f148540m;
            float f = this.f148526B;
            rectF.set(BitmapDescriptorFactory.HUE_RED, (height - f) / 2.0f, width, ((height - f) / 2.0f) + f);
            return;
        }
        RectF rectF2 = this.f148540m;
        float f2 = this.f148525A;
        rectF2.set((width - f2) / 2.0f, BitmapDescriptorFactory.HUE_RED, ((width - f2) / 2.0f) + f2, height);
    }

    public void setOnColorChangedListener(AbstractC59777a aVar) {
        this.f148552y = aVar;
    }

    public void setPluginContext(AbstractC59637h.AbstractC59638a aVar) {
        this.f148551x = aVar;
    }

    public void setToolBarVisibleCallback(AbstractC59779c cVar) {
        this.f148546s = cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f148532e = bitmap;
        super.setImageBitmap(bitmap);
    }

    /* renamed from: b */
    private void m231836b(final Runnable runnable) {
        C59611c.m231214a(this, new Runnable() {
            /* class com.ss.android.photoeditor.text.TextEditorDrawView.RunnableC597764 */

            public void run() {
                float f;
                float f2;
                float f3;
                float f4;
                TextEditorDrawView.this.mo203481f();
                TextEditorDrawView.this.f148544q.set(TextEditorDrawView.this.f148540m);
                TextEditorDrawView.this.f148547t = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, TextEditorDrawView.this.f148540m.width(), TextEditorDrawView.this.f148540m.height());
                TextEditorDrawView textEditorDrawView = TextEditorDrawView.this;
                textEditorDrawView.f148533f = Bitmap.createBitmap((int) textEditorDrawView.f148547t.width(), (int) TextEditorDrawView.this.f148547t.height(), Bitmap.Config.ARGB_4444);
                TextEditorDrawView.this.f148537j = new Canvas(TextEditorDrawView.this.f148533f);
                TextEditorDrawView textEditorDrawView2 = TextEditorDrawView.this;
                textEditorDrawView2.f148534g = Bitmap.createBitmap((int) textEditorDrawView2.f148547t.width(), (int) TextEditorDrawView.this.f148547t.height(), Bitmap.Config.ARGB_4444);
                TextEditorDrawView.this.f148539l = new Canvas(TextEditorDrawView.this.f148534g);
                TextEditorDrawView textEditorDrawView3 = TextEditorDrawView.this;
                textEditorDrawView3.f148535h = Bitmap.createBitmap((int) textEditorDrawView3.f148547t.width(), (int) TextEditorDrawView.this.f148547t.height(), Bitmap.Config.ARGB_4444);
                TextEditorDrawView.this.f148538k = new Canvas(TextEditorDrawView.this.f148535h);
                TextEditorDrawView textEditorDrawView4 = TextEditorDrawView.this;
                textEditorDrawView4.f148536i = Bitmap.createScaledBitmap(textEditorDrawView4.f148532e, (int) TextEditorDrawView.this.f148547t.width(), (int) TextEditorDrawView.this.f148547t.height(), true);
                C59622e.C59625b f5 = C59622e.m231233a().mo203098f();
                RectF rectF = new RectF(f5.f147995a);
                RectF rectF2 = new RectF(f5.f147996b);
                RectF rectF3 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, TextEditorDrawView.this.f148540m.width(), TextEditorDrawView.this.f148540m.height());
                int i = f5.f147997c;
                RectF rectF4 = new RectF(TextEditorDrawView.this.f148548u.f148559a);
                RectF rectF5 = new RectF(TextEditorDrawView.this.f148548u.f148560b);
                RectF rectF6 = new RectF(TextEditorDrawView.this.f148548u.f148562d);
                int i2 = TextEditorDrawView.this.f148548u.f148561c;
                TextEditorDrawView.this.f148548u.f148559a = new RectF(rectF);
                TextEditorDrawView.this.f148548u.f148560b = new RectF(rectF2);
                TextEditorDrawView.this.f148548u.f148561c = i;
                TextEditorDrawView.this.f148548u.f148562d = new RectF(rectF3);
                if ((i2 / 90) % 2 == 0) {
                    f2 = rectF4.width();
                    f = rectF6.width();
                } else {
                    f2 = rectF4.height();
                    f = rectF6.width();
                }
                float f6 = f2 / f;
                C59610b.m231211a(rectF6, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f6);
                TextEditorDrawView.this.mo203468a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f6);
                int i3 = -i2;
                C59610b.m231213a(rectF6, i3, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
                TextEditorDrawView.this.mo203469a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i3);
                float centerX = rectF4.centerX() - rectF6.centerX();
                float centerY = rectF4.centerY() - rectF6.centerY();
                rectF6.offset(centerX, centerY);
                TextEditorDrawView.this.mo203467a(centerX, centerY);
                float width = rectF2.width() / rectF5.width();
                C59610b.m231211a(rectF4, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
                C59610b.m231211a(rectF5, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
                TextEditorDrawView.this.mo203468a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width);
                float f7 = rectF2.left - rectF5.left;
                float f8 = rectF2.top - rectF5.top;
                rectF4.offset(f7, f8);
                rectF5.offset(f7, f8);
                TextEditorDrawView.this.mo203467a(f7, f8);
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
                TextEditorDrawView.this.mo203468a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f9);
                C59610b.m231213a(rectF, i, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
                C59610b.m231213a(rectF4, i, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
                TextEditorDrawView.this.mo203469a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i);
                float centerX2 = rectF3.centerX() - rectF.centerX();
                float centerY2 = rectF3.centerY() - rectF.centerY();
                rectF.offset(centerX2, centerY2);
                rectF4.offset(centerX2, centerY2);
                TextEditorDrawView.this.mo203467a(centerX2, centerY2);
                TextEditorDrawView.this.mo203479d();
                TextEditorDrawView.this.mo203476a(true, true);
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawColor(-16777216);
            m231835a(canvas);
        }
    }

    public TextEditorDrawView(Context context) {
        super(context);
        this.f148528a = new Matrix();
        this.f148553z = new float[9];
        this.f148550w = new HashMap();
        m231837h();
    }

    /* renamed from: a */
    private void m231835a(Canvas canvas) {
        C59610b.m231209a(this.f148528a, this.f148535h, this.f148544q);
        canvas.drawBitmap(this.f148535h, this.f148528a, null);
    }

    public void setPaintColor(int i) {
        this.f148545r = i;
        if (this.f148541n != null) {
            getTextStickerController().mo203498a(this.f148541n, i).mo203518e();
        }
    }

    /* renamed from: a */
    public void mo203470a(RectF rectF, boolean z) {
        this.f148529b = rectF;
        this.f148530c = z;
    }

    /* renamed from: a */
    private float m231834a(Matrix matrix, int i) {
        matrix.getValues(this.f148553z);
        return this.f148553z[i];
    }

    public TextEditorDrawView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148528a = new Matrix();
        this.f148553z = new float[9];
        this.f148550w = new HashMap();
        m231837h();
    }

    /* renamed from: a */
    public void mo203467a(float f, float f2) {
        for (C59805a aVar : this.f148542o) {
            aVar.mo203575a(aVar.f148650b.x + f, aVar.f148650b.y + f2, aVar.f148651c, aVar.f148649a);
        }
    }

    /* renamed from: a */
    public void mo203472a(C59805a aVar, int i) {
        aVar.mo203576a(i);
    }

    /* renamed from: a */
    public void mo203474a(C59805a aVar, boolean z) {
        aVar.mo203579a(z);
    }

    public TextEditorDrawView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f148528a = new Matrix();
        this.f148553z = new float[9];
        this.f148550w = new HashMap();
        m231837h();
    }

    /* renamed from: a */
    public void mo203468a(float f, float f2, float f3) {
        for (C59805a aVar : this.f148542o) {
            aVar.mo203573a(f, f2, f3);
        }
    }

    /* renamed from: a */
    public void mo203469a(float f, float f2, int i) {
        for (C59805a aVar : this.f148542o) {
            aVar.mo203574a(f, f2, i);
        }
    }

    /* renamed from: a */
    public void mo203473a(C59805a aVar, String str, int i) {
        aVar.mo203578a(str, i);
    }

    /* renamed from: a */
    public void mo203471a(C59805a aVar, float f, float f2, int i, float f3) {
        aVar.mo203575a(f, f2, i, f3);
    }
}
