package com.bytedance.p234e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.p234e.AbstractC4028e;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.bytedance.e.b */
class C4023b {

    /* renamed from: a */
    public final AbstractC4026c f12201a;

    /* renamed from: b */
    public boolean f12202b;

    /* renamed from: c */
    public long f12203c;

    /* renamed from: d */
    public long f12204d;

    /* renamed from: e */
    private final Context f12205e;

    /* renamed from: f */
    private int f12206f = 10;

    /* renamed from: g */
    private int f12207g = 86400;

    /* renamed from: h */
    private long f12208h;

    /* renamed from: i */
    private final int f12209i = 5;

    /* renamed from: j */
    private int f12210j;

    /* renamed from: k */
    private AbstractC4028e f12211k;

    /* renamed from: a */
    public C4023b mo15761a(AbstractC4028e eVar) {
        this.f12211k = eVar;
        return this;
    }

    /* renamed from: a */
    public C4023b mo15762a(boolean z) {
        this.f12202b = z;
        return this;
    }

    /* renamed from: a */
    public C4023b mo15759a(int i) {
        if (i < 1) {
            C4027d.m16728b("Fetcher", "set fetch interval fail. interval = " + i);
            return this;
        }
        this.f12207g = i;
        return this;
    }

    /* renamed from: a */
    public C4023b mo15760a(long j) {
        if (j < 1) {
            C4027d.m16728b("Fetcher", "set config version fail. version = " + j);
            return this;
        }
        this.f12208h = j;
        return this;
    }

    C4023b(Context context, AbstractC4026c cVar) {
        this.f12205e = context;
        this.f12201a = cVar;
    }

    /* renamed from: b */
    private void m16715b(String str, String str2) {
        C4027d.m16726a("Fetcher", "try to fetch, module = " + str);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f12203c;
        if (j < 1 || currentTimeMillis - j >= ((long) this.f12207g) * 1000) {
            mo15763a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo15763a(final String str, final String str2) {
        long j = this.f12204d;
        if (j >= Long.MAX_VALUE) {
            this.f12204d = 1;
        } else {
            this.f12204d = j + 1;
        }
        C4027d.m16726a("Fetcher", "start to fetch, module = " + str + ", fetch count = " + this.f12204d);
        if (this.f12211k == null) {
            AbstractC4026c cVar = this.f12201a;
            if (cVar != null) {
                cVar.mo15768a(-996, "netClient is null", null);
                return;
            }
            return;
        }
        String e = C4022a.m16714e(C4022a.m16710c());
        if (TextUtils.isEmpty(e)) {
            C4027d.m16728b("Fetcher", "get host is null");
            AbstractC4026c cVar2 = this.f12201a;
            if (cVar2 != null) {
                cVar2.mo15768a(-998, "host is null", null);
                return;
            }
            return;
        }
        this.f12210j++;
        HashMap hashMap = new HashMap();
        hashMap.put("caller_name", C4037i.m16764a());
        hashMap.put("os", "android");
        hashMap.put("os_version", C4037i.m16765b());
        hashMap.put("config_version", "" + this.f12208h);
        if (!hashMap.containsKey("device_brand")) {
            hashMap.put("device_brand", C4037i.m16766c());
        }
        if (!hashMap.containsKey("device_type")) {
            hashMap.put("device_type", C4037i.m16767d().toLowerCase());
        }
        if (!TextUtils.isEmpty(str) && !str.equals("all")) {
            hashMap.put("module", str);
        }
        if (this.f12202b) {
            hashMap.put("debug", "1");
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("config_key", str2);
        }
        if (C4022a.m16705a() != null) {
            hashMap.putAll(C4022a.m16705a());
        }
        if (C4022a.m16708b() != null) {
            hashMap.putAll(C4022a.m16708b());
        }
        C4027d.m16726a("Fetcher", "param = " + hashMap.toString());
        this.f12211k.start("https://" + e + C4022a.m16713d(), hashMap, new AbstractC4028e.AbstractC4029a() {
            /* class com.bytedance.p234e.C4023b.C40241 */

            @Override // com.bytedance.p234e.AbstractC4028e.AbstractC4029a
            /* renamed from: a */
            public void mo15766a(JSONObject jSONObject, Error error) {
                if (error != null) {
                    C4023b.this.mo15764a(str, str2, 5);
                } else if (jSONObject == null) {
                    C4027d.m16728b("Fetcher", "response is null or empty");
                    C4023b.this.mo15764a(str, str2, 5);
                } else {
                    C4023b.this.f12203c = System.currentTimeMillis();
                    if (C4023b.this.f12202b) {
                        C4027d.m16726a("Fetcher", "fetch suc, fetch count = " + C4023b.this.f12204d + ", response = " + jSONObject.toString());
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (C4023b.this.f12201a != null) {
                        C4023b.this.f12201a.mo15769a(jSONObject.optInt("code"), jSONObject.optString("msg"), optJSONObject, str, str2);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo15765a(String str, String str2, boolean z) {
        this.f12210j = 0;
        if (z) {
            mo15763a(str, str2);
        } else {
            m16715b(str, str2);
        }
    }

    /* renamed from: a */
    public void mo15764a(final String str, final String str2, long j) {
        C4027d.m16726a("Fetcher", "retry fetch, count = " + this.f12204d);
        if (this.f12210j > this.f12206f) {
            C4027d.m16726a("Fetcher", "fetch fail, module = " + str + ", retry times = " + this.f12210j);
            AbstractC4026c cVar = this.f12201a;
            if (cVar != null) {
                cVar.mo15768a(-999, "fetch fail. try times = " + this.f12210j + ", max = " + this.f12206f, null);
            }
            this.f12210j = 0;
            return;
        }
        new Timer().schedule(new TimerTask() {
            /* class com.bytedance.p234e.C4023b.C40252 */

            public void run() {
                C4023b.this.mo15763a(str, str2);
            }
        }, j * 1000);
    }
}
