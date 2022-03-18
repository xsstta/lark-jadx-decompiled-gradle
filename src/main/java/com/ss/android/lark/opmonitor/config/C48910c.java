package com.ss.android.lark.opmonitor.config;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.opmonitor.trace.OPTraceGSONParser;
import com.ss.android.lark.optrace.dependency.ECOProbeSDKDepMgr;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0006\u0010\b\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"TRACE_CONFIG_KEY", "", "traceConfig", "Lcom/ss/android/lark/opmonitor/config/TraceConfig;", "getTraceConfig", "()Lcom/ss/android/lark/opmonitor/config/TraceConfig;", "setTraceConfig", "(Lcom/ss/android/lark/opmonitor/config/TraceConfig;)V", "getTracingConfig", "OPMonitor_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.opmonitor.config.c */
public final class C48910c {

    /* renamed from: a */
    private static TraceConfig f122859a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/ss/android/lark/opmonitor/config/MinaConfigKt$getTracingConfig$types$1", "Lcom/google/gson/reflect/TypeToken;", "Lcom/ss/android/lark/opmonitor/config/TraceConfig;", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.opmonitor.config.c$a */
    public static final class C48911a extends TypeToken<TraceConfig> {
        C48911a() {
        }
    }

    /* renamed from: a */
    public static final TraceConfig m192694a() {
        if (f122859a == null) {
            String a = ECOProbeSDKDepMgr.f122918a.mo170892a().mo144737a("optrace_batch_config");
            if (!TextUtils.isEmpty(a)) {
                f122859a = (TraceConfig) OPTraceGSONParser.f122915b.mo170888a().fromJson(a, new C48911a().getType());
            }
            if (f122859a == null) {
                f122859a = new TraceConfig();
            }
        }
        TraceConfig gVar = f122859a;
        if (gVar != null) {
            return gVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.opmonitor.config.TraceConfig");
    }
}
