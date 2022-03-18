package com.bytedance.geckox.statistic.p781a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.p771g.C14276b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.geckox.statistic.a.a */
public class C14329a {

    /* renamed from: a */
    private static C14329a f37645a;

    /* renamed from: b */
    private SDKMonitor f37646b;

    /* renamed from: c */
    private AtomicBoolean f37647c = new AtomicBoolean(false);

    /* renamed from: b */
    public boolean mo52458b() {
        return this.f37647c.get();
    }

    private C14329a() {
    }

    /* renamed from: a */
    public static C14329a m57726a() {
        if (f37645a == null) {
            synchronized (C14329a.class) {
                if (f37645a == null) {
                    f37645a = new C14329a();
                }
            }
        }
        return f37645a;
    }

    /* renamed from: a */
    public void mo52456a(Context context, final C14218d dVar) {
        int i;
        final C14218d.AbstractC14221b s = dVar.mo52153s();
        if (s != null && this.f37647c.compareAndSet(false, true)) {
            if (s.mo52168a()) {
                i = 3261;
            } else {
                i = 3262;
            }
            String valueOf = String.valueOf(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", dVar.mo52150p());
                jSONObject.put("host_aid", dVar.mo52145k());
                jSONObject.put("sdk_version", "2.4.1");
                jSONObject.put("app_version", dVar.mo52149o());
                String e = s.mo52172e();
                if (!TextUtils.isEmpty(e)) {
                    jSONObject.put("channel", e);
                }
                String d = s.mo52171d();
                if (!TextUtils.isEmpty(d)) {
                    jSONObject.put("update_version_code", d);
                }
                String f = s.mo52173f();
                if (!TextUtils.isEmpty(f)) {
                    jSONObject.put("package_name", f);
                }
                SDKMonitorUtils.setDefaultReportUrl(valueOf, Collections.singletonList(s.mo52169b() + "/monitor/collect/"));
                SDKMonitorUtils.setConfigUrl(valueOf, Collections.singletonList(s.mo52169b() + "/monitor/appmonitor/v2/settings"));
                SDKMonitorUtils.initMonitor(context.getApplicationContext(), valueOf, jSONObject, new SDKMonitor.IGetExtendParams() {
                    /* class com.bytedance.geckox.statistic.p781a.C14329a.C143301 */

                    @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                    public String getSessionId() {
                        return null;
                    }

                    @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                    public Map<String, String> getCommonParams() {
                        String str;
                        Map<String, String> c = s.mo52170c();
                        if (c == null) {
                            c = new HashMap<>();
                        }
                        if (s.mo52168a()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        c.put("oversea", str);
                        c.put("host_aid", String.valueOf(dVar.mo52145k()));
                        return c;
                    }
                });
                this.f37646b = SDKMonitorUtils.getInstance(valueOf);
            } catch (JSONException e2) {
                C14276b.m57604a("gecko-debug-tag", "monitor init failed", e2);
            }
        }
    }

    /* renamed from: a */
    public void mo52457a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.f37647c.get()) {
            SDKMonitor sDKMonitor = this.f37646b;
            if (sDKMonitor != null) {
                sDKMonitor.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Please init MonitorManager first");
    }
}
