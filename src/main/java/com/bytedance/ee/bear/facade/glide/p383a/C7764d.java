package com.bytedance.ee.bear.facade.glide.p383a;

import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bytedance.common.utility.io.IOUtils;
import com.bytedance.ee.bear.contract.AbstractC5082ab;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.facade.glide.p383a.p384a.C7745a;
import com.bytedance.ee.bear.facade.glide.p383a.p385b.C7753e;
import com.bytedance.ee.bear.facade.glide.p383a.p388d.C7765a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import okhttp3.Call;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.d */
public class C7764d implements AbstractC2147d<InputStream> {

    /* renamed from: a */
    private final Call.Factory f21030a;

    /* renamed from: b */
    private final C7754c f21031b;

    /* renamed from: c */
    private InputStream f21032c;

    /* renamed from: d */
    private volatile boolean f21033d;

    /* renamed from: e */
    private C7765a f21034e;

    /* renamed from: f */
    private boolean f21035f;

    /* renamed from: g */
    private boolean f21036g;

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<InputStream> mo10481a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: d */
    public DataSource mo10491d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: c */
    public void mo10490c() {
        this.f21033d = true;
        C7765a aVar = this.f21034e;
        if (aVar != null) {
            aVar.mo30402b();
        }
    }

    /* renamed from: e */
    private byte[] m31093e() throws Exception {
        return m31091a(this.f21031b.mo29120e(), this.f21031b.mo29122g(), this.f21031b.mo10575a());
    }

