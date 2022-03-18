package com.ss.android.lark.platform.p2494o;

import android.content.Context;
import androidx.core.util.C0844e;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.p150l.C3023c;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.appstate.p1372a.C29224a;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.AbstractC48230h;
import com.ss.android.lark.monitor.C48221b;
import com.ss.android.lark.monitor.C48246q;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.p2482c.C51790a;
import com.ss.android.lark.platform.p2482c.C51791b;
import com.ss.android.lark.platform.p2494o.p2495a.C51888a;
import com.ss.android.lark.platform.statistics.metrics.MetricHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.o.a */
public class C51886a {

    /* renamed from: a */
    public static C48246q f128897a;

    /* renamed from: a */
    public static C48246q m201246a() {
        if (f128897a == null) {
            synchronized (C51886a.class) {
                if (f128897a == null) {
                    f128897a = new C48246q(m201245a(LarkContext.getApplication()));
                }
            }
        }
        return f128897a;
    }

    /* renamed from: a */
    private static AbstractC48230h m201245a(final Context context) {
        return new AbstractC48230h() {
            /* class com.ss.android.lark.platform.p2494o.C51886a.C518871 */

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: c */
            public void mo168770c() {
                C36083a.m141486a().getVideoConferenceDependency().mo133136a(C51886a.f128897a);
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: d */
            public boolean mo168772d() {
                return AppLifecycle.m200904a().mo177975e();
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: e */
            public long[] mo168773e() {
                return C51888a.m201263d().mo107775e();
            }

            /* renamed from: f */
            private boolean m201247f() {
                AbstractC49389b m = C36083a.m141486a().getPassportDependency().mo133094m();
                if (m == null || !m.mo172428i()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: b */
            public boolean mo168768b() {
                NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType(context);
                if (networkType == NetworkUtils.NetworkType.MOBILE || networkType == NetworkUtils.NetworkType.MOBILE_2G || networkType == NetworkUtils.NetworkType.MOBILE_3G || networkType == NetworkUtils.NetworkType.MOBILE_4G) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: a */
            public long[] mo168765a() {
                C29224a b;
                if (!m201247f() || (b = C51791b.m200791a().mo103630a().mo103635b()) == null) {
                    return null;
                }
                return new long[]{b.f73172c, b.f73173d, b.f73170a, b.f73171b};
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: a */
            public boolean mo168764a(String str) {
                return C3023c.m12692a(str);
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: a */
            public void mo168761a(AbstractC48230h.AbstractC48231a aVar) {
                C36083a.m141486a().getVideoConferenceDependency().mo133135a(aVar);
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: b */
            public boolean mo168769b(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: a */
            public void mo168760a(C48221b bVar) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("top_activity_name", bVar.f121369a);
                    jSONObject.put("start_time_ms", new Long(bVar.f121380l).toString());
                    jSONObject.put("end_time_ms", new Long(bVar.f121381m).toString());
                    jSONObject.put("duration_ms", bVar.f121382n * 1000.0d);
                    jSONObject.put("cpu_time_ms", bVar.f121374f * 1000.0d);
                    jSONObject.put("process_name", bVar.f121375g);
                    jSONObject.put("cpu_overload_multiple", bVar.f121383o);
                    if (bVar.f121369a.equals("Background")) {
                        jSONObject.put("background", 1);
                    } else {
                        jSONObject.put("background", 0);
                    }
                    if (bVar.f121381m > bVar.f121380l) {
                        jSONObject.put("process_cpu", (bVar.f121374f * 100.0d) / Math.max(1.0d, bVar.f121382n));
                    }
                    if (!bVar.f121384p.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        for (C0844e<String, Double> eVar : bVar.f121384p) {
                            sb.append(String.format("( %-15s: %6.2f ) : ", eVar.f3317a, eVar.f3318b));
                        }
                        jSONObject.put("top_cpu_consume_threads", sb.toString());
                    }
                    MetricHitPoint.m201515a(jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: a */
            public long[] mo168766a(long[] jArr) {
                C29224a a;
                if (!m201247f() || (a = C51791b.m200791a().mo103630a().mo103631a(jArr[0], jArr[1], jArr[2], jArr[3])) == null) {
                    return null;
                }
                return new long[]{a.f73172c, a.f73173d, a.f73170a, a.f73171b};
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: b */
            public void mo168767b(String str, JSONObject jSONObject) {
                ApmAgent.monitorCommonLog(str, jSONObject);
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: c */
            public void mo168771c(String str, JSONObject jSONObject) {
                Statistics.sendEvent(str, jSONObject);
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: a */
            public void mo168763a(String str, JSONObject jSONObject) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("since_latest_enter_foreground", C51790a.m200789b());
                    jSONObject2.put("since_startup", C51790a.m200787a());
                    ApmAgent.monitorEvent(str, null, jSONObject, jSONObject2);
                } catch (JSONException unused) {
                }
            }

            @Override // com.ss.android.lark.monitor.AbstractC48230h
            /* renamed from: a */
            public void mo168762a(String str, double d, List<C0844e<String, Double>> list) {
                int i = 2;
                try {
                    Log.m165383e("LarkMetrics", String.format("process : %s may used too much cpu(%.2f), please check!", str, Double.valueOf(d)));
                    if (d <= 2.0d) {
                        i = 1;
                    } else if (d > 5.0d) {
                        i = 3;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, i);
                    jSONObject.put("versionCode", C26246a.m94978b(context));
                    jSONObject.put("updateVersionCode", C26246a.m94979c(context));
                    for (C0844e<String, Double> eVar : list) {
                        jSONObject.put(eVar.f3317a, eVar.f3318b.doubleValue());
                    }
                    MonitorUtils.monitorStatusAndDuration("ema_process_cpu_overload", i, jSONObject, null);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
