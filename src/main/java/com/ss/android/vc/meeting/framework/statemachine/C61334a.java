package com.ss.android.vc.meeting.framework.statemachine;

import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.MeetingDerive;
import com.ss.android.vc.meeting.module.busyring.C61546f;
import com.ss.android.vc.meeting.module.single.SingleMeetingDefaultEventListener;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserRole;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.route.request.JoinSuccessEvent;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event.bl;
import com.ss.android.vc.statistics.monitor.C63780b;
import com.ss.android.vc.statistics.p3182c.C63724a;
import com.ss.android.vc.statistics.p3182c.C63726b;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.a */
public class C61334a extends AbstractC61354o {

    /* renamed from: e */
    private long f153693e;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: k */
    public String mo212308k() {
        return "BdVideoChatActionPerformer";
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

    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o
    /* renamed from: a */
    public MeetingEventListener mo212298a() {
        if (this.f153735d == null) {
            if (mo212368r().mo212070s() == MeetingDerive.ATTACH) {
                this.f153735d = new C61546f();
            } else {
                this.f153735d = new SingleMeetingDefaultEventListener();
            }
        }
        return this.f153735d;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: c */
    public void mo212300c() {
        super.mo212300c();
        if (mo212368r().mo212056e().getType().getNumber() == VideoChat.Type.CALL.getNumber()) {
            C61367r.m239117a(ar.m236694a()).mo212393a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: b */
    public void mo212299b() {
        boolean z;
        super.mo212299b();
        if (mo212368r().mo212088F().getSingleRemoteUser() != null) {
            mo212298a().mo212318e(mo212368r());
            VideoChat e = mo212368r().mo212056e();
            if (e.getType().getNumber() == VideoChat.Type.CALL.getNumber()) {
                C61367r a = C61367r.m239117a(ar.m236694a());
                if (DesktopUtil.m144301a(ar.m236694a())) {
                    z = false;
                } else {
                    z = e.isVoiceCall();
                }
                a.mo212394a(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: e */
    public void mo212302e() {
        super.mo212302e();
        VideoChat e = mo212368r().mo212056e();
        if (e != null) {
            if (e.getType().getNumber() == VideoChat.Type.CALL.getNumber()) {
                C60700b.m235841a(e, "StateEngine", "Rust", "getUserInfoById", "BdVideoChatActionPerformer", "getUserInfoById id = " + e.getHostId());
                UserInfoService.getUserInfoById(mo212368r().mo212055d(), e.getHostId(), e.getHostType(), new GetUserInfoListener(e) {
                    /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$a$62jj_51IYuYL2kxiyYfbYOuMqc */
                    public final /* synthetic */ VideoChat f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C61334a.this.m238933a((C61334a) this.f$1, (VideoChat) videoChatUser);
                    }
                });
            }
            m238932a(VideoChat.UpdateVideoChatAction.RECEIVED_INVITATION, e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: j */
    public void mo212307j() {
        super.mo212307j();
        VideoChat e = mo212368r().mo212056e();
        mo212298a().mo212316d(mo212368r());
        C63780b.m250411b(e);
        C60700b.m235851b("BdVideoChatActionPerformer", "[endOnTheCall]", "FeedbackDialog vcEndTime: " + System.currentTimeMillis());
        if (System.currentTimeMillis() - this.f153693e >= 5000) {
            bl.m250187a(e, mo212368r());
        }
        bl.m250188b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61354o, com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: h */
    public void mo212305h() {
        super.mo212305h();
        VideoChat e = mo212368r().mo212056e();
        if (e == null || e.getInfo() == null) {
            C60700b.m235864f("BdVideoChatActionPerformer", "[enterOnTheCallState]", "videochat | getInfo is null");
            return;
        }
        VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
        if (currentUser == null) {
            C60700b.m235864f("BdVideoChatActionPerformer", "[enterOnTheCallState2]", "currentUser empty");
            return;
        }
        String id = currentUser.getId();
        String name = currentUser.getName();
        if (id == null || id.isEmpty()) {
            C60700b.m235864f("BdVideoChatActionPerformer", "[enterOnTheCallState3]", "currentUserId empty. currentUser = " + currentUser.toString());
        } else if (name == null || name.isEmpty()) {
            C60700b.m235864f("BdVideoChatActionPerformer", "[enterOnTheCallState4]", "currentUserName empty");
        } else {
            bl.m250185a();
            mo212298a().mo212313a(mo212368r());
            C57744a.m224104a().putLong("SP_KEY_LAUNCH_SDK_TIME", System.currentTimeMillis());
            C63780b.m250408a(e);
            C63763l.m250312f(e);
            if (!C63724a.m249907a(e)) {
                C63726b.m249913a("vc_monitor_callee_accept", e);
                C57744a.m224104a().putLong("SP_KEY_ACCEPT_MEET_TIME", System.currentTimeMillis());
            }
            this.f153693e = System.currentTimeMillis();
            C60700b.m235851b("BdVideoChatActionPerformer", "[enterOnTheCallState5]", "FeedbackDialog vcStartTime: " + this.f153693e);
            new JoinSuccessEvent(e.getId()).mo210474a();
        }
    }

    public C61334a(C61303k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    private void m238932a(VideoChat.UpdateVideoChatAction updateVideoChatAction, VideoChat videoChat) {
        if (videoChat == null) {
            C60700b.m235851b("BdVideoChatActionPerformer", "[handleUploadUserAction]", "videoChat is null");
        } else if (videoChat.getId() == null) {
            C60700b.m235851b("BdVideoChatActionPerformer", "[handleUploadUserAction2]", "videoChat.getId() is null");
        } else if (videoChat.getId().isEmpty()) {
            C60700b.m235851b("BdVideoChatActionPerformer", "[handleUploadUserAction3]", "videoChat.getId() is empty");
        } else {
            C60700b.m235851b("BdVideoChatActionPerformer", "[handleUploadUserAction4]", "updateVideoChatAction =" + updateVideoChatAction.getNumber());
            VcBizService.updateVideoChat(mo212368r(), videoChat.getId(), updateVideoChatAction.getNumber(), null, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238933a(VideoChat videoChat, VideoChatUser videoChatUser) {
        if (videoChatUser == null) {
            C60700b.m235841a(videoChat, "Rust", "StateEngine", "getUserInfoByIdError", "BdVideoChatActionPerformer", "[enterRingingState] onGetUserInfo user is null");
        } else if (mo212368r().mo212060i()) {
            C60700b.m235851b("BdVideoChatActionPerformer", "[enterRingingState]", "mMeeting isIdleByTransition, then return");
        } else {
            C60700b.m235841a(videoChat, "Rust", "StateEngine", "getUserInfoByIdSuccess", "BdVideoChatActionPerformer", "[enterRingingState] 1v1 onGetUserInfo done");
            mo212368r().mo212088F().setCurrentUserRole(VideoChatUserRole.SINGLE_CALLEE);
            mo212368r().mo212088F().setSingleCallerUser(videoChatUser);
            mo212298a().mo212320g(mo212368r());
            VcBizSender.m249216a(videoChat, false);
            C63726b.m249913a("vc_monitor_callee_ring", videoChat);
        }
    }
}
