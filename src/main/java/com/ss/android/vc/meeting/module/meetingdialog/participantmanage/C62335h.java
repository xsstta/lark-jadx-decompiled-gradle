package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantMeetingRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCapabilities;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.entity.response.C60976j;
import com.ss.android.vc.entity.response.ar;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62200b;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62327d;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.h */
public class C62335h implements AbstractC62329f {

    /* renamed from: a */
    protected C61303k f156674a;

    /* renamed from: b */
    protected AbstractC62327d f156675b;

    /* renamed from: c */
    protected AbstractC62328e f156676c;

    /* renamed from: d */
    protected Activity f156677d;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.h$a */
    public class C62340a implements AbstractC62328e {
        @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62328e
        /* renamed from: a */
        public boolean mo215561a() {
            return ParticipantUtil.m248733c(C62335h.this.f156674a);
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62328e
        /* renamed from: b */
        public boolean mo215562b() {
            return ParticipantUtil.m248736d(C62335h.this.f156674a);
        }

        private C62340a() {
            C62335h.this = r1;
        }
    }

    /* renamed from: b */
    private AbstractC62328e m243528b() {
        if (this.f156676c == null) {
            this.f156676c = new C62340a();
        }
        return this.f156676c;
    }

    /* renamed from: c */
    private boolean m243529c() {
        return m243528b().mo215561a();
    }

