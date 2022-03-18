package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.AbstractC1831m;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1824f;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1753o;

/* renamed from: com.airbnb.lottie.model.content.f */
public class C1841f implements AbstractC1837b {

    /* renamed from: a */
    private final String f6344a;

    /* renamed from: b */
    private final AbstractC1831m<PointF, PointF> f6345b;

    /* renamed from: c */
    private final C1824f f6346c;

    /* renamed from: d */
    private final C1820b f6347d;

    /* renamed from: e */
    private final boolean f6348e;

    /* renamed from: a */
    public String mo9224a() {
        return this.f6344a;
    }

    /* renamed from: b */
    public C1820b mo9225b() {
        return this.f6347d;
    }

    /* renamed from: c */
    public C1824f mo9226c() {
        return this.f6346c;
    }

    /* renamed from: d */
    public AbstractC1831m<PointF, PointF> mo9227d() {
        return this.f6345b;
    }

    /* renamed from: e */
    public boolean mo9228e() {
        return this.f6348e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f6345b + ", size=" + this.f6346c + '}';
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1753o(lottieDrawable, aVar, this);
    }

    public C1841f(String str, AbstractC1831m<PointF, PointF> mVar, C1824f fVar, C1820b bVar, boolean z) {
        this.f6344a = str;
        this.f6345b = mVar;
        this.f6346c = fVar;
        this.f6347d = bVar;
        this.f6348e = z;
    }
}
