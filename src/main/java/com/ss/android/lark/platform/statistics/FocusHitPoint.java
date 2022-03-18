package com.ss.android.lark.platform.statistics;

import com.larksuite.framework.thread.C26161q;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/platform/statistics/FocusHitPoint;", "", "()V", "Companion", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FocusHitPoint {

    /* renamed from: a */
    public static boolean f129003a = true;

    /* renamed from: b */
    public static final Timer f129004b = new Timer();

    /* renamed from: c */
    public static TimerTask f129005c;

    /* renamed from: d */
    public static final C26161q f129006d;

    /* renamed from: e */
    public static long f129007e = 1;

    /* renamed from: f */
    public static final Companion f129008f = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/platform/statistics/FocusHitPoint$Companion;", "", "()V", "BACKGROUND", "", "DELAY_TIME", "FOREGROUND", "GET_FOCUS", "", "INTERVAL_TIME", "IS_FIRST", "SET_VALUE_DELAY", "TAG", "value", "currentStatus", "currentStatus$annotations", "getCurrentStatus", "()J", "setCurrentStatus", "(J)V", "sIntervalCounter", "Lcom/larksuite/framework/thread/IntervalCounter;", "sOriginTimer", "Ljava/util/Timer;", "sSetValuePending", "", "sTimerTask", "Ljava/util/TimerTask;", "handleIntervalExecutor", "", "FocusStatus", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/platform/statistics/FocusHitPoint$Companion$FocusStatus;", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface FocusStatus {
        }

        private Companion() {
        }

        /* renamed from: a */
        public final long mo178131a() {
            return FocusHitPoint.f129007e;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/platform/statistics/FocusHitPoint$Companion$currentStatus$1", "Ljava/util/TimerTask;", "run", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.platform.statistics.FocusHitPoint$Companion$a */
        public static final class C51954a extends TimerTask {

            /* renamed from: a */
            final /* synthetic */ long f129009a;

            public void run() {
                FocusHitPoint.f129003a = false;
                FocusHitPoint.f129007e = this.f129009a;
                Log.m165389i("FocusHitPoint", "updateCurrentStatus ensured: " + this.f129009a);
                FocusHitPoint.f129008f.mo178133b();
                FocusHitPoint.f129003a = true;
            }

            C51954a(long j) {
                this.f129009a = j;
            }
        }

        /* renamed from: b */
        public final void mo178133b() {
            StringBuilder sb = new StringBuilder();
            sb.append("handleIntervalExecutor called: ");
            Companion companion = this;
            sb.append(companion.mo178131a());
            Log.m165389i("FocusHitPoint", sb.toString());
            if (companion.mo178131a() == 1) {
                FocusHitPoint.f129006d.mo93097a();
            } else {
                FocusHitPoint.f129006d.mo93099b();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo178132a(long j) {
            if (FocusHitPoint.f129003a) {
                TimerTask timerTask = FocusHitPoint.f129005c;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                FocusHitPoint.f129005c = new C51954a(j);
                FocusHitPoint.f129004b.schedule(FocusHitPoint.f129005c, 1000);
            }
        }
    }

    static {
        C26161q qVar = new C26161q(100, 60000);
        f129006d = qVar;
        qVar.mo93098a(C51955a.f129010a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/util/concurrent/atomic/AtomicInteger;", "kotlin.jvm.PlatformType", "onExecute"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.statistics.FocusHitPoint$a */
    static final class C51955a implements C26161q.AbstractC26163a {

        /* renamed from: a */
        public static final C51955a f129010a = new C51955a();

        C51955a() {
        }

        @Override // com.larksuite.framework.thread.C26161q.AbstractC26163a
        /* renamed from: a */
        public final void mo93101a(AtomicInteger atomicInteger) {
            boolean z = true;
            if (atomicInteger.get() > 1) {
                z = false;
            }
            Statistics.sendEvent("get_focus", new JSONObject().put("is_first", z));
        }
    }
}
