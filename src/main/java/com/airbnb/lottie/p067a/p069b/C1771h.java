package com.airbnb.lottie.p067a.p069b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1793a;

/* renamed from: com.airbnb.lottie.a.b.h */
public class C1771h extends C1793a<PointF> {

    /* renamed from: h */
    private Path f6064h;

    /* renamed from: i */
    private final C1793a<PointF> f6065i;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Path mo8980b() {
        return this.f6064h;
    }

    /* renamed from: a */
    public void mo8979a() {
        boolean z;
        if (this.f6148b == null || this.f6147a == null || !((PointF) this.f6147a).equals(((PointF) this.f6148b).x, ((PointF) this.f6148b).y)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f6148b != null && !z) {
            this.f6064h = C1791h.m8016a((PointF) this.f6147a, (PointF) this.f6148b, this.f6065i.f6152f, this.f6065i.f6153g);
        }
    }

    public C1771h(C1792d dVar, C1793a<PointF> aVar) {
        super(dVar, aVar.f6147a, aVar.f6148b, aVar.f6149c, aVar.f6150d, aVar.f6151e);
        this.f6065i = aVar;
        mo8979a();
    }
}
