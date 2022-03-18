package com.airbnb.lottie.p067a.p068a;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.s */
public class C1757s implements AbstractC1739c, AbstractC1758a.AbstractC1760a {

    /* renamed from: a */
    private final String f6039a;

    /* renamed from: b */
    private final boolean f6040b;

    /* renamed from: c */
    private final List<AbstractC1758a.AbstractC1760a> f6041c = new ArrayList();

    /* renamed from: d */
    private final ShapeTrimPath.Type f6042d;

    /* renamed from: e */
    private final AbstractC1758a<?, Float> f6043e;

    /* renamed from: f */
    private final AbstractC1758a<?, Float> f6044f;

    /* renamed from: g */
    private final AbstractC1758a<?, Float> f6045g;

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f6039a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ShapeTrimPath.Type mo8945c() {
        return this.f6042d;
    }

    /* renamed from: d */
    public AbstractC1758a<?, Float> mo8946d() {
        return this.f6043e;
    }

    /* renamed from: e */
    public AbstractC1758a<?, Float> mo8947e() {
        return this.f6044f;
    }

    /* renamed from: f */
    public AbstractC1758a<?, Float> mo8948f() {
        return this.f6045g;
    }

    /* renamed from: g */
    public boolean mo8949g() {
        return this.f6040b;
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        for (int i = 0; i < this.f6041c.size(); i++) {
            this.f6041c.get(i).mo8931a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8944a(AbstractC1758a.AbstractC1760a aVar) {
        this.f6041c.add(aVar);
    }

    public C1757s(AbstractC1852a aVar, ShapeTrimPath shapeTrimPath) {
        this.f6039a = shapeTrimPath.mo9187a();
        this.f6040b = shapeTrimPath.mo9192f();
        this.f6042d = shapeTrimPath.mo9188b();
        AbstractC1758a<Float, Float> a = shapeTrimPath.mo9190d().mo9135a();
        this.f6043e = a;
        AbstractC1758a<Float, Float> a2 = shapeTrimPath.mo9189c().mo9135a();
        this.f6044f = a2;
        AbstractC1758a<Float, Float> a3 = shapeTrimPath.mo9191e().mo9135a();
        this.f6045g = a3;
        aVar.mo9294a(a);
        aVar.mo9294a(a2);
        aVar.mo9294a(a3);
        a.mo8953a(this);
        a2.mo8953a(this);
        a3.mo8953a(this);
    }
}
