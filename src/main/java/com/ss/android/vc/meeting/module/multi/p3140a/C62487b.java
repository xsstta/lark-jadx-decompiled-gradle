package com.ss.android.vc.meeting.module.multi.p3140a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.RtcConstants;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.multi.a.b */
public class C62487b implements AbstractC62490e.AbstractC62491a {

    /* renamed from: a */
    private C61303k f157196a;

    /* renamed from: b */
    private Participant f157197b;

    /* renamed from: c */
    private VideoChatUser f157198c;

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: b */
    public C61303k mo216050b() {
        return this.f157196a;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: c */
    public Participant mo216051c() {
        return this.f157197b;
    }

    /* renamed from: a */
    public Context mo216044a() {
        return ar.m236694a();
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: g */
    public boolean mo216055g() {
        return this.f157197b.getParticipantSettings().isMicrophoneMuted();
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: e */
    public boolean mo216053e() {
        if (!ParticipantUtil.m248732c(this.f157197b) || C60788y.m236247a(mo216044a())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: f */
    public boolean mo216054f() {
        if (!ParticipantUtil.m248732c(this.f157197b) || C60788y.m236250b(mo216044a())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: j */
    public boolean mo216058j() {
        Participant participant = this.f157197b;
        if (participant == null || this.f157196a == null || !participant.isCoHost() || this.f157196a.mo212056e().getType() != VideoChat.Type.MEET) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: d */
    public boolean mo216052d() {
        Participant participant;
        if (this.f157197b != null) {
            participant = this.f157196a.mo212091I().mo212494b().mo212589a(this.f157197b.getId(), this.f157197b.getParticipantType(), this.f157197b.getDeviceId());
        } else {
            participant = null;
        }
        if (participant == null) {
            return false;
        }
        this.f157197b = participant;
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: h */
    public boolean mo216056h() {
        Participant participant = this.f157197b;
        if (participant == null) {
            return false;
        }
        if (participant.getParticipantSettings().isCameraMuted() || this.f157197b.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST || this.f157197b.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: n */
    public void mo216062n() {
        VcByteStream e = this.f157196a.mo212102T().mo212228e(this.f157197b.getRtcJoinId());
        if (e != null && !TextUtils.isEmpty(e.f152907a)) {
            this.f157196a.mo212102T().mo212214a(e, StreamSpec.Scene.MEETING_FULL_VIEW, StreamSpec.Resolution.FULL_SCREEN, mo216056h());
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: i */
    public boolean mo216057i() {
        boolean z;
        Participant participant = this.f157197b;
        if (participant == null || this.f157196a == null) {
            return false;
        }
        boolean c = ParticipantUtil.m248732c(participant);
        if (!this.f157197b.is_host() || this.f157196a.mo212056e().getType() != VideoChat.Type.MEET || (c && this.f157196a.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && this.f157196a.mo212089G() == ParticipantRole.INTERVIEWEE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.f157196a.mo212098P()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: k */
    public boolean mo216059k() {
        boolean z;
        boolean z2;
        FollowInfo l;
        InMeetingData.ScreenSharedData f;
        if (this.f157197b == null) {
            return false;
        }
        if (this.f157196a.mo212091I() == null || (f = this.f157196a.mo212091I().mo212490a().mo212474f()) == null || !ParticipantUtil.m248717a(this.f157197b, f.getParticipantId(), f.getParticipantDeviceId(), f.getParticipantType())) {
            z = false;
        } else {
            z = true;
        }
        if (this.f157196a.mo212091I() == null || (l = this.f157196a.mo212091I().mo212490a().mo212480l()) == null || !ParticipantUtil.m248717a(this.f157197b, l.getUserId(), l.getDeviceId(), l.getUserType())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: l */
    public String mo216060l() {
        String m = mo216061m();
        if (ParticipantUtil.m248732c(this.f157197b)) {
            return m + mo216044a().getString(R.string.View_M_MeParentheses);
        } else if (!this.f157197b.isGuest()) {
            return m;
        } else {
            return m + mo216044a().getString(R.string.View_M_GuestParentheses);
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: m */
    public String mo216061m() {
        if (MeetingUtil.m238366a(this.f157196a, this.f157197b)) {
            return mo216044a().getString(R.string.View_M_Interviewer);
        }
        VideoChatUser videoChatUser = this.f157198c;
        if (videoChatUser != null) {
            if (videoChatUser.isRoom()) {
                return this.f157198c.getRoom().fullNameParticipant;
            }
            if (this.f157198c.getType() == ParticipantType.LARK_USER) {
                return this.f157198c.getName();
            }
            if (this.f157198c.getType() == ParticipantType.NEO_USER || this.f157198c.getType().isNewType() || this.f157198c.getType().isUnknownType()) {
                if (this.f157197b.getParticipantSettings() != null && !TextUtils.isEmpty(this.f157197b.getParticipantSettings().getNickname())) {
                    return this.f157197b.getParticipantSettings().getNickname();
                }
                if (TextUtils.isEmpty(this.f157198c.getNickname())) {
                    return this.f157198c.getName();
                }
                return this.f157198c.getNickname();
            }
        }
        return "";
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: a */
    public void mo216048a(Participant participant) {
        this.f157197b = participant;
    }

    public C62487b(C61303k kVar) {
        this.f157196a = kVar;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: a */
    public View mo216045a(boolean z) {
        return this.f157196a.mo212165y().mo211988a(z);
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: a */
    public void mo216046a(View view) {
        this.f157196a.mo212165y().mo211992a(view);
        if (!ParticipantUtil.m248732c(this.f157197b)) {
            this.f157196a.mo212165y().mo212000a(this.f157197b.getRtcJoinId(), RtcConstants.RemoteUserPriority.LOW);
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: a */
    public void mo216049a(GetUserInfoListener getUserInfoListener) {
        UserInfoService.getUserInfoById(this.f157196a.mo212055d(), this.f157197b.getId(), this.f157197b.getParticipantType(), new GetUserInfoListener(getUserInfoListener) {
            /* class com.ss.android.vc.meeting.module.multi.p3140a.$$Lambda$b$FPCHt5JPrj2NT2w5XE8heU3Ck */
            public final /* synthetic */ GetUserInfoListener f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                C62487b.m271340lambda$FPCHt5JPrj2NT2w5XE8heU3Ck(C62487b.this, this.f$1, videoChatUser);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244234a(GetUserInfoListener getUserInfoListener, VideoChatUser videoChatUser) {
        this.f157198c = videoChatUser;
        if (getUserInfoListener != null) {
            getUserInfoListener.onGetUserInfo(videoChatUser);
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62490e.AbstractC62491a
    /* renamed from: a */
    public void mo216047a(View view, AbstractC61030i iVar) {
        if (ParticipantUtil.m248732c(this.f157197b)) {
            this.f157196a.mo212102T().mo212208a(view, ParticipantUtil.m248728b(mo216050b()));
        } else {
            this.f157196a.mo212102T().mo212218b(view, mo216051c().getRtcJoinId());
            this.f157196a.mo212165y().mo212000a(this.f157197b.getRtcJoinId(), RtcConstants.RemoteUserPriority.HIGH);
        }
        this.f157196a.mo212165y().mo211993a(view, iVar);
    }
}
