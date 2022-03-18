package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class bb {

    /* renamed from: a */
    private final Map<String, Double> f55761a = new HashMap();

    bb() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized double mo78757a(String str, br brVar) {
        double d;
        d = 1.0d;
        if (brVar instanceof av) {
            d = (((double) ((av) brVar).f55723e) + 1.0d) / ((double) ((av) brVar).f55724f);
        }
        this.f55761a.put(str, Double.valueOf(d));
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo78758a(String str) {
        this.f55761a.put(str, Double.valueOf(0.0d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized double mo78759b(String str) {
        Double d = this.f55761a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }
}
