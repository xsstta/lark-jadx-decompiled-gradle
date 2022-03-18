package com.ss.android.appcenter.business.net.p1272c;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.engine.p1300b.C28243c;

/* renamed from: com.ss.android.appcenter.business.net.c.b */
public class C27732b {
    @SerializedName("templateInfo")

    /* renamed from: a */
    public C27733c f69301a;
    @SerializedName("templateWrapper")

    /* renamed from: b */
    public C28243c f69302b;

    public String toString() {
        return String.format("TemplateCache{templateInfo=%s, templateWrapper=%s}", this.f69301a, this.f69302b);
    }

    public C27732b(C27733c cVar, C28243c cVar2) {
        this.f69301a = cVar;
        this.f69302b = cVar2;
    }
}
