package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1740d;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.j */
public class C1845j implements AbstractC1837b {

    /* renamed from: a */
    private final String f6363a;

    /* renamed from: b */
    private final List<AbstractC1837b> f6364b;

    /* renamed from: c */
    private final boolean f6365c;

    /* renamed from: a */
    public String mo9246a() {
        return this.f6363a;
    }

    /* renamed from: b */
    public List<AbstractC1837b> mo9247b() {
        return this.f6364b;
    }

    /* renamed from: c */
    public boolean mo9248c() {
        return this.f6365c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f6363a + "' Shapes: " + Arrays.toString(this.f6364b.toArray()) + '}';
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1740d(lottieDrawable, aVar, this);
    }

    public C1845j(String str, List<AbstractC1837b> list, boolean z) {
        this.f6363a = str;
        this.f6364b = list;
        this.f6365c = z;
    }
}
