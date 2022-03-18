package com.airbnb.lottie.p067a.p068a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1765b;
import com.airbnb.lottie.p067a.p069b.C1779p;
import com.airbnb.lottie.p072d.C1795c;

/* renamed from: com.airbnb.lottie.a.a.r */
public class C1756r extends AbstractC1735a {

    /* renamed from: c */
    private final AbstractC1852a f6034c;

    /* renamed from: d */
    private final String f6035d;

    /* renamed from: e */
    private final boolean f6036e;

    /* renamed from: f */
    private final AbstractC1758a<Integer, Integer> f6037f;

    /* renamed from: g */
    private AbstractC1758a<ColorFilter, ColorFilter> f6038g;

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f6035d;
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e, com.airbnb.lottie.p067a.p068a.AbstractC1735a
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        super.mo8935a(t, cVar);
        if (t == AbstractC1810j.f6199b) {
            this.f6037f.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6196C) {
            AbstractC1758a<ColorFilter, ColorFilter> aVar = this.f6038g;
            if (aVar != null) {
                this.f6034c.mo9298b(aVar);
            }
            if (cVar == null) {
                this.f6038g = null;
                return;
            }
            C1779p pVar = new C1779p(cVar);
            this.f6038g = pVar;
            pVar.mo8953a(this);
            this.f6034c.mo9294a(this.f6037f);
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1735a, com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8932a(Canvas canvas, Matrix matrix, int i) {
        if (!this.f6036e) {
            this.f5911b.setColor(((C1765b) this.f6037f).mo8970i());
            if (this.f6038g != null) {
                this.f5911b.setColorFilter(this.f6038g.mo8960g());
            }
            super.mo8932a(canvas, matrix, i);
        }
    }

    public C1756r(LottieDrawable lottieDrawable, AbstractC1852a aVar, ShapeStroke shapeStroke) {
        super(lottieDrawable, aVar, shapeStroke.mo9181g().toPaintCap(), shapeStroke.mo9182h().toPaintJoin(), shapeStroke.mo9183i(), shapeStroke.mo9177c(), shapeStroke.mo9178d(), shapeStroke.mo9179e(), shapeStroke.mo9180f());
        this.f6034c = aVar;
        this.f6035d = shapeStroke.mo9175a();
        this.f6036e = shapeStroke.mo9184j();
        AbstractC1758a<Integer, Integer> a = shapeStroke.mo9176b().mo9135a();
        this.f6037f = a;
        a.mo8953a(this);
        aVar.mo9294a(a);
    }
}
