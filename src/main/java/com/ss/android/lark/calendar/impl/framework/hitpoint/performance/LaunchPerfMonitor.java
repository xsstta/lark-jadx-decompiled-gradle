package com.ss.android.lark.calendar.impl.framework.hitpoint.performance;

import com.bytedance.services.apm.api.EnsureManager;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32487d;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\b\u0010\u0016\u001a\u00020\u0012H\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u001c\u001a\u00020\u0012H\u0007J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J \u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/performance/LaunchPerfMonitor;", "", "()V", "EVENT_NAME", "", "MAX_DIFF_TIME_LIMIT", "", "NO_INSTANCE", "PERF_KEY", "instanceNum", "isAddedParam", "", "isShowedOneDayLayer", "isShowedView", "isStartedTrack", "markExecutedMap", "Ljava/util/concurrent/ConcurrentHashMap;", "drop", "", "end", "endIfFirstOneDayNotInstance", "dataSize", "endIfNoInstance", "paramOnlyFirst", "insNum", "putParams", "key", "value", "setColdLaunchMode", "stageEnd", "stageName", "stageParam", "stageStart", "start", "viewType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.d */
public final class LaunchPerfMonitor {

    /* renamed from: a */
    public static final LaunchPerfMonitor f83388a = new LaunchPerfMonitor();

    /* renamed from: b */
    private static boolean f83389b;

    /* renamed from: c */
    private static boolean f83390c;

    /* renamed from: d */
    private static boolean f83391d;

    /* renamed from: e */
    private static String f83392e = "-1";

    /* renamed from: f */
    private static final ConcurrentHashMap<String, Boolean> f83393f = new ConcurrentHashMap<>();

