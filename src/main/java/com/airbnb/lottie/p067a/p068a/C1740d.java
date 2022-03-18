package com.airbnb.lottie.p067a.p068a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.AbstractC1848e;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.AbstractC1837b;
import com.airbnb.lottie.model.content.C1845j;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1830l;
import com.airbnb.lottie.p067a.C1734a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1778o;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.d */
public class C1740d implements AbstractC1741e, AbstractC1750m, AbstractC1758a.AbstractC1760a, AbstractC1848e {

    /* renamed from: a */
    private Paint f5927a;

    /* renamed from: b */
    private RectF f5928b;

    /* renamed from: c */
    private final Matrix f5929c;

    /* renamed from: d */
    private final Path f5930d;

    /* renamed from: e */
    private final RectF f5931e;

    /* renamed from: f */
    private final String f5932f;

    /* renamed from: g */
    private final boolean f5933g;

    /* renamed from: h */
    private final List<AbstractC1739c> f5934h;

    /* renamed from: i */
    private final LottieDrawable f5935i;

    /* renamed from: j */
    private List<AbstractC1750m> f5936j;

    /* renamed from: k */
    private C1778o f5937k;

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f5932f;
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        this.f5935i.invalidateSelf();
    }

    /* renamed from: f */
    private boolean m7763f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f5934h.size(); i2++) {
            if ((this.f5934h.get(i2) instanceof AbstractC1741e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Matrix mo8941d() {
        C1778o oVar = this.f5937k;
        if (oVar != null) {
            return oVar.mo8995d();
        }
        this.f5929c.reset();
        return this.f5929c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<AbstractC1750m> mo8940c() {
        if (this.f5936j == null) {
            this.f5936j = new ArrayList();
            for (int i = 0; i < this.f5934h.size(); i++) {
                AbstractC1739c cVar = this.f5934h.get(i);
                if (cVar instanceof AbstractC1750m) {
                    this.f5936j.add((AbstractC1750m) cVar);
                }
            }
        }
        return this.f5936j;
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1750m
    /* renamed from: e */
    public Path mo8942e() {
        this.f5929c.reset();
        C1778o oVar = this.f5937k;
        if (oVar != null) {
            this.f5929c.set(oVar.mo8995d());
        }
        this.f5930d.reset();
        if (this.f5933g) {
            return this.f5930d;
        }
        for (int size = this.f5934h.size() - 1; size >= 0; size--) {
            AbstractC1739c cVar = this.f5934h.get(size);
            if (cVar instanceof AbstractC1750m) {
                this.f5930d.addPath(((AbstractC1750m) cVar).mo8942e(), this.f5929c);
            }
        }
        return this.f5930d;
    }

    /* renamed from: a */
    static C1830l m7761a(List<AbstractC1837b> list) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC1837b bVar = list.get(i);
            if (bVar instanceof C1830l) {
                return (C1830l) bVar;
            }
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        C1778o oVar = this.f5937k;
        if (oVar != null) {
            oVar.mo8991a(t, cVar);
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f5934h.size());
        arrayList.addAll(list);
        for (int size = this.f5934h.size() - 1; size >= 0; size--) {
            AbstractC1739c cVar = this.f5934h.get(size);
            cVar.mo8936a(arrayList, this.f5934h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    public C1740d(LottieDrawable lottieDrawable, AbstractC1852a aVar, C1845j jVar) {
        this(lottieDrawable, aVar, jVar.mo9246a(), jVar.mo9248c(), m7762a(lottieDrawable, aVar, jVar.mo9247b()), m7761a(jVar.mo9247b()));
    }

    /* renamed from: a */
    private static List<AbstractC1739c> m7762a(LottieDrawable lottieDrawable, AbstractC1852a aVar, List<AbstractC1837b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            AbstractC1739c a = list.get(i).mo9140a(lottieDrawable, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        this.f5929c.set(matrix);
        C1778o oVar = this.f5937k;
        if (oVar != null) {
            this.f5929c.preConcat(oVar.mo8995d());
        }
        this.f5931e.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        for (int size = this.f5934h.size() - 1; size >= 0; size--) {
            AbstractC1739c cVar = this.f5934h.get(size);
            if (cVar instanceof AbstractC1741e) {
                ((AbstractC1741e) cVar).mo8933a(this.f5931e, this.f5929c, z);
                rectF.union(this.f5931e);
            }
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8932a(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int i2;
        if (!this.f5933g) {
            this.f5929c.set(matrix);
            C1778o oVar = this.f5937k;
            if (oVar != null) {
                this.f5929c.preConcat(oVar.mo8995d());
                if (this.f5937k.mo8987a() == null) {
                    i2 = 100;
                } else {
                    i2 = this.f5937k.mo8987a().mo8960g().intValue();
                }
                i = (int) ((((((float) i2) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            if (!this.f5935i.mo8898h() || !m7763f() || i == 255) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f5928b.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                mo8933a(this.f5928b, this.f5929c, true);
                this.f5927a.setAlpha(i);
                C1791h.m8017a(canvas, this.f5928b, this.f5927a);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.f5934h.size() - 1; size >= 0; size--) {
                AbstractC1739c cVar = this.f5934h.get(size);
                if (cVar instanceof AbstractC1741e) {
                    ((AbstractC1741e) cVar).mo8932a(canvas, this.f5929c, i);
                }
            }
            if (z) {
                canvas.restore();
            }
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
                int b = i + dVar.mo9258b(mo8939b(), i);
                for (int i2 = 0; i2 < this.f5934h.size(); i2++) {
                    AbstractC1739c cVar = this.f5934h.get(i2);
                    if (cVar instanceof AbstractC1848e) {
                        ((AbstractC1848e) cVar).mo8934a(dVar, b, list, dVar2);
                    }
                }
            }
        }
    }

    C1740d(LottieDrawable lottieDrawable, AbstractC1852a aVar, String str, boolean z, List<AbstractC1739c> list, C1830l lVar) {
        this.f5927a = new C1734a();
        this.f5928b = new RectF();
        this.f5929c = new Matrix();
        this.f5930d = new Path();
        this.f5931e = new RectF();
        this.f5932f = str;
        this.f5935i = lottieDrawable;
        this.f5933g = z;
        this.f5934h = list;
        if (lVar != null) {
            C1778o j = lVar.mo9150j();
            this.f5937k = j;
            j.mo8990a(aVar);
            this.f5937k.mo8989a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC1739c cVar = list.get(size);
            if (cVar instanceof AbstractC1746j) {
                arrayList.add((AbstractC1746j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((AbstractC1746j) arrayList.get(size2)).mo8943a(list.listIterator(list.size()));
        }
    }
}
