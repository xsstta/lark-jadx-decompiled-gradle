package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.AbstractC1831m;
import com.airbnb.lottie.model.p073a.C1824f;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1742f;

/* renamed from: com.airbnb.lottie.model.content.a */
public class C1836a implements AbstractC1837b {

    /* renamed from: a */
    private final String f6314a;

    /* renamed from: b */
    private final AbstractC1831m<PointF, PointF> f6315b;

    /* renamed from: c */
    private final C1824f f6316c;

    /* renamed from: d */
    private final boolean f6317d;

    /* renamed from: e */
    private final boolean f6318e;

    /* renamed from: a */
    public String mo9194a() {
        return this.f6314a;
    }

    /* renamed from: b */
    public AbstractC1831m<PointF, PointF> mo9195b() {
        return this.f6315b;
    }

    /* renamed from: c */
    public C1824f mo9196c() {
        return this.f6316c;
    }

    /* renamed from: d */
    public boolean mo9197d() {
        return this.f6317d;
    }

    /* renamed from: e */
    public boolean mo9198e() {
        return this.f6318e;
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1742f(lottieDrawable, aVar, this);
    }

    public C1836a(String str, AbstractC1831m<PointF, PointF> mVar, C1824f fVar, boolean z, boolean z2) {
        this.f6314a = str;
        this.f6315b = mVar;
        this.f6316c = fVar;
        this.f6317d = z;
        this.f6318e = z2;
    }
}
