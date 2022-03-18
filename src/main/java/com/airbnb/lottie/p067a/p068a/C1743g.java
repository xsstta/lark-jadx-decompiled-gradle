package com.airbnb.lottie.p067a.p068a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.C1783c;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.C1844i;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.C1734a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1765b;
import com.airbnb.lottie.p067a.p069b.C1779p;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1795c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.g */
public class C1743g implements AbstractC1741e, AbstractC1747k, AbstractC1758a.AbstractC1760a {

    /* renamed from: a */
    private final Path f5946a;

    /* renamed from: b */
    private final Paint f5947b = new C1734a(1);

    /* renamed from: c */
    private final AbstractC1852a f5948c;

    /* renamed from: d */
    private final String f5949d;

    /* renamed from: e */
    private final boolean f5950e;

    /* renamed from: f */
    private final List<AbstractC1750m> f5951f = new ArrayList();

    /* renamed from: g */
    private final AbstractC1758a<Integer, Integer> f5952g;

    /* renamed from: h */
    private final AbstractC1758a<Integer, Integer> f5953h;

    /* renamed from: i */
    private AbstractC1758a<ColorFilter, ColorFilter> f5954i;

    /* renamed from: j */
    private final LottieDrawable f5955j;

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f5949d;
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        this.f5955j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            AbstractC1739c cVar = list2.get(i);
            if (cVar instanceof AbstractC1750m) {
                this.f5951f.add((AbstractC1750m) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        if (t == AbstractC1810j.f6198a) {
            this.f5952g.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6201d) {
            this.f5953h.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6196C) {
            AbstractC1758a<ColorFilter, ColorFilter> aVar = this.f5954i;
            if (aVar != null) {
                this.f5948c.mo9298b(aVar);
            }
            if (cVar == null) {
                this.f5954i = null;
                return;
            }
            C1779p pVar = new C1779p(cVar);
            this.f5954i = pVar;
            pVar.mo8953a(this);
            this.f5948c.mo9294a(this.f5954i);
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        this.f5946a.reset();
        for (int i = 0; i < this.f5951f.size(); i++) {
            this.f5946a.addPath(this.f5951f.get(i).mo8942e(), matrix);
        }
        this.f5946a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public C1743g(LottieDrawable lottieDrawable, AbstractC1852a aVar, C1844i iVar) {
        Path path = new Path();
        this.f5946a = path;
        this.f5948c = aVar;
        this.f5949d = iVar.mo9240a();
        this.f5950e = iVar.mo9244e();
        this.f5955j = lottieDrawable;
        if (iVar.mo9241b() == null || iVar.mo9242c() == null) {
            this.f5952g = null;
            this.f5953h = null;
            return;
        }
        path.setFillType(iVar.mo9243d());
        AbstractC1758a<Integer, Integer> a = iVar.mo9241b().mo9135a();
        this.f5952g = a;
        a.mo8953a(this);
        aVar.mo9294a(a);
        AbstractC1758a<Integer, Integer> a2 = iVar.mo9242c().mo9135a();
        this.f5953h = a2;
        a2.mo8953a(this);
        aVar.mo9294a(a2);
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8932a(Canvas canvas, Matrix matrix, int i) {
        if (!this.f5950e) {
            C1783c.m7956a("FillContent#draw");
            this.f5947b.setColor(((C1765b) this.f5952g).mo8970i());
            this.f5947b.setAlpha(C1790g.m8004a((int) ((((((float) i) / 255.0f) * ((float) this.f5953h.mo8960g().intValue())) / 100.0f) * 255.0f), 0, 255));
            AbstractC1758a<ColorFilter, ColorFilter> aVar = this.f5954i;
            if (aVar != null) {
                this.f5947b.setColorFilter(aVar.mo8960g());
            }
            this.f5946a.reset();
            for (int i2 = 0; i2 < this.f5951f.size(); i2++) {
                this.f5946a.addPath(this.f5951f.get(i2).mo8942e(), matrix);
            }
            canvas.drawPath(this.f5946a, this.f5947b);
            C1783c.m7957b("FillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public void mo8934a(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        C1790g.m8007a(dVar, i, list, dVar2, this);
    }
}
