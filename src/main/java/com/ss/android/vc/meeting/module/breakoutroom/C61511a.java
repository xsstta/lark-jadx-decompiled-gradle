package com.ss.android.vc.meeting.module.breakoutroom;

import android.os.CountDownTimer;
import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.pb.videochat.VCManageApplyResponse;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60761j;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.breakoutroom.VCBreakoutRoomJoinEntity;
import com.ss.android.vc.meeting.basedialog.C61227f;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.model.data.MeetingTimeData;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfoSettings;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.breakoutroom.C61511a;
import com.ss.android.vc.meeting.module.breakoutroom.widgets.RoomTimerHelper;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63752c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.module.breakoutroom.a */
public class C61511a extends AbsBreakoutRoomControl {

    /* renamed from: A */
    private String f154261A;

    /* renamed from: B */
    private MeetingTimeData f154262B = new MeetingTimeData(0, "00:00");

    /* renamed from: C */
    private RoomTimerHelper f154263C = new RoomTimerHelper(new WeakReference(getMeeting()));

    /* renamed from: D */
    private AbsBreakoutRoomControl.AbstractC61509c f154264D;

    /* renamed from: E */
    private CountDownTimer f154265E;

    /* renamed from: a */
    public AbsBreakoutRoomControl.Status f154266a;

    /* renamed from: b */
    public VCBreakoutRoomInfo f154267b;

    /* renamed from: c */
    public VideoChatSettings f154268c;

    /* renamed from: d */
    public Runnable f154269d;

    /* renamed from: e */
    public VCBreakoutRoomInfo.Status f154270e;

    /* renamed from: f */
    public String f154271f;

    /* renamed from: g */
    public String f154272g;

    /* renamed from: h */
    public volatile boolean f154273h;

    /* renamed from: i */
    public volatile boolean f154274i;

    /* renamed from: j */
    public volatile boolean f154275j;

    /* renamed from: k */
    public volatile boolean f154276k;

    /* renamed from: l */
    public List<AbsBreakoutRoomControl.AbstractC61508b> f154277l = new CopyOnWriteArrayList();

    /* renamed from: m */
    public List<AbsBreakoutRoomControl.AbstractC61510d> f154278m = new CopyOnWriteArrayList();

    /* renamed from: n */
    public boolean f154279n = true;

    /* renamed from: o */
    public AtomicBoolean f154280o = new AtomicBoolean(false);

    /* renamed from: p */
    public C1177w<Long> f154281p;

    /* renamed from: q */
    LiveData<Long> f154282q;

    /* renamed from: r */
    public CountDownTimer f154283r;

    /* renamed from: s */
    public boolean f154284s;

    /* renamed from: t */
    boolean f154285t;

