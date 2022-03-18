package com.ss.android.lark.calendar.impl.framework.hitpoint.performance;

import com.larksuite.framework.callback.UICallbackExecutor;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/performance/LaunchMemoryMonitor;", "", "()V", "EVENT_NAME", "", "NO_INSTANCE", "PERF_KEY", "appLaunchTime", "", "isAddedParam", "", "isStartedTrack", "appLaunch", "", "end", "paramInstanceNum", "insNum", "start", "viewType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.c */
public final class LaunchMemoryMonitor {

    /* renamed from: a */
    public static final LaunchMemoryMonitor f83384a = new LaunchMemoryMonitor();

    /* renamed from: b */
    private static boolean f83385b;

    /* renamed from: c */
    private static long f83386c;

    private LaunchMemoryMonitor() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124418a() {
        f83386c = System.currentTimeMillis();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.c$a */
    static final class RunnableC32506a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PerfTracker f83387a;

        RunnableC32506a(PerfTracker gVar) {
            this.f83387a = gVar;
        }

        public final void run() {
            JSONObject b = this.f83387a.mo118773b();
            if (((MemTracker) this.f83387a).mo118774c()) {
                BasePerfMonitor.f83381a.mo118769a(this.f83387a.mo118779f(), b);
            }
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124420b() {
        PerfTracker a = BasePerfMonitor.f83381a.mo118767a("key_mem_cal_launch_calendar_view");
        if (a instanceof MemTracker) {
            BasePerfMonitor.f83381a.mo118770b("key_mem_cal_launch_calendar_view");
            UICallbackExecutor.post(new RunnableC32506a(a));
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124419a(String str) {
        if (!f83385b) {
            f83385b = true;
            PerfTracker a = BasePerfMonitor.f83381a.mo118767a("key_mem_cal_launch_calendar_view");
            if (!(a instanceof MemTracker)) {
                a = null;
            }
            MemTracker eVar = (MemTracker) a;
            if (eVar == null) {
                eVar = new MemTracker("perf_cal_launch");
            }
            eVar.mo118772a();
            String valueOf = String.valueOf(System.currentTimeMillis() - f83386c);
            String[] strArr = new String[4];
            strArr[0] = "view_type";
            if (str == null) {
                str = "";
            }
            strArr[1] = str;
            strArr[2] = "launch_later_app_time";
            strArr[3] = valueOf;
            eVar.mo118776a((String[]) Arrays.copyOf(strArr, 4));
            BasePerfMonitor.f83381a.mo118768a("key_mem_cal_launch_calendar_view", eVar);
        }
    }
}
