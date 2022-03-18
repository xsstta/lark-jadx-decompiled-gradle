package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.CheckVcManageCapabilitiesEntity;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62342j;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import com.ss.android.vc.meeting.utils.AbstractC63488d;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.j */
public class View$OnClickListenerC62342j implements View.OnClickListener {

    /* renamed from: a */
    ControlMenuItemLayout f156690a;

    /* renamed from: b */
    ControlMenuItemLayout f156691b;

    /* renamed from: c */
    ControlMenuItemLayout f156692c;

    /* renamed from: d */
    ControlMenuItemLayout f156693d;

    /* renamed from: e */
    ControlMenuItemLayout f156694e;

    /* renamed from: f */
    ControlMenuItemLayout f156695f;

    /* renamed from: g */
    ControlMenuItemLayout f156696g;

    /* renamed from: h */
    ControlMenuItemLayout f156697h;

    /* renamed from: i */
    ControlMenuItemLayout f156698i;

    /* renamed from: j */
    TextView f156699j;

    /* renamed from: k */
    ControlMenuItemLayout f156700k;

    /* renamed from: l */
    protected final FragmentActivity f156701l;

    /* renamed from: m */
    protected final C61303k f156702m;

    /* renamed from: n */
    protected Participant f156703n;

    /* renamed from: o */
    public AbstractC62329f f156704o;

    /* renamed from: p */
    private final AbstractC61222a f156705p;

    /* renamed from: b */
    public void mo215595b() {
    }

    /* renamed from: h */
    private void m243577h() {
        this.f156696g.setVisibility(8);
    }

    /* renamed from: c */
    private void m243572c() {
        this.f156690a.setOnClickListener(this);
        this.f156691b.setOnClickListener(this);
        this.f156692c.setOnClickListener(this);
        this.f156693d.setOnClickListener(this);
        this.f156694e.setClickListener(this);
        this.f156695f.setOnClickListener(this);
        this.f156696g.setOnClickListener(this);
        this.f156697h.setOnClickListener(this);
        this.f156698i.setClickListener(this);
        this.f156700k.setOnClickListener(this);
    }

    /* renamed from: j */
    private void m243579j() {
        this.f156702m.mo212091I().mo212494b().mo212605j();
        if (!this.f156702m.ab().mo213889o() || ParticipantUtil.m248732c(this.f156703n) || this.f156703n.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156698i.setVisibility(8);
        } else {
            this.f156698i.setVisibility(0);
        }
    }

    /* renamed from: n */
    private void m243583n() {
        if (this.f156703n == null) {
            return;
        }
        if (!C63634c.m249496b("byteview.meeting.dialpad") || !(this.f156703n.getParticipantType() == ParticipantType.SIP_USER || this.f156703n.getParticipantType() == ParticipantType.PSTN_USER || this.f156703n.getParticipantType() == ParticipantType.RESERVED_USER_5)) {
            this.f156700k.setVisibility(8);
        } else {
            this.f156700k.setVisibility(0);
        }
    }

    /* renamed from: a */
    public View mo215591a() {
        View inflate = LayoutInflater.from(this.f156701l).inflate(R.layout.dialog_participant_control, (ViewGroup) null);
        m243569a(inflate);
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        return inflate;
    }

    /* renamed from: d */
    private void m243573d() {
        if (ParticipantUtil.m248732c(this.f156703n) || this.f156702m.mo212057f() == VideoChat.Type.CALL || this.f156703n.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156693d.setVisibility(8);
            return;
        }
        Participant j = this.f156702m.mo212091I().mo212494b().mo212605j();
        if (!(this.f156702m.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && this.f156703n.getParticipantRole() == ParticipantRole.INTERVIEWEE) && !GuestJoinMeetingUtil.m245480b() && j.is_host() && this.f156703n.getCapabilities() != null && this.f156703n.getCapabilities().isCanBeHost()) {
            this.f156693d.setVisibility(0);
        } else {
            this.f156693d.setVisibility(8);
        }
    }

