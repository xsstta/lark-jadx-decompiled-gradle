package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1821c;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.model.p073a.C1824f;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1744h;

/* renamed from: com.airbnb.lottie.model.content.d */
public class C1839d implements AbstractC1837b {

    /* renamed from: a */
    private final GradientType f6321a;

    /* renamed from: b */
    private final Path.FillType f6322b;

    /* renamed from: c */
    private final C1821c f6323c;

    /* renamed from: d */
    private final C1822d f6324d;

    /* renamed from: e */
    private final C1824f f6325e;

    /* renamed from: f */
    private final C1824f f6326f;

    /* renamed from: g */
    private final String f6327g;

    /* renamed from: h */
    private final C1820b f6328h;

    /* renamed from: i */
    private final C1820b f6329i;

    /* renamed from: j */
    private final boolean f6330j;

    /* renamed from: a */
    public String mo9203a() {
        return this.f6327g;
    }

    /* renamed from: b */
    public GradientType mo9204b() {
        return this.f6321a;
    }

    /* renamed from: c */
    public Path.FillType mo9205c() {
        return this.f6322b;
    }

    /* renamed from: d */
    public C1821c mo9206d() {
        return this.f6323c;
    }

    /* renamed from: e */
    public C1822d mo9207e() {
        return this.f6324d;
    }

    /* renamed from: f */
    public C1824f mo9208f() {
        return this.f6325e;
    }

    /* renamed from: g */
    public C1824f mo9209g() {
        return this.f6326f;
    }

    /* renamed from: h */
    public boolean mo9210h() {
        return this.f6330j;
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1744h(lottieDrawable, aVar, this);
    }

    public C1839d(String str, GradientType gradientType, Path.FillType fillType, C1821c cVar, C1822d dVar, C1824f fVar, C1824f fVar2, C1820b bVar, C1820b bVar2, boolean z) {
        this.f6321a = gradientType;
        this.f6322b = fillType;
        this.f6323c = cVar;
        this.f6324d = dVar;
        this.f6325e = fVar;
        this.f6326f = fVar2;
        this.f6327g = str;
        this.f6328h = bVar;
        this.f6329i = bVar2;
        this.f6330j = z;
    }
}
