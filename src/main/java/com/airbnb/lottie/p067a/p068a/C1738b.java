package com.airbnb.lottie.p067a.p068a;

import android.graphics.Path;
import com.airbnb.lottie.p071c.C1791h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.b */
public class C1738b {

    /* renamed from: a */
    private List<C1757s> f5926a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8938a(C1757s sVar) {
        this.f5926a.add(sVar);
    }

    /* renamed from: a */
    public void mo8937a(Path path) {
        for (int size = this.f5926a.size() - 1; size >= 0; size--) {
            C1791h.m8020a(path, this.f5926a.get(size));
        }
    }
}
