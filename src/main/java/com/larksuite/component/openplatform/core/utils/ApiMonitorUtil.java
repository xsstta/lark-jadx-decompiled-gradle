package com.larksuite.component.openplatform.core.utils;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.apiplugin.LKEvent;
import com.tt.miniapphost.util.DebugUtil;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u001a\u0010\u0014\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0012H\u0007J2\u0010\u0016\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0007J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/larksuite/component/openplatform/core/utils/ApiMonitorUtil;", "", "()V", "TAG", "", "TEST_TRACING", "", "eventMap", "", "Lcom/larksuite/component/openplatform/core/utils/ApiMonitorUtil$ApiTimeEvent;", "getApiTimeEvent", "tracingId", "getTracingIdFromEvent", "event", "Lcom/larksuite/framework/apiplugin/LKEvent;", "monitorAsyncCallback", "", "callbackTime", "", "crossThreadDuration", "monitorAsyncReturn", "startHandleTime", "monitorInvokeReturn", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "isAsync", "invokeTime", "jsCoreReady", "report", "timeEvent", "ApiTimeEvent", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.utils.a */
public final class ApiMonitorUtil {

    /* renamed from: a */
    public static final ApiMonitorUtil f62137a = new ApiMonitorUtil();

    /* renamed from: b */
    private static Map<String, ApiTimeEvent> f62138b = new HashMap();

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\"\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u00103\u001a\u00020\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR\u001a\u0010)\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR\u001a\u0010,\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u001a\u0010/\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0007¨\u00065"}, d2 = {"Lcom/larksuite/component/openplatform/core/utils/ApiMonitorUtil$ApiTimeEvent;", "", "tracingId", "", "(Ljava/lang/String;)V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "getApiName", "()Ljava/lang/String;", "setApiName", "asyncCallbackCalled", "", "getAsyncCallbackCalled", "()Z", "setAsyncCallbackCalled", "(Z)V", "asyncReturnCalled", "getAsyncReturnCalled", "setAsyncReturnCalled", "callbackCrossThreadDuration", "", "getCallbackCrossThreadDuration", "()J", "setCallbackCrossThreadDuration", "(J)V", "callbackTime", "getCallbackTime", "setCallbackTime", "endHandleTime", "getEndHandleTime", "setEndHandleTime", "invokeReturnCalled", "getInvokeReturnCalled", "setInvokeReturnCalled", "invokeReturnTime", "getInvokeReturnTime", "setInvokeReturnTime", "invokeTime", "getInvokeTime", "setInvokeTime", "isAsync", "setAsync", "jsCoreReady", "getJsCoreReady", "setJsCoreReady", "notReported", "getNotReported", "setNotReported", "startHandleTime", "getStartHandleTime", "setStartHandleTime", "getTracingId", "reportTime", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.utils.a$a */
    public static final class ApiTimeEvent {

        /* renamed from: a */
        public static final SimpleDateFormat f62139a = new SimpleDateFormat("[MM-dd HH:mm:ss:SSS]");

        /* renamed from: b */
        public static final Companion f62140b = new Companion(null);

        /* renamed from: c */
        private volatile boolean f62141c = true;

        /* renamed from: d */
        private boolean f62142d;

        /* renamed from: e */
        private boolean f62143e;

        /* renamed from: f */
        private boolean f62144f;

        /* renamed from: g */
        private boolean f62145g;

        /* renamed from: h */
        private String f62146h;

        /* renamed from: i */
        private long f62147i;

        /* renamed from: j */
        private long f62148j;

        /* renamed from: k */
        private boolean f62149k;

        /* renamed from: l */
        private long f62150l;

        /* renamed from: m */
        private long f62151m;

        /* renamed from: n */
        private long f62152n;

        /* renamed from: o */
        private long f62153o;

        /* renamed from: p */
        private final String f62154p;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/openplatform/core/utils/ApiMonitorUtil$ApiTimeEvent$Companion;", "", "()V", "dateTimeFormat", "Ljava/text/SimpleDateFormat;", "getDateTimeFormat", "()Ljava/text/SimpleDateFormat;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.openplatform.core.utils.a$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: b */
        public final String mo88659b() {
            return this.f62154p;
        }

        /* renamed from: a */
        public final boolean mo88658a() {
            if (!this.f62145g) {
                AppBrandLogger.m52830i("ApiMonitor", "tracing:" + this.f62154p, "apiName:" + this.f62146h + " jsCoreReady:" + this.f62149k, "invokeDuration:" + (this.f62148j - this.f62147i));
                return true;
            } else if (!this.f62144f || !this.f62143e || !this.f62142d || !this.f62141c) {
                return false;
            } else {
                this.f62141c = false;
                AppBrandLogger.m52830i("ApiMonitor", "tracing:" + this.f62154p + ' ' + f62139a.format(Long.valueOf(this.f62147i)), "apiName:" + this.f62146h + " jsCoreReady:" + this.f62149k, "invokeDuration:" + (this.f62148j - this.f62147i), "asyncHandleWaitTime:" + (this.f62150l - this.f62147i), "asyncHandlerDuration:" + (this.f62151m - this.f62150l), "callbackThread:" + this.f62153o, "callbackDuration:" + (this.f62152n - this.f62147i));
                return true;
            }
        }

        /* renamed from: a */
        public final void mo88655a(long j) {
            this.f62147i = j;
        }

        /* renamed from: c */
        public final void mo88662c(long j) {
            this.f62150l = j;
        }

        /* renamed from: d */
        public final void mo88664d(long j) {
            this.f62151m = j;
        }

        /* renamed from: e */
        public final void mo88666e(long j) {
            this.f62152n = j;
        }

        /* renamed from: f */
        public final void mo88668f(long j) {
            this.f62153o = j;
        }

        /* renamed from: a */
        public final void mo88656a(String str) {
            this.f62146h = str;
        }

        /* renamed from: b */
        public final void mo88660b(long j) {
            this.f62148j = j;
        }

        /* renamed from: c */
        public final void mo88663c(boolean z) {
            this.f62144f = z;
        }

        /* renamed from: d */
        public final void mo88665d(boolean z) {
            this.f62145g = z;
        }

        /* renamed from: e */
        public final void mo88667e(boolean z) {
            this.f62149k = z;
        }

        public ApiTimeEvent(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tracingId");
            this.f62154p = str;
        }

        /* renamed from: a */
        public final void mo88657a(boolean z) {
            this.f62142d = z;
        }

        /* renamed from: b */
        public final void mo88661b(boolean z) {
            this.f62143e = z;
        }
    }

    private ApiMonitorUtil() {
    }

    /* renamed from: a */
    private final void m91098a(ApiTimeEvent aVar) {
        if (aVar.mo88658a()) {
            f62138b.remove(aVar.mo88659b());
        }
    }

    /* renamed from: a */
    private final ApiTimeEvent m91096a(String str) {
        ApiTimeEvent aVar = f62138b.get(str);
        if (aVar != null && aVar != null) {
            return aVar;
        }
        ApiTimeEvent aVar2 = new ApiTimeEvent(str);
        f62138b.put(str, aVar2);
        return aVar2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m91097a(LKEvent lKEvent) {
        Intrinsics.checkParameterIsNotNull(lKEvent, "event");
        String optString = lKEvent.mo92152s().optString("inner_tracing_id");
        Intrinsics.checkExpressionValueIsNotNull(optString, "event.extraResult.optStr…stant.KEY_API_TRACING_ID)");
        return optString;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m91099a(String str, long j) {
        if (DebugUtil.debug()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (str != null) {
                ApiMonitorUtil aVar = f62137a;
                ApiTimeEvent a = aVar.m91096a(str);
                a.mo88661b(true);
                a.mo88665d(true);
                a.mo88662c(j);
                a.mo88664d(currentTimeMillis);
                aVar.m91098a(a);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m91100a(String str, long j, long j2) {
        if (DebugUtil.debug() && str != null) {
            ApiMonitorUtil aVar = f62137a;
            ApiTimeEvent a = aVar.m91096a(str);
            a.mo88663c(true);
            a.mo88665d(true);
            a.mo88666e(j);
            a.mo88668f(j2);
            aVar.m91098a(a);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m91101a(String str, String str2, boolean z, long j, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str2, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        if (DebugUtil.debug()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (str != null) {
                ApiMonitorUtil aVar = f62137a;
                ApiTimeEvent a = aVar.m91096a(str);
                a.mo88657a(true);
                a.mo88655a(j);
                a.mo88660b(currentTimeMillis);
                a.mo88656a(str2);
                a.mo88667e(z2);
                a.mo88665d(z);
                if (!z) {
                    aVar.m91098a(a);
                }
            }
        }
    }
}
