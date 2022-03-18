package com.ss.android.vc.meeting.module.meetingdialog.labs;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.FeaturePerfConfig;
import com.ss.android.vc.irtc.RtcDevicePerfInfo;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.C61282e;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.VideoChatManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/labs/LabsPerfChecker;", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "cpuCores", "", "duration", "effectConfig", "Lcom/ss/android/vc/entity/FeaturePerfConfig$DEffect;", "enable", "", "interval", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "overloadStartTime", "", "task", "Ljava/lang/Runnable;", "process", "", "appUsage", "", "totalUsage", "start", "stop", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.q */
public final class LabsPerfChecker {

    /* renamed from: b */
    public static final Companion f156508b = new Companion(null);

    /* renamed from: j */
    private static long f156509j;

    /* renamed from: a */
    public volatile boolean f156510a;

    /* renamed from: c */
    private long f156511c;

    /* renamed from: d */
    private int f156512d = 1;

    /* renamed from: e */
    private int f156513e;

    /* renamed from: f */
    private int f156514f;

    /* renamed from: g */
    private FeaturePerfConfig.DEffect f156515g;

    /* renamed from: h */
    private final Runnable f156516h = new RunnableC62292c(this);

    /* renamed from: i */
    private final C61303k f156517i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/labs/LabsPerfChecker$Companion;", "", "()V", "TAG", "", "lastTriggerTime", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.q$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final C61303k mo215422c() {
        return this.f156517i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/meetingdialog/labs/LabsPerfChecker$process$1$1$1", "com/ss/android/vc/meeting/module/meetingdialog/labs/LabsPerfChecker$$special$$inlined$forEach$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.q$b */
    static final class RunnableC62291b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LabsPerfChecker f156518a;

        /* renamed from: b */
        final /* synthetic */ double f156519b;

        RunnableC62291b(LabsPerfChecker qVar, double d) {
            this.f156518a = qVar;
            this.f156519b = d;
        }

        public final void run() {
            this.f156518a.mo215422c().ad().mo217386a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.q$c */
    static final class RunnableC62292c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LabsPerfChecker f156520a;

        RunnableC62292c(LabsPerfChecker qVar) {
            this.f156520a = qVar;
        }

        public final void run() {
            C60700b.m235851b("LabsPerfChecker", "[task]", "run");
            this.f156520a.f156510a = true;
        }
    }

    /* renamed from: b */
    public final void mo215421b() {
        C60700b.m235851b("LabsPerfChecker", "[stop]", "check " + f156509j);
        C60735ab.m236011b(this.f156516h);
        this.f156510a = false;
    }

    /* renamed from: a */
    public final void mo215419a() {
        FeaturePerfConfig.Detection detection;
        FeaturePerfConfig.Dynamic dynamic;
        List<FeaturePerfConfig.DEffect> list;
        boolean b = C63634c.m249496b("byteview.meeting.android.dynamicdegrade");
        C60700b.m235851b("LabsPerfChecker", "[start]", b + ", check " + f156509j);
        if (b) {
            VideoChatManager a = VideoChatManager.m249444a();
            Intrinsics.checkExpressionValueIsNotNull(a, "VideoChatManager.getInstance()");
            C61282e k = a.mo220133k();
            Intrinsics.checkExpressionValueIsNotNull(k, "VideoChatManager.getInstance().meetingConfig");
            FeaturePerfConfig b2 = k.mo211941b();
            C61237h a2 = C61237h.m238223a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "VcRtcService.getInstance()");
            RtcDevicePerfInfo D = a2.mo210484D();
            this.f156512d = D.cpuCores;
            if (!(b2 == null || (dynamic = b2.dynamic) == null || (list = dynamic.effect) == null)) {
                for (T t : list) {
                    if (this.f156512d >= t.range.min && D.cpuCores <= t.range.max) {
                        this.f156515g = t;
                    }
                }
            }
            FeaturePerfConfig.DEffect dEffect = this.f156515g;
            if (!(dEffect == null || (detection = dEffect.detection) == null)) {
                C60700b.m235851b("LabsPerfChecker", "[detectAppConfig]", "detection " + this.f156512d + ", " + detection.entryMeetingDuration + ", " + detection.overloadDuration + ", " + detection.actionInterval);
                this.f156513e = detection.overloadDuration * 1000;
                this.f156514f = detection.actionInterval * 1000;
                C60735ab.m236002a(this.f156516h, ((long) detection.entryMeetingDuration) * 1000);
                List<FeaturePerfConfig.Rule> list2 = detection.overloadRules;
                if (list2 != null) {
                    for (T t2 : list2) {
                        C60700b.m235851b("LabsPerfChecker", "[detectAppConfig2]", t2.appCpu + ", " + (((float) t2.appCpu) / 100.0f));
                    }
                }
            }
        }
    }

    public LabsPerfChecker(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f156517i = kVar;
    }

    /* renamed from: a */
    public final void mo215420a(double d, double d2) {
        FeaturePerfConfig.Detection detection;
        if (this.f156510a) {
            C60700b.m235851b("LabsPerfChecker", "[process]", "appCpu = " + d + " totalCpu = " + d2);
            FeaturePerfConfig.DEffect dEffect = this.f156515g;
            if (dEffect != null && (detection = dEffect.detection) != null) {
                List<FeaturePerfConfig.Rule> list = detection.overloadRules;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (d >= ((double) (((float) it.next().appCpu) / 100.0f))) {
                            if (this.f156511c == 0) {
                                C60700b.m235851b("LabsPerfChecker", "[process2]", "set overloadStartTime");
                                this.f156511c = System.currentTimeMillis();
                                return;
                            } else if (System.currentTimeMillis() - this.f156511c < ((long) this.f156513e)) {
                                return;
                            } else {
                                if (f156509j == 0 || System.currentTimeMillis() - f156509j >= ((long) this.f156514f)) {
                                    f156509j = System.currentTimeMillis();
                                    C60700b.m235851b("LabsPerfChecker", "[process3]", "trigger dialog " + f156509j);
                                    this.f156511c = 0;
                                    C60735ab.m236001a(new RunnableC62291b(this, d));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                if (this.f156511c != 0) {
                    C60700b.m235851b("LabsPerfChecker", "[process4]", "reset overloadStartTime");
                    this.f156511c = 0;
                }
            }
        }
    }
}
