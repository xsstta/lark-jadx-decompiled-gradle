package com.airbnb.lottie.p067a.p068a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.C1783c;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.p067a.C1734a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1766c;
import com.airbnb.lottie.p067a.p069b.C1768e;
import com.airbnb.lottie.p067a.p069b.C1779p;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.a */
public abstract class AbstractC1735a implements AbstractC1741e, AbstractC1747k, AbstractC1758a.AbstractC1760a {

    /* renamed from: a */
    protected final AbstractC1852a f5910a;

    /* renamed from: b */
    final Paint f5911b;

    /* renamed from: c */
    private final PathMeasure f5912c = new PathMeasure();

    /* renamed from: d */
    private final Path f5913d = new Path();

    /* renamed from: e */
    private final Path f5914e = new Path();

    /* renamed from: f */
    private final RectF f5915f = new RectF();

    /* renamed from: g */
    private final LottieDrawable f5916g;

    /* renamed from: h */
    private final List<C1737a> f5917h = new ArrayList();

    /* renamed from: i */
    private final float[] f5918i;

    /* renamed from: j */
    private final AbstractC1758a<?, Float> f5919j;

    /* renamed from: k */
    private final AbstractC1758a<?, Integer> f5920k;

    /* renamed from: l */
    private final List<AbstractC1758a<?, Float>> f5921l;

    /* renamed from: m */
    private final AbstractC1758a<?, Float> f5922m;

    /* renamed from: n */
    private AbstractC1758a<ColorFilter, ColorFilter> f5923n;

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        this.f5916g.invalidateSelf();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.airbnb.lottie.a.a.a$a */
    public static final class C1737a {

        /* renamed from: a */
        public final List<AbstractC1750m> f5924a;

        /* renamed from: b */
        public final C1757s f5925b;

        private C1737a(C1757s sVar) {
            this.f5924a = new ArrayList();
            this.f5925b = sVar;
        }
    }

