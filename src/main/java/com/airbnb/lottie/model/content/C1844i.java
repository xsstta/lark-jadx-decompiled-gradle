package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1819a;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1743g;

/* renamed from: com.airbnb.lottie.model.content.i */
public class C1844i implements AbstractC1837b {

    /* renamed from: a */
    private final boolean f6357a;

    /* renamed from: b */
    private final Path.FillType f6358b;

    /* renamed from: c */
    private final String f6359c;

    /* renamed from: d */
    private final C1819a f6360d;

    /* renamed from: e */
    private final C1822d f6361e;

    /* renamed from: f */
    private final boolean f6362f;

    /* renamed from: a */
    public String mo9240a() {
        return this.f6359c;
    }

    /* renamed from: b */
    public C1819a mo9241b() {
        return this.f6360d;
    }

    /* renamed from: c */
    public C1822d mo9242c() {
        return this.f6361e;
    }

    /* renamed from: d */
    public Path.FillType mo9243d() {
        return this.f6358b;
    }

    /* renamed from: e */
    public boolean mo9244e() {
        return this.f6362f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f6357a + '}';
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1743g(lottieDrawable, aVar, this);
    }

    public C1844i(String str, boolean z, Path.FillType fillType, C1819a aVar, C1822d dVar, boolean z2) {
        this.f6359c = str;
        this.f6357a = z;
        this.f6358b = fillType;
        this.f6360d = aVar;
        this.f6361e = dVar;
        this.f6362f = z2;
    }
}