    /* renamed from: g */
    private void m243576g() {
        if (ParticipantUtil.m248732c(this.f156703n) || this.f156702m.mo212057f() == VideoChat.Type.CALL) {
            this.f156692c.setVisibility(8);
            return;
        }
        Participant j = this.f156702m.mo212091I().mo212494b().mo212605j();
        if (j.is_host() && this.f156703n.getStatus() == Participant.Status.ON_THE_CALL) {
            this.f156692c.setVisibility(0);
        } else if (!j.isCoHost()) {
            this.f156692c.setVisibility(8);
        } else if (!this.f156703n.isParticipant() || this.f156703n.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156692c.setVisibility(8);
        } else {
            this.f156692c.setVisibility(0);
        }
    }

    /* renamed from: k */
    private void m243580k() {
        VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(this.f156703n.getId(), this.f156703n.getParticipantType());
        if (userInfoInCache != null) {
            String name = userInfoInCache.getName();
            if (ParticipantUtil.m248732c(this.f156703n)) {
                name = name + UIHelper.getString(R.string.View_M_MeParentheses);
            } else if (this.f156703n.getStatus() == Participant.Status.RINGING) {
                name = name + C60773o.m236119a((int) R.string.View_M_CallingParentheses);
            }
            this.f156699j.setText(name);
        }
    }

    /* renamed from: e */
    private void m243574e() {
        if (ParticipantUtil.m248732c(this.f156703n) || this.f156702m.mo212057f() == VideoChat.Type.CALL || this.f156703n.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156695f.setVisibility(8);
        } else if (!this.f156702m.mo212091I().mo212494b().mo212605j().is_host()) {
            this.f156695f.setVisibility(8);
        } else if (this.f156703n.getCapabilities() == null || !this.f156703n.getCapabilities().isCanBeCoHost() || (this.f156702m.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && this.f156703n.getParticipantRole() == ParticipantRole.INTERVIEWEE)) {
            this.f156695f.setVisibility(8);
        } else {
            this.f156695f.setVisibility(0);
            if (this.f156703n.isCoHost()) {
                this.f156695f.setTitleText(R.string.View_M_WithdrawCoHostPermission);
                this.f156695f.setIconResource(R.drawable.ud_icon_withdrawcohost_outlined);
                return;
            }
            this.f156695f.setTitleText(R.string.View_M_MakeCoHost);
            this.f156695f.setIconResource(R.drawable.ud_icon_member_outlined);
        }
    }

    /* renamed from: f */
    private void m243575f() {
        int i = 8;
        if (this.f156702m.mo212057f() == VideoChat.Type.CALL) {
            this.f156694e.setVisibility(8);
        } else if (ParticipantUtil.m248732c(this.f156703n)) {
            this.f156694e.setTitleText(R.string.View_M_LowerHand);
            ControlMenuItemLayout controlMenuItemLayout = this.f156694e;
            if (this.f156703n.getParticipantSettings() != null && this.f156703n.getParticipantSettings().getHandsStatus() == ParticipantSettings.HandsStatus.PUT_UP && !this.f156703n.isHostOrCoHost()) {
                i = 0;
            }
            controlMenuItemLayout.setVisibility(i);
        } else if (!this.f156702m.mo212091I().mo212494b().mo212605j().isHostOrCoHost() || this.f156703n.getParticipantSettings() == null || this.f156703n.getParticipantSettings().getHandsStatus() != ParticipantSettings.HandsStatus.PUT_UP) {
            this.f156694e.setVisibility(8);
        } else {
            this.f156694e.setTitleText(R.string.View_M_DeclineRequest);
            this.f156694e.setVisibility(0);
        }
    }

    /* renamed from: i */
    private void m243578i() {
        boolean z;
        if (!this.f156702m.mo212091I().mo212494b().mo212605j().isHostOrCoHost() || ParticipantUtil.m248732c(this.f156703n)) {
            this.f156697h.setVisibility(8);
            return;
        }
        boolean a = ParticipantUtil.m248717a(this.f156703n, this.f156702m.mo212092J().mo212558n(), this.f156702m.mo212092J().mo212556m(), this.f156702m.mo212092J().mo212560o());
        if (this.f156702m.ab().mo213882h() == null || !ParticipantUtil.m248717a(this.f156703n, this.f156702m.ab().mo213882h().getUserId(), this.f156702m.ab().mo213882h().getDeviceId(), this.f156702m.ab().mo213882h().getUserType())) {
            z = false;
        } else {
            z = true;
        }
        if (a || z) {
            this.f156697h.setVisibility(0);
        } else {
            this.f156697h.setVisibility(8);
        }
    }

