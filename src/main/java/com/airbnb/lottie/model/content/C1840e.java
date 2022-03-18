package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1821c;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.model.p073a.C1824f;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1745i;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.e */
public class C1840e implements AbstractC1837b {

    /* renamed from: a */
    private final String f6331a;

    /* renamed from: b */
    private final GradientType f6332b;

    /* renamed from: c */
    private final C1821c f6333c;

    /* renamed from: d */
    private final C1822d f6334d;

    /* renamed from: e */
    private final C1824f f6335e;

    /* renamed from: f */
    private final C1824f f6336f;

    /* renamed from: g */
    private final C1820b f6337g;

    /* renamed from: h */
    private final ShapeStroke.LineCapType f6338h;

    /* renamed from: i */
    private final ShapeStroke.LineJoinType f6339i;

    /* renamed from: j */
    private final float f6340j;

    /* renamed from: k */
    private final List<C1820b> f6341k;

    /* renamed from: l */
    private final C1820b f6342l;

    /* renamed from: m */
    private final boolean f6343m;

    /* renamed from: a */
    public String mo9211a() {
        return this.f6331a;
    }

    /* renamed from: b */
    public GradientType mo9212b() {
        return this.f6332b;
    }

    /* renamed from: c */
    public C1821c mo9213c() {
        return this.f6333c;
    }

    /* renamed from: d */
    public C1822d mo9214d() {
        return this.f6334d;
    }

    /* renamed from: e */
    public C1824f mo9215e() {
        return this.f6335e;
    }

    /* renamed from: f */
    public C1824f mo9216f() {
        return this.f6336f;
    }

    /* renamed from: g */
    public C1820b mo9217g() {
        return this.f6337g;
    }

    /* renamed from: h */
    public ShapeStroke.LineCapType mo9218h() {
        return this.f6338h;
    }

    /* renamed from: i */
    public ShapeStroke.LineJoinType mo9219i() {
        return this.f6339i;
    }

    /* renamed from: j */
    public List<C1820b> mo9220j() {
        return this.f6341k;
    }

    /* renamed from: k */
    public C1820b mo9221k() {
        return this.f6342l;
    }

    /* renamed from: l */
    public float mo9222l() {
        return this.f6340j;
    }

    /* renamed from: m */
    public boolean mo9223m() {
        return this.f6343m;
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1745i(lottieDrawable, aVar, this);
    }

    public C1840e(String str, GradientType gradientType, C1821c cVar, C1822d dVar, C1824f fVar, C1824f fVar2, C1820b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<C1820b> list, C1820b bVar2, boolean z) {
        this.f6331a = str;
        this.f6332b = gradientType;
        this.f6333c = cVar;
        this.f6334d = dVar;
        this.f6335e = fVar;
        this.f6336f = fVar2;
        this.f6337g = bVar;
        this.f6338h = lineCapType;
        this.f6339i = lineJoinType;
        this.f6340j = f;
        this.f6341k = list;
        this.f6342l = bVar2;
        this.f6343m = z;
    }
}
