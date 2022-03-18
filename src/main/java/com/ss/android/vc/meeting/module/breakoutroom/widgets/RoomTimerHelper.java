package com.ss.android.vc.meeting.module.breakoutroom.widgets;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60745ag;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.data.MeetingTimeData;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/meeting/module/breakoutroom/widgets/RoomTimerHelper;", "", "meetingRef", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Ljava/lang/ref/WeakReference;)V", "TAG", "", "_mMeetingTime", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/vc/meeting/model/data/MeetingTimeData;", "duration", "", "mMeetingStartTime", "mMeetingTime", "Landroidx/lifecycle/LiveData;", "getMMeetingTime", "()Landroidx/lifecycle/LiveData;", "timer", "Lcom/ss/android/vc/common/utils/VcScheduleTaskUtils$ScheduleTask;", "doTimerTask", "", "getDuration", "meetingStartTime", "resetTimer", "startTimer", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b.c */
public final class RoomTimerHelper {

    /* renamed from: a */
    public final C1177w<MeetingTimeData> f154323a;

    /* renamed from: b */
    private long f154324b;

    /* renamed from: c */
    private final String f154325c = "BreakoutRoom_MeetingTimerHelper";

    /* renamed from: d */
    private long f154326d;

    /* renamed from: e */
    private final LiveData<MeetingTimeData> f154327e;

    /* renamed from: f */
    private C60745ag.C60746a f154328f;

    /* renamed from: g */
    private final WeakReference<C61303k> f154329g;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b.c$a */
    public static final class RunnableC61526a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RoomTimerHelper f154331a;

        RunnableC61526a(RoomTimerHelper cVar) {
            this.f154331a = cVar;
        }

        public final void run() {
            this.f154331a.mo213229a();
        }
    }

    /* renamed from: b */
    public final void mo213232b() {
        C60700b.m235851b(this.f154325c, "[resetTimer]", "endTimerTask ");
        C60745ag.C60746a aVar = this.f154328f;
        if (aVar != null) {
            aVar.mo208366a(false);
        }
        this.f154328f = null;
    }

    /* renamed from: a */
    public final void mo213229a() {
        AbsBreakoutRoomControl al;
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
        long j = (long) 1000;
        long syncNtpTimeMillis = (settingDependency.getSyncNtpTimeMillis() - this.f154326d) / j;
        this.f154324b = syncNtpTimeMillis;
        if (syncNtpTimeMillis < 0) {
            C60700b.m235864f(this.f154325c, "[doTimerTask]", "VcContextDeps.getNtpServerTime() is less than meeting start time, force to use local time instead");
            this.f154324b = (System.currentTimeMillis() - this.f154326d) / j;
        }
        if (this.f154324b < 0) {
            C60700b.m235864f(this.f154325c, "[doTimerTask2]", "both VcContextDeps.getNtpServerTime() and local time  are less than meeting start time, force to zero");
            this.f154324b = 0;
        }
        MeetingTimeData b = this.f154323a.mo5927b();
        if (b != null) {
            b.mo212433a(this.f154324b);
        }
        if (b != null) {
            String a = C60774p.m236130a(this.f154324b);
            Intrinsics.checkExpressionValueIsNotNull(a, "VCDateUtils.transferTime(duration)");
            b.mo212434a(a);
        }
        this.f154323a.mo5926a(b);
        C61303k kVar = this.f154329g.get();
        if (kVar != null && (al = kVar.al()) != null) {
            al.mo213162a(b);
        }
    }

    public RoomTimerHelper(WeakReference<C61303k> weakReference) {
        Intrinsics.checkParameterIsNotNull(weakReference, "meetingRef");
        this.f154329g = weakReference;
        C1177w<MeetingTimeData> wVar = new C1177w<>();
        this.f154323a = wVar;
        this.f154327e = wVar;
        C26171w.m94675a(new Runnable(this) {
            /* class com.ss.android.vc.meeting.module.breakoutroom.widgets.RoomTimerHelper.RunnableC615251 */

            /* renamed from: a */
            final /* synthetic */ RoomTimerHelper f154330a;

            {
                this.f154330a = r1;
            }

            public final void run() {
                this.f154330a.f154323a.mo5929b(new MeetingTimeData(0, "00:00"));
            }
        });
    }

    /* renamed from: a */
    public final void mo213230a(long j) {
        this.f154326d = j;
        if (this.f154328f == null) {
            C60700b.m235851b(this.f154325c, "[startTimer]", "startTimerTask ");
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = (long) 1000;
            this.f154328f = C60745ag.m236064a(new RunnableC61526a(this), (((currentTimeMillis / j2) + 1) * j2) - currentTimeMillis, 1000);
        }
    }

    /* renamed from: b */
    public final long mo213231b(long j) {
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
        long j2 = (long) 1000;
        long syncNtpTimeMillis = (settingDependency.getSyncNtpTimeMillis() - j) / j2;
        if (syncNtpTimeMillis < 0) {
            C60700b.m235864f(this.f154325c, "[getDuration]", "VcContextDeps.getNtpServerTime() is less than meeting start time, force to use local time instead");
            syncNtpTimeMillis = (System.currentTimeMillis() - j) / j2;
        }
        if (syncNtpTimeMillis >= 0) {
            return syncNtpTimeMillis;
        }
        C60700b.m235864f(this.f154325c, "[getDuration2]", "both VcContextDeps.getNtpServerTime() and local time  are less than meeting start time, force to zero");
        return 0;
    }
}
