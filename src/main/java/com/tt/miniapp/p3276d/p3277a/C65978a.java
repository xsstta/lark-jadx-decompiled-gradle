package com.tt.miniapp.p3276d.p3277a;

import com.tt.miniapphost.api.AbstractC67465c;
import java.util.HashMap;

/* renamed from: com.tt.miniapp.d.a.a */
public class C65978a extends AbstractC67465c {

    /* renamed from: a */
    private HashMap<Class, Object> f166541a = new HashMap<>();

    @Override // com.tt.miniapphost.api.AbstractC67465c
    /* renamed from: a */
    public void mo230963a() {
        this.f166541a.clear();
    }

    @Override // com.tt.miniapphost.api.AbstractC67465c
    /* renamed from: a */
    public <T> T mo230962a(Class cls) {
        if (cls == null || !this.f166541a.containsKey(cls)) {
            return null;
        }
        return (T) this.f166541a.get(cls);
    }

    @Override // com.tt.miniapphost.api.AbstractC67465c
    /* renamed from: a */
    public void mo230964a(Class cls, Object obj) {
        if (obj != null && cls != null) {
            this.f166541a.put(cls, obj);
        }
    }
}