    /* renamed from: u */
    private AbsBreakoutRoomControl.AbstractC61507a f154286u = new AbsBreakoutRoomControl.AbstractC61507a() {
        /* class com.ss.android.vc.meeting.module.breakoutroom.C61511a.C615121 */

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m240132a() {
            C60738ac.m236039c(UIHelper.getString(R.string.View_M_HostMutedYourMic));
        }

        @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61507a
        /* renamed from: a */
        public void mo213188a(boolean z) {
            C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onJoinSuccess]", "onJoinBreakoutRoom Success mnStatus= " + C61511a.this.f154266a + " isToMain: " + z);
            if (C61511a.this.f154266a == AbsBreakoutRoomControl.Status.JOINING) {
                C61511a.this.f154266a = AbsBreakoutRoomControl.Status.JOINED;
                for (AbsBreakoutRoomControl.AbstractC61510d dVar : C61511a.this.f154278m) {
                    dVar.a_(C61511a.this.f154272g, C61511a.this.f154271f);
                }
            } else if (C61511a.this.f154266a == AbsBreakoutRoomControl.Status.LEAVING) {
                C61511a.this.f154266a = AbsBreakoutRoomControl.Status.LEAVED;
                for (AbsBreakoutRoomControl.AbstractC61510d dVar2 : C61511a.this.f154278m) {
                    dVar2.mo213205d(C61511a.this.f154272g, C61511a.this.f154271f);
                }
            }
            C61511a.this.f154275j = false;
            C61511a.this.f154276k = false;
            for (AbsBreakoutRoomControl.AbstractC61508b bVar : C61511a.this.f154277l) {
                bVar.mo213194a(false, false);
            }
            if (C61511a.this.f154269d != null) {
                C60735ab.m236011b(C61511a.this.f154269d);
                C61511a.this.f154269d = null;
            }
            if (z) {
                C60738ac.m236035b(UIHelper.getString(R.string.View_G_YouAreInMainRoom));
                if (!C61511a.this.f154274i) {
                    for (AbsBreakoutRoomControl.AbstractC61508b bVar2 : C61511a.this.f154277l) {
                        bVar2.mo213189a();
                    }
                }
            } else {
                C60738ac.m236035b(UIHelper.mustacheFormat((int) R.string.View_G_YouAreInRoomName, "roomName", C61511a.this.f154267b.getRoomTopic()));
                if (C61511a.this.f154279n) {
                    C61511a.this.mMeeting.ai().mo213044o();
                    C61511a.this.f154279n = false;
                }
            }
            if (C61511a.this.f154268c != null && C61511a.this.f154268c.isMuteOnEntry()) {
                C61511a.this.f154269d = $$Lambda$a$1$3fFGY2JTVuOa1UfMXWLUguPmZ0.INSTANCE;
                C60735ab.m236002a(C61511a.this.f154269d, 2000);
            }
            if (!C61511a.this.mMeeting.mo212092J().mo212510G()) {
                C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onJoinSuccess2]", z + ", onJoinSuccess setPlaybackDigitalMute false");
                C61511a.this.mMeeting.mo212165y().mo212022f(false);
            }
            if (C61511a.this.f154270e == VCBreakoutRoomInfo.Status.COUNT_DOWN) {
                C61511a.this.f154270e = VCBreakoutRoomInfo.Status.IDLE;
            }
            if (C61511a.this.f154283r != null) {
                C61511a.this.f154283r.cancel();
                C61511a.this.f154280o.set(false);
                C61511a.this.f154283r = null;
            }
        }
    };

    /* renamed from: v */
    private String f154287v;

    /* renamed from: w */
    private String f154288w;

    /* renamed from: x */
    private List<Participant> f154289x = new ArrayList();

    /* renamed from: y */
    private String f154290y;

    /* renamed from: z */
    private AtomicBoolean f154291z = new AtomicBoolean(false);

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: d */
    public String mo213175d() {
        return this.f154261A;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: e */
    public C1177w mo213177e() {
        return this.f154281p;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: f */
    public MeetingTimeData mo213179f() {
        return this.f154262B;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: i */
    public boolean mo213182i() {
        return this.f154273h;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: k */
    public VCBreakoutRoomInfo mo213184k() {
        return this.f154267b;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: l */
    public VCBreakoutRoomInfo.Status mo213185l() {
        return this.f154270e;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: m */
    public AbsBreakoutRoomControl.Status mo213186m() {
        return this.f154266a;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: n */
    public List<Participant> mo213187n() {
        return this.f154289x;
    }

    /* renamed from: o */
    public String mo213208o() {
        return this.f154287v;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: a */
    public void mo213166a(VCManageResult vCManageResult) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onPushVCManageResult]", "type= " + vCManageResult.f156104b + " action= " + vCManageResult.f156105c + " status= " + this.f154270e);
        VCManageResult.Type type = vCManageResult.f156104b;
        VCManageResult.Action action = vCManageResult.f156105c;
        if (type == VCManageResult.Type.BREAKOUT_ROOM_NEED_HELP) {
            for (AbsBreakoutRoomControl.AbstractC61508b bVar : this.f154277l) {
                bVar.mo213191a(action);
            }
        } else if (type == VCManageResult.Type.BREAKOUT_ROOM_COUNT_DOWN && vCManageResult.f156106d != null) {
            m240090a(vCManageResult.f156106d.countDownFromStarTime);
        }
    }

    /* renamed from: a */
    public void mo213207a(String str, boolean z) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[joinBreakoutRoom]", "roomId=" + str + " isTransfer=" + z);
        if ("1".equals(str)) {
            this.f154266a = AbsBreakoutRoomControl.Status.LEAVING;
        } else {
            this.f154266a = AbsBreakoutRoomControl.Status.JOINING;
        }
        for (AbsBreakoutRoomControl.AbstractC61508b bVar : this.f154277l) {
            bVar.mo213194a(true, z);
        }
        C61227f.m238148c().mo211721a();
        this.mMeeting.ai().mo213042m();
        for (AbsBreakoutRoomControl.AbstractC61510d dVar : this.f154278m) {
            if (this.f154266a == AbsBreakoutRoomControl.Status.JOINING) {
                dVar.bE_();
            } else {
                dVar.mo213204d();
            }
        }
        if (!this.mMeeting.mo212092J().mo212510G()) {
            C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[joinBreakoutRoom]", "setPlaybackDigitalMute true");
            this.mMeeting.mo212165y().mo212022f(true);
        }
        C60735ab.m236002a(new Runnable(str) {
            /* class com.ss.android.vc.meeting.module.breakoutroom.$$Lambda$a$8l0_zQpOoD8Feenb21GS_R3ReU */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61511a.this.m240094g(this.f$1);
            }
        }, 2000);
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: a */
    public void mo213167a(String str) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[showBroadcastTips]", "isInRoom= " + mo213181h());
        mo213176d(str);
        this.f154285t = false;
        for (AbsBreakoutRoomControl.AbstractC61508b bVar : this.f154277l) {
            bVar.mo213192a(this.f154261A);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: a */
    public void mo213168a(boolean z) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[setShowTips]", "show= " + z);
        this.f154291z.set(z);
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: c */
    public boolean mo213174c() {
        return this.f154291z.get();
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: h */
    public boolean mo213181h() {
        if (this.f154273h || this.f154274i) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: j */
    public boolean mo213183j() {
        if (!this.f154274i || this.f154273h) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private boolean m240097r() {
        if (TextUtils.isEmpty(this.f154271f) || "1".equals(this.f154271f)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private String m240095p() {
        List<Participant> f = getMeeting().mo212091I().mo212494b().mo212601f();
        if (CollectionUtils.isEmpty(f)) {
            return "";
        }
        for (Participant participant : f) {
            if (participant.is_host()) {
                return participant.getBreakoutRoomId();
            }
        }
        return "";
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: g */
    public boolean mo213180g() {
        if ((!TextUtils.isEmpty(this.f154288w) || !TextUtils.isEmpty(this.f154271f)) && (TextUtils.isEmpty(this.f154288w) || !this.f154288w.equals(this.f154271f))) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private boolean m240096q() {
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        if (j == null) {
            return false;
        }
        this.f154271f = j.getBreakoutRoomId();
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[initLocalOpenBreakoutRoom]", "meetingId=" + getMeeting().mo212055d() + " selfBreakoutRoomId= " + this.f154271f);
        return m240097r();
    }

    /* renamed from: u */
    private void m240100u() {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[resetLocalStatus]", "resetLocalStatus");
        this.f154267b = null;
        this.f154289x.clear();
        this.f154261A = null;
        this.f154270e = VCBreakoutRoomInfo.Status.IDLE;
        this.f154276k = false;
        this.f154275j = false;
        this.f154284s = false;
        for (AbsBreakoutRoomControl.AbstractC61508b bVar : this.f154277l) {
            bVar.mo213189a();
        }
        RoomTimerHelper cVar = this.f154263C;
        if (cVar != null) {
            cVar.mo213232b();
            this.f154262B = new MeetingTimeData(0, "00:00");
        }
        if (this.f154283r != null && this.f154280o.get()) {
            mo213169b();
            this.f154280o.set(false);
        }
        for (AbsBreakoutRoomControl.AbstractC61508b bVar2 : this.f154277l) {
            bVar2.mo213194a(false, false);
        }
    }

    /* renamed from: s */
    private void m240098s() {
        this.f154289x.clear();
        List<Participant> f = getMeeting().mo212091I().mo212494b().mo212601f();
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[updateBreakoutRoomParticipants]", "mCurHostRoomId=" + this.f154288w + " mHostRoomId=" + mo213208o() + " selfBreakoutRoomId=" + this.f154271f);
        if (this.f154288w == null) {
            this.f154288w = "";
        }
        if (!this.f154288w.equals(mo213208o()) && this.f154271f.equals(mo213208o())) {
            C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_G_HostJoinedRoom, "roomName", this.f154267b.getRoomTopic()));
        }
        this.f154288w = mo213208o();
        if (!CollectionUtils.isEmpty(f)) {
            this.f154289x.addAll(f);
        }
        getMeeting().ai().mo213004a(this.f154289x.size());
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[updateBreakoutRoomParticipants2]", "set mCurHostRoomId-2: " + this.f154288w + "size=" + this.f154289x.size());
    }

    /* renamed from: t */
    private void m240099t() {
        this.f154289x.clear();
        List<Participant> f = getMeeting().mo212091I().mo212494b().mo212601f();
        if (!CollectionUtils.isEmpty(f)) {
            for (Participant participant : f) {
                if (TextUtils.isEmpty(participant.getBreakoutRoomId()) || (!TextUtils.isEmpty(participant.getBreakoutRoomId()) && participant.getBreakoutRoomId().equals(this.f154271f))) {
                    this.f154289x.add(participant);
                }
            }
        }
        getMeeting().ai().mo213004a(this.f154289x.size());
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[filterParticipantsInMainRoom]", "self: " + this.f154271f + ", size =" + this.f154289x.size());
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: b */
    public void mo213169b() {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[leaveBreakoutRoom]", "");
        CountDownTimer countDownTimer = this.f154283r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f154283r = null;
        }
        for (AbsBreakoutRoomControl.AbstractC61510d dVar : this.f154278m) {
            dVar.mo213204d();
        }
        if (this.mMeeting.ab().mo213880f() && this.mMeeting.ab().mo213889o()) {
            this.mMeeting.ab().mo213885k();
        }
        if (this.mMeeting.aj().mo216408a()) {
            this.mMeeting.aj().mo216414d();
        }
        if (!this.mMeeting.mo212092J().mo212510G()) {
            C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[leaveBreakoutRoom]", "setPlaybackDigitalMute true");
            this.mMeeting.mo212165y().mo212022f(true);
        }
        VcBizService.backToMainBreakoutRoom(this.mMeeting.mo212055d(), new AbstractC63598b<VCBreakoutRoomJoinEntity>() {
            /* class com.ss.android.vc.meeting.module.breakoutroom.C61511a.C615143 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("BreakoutRoom_BreakoutRoomControl", "[leaveBreakoutRoom3]", "back to mainRoom error. msg= " + eVar.mo219902b());
            }

            /* renamed from: a */
            public void onSuccess(VCBreakoutRoomJoinEntity vCBreakoutRoomJoinEntity) {
                C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[leaveBreakoutRoom2]", "back to main room success.");
                if (vCBreakoutRoomJoinEntity.getVideoChatInfo() != null) {
                    C61511a.this.f154268c = vCBreakoutRoomJoinEntity.getVideoChatInfo().getVideoChatSettings();
                    if (C61511a.this.f154268c != null) {
                        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[leaveBreakoutRoom3]", "local settings after leave: " + C61511a.this.f154268c.isOpenBreakoutRoom());
                        C61511a.this.f154273h = false;
                        C61511a aVar = C61511a.this;
                        aVar.f154274i = aVar.f154268c.isOpenBreakoutRoom();
                        C61511a.this.f154270e = VCBreakoutRoomInfo.Status.IDLE;
                    }
                }
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: a */
    public void mo213161a() {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[startBroadcastTimer]", "isCounting= " + this.f154285t);
        if (!this.f154285t) {
            CountDownTimer countDownTimer = this.f154265E;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.f154265E = null;
            }
            CountDownTimerC615165 r0 = new CountDownTimer(15000, 1000) {
                /* class com.ss.android.vc.meeting.module.breakoutroom.C61511a.CountDownTimerC615165 */

                public void onFinish() {
                    C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[showBroadcastTips]", "onFinish");
                    for (AbsBreakoutRoomControl.AbstractC61508b bVar : C61511a.this.f154277l) {
                        bVar.mo213189a();
                    }
                    if (CollectionUtils.isEmpty(C61511a.this.f154277l)) {
                        C61511a.this.mo213168a(false);
                    }
                    C61511a.this.f154285t = false;
                    cancel();
                }

                public void onTick(long j) {
                    if (!C61511a.this.f154285t) {
                        C61511a.this.f154285t = true;
                    }
                }
            };
            this.f154265E = r0;
            if (!this.f154285t) {
                r0.start();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: a */
    public void mo213164a(AbsBreakoutRoomControl.AbstractC61509c cVar) {
        this.f154264D = cVar;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: e */
    public void mo213178e(String str) {
        this.f154287v = str;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: a */
    public void mo213162a(MeetingTimeData aVar) {
        this.f154262B = aVar;
        AbsBreakoutRoomControl.AbstractC61509c cVar = this.f154264D;
        if (cVar != null) {
            cVar.mo213200a(this.f154270e, aVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: b */
    public void mo213170b(AbsBreakoutRoomControl.AbstractC61508b bVar) {
        if (this.f154277l.contains(bVar)) {
            this.f154277l.remove(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: d */
    public void mo213176d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f154261A = str;
        }
    }

    /* renamed from: f */
    private boolean m240093f(String str) {
        if (TextUtils.isEmpty(str) || "1".equals(str)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m240094g(String str) {
        boolean z;
        AbsBreakoutRoomControl.AbstractC61507a aVar = this.f154286u;
        if (aVar != null) {
            if ("1".equals(str) || TextUtils.isEmpty(str)) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo213188a(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: a */
    public void mo213163a(AbsBreakoutRoomControl.AbstractC61508b bVar) {
        if (!this.f154277l.contains(bVar)) {
            this.f154277l.add(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: b */
    public void mo213171b(AbsBreakoutRoomControl.AbstractC61510d dVar) {
        if (this.f154278m.contains(dVar)) {
            this.f154278m.remove(dVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: b */
    public void mo213172b(String str) {
        if (TextUtils.isEmpty(getMeeting().mo212056e().getHostId())) {
            C60700b.m235861e("BreakoutRoom_BreakoutRoomControl", "[askHostForHelp]", "could't find meeting host id for ask help.");
        } else {
            VcBizService.askHostForHelp(this.mMeeting.mo212055d(), str, new AbstractC63598b<VCManageApplyResponse>() {
                /* class com.ss.android.vc.meeting.module.breakoutroom.C61511a.C615154 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("BreakoutRoom_BreakoutRoomControl", "[askHostForHelp3]", "error. msg=" + eVar.mo219902b());
                }

                /* renamed from: a */
                public void onSuccess(VCManageApplyResponse vCManageApplyResponse) {
                    C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[askHostForHelp2]", "success. status=" + vCManageApplyResponse.mresult);
                    if (vCManageApplyResponse.mresult == VCManageApplyResponse.Result.HOST_BUSY) {
                        C60738ac.m236037c((int) R.string.View_G_HostBusy);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: c */
    public void mo213173c(String str) {
        if (mo213180g()) {
            C60738ac.m236039c(UIHelper.getString(R.string.View_G_HostAlreadyInRoom));
            return;
        }
        for (AbsBreakoutRoomControl.AbstractC61508b bVar : this.f154277l) {
            bVar.mo213193a(this.f154267b.getBreakoutRoomId(), str);
        }
        C63752c.m250235a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, str, getMeeting().mo212056e());
    }

    /* renamed from: a */
    private void m240090a(long j) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onPushRoomCountDown]", "status= " + this.f154270e);
        if (!(this.f154267b == null || this.f154270e == VCBreakoutRoomInfo.Status.COUNT_DOWN || this.f154270e == VCBreakoutRoomInfo.Status.IDLE || !this.f154273h)) {
            this.f154270e = VCBreakoutRoomInfo.Status.COUNT_DOWN;
            AbsBreakoutRoomControl.AbstractC61509c cVar = this.f154264D;
            if (cVar != null) {
                cVar.mo213199a();
            }
            long j2 = j / 1000;
            long b = this.f154263C.mo213231b(this.mMeeting.mo212056e().getStartTime());
            long j3 = j2 - b;
            C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onPushRoomCountDown2]", "init countDown Time：" + j3 + " with: startTime=" + (this.mMeeting.mo212056e().getStartTime() / 1000) + " fromStart=" + j2 + " nowTime=" + (System.currentTimeMillis() / 1000) + " duration=" + b);
            this.f154281p.mo5926a(Long.valueOf(j3));
            for (AbsBreakoutRoomControl.AbstractC61508b bVar : this.f154277l) {
                bVar.mo213197e(true);
            }
            if (this.f154283r == null) {
                CountDownTimerC615132 r8 = new CountDownTimer(j3 * 1000, 1000) {
                    /* class com.ss.android.vc.meeting.module.breakoutroom.C61511a.CountDownTimerC615132 */

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m240134a() {
                        for (AbsBreakoutRoomControl.AbstractC61508b bVar : C61511a.this.f154277l) {
                            bVar.mo213190a(C61511a.this.f154281p.mo5927b().longValue());
                        }
                    }

                    public void onFinish() {
                        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onPushRoomCountDown3]", "onTimerFinish");
                        cancel();
                        for (AbsBreakoutRoomControl.AbstractC61508b bVar : C61511a.this.f154277l) {
                            bVar.mo213196c();
                        }
                        for (AbsBreakoutRoomControl.AbstractC61508b bVar2 : C61511a.this.f154277l) {
                            C61511a.this.f154284s = true;
                            C61511a.this.f154266a = AbsBreakoutRoomControl.Status.LEAVING;
                            bVar2.mo213194a(true, true);
                            bVar2.mo213189a();
                        }
                    }

                    public void onTick(long j) {
                        long j2 = j / 1000;
                        if (j2 >= 0) {
                            C61511a.this.f154281p.mo5926a(Long.valueOf(j2));
                        }
                        if (C61511a.this.f154281p != null && !CollectionUtils.isEmpty(C61511a.this.f154277l)) {
                            C60735ab.m236001a(new Runnable() {
                                /* class com.ss.android.vc.meeting.module.breakoutroom.$$Lambda$a$2$8mLXWb2fAl4mYB7TXK7S1ji_HtM */

                                public final void run() {
                                    C61511a.CountDownTimerC615132.this.m240134a();
                                }
                            });
                        }
                    }
                };
                this.f154283r = r8;
                r8.start();
            }
            this.f154280o.set(true);
            this.f154267b.setStatus(VCBreakoutRoomInfo.Status.COUNT_DOWN);
            for (AbsBreakoutRoomControl.AbstractC61508b bVar2 : this.f154277l) {
                bVar2.mo213195b(this.f154271f);
            }
        }
    }

    public C61511a(C61303k kVar) {
        super(kVar);
        C1177w<Long> wVar = new C1177w<>(60L);
        this.f154281p = wVar;
        this.f154282q = wVar;
        this.f154284s = false;
        this.f154285t = false;
        this.f154268c = kVar.mo212056e().getVideoChatSettings();
        this.f154273h = m240096q();
        VideoChatSettings videoChatSettings = this.f154268c;
        if (videoChatSettings != null) {
            this.f154274i = videoChatSettings.isOpenBreakoutRoom();
        }
        this.f154270e = VCBreakoutRoomInfo.Status.IDLE;
        String p = m240095p();
        this.f154288w = p;
        if (p == null) {
            this.f154288w = "";
        }
        if (this.f154274i && !this.f154273h && kVar.mo212059h() == 4) {
            C60738ac.m236037c((int) R.string.View_G_HostOpenedRooms);
            C60735ab.m236002a($$Lambda$a$ApfjRZxAbkrga_4O2FeNiG6ZeN4.INSTANCE, 2000);
        }
        this.mMeeting.mo212046a(new AbstractC61288e() {
            /* class com.ss.android.vc.meeting.module.breakoutroom.$$Lambda$a$vxfB0VIMg_JkB_G8ro6edJ9llt8 */

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e
            public final void meetingStateChanged(VideoChat videoChat, StatusNode statusNode) {
                C61511a.this.m240091a((C61511a) videoChat, (VideoChat) statusNode);
            }
        });
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[init]", "breakoutRoomControl success. remote= " + this.f154274i + " local=" + this.f154273h + " hostRoomId= " + this.f154288w + " deviceId= " + VideoChatModuleDependency.m236629b() + " userId= " + VideoChatModuleDependency.m236630c() + " meetingId= " + this.mMeeting.mo212055d());
    }

    /* renamed from: a */
    private void m240092a(VCBreakoutRoomInfo vCBreakoutRoomInfo) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[dealWithPushedBreakoutRoomInfo]", "info: " + C60761j.m236097a(vCBreakoutRoomInfo));
        VCBreakoutRoomInfo.Status status = vCBreakoutRoomInfo.getStatus();
        if (this.f154270e == VCBreakoutRoomInfo.Status.IDLE && status == VCBreakoutRoomInfo.Status.ON_THE_CALL) {
            if (this.f154263C != null) {
                C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[dealWithPushedBreakoutRoomInfo2]", "startTimer");
                this.f154263C.mo213230a(vCBreakoutRoomInfo.getStartTime());
            }
            mo213207a(vCBreakoutRoomInfo.getBreakoutRoomId(), this.f154275j);
        } else if (this.f154270e == VCBreakoutRoomInfo.Status.COUNT_DOWN && status == VCBreakoutRoomInfo.Status.IDLE) {
            RoomTimerHelper cVar = this.f154263C;
            if (cVar != null) {
                cVar.mo213232b();
            }
            mo213169b();
        }
        this.f154270e = status;
        VCBreakoutRoomInfoSettings settings = vCBreakoutRoomInfo.getSettings();
        if (settings != null) {
            boolean isOnlyPresenterCanAnnote = settings.isOnlyPresenterCanAnnote();
            for (AbsBreakoutRoomControl.AbstractC61508b bVar : this.f154277l) {
                bVar.mo213198f(isOnlyPresenterCanAnnote);
            }
            this.mMeeting.ag().enableOnlyPresenterCanAnnotate(isOnlyPresenterCanAnnote);
        }
    }

    /* renamed from: a */
    public void mo213206a(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        if (j != null) {
            VideoChatSettings videoChatSettings = videoChatInMeetingInfo.getVideoChatSettings();
            this.f154274i = videoChatSettings.isOpenBreakoutRoom();
            List<VCBreakoutRoomInfo> breakoutRoomInfos = videoChatInMeetingInfo.getBreakoutRoomInfos();
            if (TextUtils.isEmpty(j.getBreakoutRoomId())) {
                this.f154273h = false;
            }
            this.f154268c = videoChatSettings;
            if (!m240093f(j.getBreakoutRoomId()) || this.f154271f.equals(j.getBreakoutRoomId())) {
                this.f154275j = false;
            } else {
                this.f154275j = true;
                this.f154272g = this.f154271f;
            }
            if (j.getBreakoutRoomId().equals(this.f154271f) || m240093f(j.getBreakoutRoomId()) || !m240097r()) {
                this.f154276k = false;
            } else {
                C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onInMeetingInfoUpdate]", "set isTransferToMainRoom true");
                this.f154272g = this.f154271f;
                this.f154276k = true;
            }
            C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onInMeetingInfoUpdate2]", "self roomId. before= " + this.f154271f + " after= " + j.getBreakoutRoomId() + " origin=" + this.f154272g + " isTransfer= " + this.f154275j + " isTransferToMain= " + this.f154276k + " deviceId= " + VideoChatModuleDependency.m236629b());
            if (this.f154275j || this.f154276k) {
                if (this.mMeeting.ab().mo213880f() && this.mMeeting.ab().mo213889o()) {
                    this.mMeeting.ab().mo213885k();
                }
                if (this.mMeeting.aj().mo216408a()) {
                    this.mMeeting.aj().mo216414d();
                }
            }
            this.f154271f = j.getBreakoutRoomId();
            this.f154273h = m240097r();
            C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onInMeetingInfoUpdate3]", String.format("remoteOpen = %b, localOpen = %b, mChannelId = %s", Boolean.valueOf(this.f154274i), Boolean.valueOf(this.f154273h), this.f154290y));
            if (this.f154274i && this.f154273h) {
                VCBreakoutRoomInfo a = m240089a(breakoutRoomInfos, this.f154271f);
                this.f154267b = a;
                if (a == null) {
                    C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onInMeetingInfoUpdate4]", "find breakoutRoom failed.");
                    return;
                }
                if (a.getStatus() == VCBreakoutRoomInfo.Status.COUNT_DOWN) {
                    C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onInMeetingInfoUpdate5]", "status = COUNT_DOWN");
                    if (this.f154267b.getCountDownFromStartTime() != -1) {
                        m240090a(this.f154267b.getCountDownFromStartTime());
                    }
                }
                if (this.f154275j) {
                    this.f154270e = VCBreakoutRoomInfo.Status.IDLE;
                }
                m240098s();
                AbsBreakoutRoomControl.AbstractC61509c cVar = this.f154264D;
                if (cVar != null) {
                    cVar.mo213201b();
                }
                m240092a(this.f154267b);
            } else if (!this.f154273h) {
                C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onInMeetingInfoUpdate6]", "transfer to mainRoom: isTransferToMainRoom=" + this.f154276k + " backToMainRoomWhenCountDownFinished=" + this.f154284s);
                m240099t();
                if (this.f154276k) {
                    mo213207a("1", true);
                } else if (this.f154284s) {
                    this.f154284s = false;
                    CountDownTimer countDownTimer = this.f154283r;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                        this.f154283r = null;
                    }
                }
            }
            VCBreakoutRoomInfo vCBreakoutRoomInfo = this.f154267b;
            if (vCBreakoutRoomInfo == null || TextUtils.isEmpty(vCBreakoutRoomInfo.getChannelId()) || !this.f154273h) {
                C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onInMeetingInfoUpdate8]", "leaveBreakDownRoom, mChannelId = " + this.f154290y);
                if (!TextUtils.isEmpty(this.f154290y)) {
                    this.f154290y = null;
                    getMeeting().mo212165y().mo212028k();
                    return;
                }
                return;
            }
            this.f154290y = this.f154267b.getChannelId();
            C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[onInMeetingInfoUpdate7]", "joinBreakDownRoom, mChannelId = " + this.f154290y);
            getMeeting().mo212165y().mo212003a(this.f154290y, false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl
    /* renamed from: a */
    public void mo213165a(AbsBreakoutRoomControl.AbstractC61510d dVar) {
        if (!this.f154278m.contains(dVar)) {
            this.f154278m.add(dVar);
        }
    }

    /* renamed from: a */
    private VCBreakoutRoomInfo m240089a(List<VCBreakoutRoomInfo> list, String str) {
        if (!CollectionUtils.isEmpty(list) && !TextUtils.isEmpty(str)) {
            for (VCBreakoutRoomInfo vCBreakoutRoomInfo : list) {
                if (str.equals(vCBreakoutRoomInfo.getBreakoutRoomId())) {
                    return vCBreakoutRoomInfo;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240091a(VideoChat videoChat, StatusNode statusNode) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomControl", "[meetingStateChanged]", "state = " + statusNode);
        if (!this.f154273h && statusNode == StatusNode.Idle) {
            m240100u();
        }
    }
}
