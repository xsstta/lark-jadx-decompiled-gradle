package com.ss.android.vc.meeting.module.lobby;

import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.VideoChatManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.lobby.d */
public class C62121d extends AbsLobbyControl {

    /* renamed from: a */
    public ArrayList<AbstractC62119b> f156051a = new ArrayList<>();

    /* renamed from: b */
    private boolean f156052b = false;

    @Override // com.ss.android.vc.meeting.module.lobby.AbsLobbyControl
    /* renamed from: b */
    public boolean mo214940b() {
        return this.f156052b;
    }

    /* renamed from: e */
    private void m242649e() {
        getMeeting().mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_NT));
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbsLobbyControl
    /* renamed from: c */
    public String mo214941c() {
        VCLobbyParticipant vCLobbyParticipant;
        if (mo214933a() == null || (vCLobbyParticipant = mo214933a().f156116b) == null) {
            return "";
        }
        return vCLobbyParticipant.getInteractive_id();
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbsLobbyControl
    /* renamed from: d */
    public boolean mo214942d() {
        boolean z;
        C62149b a = mo214933a();
        if (a != null) {
            z = a.f156115a;
        } else {
            z = true;
        }
        C60700b.m235851b("LobbyControl", "[isInLobby]", "inLobby=" + z);
        return z;
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbsLobbyControl
    /* renamed from: a */
    public void mo214938a(boolean z) {
        this.f156052b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m242647c(AbstractC62119b bVar) {
        this.f156051a.remove(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m242648d(AbstractC62119b bVar) {
        this.f156051a.add(bVar);
    }

    public C62121d(C61303k kVar) {
        super(kVar);
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbsLobbyControl
    /* renamed from: a */
    public void mo214934a(AbstractC62119b bVar) {
        C60735ab.m236001a(new Runnable(bVar) {
            /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$d$v6CnUHSyGmD_q3U0SPqW_O_AKyo */
            public final /* synthetic */ AbstractC62119b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C62121d.this.m242648d(this.f$1);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbsLobbyControl
    /* renamed from: b */
    public void mo214939b(AbstractC62119b bVar) {
        C60735ab.m236001a(new Runnable(bVar) {
            /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$d$OJ08VzeQmCy1HUgP_Bh618hnNc */
            public final /* synthetic */ AbstractC62119b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C62121d.this.m242647c(this.f$1);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbsLobbyControl
    /* renamed from: a */
    public void mo214935a(VCManageResult vCManageResult) {
        m242646b(vCManageResult);
        Iterator<AbstractC62119b> it = this.f156051a.iterator();
        while (it.hasNext()) {
            it.next().mo214943a(vCManageResult);
        }
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbsLobbyControl
    /* renamed from: a */
    public void mo214937a(List<VCLobbyParticipant> list) {
        this.f156052b = !C60742af.m236059a(list);
        Iterator<AbstractC62119b> it = this.f156051a.iterator();
        while (it.hasNext()) {
            it.next().mo214944a(list);
        }
    }

    /* renamed from: a */
    public void mo214946a(JoinMeetingEntity joinMeetingEntity) {
        if (joinMeetingEntity != null) {
            VideoChat videoChat = joinMeetingEntity.f152601b;
            if (videoChat == null) {
                C60700b.m235864f("LobbyControl", "[onPushLobbyResult]", "VideoChat is null");
                return;
            }
            videoChat.setForce(false);
            Participant c = ParticipantUtil.m248731c(videoChat.getParticipants());
            if (c == null || c.getParticipantSettings() == null) {
                C63492g.m248822a(false, (Boolean) true, 1000L);
            } else {
                C63492g.m248822a(false, Boolean.valueOf(c.getParticipantSettings().isPlayMeetingTone()), 1000L);
            }
            VideoChatManager.m249444a().mo220105a(videoChat);
        }
    }

    /* renamed from: b */
    private void m242646b(VCManageResult vCManageResult) {
        if (vCManageResult != null && this.mMeeting != null && this.mMeeting.mo212066o()) {
            C60700b.m235851b("LobbyControl", "[processLobbyResult]", "action=" + vCManageResult.f156105c);
            if (vCManageResult.f156105c == VCManageResult.Action.HOSTREJECT) {
                if (!this.mMeeting.al().mo213182i()) {
                    C60738ac.m236037c((int) R.string.View_M_HostRemovedYou);
                    m242649e();
                }
            } else if (vCManageResult.f156105c == VCManageResult.Action.MEETINGEND) {
                C60738ac.m236037c((int) R.string.View_M_HostEndedMeeting);
                m242649e();
            } else if (vCManageResult.f156105c == VCManageResult.Action.HOSTALLOWED) {
                VcBizSender.m249199a(getMeeting().mo212055d(), getMeeting().mo212092J().mo212505B(), getMeeting().mo212092J().mo212504A(), C60788y.m236247a(ar.m236694a()), C60788y.m236250b(ar.m236694a())).mo219893b(new AbstractC63598b<JoinMeetingEntity>() {
                    /* class com.ss.android.vc.meeting.module.lobby.C62121d.C621221 */

                    /* renamed from: a */
                    public void onSuccess(JoinMeetingEntity joinMeetingEntity) {
                        C60700b.m235851b("LobbyControl", "[joinMeetingById]", "HOSTALLOWED onSuccess");
                        C62121d.this.mo214946a(joinMeetingEntity);
                    }

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235864f("LobbyControl", "[joinMeetingById2]", "HOSTALLOWED onError");
                    }
                });
            } else if (vCManageResult.f156105c == VCManageResult.Action.MEETING_START) {
                VcBizSender.m249199a(getMeeting().mo212055d(), getMeeting().mo212092J().mo212505B(), getMeeting().mo212092J().mo212504A(), C60788y.m236247a(ar.m236694a()), C60788y.m236250b(ar.m236694a())).mo219889a(new AbsJoinLobbyIntercept<JoinMeetingEntity>() {
                    /* class com.ss.android.vc.meeting.module.lobby.C62121d.C621232 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                    }

                    /* renamed from: b */
                    public void onNoLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                        C60700b.m235864f("LobbyControl", "[joinMeetingById2]", "MEETING_START onNoLobbySuccess");
                        C62121d.this.mo214946a(joinMeetingEntity);
                    }

                    /* renamed from: a */
                    public void onLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                        C60700b.m235851b("LobbyControl", "[joinMeetingById]", "MEETING_START onLobbySuccess");
                        C62149b bVar = joinMeetingEntity.f152603d;
                        if (bVar.f156115a) {
                            C62121d.this.mo214936a(bVar);
                            Iterator<AbstractC62119b> it = C62121d.this.f156051a.iterator();
                            while (it.hasNext()) {
                                it.next().mo214945d();
                            }
                        }
                    }
                });
            } else if (vCManageResult.f156105c == VCManageResult.Action.VC_MEETING_NOT_SUPPORT) {
                C60738ac.m236037c((int) R.string.View_M_RemovedFromLobby);
                m242649e();
            }
        }
    }
}
