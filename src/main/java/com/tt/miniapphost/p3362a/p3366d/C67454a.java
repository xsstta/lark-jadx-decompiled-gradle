package com.tt.miniapphost.p3362a.p3366d;

import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapphost.a.d.a */
public class C67454a implements AbstractC12886a {

    /* renamed from: a */
    private final Map<String, Object> f170057a = new ConcurrentHashMap();

    @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a
    /* renamed from: b */
    public Map<String, Object> mo48640b() {
        return this.f170057a;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a
    /* renamed from: a */
    public void mo48637a() {
        synchronized (C67454a.class) {
            this.f170057a.clear();
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a
    /* renamed from: b */
    public void mo48641b(String str) {
        if (this.f170057a.containsKey(str)) {
            this.f170057a.remove(str);
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a
    /* renamed from: a */
    public <T> T mo48636a(String str) {
        T t;
        if (!this.f170057a.containsKey(str) || (t = (T) this.f170057a.get(str)) == null) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a
    /* renamed from: a */
    public void mo48638a(AbstractC12886a aVar) {
        synchronized (C67454a.class) {
            this.f170057a.putAll(aVar.mo48640b());
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a
    /* renamed from: a */
    public <T> void mo48639a(String str, T t) {
        synchronized (C67454a.class) {
            this.f170057a.put(str, t);
        }
    }
}
