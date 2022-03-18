package com.larksuite.component.dybrid.router.p1085b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.dybrid.router.p1088e.C24274a;

/* renamed from: com.larksuite.component.dybrid.router.b.c */
public class C24269c {

    /* renamed from: a */
    private String f59926a;

    /* renamed from: b */
    private Bundle f59927b;

    /* renamed from: a */
    public String mo86903a() {
        return this.f59926a;
    }

    /* renamed from: b */
    public Bundle mo86904b() {
        if (this.f59927b == null) {
            this.f59927b = new Bundle();
        }
        return this.f59927b;
    }

    /* renamed from: e */
    public boolean mo86907e() {
        if (TextUtils.isEmpty(this.f59926a)) {
            return true;
        }
        if (this.f59926a.startsWith("https://") || this.f59926a.startsWith("http://")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public C24268b mo86905c() {
        String str;
        if (this instanceof C24268b) {
            return (C24268b) this;
        }
        Uri parse = Uri.parse(mo86903a());
        Bundle b = mo86904b();
        Uri.Builder buildUpon = parse.buildUpon();
        for (String str2 : b.keySet()) {
            if (b.get(str2) == null) {
                str = "";
            } else {
                str = b.get(str2).toString();
            }
            buildUpon.appendQueryParameter(str2, str);
        }
        return new C24268b(buildUpon.build().toString(), mo86904b());
    }

    /* renamed from: d */
    public C24267a mo86906d() {
        if (this instanceof C24267a) {
            return (C24267a) this;
        }
        Uri parse = Uri.parse(mo86903a());
        if (parse == null || parse.isOpaque()) {
            return new C24267a("", null);
        }
        for (String str : parse.getQueryParameterNames()) {
            mo86904b().putString(str, Uri.decode(C24274a.m88627a(parse, str)));
        }
        return new C24267a(C24274a.m88628a(mo86903a()), mo86904b());
    }

    /* renamed from: a */
    public void mo86902a(String str) {
        this.f59926a = str;
    }

    public C24269c(String str, Bundle bundle) {
        this.f59926a = str;
        this.f59927b = bundle;
    }
}
