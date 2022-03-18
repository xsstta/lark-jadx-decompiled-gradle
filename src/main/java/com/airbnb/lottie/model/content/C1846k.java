package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1826h;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1755q;

/* renamed from: com.airbnb.lottie.model.content.k */
public class C1846k implements AbstractC1837b {

    /* renamed from: a */
    private final String f6366a;

    /* renamed from: b */
    private final int f6367b;

    /* renamed from: c */
    private final C1826h f6368c;

    /* renamed from: d */
    private final boolean f6369d;

    /* renamed from: a */
    public String mo9250a() {
        return this.f6366a;
    }

    /* renamed from: b */
    public C1826h mo9251b() {
        return this.f6368c;
    }

    /* renamed from: c */
    public boolean mo9252c() {
        return this.f6369d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f6366a + ", index=" + this.f6367b + '}';
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1755q(lottieDrawable, aVar, this);
    }

    public C1846k(String str, int i, C1826h hVar, boolean z) {
        this.f6366a = str;
        this.f6367b = i;
        this.f6368c = hVar;
        this.f6369d = z;
    }
}
