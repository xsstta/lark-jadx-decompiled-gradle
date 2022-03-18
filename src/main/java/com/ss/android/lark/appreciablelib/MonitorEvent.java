package com.ss.android.lark.appreciablelib;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J0\u0010\u0013\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fJT\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u0016*\u0002H\u0017\"\u0004\b\u0001\u0010\u0018\"\u0004\b\u0002\u0010\u0017\"\u0014\b\u0003\u0010\u0019*\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00180\u001a*\u0004\u0018\u0001H\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020\u00060\u001cH\b¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/appreciablelib/MonitorEvent;", "", "()V", "TAG", "", "error", "", "application", "Landroid/app/Application;", "params", "Lcom/ss/android/lark/appreciablelib/ErrorParams;", "startupTimestamp", "", "enterForegroundTimeStamp", "isInBackground", "", "needReportToTea", "getNetworkAvailable", "", "timeCost", "Lcom/ss/android/lark/appreciablelib/TimeCostParams;", "whenNotNullNorEmpty", "K", "Any", "V", "T", "", "func", "Lkotlin/Function1;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "appreciablelib_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.appreciablelib.d */
public final class MonitorEvent {

    /* renamed from: a */
    public static final MonitorEvent f73125a = new MonitorEvent();

    /* renamed from: b */
    private static String f73126b = "MonitorEvent";

    private MonitorEvent() {
    }

    /* renamed from: a */
    private final int m107431a(Application application) {
        if (application == null) {
            return NetStatus.SERVICE_UNAVAILABLE.getValue();
        }
        NetworkUtils.NetworkType networkTypeFast = NetworkUtils.getNetworkTypeFast(application);
        if (networkTypeFast != null) {
            int i = C29208e.f73127a[networkTypeFast.ordinal()];
            if (i == 1 || i == 2) {
                return NetStatus.NET_UNAVAILABLE.getValue();
            }
            if (i == 3 || i == 4) {
                return NetStatus.EXCELLENT.getValue();
            }
        }
        return NetStatus.WEAK.getValue();
    }

