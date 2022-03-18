package com.bytedance.ee.bear.jsbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p704g.C13665a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.jsbridge.l */
public class C7950l {

    /* renamed from: a */
    private static long f21371a = 2097152;

    /* renamed from: b */
    private String f21372b = ("RNBridge#" + Integer.toHexString(hashCode()));

    /* renamed from: c */
    private Map<String, AbstractC7943b> f21373c = new ConcurrentHashMap();

    /* renamed from: d */
    private C7939a.AbstractC7942a f21374d;

    /* renamed from: b */
    private AbstractC7947h m31776b(final String str) {
        if (!TextUtils.isEmpty(str)) {
            return new AbstractC7947h() {
                /* class com.bytedance.ee.bear.jsbridge.C7950l.C79511 */

                @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
                /* renamed from: a */
                public void mo17190a(String str) {
                    C7950l.this.mo30848a(str, str);
                }

                @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
                /* renamed from: a */
                public void mo17188a(JSONObject jSONObject) {
                    C7950l.this.mo30848a(str, jSONObject.toString());
                }

                @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
                /* renamed from: a */
                public void mo17189a(NonProguard nonProguard) {
                    C7950l.this.mo30848a(str, C13665a.m55439a(nonProguard));
                }
            };
        }
        return new AbstractC7947h() {
            /* class com.bytedance.ee.bear.jsbridge.C7950l.C79522 */

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17188a(JSONObject jSONObject) {
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17189a(NonProguard nonProguard) {
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17190a(String str) {
            }
        };
    }

    /* renamed from: c */
    private AbstractC7943b m31777c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f21373c.get(str);
        }
        C13479a.m54758a(this.f21372b, "handlerName is empty");
        return null;
    }

    public C7950l(C7939a.AbstractC7942a aVar) {
        this.f21374d = aVar;
    }

    /* renamed from: a */
    private void m31775a(Message message) {
        try {
            AbstractC7947h b = m31776b(message.mo30823c());
            AbstractC7943b c = m31777c(message.mo30827e());
            if (c != null) {
                c.handler(message.mo30825d(), b);
            }
        } catch (Throwable th) {
            C13479a.m54761a(this.f21372b, th);
        }
    }

    /* renamed from: a */
    public void mo30846a(String str) {
        try {
            Message f = Message.m31717f(str);
            if (((long) str.length()) > f21371a) {
                C13479a.m54762a("ReportCrashUtils_" + this.f21372b, new Throwable(str.length() + "  " + f.mo30827e()), true);
            }
            if (TextUtils.isEmpty(f.mo30819a())) {
                m31775a(f);
            }
        } catch (Throwable th) {
            C13479a.m54761a(this.f21372b, th);
            C13606d.m55245a(this.f21372b, th);
        }
    }

    /* renamed from: a */
    public void mo30847a(String str, AbstractC7943b bVar) {
        if (TextUtils.isEmpty(str) || bVar == null) {
            C13479a.m54761a(this.f21372b, new IllegalArgumentException());
        } else {
            this.f21373c.put(str, bVar);
        }
    }

    /* renamed from: a */
    public void mo30848a(String str, String str2) {
        Message message = new Message();
        message.mo30820a(str);
        message.mo30822b(str2);
        C7939a.AbstractC7942a aVar = this.f21374d;
        if (aVar != null) {
            aVar.mo30839a(message.mo30829f());
        }
    }
}
