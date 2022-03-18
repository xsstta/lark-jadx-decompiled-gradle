package com.bumptech.glide.load.p085b;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.util.C2567j;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.g */
public class C2219g implements AbstractC2265c {

    /* renamed from: b */
    private final AbstractC2220h f7528b;

    /* renamed from: c */
    private final URL f7529c;

    /* renamed from: d */
    private final String f7530d;

    /* renamed from: e */
    private String f7531e;

    /* renamed from: f */
    private URL f7532f;

    /* renamed from: g */
    private volatile byte[] f7533g;

    /* renamed from: h */
    private int f7534h;

    /* renamed from: a */
    public URL mo10575a() throws MalformedURLException {
        return mo29120e();
    }

    /* renamed from: b */
    public String mo10576b() {
        return mo29121f();
    }

    /* renamed from: c */
    public Map<String, String> mo10577c() {
        return this.f7528b.getHeaders();
    }

    public String toString() {
        return mo10578d();
    }

    /* renamed from: e */
    private URL mo29120e() throws MalformedURLException {
        if (this.f7532f == null) {
            this.f7532f = new URL(mo29121f());
        }
        return this.f7532f;
    }

    /* renamed from: g */
    private byte[] mo29122g() {
        if (this.f7533g == null) {
            this.f7533g = mo10578d().getBytes(f7599a);
        }
        return this.f7533g;
    }

    /* renamed from: d */
    public String mo10578d() {
        String str = this.f7530d;
        if (str != null) {
            return str;
        }
        return ((URL) C2567j.m10894a(this.f7529c)).toString();
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        if (this.f7534h == 0) {
            int hashCode = mo10578d().hashCode();
            this.f7534h = hashCode;
            this.f7534h = (hashCode * 31) + this.f7528b.hashCode();
        }
        return this.f7534h;
    }

    /* renamed from: f */
    private String mo29121f() {
        if (TextUtils.isEmpty(this.f7531e)) {
            String str = this.f7530d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C2567j.m10894a(this.f7529c)).toString();
            }
            this.f7531e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f7531e;
    }

    public C2219g(String str) {
        this(str, AbstractC2220h.f7536b);
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(mo29122g());
    }

    public C2219g(URL url) {
        this(url, AbstractC2220h.f7536b);
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (!(obj instanceof C2219g)) {
            return false;
        }
        C2219g gVar = (C2219g) obj;
        if (!mo10578d().equals(gVar.mo10578d()) || !this.f7528b.equals(gVar.f7528b)) {
            return false;
        }
        return true;
    }

    public C2219g(String str, AbstractC2220h hVar) {
        this.f7530d = C2567j.m10896a(str);
        this.f7528b = (AbstractC2220h) C2567j.m10894a(hVar);
    }

    public C2219g(URL url, AbstractC2220h hVar) {
        this.f7529c = (URL) C2567j.m10894a(url);
        this.f7530d = null;
        this.f7528b = (AbstractC2220h) C2567j.m10894a(hVar);
    }
}
