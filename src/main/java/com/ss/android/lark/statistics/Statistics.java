package com.ss.android.lark.statistics;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.C54931a;
import com.ss.android.lark.statistics.helper.CustomHitPointHeaderHolder;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u001c\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J:\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u001a\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0007J\b\u0010\u001d\u001a\u00020\u0006H\u0007J\b\u0010\u001e\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/statistics/Statistics;", "", "()V", "TAG", "", "lazyInit", "", "depend", "Lcom/ss/android/lark/statistics/StatisticsLazy$ILazyStatisticsDepend;", "appLog", "Lcom/ss/android/lark/statistics/StatisticsLazy$IAppLog;", "onCreate", "context", "Landroid/content/Context;", "onPause", "onResume", "recordMiscLog", "logType", "obj", "Lorg/json/JSONObject;", "resetTeaAgentCustomHeader", "userId", "deviceId", "tenantId", "romBaseVersion", "romIncrementalVersion", "sendEvent", "eventName", "params", "setEmptyTeaAgentCustomHeader", "updateTeaAgentCustomHeaderAsync", "statistics_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class Statistics {
    public static final Statistics INSTANCE = new Statistics();

    private Statistics() {
    }

    @JvmStatic
    public static final void updateTeaAgentCustomHeaderAsync() {
        C54931a.m213008b();
    }

    @JvmStatic
    public static final void setEmptyTeaAgentCustomHeader() {
        CustomHitPointHeaderHolder.f135720a.mo187486a("");
        CustomHitPointHeaderHolder.f135720a.mo187492c("");
        CustomHitPointHeaderHolder.f135720a.mo187485a((Boolean) false);
        CustomHitPointHeaderHolder.f135720a.mo187497h("");
        HashMap<String, Object> c = CustomHitPointHeaderHolder.f135720a.mo187490c();
        Log.m165389i("Statistics", "setEmptyTeaAgentCustomHeader，" + c);
        C54931a.m213004a().mo103012a((String) null);
        C54931a.m213004a().mo103014a(c);
    }

    @JvmStatic
    public static final void onCreate(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C54931a.m213005a(context);
    }

    @JvmStatic
    public static final void onPause(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C54931a.m213009b(context);
    }

    @JvmStatic
    public static final void onResume(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C54931a.m213011c(context);
    }

    @JvmStatic
    public static final void sendEvent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        C54931a.m213007a(str, (JSONObject) null);
    }

    @JvmStatic
    public static final void recordMiscLog(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            C54931a.m213010b(str, jSONObject);
        }
    }

    @JvmStatic
    public static final void lazyInit(C54931a.AbstractC54936d dVar, C54931a.AbstractC54934b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "depend");
        Intrinsics.checkParameterIsNotNull(bVar, "appLog");
        C54931a.m213006a(dVar, bVar);
    }

    @JvmStatic
    public static final void sendEvent(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        C54931a.m213007a(str, jSONObject);
    }

    @JvmStatic
    public static final void resetTeaAgentCustomHeader(String str, String str2, String str3, String str4, String str5) {
        boolean z;
        CustomHitPointHeaderHolder.f135720a.mo187489b(str2);
        CustomHitPointHeaderHolder.f135720a.mo187486a(str);
        CustomHitPointHeaderHolder.f135720a.mo187492c(str3);
        CustomHitPointHeaderHolder.f135720a.mo187494e(str4);
        CustomHitPointHeaderHolder.f135720a.mo187495f(str5);
        CustomHitPointHeaderHolder.f135720a.mo187497h(str);
        CustomHitPointHeaderHolder aVar = CustomHitPointHeaderHolder.f135720a;
        String str6 = str;
        if (str6 == null || StringsKt.isBlank(str6)) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo187485a(Boolean.valueOf(!z));
        HashMap<String, Object> c = CustomHitPointHeaderHolder.f135720a.mo187490c();
        Log.m165389i("Statistics", "resetTeaAgentCustomHeader，" + c);
        C54931a.m213004a().mo103012a(str);
        C54931a.m213004a().mo103014a(c);
    }
}
