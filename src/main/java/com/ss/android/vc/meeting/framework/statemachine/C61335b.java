package com.ss.android.vc.meeting.framework.statemachine;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.MeetingDerive;
import com.ss.android.vc.meeting.module.busyring.C61545e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserRole;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.p3094g.C61001b;
import com.ss.android.vc.route.request.JoinSuccessEvent;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63768q;
import com.ss.android.vc.statistics.event.as;
import com.ss.android.vc.statistics.monitor.C63780b;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.C63784a;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.b */
public class C61335b extends AbstractC61354o {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: k */
    public String mo212308k() {
        return "BdVideoMeetingActionPerformer";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: c */
    public void mo212300c() {
        super.mo212300c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: d */
    public void mo212301d() {
        super.mo212301d();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: f */
    public void mo212303f() {
        super.mo212303f();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: g */
    public void mo212304g() {
        super.mo212304g();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: i */
    public void mo212306i() {
        super.mo212306i();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: l */
    public void mo212309l() {
        super.mo212309l();
        mo212298a().mo212323j(mo212368r());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: m */
    public void mo212310m() {
        super.mo212310m();
        mo212298a().mo212324k(mo212368r());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: n */
    public void mo212311n() {
        super.mo212311n();
        mo212298a().mo212325l(mo212368r());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: b */
    public void mo212299b() {
        super.mo212299b();
        mo212368r().mo212088F().setCurrentUserRole(VideoChatUserRole.GROUP_HOST);
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o
    /* renamed from: a */
    public MeetingEventListener mo212298a() {
        if (this.f153735d == null) {
            if (mo212368r().mo212070s() == MeetingDerive.ATTACH) {
                this.f153735d = new C61545e();
            } else {
                this.f153735d = new MultiMeetingDefaultEventListener();
            }
        }
        return this.f153735d;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: j */
    public void mo212307j() {
        super.mo212307j();
        new C61001b(ar.m236694a()).mo210460a("");
        mo212298a().mo212316d(mo212368r());
        as.m250051a();
        C63768q.m250334a();
        C63780b.m250411b(mo212368r().mo212056e());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: e */
    public void mo212302e() {
        super.mo212302e();
        VideoChat e = mo212368r().mo212056e();
        if (e != null) {
            C60700b.m235841a(e, "StateEngine", "Rust", "getUserInfoById", "BdVideoMeetingActionPerformer", "getUserInfoById id = " + e.getInviteId());
            UserInfoService.getUserInfoById(mo212368r().mo212055d(), e.getInviteId(), e.getInviterType(), new GetUserInfoListener(e) {
                /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$b$gVIhtN3kNkKKraJvl50anp9fbU4 */
                public final /* synthetic */ VideoChat f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    C61335b.this.m238945a(this.f$1, videoChatUser);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: h */
    public void mo212305h() {
        String str;
        String str2;
        super.mo212305h();
        C63784a.m250430c("[VideoChat_BdVideoMeetingActionPerformer_enterOnTheCallState]");
        VideoChat e = mo212368r().mo212056e();
        if (e == null || e.getInfo() == null) {
            C60700b.m235864f("BdVideoMeetingActionPerformer", "[enterOnTheCallState]", "videoChat | getInfo is null");
            C63693e.m249689e();
            return;
        }
        String str3 = "";
        if (VideoChatUserService.getCurrentUser() != null) {
            str2 = VideoChatUserService.getCurrentUser().getId();
            str = VideoChatUserService.getCurrentUser().getName();
        } else {
            str2 = str3;
            str = str2;
        }
        if (VideoChatUserService.getCurrentUser() == null) {
            C60700b.m235864f("BdVideoMeetingActionPerformer", "[enterOnTheCallState2]", "currentUser is null.");
            C63693e.m249689e();
        } else if (str2 == null || str2.isEmpty()) {
            C60700b.m235864f("BdVideoMeetingActionPerformer", "[enterOnTheCallState3]", "currentUserId empty. currentUser = " + VideoChatUserService.getCurrentUser().toString());
            C63693e.m249689e();
        } else if (str == null || str.isEmpty()) {
            C60700b.m235864f("BdVideoMeetingActionPerformer", "[enterOnTheCallState4]", "currentUserName empty");
            C63693e.m249689e();
        } else {
            mo212298a().mo212313a(mo212368r());
            as.m250052a(e.getHostDeviceId());
            C63780b.m250408a(e);
            if (!(e.getVideoChatSettings() == null || e.getVideoChatSettings().getSubType() == VideoChatSettings.SubType.SCREEN_SHARE)) {
                C63742at.m250104k(e);
            }
            C61001b bVar = new C61001b(ar.m236694a());
            String id = e.getId();
            if (id != null) {
                str3 = id;
            }
            bVar.mo210460a(str3);
            C63784a.m250431d("[VideoChat_BdVideoMeetingActionPerformer_enterOnTheCallState]");
            new JoinSuccessEvent(id).mo210474a();
        }
    }

    public C61335b(C61303k kVar) {
        super(kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238945a(VideoChat videoChat, VideoChatUser videoChatUser) {
        if (videoChatUser == null) {
            C60700b.m235841a(videoChat, "Rust", "StateEngine", "getUserInfoByIdError", "BdVideoMeetingActionPerformer", "[enterRingingState] onGetUserInfo user is null");
        } else if (mo212368r().mo212060i()) {
            C60700b.m235851b("BdVideoMeetingActionPerformer", "[enterRingingState]", "getMeeting() isIdleByTransition, then return");
        } else {
            C60700b.m235841a(videoChat, "Rust", "StateEngine", "getUserInfoByIdSuccess", "BdVideoMeetingActionPerformer", "[enterRingingState] meeting onGetUserInfo done");
            mo212368r().mo212088F().setCurrentUserRole(VideoChatUserRole.GROUP_PARTICIPANT);
            mo212368r().mo212088F().setMultiCaller(videoChatUser);
            mo212298a().mo212320g(mo212368r());
            VcBizSender.m249216a(videoChat, false);
        }
    }
}