    private LaunchPerfMonitor() {
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m124429d() {
        BasePerfMonitor.f83381a.mo118770b("key_perf_cal_launch");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124421a() {
        PerfTracker a = BasePerfMonitor.f83381a.mo118767a("key_perf_cal_launch");
        String[] strArr = {"launch_type", "cold_launch"};
        if (a != null) {
            a.mo118776a((String[]) Arrays.copyOf(strArr, 2));
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124425b() {
        f83391d = true;
        if ((BasePerfMonitor.f83381a.mo118767a("key_perf_cal_launch") instanceof PerfTracker) && f83390c && Intrinsics.areEqual(f83392e, "0")) {
            m124427c();
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m124427c() {
        boolean z;
        PerfTracker a = BasePerfMonitor.f83381a.mo118767a("key_perf_cal_launch");
        if (a instanceof PerfTracker) {
            BasePerfMonitor.f83381a.mo118770b("key_perf_cal_launch");
            if (a.mo118778e() > 0 && a.mo118778e() <= ((long) 120000)) {
                BasePerfMonitor.f83381a.mo118769a(a.mo118779f(), a.mo118773b());
                C30022a.f74882a.mainModuleDependency().mo108282e();
                if (a.mo118778e() < 800) {
                    z = true;
                } else {
                    z = false;
                }
                EnsureManager.ensureTrue(z, "duration = " + a.mo118778e() + "; currentTime = " + System.currentTimeMillis());
                AppreciableHitPoint.f83321a.mo118687f();
                C30022a.f74882a.perfDependency().mo108289b("CalendarColdMainFragment", true, "perf_cal_launch", null, null);
                EventBus.getDefault().trigger(new C32487d());
            } else {
                return;
            }
        }
        AppreciableHitPoint.f83321a.mo118677a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124422a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "viewType");
        if (!f83389b) {
            f83389b = true;
            PerfTracker a = BasePerfMonitor.f83381a.mo118767a("key_perf_cal_launch");
            if (a != null) {
                a.mo118775a(System.currentTimeMillis());
            }
            if (a == null) {
                a = new PerfTracker("perf_cal_launch");
            }
            a.mo118776a((String[]) Arrays.copyOf(new String[]{"view_type", str}, 2));
            BasePerfMonitor.f83381a.mo118768a("key_perf_cal_launch", a);
            C30022a.f74882a.perfDependency().mo108288a("CalendarColdMainFragment", true, "perf_cal_launch", str, null);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124426b(String str) {
        if (!f83390c) {
            f83390c = true;
            PerfTracker a = BasePerfMonitor.f83381a.mo118767a("key_perf_cal_launch");
            if (str == null) {
                str = "0";
            }
            String[] strArr = {"data_length", str};
            f83392e = str;
            if (!(a instanceof PerfTracker)) {
                PerfTracker gVar = new PerfTracker("perf_cal_launch");
                gVar.mo118776a((String[]) Arrays.copyOf(strArr, 2));
                BasePerfMonitor.f83381a.mo118768a("key_perf_cal_launch", gVar);
            } else if (a.mo118778e() > ((long) 120000)) {
                BasePerfMonitor.f83381a.mo118770b("key_perf_cal_launch");
            } else {
                a.mo118776a((String[]) Arrays.copyOf(strArr, 2));
                BasePerfMonitor.f83381a.mo118768a("key_perf_cal_launch", a);
            }
            if (f83389b && f83391d && Intrinsics.areEqual(f83392e, "0")) {
                m124427c();
            }
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m124430d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "stageName");
        BasePerfMonitor aVar = BasePerfMonitor.f83381a;
        PerfTracker a = aVar.mo118767a("key_perf_cal_launch" + str);
        if (a instanceof PerfTracker) {
            f83393f.put(str, true);
            BasePerfMonitor aVar2 = BasePerfMonitor.f83381a;
            aVar2.mo118770b("key_perf_cal_launch" + str);
            if (a.mo118778e() > 0 && a.mo118778e() <= ((long) 120000)) {
                BasePerfMonitor.f83381a.mo118769a(a.mo118779f(), a.mo118773b());
                C30022a.f74882a.perfDependency().mo108289b("CalendarColdMainFragment", false, str, null, null);
            }
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m124428c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "stageName");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = f83393f;
        if (!Intrinsics.areEqual((Object) concurrentHashMap.get(str), (Object) true)) {
            concurrentHashMap.put(str, true);
            BasePerfMonitor aVar = BasePerfMonitor.f83381a;
            PerfTracker a = aVar.mo118767a("key_perf_cal_launch" + str);
            if (a != null) {
                a.mo118775a(System.currentTimeMillis());
            }
            if (a == null) {
                a = new PerfTracker("perf_cal_launch");
            }
            a.mo118776a((String[]) Arrays.copyOf(new String[]{"view_type", PerfHelper.m124435a(), "launch_stage_name", str}, 4));
            BasePerfMonitor aVar2 = BasePerfMonitor.f83381a;
            aVar2.mo118768a("key_perf_cal_launch" + str, a);
            C30022a.f74882a.perfDependency().mo108288a("CalendarColdMainFragment", false, str, null, null);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124423a(String str, String str2) {
        if (str != null && str2 != null) {
            PerfTracker a = BasePerfMonitor.f83381a.mo118767a("key_perf_cal_launch");
            String[] strArr = {str, str2};
            if (a != null) {
                a.mo118776a((String[]) Arrays.copyOf(strArr, 2));
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124424a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "stageName");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(str3, "value");
        String str4 = str + "_p";
        ConcurrentHashMap<String, Boolean> concurrentHashMap = f83393f;
        if (!Intrinsics.areEqual((Object) concurrentHashMap.get(str4), (Object) true)) {
            concurrentHashMap.put(str4, true);
            PerfTracker a = BasePerfMonitor.f83381a.mo118767a("key_perf_cal_launch" + str);
            if (a == null) {
                a = new PerfTracker("perf_cal_launch");
                BasePerfMonitor.f83381a.mo118768a("key_perf_cal_launch" + str, a);
            }
            a.mo118776a((String[]) Arrays.copyOf(new String[]{str2, str3}, 2));
        }
    }
}
