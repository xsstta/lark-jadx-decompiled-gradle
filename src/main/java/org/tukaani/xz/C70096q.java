package org.tukaani.xz;

/* renamed from: org.tukaani.xz.q */
class C70096q {
    /* renamed from: a */
    static void m268863a(AbstractC70089j[] jVarArr) throws UnsupportedOptionsException {
        for (int i = 0; i < jVarArr.length - 1; i++) {
            if (!jVarArr[i].mo246729b()) {
                throw new UnsupportedOptionsException("Unsupported XZ filter chain");
            }
        }
        if (jVarArr[jVarArr.length - 1].mo246730c()) {
            int i2 = 0;
            for (AbstractC70089j jVar : jVarArr) {
                if (jVar.mo246728a()) {
                    i2++;
                }
            }
            if (i2 > 3) {
                throw new UnsupportedOptionsException("Unsupported XZ filter chain");
            }
            return;
        }
        throw new UnsupportedOptionsException("Unsupported XZ filter chain");
    }
}
