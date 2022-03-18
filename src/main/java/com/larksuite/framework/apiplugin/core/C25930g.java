package com.larksuite.framework.apiplugin.core;

import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25902m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.larksuite.framework.apiplugin.core.g */
public class C25930g implements AbstractC25902m {

    /* renamed from: a */
    private List<AbstractC25937e> f64228a = new ArrayList();

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25902m
    /* renamed from: b */
    public List<AbstractC25937e> mo92196b() {
        return this.f64228a;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25902m
    /* renamed from: a */
    public void mo92194a() {
        this.f64228a.clear();
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25902m
    /* renamed from: b */
    public void mo92197b(AbstractC25937e eVar) {
        this.f64228a.remove(eVar);
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25902m
    /* renamed from: a */
    public void mo92195a(AbstractC25937e eVar) {
        if (eVar != null && !this.f64228a.contains(eVar)) {
            this.f64228a.add(eVar);
        }
    }
}
