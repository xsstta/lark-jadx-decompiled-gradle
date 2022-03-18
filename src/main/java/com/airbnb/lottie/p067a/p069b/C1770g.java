package com.airbnb.lottie.p067a.p069b;

import android.graphics.Path;
import com.airbnb.lottie.model.content.C1843h;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.g */
public class C1770g {

    /* renamed from: a */
    private final List<AbstractC1758a<C1843h, Path>> f6061a;

    /* renamed from: b */
    private final List<AbstractC1758a<Integer, Integer>> f6062b;

    /* renamed from: c */
    private final List<Mask> f6063c;

    /* renamed from: a */
    public List<Mask> mo8976a() {
        return this.f6063c;
    }

    /* renamed from: b */
    public List<AbstractC1758a<C1843h, Path>> mo8977b() {
        return this.f6061a;
    }

    /* renamed from: c */
    public List<AbstractC1758a<Integer, Integer>> mo8978c() {
        return this.f6062b;
    }

    public C1770g(List<Mask> list) {
        this.f6063c = list;
        this.f6061a = new ArrayList(list.size());
        this.f6062b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f6061a.add(list.get(i).mo9158b().mo9135a());
            this.f6062b.add(list.get(i).mo9159c().mo9135a());
        }
    }
}