    /* renamed from: a */
    public final void mo103552a(Application application, TimeCostParams gVar, long j, long j2, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        HashMap hashMap = new HashMap();
        hashMap.put("biz", Integer.valueOf(gVar.mo103561a().getValue()));
        hashMap.put("scene", Integer.valueOf(gVar.mo103565b().getValue()));
        hashMap.put("page", gVar.mo103570e());
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, Integer.valueOf(gVar.mo103573g()));
        hashMap.put("need_net", Boolean.valueOf(gVar.mo103572f()));
        hashMap.put("net_status", Integer.valueOf(m107431a(application)));
        JSONObject jSONObject = new JSONObject(hashMap);
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = hashMap2;
        hashMap3.put("latency", Long.valueOf(gVar.mo103569d()));
        hashMap3.put("event", gVar.mo103567c());
        JSONObject jSONObject2 = new JSONObject(hashMap3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> it = gVar.mo103578k().entrySet().iterator();
        while (true) {
            z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            if (!StringsKt.endsWith$default(next.getKey(), "#span_suffix#", false, 2, (Object) null)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        jSONObject2.put("latency_detail", new JSONObject(linkedHashMap2));
        JSONObject jSONObject3 = new JSONObject(gVar.mo103579l());
        HashMap hashMap4 = new HashMap();
        hashMap4.put("since_latest_startup", Long.valueOf(System.currentTimeMillis() - j));
        hashMap4.put("since_latest_enter_foreground", Long.valueOf(System.currentTimeMillis() - j2));
        hashMap4.put("background_time", Long.valueOf(gVar.mo103576i()));
        for (Map.Entry entry : hashMap4.entrySet()) {
            jSONObject3.put((String) entry.getKey(), entry.getValue());
        }
        ConcurrentHashMap<String, Object> m = gVar.mo103580m();
        if (m != null && (!m.isEmpty())) {
            jSONObject3.put("metric", new JSONObject(m));
        }
        ConcurrentHashMap<String, Object> n = gVar.mo103581n();
        if (gVar.mo103576i() > 0) {
            z2 = true;
        }
        n.put("is_in_background", Boolean.valueOf(z2));
        ConcurrentHashMap<String, Object> n2 = gVar.mo103581n();
        if (n2 != null && (!n2.isEmpty())) {
            jSONObject3.put("category", new JSONObject(n2));
        }
        if (z) {
            String str = "appr_time_" + gVar.mo103567c();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.putAll(hashMap);
            hashMap2.remove("event");
            linkedHashMap3.putAll(hashMap3);
            linkedHashMap3.putAll(linkedHashMap2);
            linkedHashMap3.putAll(hashMap4);
            linkedHashMap3.putAll(gVar.mo103579l());
            linkedHashMap3.putAll(gVar.mo103580m());
            linkedHashMap3.putAll(gVar.mo103581n());
            JSONObject jSONObject4 = new JSONObject();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                if (!TextUtils.isEmpty((CharSequence) entry2.getKey())) {
                    linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                jSONObject4.put((String) entry3.getKey(), entry3.getValue());
            }
            Statistics.sendEvent(str, jSONObject4);
            Log.m165389i(f73126b, "appreciable_log:latency:tea:" + str + ", params size:" + linkedHashMap3.size());
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("extra", jSONObject3);
        MonitorUtils.monitorEvent("appreciable_loading_time", jSONObject, jSONObject2, jSONObject5);
        Log.m165389i(f73126b, "appreciable_log:latency:" + gVar.mo103567c() + ':' + gVar.mo103561a().name() + ':' + gVar.mo103565b().name() + ':' + gVar.mo103570e() + "=>" + "[latency=" + gVar.mo103569d() + ']' + "[latency_detail=[" + jSONObject2.get("latency_detail") + "]]" + "[category=[" + jSONObject + "]]" + "[extra=[" + jSONObject3 + "]]");
    }

    /* renamed from: a */
    public final void mo103551a(Application application, ErrorParams cVar, long j, long j2, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(cVar, "params");
        HashMap hashMap = new HashMap();
        hashMap.put("biz", Integer.valueOf(cVar.mo103534a().getValue()));
        hashMap.put("scene", Integer.valueOf(cVar.mo103535b().getValue()));
        hashMap.put("page", cVar.mo103542h());
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, Integer.valueOf(cVar.mo103546k()));
        hashMap.put("error_type", Integer.valueOf(cVar.mo103537d().getValue()));
        hashMap.put("net_status", Integer.valueOf(m107431a(application)));
        hashMap.put("need_net", cVar.mo103545j());
        JSONObject jSONObject = new JSONObject(hashMap);
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = hashMap2;
        Event c = cVar.mo103536c();
        String str = null;
        hashMap3.put("event", c != null ? c.name() : null);
        hashMap3.put("error_message", cVar.mo103544i());
        hashMap3.put("error_code", Integer.valueOf(cVar.mo103540f()));
        hashMap3.put("level", Integer.valueOf(cVar.mo103538e().getValue()));
        hashMap3.put("user_action", cVar.mo103541g());
        JSONObject jSONObject2 = new JSONObject(hashMap3);
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = hashMap4;
        hashMap5.put("since_latest_startup", Long.valueOf(System.currentTimeMillis() - j));
        hashMap5.put("since_latest_enter_foreground", Long.valueOf(System.currentTimeMillis() - j2));
        JSONObject jSONObject3 = new JSONObject();
        Map<String, Object> l = cVar.mo103547l();
        if (l != null) {
            hashMap4.putAll(l);
        }
        for (Map.Entry entry : hashMap5.entrySet()) {
            jSONObject3.put((String) entry.getKey(), entry.getValue());
        }
        Map<String, Object> m = cVar.mo103548m();
        if (m != null && (!m.isEmpty())) {
            jSONObject3.put("metric", new JSONObject(m));
        }
        HashMap hashMap6 = new HashMap();
        HashMap hashMap7 = hashMap6;
        hashMap7.put("is_in_background", Boolean.valueOf(z));
        Map<String, Object> n = cVar.mo103549n();
        if (n != null) {
            hashMap6.putAll(n);
        }
        jSONObject3.put("category", new JSONObject(hashMap7));
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("appr_error_");
            Event c2 = cVar.mo103536c();
            if (c2 != null) {
                str = c2.name();
            }
            sb.append(str);
            String sb2 = sb.toString();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(hashMap);
            hashMap2.remove("event");
            linkedHashMap.putAll(hashMap3);
            linkedHashMap.putAll(hashMap5);
            Map<String, Object> m2 = cVar.mo103548m();
            if (m2 != null && (!m2.isEmpty())) {
                linkedHashMap.putAll(m2);
            }
            linkedHashMap.putAll(hashMap7);
            JSONObject jSONObject4 = new JSONObject();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!TextUtils.isEmpty((CharSequence) entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                jSONObject4.put((String) entry3.getKey(), entry3.getValue());
            }
            Statistics.sendEvent(sb2, jSONObject4);
            Log.m165389i(f73126b, "appreciable_log:error:tea:" + sb2 + ", params size:" + linkedHashMap.size());
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("extra", jSONObject3);
        MonitorUtils.monitorEvent("appreciable_error", jSONObject, jSONObject2, jSONObject5);
        Log.m165389i(f73126b, "appreciable_log:error:" + cVar.mo103536c() + ':' + cVar.mo103534a().name() + ':' + cVar.mo103535b().name() + ':' + cVar.mo103540f() + ':' + cVar.mo103538e().name() + ':' + cVar.mo103545j() + "=>" + "[errorMessage=" + cVar.mo103544i() + ']' + "[userAction=" + cVar.mo103541g() + ']' + "[metric=[" + jSONObject2 + "]]" + "[category=[" + jSONObject + "]]" + "[extra=[" + jSONObject3 + "]]");
    }
}
