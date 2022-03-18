package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C1783c;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.AbstractC1848e;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.C1843h;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.p067a.C1734a;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.AbstractC1741e;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1766c;
import com.airbnb.lottie.p067a.p069b.C1770g;
import com.airbnb.lottie.p067a.p069b.C1778o;
import com.airbnb.lottie.p071c.C1787d;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.a */
public abstract class AbstractC1852a implements AbstractC1741e, AbstractC1758a.AbstractC1760a, AbstractC1848e {

    /* renamed from: a */
    final Matrix f6403a;

    /* renamed from: b */
    final LottieDrawable f6404b;

    /* renamed from: c */
    final Layer f6405c;

    /* renamed from: d */
    public C1766c f6406d;

    /* renamed from: e */
    final C1778o f6407e;

    /* renamed from: f */
    private final Path f6408f = new Path();

    /* renamed from: g */
    private final Matrix f6409g = new Matrix();

    /* renamed from: h */
    private final Paint f6410h = new C1734a(1);

    /* renamed from: i */
    private final Paint f6411i = new C1734a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: j */
    private final Paint f6412j = new C1734a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: k */
    private final Paint f6413k;

    /* renamed from: l */
    private final Paint f6414l;

    /* renamed from: m */
    private final RectF f6415m;

    /* renamed from: n */
    private final RectF f6416n;

    /* renamed from: o */
    private final RectF f6417o;

    /* renamed from: p */
    private final RectF f6418p;

    /* renamed from: q */
    private final String f6419q;

    /* renamed from: r */
    private C1770g f6420r;

    /* renamed from: s */
    private AbstractC1852a f6421s;

    /* renamed from: t */
    private AbstractC1852a f6422t;

    /* renamed from: u */
    private List<AbstractC1852a> f6423u;

    /* renamed from: v */
    private final List<AbstractC1758a<?, ?>> f6424v;

