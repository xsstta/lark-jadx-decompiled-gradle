package com.tt.miniapp.p3357x.p3359b;

import java.io.File;

/* renamed from: com.tt.miniapp.x.b.f */
public class C67410f extends AbstractC67405a {
    public C67410f(AbstractC67405a aVar) {
        this.f170004a = new File(aVar.mo234085a(), "extsrc");
        if (!this.f170004a.exists()) {
            this.f170004a.mkdirs();
        }
    }
}
