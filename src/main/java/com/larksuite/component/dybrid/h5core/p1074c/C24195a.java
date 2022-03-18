package com.larksuite.component.dybrid.h5core.p1074c;

import com.larksuite.component.dybrid.h5api.api.AbstractC24164g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.larksuite.component.dybrid.h5core.c.a */
public class C24195a implements AbstractC24164g {

    /* renamed from: a */
    private Map<String, String> f59806a = new HashMap();

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24164g
    /* renamed from: a */
    public String mo86741a(String str) {
        return this.f59806a.get(str);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24164g
    /* renamed from: b */
    public String mo86743b(String str) {
        return this.f59806a.remove(str);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24164g
    /* renamed from: a */
    public void mo86742a(String str, String str2) {
        this.f59806a.put(str, str2);
    }
}
