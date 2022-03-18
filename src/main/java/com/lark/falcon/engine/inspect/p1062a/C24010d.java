package com.lark.falcon.engine.inspect.p1062a;

import android.net.LocalSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.lark.falcon.engine.inspect.a.d */
public class C24010d {

    /* renamed from: a */
    private final LocalSocket f59382a;

    /* renamed from: b */
    private final C23993b f59383b;

    /* renamed from: a */
    public InputStream mo86179a() throws IOException {
        return this.f59383b.mo86155a();
    }

    /* renamed from: b */
    public OutputStream mo86180b() throws IOException {
        return this.f59382a.getOutputStream();
    }

    public C24010d(LocalSocket localSocket, C23993b bVar) {
        this.f59382a = localSocket;
        this.f59383b = bVar;
    }

    public C24010d(C24010d dVar, C23993b bVar) {
        this(dVar.f59382a, bVar);
    }
}
