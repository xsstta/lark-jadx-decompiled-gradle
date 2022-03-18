package com.lark.falcon.engine.inspect.p1062a.p1064b;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.lark.falcon.engine.inspect.a.b.e */
public class C23998e {

    /* renamed from: a */
    private final BufferedInputStream f59360a;

    /* renamed from: b */
    private final AbstractC23999f f59361b;

    /* renamed from: c */
    private final ByteArrayOutputStream f59362c = new ByteArrayOutputStream();

    /* renamed from: a */
    public void mo86162a(AbstractC23997d dVar) throws IOException {
        C23994a aVar = new C23994a();
        do {
            aVar.mo86159a(this.f59360a);
            this.f59362c.write(aVar.f59359i, 0, (int) aVar.f59357g);
            if (aVar.f59351a) {
                byte[] byteArray = this.f59362c.toByteArray();
                dVar.mo86161a(aVar.f59355e, byteArray, byteArray.length);
                this.f59362c.reset();
            }
        } while (aVar.f59355e != 8);
    }

    public C23998e(InputStream inputStream, AbstractC23999f fVar) {
        this.f59360a = new BufferedInputStream(inputStream, 1024);
        this.f59361b = fVar;
    }
}
