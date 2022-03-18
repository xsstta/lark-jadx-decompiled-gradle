package com.ss.android.vc.common.log;

import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/common/log/LoggerEvent;", "", "()V", "TAG", "", "VC_LOG_BIG_LOG", "VC_LOG_HIGH_FREQUENCY", "sendBigLogEvent", "", "subtag", "length", "", "sendHighFrequencyEvent", "num", "realCost", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.b.c */
public final class LoggerEvent {

    /* renamed from: a */
    public static final LoggerEvent f151845a = new LoggerEvent();

    private LoggerEvent() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m235868a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "subtag");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("subtag", str);
            jSONObject.put("length", i);
            C63728b.m249928a("vc_log_big_log", jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235851b("LoggerEvent@", "[sendBigLogEvent]", "exception = " + e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m235869a(String str, int i, long j) {
        Intrinsics.checkParameterIsNotNull(str, "subtag");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("subtag", str);
            jSONObject.put("realCost", j);
            C63728b.m249928a("vc_log_high_frequency", jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235851b("LoggerEvent@", "[sendHighFrequencyEvent]", "exception = " + e.getMessage());
        }
    }
}
