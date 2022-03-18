package com.airbnb.lottie.p067a.p068a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.C1842g;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1778o;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1795c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.p */
public class C1754p implements AbstractC1741e, AbstractC1746j, AbstractC1747k, AbstractC1750m, AbstractC1758a.AbstractC1760a {

    /* renamed from: a */
    private final Matrix f6017a = new Matrix();

    /* renamed from: b */
    private final Path f6018b = new Path();

    /* renamed from: c */
    private final LottieDrawable f6019c;

    /* renamed from: d */
    private final AbstractC1852a f6020d;

    /* renamed from: e */
    private final String f6021e;

    /* renamed from: f */
    private final boolean f6022f;

    /* renamed from: g */
    private final AbstractC1758a<Float, Float> f6023g;

    /* renamed from: h */
    private final AbstractC1758a<Float, Float> f6024h;

    /* renamed from: i */
    private final C1778o f6025i;

    /* renamed from: j */
    private C1740d f6026j;

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f6021e;
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        this.f6019c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1750m
    /* renamed from: e */
    public Path mo8942e() {
        Path e = this.f6026j.mo8942e();
        this.f6018b.reset();
        float floatValue = this.f6023g.mo8960g().floatValue();
        float floatValue2 = this.f6024h.mo8960g().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f6017a.set(this.f6025i.mo8992b(((float) i) + floatValue2));
            this.f6018b.addPath(e, this.f6017a);
        }
        return this.f6018b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1746j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8943a(java.util.ListIterator<com.airbnb.lottie.p067a.p068a.AbstractC1739c> r9) {
        /*
            r8 = this;
            com.airbnb.lottie.a.a.d r0 = r8.f6026j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            com.airbnb.lottie.a.a.d r9 = new com.airbnb.lottie.a.a.d
            com.airbnb.lottie.LottieDrawable r2 = r8.f6019c
            com.airbnb.lottie.model.layer.a r3 = r8.f6020d
            boolean r5 = r8.f6022f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f6026j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p067a.p068a.C1754p.mo8943a(java.util.ListIterator):void");
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        if (!this.f6025i.mo8991a(t, cVar)) {
            if (t == AbstractC1810j.f6214q) {
                this.f6023g.mo8954a(cVar);
            } else if (t == AbstractC1810j.f6215r) {
                this.f6024h.mo8954a(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
        this.f6026j.mo8936a(list, list2);
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        this.f6026j.mo8933a(rectF, matrix, z);
    }

    public C1754p(LottieDrawable lottieDrawable, AbstractC1852a aVar, C1842g gVar) {
        this.f6019c = lottieDrawable;
        this.f6020d = aVar;
        this.f6021e = gVar.mo9230a();
        this.f6022f = gVar.mo9234e();
        AbstractC1758a<Float, Float> a = gVar.mo9231b().mo9135a();
        this.f6023g = a;
        aVar.mo9294a(a);
        a.mo8953a(this);
        AbstractC1758a<Float, Float> a2 = gVar.mo9232c().mo9135a();
        this.f6024h = a2;
        aVar.mo9294a(a2);
        a2.mo8953a(this);
        C1778o j = gVar.mo9233d().mo9150j();
        this.f6025i = j;
        j.mo8990a(aVar);
        j.mo8989a(this);
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8932a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f6023g.mo8960g().floatValue();
        float floatValue2 = this.f6024h.mo8960g().floatValue();
        float floatValue3 = this.f6025i.mo8993b().mo8960g().floatValue() / 100.0f;
        float floatValue4 = this.f6025i.mo8994c().mo8960g().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f6017a.set(matrix);
            float f = (float) i2;
            this.f6017a.preConcat(this.f6025i.mo8992b(f + floatValue2));
            this.f6026j.mo8932a(canvas, this.f6017a, (int) (((float) i) * C1790g.m8000a(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public void mo8934a(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        C1790g.m8007a(dVar, i, list, dVar2, this);
    }
}
