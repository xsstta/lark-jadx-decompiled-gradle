package com.ss.android.vc.meeting.bytertc;

import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.irtc.AbstractC61026e;
import com.ss.android.vc.p3069b.C60685h;
import com.ss.android.vc.statistics.C63685a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/meeting/bytertc/VcLogListener;", "Lcom/ss/android/vc/irtc/ILogCallback;", "()V", "RTC_LOG_TAG", "", "logD", "", "tag", "msg", "logE", "logI", "logIh", "message", "logIl", "logIm", "logIs", "monitor", "p0", "p1", "Lorg/json/JSONObject;", "statistics", "LoggerStatistics", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.bytertc.e */
public final class VcLogListener implements AbstractC61026e {

    /* renamed from: a */
    public static final VcLogListener f153391a = new VcLogListener();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/bytertc/VcLogListener$LoggerStatistics;", "", "()V", "TAG", "", "collectNum", "", "loggerNum", "timeMillis", "", "getCollectNum", "recordLogger", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.bytertc.e$a */
    public static final class LoggerStatistics {

        /* renamed from: a */
        public static final LoggerStatistics f153392a = new LoggerStatistics();

        /* renamed from: b */
        private static long f153393b;

        /* renamed from: c */
        private static int f153394c;

        /* renamed from: d */
        private static int f153395d;

        private LoggerStatistics() {
        }

        /* renamed from: b */
        public final synchronized int mo211774b() {
            int i;
            i = f153395d;
            f153395d = 0;
            return i;
        }

        /* renamed from: a */
        public final synchronized void mo211773a() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f153393b >= ((long) CalendarSearchResultRv.f82652c)) {
                Log.m165389i("VideoChat", "CommonLogStatistics: rtcLoggerSpeed = " + f153394c + "/minute");
                f153393b = currentTimeMillis;
                f153394c = 0;
            }
            f153394c++;
            f153395d++;
        }
    }

    private VcLogListener() {
    }

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void monitor(String str, JSONObject jSONObject) {
        C63685a.m249657b(str, jSONObject);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void statistics(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str == null) {
            str = "no_action";
        }
        jSONObject.put("rtc_action_name", str);
        C63685a.m249653a("vcex_bytertc_sdk", jSONObject);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void logD(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        if (!Intrinsics.areEqual("rtc_sdk", str)) {
            C60700b.m235843a(str, "[logD]", str2);
        } else if (C60775q.m236138a()) {
            android.util.Log.d(str, str2);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void logE(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        if (Intrinsics.areEqual("rtc_sdk", str)) {
            if (C60685h.f151809a) {
                LoggerStatistics.f153392a.mo211773a();
            }
            Log.m165383e(str, str2);
            return;
        }
        C60700b.m235864f(str, "[logE]", str2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void logI(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        if (Intrinsics.areEqual("rtc_sdk", str)) {
            if (C60685h.f151809a) {
                LoggerStatistics.f153392a.mo211773a();
            }
            Log.m165389i(str, str2);
            return;
        }
        C60700b.m235851b(str, "[logI]", str2);
    }
}
