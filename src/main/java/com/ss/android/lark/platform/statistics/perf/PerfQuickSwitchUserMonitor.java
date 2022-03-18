package com.ss.android.lark.platform.statistics.perf;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.IPerfQuickSwitchUserMonitor;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.p2482c.C51790a;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

public class PerfQuickSwitchUserMonitor implements IPerfQuickSwitchUserMonitor {

    /* renamed from: a */
    private String f129089a;

    /* renamed from: b */
    private volatile boolean f129090b;

    /* renamed from: c */
    private volatile Boolean f129091c;

    /* renamed from: d */
    private final Object f129092d;

    /* renamed from: e */
    private volatile String f129093e;

    /* renamed from: f */
    private JSONObject f129094f;

    /* renamed from: g */
    private JSONObject f129095g;

    /* renamed from: h */
    private JSONObject f129096h;

    /* renamed from: i */
    private C51994b f129097i;

    /* renamed from: j */
    private C51994b f129098j;

    /* renamed from: k */
    private C51994b f129099k;

    /* renamed from: l */
    private C51994b f129100l;

    /* renamed from: m */
    private C51994b f129101m;

    /* renamed from: n */
    private C51994b f129102n;

    /* renamed from: o */
    private C51994b f129103o;

    /* renamed from: p */
    private C51994b f129104p;

    @Retention(RetentionPolicy.SOURCE)
    public @interface From {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.statistics.perf.PerfQuickSwitchUserMonitor$a */
    public static class C51993a {

        /* renamed from: a */
        public static PerfQuickSwitchUserMonitor f129114a = new PerfQuickSwitchUserMonitor();
    }

    /* renamed from: com.ss.android.lark.platform.statistics.perf.PerfQuickSwitchUserMonitor$b */
    public class C51994b {

        /* renamed from: a */
        public long f129115a;

        /* renamed from: b */
        public long f129116b;

        /* renamed from: a */
        public long mo178210a() {
            return this.f129115a;
        }

        /* renamed from: b */
        public long mo178212b() {
            return this.f129116b;
        }

        public C51994b() {
        }

        /* renamed from: a */
        public boolean mo178211a(long j) {
            if (this.f129115a > 0) {
                return false;
            }
            this.f129115a = j;
            return true;
        }

        /* renamed from: b */
        public boolean mo178213b(long j) {
            if (this.f129116b > 0) {
                return false;
            }
            this.f129116b = j;
            return true;
        }
    }

    /* renamed from: a */
    public static PerfQuickSwitchUserMonitor m201668a() {
        return C51993a.f129114a;
    }

    /* renamed from: b */
    public boolean mo178195b() {
        return this.f129090b;
    }

    /* renamed from: c */
    public static synchronized void m201674c() {
        synchronized (PerfQuickSwitchUserMonitor.class) {
            m201672a(C51993a.f129114a.f129095g, C51993a.f129114a.f129094f, C51993a.f129114a.f129096h);
            C51993a.f129114a = new PerfQuickSwitchUserMonitor();
            C51993a.f129114a.f129090b = false;
        }
    }

    private PerfQuickSwitchUserMonitor() {
        this.f129089a = C53234a.m205877a();
        this.f129090b = false;
        this.f129091c = false;
        this.f129092d = new Object();
        this.f129094f = new JSONObject();
        this.f129095g = new JSONObject();
        this.f129096h = new JSONObject();
        this.f129097i = new C51994b();
        this.f129098j = new C51994b();
        this.f129099k = new C51994b();
        this.f129100l = new C51994b();
        this.f129101m = new C51994b();
        this.f129102n = new C51994b();
        this.f129103o = new C51994b();
        this.f129104p = new C51994b();
    }

    /* renamed from: e */
    public void mo178196e(long j) {
        m201671a(this.f129094f, "update_account_cost", Long.valueOf(j));
    }

    /* renamed from: f */
    public void mo178197f(long j) {
        m201671a(this.f129094f, "account_end_to_get_sdk_feed_cost", Long.valueOf(j));
    }

    /* renamed from: g */
    public void mo178198g(long j) {
        m201671a(this.f129094f, "sdk_get_feed_cards_v2", Long.valueOf(j));
    }

    /* renamed from: h */
    public void mo178199h(long j) {
        m201671a(this.f129094f, "render_feed_cost", Long.valueOf(j));
    }

    /* renamed from: j */
    public void mo178201j(long j) {
        m201671a(this.f129096h, "since_startup", String.valueOf(j));
    }

    /* renamed from: k */
    public void mo178202k(long j) {
        m201671a(this.f129096h, "since_latest_enter_foreground", String.valueOf(j));
    }

    /* renamed from: i */
    public void mo178200i(long j) {
        m201671a(this.f129094f, "tenant_switch_cost", Long.valueOf(j));
        m201671a(this.f129094f, "latency", Long.valueOf(j));
    }

    /* renamed from: a */
    public static synchronized void m201669a(String str) {
        synchronized (PerfQuickSwitchUserMonitor.class) {
            C51993a.f129114a = new PerfQuickSwitchUserMonitor();
            C51993a.f129114a.f129093e = str;
            if (C37239a.m146648b().mo136951a("lark.switch.tenant.hit.enable")) {
                C51993a.f129114a.f129090b = true;
            }
        }
    }

