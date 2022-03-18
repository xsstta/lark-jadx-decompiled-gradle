package com.ss.android.vc.meeting.model.util;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60745ag;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.entity.VcBillingLinkConfig;
import com.ss.android.vc.entity.VcI18nKeyInfo;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatNoticeUpdate;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.response.C60953a;
import com.ss.android.vc.meeting.framework.manager.C61282e;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.model.data.MeetingTimeData;
import com.ss.android.vc.meeting.module.p3156r.AbstractC62787a;
import com.ss.android.vc.meeting.module.topbar.AbstractC63441a;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.C63603f;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.statistics.event.ao;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\fH\u0002J\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\fJ\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/vc/meeting/model/util/MeetingTimerHelper;", "", "meetingRef", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Ljava/lang/ref/WeakReference;)V", "TAG", "", "_mMeetingTime", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/vc/meeting/model/data/MeetingTimeData;", "duration", "", "mMeetingStartTime", "mMeetingTime", "Landroidx/lifecycle/LiveData;", "getMMeetingTime", "()Landroidx/lifecycle/LiveData;", "timer", "Lcom/ss/android/vc/common/utils/VcScheduleTaskUtils$ScheduleTask;", "doTimerTask", "", "hostDismissCountDownTip", "hostShowCountDownTip", "remindSecond", "resetTimer", "startTimer", "meetingStartTime", "synctMeetingStartTime", "meetingId", "updateMeetingTime", "updatePlanCountDown", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.model.b.c */
public final class MeetingTimerHelper {

    /* renamed from: a */
    public final String f153810a;

    /* renamed from: b */
    public volatile long f153811b;

    /* renamed from: c */
    public final C1177w<MeetingTimeData> f153812c;

    /* renamed from: d */
    private long f153813d;

    /* renamed from: e */
    private final LiveData<MeetingTimeData> f153814e;

    /* renamed from: f */
    private C60745ag.C60746a f153815f;

    /* renamed from: g */
    private final WeakReference<C61303k> f153816g;

    /* renamed from: a */
    public final LiveData<MeetingTimeData> mo212458a() {
        return this.f153814e;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.model.b.c$a */
    public static final class RunnableC61379a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingTimerHelper f153818a;

        RunnableC61379a(MeetingTimerHelper cVar) {
            this.f153818a = cVar;
        }

        public final void run() {
            this.f153818a.mo212460b();
        }
    }

    /* renamed from: c */
    public final void mo212461c() {
        C60700b.m235851b(this.f153810a, "[resetTimer]", "endTimerTask ");
        C60745ag.C60746a aVar = this.f153815f;
        if (aVar != null) {
            aVar.mo208366a(false);
        }
    }

    /* renamed from: d */
    private final void m239191d() {
        AbstractC63441a ah;
        MeetingTimeData b = this.f153812c.mo5927b();
        if (b != null) {
            b.mo212433a(this.f153813d);
        }
        if (b != null) {
            String a = C60774p.m236130a(this.f153813d);
            Intrinsics.checkExpressionValueIsNotNull(a, "VCDateUtils.transferTime(duration)");
            b.mo212434a(a);
        }
        this.f153812c.mo5926a(b);
        C61303k kVar = this.f153816g.get();
        if (kVar != null && (ah = kVar.ah()) != null) {
            ah.mo219476a(b);
        }
    }

    /* renamed from: f */
    private final void m239193f() {
        String str;
        VideoChatNoticeUpdate videoChatNoticeUpdate = new VideoChatNoticeUpdate();
        videoChatNoticeUpdate.action = VideoChatNoticeUpdate.Action.DISMISS;
        videoChatNoticeUpdate.key = "countDown";
        C61303k kVar = this.f153816g.get();
        if (kVar != null) {
            str = kVar.mo212055d();
        } else {
            str = null;
        }
        videoChatNoticeUpdate.meetingId = str;
        C63603f.m249426a(videoChatNoticeUpdate);
    }

