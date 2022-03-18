package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.C1845j;
import com.airbnb.lottie.p067a.p068a.C1740d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.e */
public class C1859e extends AbstractC1852a {

    /* renamed from: f */
    private final C1740d f6441f;

    C1859e(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        C1740d dVar = new C1740d(lottieDrawable, this, new C1845j("__container", layer.mo9283n(), false));
        this.f6441f = dVar;
        dVar.mo8936a(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: b */
    public void mo9297b(Canvas canvas, Matrix matrix, int i) {
        this.f6441f.mo8932a(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC1852a, com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        super.mo8933a(rectF, matrix, z);
        this.f6441f.mo8933a(rectF, this.f6403a, z);
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: b */
    public void mo9299b(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        this.f6441f.mo8934a(dVar, i, list, dVar2);
    }
}
