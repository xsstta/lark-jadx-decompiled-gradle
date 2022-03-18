package com.bytedance.apm.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.block.C2867f;
import com.bytedance.apm.constant.C2905a;
import com.bytedance.apm.core.AbstractC2909c;
import com.bytedance.apm.core.SharedPreferencesC2910d;
import com.bytedance.apm.impl.C2997a;
import com.bytedance.apm.internal.C3009a;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.p139e.C2922b;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3121h;
import com.bytedance.apm.util.C3122i;
import com.bytedance.apm.util.C3126l;
import com.bytedance.apm.util.C3133q;
import com.bytedance.apm.util.C3143y;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.monitor.collector.C20146h;
import com.bytedance.services.apm.api.C20697b;
import com.bytedance.services.apm.api.EnsureManager;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.config.h */
public class C2897h implements C3047b.AbstractC3052b {

    /* renamed from: a */
    public boolean f9364a;

    /* renamed from: b */
    private volatile boolean f9365b;

    /* renamed from: c */
    private volatile boolean f9366c;

    /* renamed from: d */
    private volatile JSONObject f9367d;

    /* renamed from: e */
    private volatile JSONObject f9368e;

    /* renamed from: f */
    private volatile JSONObject f9369f;

    /* renamed from: g */
    private List<String> f9370g = C2905a.f9394a;

    /* renamed from: h */
    private volatile long f9371h = 1200;

    /* renamed from: i */
    private volatile SharedPreferences f9372i;

    /* renamed from: j */
    private AbstractC2909c f9373j;

    /* renamed from: k */
    private JSONObject f9374k;

    /* renamed from: l */
    private boolean f9375l;

    /* renamed from: m */
    private long f9376m = -1;

    /* renamed from: n */
    private long f9377n = 60000;

    /* renamed from: o */
    private long f9378o = -1;

    /* renamed from: p */
    private volatile boolean f9379p;

    /* renamed from: q */
    private boolean f9380q;

    /* renamed from: r */
    private long f9381r;

    /* renamed from: s */
    private List<AbstractC20704a> f9382s;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo12519c() {
        return this.f9365b;
    }

    /* renamed from: d */
    public JSONObject mo12521d() {
        return this.f9374k;
    }

    /* renamed from: a */
    public void mo12514a(boolean z, AbstractC2909c cVar, List<String> list) {
        this.f9380q = z;
        this.f9364a = C2785b.m11761e();
        m12287j();
        this.f9373j = cVar;
        if (!C3122i.m13009a(list)) {
            this.f9370g = m12275a(list);
        }
        m12283f();
    }

