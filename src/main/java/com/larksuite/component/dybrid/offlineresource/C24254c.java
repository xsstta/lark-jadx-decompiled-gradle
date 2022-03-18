package com.larksuite.component.dybrid.offlineresource;

import com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24251a;
import com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24252b;
import java.util.List;

/* renamed from: com.larksuite.component.dybrid.offlineresource.c */
public class C24254c {

    /* renamed from: b */
    private static C24254c f59912b;

    /* renamed from: a */
    public AbstractC24251a f59913a;

    /* renamed from: a */
    public static C24254c m88579a() {
        synchronized (C24254c.class) {
            if (f59912b == null) {
                f59912b = new C24254c();
            }
        }
        return f59912b;
    }

    /* renamed from: a */
    public void mo86881a(AbstractC24251a aVar) {
        this.f59913a = aVar;
    }

    /* renamed from: a */
    public String mo86880a(String str, String str2) {
        AbstractC24251a aVar = this.f59913a;
        if (aVar != null) {
            return aVar.mo86776a(str, str2);
        }
        return null;
    }

    /* renamed from: a */
    public void mo86882a(final String str, final List<String> list) {
        AbstractC24251a aVar = this.f59913a;
        if (aVar == null) {
            return;
        }
        if (!aVar.mo86779a(str)) {
            this.f59913a.mo86778a(str, list, new AbstractC24252b() {
                /* class com.larksuite.component.dybrid.offlineresource.C24254c.C242551 */

                @Override // com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24252b
                /* renamed from: a */
                public void mo86872a() {
                    C24254c.this.f59913a.mo86777a(str, list);
                }
            });
        } else {
            this.f59913a.mo86777a(str, list);
        }
    }

    /* renamed from: a */
    public void mo86883a(String str, List<String> list, AbstractC24252b bVar) {
        AbstractC24251a aVar = this.f59913a;
        if (aVar != null) {
            aVar.mo86778a(str, list, bVar);
        }
    }
}
