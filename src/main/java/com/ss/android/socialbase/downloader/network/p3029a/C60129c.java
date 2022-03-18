package com.ss.android.socialbase.downloader.network.p3029a;

import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.AbstractC60135e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.network.a.c */
public class C60129c implements AbstractC60135e {

    /* renamed from: c */
    private static final ArrayList<String> f150045c;

    /* renamed from: a */
    protected List<HttpHeader> f150046a;

    /* renamed from: b */
    protected final Object f150047b;

    /* renamed from: d */
    private Map<String, String> f150048d;

    /* renamed from: e */
    private int f150049e;

    /* renamed from: f */
    private long f150050f;

    /* renamed from: g */
    private boolean f150051g;

    /* renamed from: h */
    private boolean f150052h;

    /* renamed from: i */
    private AbstractC60135e f150053i;

    @Override // com.ss.android.socialbase.downloader.network.AbstractC60135e
    /* renamed from: a */
    public int mo204945a() throws IOException {
        return this.f150049e;
    }

    /* renamed from: d */
    public boolean mo205431d() {
        return this.f150051g;
    }

    /* renamed from: f */
    public List<HttpHeader> mo205433f() {
        return this.f150046a;
    }

    @Override // com.ss.android.socialbase.downloader.network.AbstractC60135e
    /* renamed from: b */
    public void mo204947b() {
        AbstractC60135e eVar = this.f150053i;
        if (eVar != null) {
            eVar.mo204947b();
        }
    }

    /* renamed from: c */
    public void mo205430c() throws InterruptedException {
        synchronized (this.f150047b) {
            if (this.f150052h && this.f150048d == null) {
                this.f150047b.wait();
            }
        }
    }

    /* renamed from: e */
    public boolean mo205432e() {
        if (System.currentTimeMillis() - this.f150050f < C60127b.f150043c) {
            return true;
        }
        return false;
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>(6);
        f150045c = arrayList;
        arrayList.add("Content-Length");
        arrayList.add("Content-Range");
        arrayList.add("Transfer-Encoding");
        arrayList.add("Accept-Ranges");
        arrayList.add("Etag");
        arrayList.add("Content-Disposition");
    }

    @Override // com.ss.android.socialbase.downloader.network.AbstractC60135e
    /* renamed from: a */
    public String mo204946a(String str) {
        Map<String, String> map = this.f150048d;
        if (map != null) {
            return map.get(str);
        }
        AbstractC60135e eVar = this.f150053i;
        if (eVar != null) {
            return eVar.mo204946a(str);
        }
        return null;
    }
}
