package com.larksuite.component.blockit;

import android.content.Context;

/* renamed from: com.larksuite.component.blockit.c */
public class C24051c {

    /* renamed from: a */
    private AbstractC24049b f59454a;

    /* renamed from: com.larksuite.component.blockit.c$a */
    private static final class C24052a {

        /* renamed from: a */
        public static final C24051c f59455a = new C24051c();
    }

    /* renamed from: a */
    public static C24051c m87870a() {
        return C24052a.f59455a;
    }

    /* renamed from: b */
    public AbstractC24049b mo86301b() {
        return this.f59454a;
    }

    /* renamed from: a */
    public void mo86300a(AbstractC24049b bVar) {
        this.f59454a = bVar;
    }

    /* renamed from: a */
    public void mo86299a(Context context, String str) {
        AbstractC24049b bVar = this.f59454a;
        if (bVar != null) {
            bVar.openAppLink(context, str);
        }
    }
}
