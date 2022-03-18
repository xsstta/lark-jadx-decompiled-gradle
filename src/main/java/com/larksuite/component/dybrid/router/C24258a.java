package com.larksuite.component.dybrid.router;

import android.content.Context;
import android.os.Bundle;
import com.larksuite.component.dybrid.router.p1084a.AbstractC24260b;
import com.larksuite.component.dybrid.router.p1084a.AbstractC24262d;
import com.larksuite.component.dybrid.router.p1084a.C24264f;
import com.larksuite.component.dybrid.router.p1085b.C24269c;
import com.larksuite.component.dybrid.router.p1087d.C24272a;
import com.larksuite.component.dybrid.router.p1087d.C24273b;

/* renamed from: com.larksuite.component.dybrid.router.a */
public class C24258a {

    /* renamed from: a */
    private static final C24264f<AbstractC24260b> f59920a;

    /* renamed from: b */
    private static C24258a f59921b;

    static {
        C24264f<AbstractC24260b> fVar = new C24264f<>();
        f59920a = fVar;
        fVar.mo86901a(new C24273b(), 1);
        fVar.mo86901a(new C24272a(), 2);
    }

    /* renamed from: a */
    public static C24258a m88594a() {
        synchronized (C24258a.class) {
            if (f59921b == null) {
                f59921b = new C24258a();
            }
        }
        return f59921b;
    }

    /* renamed from: a */
    public void mo86892a(AbstractC24260b bVar, int i) {
        f59920a.mo86901a(bVar, i);
    }

    /* renamed from: a */
    public boolean mo86894a(Context context, String str, Bundle bundle) {
        return m88595a(context, new C24269c(str, bundle), (AbstractC24262d) null);
    }

    /* renamed from: b */
    public boolean mo86896b(Context context, String str, Bundle bundle) {
        return m88595a(context, new C24269c(str, bundle), (AbstractC24262d) null);
    }

    /* renamed from: a */
    private boolean m88595a(Context context, C24269c cVar, AbstractC24262d dVar) {
        int i = 0;
        while (true) {
            C24264f<AbstractC24260b> fVar = f59920a;
            if (i >= fVar.mo86899a()) {
                return false;
            }
            AbstractC24260b a = fVar.mo86900a(i);
            if (a != null && a.mo86850a(cVar.mo86903a())) {
                cVar = a.mo86848a(context, cVar, dVar);
                if (a.ab_()) {
                    return true;
                }
            }
            i++;
        }
    }

    /* renamed from: a */
    public boolean mo86893a(Context context, C24269c cVar, int i, AbstractC24262d dVar) {
        cVar.mo86904b().putBoolean("for_result", true);
        cVar.mo86904b().putInt("for_result_code", i);
        m88595a(context, cVar, dVar);
        return false;
    }

    /* renamed from: a */
    public boolean mo86895a(Context context, String str, Bundle bundle, int i) {
        return mo86893a(context, new C24269c(str, bundle), i, (AbstractC24262d) null);
    }
}