    /* renamed from: l */
    private void m243581l() {
        if (!ParticipantUtil.m248732c(this.f156703n)) {
            Participant j = this.f156702m.mo212091I().mo212494b().mo212605j();
            if (this.f156703n.getParticipantSettings() == null) {
                C60700b.m235861e("ParticipantControlViewHolder", "[initMuteMicView]", "ParticipantSetting is null");
                this.f156691b.setVisibility(8);
            } else if (j.isParticipant() || this.f156703n.getStatus() != Participant.Status.ON_THE_CALL || this.f156702m.mo212057f() == VideoChat.Type.CALL) {
                this.f156691b.setVisibility(8);
            } else {
                this.f156691b.setVisibility(0);
                if (this.f156703n.getParticipantSettings().isMicrophoneMuted()) {
                    if (this.f156703n.getParticipantSettings().getHandsStatus() == ParticipantSettings.HandsStatus.PUT_UP) {
                        this.f156691b.setTitleText(R.string.View_VM_TurnOnMic);
                        this.f156691b.setIconResource(R.drawable.ud_icon_mic_outlined);
                        return;
                    }
                    this.f156691b.setTitleText(R.string.View_M_HostMicRequest);
                    this.f156691b.setIconResource(R.drawable.ud_icon_mic_outlined);
                } else if (this.f156703n.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE || this.f156703n.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST) {
                    this.f156691b.setTitleText(R.string.View_M_HostMicRequest);
                    this.f156691b.setIconResource(R.drawable.ud_icon_mic_outlined);
                } else {
                    this.f156691b.setTitleText(R.string.View_VM_Mute);
                    this.f156691b.setIconResource(R.drawable.ud_icon_mic_off_outlined);
                }
            }
        } else if (C60788y.m236250b(this.f156701l)) {
            if (this.f156703n.getParticipantSettings().isMicrophoneMuted()) {
                this.f156691b.setTitleText(R.string.View_M_Unmute);
                this.f156691b.setIconResource(R.drawable.ud_icon_mic_outlined);
                return;
            }
            this.f156691b.setTitleText(R.string.View_VM_Mute);
            this.f156691b.setIconResource(R.drawable.ud_icon_mic_off_outlined);
        } else if (this.f156703n.getParticipantSettings() == null || !(this.f156703n.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE || this.f156703n.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST)) {
            this.f156691b.mo215529d();
        } else {
            this.f156691b.mo215528c();
        }
    }

    /* renamed from: m */
    private void m243582m() {
        if (!ParticipantUtil.m248732c(this.f156703n)) {
            Participant j = this.f156702m.mo212091I().mo212494b().mo212605j();
            if (this.f156703n.getParticipantSettings() == null) {
                C60700b.m235861e("ParticipantControlViewHolder", "[initMuteCameraView]", "ParticipantSetting is null");
                this.f156690a.setVisibility(8);
            } else if (this.f156703n.getParticipantType() == ParticipantType.PSTN_USER) {
                this.f156690a.setVisibility(8);
            } else if (j.isParticipant() || this.f156703n.getStatus() != Participant.Status.ON_THE_CALL || this.f156702m.mo212057f() == VideoChat.Type.CALL) {
                this.f156690a.setVisibility(8);
            } else {
                this.f156690a.setVisibility(0);
                if (this.f156703n.getParticipantSettings().isCameraMuted() || this.f156703n.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE || this.f156703n.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST) {
                    this.f156690a.setTitleText(R.string.View_M_HostCameraRequest);
                    this.f156690a.setIconResource(R.drawable.ud_icon_video_outlined);
                    return;
                }
                this.f156690a.setTitleText(R.string.View_VM_StopVideo);
                this.f156690a.setIconResource(R.drawable.ud_icon_video_off_outlined);
            }
        } else if (C60788y.m236247a(this.f156701l)) {
            if (this.f156703n.getParticipantSettings().isCameraMuted()) {
                this.f156690a.setTitleText(R.string.View_VM_StartVideo);
                this.f156690a.setIconResource(R.drawable.ud_icon_video_outlined);
                return;
            }
            this.f156690a.setTitleText(R.string.View_VM_StopVideo);
            this.f156690a.setIconResource(R.drawable.ud_icon_video_off_outlined);
        } else if (this.f156703n.getParticipantSettings() == null || !(this.f156703n.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE || this.f156703n.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST)) {
            this.f156690a.mo215527b();
        } else {
            this.f156690a.mo215526a();
        }
    }

