package com.ss.android.socialbase.downloader.p3027d;

import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.socialbase.downloader.d.e */
public class C60003e implements AbstractC60001c {

    /* renamed from: a */
    private final InputStream f149604a;

    /* renamed from: b */
    private final C60000b f149605b;

    @Override // com.ss.android.socialbase.downloader.p3027d.AbstractC60001c
    /* renamed from: a */
    public void mo204286a(C60000b bVar) {
    }

    @Override // com.ss.android.socialbase.downloader.p3027d.AbstractC60001c
    /* renamed from: a */
    public C60000b mo204285a() throws IOException {
        C60000b bVar = this.f149605b;
        bVar.f149602b = this.f149604a.read(bVar.f149601a);
        return this.f149605b;
    }

    @Override // com.ss.android.socialbase.downloader.p3027d.AbstractC60001c
    /* renamed from: b */
    public void mo204287b() {
        C60161d.m233767a(this.f149604a);
    }

    public C60003e(InputStream inputStream, int i) {
        this.f149604a = inputStream;
        this.f149605b = new C60000b(i);
    }
}
