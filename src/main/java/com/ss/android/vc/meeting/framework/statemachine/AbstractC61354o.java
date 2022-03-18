package com.ss.android.vc.meeting.framework.statemachine;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.StartByteviewHeartbeatEntityRequest;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.feedback.C61676d;
import com.ss.android.vc.meeting.utils.C63532r;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.statistics.C63685a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.vc.meeting.framework.statemachine.o */
public abstract class AbstractC61354o extends AbstractC61342i {

    /* renamed from: d */
    protected MeetingEventListener f153735d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract MeetingEventListener mo212298a();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C61303k mo212368r() {
        return (C61303k) this.f153699a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: d */
    public void mo212301d() {
        mo212298a().mo212319f((C61303k) this.f153699a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: g */
    public void mo212304g() {
        mo212298a().mo212322i((C61303k) this.f153699a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: b */
    public void mo212299b() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "entryCallingState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "enterCallingState");
        super.mo212299b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: c */
    public void mo212300c() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "exitCallingState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "exitCallingState");
        super.mo212300c();
        VcBizSender.m249245b(this.f153699a.mo212056e(), true);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: e */
    public void mo212302e() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "enterRingingState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "enterRingingState");
        super.mo212302e();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: h */
    public void mo212305h() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "enterOnTheCallState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "[enterOnTheCallState]");
        super.mo212305h();
        VcBizSender.m249214a(this.f153699a.mo212056e(), VideoChatManager.m249444a().mo220132j(), StartByteviewHeartbeatEntityRequest.ServiceType.VC);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: i */
    public void mo212306i() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "exitOnTheCallState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "[exitOnTheCallState]");
        super.mo212306i();
        VcBizSender.m249215a(this.f153699a.mo212056e(), StartByteviewHeartbeatEntityRequest.ServiceType.VC);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: l */
    public void mo212309l() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "enterWaitingState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "[enterWaitingState]");
        super.mo212309l();
        VcBizSender.m249214a(this.f153699a.mo212056e(), VideoChatManager.m249444a().mo220132j(), StartByteviewHeartbeatEntityRequest.ServiceType.VCLOBBY);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: o */
    public void mo212326o() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "enterIdleState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "enterIdleState");
        super.mo212326o();
        C63685a.m249656b();
        VcBizService.noticeByteviewEvent(false);
        C63532r.m248971a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: p */
    public void mo212327p() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "enterInitState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "enterInitState");
        super.mo212327p();
        C63685a.m249651a();
        VcBizService.noticeByteviewEvent(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: q */
    public void mo212328q() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "exitInitState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "exitInitState");
        super.mo212328q();
        C61676d.m240734a(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: f */
    public void mo212303f() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "exitRingingState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "exitRingingState");
        super.mo212303f();
        VcBizSender.m249245b(this.f153699a.mo212056e(), false);
        mo212298a().mo212321h((C61303k) this.f153699a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i
    /* renamed from: m */
    public void mo212310m() {
        VideoChat e = this.f153699a.mo212056e();
        C60700b.m235841a(e, "StateEngine", "StateEngine", "exitWaitingState, did = " + VideoChatModuleDependency.m236629b(), mo212308k(), "[exitWaitingState]");
        super.mo212310m();
        VcBizSender.m249215a(this.f153699a.mo212056e(), StartByteviewHeartbeatEntityRequest.ServiceType.VCLOBBY);
        VcBizService.updateVideoChat((C61303k) this.f153699a, this.f153699a.mo212055d(), VideoChat.UpdateVideoChatAction.LEAVE_LOBBY.getNumber(), null, null);
    }

    public AbstractC61354o(C61303k kVar) {
        super(kVar);
    }
}