    /* renamed from: b */
    public final void mo212460b() {
        try {
            C60700b.m235858d(this.f153810a, "[doTimerTask1]", "start");
            aj settingDependency = VideoChatModuleDependency.getSettingDependency();
            Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
            long syncNtpTimeMillis = settingDependency.getSyncNtpTimeMillis();
            String str = this.f153810a;
            C60700b.m235844a(str, "[doTimerTask2]", "[syncNtpTimeMillis]" + syncNtpTimeMillis + ", [meetingStartTime]" + this.f153811b, 10000);
            long j = (long) 1000;
            long j2 = (syncNtpTimeMillis - this.f153811b) / j;
            this.f153813d = j2;
            if (j2 < 0) {
                C60700b.m235864f(this.f153810a, "[doTimerTask3]", "syncNtpTimeMillis is less than meeting start time, force to use local time instead");
                this.f153813d = (System.currentTimeMillis() - this.f153811b) / j;
            }
            if (this.f153813d < 0) {
                C60700b.m235864f(this.f153810a, "[doTimerTask4]", "both syncNtpTimeMillis and local time  are less than meeting start time, force to zero");
                this.f153813d = 0;
            }
            String str2 = this.f153810a;
            C60700b.m235844a(str2, "[doTimerTask5]", "[duration]" + this.f153813d, 10000);
            m239191d();
            m239192e();
            C60700b.m235858d(this.f153810a, "[doTimerTask6]", "end");
        } catch (Exception e) {
            String str3 = this.f153810a;
            C60700b.m235851b(str3, "[doTimerTask7]", "exception:" + e);
        }
    }

