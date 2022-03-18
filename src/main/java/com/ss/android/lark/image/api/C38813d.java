package com.ss.android.lark.image.api;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.AbstractC2265c;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.ss.android.lark.image.api.d */
public class C38813d implements AbstractC2265c {

    /* renamed from: b */
    private final URL f99762b;

    /* renamed from: c */
    private final String f99763c;

    /* renamed from: d */
    private Map<String, String> f99764d;

    /* renamed from: e */
    private String f99765e;

    /* renamed from: f */
    private volatile byte[] f99766f;

    /* renamed from: b */
    public Map<String, String> mo142236b() {
        return this.f99764d;
    }

    /* renamed from: a */
    public String mo142235a() {
        return m153178d();
    }

    /* renamed from: c */
    public String mo142237c() {
        String str = this.f99763c;
        if (str != null) {
            return str;
        }
        return this.f99762b.toString();
    }

    /* renamed from: e */
    private byte[] m153179e() {
        if (this.f99766f == null) {
            this.f99766f = mo142237c().getBytes(f7599a);
        }
        return this.f99766f;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return (mo142237c().hashCode() * 31) + this.f99764d.hashCode();
    }

    public String toString() {
        return mo142237c() + '\n' + this.f99764d.toString();
    }

    /* renamed from: d */
    private String m153178d() {
        if (TextUtils.isEmpty(this.f99765e)) {
            String str = this.f99763c;
            if (TextUtils.isEmpty(str)) {
                str = this.f99762b.toString();
            }
            this.f99765e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.f99765e;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m153179e());
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (!(obj instanceof C38813d)) {
            return false;
        }
        C38813d dVar = (C38813d) obj;
        if (!mo142237c().equals(dVar.mo142237c()) || !this.f99764d.equals(dVar.f99764d)) {
            return false;
        }
        return true;
    }
}
