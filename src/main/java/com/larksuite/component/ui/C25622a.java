package com.larksuite.component.ui;

import com.larksuite.component.ui.dependence.IAvatarLoader;
import com.larksuite.component.ui.dependence.IChatterAvatarService;
import com.larksuite.component.ui.dependence.IDependence;
import com.larksuite.component.ui.dependence.IDocIconProvider;

/* renamed from: com.larksuite.component.ui.a */
public class C25622a {

    /* renamed from: a */
    private static IDependence f62356a;

    /* renamed from: a */
    public static IAvatarLoader m91437a() {
        return f62356a.mo89179a();
    }

    /* renamed from: b */
    public static IDocIconProvider m91439b() {
        return f62356a.mo89181c();
    }

    /* renamed from: c */
    public static IChatterAvatarService m91440c() {
        return f62356a.mo89180b();
    }

    /* renamed from: a */
    public static void m91438a(IDependence cVar) {
        f62356a = cVar;
    }
}
