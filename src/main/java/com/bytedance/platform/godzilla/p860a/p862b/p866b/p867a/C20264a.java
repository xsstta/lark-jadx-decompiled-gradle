package com.bytedance.platform.godzilla.p860a.p862b.p866b.p867a;

import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20261c;
import com.bytedance.platform.godzilla.p872b.C20316h;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.godzilla.a.b.b.a.a */
public class C20264a extends AbstractC20261c {

    /* renamed from: e */
    private String f49551e;

    /* renamed from: b */
    public void mo68552b() {
        new C20268c(this.f49551e, this).mo68554a();
    }

    /* renamed from: com.bytedance.platform.godzilla.a.b.b.a.a$a */
    static class C20265a extends AbstractC20260b {

        /* renamed from: a */
        private AbstractC20261c f49552a;

        C20265a(AbstractC20261c cVar) {
            this.f49552a = cVar;
        }

        @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b
        /* renamed from: a */
        public Object mo68542a(Object obj, Method method, Object[] objArr) {
            return super.mo68542a(obj, method, objArr);
        }

        @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b
        /* renamed from: a */
        public Object mo68543a(Object obj, Method method, Object[] objArr, Object obj2) {
            return C20316h.m74088a(this.f49552a.mo68545a(), this.f49552a);
        }
    }

    public C20264a(String str, AbstractC20261c cVar) {
        this.f49551e = str;
        this.f49545b.put("queryLocalInterface", new C20265a(cVar));
    }
}
