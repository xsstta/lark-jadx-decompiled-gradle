package com.ss.android.lark.calendar.dependency.idependency;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H&J9\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0012J9\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/dependency/idependency/IPerfDependency;", "", "monitorEvent", "", "eventName", "", "category", "Lorg/json/JSONObject;", "metrics", "extraLog", "perfEnd", "perfFeature", "isFeaturePerf", "", "event", "msg", "contextId", "", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "perfStart", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.a.a.w */
public interface IPerfDependency {

    /* renamed from: a */
    public static final Companion f74888a = Companion.f74889a;

    /* renamed from: a */
    void mo108287a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: a */
    void mo108288a(String str, boolean z, String str2, String str3, Integer num);

    /* renamed from: b */
    void mo108289b(String str, boolean z, String str2, String str3, Integer num);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/dependency/idependency/IPerfDependency$Companion;", "", "()V", "MONITOR_EXP_INSTANCE_ERROR", "", "MONITOR_EXP_MAIN_BLANK", "PERF_FEATURE_MAIN", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.a.a.w$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f74889a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.a.a.w$b */
    public static final class C30057b {
        /* renamed from: a */
        public static /* synthetic */ void m111175a(IPerfDependency wVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    jSONObject2 = null;
                }
                if ((i & 8) != 0) {
                    jSONObject3 = null;
                }
                wVar.mo108287a(str, jSONObject, jSONObject2, jSONObject3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monitorEvent");
        }
    }
}
