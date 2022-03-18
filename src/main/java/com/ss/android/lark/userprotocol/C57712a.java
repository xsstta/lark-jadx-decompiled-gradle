package com.ss.android.lark.userprotocol;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.biz.core.api.AbstractC29571p;
import com.ss.android.lark.userprotocol.impl.app.p2903a.C57731b;
import com.ss.android.lark.userprotocol.impl.app.p2903a.C57734c;
import com.ss.android.lark.userprotocol.impl.app.p2903a.C57739d;
import com.ss.android.lark.userprotocol.p2901a.AbstractC57713a;

/* renamed from: com.ss.android.lark.userprotocol.a */
public class C57712a {

    /* renamed from: a */
    private static volatile AbstractC57713a f142196a;

    /* renamed from: a */
    public static AbstractC57713a m224049a() {
        return f142196a;
    }

    public C57712a(AbstractC57713a aVar) {
        f142196a = aVar;
    }

    /* renamed from: a */
    public boolean mo195870a(Context context) {
        m224049a().mo177757a().mo177761a(context);
        return true;
    }

    /* renamed from: b */
    public boolean mo195871b(Context context) {
        m224049a().mo177757a().mo177763b(context);
        return true;
    }

    /* renamed from: a */
    public void mo195869a(Activity activity, AbstractC29571p pVar) {
        C57734c cVar = new C57734c(new C57731b(), new C57739d());
        cVar.create();
        cVar.mo195906a(activity, pVar);
    }
}
