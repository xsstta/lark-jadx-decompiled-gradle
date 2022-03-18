package com.ss.android.lark.integrator.calendar.dependency;

import android.app.Application;
import android.os.SystemClock;
import android.os.Trace;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.trace.C3093c;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.dependency.idependency.IPerfDependency;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016J9\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u001dJ9\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalPerfDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IPerfDependency;", "()V", "byTestStartTime", "", "slardarPerf", "Ljava/util/HashMap;", "", "Lcom/bytedance/apm/trace/PageLoadTrace;", "Lkotlin/collections/HashMap;", "generateContextMsg", "value", "", "getSlardarStartTrace", "pageName", "monitorEvent", "", "eventName", "category", "Lorg/json/JSONObject;", "metrics", "extraLog", "perfEnd", "perfFeature", "isFeaturePerf", "", "event", "msg", "contextId", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "perfStart", "reportByTest", "duration", "Companion", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.v */
public final class CalPerfDependency implements IPerfDependency {

    /* renamed from: b */
    public static final Companion f100525b = new Companion(null);

    /* renamed from: c */
    private final HashMap<String, C3093c> f100526c;

    /* renamed from: d */
    private long f100527d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalPerfDependency$Companion;", "", "()V", "KEY_DURATION", "", "SERVICE_NAME", "TRACE_TAG_APP", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.v$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CalPerfDependency() {
        HashMap<String, C3093c> hashMap = new HashMap<>();
        this.f100526c = hashMap;
        hashMap.put("CalendarColdMainFragment", new C3093c("CalendarColdMainFragment"));
    }

    /* renamed from: a */
    private final C3093c m154696a(String str) {
        C3093c cVar = this.f100526c.get(str);
        if (cVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(cVar, "it");
            return cVar;
        }
        C3093c cVar2 = new C3093c(str);
        this.f100526c.put(str, cVar2);
        return cVar2;
    }

    /* renamed from: a */
    private final String m154697a(int i) {
        return "context=" + i + ',';
    }

    /* renamed from: a */
    private final void m154698a(long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("latency", j);
        ApmAgent.monitorEvent("calendar_startup_time", null, jSONObject, null);
        PerfLog.log("cal_bytest", "reportByTest", jSONObject.toString());
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IPerfDependency
    /* renamed from: a */
    public void mo108287a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        ApmAgent.monitorEvent("calendar_startup_time", jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IPerfDependency
    /* renamed from: a */
    public void mo108288a(String str, boolean z, String str2, String str3, Integer num) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "perfFeature");
        Intrinsics.checkParameterIsNotNull(str2, "event");
        if (num != null) {
            int intValue = num.intValue();
            str3 = m154697a(intValue) + str3;
        }
        PerfLog.log(str2, "start", str3);
        if (z) {
            m154696a(str).mo12970a();
        } else {
            C3093c cVar = this.f100526c.get(str);
            if (cVar != null) {
                cVar.mo12972a(str2);
            }
        }
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        if (C26284k.m95186b(application.getApplicationContext())) {
            ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            if (iCoreApi != null) {
                String str4 = str2 + "_async";
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                iCoreApi.asyncTraceBegin(4096, str4, i);
            }
            if (num == null) {
                Trace.beginSection(str2);
            }
            if (z) {
                this.f100527d = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IPerfDependency
    /* renamed from: b */
    public void mo108289b(String str, boolean z, String str2, String str3, Integer num) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "perfFeature");
        Intrinsics.checkParameterIsNotNull(str2, "event");
        if (num != null) {
            int intValue = num.intValue();
            str3 = m154697a(intValue) + str3;
        }
        PerfLog.log(str2, "end", str3);
        if (z) {
            C3093c cVar = this.f100526c.get(str);
            if (cVar != null) {
                cVar.mo12971a(1, 60000);
            }
            this.f100526c.remove(str);
        } else {
            C3093c cVar2 = this.f100526c.get(str);
            if (cVar2 != null) {
                cVar2.mo12974b(str2);
            }
        }
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        if (C26284k.m95186b(application.getApplicationContext())) {
            ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            if (iCoreApi != null) {
                String str4 = str2 + "_async";
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                iCoreApi.asyncTraceEnd(4096, str4, i);
            }
            if (num == null) {
                Trace.endSection();
            }
            if (z) {
                m154698a(SystemClock.uptimeMillis() - this.f100527d);
            }
        }
    }
}
