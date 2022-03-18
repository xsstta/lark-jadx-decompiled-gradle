package com.lark.falcon.engine.inspect.p1062a.p1064b;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.lark.falcon.engine.inspect.a.b.l */
class C24007l {

    /* renamed from: a */
    private final BufferedOutputStream f59374a;

    public C24007l(OutputStream outputStream) {
        this.f59374a = new BufferedOutputStream(outputStream, 1024);
    }

    /* renamed from: a */
    public synchronized void mo86174a(C23994a aVar, AbstractC24006k kVar) {
        try {
            aVar.mo86160a(this.f59374a);
            this.f59374a.flush();
            kVar.mo86172a();
        } catch (IOException e) {
            kVar.mo86173a(e);
        }
        return;
    }
}