    /* renamed from: a */
    private void m243570a(final Participant participant) {
        VcBizService.checkVCManageCapabilities(this.f156702m.mo212055d(), new ByteviewUser(participant.getId(), participant.getDeviceId(), participant.getParticipantType()), new AbstractC63598b<CheckVcManageCapabilitiesEntity>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62342j.C623431 */

            /* renamed from: a */
            public void onSuccess(CheckVcManageCapabilitiesEntity checkVcManageCapabilitiesEntity) {
                if (checkVcManageCapabilitiesEntity.mCheckResult == CheckVcManageCapabilitiesEntity.CheckResult.SUCCESS) {
                    View$OnClickListenerC62342j.this.f156704o.mo215566d(participant);
                } else if (checkVcManageCapabilitiesEntity.mCheckResult == CheckVcManageCapabilitiesEntity.CheckResult.NEED_NOTICE) {
                    View$OnClickListenerC62342j.this.mo215593a(participant, checkVcManageCapabilitiesEntity.mI18nKeys);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("ParticipantControlViewHolder", "[hostTransfer]", "cancel transfer host cause checkVCManageCapabilities failed: " + eVar);
            }
        });
    }

    /* renamed from: b */
    private void m243571b(final Participant participant) {
        ParticipantUtil.m248709a(this.f156702m.mo212055d(), participant.getId(), participant.getParticipantType(), new AbstractC63488d() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62342j.C623464 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m243595a(DialogInterface dialogInterface, int i) {
            }

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215583a() {
                C60700b.m235864f("ParticipantControlViewHolder", "[removeParticipant]", "Can not get user info by lobby participant" + participant);
            }

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215584a(String str) {
                if (participant.isGuest()) {
                    str = str + UIHelper.getString(R.string.View_M_GuestParentheses);
                }
                VCDialogUtils.m236184a((Context) ((Activity) View$OnClickListenerC62342j.this.f156692c.getContext()), UIHelper.mustacheFormat((int) R.string.View_M_RemoveParticipant, "name", str), 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$j$4$os9bCxBtlePQm0vmFyfk1gokQxg.INSTANCE, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(participant) {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$j$4$QWYRgGBIcVSJWzFbKcM8jMX1s */
                    public final /* synthetic */ Participant f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        View$OnClickListenerC62342j.C623464.this.m243596a(this.f$1, dialogInterface, i);
                    }
                }, false);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m243596a(Participant participant, DialogInterface dialogInterface, int i) {
                View$OnClickListenerC62342j.this.f156704o.mo215565c(participant);
            }
        });
    }

    /* renamed from: a */
    private void m243569a(View view) {
        this.f156690a = (ControlMenuItemLayout) view.findViewById(R.id.participant_mute_camera);
        this.f156691b = (ControlMenuItemLayout) view.findViewById(R.id.participant_mute_microphone);
        this.f156692c = (ControlMenuItemLayout) view.findViewById(R.id.participant_remove_one);
        this.f156693d = (ControlMenuItemLayout) view.findViewById(R.id.participant_host_one);
        this.f156694e = (ControlMenuItemLayout) view.findViewById(R.id.participant_handle_speak_request);
        this.f156695f = (ControlMenuItemLayout) view.findViewById(R.id.participant_co_host_one);
        this.f156696g = (ControlMenuItemLayout) view.findViewById(R.id.participant_reclaim_host);
        this.f156697h = (ControlMenuItemLayout) view.findViewById(R.id.participant_stop_share);
        this.f156698i = (ControlMenuItemLayout) view.findViewById(R.id.participant_pass_on_sharing);
        this.f156699j = (TextView) view.findViewById(R.id.participant_name_text);
        this.f156700k = (ControlMenuItemLayout) view.findViewById(R.id.participant_show_dial);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.participant_mute_camera) {
            this.f156704o.mo215563a(this.f156703n);
        } else if (view.getId() == R.id.participant_mute_microphone) {
            this.f156704o.mo215564b(this.f156703n);
        } else if (view.getId() == R.id.participant_remove_one) {
            m243571b(this.f156703n);
        } else if (view.getId() == R.id.participant_host_one) {
            m243570a(this.f156703n);
        } else if (view.getId() == R.id.participant_handle_speak_request) {
            this.f156704o.mo215567e(this.f156703n);
        } else if (view.getId() == R.id.participant_co_host_one) {
            this.f156704o.mo215568f(this.f156703n);
        } else if (view.getId() == R.id.participant_reclaim_host) {
            this.f156704o.mo215569g(this.f156703n);
        } else if (view.getId() == R.id.participant_stop_share) {
            this.f156704o.mo215570h(this.f156703n);
        } else if (view.getId() == R.id.participant_pass_on_sharing) {
            this.f156704o.mo215571i(this.f156703n);
        } else if (view.getId() == R.id.participant_show_dial) {
            this.f156704o.mo215572j(this.f156703n);
        }
        this.f156705p.dismiss();
    }

    /* renamed from: a */
    public void mo215592a(Participant participant, AbstractC62329f fVar) {
        this.f156703n = participant;
        this.f156704o = fVar;
        m243580k();
        m243581l();
        m243582m();
        m243578i();
        m243579j();
        m243577h();
        m243576g();
        m243575f();
        m243573d();
        m243574e();
        m243572c();
        m243583n();
    }

    /* renamed from: a */
    public void mo215593a(final Participant participant, final List<String> list) {
        ParticipantUtil.m248709a(this.f156702m.mo212055d(), participant.getId(), participant.getParticipantType(), new AbstractC63488d() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62342j.C623442 */

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215583a() {
                C60700b.m235864f("ParticipantControlViewHolder", "[noticeParticipantLackingOfAbility]", "Can not get user info by participant" + participant);
            }

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215584a(String str) {
                View$OnClickListenerC62342j.this.mo215594a(str, list);
            }
        });
    }

    /* renamed from: a */
    public void mo215594a(String str, List<String> list) {
        final String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_M_MakeHostQuestion, "name", str);
        final String string = UIHelper.getString(R.string.View_M_MeetingManagementFeaturesNotSupported);
        final Activity activity = (Activity) this.f156693d.getContext();
        VcBizService.requestI18nTemplate(list, null, new AbstractC63598b<List<String>>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62342j.C623453 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ void m243593b(DialogInterface dialogInterface, int i) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("ParticipantControlViewHolder", "[requestI18nTemplate]", "failed, error = " + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(List<String> list) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append("\n");
                int i = 0;
                while (i < list.size()) {
                    int i2 = i + 1;
                    sb.append(i2);
                    sb.append(".");
                    sb.append(list.get(i));
                    sb.append("\n");
                    i = i2;
                }
                VCDialogUtils.m236216b((Context) activity, mustacheFormat, 2, sb.toString().trim(), (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$j$3$bTF0ZpnXQ_30EQE1mAAkHr8Cco.INSTANCE, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$j$3$ey51O8lQmYtLopUMjwUIy73xaw */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        View$OnClickListenerC62342j.C623453.this.m243592a(dialogInterface, i);
                    }
                }, false);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m243592a(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC62342j.this.f156704o.mo215566d(View$OnClickListenerC62342j.this.f156703n);
            }
        });
    }

    public View$OnClickListenerC62342j(FragmentActivity fragmentActivity, C61303k kVar, AbstractC61222a aVar) {
        this.f156701l = fragmentActivity;
        this.f156702m = kVar;
        this.f156705p = aVar;
    }
}