    /* renamed from: d */
    private boolean m243530d() {
        if (m243528b().mo215561a() || m243528b().mo215562b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC62327d mo215586a() {
        if (this.f156675b == null) {
            this.f156675b = new AbstractC62327d() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62335h.C623361 */

                @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62327d
                /* renamed from: a */
                public /* synthetic */ void mo215553a(String str, String str2, VideoChat videoChat) {
                    AbstractC62327d.CC.$default$a(this, str, str2, videoChat);
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62327d
                /* renamed from: a */
                public /* synthetic */ void mo215554a(String str, String str2, boolean z, VideoChat videoChat) {
                    AbstractC62327d.CC.$default$a(this, str, str2, z, videoChat);
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62327d
                /* renamed from: a */
                public /* synthetic */ void mo215555a(boolean z, String str, String str2, VideoChat videoChat) {
                    AbstractC62327d.CC.$default$a(this, z, str, str2, videoChat);
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62327d
                /* renamed from: b */
                public /* synthetic */ void mo215556b(String str, String str2, VideoChat videoChat) {
                    AbstractC62327d.CC.$default$b(this, str, str2, videoChat);
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62327d
                /* renamed from: b */
                public /* synthetic */ void mo215557b(boolean z, String str, String str2, VideoChat videoChat) {
                    AbstractC62327d.CC.$default$b(this, z, str, str2, videoChat);
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62327d
                /* renamed from: c */
                public /* synthetic */ void mo215558c(String str, String str2, VideoChat videoChat) {
                    AbstractC62327d.CC.$default$c(this, str, str2, videoChat);
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62327d
                /* renamed from: c */
                public /* synthetic */ void mo215559c(boolean z, String str, String str2, VideoChat videoChat) {
                    AbstractC62327d.CC.$default$c(this, z, str, str2, videoChat);
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62327d
                /* renamed from: d */
                public /* synthetic */ void mo215560d(String str, String str2, VideoChat videoChat) {
                    AbstractC62327d.CC.$default$d(this, str, str2, videoChat);
                }
            };
        }
        return this.f156675b;
    }

    /* renamed from: a */
    public C62335h mo215587a(AbstractC62327d dVar) {
        this.f156675b = dVar;
        return this;
    }

    /* renamed from: k */
    static boolean m243531k(Participant participant) {
        return ParticipantUtil.m248732c(participant);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243527a(boolean z) {
        this.f156674a.ai().mo213017b(z, false);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: j */
    public void mo215572j(Participant participant) {
        C62200b.m242860a(this.f156677d, this.f156674a, participant).mo211606a();
    }

    /* renamed from: l */
    private void m243532l(Participant participant) {
        this.f156674a.mo212091I().mo212497d().mo212414a();
        this.f156674a.mo212091I().mo212497d().mo212419b();
        VcBizService.sendManageRequest(this.f156674a.mo212055d(), HostManageRequest.Action.TRANSFER_HOST, participant.getId(), participant.getDeviceId(), participant.getParticipantType(), false, false, false, true, null);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: d */
    public void mo215566d(Participant participant) {
        C60700b.m235851b("ParticipantClickAction", "[onHostOneClicked]", "click participant trans host button");
        mo215586a().mo215556b(participant.getId(), participant.getDeviceId(), this.f156674a.mo212056e());
        m243532l(participant);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: g */
    public void mo215569g(Participant participant) {
        final String j = this.f156674a.mo212091I().mo212490a().mo212478j();
        final String i = this.f156674a.mo212091I().mo212490a().mo212477i();
        mo215586a().mo215558c(i, j, this.f156674a.mo212056e());
        VcBizSender.m249293j(this.f156674a.mo212055d()).mo219893b(new AbstractC63598b<C60976j>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62335h.C623383 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(C60976j jVar) {
                C62335h.this.mo215586a().mo215554a(i, j, true, C62335h.this.f156674a.mo212056e());
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: h */
    public void mo215570h(Participant participant) {
        VcBizService.sendManageRequest(this.f156674a.mo212055d(), HostManageRequest.Action.STOP_CURRENT_SHARING, participant.getId(), participant.getDeviceId(), participant.getParticipantType(), null);
        mo215586a().mo215560d(participant.getId(), participant.getDeviceId(), this.f156674a.mo212056e());
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: a */
    public void mo215563a(Participant participant) {
        C60700b.m235851b("ParticipantClickAction", "[onMuteCameraClicked]", "click participant mute camera button");
        boolean z = !participant.getParticipantSettings().isCameraMuted();
        mo215586a().mo215555a(z, participant.getId(), participant.getDeviceId(), this.f156674a.mo212056e());
        if (m243531k(participant)) {
            this.f156674a.ai().mo213011a(z, false);
            return;
        }
        VcBizService.sendManageRequest(this.f156674a.mo212055d(), HostManageRequest.Action.MUTE_CAMERA, participant.getId(), participant.getDeviceId(), participant.getParticipantType(), z, false, false, true, null);
        if (!z) {
            C60738ac.m236037c((int) R.string.View_G_RequestSent);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: b */
    public void mo215564b(Participant participant) {
        C60700b.m235851b("ParticipantClickAction", "[onMuteMicrophoneClicked]", "click participant mute microphone button");
        boolean z = !participant.getParticipantSettings().isMicrophoneMuted();
        mo215586a().mo215559c(z, participant.getId(), participant.getDeviceId(), this.f156674a.mo212056e());
        if (m243531k(participant)) {
            this.f156674a.ai().mo213010a(new Runnable(z) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$h$lVRS0cCnGjcB5gqe8Y3LcuseT5E */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C62335h.lambda$lVRS0cCnGjcB5gqe8Y3LcuseT5E(C62335h.this, this.f$1);
                }
            });
        } else if (participant.getParticipantSettings().getHandsStatus() == ParticipantSettings.HandsStatus.PUT_UP) {
            this.f156674a.ao().mo218462a(true, participant);
        } else {
            VcBizService.sendManageRequest(this.f156674a.mo212055d(), HostManageRequest.Action.MUTE_MICROPHONE, participant.getId(), participant.getDeviceId(), participant.getParticipantType(), z, false, false, true, null);
            if (!z) {
                C60738ac.m236037c((int) R.string.View_G_RequestSent);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: c */
    public void mo215565c(final Participant participant) {
        C60700b.m235851b("ParticipantClickAction", "[onRemoveOneClicked]", "click participant remove meeting button");
        mo215586a().mo215553a(participant.getId(), participant.getDeviceId(), this.f156674a.mo212056e());
        VcBizService.sendManageRequest(this.f156674a.mo212055d(), HostManageRequest.Action.KICK_OUT_PARTICIPANT, participant.getId(), participant.getDeviceId(), participant.getParticipantType(), false, false, false, (Boolean) true, (String) null, (String) null, (VcBizSender.C63594a) new VcBizSender.C63594a("hostManage") {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62335h.C623372 */

            @Override // com.ss.android.vc.net.request.VcBizSender.C63594a
            /* renamed from: a */
            public void onSuccess(String str) {
                VideoChatUser userInfoInCache;
                super.onSuccess(str);
                Participant participant = participant;
                String str2 = "";
                if (!(participant == null || (userInfoInCache = UserInfoService.getUserInfoInCache(participant.getId(), participant.getParticipantType())) == null)) {
                    if (participant.getParticipantType() == ParticipantType.NEO_USER || participant.getParticipantType().isNewType() || participant.getParticipantType().isUnknownType()) {
                        str2 = participant.getParticipantSettings().getNickname();
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = userInfoInCache.getName();
                    }
                    if (participant.isGuest()) {
                        str2 = str2 + UIHelper.getString(R.string.View_M_GuestParentheses);
                    }
                }
                C60738ac.m236039c(UIHelper.getString(R.string.View_M_YouRemovedPercentEss, str2));
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: f */
    public void mo215568f(Participant participant) {
        HostManageRequest.CoHostAction coHostAction;
        boolean z;
        ParticipantMeetingRole participantMeetingRole = participant.getParticipantMeetingRole();
        if (participantMeetingRole == null || participantMeetingRole != ParticipantMeetingRole.CO_HOST) {
            coHostAction = HostManageRequest.CoHostAction.SET;
        } else {
            coHostAction = HostManageRequest.CoHostAction.UNSET;
        }
        AbstractC62327d a = mo215586a();
        String id = participant.getId();
        String deviceId = participant.getDeviceId();
        if (coHostAction == HostManageRequest.CoHostAction.SET) {
            z = true;
        } else {
            z = false;
        }
        a.mo215554a(id, deviceId, z, this.f156674a.mo212056e());
        VcBizService.sendManageRequest(this.f156674a.mo212055d(), HostManageRequest.Action.SET_CO_HOST, participant.getId(), participant.getDeviceId(), participant.getParticipantType(), coHostAction);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: i */
    public void mo215571i(Participant participant) {
        String str;
        VCBreakoutRoomInfo k;
        FollowInfo l = this.f156674a.mo212091I().mo212490a().mo212480l();
        if (!this.f156674a.al().mo213182i() || (k = this.f156674a.al().mo213184k()) == null) {
            str = null;
        } else {
            str = k.getBreakoutRoomId();
        }
        VideoChatCapabilities capabilities = participant.getCapabilities();
        if (capabilities == null || !capabilities.isFollowPresenter() || !C61806b.m241472a(this.f156674a.ab().mo213882h(), participant)) {
            C60738ac.m236037c((int) R.string.View_VM_UserCannotShare);
        } else {
            VcBizSender.m249186a(this.f156674a.mo212055d(), str, l.getUrl(), participant).mo219893b(new AbstractC63598b<ar>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62335h.C623394 */

                /* renamed from: a */
                public void onSuccess(ar arVar) {
                    C60700b.m235851b("ParticipantClickAction", "[onPassingOnSharing]", "success");
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("ParticipantClickAction", "[onPassingOnSharing2]", "error: " + eVar.mo219902b());
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f
    /* renamed from: e */
    public void mo215567e(Participant participant) {
        C60700b.m235851b("SpeakRequestControl", "[onParticipantCancelSpeakRequest]", "click participant lower hands isMeHost= " + m243529c() + " isMe= " + m243531k(participant) + " settings= " + participant.getParticipantSettings().toString());
        if (this.f156674a.mo212056e().getType() != VideoChat.Type.MEET || participant.getParticipantSettings().getHandsStatus() != ParticipantSettings.HandsStatus.PUT_UP) {
            return;
        }
        if (m243530d() && !m243531k(participant)) {
            this.f156674a.ao().mo218462a(false, participant);
            mo215586a().mo215557b(false, participant.getId(), participant.getDeviceId(), this.f156674a.mo212056e());
        } else if (!m243530d() && m243531k(participant)) {
            this.f156674a.ao().mo218456a(ParticipantSettings.HandsStatus.PUT_DOWN);
            mo215586a().mo215557b(true, participant.getId(), participant.getDeviceId(), this.f156674a.mo212056e());
        }
    }

    /* renamed from: a */
    public static C62335h m243525a(Activity activity, C61303k kVar) {
        return m243526a(activity, kVar, null);
    }

    /* renamed from: a */
    public static C62335h m243526a(Activity activity, C61303k kVar, AbstractC62328e eVar) {
        if (kVar != null) {
            C62335h hVar = new C62335h();
            hVar.f156674a = kVar;
            hVar.f156676c = eVar;
            hVar.f156677d = activity;
            return hVar;
        }
        throw new IllegalArgumentException("args invalid");
    }
}
