package com.tt.miniapp.falcon.snapshot;

import com.lark.falcon.engine.inspect.AbstractC24012c;
import com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC24000g;

/* renamed from: com.tt.miniapp.falcon.snapshot.d */
public class C66076d implements AbstractC24012c {

    /* renamed from: a */
    private volatile boolean f166789a;

    /* renamed from: b */
    private volatile boolean f166790b;

    /* renamed from: b */
    public boolean mo231230b() {
        return this.f166790b;
    }

    /* renamed from: a */
    public boolean mo231229a() {
        return this.f166789a;
    }

    @Override // com.lark.falcon.engine.inspect.AbstractC24012c
    /* renamed from: a */
    public void mo48000a(AbstractC24000g gVar) {
        this.f166789a = true;
    }

    @Override // com.lark.falcon.engine.inspect.AbstractC24012c
    /* renamed from: b */
    public void mo48003b(AbstractC24000g gVar) {
        this.f166789a = false;
        this.f166790b = false;
    }

    @Override // com.lark.falcon.engine.inspect.AbstractC24012c
    /* renamed from: a */
    public boolean mo48002a(AbstractC24000g gVar, String str) {
        if (str != null && str.contains("Profiler.start")) {
            this.f166790b = true;
        } else if (str != null && str.contains("Profiler.stop")) {
            this.f166790b = false;
        }
        return false;
    }
}
