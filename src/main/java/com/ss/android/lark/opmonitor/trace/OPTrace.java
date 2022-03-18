package com.ss.android.lark.opmonitor.trace;

import android.os.Trace;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.config.C48910c;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.AbsMonitorService;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.optrace.api.AbstractC48929b;
import com.ss.android.lark.optrace.api.ITracing;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.optrace.extension.TracingExtension;
import com.ss.android.lark.optrace.extension.TracingExtensionEnum;
import com.ss.android.lark.optrace.impl.TracingSpanImpl;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0002\u0010\bJ\u001c\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\u0012\u0010#\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010&\u001a\u00020 H\u0016J)\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00052\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*\"\u00020+H\u0016¢\u0006\u0002\u0010,J)\u0010-\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00052\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*\"\u00020+H\u0016¢\u0006\u0002\u0010,J\u0010\u0010.\u001a\u00020\u001a2\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u00020\u0001H\u0017J\n\u00104\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J\u0006\u00106\u001a\u00020\u0001J)\u00107\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00052\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*\"\u00020+H\u0016¢\u0006\u0002\u0010,J5\u00108\u001a\u00020\u001a\"\u0004\b\u0000\u001092\b\u00108\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u0002H92\u000e\u0010<\u001a\n\u0012\u0004\u0012\u0002H9\u0018\u00010=H\u0016¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u00020\u001a2\u0006\u00102\u001a\u000200H\u0016J\u0006\u0010@\u001a\u00020\u0005J\u0012\u0010A\u001a\u00020\u001a2\b\u0010B\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010C\u001a\u00020\u0000H\u0016J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0005J)\u0010E\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00052\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*\"\u00020+H\u0016¢\u0006\u0002\u0010,R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0012\u0010\u0012\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006G"}, d2 = {"Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "Lcom/ss/android/lark/optrace/api/TracingCoreSpan;", "Lcom/ss/android/lark/opmonitor/service/AbsMonitorService;", "()V", "traceId", "", "(Ljava/lang/String;)V", "tracingCoreSpan", "(Lcom/ss/android/lark/optrace/api/TracingCoreSpan;)V", "batchEnabled", "", "getBatchEnabled", "()Z", "setBatchEnabled", "(Z)V", "finished", "getFinished", "setFinished", "mBase", "monitors", "", "getMonitors", "()Ljava/util/List;", "setMonitors", "(Ljava/util/List;)V", "addExtension", "", "extensionEnum", "Lcom/ss/android/lark/optrace/extension/TracingExtensionEnum;", "extension", "Lcom/ss/android/lark/optrace/extension/TracingExtension;", "clientDuration", "", "startKey", "clientDurationEndAll", "clientDurationTagEnd", "clientDurationTagStart", "tagKey", "createTime", C63690d.f160779a, "tag", "msg", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "e", "finish", "reportMonitor", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "flush", "monitor", "generateSpan", "getRequestId", "getTracingID", "getTracingSpanImpl", "i", "linkTracing", "T", "Lcom/ss/android/lark/optrace/api/ITracing;", "context", "callback", "Lcom/ss/android/lark/optrace/api/ITracingLink$TracingLinkCallback;", "(Lcom/ss/android/lark/optrace/api/ITracing;Ljava/lang/Object;Lcom/ss/android/lark/optrace/api/ITracingLink$TracingLinkCallback;)V", "log", "serialize", "setRequestId", "requestid", "subTrace", "bizName", "w", "Companion", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class OPTrace extends AbsMonitorService implements TracingCoreSpan {
    public static final OPMonitorCode BATCH_MONITOR_CODE = new OPMonitorCode("monitor.base.batch", HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "batch_monitor");
    public static final Companion Companion = new Companion(null);
    @SerializedName("batchEnabled")
    @Expose
    private boolean batchEnabled;
    private boolean finished;
    @SerializedName("trace")
    @Expose
    private TracingCoreSpan mBase;
    @SerializedName("monitorCache")
    @Expose
    private List<String> monitors;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/opmonitor/trace/OPTrace$Companion;", "", "()V", "BATCH_CODE", "", "BATCH_DATA_KEY", "", "BATCH_DOMAIN", "BATCH_EVENT_NAME", "BATCH_MAX_NUM", "BATCH_MONITOR_CODE", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getBATCH_MONITOR_CODE", "()Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "BATCH_MSG", "TAG", "checkBizBatchEnabled", "", "bizName", "deserialize", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "traceId", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.opmonitor.trace.OPTrace$a */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/ss/android/lark/opmonitor/trace/OPTrace$Companion$deserialize$types$1", "Lcom/google/gson/reflect/TypeToken;", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.opmonitor.trace.OPTrace$a$a */
        public static final class C48925a extends TypeToken<OPTrace> {
            C48925a() {
            }
        }

        private Companion() {
        }

        /* renamed from: a */
        public final OPMonitorCode mo170884a() {
            return OPTrace.BATCH_MONITOR_CODE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo170887b(String str) {
            return !C48910c.m192694a().mo170778a(str);
        }

        @JvmStatic
        /* renamed from: a */
        public final OPTrace mo170885a(String str) {
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Object fromJson = OPTraceGSONParser.f122915b.mo170888a().fromJson(str, new C48925a().getType());
            Intrinsics.checkExpressionValueIsNotNull(fromJson, "OPTraceGSONParser.GSON.fromJson(data, types)");
            return (OPTrace) fromJson;
        }

        @JvmStatic
        /* renamed from: a */
        public final OPTrace mo170886a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "traceId");
            OPTrace oPTrace = new OPTrace(str);
            oPTrace.setBatchEnabled(mo170887b(str2));
            return oPTrace;
        }
    }

    @JvmStatic
    public static final boolean checkBizBatchEnabled(String str) {
        return Companion.mo170887b(str);
    }

    @JvmStatic
    public static final OPTrace deserialize(String str) {
        return Companion.mo170885a(str);
    }

    @JvmStatic
    public static final OPTrace deserialize(String str, String str2) {
        return Companion.mo170886a(str, str2);
    }

    public final boolean getBatchEnabled() {
        return this.batchEnabled;
    }

    public final boolean getFinished() {
        return this.finished;
    }

    public final List<String> getMonitors() {
        return this.monitors;
    }

    public final TracingCoreSpan getTracingSpanImpl() {
        return this.mBase;
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public void clientDurationEndAll() {
        this.mBase.clientDurationEndAll();
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public long createTime() {
        return this.mBase.createTime();
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public String getRequestId() {
        return this.mBase.getRequestId();
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public String getTracingID() {
        String tracingID = this.mBase.getTracingID();
        Intrinsics.checkExpressionValueIsNotNull(tracingID, "mBase.tracingID");
        return tracingID;
    }

    public final String serialize() {
        String json = OPTraceGSONParser.f122915b.mo170888a().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "OPTraceGSONParser.GSON.toJson(this)");
        return json;
    }

    public OPTrace() {
        this.monitors = new ArrayList();
        this.mBase = new TracingSpanImpl((TracingCoreSpan) null);
    }

    @Override // com.ss.android.lark.optrace.api.TracingCoreSpan
    @Deprecated(message = "use subTrace")
    public TracingCoreSpan generateSpan() {
        TracingCoreSpan generateSpan = this.mBase.generateSpan();
        Intrinsics.checkExpressionValueIsNotNull(generateSpan, "mBase.generateSpan()");
        return new OPTrace(generateSpan);
    }

    @Override // com.ss.android.lark.optrace.api.TracingCoreSpan
    public OPTrace subTrace() {
        TracingCoreSpan subTrace = this.mBase.subTrace();
        Intrinsics.checkExpressionValueIsNotNull(subTrace, "mBase.subTrace()");
        OPTrace oPTrace = new OPTrace(subTrace);
        oPTrace.batchEnabled = this.batchEnabled;
        return oPTrace;
    }

    public final void setBatchEnabled(boolean z) {
        this.batchEnabled = z;
    }

    public final void setFinished(boolean z) {
        this.finished = z;
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public long clientDuration(String str) {
        return this.mBase.clientDuration(str);
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public long clientDurationTagEnd(String str) {
        return this.mBase.clientDurationTagEnd(str);
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public void clientDurationTagStart(String str) {
        this.mBase.clientDurationTagStart(str);
    }

    public final void setMonitors(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.monitors = list;
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public void setRequestId(String str) {
        this.mBase.setRequestId(str);
    }

    public OPTrace(TracingCoreSpan tracingCoreSpan) {
        Intrinsics.checkParameterIsNotNull(tracingCoreSpan, "tracingCoreSpan");
        this.monitors = new ArrayList();
        this.mBase = tracingCoreSpan;
    }

    @Override // com.ss.android.lark.opmonitor.api.AbstractC48908f
    public void log(OPMonitor oPMonitor) {
        Intrinsics.checkParameterIsNotNull(oPMonitor, "monitor");
        boolean b = C48910c.m192694a().mo170779b();
        if (!C48910c.m192694a().mo170776a()) {
            return;
        }
        if (!b || !C48910c.m192694a().mo170777a(oPMonitor)) {
            C48924d dVar = C48924d.f122912a;
            Intrinsics.checkExpressionValueIsNotNull(dVar, "OPMonitorService.defaultService");
            log(oPMonitor, dVar.mo170860a());
        }
    }

    public final OPTrace subTrace(String str) {
        Intrinsics.checkParameterIsNotNull(str, "bizName");
        OPTrace subTrace = subTrace();
        subTrace.batchEnabled = Companion.mo170887b(str);
        return subTrace;
    }

    public OPTrace(String str) {
        Intrinsics.checkParameterIsNotNull(str, "traceId");
        this.monitors = new ArrayList();
        this.mBase = new TracingSpanImpl(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r5 != null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void finish(com.ss.android.lark.opmonitor.service.OPMonitor r5) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.opmonitor.trace.OPTrace.finish(com.ss.android.lark.opmonitor.service.OPMonitor):void");
    }

    @Override // com.ss.android.lark.opmonitor.api.AbstractC48908f
    public synchronized void flush(OPMonitor oPMonitor) {
        Intrinsics.checkParameterIsNotNull(oPMonitor, "monitor");
        if (C48910c.m192694a().mo170777a(oPMonitor)) {
            Trace.beginSection("computeSerializeOPMonitor");
            if (this.monitors.size() > 50) {
                Log.m165397w("OPTrace", "batch monitor execeed max nums:" + getTracingID());
                this.monitors.clear();
                this.batchEnabled = false;
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", oPMonitor.getName());
            jSONObject.put("metrics", new JSONObject(oPMonitor.getMetrics()));
            jSONObject.put("categories", new JSONObject(oPMonitor.getCategories()));
            List<String> list = this.monitors;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "result.toString()");
            list.add(jSONObject2);
            Trace.endSection();
        }
    }

    @Override // com.ss.android.lark.optrace.api.ITracing
    public void addExtension(TracingExtensionEnum tracingExtensionEnum, TracingExtension tracingExtension) {
        this.mBase.addExtension(tracingExtensionEnum, tracingExtension);
    }

    @Override // com.ss.android.lark.optrace.api.ILogger
    /* renamed from: d */
    public void mo92222d(String str, Object... objArr) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(objArr, "msg");
        this.mBase.mo92222d(str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.ss.android.lark.optrace.api.ILogger
    /* renamed from: e */
    public void mo92223e(String str, Object... objArr) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(objArr, "msg");
        this.mBase.mo92223e(str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.ss.android.lark.optrace.api.ILogger
    /* renamed from: i */
    public void mo92224i(String str, Object... objArr) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(objArr, "msg");
        this.mBase.mo92224i(str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.ss.android.lark.optrace.api.ILogger
    /* renamed from: w */
    public void mo92225w(String str, Object... objArr) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(objArr, "msg");
        this.mBase.mo92225w(str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.ss.android.lark.optrace.api.AbstractC48929b
    public <T> void linkTracing(ITracing iTracing, T t, AbstractC48929b.AbstractC48930a<T> aVar) {
        if (iTracing instanceof OPTrace) {
            this.mBase.linkTracing(((OPTrace) iTracing).mBase, t, aVar);
        } else {
            this.mBase.linkTracing(iTracing, t, aVar);
        }
    }
}
