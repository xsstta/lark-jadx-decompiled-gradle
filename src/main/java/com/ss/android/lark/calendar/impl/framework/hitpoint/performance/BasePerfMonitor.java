package com.ss.android.lark.calendar.impl.framework.hitpoint.performance;

import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/performance/BasePerfMonitor;", "", "()V", "TAG", "", "trackersMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/calendar/impl/framework/hitpoint/performance/PerfTracker;", "getTracker", "trackerKey", "putTracker", "", "tracker", "removeTracker", "sendEvent", "eventName", "dataJson", "Lorg/json/JSONObject;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.a */
public final class BasePerfMonitor {

    /* renamed from: a */
    public static final BasePerfMonitor f83381a = new BasePerfMonitor();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, PerfTracker> f83382b = new ConcurrentHashMap<>();

    private BasePerfMonitor() {
    }

    /* renamed from: a */
    public final PerfTracker mo118767a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str != null) {
            return f83382b.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo118770b(String str) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, PerfTracker> concurrentHashMap = f83382b;
            if (concurrentHashMap != null) {
                C69121n.m265993j(concurrentHashMap).remove(str);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }

    /* renamed from: a */
    public final void mo118768a(String str, PerfTracker gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "tracker");
        if (!TextUtils.isEmpty(str) && str != null) {
            f83382b.put(str, gVar);
        }
    }

    /* renamed from: a */
    public final void mo118769a(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        Intrinsics.checkParameterIsNotNull(jSONObject, "dataJson");
        try {
            C30022a.f74882a.statisticsDependency().mo108186a(str, jSONObject);
            Log.m165389i("BasePerfMonitor", C32673y.m125378d(str + ":\t " + jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
