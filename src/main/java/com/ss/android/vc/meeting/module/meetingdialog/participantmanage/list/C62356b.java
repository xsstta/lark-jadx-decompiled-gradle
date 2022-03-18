package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.request.ManageApprovalRequest;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62347k;
import com.ss.android.vc.meeting.utils.AbstractC63488d;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.ax;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import java.util.Collections;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.b */
public class C62356b extends C62352a {

    /* renamed from: c */
    private C62347k f156768c;

    /* renamed from: d */
    private ConstraintLayout f156769d;

    /* renamed from: e */
    private LottieAnimationView f156770e;

    /* renamed from: f */
    private LKUIRoundedImageView f156771f;

    /* renamed from: g */
    private ConstraintLayout f156772g;

    /* renamed from: h */
    private TextView f156773h;

    /* renamed from: i */
    private TextView f156774i;

    /* renamed from: j */
    private TextView f156775j;

    /* renamed from: k */
    private ViewGroup f156776k;

    /* renamed from: l */
    private TextView f156777l;

    /* renamed from: m */
    private TextView f156778m;

    /* renamed from: n */
    private TextView f156779n;

    /* renamed from: o */
    private View f156780o;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m243676a(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: b */
    public LottieAnimationView mo215655b() {
        return this.f156770e;
    }

    /* renamed from: a */
    public void mo215653a(C62347k kVar, ParticipantItem participantItem) {
        this.f156768c = kVar;
        VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(participantItem.f156730b.getUser().getUserId(), participantItem.f156730b.getUser().getParticipantType());
        if (userInfoInCache != null) {
            m243683a(participantItem, userInfoInCache);
        } else if (kVar.mo215606a()) {
            UserInfoService.getUserInfoById(this.f156764a.mo212055d(), participantItem.f156730b.getUser().getUserId(), participantItem.f156730b.getUser().getParticipantType(), new GetUserInfoListener(participantItem, kVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$b$oUzoOIkpbOI8lFUS4Mq3C7nj4P8 */
                public final /* synthetic */ ParticipantItem f$1;
                public final /* synthetic */ C62347k f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    C62356b.this.m243682a((C62356b) this.f$1, (ParticipantItem) this.f$2, (C62347k) videoChatUser);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo215654a(String str, VCLobbyParticipant vCLobbyParticipant) {
        if (vCLobbyParticipant.isGuest()) {
            str = str + UIHelper.getString(R.string.View_M_GuestParentheses);
        }
        VCDialogUtils.m236184a((Context) this.f156765b, UIHelper.mustacheFormat((int) R.string.View_M_RemoveParticipantFromLobby, "name", str), 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$b$mRcPuHruQoO2va0DEWqtM3XWORw.INSTANCE, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(vCLobbyParticipant) {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$b$ZeEMu2Fd2zOFhhyPEa8hGYAh3g */
            public final /* synthetic */ VCLobbyParticipant f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62356b.this.m243678a((C62356b) this.f$1, (VCLobbyParticipant) dialogInterface, (DialogInterface) i);
            }
        }, false);
    }

    /* renamed from: c */
    private void m243689c() {
        if (this.f156770e.isAnimating()) {
            this.f156770e.cancelAnimation();
        }
        this.f156770e.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243681a(C62347k kVar) {
        kVar.notifyItemChanged(getAdapterPosition());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m243687b(C62347k kVar) {
        kVar.notifyItemChanged(getAdapterPosition());
    }

    /* renamed from: b */
    private void m243685b(VCLobbyParticipant vCLobbyParticipant) {
        int i;
        View view = this.f156780o;
        if (ParticipantUtil.m248720a(vCLobbyParticipant)) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62352a
    /* renamed from: d */
    public void mo215645d(ParticipantItem participantItem) {
        super.mo215645d(participantItem);
        mo215640a(this.f156777l, this.f156769d);
        mo215640a(this.f156778m, this.f156769d);
    }

    /* renamed from: a */
    private void m243677a(VCLobbyParticipant vCLobbyParticipant) {
        if (vCLobbyParticipant.isInApproval()) {
            this.f156776k.setVisibility(8);
            this.f156779n.setVisibility(0);
            return;
        }
        this.f156776k.setVisibility(0);
        this.f156779n.setVisibility(8);
    }

    /* renamed from: c */
    private void m243690c(VCLobbyParticipant vCLobbyParticipant) {
        this.f156778m.setOnClickListener(new View.OnClickListener(vCLobbyParticipant) {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$b$1rbGsTnpPoWRDwNDxhoeNQ5FA2I */
            public final /* synthetic */ VCLobbyParticipant f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C62356b.this.m243686b((C62356b) this.f$1, (VCLobbyParticipant) view);
            }
        });
        this.f156777l.setOnClickListener(new View.OnClickListener(vCLobbyParticipant) {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$b$rZvYOk5qWKGL1xX97ypmbZdI3KQ */
            public final /* synthetic */ VCLobbyParticipant f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C62356b.this.m243679a((C62356b) this.f$1, (VCLobbyParticipant) view);
            }
        });
    }

    /* renamed from: b */
    private void m243688b(String str, VCLobbyParticipant vCLobbyParticipant) {
        if (vCLobbyParticipant != null && vCLobbyParticipant.getUser() != null) {
            C63742at.m250068a(this.f156764a, str, vCLobbyParticipant.getUser().getUserId(), vCLobbyParticipant.getUser().getDeviceId());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m243686b(VCLobbyParticipant vCLobbyParticipant, View view) {
        C60700b.m235851b("LobbyUserViewHolder", "[bindLobbyBtn]", "user click admit lobby participant: " + vCLobbyParticipant.toString());
        m243688b("admit", vCLobbyParticipant);
        MeetingOnTheCallEvent2.m249823a().mo220306a("admit", "none", this.f156764a);
        VcBizService.manageApproval(this.f156764a.mo212055d(), ManageApprovalRequest.ApprovalType.MEETING_LOBBY, ManageApprovalRequest.ApprovalAction.PASS, Collections.singletonList(vCLobbyParticipant.getUser()), null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243679a(final VCLobbyParticipant vCLobbyParticipant, View view) {
        C60700b.m235851b("LobbyUserViewHolder", "[bindLobbyBtn2]", "user click remove lobby participant: " + vCLobbyParticipant.toString());
        MeetingOnTheCallEvent2.m249823a().mo220306a("remove", "none", this.f156764a);
        ParticipantUtil.m248709a(this.f156764a.mo212055d(), vCLobbyParticipant.getUser().getUserId(), vCLobbyParticipant.getUser().getParticipantType(), new AbstractC63488d() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62356b.C623582 */

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215583a() {
                C60700b.m235864f("LobbyUserViewHolder", "getParticipantNameByUserId", "Can not get user info by lobby participant" + vCLobbyParticipant);
            }

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215584a(String str) {
                C62356b.this.mo215654a(str, vCLobbyParticipant);
            }
        });
    }

    /* renamed from: a */
    private void m243680a(VCLobbyParticipant vCLobbyParticipant, VideoChatUser videoChatUser) {
        String str;
        if (videoChatUser.isRoom()) {
            this.f156773h.setText(videoChatUser.getRoom().primaryNameParticipant);
            return;
        }
        TextView textView = this.f156773h;
        if (TextUtils.isEmpty(vCLobbyParticipant.getNickName())) {
            str = videoChatUser.getName();
        } else {
            str = vCLobbyParticipant.getNickName();
        }
        textView.setText(str);
        if (vCLobbyParticipant.isGuest()) {
            this.f156774i.setText(UIHelper.getString(R.string.View_M_GuestParentheses));
        }
    }

    /* renamed from: a */
    private void m243683a(ParticipantItem participantItem, VideoChatUser videoChatUser) {
        super.mo215644c(participantItem);
        VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
        VCLobbyParticipant vCLobbyParticipant = participantItem.f156730b;
        if (vCLobbyParticipant != null && currentUser != null) {
            m243680a(vCLobbyParticipant, videoChatUser);
            m243689c();
            m243684a(videoChatUser, vCLobbyParticipant);
            m243685b(vCLobbyParticipant);
            m243690c(vCLobbyParticipant);
            m243677a(vCLobbyParticipant);
        }
    }

    /* renamed from: a */
    private void m243684a(VideoChatUser videoChatUser, final VCLobbyParticipant vCLobbyParticipant) {
        this.f156771f.setBackgroundResource(0);
        C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), this.f156771f, 48, 48);
        this.f156771f.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62356b.C623571 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (vCLobbyParticipant.getUser() != null && C63497j.m248860d(C62356b.this.f156764a, vCLobbyParticipant.getUser())) {
                    ax.m250129b(C62356b.this.f156764a.mo212056e(), vCLobbyParticipant.getUser().getUserId(), vCLobbyParticipant.getUser().getDeviceId());
                    C63497j.m248853a(C62356b.this.f156765b, C62356b.this.f156764a, vCLobbyParticipant.getUser());
                }
            }
        });
    }

    /* renamed from: a */
    public static C62356b m243675a(ViewGroup viewGroup, C61303k kVar, Activity activity) {
        return new C62356b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dialog_lobby_participant_list_item, viewGroup, false), kVar, activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243678a(VCLobbyParticipant vCLobbyParticipant, DialogInterface dialogInterface, int i) {
        m243688b("remove", vCLobbyParticipant);
        VcBizService.manageApproval(this.f156764a.mo212055d(), ManageApprovalRequest.ApprovalType.MEETING_LOBBY, ManageApprovalRequest.ApprovalAction.REJECT, Collections.singletonList(vCLobbyParticipant.getUser()), null);
    }

    public C62356b(View view, C61303k kVar, Activity activity) {
        super(view, kVar, activity);
        this.f156769d = (ConstraintLayout) view.findViewById(R.id.lobby_participant_list_item);
        this.f156770e = (LottieAnimationView) view.findViewById(R.id.participant_lottie);
        this.f156771f = (LKUIRoundedImageView) view.findViewById(R.id.participant_thumbnail);
        this.f156772g = (ConstraintLayout) view.findViewById(R.id.participant_name_area);
        this.f156773h = (TextView) view.findViewById(R.id.participant_name);
        this.f156774i = (TextView) view.findViewById(R.id.participant_name_ext);
        this.f156775j = (TextView) view.findViewById(R.id.description);
        this.f156776k = (ViewGroup) view.findViewById(R.id.lobby_participant_control_container);
        this.f156777l = (TextView) view.findViewById(R.id.lobby_participant_remove);
        this.f156778m = (TextView) view.findViewById(R.id.lobby_participant_admit);
        this.f156779n = (TextView) view.findViewById(R.id.lobby_joining_text);
        this.f156780o = view.findViewById(R.id.externalTag);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243682a(ParticipantItem participantItem, C62347k kVar, VideoChatUser videoChatUser) {
        if (videoChatUser != null && videoChatUser.getId().equals(participantItem.f156730b.getUser().getUserId())) {
            m243683a(participantItem, videoChatUser);
            C60735ab.m236011b(new Runnable(kVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$b$sbomOy21nnZYkEYRq7b3FNw6HoU */
                public final /* synthetic */ C62347k f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C62356b.this.m243687b((C62356b) this.f$1);
                }
            });
            C60735ab.m236002a(new Runnable(kVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$b$SxYzj5qlsj4zWSOoJVxvit9rtYo */
                public final /* synthetic */ C62347k f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C62356b.this.m243681a((C62356b) this.f$1);
                }
            }, 20);
        }
    }
}
