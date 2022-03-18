package com.larksuite.component.metriclogger;

import android.util.Log;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.component.metriclogger.p1091a.AbstractC24335a;
import com.larksuite.component.p1065a.C24043b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.larksuite.component.metriclogger.e */
public class C24343e {

    /* renamed from: a */
    public static final AbstractC24339c f60035a = new C24334a();

    /* renamed from: b */
    private static AbstractC24337b f60036b = new C24347h();

    /* renamed from: c */
    private static AtomicBoolean f60037c = new AtomicBoolean(true);

    /* renamed from: d */
    private static boolean f60038d = false;

    /* renamed from: e */
    private static final C24344f f60039e = new C24344f();

    /* renamed from: a */
    public static AbstractC24335a m88858a() {
        AbstractC24335a aVar = (AbstractC24335a) C24043b.m87851a(AbstractC24335a.class);
        if (aVar != null) {
            aVar.setLogAccess(f60039e);
        }
        return aVar;
    }

    /* renamed from: a */
    static AbstractC24339c m88860a(C24341b bVar) {
        AbstractC24337b bVar2 = f60036b;
        if (bVar2 != null) {
            return bVar2.mo87088a(bVar.mo87091a(), bVar.mo87092b(), bVar.mo87093c());
        }
        if (f60038d || f60037c.getAndSet(false)) {
            Log.e("MLog", "MLog need init!!");
        }
        return f60035a;
    }

    /* renamed from: a */
    static AbstractC24339c m88859a(long j, C24341b bVar) {
        return m88860a(bVar).mo87073a(2).mo87074a(j);
    }
}
