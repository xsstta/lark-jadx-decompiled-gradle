package com.ss.android.vc.meeting.module.lobby;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.request.ManageApprovalRequest;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.lobby.LobbyTipView;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62378o;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.cf;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.lobby.e */
public class C62124e extends AbstractC61424d implements AbstractC62119b {

    /* renamed from: a */
    String f156055a = "";

    /* renamed from: b */
    String f156056b = "";

    /* renamed from: c */
    private LobbyTipView f156057c;

    /* renamed from: d */
    private boolean f156058d;

    @Override // com.ss.android.vc.meeting.module.lobby.AbstractC62119b
    /* renamed from: a */
    public void mo214943a(VCManageResult vCManageResult) {
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbstractC62119b
    /* renamed from: d */
    public void mo214945d() {
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        LobbyTipView lobbyTipView = this.f156057c;
        if (lobbyTipView != null && lobbyTipView.getVisibility() == 0) {
            this.f156057c.mo214914c();
        }
        this.f156057c = null;
        getMeeting().aq().mo214939b(this);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        getMeeting().aq().mo214934a(this);
        if (getMeeting().aq().mo214940b()) {
            C60700b.m235851b("LobbyViewControl", "[init]", "Restore lobby tip view");
            List<VCLobbyParticipant> d = getMeeting().mo212091I().mo212497d().mo212422d();
            if (d == null || d.size() == 0) {
                getMeeting().aq().mo214938a(false);
            } else {
                m242662b(getMeeting().mo212091I().mo212497d().mo212422d());
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.lobby.AbstractC62119b
    /* renamed from: a */
    public void mo214944a(List<VCLobbyParticipant> list) {
        m242662b(list);
    }

    public C62124e(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    /* renamed from: a */
    public void mo214950a(String str) {
        cf.m250279a(this.mPresent.mo212921f(), str, this.f156055a, this.f156056b);
    }

    /* renamed from: b */
    private void m242662b(final List<VCLobbyParticipant> list) {
        if (list == null || list.size() == 0) {
            LobbyTipView lobbyTipView = this.f156057c;
            if (lobbyTipView != null && lobbyTipView.getVisibility() == 0) {
                this.f156057c.mo214914c();
            }
            getMeeting().aq().mo214938a(false);
        } else if (C60773o.m236120a(C60773o.m236124b(this.mPresent.mo212916a()))) {
            LobbyTipView lobbyTipView2 = this.f156057c;
            if (lobbyTipView2 != null && lobbyTipView2.getVisibility() == 0) {
                this.f156057c.mo214913b();
            }
            this.f156057c = new LobbyTipView(this.mPresent.mo212916a());
            if (list.size() == 1) {
                this.f156055a = list.get(0).getUser().getUserId();
                this.f156056b = list.get(0).getUser().getDeviceId();
            } else {
                this.f156055a = "";
                this.f156056b = "";
            }
            this.f156057c.setLobbyTipListener(new LobbyTipView.AbstractC62116a() {
                /* class com.ss.android.vc.meeting.module.lobby.C62124e.C621251 */

                @Override // com.ss.android.vc.meeting.module.lobby.LobbyTipView.AbstractC62116a
                /* renamed from: a */
                public void mo214927a() {
                    C62124e.this.mo214950a("view_lobby");
                    MeetingPopupEvent.m249838a().mo220320a("view_lobby", "none", C62124e.this.getMeeting());
                    C62378o.m243759a(C62124e.this.mPresent.mo212918b(), C62124e.this.mPresent.mo212921f()).mo211606a();
                }

                @Override // com.ss.android.vc.meeting.module.lobby.LobbyTipView.AbstractC62116a
                /* renamed from: c */
                public void mo214929c() {
                    C62124e.this.mo214950a("close");
                    MeetingPopupEvent.m249838a().mo220320a("close", "none", C62124e.this.getMeeting());
                    C62124e.this.getMeeting().aq().mo214938a(false);
                }

                @Override // com.ss.android.vc.meeting.module.lobby.LobbyTipView.AbstractC62116a
                /* renamed from: b */
                public void mo214928b() {
                    C62124e.this.mo214950a("admit");
                    MeetingPopupEvent.m249838a().mo220320a("admit", "none", C62124e.this.getMeeting());
                    if (list.size() != 0) {
                        VcBizService.manageApproval(C62124e.this.getMeeting().mo212055d(), ManageApprovalRequest.ApprovalType.MEETING_LOBBY, ManageApprovalRequest.ApprovalAction.PASS, Collections.singletonList(((VCLobbyParticipant) list.get(0)).getUser()), null);
                    }
                }
            });
            this.f156057c.setByteviewUserClickListener(new C63497j.AbstractC63498a() {
                /* class com.ss.android.vc.meeting.module.lobby.C62124e.C621262 */

                @Override // com.ss.android.vc.meeting.utils.C63497j.AbstractC63498a
                /* renamed from: a */
                public void mo214951a(ByteviewUser byteviewUser) {
                    if (byteviewUser != null && C63497j.m248860d(C62124e.this.getMeeting(), byteviewUser)) {
                        C62124e.this.mo214950a("user_profile");
                        MeetingPopupEvent.m249838a().mo220320a("user_profile", "none", C62124e.this.getMeeting());
                        C63497j.m248853a(C62124e.this.getActivity(), C62124e.this.getMeeting(), byteviewUser);
                    }
                }
            });
            this.f156057c.mo214911a(this.mPresent.mo212921f().mo212055d(), list);
            this.f156057c.mo214910a(this.mPresent.mo212920e(), this.f156058d);
            MeetingPopupEvent.m249838a().mo220323b(getMeeting(), "waiting_room_remind");
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        this.f156058d = z;
        LobbyTipView lobbyTipView = this.f156057c;
        if (lobbyTipView != null) {
            lobbyTipView.mo214912a(z);
        }
    }
}