    /* renamed from: e */
    private final void m239192e() {
        AbstractC62787a ac;
        AbstractC63441a ah;
        C61303k kVar;
        AbstractC62787a ac2;
        VideoChat e;
        VideoChatSettings videoChatSettings;
        VideoChat videoChat;
        AbstractC62787a ac3;
        AbstractC62787a ac4;
        C61303k kVar2 = this.f153816g.get();
        if (kVar2 == null || (ah = kVar2.ah()) == null || !ah.mo219481a() || !ParticipantUtil.m248733c(this.f153816g.get())) {
            C61303k kVar3 = this.f153816g.get();
            if (kVar3 != null && (ac = kVar3.ac()) != null && ac.mo216839c()) {
                m239193f();
                return;
            }
            return;
        }
        int i = Integer.MAX_VALUE;
        if (this.f153816g.get() != null) {
            C61303k kVar4 = this.f153816g.get();
            if (kVar4 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(kVar4, "meetingRef.get()!!");
            if (kVar4.mo212056e() != null) {
                C61303k kVar5 = this.f153816g.get();
                if (kVar5 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(kVar5, "meetingRef.get()!!");
                VideoChat e2 = kVar5.mo212056e();
                if (e2 == null) {
                    Intrinsics.throwNpe();
                }
                if (e2.getVideoChatSettings() != null) {
                    C61303k kVar6 = this.f153816g.get();
                    if (kVar6 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(kVar6, "meetingRef.get()!!");
                    VideoChat e3 = kVar6.mo212056e();
                    if (e3 == null) {
                        Intrinsics.throwNpe();
                    }
                    VideoChatSettings videoChatSettings2 = e3.getVideoChatSettings();
                    if (videoChatSettings2 == null) {
                        Intrinsics.throwNpe();
                    }
                    i = 60 * videoChatSettings2.getCountDownDuration();
                }
            }
        }
        long j = this.f153813d;
        if (j >= ((long) (i - 600))) {
            long j2 = (long) i;
            if (j < j2) {
                m239190b(j2 - j);
                C61303k kVar7 = this.f153816g.get();
                if (!(kVar7 == null || (ac4 = kVar7.ac()) == null)) {
                    ac4.mo216837b(true);
                }
            }
        }
        if (this.f153813d >= ((long) i) && (kVar = this.f153816g.get()) != null && (ac2 = kVar.ac()) != null && ac2.mo216839c()) {
            C61303k kVar8 = this.f153816g.get();
            if (!(kVar8 == null || (ac3 = kVar8.ac()) == null)) {
                ac3.mo216837b(false);
            }
            C61303k kVar9 = this.f153816g.get();
            if (kVar9 == null || (e = kVar9.mo212056e()) == null || (videoChatSettings = e.getVideoChatSettings()) == null || !videoChatSettings.shouldEndMeetingOrCloseTip()) {
                C60738ac.m236024a(R.drawable.icon_toast_info, R.string.View_G_TimeLimitRemoved, 3000);
                return;
            }
            C61344j a = C61344j.m239002a().mo212329a(SmEvents.EVENT_MEETING_LICENSE_TIME_OUT).mo212331a(EventSource.EVENT_NONE);
            C61303k kVar10 = this.f153816g.get();
            if (kVar10 != null) {
                kVar10.mo212051a(a);
            }
            C61303k kVar11 = this.f153816g.get();
            if (kVar11 != null) {
                videoChat = kVar11.mo212056e();
            } else {
                videoChat = null;
            }
            ao.m250026a(videoChat, "freetime_out");
            C60700b.m235851b(this.f153810a, "[updatePlanCountDown], ", "EVENT_MEETING_LICENSE_TIME_OUT");
        }
    }

    /* renamed from: a */
    private final void m239189a(String str) {
        if (str != null) {
            VcBizSender.m249305o(str).mo219889a(new C61380b(System.currentTimeMillis(), this, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/vc/meeting/model/util/MeetingTimerHelper$synctMeetingStartTime$1$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/AdjustMeetingDurationEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "entity", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.model.b.c$b */
    public static final class C61380b implements AbstractC63598b<C60953a> {

        /* renamed from: a */
        final /* synthetic */ long f153819a;

        /* renamed from: b */
        final /* synthetic */ MeetingTimerHelper f153820b;

        /* renamed from: c */
        final /* synthetic */ String f153821c;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            String str = this.f153820b.f153810a;
            C60700b.m235864f(str, "pullVCMeetingDuration", "meetingId[" + this.f153821c + "], error");
        }

        /* renamed from: a */
        public void onSuccess(C60953a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "entity");
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - (aVar.f152631a + (((currentTimeMillis - this.f153819a) - aVar.f152632b) / ((long) 2)));
            String str = this.f153820b.f153810a;
            C60700b.m235851b(str, "pullVCMeetingDuration", "meetingId[" + this.f153821c + "], startTime = " + this.f153820b.f153811b + ", adjustStartTime = " + j);
            this.f153820b.f153811b = j;
        }

        C61380b(long j, MeetingTimerHelper cVar, String str) {
            this.f153819a = j;
            this.f153820b = cVar;
            this.f153821c = str;
        }
    }

    public MeetingTimerHelper(WeakReference<C61303k> weakReference) {
        Integer num;
        Intrinsics.checkParameterIsNotNull(weakReference, "meetingRef");
        this.f153816g = weakReference;
        StringBuilder sb = new StringBuilder();
        sb.append("MeetingTimerHelper@");
        C61303k kVar = weakReference.get();
        if (kVar != null) {
            num = Integer.valueOf(kVar.hashCode());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append("-");
        sb.append(hashCode());
        this.f153810a = sb.toString();
        C1177w<MeetingTimeData> wVar = new C1177w<>();
        this.f153812c = wVar;
        this.f153814e = wVar;
        C26171w.m94675a(new Runnable(this) {
            /* class com.ss.android.vc.meeting.model.util.MeetingTimerHelper.RunnableC613781 */

            /* renamed from: a */
            final /* synthetic */ MeetingTimerHelper f153817a;

            {
                this.f153817a = r1;
            }

            public final void run() {
                this.f153817a.f153812c.mo5929b(new MeetingTimeData(0, "00:00"));
            }
        });
    }

    /* renamed from: b */
    private final void m239190b(long j) {
        String str;
        VcBillingLinkConfig e;
        if (ParticipantUtil.m248733c(this.f153816g.get())) {
            VcMsgInfo vcMsgInfo = new VcMsgInfo();
            vcMsgInfo.message = String.valueOf(j);
            HashMap hashMap = new HashMap();
            hashMap.put("icon_type", "error");
            vcMsgInfo.extra = hashMap;
            vcMsgInfo.type = VcMsgInfo.Type.TIPS;
            VcI18nKeyInfo vcI18nKeyInfo = new VcI18nKeyInfo();
            vcI18nKeyInfo.type = VcI18nKeyInfo.Type.PLAN_COUNT_DOWN;
            vcI18nKeyInfo.newKey = "countDown";
            VideoChatManager a = VideoChatManager.m249444a();
            Intrinsics.checkExpressionValueIsNotNull(a, "VideoChatManager.getInstance()");
            C61282e k = a.mo220133k();
            if (k == null || (e = k.mo211944e()) == null) {
                str = null;
            } else {
                str = e.getUpgradeLink();
            }
            if (TextUtils.isEmpty(str)) {
                C60700b.m235861e(this.f153810a, "[hostShowCountDownTip]", "url is empty");
                str = "";
            }
            vcI18nKeyInfo.jumpScheme = str;
            vcMsgInfo.msg_i18n_key = vcI18nKeyInfo;
            C63603f.m249424a(vcMsgInfo);
        }
    }

    /* renamed from: a */
    public final void mo212459a(long j) {
        String str;
        String str2 = this.f153810a;
        C60700b.m235851b(str2, "[startTimer]", "meetingStartTime = " + j);
        this.f153811b = j;
        if (this.f153815f == null) {
            C60700b.m235851b(this.f153810a, "[startTimer]", "startTimerTask ");
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = (long) 1000;
            this.f153815f = C60745ag.m236064a(new RunnableC61379a(this), (((currentTimeMillis / j2) + 1) * j2) - currentTimeMillis, 1000);
            C61303k kVar = this.f153816g.get();
            if (kVar != null) {
                str = kVar.mo212055d();
            } else {
                str = null;
            }
            m239189a(str);
        }
    }
}