    /* renamed from: a */
    private void m7750a(Matrix matrix) {
        float f;
        C1783c.m7956a("StrokeContent#applyDashPattern");
        if (this.f5921l.isEmpty()) {
            C1783c.m7957b("StrokeContent#applyDashPattern");
            return;
        }
        float a = C1791h.m8013a(matrix);
        for (int i = 0; i < this.f5921l.size(); i++) {
            this.f5918i[i] = this.f5921l.get(i).mo8960g().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f5918i;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f5918i;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f5918i;
            fArr3[i] = fArr3[i] * a;
        }
        AbstractC1758a<?, Float> aVar = this.f5922m;
        if (aVar == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = a * aVar.mo8960g().floatValue();
        }
        this.f5911b.setPathEffect(new DashPathEffect(this.f5918i, f));
        C1783c.m7957b("StrokeContent#applyDashPattern");
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        if (t == AbstractC1810j.f6201d) {
            this.f5920k.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6212o) {
            this.f5919j.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6196C) {
            AbstractC1758a<ColorFilter, ColorFilter> aVar = this.f5923n;
            if (aVar != null) {
                this.f5910a.mo9298b(aVar);
            }
            if (cVar == null) {
                this.f5923n = null;
                return;
            }
            C1779p pVar = new C1779p(cVar);
            this.f5923n = pVar;
            pVar.mo8953a(this);
            this.f5910a.mo9294a(this.f5923n);
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
        C1757s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC1739c cVar = list.get(size);
            if (cVar instanceof C1757s) {
                C1757s sVar2 = (C1757s) cVar;
                if (sVar2.mo8945c() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.mo8944a(this);
        }
        C1737a aVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            AbstractC1739c cVar2 = list2.get(size2);
            if (cVar2 instanceof C1757s) {
                C1757s sVar3 = (C1757s) cVar2;
                if (sVar3.mo8945c() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (aVar != null) {
                        this.f5917h.add(aVar);
                    }
                    aVar = new C1737a(sVar3);
                    sVar3.mo8944a(this);
                }
            }
            if (cVar2 instanceof AbstractC1750m) {
                if (aVar == null) {
                    aVar = new C1737a(sVar);
                }
                aVar.f5924a.add((AbstractC1750m) cVar2);
            }
        }
        if (aVar != null) {
            this.f5917h.add(aVar);
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8932a(Canvas canvas, Matrix matrix, int i) {
        C1783c.m7956a("StrokeContent#draw");
        if (C1791h.m8024b(matrix)) {
            C1783c.m7957b("StrokeContent#draw");
            return;
        }
        this.f5911b.setAlpha(C1790g.m8004a((int) ((((((float) i) / 255.0f) * ((float) ((C1768e) this.f5920k).mo8970i())) / 100.0f) * 255.0f), 0, 255));
        this.f5911b.setStrokeWidth(((C1766c) this.f5919j).mo8970i() * C1791h.m8013a(matrix));
        if (this.f5911b.getStrokeWidth() <= BitmapDescriptorFactory.HUE_RED) {
            C1783c.m7957b("StrokeContent#draw");
            return;
        }
        m7750a(matrix);
        AbstractC1758a<ColorFilter, ColorFilter> aVar = this.f5923n;
        if (aVar != null) {
            this.f5911b.setColorFilter(aVar.mo8960g());
        }
        for (int i2 = 0; i2 < this.f5917h.size(); i2++) {
            C1737a aVar2 = this.f5917h.get(i2);
            if (aVar2.f5925b != null) {
                m7749a(canvas, aVar2, matrix);
            } else {
                C1783c.m7956a("StrokeContent#buildPath");
                this.f5913d.reset();
                for (int size = aVar2.f5924a.size() - 1; size >= 0; size--) {
                    this.f5913d.addPath(aVar2.f5924a.get(size).mo8942e(), matrix);
                }
                C1783c.m7957b("StrokeContent#buildPath");
                C1783c.m7956a("StrokeContent#drawPath");
                canvas.drawPath(this.f5913d, this.f5911b);
                C1783c.m7957b("StrokeContent#drawPath");
            }
        }
        C1783c.m7957b("StrokeContent#draw");
    }

    /* renamed from: a */
    private void m7749a(Canvas canvas, C1737a aVar, Matrix matrix) {
        float f;
        float f2;
        C1783c.m7956a("StrokeContent#applyTrimPath");
        if (aVar.f5925b == null) {
            C1783c.m7957b("StrokeContent#applyTrimPath");
            return;
        }
        this.f5913d.reset();
        for (int size = aVar.f5924a.size() - 1; size >= 0; size--) {
            this.f5913d.addPath(aVar.f5924a.get(size).mo8942e(), matrix);
        }
        this.f5912c.setPath(this.f5913d, false);
        float length = this.f5912c.getLength();
        while (this.f5912c.nextContour()) {
            length += this.f5912c.getLength();
        }
        float floatValue = (aVar.f5925b.mo8948f().mo8960g().floatValue() * length) / 360.0f;
        float floatValue2 = ((aVar.f5925b.mo8946d().mo8960g().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((aVar.f5925b.mo8947e().mo8960g().floatValue() * length) / 100.0f) + floatValue;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        for (int size2 = aVar.f5924a.size() - 1; size2 >= 0; size2--) {
            this.f5914e.set(aVar.f5924a.get(size2).mo8942e());
            this.f5914e.transform(matrix);
            this.f5912c.setPath(this.f5914e, false);
            float length2 = this.f5912c.getLength();
            float f4 = 1.0f;
            if (floatValue3 > length) {
                float f5 = floatValue3 - length;
                if (f5 < f3 + length2 && f3 < f5) {
                    if (floatValue2 > length) {
                        f2 = (floatValue2 - length) / length2;
                    } else {
                        f2 = BitmapDescriptorFactory.HUE_RED;
                    }
                    C1791h.m8019a(this.f5914e, f2, Math.min(f5 / length2, 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
                    canvas.drawPath(this.f5914e, this.f5911b);
                    f3 += length2;
                }
            }
            float f6 = f3 + length2;
            if (f6 >= floatValue2 && f3 <= floatValue3) {
                if (f6 > floatValue3 || floatValue2 >= f3) {
                    if (floatValue2 < f3) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f = (floatValue2 - f3) / length2;
                    }
                    if (floatValue3 <= f6) {
                        f4 = (floatValue3 - f3) / length2;
                    }
                    C1791h.m8019a(this.f5914e, f, f4, (float) BitmapDescriptorFactory.HUE_RED);
                    canvas.drawPath(this.f5914e, this.f5911b);
                } else {
                    canvas.drawPath(this.f5914e, this.f5911b);
                }
            }
            f3 += length2;
        }
        C1783c.m7957b("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        C1783c.m7956a("StrokeContent#getBounds");
        this.f5913d.reset();
        for (int i = 0; i < this.f5917h.size(); i++) {
            C1737a aVar = this.f5917h.get(i);
            for (int i2 = 0; i2 < aVar.f5924a.size(); i2++) {
                this.f5913d.addPath(aVar.f5924a.get(i2).mo8942e(), matrix);
            }
        }
        this.f5913d.computeBounds(this.f5915f, false);
        float i3 = ((C1766c) this.f5919j).mo8970i();
        RectF rectF2 = this.f5915f;
        float f = i3 / 2.0f;
        rectF2.set(rectF2.left - f, this.f5915f.top - f, this.f5915f.right + f, this.f5915f.bottom + f);
        rectF.set(this.f5915f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C1783c.m7957b("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public void mo8934a(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        C1790g.m8007a(dVar, i, list, dVar2, this);
    }

    AbstractC1735a(LottieDrawable lottieDrawable, AbstractC1852a aVar, Paint.Cap cap, Paint.Join join, float f, C1822d dVar, C1820b bVar, List<C1820b> list, C1820b bVar2) {
        C1734a aVar2 = new C1734a(1);
        this.f5911b = aVar2;
        this.f5916g = lottieDrawable;
        this.f5910a = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f);
        this.f5920k = dVar.mo9135a();
        this.f5919j = bVar.mo9135a();
        if (bVar2 == null) {
            this.f5922m = null;
        } else {
            this.f5922m = bVar2.mo9135a();
        }
        this.f5921l = new ArrayList(list.size());
        this.f5918i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f5921l.add(list.get(i).mo9135a());
        }
        aVar.mo9294a(this.f5920k);
        aVar.mo9294a(this.f5919j);
        for (int i2 = 0; i2 < this.f5921l.size(); i2++) {
            aVar.mo9294a(this.f5921l.get(i2));
        }
        AbstractC1758a<?, Float> aVar3 = this.f5922m;
        if (aVar3 != null) {
            aVar.mo9294a(aVar3);
        }
        this.f5920k.mo8953a(this);
        this.f5919j.mo8953a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f5921l.get(i3).mo8953a(this);
        }
        AbstractC1758a<?, Float> aVar4 = this.f5922m;
        if (aVar4 != null) {
            aVar4.mo8953a(this);
        }
    }
}
