package com.bytedance.platform.godzilla.p860a.p862b.p866b.p867a;

import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20259a;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20261c;
import com.bytedance.platform.godzilla.p872b.C20309a;
import com.bytedance.platform.godzilla.p872b.C20312d;
import com.bytedance.platform.godzilla.p872b.C20316h;
import java.util.Map;

/* renamed from: com.bytedance.platform.godzilla.a.b.b.a.c */
public class C20268c extends AbstractC20259a {

    /* renamed from: a */
    private String f49553a;

    /* renamed from: b */
    private AbstractC20261c f49554b;

    /* renamed from: a */
    public void mo68554a() {
        Object b;
        try {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            Object a = C20312d.m74077a(cls, "getService", this.f49553a);
            if (a != null && (b = C20309a.m74069b(cls, "sCache")) != null && (b instanceof Map)) {
                this.f49554b.mo68546a(a);
                ((Map) b).put(this.f49553a, C20316h.m74088a(a, this.f49554b));
            }
        } catch (Exception unused) {
        }
    }

    public C20268c(String str, AbstractC20261c cVar) {
        this.f49553a = str;
        this.f49554b = cVar;
    }
}
