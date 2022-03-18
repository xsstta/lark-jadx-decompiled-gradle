package com.airbnb.lottie.p067a.p068a;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.C1843h;
import com.airbnb.lottie.model.content.C1846k;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.q */
public class C1755q implements AbstractC1750m, AbstractC1758a.AbstractC1760a {

    /* renamed from: a */
    private final Path f6027a = new Path();

    /* renamed from: b */
    private final String f6028b;

    /* renamed from: c */
    private final boolean f6029c;

    /* renamed from: d */
    private final LottieDrawable f6030d;

    /* renamed from: e */
    private final AbstractC1758a<?, Path> f6031e;

    /* renamed from: f */
    private boolean f6032f;

    /* renamed from: g */
    private C1738b f6033g = new C1738b();

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        m7841c();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f6028b;
    }

    /* renamed from: c */
    private void m7841c() {
        this.f6032f = false;
        this.f6030d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1750m
    /* renamed from: e */
    public Path mo8942e() {
        if (this.f6032f) {
            return this.f6027a;
        }
        this.f6027a.reset();
        if (this.f6029c) {
            this.f6032f = true;
            return this.f6027a;
        }
        this.f6027a.set(this.f6031e.mo8960g());
        this.f6027a.setFillType(Path.FillType.EVEN_ODD);
        this.f6033g.mo8937a(this.f6027a);
        this.f6032f = true;
        return this.f6027a;
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC1739c cVar = list.get(i);
            if (cVar instanceof C1757s) {
                C1757s sVar = (C1757s) cVar;
                if (sVar.mo8945c() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f6033g.mo8938a(sVar);
                    sVar.mo8944a(this);
                }
            }
        }
    }

    public C1755q(LottieDrawable lottieDrawable, AbstractC1852a aVar, C1846k kVar) {
        this.f6028b = kVar.mo9250a();
        this.f6029c = kVar.mo9252c();
        this.f6030d = lottieDrawable;
        AbstractC1758a<C1843h, Path> a = kVar.mo9251b().mo9135a();
        this.f6031e = a;
        aVar.mo9294a(a);
        a.mo8953a(this);
    }
}
