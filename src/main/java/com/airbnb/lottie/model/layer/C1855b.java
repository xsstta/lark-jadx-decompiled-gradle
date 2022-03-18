package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.C0516c;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.C1783c;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1779p;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.b */
public class C1855b extends AbstractC1852a {

    /* renamed from: f */
    private AbstractC1758a<Float, Float> f6429f;

    /* renamed from: g */
    private final List<AbstractC1852a> f6430g = new ArrayList();

    /* renamed from: h */
    private final RectF f6431h = new RectF();

    /* renamed from: i */
    private final RectF f6432i = new RectF();

    /* renamed from: j */
    private Paint f6433j = new Paint();

    /* renamed from: k */
    private Boolean f6434k;

    /* renamed from: l */
    private Boolean f6435l;

    /* renamed from: com.airbnb.lottie.model.layer.b$1 */
    static /* synthetic */ class C18561 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6436a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.layer.Layer$MatteType[] r0 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.airbnb.lottie.model.layer.C1855b.C18561.f6436a = r0
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.airbnb.lottie.model.layer.C1855b.C18561.f6436a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C1855b.C18561.<clinit>():void");
        }
    }

    /* renamed from: f */
    public boolean mo9304f() {
        if (this.f6435l == null) {
            for (int size = this.f6430g.size() - 1; size >= 0; size--) {
                AbstractC1852a aVar = this.f6430g.get(size);
                if (aVar instanceof C1859e) {
                    if (aVar.mo9303e()) {
                        this.f6435l = true;
                        return true;
                    }
                } else if ((aVar instanceof C1855b) && ((C1855b) aVar).mo9304f()) {
                    this.f6435l = true;
                    return true;
                }
            }
            this.f6435l = false;
        }
        return this.f6435l.booleanValue();
    }

    /* renamed from: g */
    public boolean mo9305g() {
        if (this.f6434k == null) {
            if (mo9302d()) {
                this.f6434k = true;
                return true;
            }
            for (int size = this.f6430g.size() - 1; size >= 0; size--) {
                if (this.f6430g.get(size).mo9302d()) {
                    this.f6434k = true;
                    return true;
                }
            }
            this.f6434k = false;
        }
        return this.f6434k.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: a */
    public void mo9293a(float f) {
        super.mo9293a(f);
        if (this.f6429f != null) {
            f = ((this.f6429f.mo8960g().floatValue() * this.f6405c.mo9269a().mo9066h()) - this.f6405c.mo9269a().mo9064f()) / (this.f6404b.mo8845A().mo9071m() + 0.01f);
        }
        if (this.f6429f == null) {
            f -= this.f6405c.mo9272c();
        }
        if (this.f6405c.mo9271b() != BitmapDescriptorFactory.HUE_RED) {
            f /= this.f6405c.mo9271b();
        }
        for (int size = this.f6430g.size() - 1; size >= 0; size--) {
            this.f6430g.get(size).mo9293a(f);
        }
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e, com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        super.mo8935a(t, cVar);
        if (t != AbstractC1810j.f6194A) {
            return;
        }
        if (cVar == null) {
            AbstractC1758a<Float, Float> aVar = this.f6429f;
            if (aVar != null) {
                aVar.mo8954a((C1795c<Float>) null);
                return;
            }
            return;
        }
        C1779p pVar = new C1779p(cVar);
        this.f6429f = pVar;
        pVar.mo8953a(this);
        mo9294a(this.f6429f);
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC1852a, com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        super.mo8933a(rectF, matrix, z);
        for (int size = this.f6430g.size() - 1; size >= 0; size--) {
            this.f6431h.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f6430g.get(size).mo8933a(this.f6431h, this.f6403a, true);
            rectF.union(this.f6431h);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: b */
    public void mo9297b(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean z2;
        C1783c.m7956a("CompositionLayer#draw");
        this.f6432i.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f6405c.mo9277h(), (float) this.f6405c.mo9278i());
        matrix.mapRect(this.f6432i);
        if (!this.f6404b.mo8898h() || this.f6430g.size() <= 1 || i == 255) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f6433j.setAlpha(i);
            C1791h.m8017a(canvas, this.f6432i, this.f6433j);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f6430g.size() - 1; size >= 0; size--) {
            if (!this.f6432i.isEmpty()) {
                z2 = canvas.clipRect(this.f6432i);
            } else {
                z2 = true;
            }
            if (z2) {
                this.f6430g.get(size).mo8932a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C1783c.m7957b("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: b */
    public void mo9299b(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        for (int i2 = 0; i2 < this.f6430g.size(); i2++) {
            this.f6430g.get(i2).mo8934a(dVar, i, list, dVar2);
        }
    }

    public C1855b(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, C1792d dVar) {
        super(lottieDrawable, layer);
        int i;
        AbstractC1852a aVar;
        C1820b u = layer.mo9291u();
        if (u != null) {
            AbstractC1758a<Float, Float> a = u.mo9135a();
            this.f6429f = a;
            mo9294a(a);
            this.f6429f.mo8953a(this);
        } else {
            this.f6429f = null;
        }
        C0516c cVar = new C0516c(dVar.mo9067i().size());
        int size = list.size() - 1;
        AbstractC1852a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            AbstractC1852a a2 = AbstractC1852a.m8318a(layer2, lottieDrawable, dVar);
            if (a2 != null) {
                cVar.mo2965b(a2.mo9301c().mo9274e(), a2);
                if (aVar2 != null) {
                    aVar2.mo9295a(a2);
                    aVar2 = null;
                } else {
                    this.f6430g.add(0, a2);
                    int i2 = C18561.f6436a[layer2.mo9281l().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = a2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < cVar.mo2962b(); i++) {
            AbstractC1852a aVar3 = (AbstractC1852a) cVar.mo2959a(cVar.mo2963b(i));
            if (!(aVar3 == null || (aVar = (AbstractC1852a) cVar.mo2959a(aVar3.mo9301c().mo9282m())) == null)) {
                aVar3.mo9300b(aVar);
            }
        }
    }
}
