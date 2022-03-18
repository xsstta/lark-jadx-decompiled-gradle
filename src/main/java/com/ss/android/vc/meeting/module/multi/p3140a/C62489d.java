package com.ss.android.vc.meeting.module.multi.p3140a;

import android.app.Activity;
import android.view.ViewStub;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.IResumeSubscribeObserver;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.ControlOptionShowHelper;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow;
import com.ss.android.vc.meeting.module.multi.InMeetingFullScreenView;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.multi.a.d */
public class C62489d extends AbstractC61424d implements AbstractC61214a, IResumeSubscribeObserver, AbstractC62485a.AbstractC62486a, GetUserInfoListener {

    /* renamed from: a */
    private InMeetingFullScreenView f157199a;

    /* renamed from: b */
    private final AbstractC62490e.AbstractC62491a f157200b = new C62487b(getMeeting());

    @Override // com.ss.android.vc.meeting.framework.meeting.rtcstream.IResumeSubscribeObserver
    /* renamed from: a */
    public void mo212235a() {
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a.AbstractC62486a
    /* renamed from: a */
    public void mo216040a(String str) {
    }

    /* renamed from: f */
    private void m244262f() {
        this.f157200b.mo216062n();
    }

    /* renamed from: g */
    private void m244263g() {
        this.f157200b.mo216049a(this);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        mo216043d();
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a.AbstractC62486a
    /* renamed from: d */
    public void mo216043d() {
        InMeetingFullScreenView inMeetingFullScreenView = this.f157199a;
        if (inMeetingFullScreenView != null) {
            inMeetingFullScreenView.mo215899c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public Activity getActivity() {
        return this.mPresent.mo212918b();
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a.AbstractC62486a
    /* renamed from: b */
    public boolean mo216042b() {
        InMeetingFullScreenView inMeetingFullScreenView = this.f157199a;
        if (inMeetingFullScreenView == null || !inMeetingFullScreenView.mo215903e()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        super.destroy();
        InMeetingFullScreenView inMeetingFullScreenView = this.f157199a;
        if (inMeetingFullScreenView != null) {
            inMeetingFullScreenView.mo215902d();
        }
        this.f157199a = null;
        getMeeting().az().mo216037b(this);
    }

    /* renamed from: h */
    private InMeetingFullScreenView m244264h() {
        boolean z;
        if (this.f157199a == null) {
            ViewStub viewStub = (ViewStub) getRootView().findViewById(R.id.stub_full_screen);
            if (viewStub != null) {
                z = true;
            } else {
                z = false;
            }
            C60775q.m236137a(z, "stub_full_screen not found!");
            InMeetingFullScreenView inMeetingFullScreenView = (InMeetingFullScreenView) viewStub.inflate();
            this.f157199a = inMeetingFullScreenView;
            inMeetingFullScreenView.setViewModel(this.f157200b);
            this.f157199a.setHostActivity(getActivity());
        }
        return this.f157199a;
    }

    /* renamed from: e */
    private void m244261e() {
        this.f157199a.mo215900c(ControlOptionShowHelper.f156623a.mo215543a(this.f157200b.mo216050b(), this.f157200b.mo216051c(), InMeetingParticipantControlPopWindow.GridType.FULL_SCREEN));
        this.f157199a.mo215897b(ControlOptionShowHelper.f156623a.mo215544b(this.f157200b.mo216050b(), this.f157200b.mo216051c(), InMeetingParticipantControlPopWindow.GridType.FULL_SCREEN));
        this.f157199a.mo215894a(this.f157200b.mo216057i(), this.f157200b.mo216058j());
        this.f157199a.mo215893a(this.f157200b.mo216059k());
        this.f157199a.mo215898b(this.f157200b.mo216055g(), this.f157200b.mo216054f());
        this.f157199a.mo215892a(this.f157200b.mo216060l());
        this.f157199a.mo215901c(this.f157200b.mo216053e(), this.f157200b.mo216056h());
    }

    public C62489d(AbstractC61429i iVar) {
        super(iVar);
        getMeeting().az().mo216032a(this);
    }

    @Override // com.ss.android.vc.net.service.GetUserInfoListener
    public void onGetUserInfo(VideoChatUser videoChatUser) {
        InMeetingFullScreenView inMeetingFullScreenView = this.f157199a;
        if (inMeetingFullScreenView != null) {
            inMeetingFullScreenView.mo215891a(videoChatUser);
            this.f157199a.mo215892a(this.f157200b.mo216060l());
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a.AbstractC62486a
    /* renamed from: a */
    public void mo216039a(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        InMeetingFullScreenView inMeetingFullScreenView = this.f157199a;
        if (inMeetingFullScreenView != null && inMeetingFullScreenView.mo215903e()) {
            if (!this.f157200b.mo216052d()) {
                C60700b.m235851b("FullScreenVideoViewControl", "[onInMeetingInfoUpdate]", "Fullscreen participant left.");
                this.f157199a.mo215896b(this.f157200b.mo216061m());
                return;
            }
            C60700b.m235851b("FullScreenVideoViewControl", "[onInMeetingInfoUpdate2]", "Full screen participant update");
            m244262f();
            m244261e();
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a.AbstractC62486a
    /* renamed from: a */
    public boolean mo216041a(Participant participant) {
        if (!mo216042b() || !ParticipantUtil.m248715a(this.f157200b.mo216051c(), participant)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a.AbstractC62486a
    /* renamed from: a */
    public void mo216038a(Participant participant, AbstractC62492f fVar) {
        this.f157200b.mo216048a(participant);
        m244264h().mo215890a(new AbstractC62492f(fVar) {
            /* class com.ss.android.vc.meeting.module.multi.p3140a.$$Lambda$d$HWgSkNWAobGdDLXsinOkpgr9Ong */
            public final /* synthetic */ AbstractC62492f f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62492f
            public final void onFullScreenShowChanged(boolean z) {
                C62489d.this.m244260a((C62489d) this.f$1, (AbstractC62492f) z);
            }
        });
        m244263g();
        m244262f();
        m244261e();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        super.onOrientation(z, z2);
        if (z) {
            mo216043d();
            this.mPresent.mo212921f().aC().mo213387a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244260a(AbstractC62492f fVar, boolean z) {
        if (!z || C61999a.m242220f()) {
            getMeeting().ai().e_(true ^ C61999a.m242220f());
        } else {
            getMeeting().ai().f_(true);
        }
        getMeeting().ai().g_(!z);
        getMeeting().mo212105W().mo212845x().mo214445c(z);
        if (fVar != null) {
            fVar.onFullScreenShowChanged(z);
        }
        if (z && getActivity() != null) {
            ((MeetingActivity) getActivity()).mo212771a(this);
        } else if (getActivity() != null) {
            ((MeetingActivity) getActivity()).mo212776b(this);
        }
        getMeeting().ar().mo216858b(z);
    }
}
