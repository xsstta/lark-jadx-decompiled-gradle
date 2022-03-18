package com.ss.android.lark.monitor.app;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/monitor/app/CpuAppPlugin;", "Lcom/ss/android/lark/monitor/app/BaseAppPlugin;", "()V", "collectData", "Lorg/json/JSONObject;", "eventType", "", "getEventName", "", "parseJSON", "values", "runOneTimeTask", "", "isMainProcess", "", "runScheduleTask", "EventType", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CpuAppPlugin extends BaseAppPlugin {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/monitor/app/CpuAppPlugin$EventType;", "", "Companion", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface EventType {
        public static final Companion Companion = Companion.f121339a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/monitor/app/CpuAppPlugin$EventType$Companion;", "", "()V", "CPU_EXCEPTION", "", "getCPU_EXCEPTION", "()I", "setCPU_EXCEPTION", "(I)V", "CPU_ONE_MINUTE", "getCPU_ONE_MINUTE", "setCPU_ONE_MINUTE", "CPU_USAGE", "getCPU_USAGE", "setCPU_USAGE", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.monitor.app.CpuAppPlugin$EventType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f121339a = new Companion();

            /* renamed from: b */
            private static int f121340b = 1;

            /* renamed from: c */
            private static int f121341c = 2;

            /* renamed from: d */
            private static int f121342d = 3;

            private Companion() {
            }

            /* renamed from: a */
            public final int mo168702a() {
                return f121340b;
            }

            /* renamed from: b */
            public final int mo168703b() {
                return f121341c;
            }

            /* renamed from: c */
            public final int mo168704c() {
                return f121342d;
            }
        }
    }

    /* renamed from: c */
    private final JSONObject m190265c(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @Override // com.ss.android.lark.monitor.app.IAppPlugin
    /* renamed from: a */
    public void mo168699a(boolean z) {
        if (z) {
            mo168728a(mo168700b(EventType.Companion.mo168703b()), mo168698a(EventType.Companion.mo168703b()));
        }
    }

    /* renamed from: b */
    public String mo168700b(@EventType int i) {
        if (i == EventType.Companion.mo168702a()) {
            return "app_one_minute_cpu_usage";
        }
        if (i == EventType.Companion.mo168703b()) {
            return "app_cpu_usage";
        }
        if (i == EventType.Companion.mo168704c()) {
            return "cpu_usage_exception";
        }
        return "";
    }

    /* renamed from: a */
    public JSONObject mo168698a(int i) {
        if (i == EventType.Companion.mo168702a()) {
            NativeMonitor instance = NativeMonitor.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "NativeMonitor.getInstance()");
            return m190265c(instance.getAppUseOneMinuteCpu());
        } else if (i == EventType.Companion.mo168703b()) {
            NativeMonitor instance2 = NativeMonitor.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance2, "NativeMonitor.getInstance()");
            return mo168727a(instance2.getAppCpuUsage());
        } else if (i != EventType.Companion.mo168704c()) {
            return null;
        } else {
            NativeMonitor instance3 = NativeMonitor.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance3, "NativeMonitor.getInstance()");
            return mo168727a(instance3.getAppCpuExceptionUseRecord());
        }
    }

    @Override // com.ss.android.lark.monitor.app.IAppPlugin
    /* renamed from: b */
    public void mo168701b(boolean z) {
        if (z) {
            mo168728a(mo168700b(EventType.Companion.mo168702a()), mo168698a(EventType.Companion.mo168702a()));
            mo168728a(mo168700b(EventType.Companion.mo168704c()), mo168698a(EventType.Companion.mo168704c()));
        }
    }
}
