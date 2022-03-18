package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1830l;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1754p;

/* renamed from: com.airbnb.lottie.model.content.g */
public class C1842g implements AbstractC1837b {

    /* renamed from: a */
    private final String f6349a;

    /* renamed from: b */
    private final C1820b f6350b;

    /* renamed from: c */
    private final C1820b f6351c;

    /* renamed from: d */
    private final C1830l f6352d;

    /* renamed from: e */
    private final boolean f6353e;

    /* renamed from: a */
    public String mo9230a() {
        return this.f6349a;
    }

    /* renamed from: b */
    public C1820b mo9231b() {
        return this.f6350b;
    }

    /* renamed from: c */
    public C1820b mo9232c() {
        return this.f6351c;
    }

    /* renamed from: d */
    public C1830l mo9233d() {
        return this.f6352d;
    }

    /* renamed from: e */
    public boolean mo9234e() {
        return this.f6353e;
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1754p(lottieDrawable, aVar, this);
    }

    public C1842g(String str, C1820b bVar, C1820b bVar2, C1830l lVar, boolean z) {
        this.f6349a = str;
        this.f6350b = bVar;
        this.f6351c = bVar2;
        this.f6352d = lVar;
        this.f6353e = z;
    }
}