    /* renamed from: w */
    private boolean f6425w;

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo9297b(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9299b(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        mo9305g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Layer mo9301c() {
        return this.f6405c;
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        this.f6415m.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        m8333i();
        this.f6403a.set(matrix);
        if (z) {
            List<AbstractC1852a> list = this.f6423u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f6403a.preConcat(this.f6423u.get(size).f6407e.mo8995d());
                }
            } else {
                AbstractC1852a aVar = this.f6422t;
                if (aVar != null) {
                    this.f6403a.preConcat(aVar.f6407e.mo8995d());
                }
            }
        }
        this.f6403a.preConcat(this.f6407e.mo8995d());
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8932a(Canvas canvas, Matrix matrix, int i) {
        C1783c.m7956a(this.f6419q);
        if (!this.f6425w || this.f6405c.mo9292v()) {
            C1783c.m7957b(this.f6419q);
            return;
        }
        m8333i();
        C1783c.m7956a("Layer#parentMatrix");
        this.f6409g.reset();
        this.f6409g.set(matrix);
        for (int size = this.f6423u.size() - 1; size >= 0; size--) {
            this.f6409g.preConcat(this.f6423u.get(size).f6407e.mo8995d());
        }
        C1783c.m7957b("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.f6407e.mo8987a() == null ? 100 : this.f6407e.mo8987a().mo8960g().intValue()))) / 100.0f) * 255.0f);
        if (mo9302d() || mo9303e()) {
            C1783c.m7956a("Layer#computeBounds");
            mo8933a(this.f6415m, this.f6409g, false);
            m8325b(this.f6415m, matrix);
            this.f6409g.preConcat(this.f6407e.mo8995d());
            m8322a(this.f6415m, this.f6409g);
            if (!this.f6415m.intersect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f6415m.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            C1783c.m7957b("Layer#computeBounds");
            if (!this.f6415m.isEmpty()) {
                C1783c.m7956a("Layer#saveLayer");
                this.f6410h.setAlpha(255);
                C1791h.m8017a(canvas, this.f6415m, this.f6410h);
                C1783c.m7957b("Layer#saveLayer");
                m8319a(canvas);
                C1783c.m7956a("Layer#drawLayer");
                mo9297b(canvas, this.f6409g, intValue);
                C1783c.m7957b("Layer#drawLayer");
                if (mo9303e()) {
                    m8320a(canvas, this.f6409g);
                }
                if (mo9302d()) {
                    C1783c.m7956a("Layer#drawMatte");
                    C1783c.m7956a("Layer#saveLayer");
                    C1791h.m8018a(canvas, this.f6415m, this.f6413k, 19);
                    C1783c.m7957b("Layer#saveLayer");
                    m8319a(canvas);
                    this.f6421s.mo8932a(canvas, matrix, intValue);
                    C1783c.m7956a("Layer#restoreLayer");
                    canvas.restore();
                    C1783c.m7957b("Layer#restoreLayer");
                    C1783c.m7957b("Layer#drawMatte");
                }
                C1783c.m7956a("Layer#restoreLayer");
                canvas.restore();
                C1783c.m7957b("Layer#restoreLayer");
            }
            m8323b(C1783c.m7957b(this.f6419q));
            return;
        }
        this.f6409g.preConcat(this.f6407e.mo8995d());
        C1783c.m7956a("Layer#drawLayer");
        mo9297b(canvas, this.f6409g, intValue);
        C1783c.m7957b("Layer#drawLayer");
        m8323b(C1783c.m7957b(this.f6419q));
    }

    /* renamed from: a */
    public void mo9296a(boolean z) {
        if (z != this.f6425w) {
            this.f6425w = z;
            mo9305g();
        }
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public void mo8934a(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        if (dVar.mo9257a(mo8939b(), i)) {
            if (!"__container".equals(mo8939b())) {
                dVar2 = dVar2.mo9255a(mo8939b());
                if (dVar.mo9259c(mo8939b(), i)) {
                    list.add(dVar2.mo9254a(this));
                }
            }
            if (dVar.mo9260d(mo8939b(), i)) {
                mo9299b(dVar, i + dVar.mo9258b(mo8939b(), i), list, dVar2);
            }
        }
    }

    /* renamed from: g */
    private void mo9305g() {
        this.f6404b.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f6405c.mo9275f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9302d() {
        if (this.f6421s != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9303e() {
        C1770g gVar = this.f6420r;
        if (gVar == null || gVar.mo8977b().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m8332h() {
        if (this.f6420r.mo8977b().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f6420r.mo8976a().size(); i++) {
            if (this.f6420r.mo8976a().get(i).mo9157a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    private void m8333i() {
        if (this.f6423u == null) {
            if (this.f6422t == null) {
                this.f6423u = Collections.emptyList();
                return;
            }
            this.f6423u = new ArrayList();
            for (AbstractC1852a aVar = this.f6422t; aVar != null; aVar = aVar.f6422t) {
                this.f6423u.add(aVar);
            }
        }
    }

    /* renamed from: f */
    private void mo9304f() {
        boolean z = true;
        if (!this.f6405c.mo9273d().isEmpty()) {
            C1766c cVar = new C1766c(this.f6405c.mo9273d());
            this.f6406d = cVar;
            cVar.mo8951a();
            this.f6406d.mo8953a(new AbstractC1758a.AbstractC1760a() {
                /* class com.airbnb.lottie.model.layer.AbstractC1852a.C18531 */

                @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
                /* renamed from: a */
                public void mo8931a() {
                    boolean z;
                    AbstractC1852a aVar = AbstractC1852a.this;
                    if (aVar.f6406d.mo8970i() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo9296a(z);
                }
            });
            if (((Float) this.f6406d.mo8960g()).floatValue() != 1.0f) {
                z = false;
            }
            mo9296a(z);
            mo9294a(this.f6406d);
            return;
        }
        mo9296a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.model.layer.a$2 */
    public static /* synthetic */ class C18542 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6427a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6428b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
            // Method dump skipped, instructions count: 132
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.AbstractC1852a.C18542.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9295a(AbstractC1852a aVar) {
        this.f6421s = aVar;
    }

    /* renamed from: a */
    public void mo9294a(AbstractC1758a<?, ?> aVar) {
        if (aVar != null) {
            this.f6424v.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo9298b(AbstractC1758a<?, ?> aVar) {
        this.f6424v.remove(aVar);
    }

    /* renamed from: b */
    private void m8323b(float f) {
        this.f6404b.mo8845A().mo9060c().mo9123a(this.f6405c.mo9275f(), f);
    }

    /* renamed from: a */
    private void m8319a(Canvas canvas) {
        C1783c.m7956a("Layer#clearLayer");
        canvas.drawRect(this.f6415m.left - 1.0f, this.f6415m.top - 1.0f, this.f6415m.right + 1.0f, this.f6415m.bottom + 1.0f, this.f6414l);
        C1783c.m7957b("Layer#clearLayer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9300b(AbstractC1852a aVar) {
        this.f6422t = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9293a(float f) {
        this.f6407e.mo8988a(f);
        if (this.f6420r != null) {
            for (int i = 0; i < this.f6420r.mo8977b().size(); i++) {
                this.f6420r.mo8977b().get(i).mo8952a(f);
            }
        }
        if (this.f6405c.mo9271b() != BitmapDescriptorFactory.HUE_RED) {
            f /= this.f6405c.mo9271b();
        }
        C1766c cVar = this.f6406d;
        if (cVar != null) {
            cVar.mo8952a(f / this.f6405c.mo9271b());
        }
        AbstractC1852a aVar = this.f6421s;
        if (aVar != null) {
            this.f6421s.mo9293a(aVar.f6405c.mo9271b() * f);
        }
        for (int i2 = 0; i2 < this.f6424v.size(); i2++) {
            this.f6424v.get(i2).mo8952a(f);
        }
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        this.f6407e.mo8991a(t, cVar);
    }

    /* renamed from: b */
    private void m8325b(RectF rectF, Matrix matrix) {
        if (mo9302d() && this.f6405c.mo9281l() != Layer.MatteType.INVERT) {
            this.f6417o.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f6421s.mo8933a(this.f6417o, matrix, true);
            if (!rectF.intersect(this.f6417o)) {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    AbstractC1852a(LottieDrawable lottieDrawable, Layer layer) {
        C1734a aVar = new C1734a(1);
        this.f6413k = aVar;
        this.f6414l = new C1734a(PorterDuff.Mode.CLEAR);
        this.f6415m = new RectF();
        this.f6416n = new RectF();
        this.f6417o = new RectF();
        this.f6418p = new RectF();
        this.f6403a = new Matrix();
        this.f6424v = new ArrayList();
        this.f6425w = true;
        this.f6404b = lottieDrawable;
        this.f6405c = layer;
        this.f6419q = layer.mo9275f() + "#draw";
        if (layer.mo9281l() == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C1778o j = layer.mo9284o().mo9150j();
        this.f6407e = j;
        j.mo8989a((AbstractC1758a.AbstractC1760a) this);
        if (layer.mo9279j() != null && !layer.mo9279j().isEmpty()) {
            C1770g gVar = new C1770g(layer.mo9279j());
            this.f6420r = gVar;
            for (AbstractC1758a<C1843h, Path> aVar2 : gVar.mo8977b()) {
                aVar2.mo8953a(this);
            }
            for (AbstractC1758a<Integer, Integer> aVar3 : this.f6420r.mo8978c()) {
                mo9294a(aVar3);
                aVar3.mo8953a(this);
            }
        }
        mo9304f();
    }

    /* renamed from: a */
    private void m8320a(Canvas canvas, Matrix matrix) {
        C1783c.m7956a("Layer#saveLayer");
        C1791h.m8018a(canvas, this.f6415m, this.f6411i, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m8319a(canvas);
        }
        C1783c.m7957b("Layer#saveLayer");
        for (int i = 0; i < this.f6420r.mo8976a().size(); i++) {
            Mask mask = this.f6420r.mo8976a().get(i);
            AbstractC1758a<C1843h, Path> aVar = this.f6420r.mo8977b().get(i);
            AbstractC1758a<Integer, Integer> aVar2 = this.f6420r.mo8978c().get(i);
            int i2 = C18542.f6428b[mask.mo9157a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f6410h.setColor(-16777216);
                        this.f6410h.setAlpha(255);
                        canvas.drawRect(this.f6415m, this.f6410h);
                    }
                    if (mask.mo9160d()) {
                        m8327d(canvas, matrix, mask, aVar, aVar2);
                    } else {
                        m8326c(canvas, matrix, mask, aVar, aVar2);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.mo9160d()) {
                            m8324b(canvas, matrix, mask, aVar, aVar2);
                        } else {
                            m8321a(canvas, matrix, mask, aVar, aVar2);
                        }
                    }
                } else if (mask.mo9160d()) {
                    m8330f(canvas, matrix, mask, aVar, aVar2);
                } else {
                    m8328e(canvas, matrix, mask, aVar, aVar2);
                }
            } else if (m8332h()) {
                this.f6410h.setAlpha(255);
                canvas.drawRect(this.f6415m, this.f6410h);
            }
        }
        C1783c.m7956a("Layer#restoreLayer");
        canvas.restore();
        C1783c.m7957b("Layer#restoreLayer");
    }

    /* renamed from: a */
    private void m8322a(RectF rectF, Matrix matrix) {
        this.f6416n.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        if (mo9303e()) {
            int size = this.f6420r.mo8976a().size();
            for (int i = 0; i < size; i++) {
                Mask mask = this.f6420r.mo8976a().get(i);
                this.f6408f.set(this.f6420r.mo8977b().get(i).mo8960g());
                this.f6408f.transform(matrix);
                int i2 = C18542.f6428b[mask.mo9157a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 != 3 && i2 != 4) || !mask.mo9160d()) {
                        this.f6408f.computeBounds(this.f6418p, false);
                        if (i == 0) {
                            this.f6416n.set(this.f6418p);
                        } else {
                            RectF rectF2 = this.f6416n;
                            rectF2.set(Math.min(rectF2.left, this.f6418p.left), Math.min(this.f6416n.top, this.f6418p.top), Math.max(this.f6416n.right, this.f6418p.right), Math.max(this.f6416n.bottom, this.f6418p.bottom));
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.f6416n)) {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* renamed from: a */
    static AbstractC1852a m8318a(Layer layer, LottieDrawable lottieDrawable, C1792d dVar) {
        switch (C18542.f6427a[layer.mo9280k().ordinal()]) {
            case 1:
                return new C1859e(lottieDrawable, layer);
            case 2:
                return new C1855b(lottieDrawable, layer, dVar.mo9058b(layer.mo9276g()), dVar);
            case 3:
                return new C1860f(lottieDrawable, layer);
            case 4:
                return new C1857c(lottieDrawable, layer);
            case 5:
                return new C1858d(lottieDrawable, layer);
            case 6:
                return new C1861g(lottieDrawable, layer);
            default:
                C1787d.m7973b("Unknown layer type " + layer.mo9280k());
                return null;
        }
    }

    /* renamed from: c */
    private void m8326c(Canvas canvas, Matrix matrix, Mask mask, AbstractC1758a<C1843h, Path> aVar, AbstractC1758a<Integer, Integer> aVar2) {
        this.f6408f.set(aVar.mo8960g());
        this.f6408f.transform(matrix);
        canvas.drawPath(this.f6408f, this.f6412j);
    }

    /* renamed from: b */
    private void m8324b(Canvas canvas, Matrix matrix, Mask mask, AbstractC1758a<C1843h, Path> aVar, AbstractC1758a<Integer, Integer> aVar2) {
        C1791h.m8017a(canvas, this.f6415m, this.f6410h);
        canvas.drawRect(this.f6415m, this.f6410h);
        this.f6408f.set(aVar.mo8960g());
        this.f6408f.transform(matrix);
        this.f6410h.setAlpha((int) (((float) aVar2.mo8960g().intValue()) * 2.55f));
        canvas.drawPath(this.f6408f, this.f6412j);
        canvas.restore();
    }

    /* renamed from: d */
    private void m8327d(Canvas canvas, Matrix matrix, Mask mask, AbstractC1758a<C1843h, Path> aVar, AbstractC1758a<Integer, Integer> aVar2) {
        C1791h.m8017a(canvas, this.f6415m, this.f6412j);
        canvas.drawRect(this.f6415m, this.f6410h);
        this.f6412j.setAlpha((int) (((float) aVar2.mo8960g().intValue()) * 2.55f));
        this.f6408f.set(aVar.mo8960g());
        this.f6408f.transform(matrix);
        canvas.drawPath(this.f6408f, this.f6412j);
        canvas.restore();
    }

    /* renamed from: e */
    private void m8328e(Canvas canvas, Matrix matrix, Mask mask, AbstractC1758a<C1843h, Path> aVar, AbstractC1758a<Integer, Integer> aVar2) {
        C1791h.m8017a(canvas, this.f6415m, this.f6411i);
        this.f6408f.set(aVar.mo8960g());
        this.f6408f.transform(matrix);
        this.f6410h.setAlpha((int) (((float) aVar2.mo8960g().intValue()) * 2.55f));
        canvas.drawPath(this.f6408f, this.f6410h);
        canvas.restore();
    }

    /* renamed from: f */
    private void m8330f(Canvas canvas, Matrix matrix, Mask mask, AbstractC1758a<C1843h, Path> aVar, AbstractC1758a<Integer, Integer> aVar2) {
        C1791h.m8017a(canvas, this.f6415m, this.f6411i);
        canvas.drawRect(this.f6415m, this.f6410h);
        this.f6412j.setAlpha((int) (((float) aVar2.mo8960g().intValue()) * 2.55f));
        this.f6408f.set(aVar.mo8960g());
        this.f6408f.transform(matrix);
        canvas.drawPath(this.f6408f, this.f6412j);
        canvas.restore();
    }

    /* renamed from: a */
    private void m8321a(Canvas canvas, Matrix matrix, Mask mask, AbstractC1758a<C1843h, Path> aVar, AbstractC1758a<Integer, Integer> aVar2) {
        this.f6408f.set(aVar.mo8960g());
        this.f6408f.transform(matrix);
        this.f6410h.setAlpha((int) (((float) aVar2.mo8960g().intValue()) * 2.55f));
        canvas.drawPath(this.f6408f, this.f6410h);
    }
}
