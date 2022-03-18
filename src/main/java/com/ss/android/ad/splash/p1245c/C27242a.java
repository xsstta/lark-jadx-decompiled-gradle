package com.ss.android.ad.splash.p1245c;

import com.google.firebase.messaging.Constants;
import com.ss.android.ad.splash.C27491y;
import com.ss.android.ad.splash.core.AbstractC27320i;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.C27319h;
import com.ss.android.ad.splash.core.C27375v;
import com.ss.android.ad.splash.core.model.C27351q;
import com.ss.android.ad.splash.p1244b.C27234a;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.NetworkUtils;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.c.a */
public class C27242a {

    /* renamed from: a */
    private static volatile C27242a f67778a;

    /* renamed from: b */
    private volatile boolean f67779b;

    private C27242a() {
    }

    /* renamed from: a */
    public static C27242a m99019a() {
        if (f67778a == null) {
            synchronized (C27242a.class) {
                if (f67778a == null) {
                    f67778a = new C27242a();
                }
            }
        }
        return f67778a;
    }

    /* renamed from: b */
    public void mo97143b() {
        if (C27287e.ap() && C27287e.m99225X() && C27287e.m99226Y() != null && NetworkUtils.m100277b(C27287e.m99221T()) && !this.f67779b) {
            this.f67779b = true;
            C27287e.m99226Y().mo97144a(C27478h.m100374d(), C27478h.m100371c(), new AbstractC27320i() {
                /* class com.ss.android.ad.splash.p1245c.C27242a.C272431 */

                @Override // com.ss.android.ad.splash.core.AbstractC27320i
                /* renamed from: b */
                public void mo97131b(int i, Object obj) {
                    C27234a.m98988a().mo97121a("service_real_time_request_result", 0, (JSONObject) null);
                }

                @Override // com.ss.android.ad.splash.core.AbstractC27320i
                /* renamed from: a */
                public void mo97130a(int i, Object obj) {
                    if (i == 0 && obj != null && (obj instanceof C27491y)) {
                        C27491y yVar = (C27491y) obj;
                        int i2 = 0;
                        if (yVar != null) {
                            try {
                                if (yVar.mo98087b() && yVar.mo98086a() != null) {
                                    JSONObject a = yVar.mo98086a();
                                    JSONObject optJSONObject = a.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                                    int i3 = -1;
                                    if (a != null && a.has("code")) {
                                        i3 = a.optInt("code", -1);
                                    }
                                    if (i3 == 0 && optJSONObject != null) {
                                        C27351q qVar = new C27351q();
                                        qVar.mo97585a(optJSONObject.optJSONArray("splash"));
                                        qVar.mo97587b(optJSONObject.optJSONArray("withdraw"));
                                        qVar.mo97584a(optJSONObject.optInt("command", 0));
                                        C27375v.m99833a().mo97743a(qVar);
                                        i2 = 1;
                                        C27319h.m99371a().mo97384a(optJSONObject.optString("log_extra", "{}"));
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        C27477g.m100326a("SplashAdSdk", "UDPClient. realtime request callback:" + System.currentTimeMillis());
                        C27234a.m98988a().mo97121a("service_real_time_request_result", i2, (JSONObject) null);
                    }
                }
            });
            this.f67779b = false;
        }
    }
}
