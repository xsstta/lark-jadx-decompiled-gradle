package com.ss.android.lark.platform.network;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.http.C25980a;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.p1189d.AbstractC25999a;
import com.larksuite.framework.http.p1189d.AbstractC26000b;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.platform.network.e */
public class C51864e {

    /* renamed from: a */
    private static volatile AbstractC25990b f128876a;

    /* renamed from: a */
    public static AbstractC25990b m201147a() {
        if (f128876a == null) {
            synchronized (C51864e.class) {
                if (f128876a == null) {
                    f128876a = m201149b();
                }
            }
        }
        return f128876a;
    }

    /* renamed from: b */
    private static AbstractC25990b m201149b() {
        Application application = LarkContext.getApplication();
        ArrayList arrayList = new ArrayList();
        arrayList.add(m201148a(application));
        Log.m165389i("LarkHttpClient", "init process:" + C26252ad.m94992a(application));
        C25980a.m94068a(new AbstractC25990b.C25991a().mo92418a(application).mo92420a(true).mo92417a(15000, TimeUnit.MILLISECONDS).mo92422b(10000, TimeUnit.MILLISECONDS).mo92423c(30000, TimeUnit.MILLISECONDS).mo92419a(arrayList));
        f128876a = C25980a.m94067a();
        return f128876a;
    }

    /* renamed from: a */
    private static AbstractC26000b m201148a(final Context context) {
        return new AbstractC25999a() {
            /* class com.ss.android.lark.platform.network.C51864e.C518651 */

            /* renamed from: b */
            private String f128878b;

            @Override // com.larksuite.framework.http.p1189d.AbstractC25999a
            /* renamed from: a */
            public String mo92427a() {
                if (TextUtils.isEmpty(this.f128878b)) {
                    this.f128878b = C57824f.m224460a(context, null, C36235a.m142710a().mo148282c().mo148297b());
                }
                return this.f128878b;
            }
        };
    }
}