    /* renamed from: a */
    public void mo12512a(AbstractC2909c cVar, List<String> list) {
        m12287j();
        if (cVar != null) {
            this.f9373j = cVar;
        }
        if (!C3122i.m13009a(list)) {
            this.f9370g = new ArrayList(list);
        }
        m12278a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12511a() {
        boolean b = mo12517b();
        if (C2785b.m11761e()) {
            if (this.f9376m > System.currentTimeMillis()) {
                b = true;
            }
            m12278a(b);
        }
    }

    /* renamed from: a */
    public boolean mo12515a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (TextUtils.equals(str, "core_exception_monitor")) {
            return this.f9366c;
        }
        if (this.f9367d != null && this.f9367d.optInt(str) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo12510a(String str, int i) {
        JSONObject jSONObject;
        return (TextUtils.isEmpty(str) || (jSONObject = this.f9374k) == null) ? i : jSONObject.optInt(str, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12513a(AbstractC20704a aVar) {
        if (aVar != null) {
            if (this.f9382s == null) {
                this.f9382s = new CopyOnWriteArrayList();
            }
            if (!this.f9382s.contains(aVar)) {
                this.f9382s.add(aVar);
            }
            if (this.f9365b) {
                aVar.onRefresh(this.f9374k, this.f9375l);
                aVar.onReady();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.config.h$a */
    public static class C2903a {

        /* renamed from: a */
        private String f9389a;

        /* renamed from: b */
        private Map<String, String> f9390b = new HashMap();

        /* renamed from: a */
        private void m12306a() {
        }

        /* renamed from: b */
        private void m12307b() {
            this.f9390b.put("Content-Type", "application/json; charset=utf-8");
        }

        C2903a(String str) {
            this.f9389a = str;
        }

        /* renamed from: b */
        private void m12308b(Map<String, String> map) {
            map.put("minor_version", "1");
            this.f9389a = C3143y.m13089a(this.f9389a, map);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2997a mo12531a(Map<String, String> map) throws Exception {
            m12308b(map);
            m12306a();
            m12307b();
            return new C2997a(this.f9389a, this.f9390b);
        }
    }

    /* renamed from: h */
    private void m12285h() {
        C3047b.m12756a().mo12887a(new Runnable() {
            /* class com.bytedance.apm.config.C2897h.RunnableC29002 */

            public void run() {
                try {
                    Intent intent = new Intent("com.apm.setting.update.action");
                    intent.putExtra("PROCESS_NAME", C3133q.m13029a(C2785b.m11735a()));
                    C2785b.m11735a().sendBroadcast(intent);
                } catch (Exception unused) {
                }
            }
        }, 1000);
    }

    /* renamed from: i */
    private long m12286i() {
        return this.f9372i.getLong("monitor_configure_refresh_time", 0);
    }

    /* renamed from: k */
    private boolean m12288k() {
        if (this.f9364a || this.f9380q) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo12523e() {
        m12287j();
        return this.f9372i.getString("monitor_net_config", "");
    }

    C2897h() {
    }

    /* renamed from: f */
    private void m12283f() {
        if (!this.f9379p) {
            this.f9379p = true;
            if (m12288k()) {
                C3047b.m12756a().mo12883a(this);
            }
            m12284g();
        }
    }

    /* renamed from: g */
    private void m12284g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.apm.setting.update.action");
        C28981 r1 = new BroadcastReceiver() {
            /* class com.bytedance.apm.config.C2897h.C28981 */

            public void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    try {
                        String stringExtra = intent.getStringExtra("PROCESS_NAME");
                        String a = C3133q.m13029a(C2785b.m11735a());
                        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(a) && !stringExtra.equals(a)) {
                            C3047b.m12756a().mo12886a(new Runnable() {
                                /* class com.bytedance.apm.config.C2897h.C28981.RunnableC28991 */

                                public void run() {
                                    try {
                                        C2897h.this.mo12517b();
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        };
        if (C2785b.m11735a() != null) {
            m12274a(C2785b.m11735a(), r1, intentFilter);
        }
    }

    /* renamed from: j */
    private void m12287j() {
        if (this.f9372i == null) {
            synchronized (this) {
                if (this.f9372i == null) {
                    this.f9372i = SharedPreferencesC2910d.m12319a(C2785b.m11735a(), "monitor_config");
                }
            }
        }
    }

    /* renamed from: l */
    private void m12289l() {
        if (!this.f9365b) {
            this.f9365b = true;
            List<AbstractC20704a> list = this.f9382s;
            if (list != null) {
                for (AbstractC20704a aVar : list) {
                    try {
                        aVar.onReady();
                    } catch (Throwable th) {
                        if (C2785b.m11769j()) {
                            th.printStackTrace();
                        }
                        EnsureManager.ensureNotReachHere(th);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo12517b() {
        String e = mo12523e();
        if (C2785b.m11769j()) {
            C3350b.m13932a("SlardarConfigFetcher", "configStr:" + e);
        }
        if (TextUtils.isEmpty(e)) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(e);
            this.f9375l = true;
            if (this.f9372i.getInt("setting_version", 0) != 3) {
                return true;
            }
            this.f9376m = m12286i();
            this.f9381r = this.f9372i.getLong("monitor_last_calculate_timestamp", 0);
            if (C2785b.m11769j()) {
                C3350b.m13932a("SlardarConfigFetcher", "lastCalculateTimestamp:" + this.f9381r);
            }
            C2785b.m11748a("config_time", this.f9376m + "");
            C3318a.m13825c(this.f9376m);
            m12276a(jSONObject);
            m12277a(jSONObject, true);
            m12289l();
            return false;
        } catch (Exception unused) {
            C2925e.m12372a(C2922b.f9426a, "config read error");
            return true;
        }
    }

    @Override // com.bytedance.apm.p153n.C3047b.AbstractC3052b
    public void onTimeEvent(long j) {
        m12278a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12516b(AbstractC20704a aVar) {
        List<AbstractC20704a> list;
        if (aVar != null && (list = this.f9382s) != null) {
            list.remove(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo12518b(String str) {
        if (this.f9368e == null || TextUtils.isEmpty(str) || this.f9368e.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo12520c(String str) {
        if (this.f9369f == null || TextUtils.isEmpty(str) || this.f9369f.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo12522d(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.f9374k) == null) {
            return false;
        }
        return jSONObject.optBoolean(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public JSONObject mo12524e(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.f9374k) == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: b */
    private void m12281b(JSONObject jSONObject) {
        try {
            m12282c(jSONObject);
            SharedPreferences.Editor edit = this.f9372i.edit();
            edit.putString("monitor_net_config", jSONObject.toString());
            edit.putInt("setting_version", 3);
            edit.putLong("monitor_configure_refresh_time", this.f9376m);
            edit.putLong("monitor_last_calculate_timestamp", System.currentTimeMillis());
            edit.commit();
        } catch (Exception e) {
            C3350b.m13935b("SlardarConfigFetcher", "saveToLocal", e);
        }
    }

    /* renamed from: a */
    private List<String> m12275a(List<String> list) {
        try {
            if (!C3122i.m13009a(list)) {
                ArrayList arrayList = new ArrayList(2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String host = new URL(list.get(i)).getHost();
                    if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                        arrayList.add("https://" + host + "/monitor/appmonitor/v4/settings");
                    }
                }
                return arrayList;
            }
        } catch (MalformedURLException unused) {
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    private void m12276a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        boolean z;
        if (!C3121h.m13003c(jSONObject)) {
            JSONObject a = C3121h.m12998a(jSONObject, "general", "slardar_api_settings");
            if (a != null) {
                JSONObject optJSONObject2 = a.optJSONObject("fetch_setting");
                if (optJSONObject2 != null) {
                    this.f9371h = optJSONObject2.optLong("fetch_setting_interval", 1200);
                }
                if (this.f9371h < 600) {
                    this.f9371h = 600;
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("custom_event_settings");
            if (optJSONObject3 != null) {
                this.f9367d = optJSONObject3.optJSONObject("allow_log_type");
                this.f9368e = optJSONObject3.optJSONObject("allow_metric_type");
                this.f9369f = optJSONObject3.optJSONObject("allow_service_name");
            }
            this.f9374k = jSONObject;
            JSONObject e = mo12524e("exception_modules");
            if (!(e == null || (optJSONObject = e.optJSONObject(ApiHandler.API_CALLBACK_EXCEPTION)) == null)) {
                if (optJSONObject.optInt("enable_upload") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f9366c = z;
            }
            if (mo12520c("apm_cost")) {
                C20146h.m73514a(new C20146h.AbstractC20148a() {
                    /* class com.bytedance.apm.config.C2897h.C29013 */

                    @Override // com.bytedance.monitor.collector.C20146h.AbstractC20148a
                    /* renamed from: a */
                    public void mo12529a(final long j) {
                        C3047b.m12756a().mo12886a(new Runnable() {
                            /* class com.bytedance.apm.config.C2897h.C29013.RunnableC29021 */

                            public void run() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("looper_monitor", j);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("is_main_process", C2897h.this.f9364a);
                                    ApmAgent.monitorEvent("apm_cost", jSONObject2, jSONObject, null);
                                } catch (JSONException unused) {
                                }
                            }
                        });
                    }
                });
                C20146h.m73515a(true);
            }
        }
    }

    /* renamed from: c */
    private void m12282c(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        boolean z6 = true;
        if (optJSONObject != null) {
            C3009a.m12645a(32, !optJSONObject.optBoolean("enable_salvage_log", true));
        }
        JSONObject a = C3121h.m12998a(jSONObject, "performance_modules", "smooth");
        if (a != null) {
            if (a.optInt("block_enable_upload", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            C3009a.m12645a(1, z3);
            if (a.optInt("enable_trace", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            C3009a.m12645a(2, z4);
            if (a.optInt("enable_stack_sampling", 0) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            C3009a.m12645a(64, z5);
            C3009a.m12646a(a.optLong("atrace_tag", 0));
            C3009a.m12644a(-536870912, C2867f.m12070a(jSONObject) << 29);
        }
        JSONObject a2 = C3121h.m12998a(jSONObject, "performance_modules", "start_trace");
        if (a2 != null) {
            if (a2.optInt("enable_perf_data_collect", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            C3009a.m12645a(4, z);
            if (a2.optInt("enable_lock_data_collect", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C3009a.m12645a(8, z2);
            if (a2.optInt("enable_long_sleep_data_collect", 0) != 1) {
                z6 = false;
            }
            C3009a.m12645a(16, z6);
        }
        if (a != null || a2 != null) {
            C3009a.m12643a();
        }
    }

    /* renamed from: a */
    private void m12278a(boolean z) {
        boolean z2;
        AbstractC2909c cVar;
        boolean z3 = false;
        if (!m12288k() || (!z && !m12279a(System.currentTimeMillis()))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && C3126l.m13015a(C2785b.m11735a()) && (cVar = this.f9373j) != null && cVar.mo12554a() != null && !this.f9373j.mo12554a().isEmpty()) {
            HashMap hashMap = new HashMap(this.f9373j.mo12554a());
            hashMap.put("last_calculate_timestamp", String.valueOf(this.f9381r));
            if (System.currentTimeMillis() - this.f9381r >= 345600000) {
                hashMap.put("force_refresh", String.valueOf(1));
            }
            if (C2785b.m11769j()) {
                C3350b.m13932a("SlardarConfigFetcher", "queryFromNet:" + hashMap);
            }
            this.f9378o = System.currentTimeMillis();
            for (String str : this.f9370g) {
                try {
                    C2997a a = new C2903a(str).mo12531a(hashMap);
                    z3 = m12280a(C2785b.m11737a(a.f9664a, a.f9665b));
                    if (z3) {
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (!z3) {
                this.f9377n = Math.min(this.f9377n * 2, 600000L);
            } else {
                this.f9377n = 60000;
            }
        }
    }

    /* renamed from: a */
    private boolean m12279a(long j) {
        long j2 = this.f9377n;
        if (j2 > 60000) {
            if (j - this.f9378o > j2) {
                return true;
            }
            return false;
        } else if (j - this.f9376m > this.f9371h * 1000) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m12280a(C20697b bVar) throws JSONException {
        byte[] b;
        if (bVar == null || bVar.mo69900a() != 200 || (b = bVar.mo69901b()) == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(new String(b));
        if (C2785b.m11769j()) {
            C3350b.m13932a("SlardarConfigFetcher", "resultJSON:" + jSONObject);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (optJSONObject != null) {
            this.f9375l = false;
            m12276a(optJSONObject);
            m12277a(optJSONObject, false);
            m12289l();
            this.f9376m = System.currentTimeMillis();
            C2785b.m11748a("config_time", this.f9376m + "");
            C3318a.m13825c(this.f9376m);
            m12281b(optJSONObject);
            m12285h();
            C2921a.m12360c("apm_debug", "APM_SETTING_READY");
            return true;
        }
        if (jSONObject.optInt("code", -1) == 1) {
            SharedPreferences.Editor edit = this.f9372i.edit();
            edit.putLong("monitor_configure_refresh_time", this.f9376m);
            edit.commit();
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m12277a(JSONObject jSONObject, boolean z) {
        List<AbstractC20704a> list = this.f9382s;
        if (list != null) {
            for (AbstractC20704a aVar : list) {
                try {
                    aVar.onRefresh(jSONObject, z);
                } catch (Throwable th) {
                    if (C2785b.m11769j()) {
                        th.printStackTrace();
                    }
                    EnsureManager.ensureNotReachHere(th);
                }
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m12274a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
