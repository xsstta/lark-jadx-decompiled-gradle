package com.ss.android.lark.passport.infra.statistics;

import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/infra/statistics/StatisticsHelper;", "", "()V", "statistics", "", "event", "Lcom/ss/android/lark/passport/infra/statistics/StatisticsHelper$StatisticsEvent;", "StatisticsEvent", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.statistics.b */
public final class StatisticsHelper {

    /* renamed from: a */
    public static final StatisticsHelper f123394a = new StatisticsHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/passport/infra/statistics/StatisticsHelper$StatisticsEvent;", "", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "params", "", "getParams", "()Ljava/util/Map;", "addParam", "key", "value", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.statistics.b$a */
    public static final class StatisticsEvent {

        /* renamed from: a */
        private final Map<String, Object> f123395a;

        /* renamed from: b */
        private final String f123396b;

        /* renamed from: a */
        public final Map<String, Object> mo171608a() {
            return this.f123395a;
        }

        /* renamed from: b */
        public final String mo171609b() {
            return this.f123396b;
        }

        public StatisticsEvent(String str) {
            Intrinsics.checkParameterIsNotNull(str, "eventName");
            this.f123396b = str;
            HashMap hashMap = new HashMap();
            this.f123395a = hashMap;
            C49121a a = C49121a.m193727a();
            Intrinsics.checkExpressionValueIsNotNull(a, "PassportParams.getInstance()");
            hashMap.put("passport_appid", String.valueOf(a.mo171506b()));
            hashMap.put("tracking_code", "none");
            hashMap.put("template_id", "none");
            hashMap.put("utm_from", "none");
        }

        /* renamed from: a */
        public final StatisticsEvent mo171607a(@StatisticsKeys String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            if (str2 != null) {
                this.f123395a.put(str, str2);
            }
            return this;
        }
    }

    private StatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193775a(StatisticsEvent aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        ICommonService c = ServiceFinder.m193748c();
        String b = aVar.mo171609b();
        Map<String, Object> a = aVar.mo171608a();
        if (a != null) {
            c.statistics(b, new JSONObject(a));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
    }
}