    /* renamed from: f */
    private byte[] m31094f() throws Exception {
        return m31091a("", this.f21031b.mo30388p(), this.f21031b.mo29121f());
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: b */
    public void mo10489b() {
        try {
            InputStream inputStream = this.f21032c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        C7765a aVar = this.f21034e;
        if (aVar != null) {
            aVar.mo30401a();
        }
    }

    /* renamed from: a */
    private byte[] m31089a(InputStream inputStream) {
        Exception e;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byte[] bArr = new byte[1024];
            byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream.toByteArray();
                    }
                } catch (Exception e2) {
                    e = e2;
                    C13479a.m54759a("ThumbStreamFetcher", "transStreamToByte error:", e);
                    IOUtils.close(byteArrayOutputStream);
                    return null;
                }
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayOutputStream = null;
            C13479a.m54759a("ThumbStreamFetcher", "transStreamToByte error:", e);
            IOUtils.close(byteArrayOutputStream);
            return null;
        }
    }

    /* renamed from: a */
    private byte[] m31090a(String str) throws Exception {
        byte[] bArr = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AbstractC5082ab i = this.f21031b.mo30381i();
        if (i != null) {
            bArr = (byte[]) i.mo20177a(str);
        }
        this.f21031b.mo30377a(C7745a.m31019a().mo30373f(this.f21031b.mo29122g(), this.f21031b.mo30395w()));
        return bArr;
    }

    public C7764d(Call.Factory factory, C7754c cVar) {
        this.f21030a = factory;
        this.f21031b = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: byte[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m31088a(String str, byte[] bArr) {
        if (this.f21031b.mo30381i() != null && !TextUtils.isEmpty(str) && bArr != 0) {
            this.f21031b.mo30381i().mo20178a(str, bArr);
        }
    }

    /* renamed from: a */
    private void m31086a(long j, long j2) {
        AbstractC5233x k = this.f21031b.mo30383k();
        if (!this.f21033d && k != null) {
            HashMap hashMap = new HashMap(5);
            hashMap.put("file_type", C8275a.m34050a(this.f21031b.mo30390r()));
            hashMap.put(ShareHitPoint.f121868c, this.f21031b.mo30389q());
            hashMap.put("time_cost_ms", String.valueOf(j));
            hashMap.put("file_size", String.valueOf(j2 / 1024));
            hashMap.put("is_encrypt", String.valueOf(this.f21036g));
            k.mo21079a("thumb_info", hashMap);
        }
    }

    /* renamed from: a */
    private byte[] m31092a(URL url, String str) throws IOException {
        C7765a aVar = new C7765a(this.f21030a, this.f21031b);
        this.f21034e = aVar;
        InputStream a = aVar.mo30400a(url, 0, null, str);
        if (a == null) {
            return null;
        }
        return m31089a(a);
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super InputStream> aVar) {
        byte[] bArr;
        long currentTimeMillis = System.currentTimeMillis();
        String g = this.f21031b.mo29122g();
        boolean a = this.f21031b.mo30378a(g);
        this.f21036g = this.f21031b.mo30380h();
        try {
            if (this.f21031b.mo30392t()) {
                byte[] e = m31093e();
                if (e == null) {
                    C13479a.m54764b("ThumbStreamFetcher", "getSourceData() return null, failed directly");
                    aVar.mo10502a((Exception) new IOException("not cache and load form net without etag return null"));
                    m31087a(g, a, this.f21036g, false, "getSourceData() return null, failed directly");
                    return;
                }
                if (this.f21036g) {
                    m31088a(this.f21031b.mo29120e(), e);
                }
                if (!this.f21031b.mo30380h() || this.f21031b.mo30393u()) {
                    bArr = e;
                } else {
                    C13479a.m54772d("ThumbStreamFetcher", "load cache data and decryption");
                    bArr = new C7753e().mo30375a(this.f21031b.mo30384l(), this.f21031b.mo30385m(), this.f21031b.mo30386n(), e);
                }
                if (bArr == null && !this.f21031b.mo30393u()) {
                    if (!this.f21031b.mo30391s()) {
                        if (this.f21031b.mo30382j()) {
                            C13479a.m54764b("ThumbStreamFetcher", "decrypt failed, try load again use original url");
                            g = this.f21031b.mo30388p();
                            a = this.f21031b.mo30378a(g);
                            this.f21036g = false;
                            bArr = m31094f();
                            if (bArr == null) {
                                C13479a.m54764b("ThumbStreamFetcher", "decrypt failed, load use original url failed");
                                aVar.mo10502a((Exception) new IOException("decrypt failed, load use original url failed"));
                                m31087a(g, false, false, false, "decrypt failed, load use original url failed");
                                return;
                            }
                        }
                    }
                    C13479a.m54764b("ThumbStreamFetcher", "force encryption and decrypt failed, return cache data");
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                    this.f21032c = byteArrayInputStream;
                    aVar.mo10503a(byteArrayInputStream);
                    m31087a(g, a, this.f21036g, true, "force encryption and decrypt failed, return cache data");
                    return;
                }
                if (bArr == null) {
                    C13479a.m54764b("ThumbStreamFetcher", "resultData == null");
                    aVar.mo10502a((Exception) new IOException("resultData == null"));
                    m31087a(g, false, false, false, "resultData == null");
                    return;
                }
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                this.f21032c = byteArrayInputStream2;
                aVar.mo10503a(byteArrayInputStream2);
                m31087a(g, a, this.f21036g, true, "");
                if (!this.f21035f && this.f21032c != null) {
                    m31086a(System.currentTimeMillis() - currentTimeMillis, (long) bArr.length);
                    return;
                }
                return;
            }
            throw new IOException("url or headers is null");
        } catch (Exception e2) {
            C13479a.m54758a("ThumbStreamFetcher", "loadData failed:" + e2);
            aVar.mo10502a(e2);
            m31087a(g, a, false, false, e2.getMessage());
        }
    }

    /* renamed from: a */
    private byte[] m31091a(String str, String str2, URL url) throws Exception {
        byte[] bArr;
        if (TextUtils.isEmpty(str)) {
            bArr = null;
        } else {
            bArr = m31090a(str);
        }
        boolean z = false;
        if (bArr == null || bArr.length == 0) {
            byte[] a = m31092a(url, "");
            this.f21035f = false;
            return a;
        } else if (this.f21031b.mo30378a(str2)) {
            byte[] a2 = m31092a(url, this.f21031b.mo30387o());
            if (a2 != null) {
                z = true;
            }
            this.f21035f = z;
            return a2 == null ? bArr : a2;
        } else {
            this.f21035f = true;
            return bArr;
        }
    }

    /* renamed from: a */
    private void m31087a(String str, boolean z, boolean z2, boolean z3, String str2) {
        String str3;
        String str4;
        String str5;
        AbstractC5233x k = this.f21031b.mo30383k();
        if (!this.f21033d && k != null) {
            HashMap hashMap = new HashMap(8);
            hashMap.put(ShareHitPoint.f121868c, this.f21031b.mo30389q());
            String str6 = "1";
            if (z3) {
                str3 = str6;
            } else {
                str3 = "0";
            }
            hashMap.put("status_name", str3);
            hashMap.put("file_type", C8275a.m34050a(this.f21031b.mo30390r()));
            hashMap.put("url", C13598b.m55197d(str));
            if (z) {
                str4 = str6;
            } else {
                str4 = "0";
            }
            hashMap.put("is_update", str4);
            if (z2) {
                str5 = str6;
            } else {
                str5 = "0";
            }
            hashMap.put("is_new", str5);
            hashMap.put("errorMsg", str2);
            if (!this.f21031b.mo30382j()) {
                str6 = "0";
            }
            hashMap.put("network_status", str6);
            k.mo21079a("thumb_request_result", hashMap);
            C13479a.m54772d("ThumbStreamFetcher", hashMap.toString());
        }
    }
}
