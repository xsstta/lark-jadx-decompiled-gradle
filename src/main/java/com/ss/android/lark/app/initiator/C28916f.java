package com.ss.android.lark.app.initiator;

import android.content.Context;
import com.ss.android.lark.app.p1357c.C28858a;
import com.ss.android.lark.utils.C57765ac;

/* renamed from: com.ss.android.lark.app.initiator.f */
public class C28916f {
    /* renamed from: a */
    public static AbstractC28915e m105987a(Context context) {
        if (C57765ac.m224188b(context)) {
            return new C28858a();
        }
        if (C57765ac.m224187a(context)) {
            return new DocProcessInitor();
        }
        if (C57765ac.m224189c(context)) {
            return new C28919i();
        }
        if (C57765ac.m224193g(context)) {
            return new C28929q();
        }
        if (C57765ac.m224194h(context)) {
            return new C28917g();
        }
        if (C57765ac.m224190d(context)) {
            return new C28924l();
        }
        if (C57765ac.m224195i(context)) {
            return new C28923k();
        }
        if (C57765ac.m224196j(context).booleanValue()) {
            return new C28918h();
        }
        if (C57765ac.m224191e(context)) {
            return new WidgetProcessInitor();
        }
        return new C28912b();
    }
}
