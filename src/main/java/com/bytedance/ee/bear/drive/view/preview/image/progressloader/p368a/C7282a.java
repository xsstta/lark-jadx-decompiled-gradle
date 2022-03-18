package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.a.a */
public class C7282a {

    /* renamed from: a */
    private final URL f19521a;

    /* renamed from: b */
    private final AbstractC7283b f19522b;

    /* renamed from: c */
    private final String f19523c;

    /* renamed from: d */
    private String f19524d;

    /* renamed from: e */
    private URL f19525e;

    /* renamed from: a */
    public URL mo28457a() throws MalformedURLException {
        return m29105e();
    }

    /* renamed from: b */
    public String mo28458b() {
        return m29106f();
    }

    /* renamed from: c */
    public Map<String, String> mo28459c() {
        return this.f19522b.mo28464a();
    }

    /* renamed from: d */
    public String mo28460d() {
        String str = this.f19523c;
        if (str != null) {
            return str;
        }
        return this.f19521a.toString();
    }

    /* renamed from: e */
    private URL m29105e() throws MalformedURLException {
        if (this.f19525e == null) {
            this.f19525e = new URL(m29106f());
        }
        return this.f19525e;
    }

    public int hashCode() {
        return (mo28460d().hashCode() * 31) + this.f19522b.hashCode();
    }

    public String toString() {
        return mo28460d() + '\n' + this.f19522b.toString();
    }

    /* renamed from: f */
    private String m29106f() {
        if (TextUtils.isEmpty(this.f19524d)) {
            String str = this.f19523c;
            if (TextUtils.isEmpty(str)) {
                str = this.f19521a.toString();
            }
            this.f19524d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.f19524d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7282a)) {
            return false;
        }
        C7282a aVar = (C7282a) obj;
        if (!mo28460d().equals(aVar.mo28460d()) || !this.f19522b.equals(aVar.f19522b)) {
            return false;
        }
        return true;
    }

    public C7282a(String str, AbstractC7283b bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        } else if (bVar != null) {
            this.f19523c = str;
            this.f19521a = null;
            this.f19522b = bVar;
        } else {
            throw new IllegalArgumentException("Headers must not be null");
        }
    }
}
