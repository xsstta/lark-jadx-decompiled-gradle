package com.larksuite.component.dybrid.h5core.core.impl;

import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.larksuite.component.dybrid.h5core.core.impl.a */
public class C24204a implements AbstractC24158a {

    /* renamed from: a */
    private Set<String> f59823a = new HashSet();

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24158a
    /* renamed from: a */
    public Iterator<String> mo86722a() {
        return this.f59823a.iterator();
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24158a
    /* renamed from: a */
    public void mo86723a(String str) {
        this.f59823a.add(str);
    }
}