    /* renamed from: o */
    public void mo178206o(long j) {
        if (mo178195b() && this.f129103o.mo178210a() <= 0) {
            this.f129103o.mo178211a(j);
            Log.m165389i("PerfQuickSwitchUserMonitor", "setHideLoadingStart time = " + j);
            m201670a("call_hide_loading", this.f129089a, (String) null);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IPerfQuickSwitchUserMonitor
    /* renamed from: b */
    public void mo105366b(long j) {
        if (mo178195b() && this.f129103o.mo178210a() > 0 && this.f129103o.mo178212b() <= 0) {
            Log.m165389i("PerfQuickSwitchUserMonitor", "setHideLoadingEnd time = " + j);
            this.f129103o.mo178213b(j);
            long j2 = this.f129103o.f129116b - this.f129103o.f129115a;
            Log.m165389i("PerfQuickSwitchUserMonitor", "render feed cost time = " + j2);
            m201673b("call_hide_loading", this.f129089a, null);
            mo178199h(j2);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IPerfQuickSwitchUserMonitor
    /* renamed from: c */
    public void mo105367c(long j) {
        if (mo178195b() && this.f129104p.mo178210a() <= 0) {
            Log.m165389i("PerfQuickSwitchUserMonitor", "setTenantSwitchLoadingShowStart time = " + j);
            this.f129104p.mo178211a(j);
        }
    }

    /* renamed from: l */
    public void mo178203l(long j) {
        if (mo178195b() && this.f129101m.mo178212b() <= 0 && this.f129101m.mo178210a() > 0) {
            Log.m165389i("PerfQuickSwitchUserMonitor", "setTriggerLoginInfoChangedEnd time = " + j);
            this.f129101m.mo178213b(j);
            long j2 = this.f129101m.f129116b - this.f129101m.f129115a;
            Log.m165389i("PerfQuickSwitchUserMonitor", "setTriggerLoginInfoChanged cost time = " + j2);
            m201673b("trigger_logininfo_changed", this.f129089a, null);
            mo178196e(j2);
        }
    }

    /* renamed from: m */
    public void mo178204m(long j) {
        if (mo178195b() && this.f129102n.mo178210a() <= 0) {
            Log.m165389i("PerfQuickSwitchUserMonitor", "setGetFeedCardsV2Start time = " + j);
            this.f129102n.mo178211a(j);
            m201670a("sdk_get_feed_cards_v2", this.f129089a, (String) null);
            if (this.f129101m.f129116b > 0) {
                long j2 = this.f129102n.f129115a - this.f129101m.f129116b;
                Log.m165389i("PerfQuickSwitchUserMonitor", "account_end_to_get_sdk_feed cost time = " + j2);
                mo178197f(j2);
            }
        }
    }

    /* renamed from: n */
    public void mo178205n(long j) {
        if (mo178195b() && this.f129102n.mo178212b() <= 0 && this.f129102n.mo178210a() > 0) {
            Log.m165389i("PerfQuickSwitchUserMonitor", "setGetFeedCardsV2End time = " + j);
            this.f129102n.mo178213b(j);
            long j2 = this.f129102n.f129116b - this.f129102n.f129115a;
            Log.m165389i("PerfQuickSwitchUserMonitor", "getFeedCardsV2 cost time = " + j2);
            m201673b("sdk_get_feed_cards_v2", this.f129089a, null);
            mo178198g(j2);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IPerfQuickSwitchUserMonitor
    /* renamed from: a */
    public void mo105365a(long j) {
        if (this.f129097i.mo178210a() <= 0) {
            Log.m165389i("PerfQuickSwitchUserMonitor", "setConfirmSwitchCostStart time = " + j);
            this.f129097i.mo178211a(j);
            m201670a("confirm_switch_cost", this.f129089a, (String) null);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IPerfQuickSwitchUserMonitor
    /* renamed from: d */
    public void mo105368d(long j) {
        if (mo178195b() && this.f129104p.mo178212b() <= 0 && this.f129104p.mo178210a() > 0) {
            Log.m165389i("PerfQuickSwitchUserMonitor", "setTenantSwitchLoadingShowEnd time = " + j);
            this.f129104p.mo178213b(j);
            Log.m165389i("PerfQuickSwitchUserMonitor", "loading show time = " + (this.f129104p.f129116b - this.f129104p.f129115a));
            long j2 = this.f129104p.f129116b - this.f129097i.f129115a;
            Log.m165389i("PerfQuickSwitchUserMonitor", "TenantSwitch time = " + j2);
            long a = C51790a.m200787a();
            Log.m165389i("PerfQuickSwitchUserMonitor", "TenantSwitch elapsedToStart = " + a);
            long b = C51790a.m200789b();
            Log.m165389i("PerfQuickSwitchUserMonitor", "TenantSwitch elapsedToLastForeground = " + b);
            mo178201j(a);
            mo178202k(b);
            mo178200i(j2);
            mo178194a(false);
        }
    }

    /* renamed from: a */
    public void mo178194a(boolean z) {
        m201671a(this.f129095g, "prompt_switch", String.valueOf(z));
    }

    /* renamed from: a */
    private static void m201671a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m201670a(final String str, final String str2, final String str3) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.platform.statistics.perf.PerfQuickSwitchUserMonitor.RunnableC519912 */

            public void run() {
                try {
                    PerfLog.start(str, str2, str3);
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.m165383e("PerfQuickSwitchUserMonitor", "PerfLogStart err:" + e.getMessage());
                }
            }
        });
    }

    /* renamed from: b */
    private static void m201673b(final String str, final String str2, final String str3) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.platform.statistics.perf.PerfQuickSwitchUserMonitor.RunnableC519923 */

            public void run() {
                try {
                    PerfLog.end(str, str2, str3);
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.m165383e("PerfQuickSwitchUserMonitor", "PerfLogEnd err:" + e.getMessage());
                }
            }
        });
    }

    /* renamed from: a */
    private static void m201672a(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.platform.statistics.perf.PerfQuickSwitchUserMonitor.RunnableC519901 */

            public void run() {
                try {
                    MonitorUtils.monitorEvent("switch_user_time", jSONObject, jSONObject2, jSONObject3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
