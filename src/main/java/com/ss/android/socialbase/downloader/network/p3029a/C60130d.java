package com.ss.android.socialbase.downloader.network.p3029a;

import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.AbstractC60137g;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.network.a.d */
public class C60130d implements AbstractC60137g {

    /* renamed from: a */
    protected final Object f150054a;

    /* renamed from: b */
    private final List<HttpHeader> f150055b;

    /* renamed from: c */
    private AbstractC60137g f150056c;

    /* renamed from: d */
    private boolean f150057d;

    /* renamed from: e */
    private long f150058e;

    /* renamed from: f */
    private InputStream f150059f;

    /* renamed from: a */
    public boolean mo205434a(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: f */
    public List<HttpHeader> mo205436f() {
        return this.f150055b;
    }

    @Override // com.ss.android.socialbase.downloader.network.AbstractC60135e
    /* renamed from: b */
    public void mo204947b() {
        AbstractC60137g gVar = this.f150056c;
        if (gVar != null) {
            gVar.mo204947b();
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.AbstractC60137g
    /* renamed from: c */
    public InputStream mo204949c() throws IOException {
        InputStream inputStream = this.f150059f;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.network.AbstractC60137g
    /* renamed from: d */
    public void mo204950d() {
        AbstractC60137g gVar = this.f150056c;
        if (gVar != null) {
            gVar.mo204950d();
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.AbstractC60135e
    /* renamed from: a */
    public int mo204945a() throws IOException {
        AbstractC60137g gVar = this.f150056c;
        if (gVar != null) {
            return gVar.mo204945a();
        }
        return 0;
    }

    /* renamed from: e */
    public void mo205435e() throws InterruptedException {
        synchronized (this.f150054a) {
            if (this.f150057d && this.f150056c == null) {
                this.f150054a.wait();
            }
        }
    }

    /* renamed from: g */
    public boolean mo205437g() {
        try {
            AbstractC60137g gVar = this.f150056c;
            if (gVar == null || !mo205434a(gVar.mo204945a())) {
                return false;
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: h */
    public boolean mo205438h() {
        if (System.currentTimeMillis() - this.f150058e < C60127b.f150042b) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.network.AbstractC60135e
    /* renamed from: a */
    public String mo204946a(String str) {
        AbstractC60137g gVar = this.f150056c;
        if (gVar != null) {
            return gVar.mo204946a(str);
        }
        return null;
    }
}
