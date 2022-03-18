package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
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
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62330g;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62492f;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import com.ss.android.vc.meeting.utils.AbstractC63488d;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.p3091e.C60917a;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63742at;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.g */
public class View$OnClickListenerC62330g implements View.OnClickListener {

    /* renamed from: a */
    public InMeetingControlPopItemLayout f156642a;

    /* renamed from: b */
    public final Participant f156643b;

    /* renamed from: c */
    public final AbstractC62329f f156644c;

    /* renamed from: d */
    private InMeetingControlPopItemLayout f156645d;

    /* renamed from: e */
    private InMeetingControlPopItemLayout f156646e;

    /* renamed from: f */
    private InMeetingControlPopItemLayout f156647f;

    /* renamed from: g */
    private InMeetingControlPopItemLayout f156648g;

    /* renamed from: h */
    private InMeetingControlPopItemLayout f156649h;

    /* renamed from: i */
    private InMeetingControlPopItemLayout f156650i;

    /* renamed from: j */
    private InMeetingControlPopItemLayout f156651j;

    /* renamed from: k */
    private InMeetingControlPopItemLayout f156652k;

    /* renamed from: l */
    private InMeetingControlPopItemLayout f156653l;

    /* renamed from: m */
    private InMeetingControlPopItemLayout f156654m;

    /* renamed from: n */
    private InMeetingControlPopItemLayout f156655n;

    /* renamed from: o */
    private InMeetingControlPopItemLayout f156656o;

    /* renamed from: p */
    private LinearLayout f156657p;

    /* renamed from: q */
    private final InMeetingParticipantControlPopWindow.GridType f156658q;

    /* renamed from: r */
    private final C61303k f156659r;

    /* renamed from: s */
    private final Activity f156660s;

    /* renamed from: t */
    private final View f156661t;

    /* renamed from: u */
    private final PopupWindow f156662u;

    /* renamed from: b */
    public View mo215576b() {
        return this.f156661t;
    }

    /* renamed from: s */
    private void m243502s() {
        this.f156650i.setVisibility(8);
    }

    /* renamed from: c */
    public int mo215577c() {
        return this.f156657p.getMeasuredWidth();
    }

    /* renamed from: d */
    public int mo215578d() {
        return this.f156657p.getMeasuredHeight();
    }

    /* renamed from: e */
    public int mo215579e() {
        return this.f156661t.getMeasuredWidth();
    }

    /* renamed from: f */
    public int mo215580f() {
        return this.f156661t.getMeasuredHeight();
    }

    /* renamed from: h */
    private void m243491h() {
        m243493j();
        m243490g();
        m243506w();
        m243505v();
        m243503t();
        m243504u();
        m243502s();
        m243501r();
        m243500q();
        m243498o();
        m243499p();
        m243495l();
        m243496m();
        m243497n();
        m243494k();
        m243492i();
    }

    /* renamed from: k */
    private void m243494k() {
        if (this.f156643b == null) {
            return;
        }
        if (!C63634c.m249496b("byteview.meeting.dialpad") || !(this.f156643b.getParticipantType() == ParticipantType.SIP_USER || this.f156643b.getParticipantType() == ParticipantType.PSTN_USER || this.f156643b.getParticipantType() == ParticipantType.RESERVED_USER_5)) {
            this.f156656o.setVisibility(8);
        } else {
            this.f156656o.setVisibility(0);
        }
    }

    /* renamed from: m */
    private void m243496m() {
        if (!ParticipantUtil.m248732c(this.f156643b) || !C60788y.m236247a(this.f156660s) || DataAdapterUtil.f154006a.mo212855c(this.f156659r) || C60917a.m236770b()) {
            this.f156654m.setVisibility(8);
        } else {
            this.f156654m.setVisibility(0);
        }
    }

    /* renamed from: u */
    private void m243504u() {
        if (!this.f156659r.ab().mo213889o() || ParticipantUtil.m248732c(this.f156643b) || this.f156643b.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156652k.setVisibility(8);
        } else {
            this.f156652k.setVisibility(0);
        }
    }

    /* renamed from: g */
    private void m243490g() {
        this.f156645d.setOnClickListener(this);
        this.f156646e.setOnClickListener(this);
        this.f156642a.setOnClickListener(this);
        this.f156647f.setOnClickListener(this);
        this.f156648g.setOnClickListener(this);
        this.f156649h.setOnClickListener(this);
        this.f156650i.setOnClickListener(this);
        this.f156651j.setOnClickListener(this);
        this.f156652k.setOnClickListener(this);
        this.f156653l.setOnClickListener(this);
        this.f156654m.setOnClickListener(this);
        this.f156655n.setOnClickListener(this);
        this.f156656o.setOnClickListener(this);
    }

    /* renamed from: l */
    private void m243495l() {
        if (this.f156659r.az().mo216034a()) {
            this.f156653l.setTitleText(R.string.View_G_ExitFullScreen);
            this.f156653l.setIconImage(R.drawable.ud_icon_minify_outlined);
        } else if ((this.f156659r.aw().mo216149e() >= 3 || this.f156658q.equals(InMeetingParticipantControlPopWindow.GridType.GALLERY)) && this.f156643b.getStatus() == Participant.Status.ON_THE_CALL) {
            this.f156653l.setTitleText(R.string.View_G_FullScreen);
            this.f156653l.setIconImage(R.drawable.ud_icon_expand_outlined);
        } else {
            this.f156653l.setVisibility(8);
            return;
        }
        this.f156653l.setVisibility(0);
    }

    /* renamed from: n */
    private void m243497n() {
        boolean z;
        if (this.f156658q.equals(InMeetingParticipantControlPopWindow.GridType.GALLERY) && this.f156643b.getStatus() != Participant.Status.ON_THE_CALL) {
            Participant j = this.f156659r.mo212091I().mo212494b().mo212605j();
            if (ParticipantUtil.m248722a(this.f156643b.getInviterId(), this.f156643b.getInviterType(), this.f156643b.getInviterDeviceId()) || (this.f156659r.mo212058g() == VideoChat.Type.MEET && j.isHostOrCoHost() && !this.f156659r.mo212098P())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f156655n.setVisibility(0);
            } else {
                this.f156655n.setVisibility(8);
            }
        }
    }

    /* renamed from: o */
    private void m243498o() {
        if (ParticipantUtil.m248732c(this.f156643b) || this.f156659r.mo212057f() == VideoChat.Type.CALL || this.f156643b.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156647f.setVisibility(8);
            return;
        }
        Participant j = this.f156659r.mo212091I().mo212494b().mo212605j();
        if (!(this.f156659r.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && this.f156643b.getParticipantRole() == ParticipantRole.INTERVIEWEE) && !GuestJoinMeetingUtil.m245480b() && j.is_host() && this.f156643b.getCapabilities() != null && this.f156643b.getCapabilities().isCanBeHost()) {
            this.f156647f.setVisibility(0);
        } else {
            this.f156647f.setVisibility(8);
        }
    }

    /* renamed from: q */
    private void m243500q() {
        ParticipantSettings participantSettings = this.f156643b.getParticipantSettings();
        if (this.f156659r.mo212057f() == VideoChat.Type.CALL) {
            this.f156648g.setVisibility(8);
        } else if (ParticipantUtil.m248732c(this.f156643b)) {
            this.f156648g.setTitleText(R.string.View_M_LowerHand);
            if (participantSettings == null || participantSettings.getHandsStatus() != ParticipantSettings.HandsStatus.PUT_UP || this.f156643b.isHostOrCoHost()) {
                this.f156648g.setVisibility(8);
            } else {
                this.f156648g.setVisibility(0);
            }
        } else if (!this.f156659r.mo212091I().mo212494b().mo212605j().isHostOrCoHost() || participantSettings == null || participantSettings.getHandsStatus() != ParticipantSettings.HandsStatus.PUT_UP) {
            this.f156648g.setVisibility(8);
        } else {
            this.f156648g.setTitleText(R.string.View_M_DeclineRequest);
            this.f156648g.setVisibility(0);
        }
    }

    /* renamed from: r */
    private void m243501r() {
        if (ParticipantUtil.m248732c(this.f156643b) || this.f156659r.mo212057f() == VideoChat.Type.CALL) {
            this.f156642a.setVisibility(8);
            return;
        }
        Participant j = this.f156659r.mo212091I().mo212494b().mo212605j();
        if (j.is_host() && this.f156643b.getStatus() == Participant.Status.ON_THE_CALL) {
            this.f156642a.setVisibility(0);
        } else if (!j.isCoHost()) {
            this.f156642a.setVisibility(8);
        } else if (!this.f156643b.isParticipant() || this.f156643b.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156642a.setVisibility(8);
        } else {
            this.f156642a.setVisibility(0);
        }
    }

    /* renamed from: a */
    public View mo215573a() {
        View inflate = LayoutInflater.from(this.f156660s).inflate(R.layout.vc_participant_control_pop_window, (ViewGroup) null, false);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        return inflate;
    }

    /* renamed from: i */
    private void m243492i() {
        int i;
        int i2 = 0;
        if (this.f156645d.getVisibility() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f156646e.getVisibility() == 0) {
            i++;
        }
        if (this.f156642a.getVisibility() == 0) {
            i++;
        }
        if (this.f156647f.getVisibility() == 0) {
            i++;
        }
        if (this.f156648g.getVisibility() == 0) {
            i++;
        }
        if (this.f156649h.getVisibility() == 0) {
            i++;
        }
        if (this.f156650i.getVisibility() == 0) {
            i++;
        }
        if (this.f156651j.getVisibility() == 0) {
            i++;
        }
        if (this.f156652k.getVisibility() == 0) {
            i++;
        }
        if (this.f156653l.getVisibility() == 0) {
            i++;
        }
        if (this.f156654m.getVisibility() == 0) {
            i++;
        }
        if (this.f156655n.getVisibility() == 0) {
            i++;
        }
        if (this.f156656o.getVisibility() == 0) {
            i++;
        }
        if (i != 0) {
            if (i != 1) {
                i2 = C60773o.m236115a(4.0d);
                this.f156645d.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156646e.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156642a.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156647f.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156648g.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156649h.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156650i.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156651j.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156652k.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156653l.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156654m.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156655n.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
                this.f156656o.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
            } else if (this.f156653l.getVisibility() == 0) {
                this.f156653l.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_8dp);
            } else {
                this.f156653l.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
            }
        }
        this.f156657p.setPadding(i2, i2, i2, i2);
    }

    /* renamed from: j */
    private void m243493j() {
        this.f156645d = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_mute_camera);
        this.f156646e = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_mute_microphone);
        this.f156642a = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_remove_one);
        this.f156647f = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_host_one);
        this.f156648g = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_handle_speak_request);
        this.f156649h = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_co_host_one);
        this.f156650i = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_reclaim_host);
        this.f156651j = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_stop_share);
        this.f156652k = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_pass_on_sharing);
        this.f156653l = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_handle_fullscreen_request);
        this.f156654m = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_handle_flip_camera_request);
        this.f156655n = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_cancel_call);
        this.f156656o = (InMeetingControlPopItemLayout) this.f156661t.findViewById(R.id.participant_show_dial);
        this.f156657p = (LinearLayout) this.f156661t.findViewById(R.id.container);
    }

    /* renamed from: p */
    private void m243499p() {
        if (ParticipantUtil.m248732c(this.f156643b) || this.f156659r.mo212057f() == VideoChat.Type.CALL || this.f156643b.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156649h.setVisibility(8);
        } else if (!this.f156659r.mo212091I().mo212494b().mo212605j().is_host()) {
            this.f156649h.setVisibility(8);
        } else if (this.f156643b.getCapabilities() == null || !this.f156643b.getCapabilities().isCanBeCoHost() || (this.f156659r.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && this.f156643b.getParticipantRole() == ParticipantRole.INTERVIEWEE)) {
            this.f156649h.setVisibility(8);
        } else {
            this.f156649h.setVisibility(0);
            if (this.f156643b.isCoHost()) {
                this.f156649h.setTitleText(R.string.View_M_WithdrawCoHostPermission);
                this.f156649h.setIconImage(R.drawable.ud_icon_withdrawcohost_outlined);
                return;
            }
            this.f156649h.setTitleText(R.string.View_M_MakeCoHost);
            this.f156649h.setIconImage(R.drawable.ud_icon_member_outlined);
        }
    }

    /* renamed from: t */
    private void m243503t() {
        boolean z;
        if (!this.f156659r.mo212091I().mo212494b().mo212605j().isHostOrCoHost() || ParticipantUtil.m248732c(this.f156643b)) {
            this.f156651j.setVisibility(8);
            return;
        }
        boolean a = ParticipantUtil.m248717a(this.f156643b, this.f156659r.mo212092J().mo212558n(), this.f156659r.mo212092J().mo212556m(), this.f156659r.mo212092J().mo212560o());
        if (this.f156659r.ab().mo213882h() == null || !ParticipantUtil.m248717a(this.f156643b, this.f156659r.ab().mo213882h().getUserId(), this.f156659r.ab().mo213882h().getDeviceId(), this.f156659r.ab().mo213882h().getUserType())) {
            z = false;
        } else {
            z = true;
        }
        if (a || z) {
            this.f156651j.setVisibility(0);
        } else {
            this.f156651j.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m243505v() {
        ParticipantSettings participantSettings = this.f156643b.getParticipantSettings();
        if (!ParticipantUtil.m248732c(this.f156643b)) {
            Participant j = this.f156659r.mo212091I().mo212494b().mo212605j();
            if (participantSettings == null) {
                C60700b.m235861e("InMeetingParticipantControlPopViewHolder", "[initMuteMicView]", "ParticipantSetting is null");
                this.f156646e.setVisibility(8);
            } else if (j == null || j.isParticipant() || this.f156643b.getStatus() != Participant.Status.ON_THE_CALL || this.f156659r.mo212057f() == VideoChat.Type.CALL) {
                this.f156646e.setVisibility(8);
            } else {
                this.f156646e.setVisibility(0);
                if (participantSettings.isMicrophoneMuted()) {
                    if (participantSettings.getHandsStatus() == ParticipantSettings.HandsStatus.PUT_UP) {
                        this.f156646e.setTitleText(R.string.View_VM_TurnOnMic);
                        this.f156646e.setIconImage(R.drawable.ud_icon_mic_outlined);
                        return;
                    }
                    this.f156646e.setTitleText(R.string.View_M_HostMicRequest);
                    this.f156646e.setIconImage(R.drawable.ud_icon_mic_outlined);
                } else if (participantSettings.getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE || participantSettings.getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST) {
                    this.f156646e.setTitleText(R.string.View_M_HostMicRequest);
                    this.f156646e.setIconImage(R.drawable.ud_icon_mic_outlined);
                } else {
                    this.f156646e.setTitleText(R.string.View_VM_Mute);
                    this.f156646e.setIconImage(R.drawable.ud_icon_mic_off_outlined);
                }
            }
        } else if (C60788y.m236250b(this.f156660s)) {
            if (participantSettings.isMicrophoneMuted()) {
                this.f156646e.setTitleText(R.string.View_M_Unmute);
                this.f156646e.setIconImage(R.drawable.ud_icon_mic_outlined);
                return;
            }
            this.f156646e.setTitleText(R.string.View_VM_Mute);
            this.f156646e.setIconImage(R.drawable.ud_icon_mic_off_outlined);
        } else if (participantSettings == null || !(participantSettings.getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE || participantSettings.getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST)) {
            this.f156646e.mo215537d();
        } else {
            this.f156646e.mo215536c();
        }
    }

    /* renamed from: w */
    private void m243506w() {
        ParticipantSettings participantSettings = this.f156643b.getParticipantSettings();
        if (!ParticipantUtil.m248732c(this.f156643b)) {
            Participant j = this.f156659r.mo212091I().mo212494b().mo212605j();
            if (participantSettings == null) {
                C60700b.m235861e("InMeetingParticipantControlPopViewHolder", "[initMuteCameraView]", "ParticipantSetting is null");
                this.f156645d.setVisibility(8);
            } else if (this.f156643b.getParticipantType() == ParticipantType.PSTN_USER) {
                this.f156645d.setVisibility(8);
            } else if (j == null || j.isParticipant() || this.f156643b.getStatus() != Participant.Status.ON_THE_CALL || this.f156659r.mo212057f() == VideoChat.Type.CALL) {
                this.f156645d.setVisibility(8);
            } else {
                this.f156645d.setVisibility(0);
                if (participantSettings.isCameraMuted() || participantSettings.getCameraStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE || participantSettings.getCameraStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST) {
                    this.f156645d.setTitleText(R.string.View_M_HostCameraRequest);
                    this.f156645d.setIconImage(R.drawable.ud_icon_video_outlined);
                    return;
                }
                this.f156645d.setTitleText(R.string.View_VM_StopVideo);
                this.f156645d.setIconImage(R.drawable.ud_icon_video_off_outlined);
            }
        } else if (C60788y.m236247a(this.f156660s)) {
            if (participantSettings.isCameraMuted()) {
                this.f156645d.setTitleText(R.string.View_VM_StartVideo);
                this.f156645d.setIconImage(R.drawable.ud_icon_video_outlined);
                return;
            }
            this.f156645d.setTitleText(R.string.View_VM_StopVideo);
            this.f156645d.setIconImage(R.drawable.ud_icon_video_off_outlined);
        } else if (participantSettings == null || !(participantSettings.getCameraStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE || participantSettings.getCameraStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST)) {
            this.f156645d.mo215535b();
        } else {
            this.f156645d.mo215534a();
        }
    }

    /* renamed from: a */
    private void m243487a(final Participant participant) {
        VcBizService.checkVCManageCapabilities(this.f156659r.mo212055d(), new ByteviewUser(participant.getId(), participant.getDeviceId(), participant.getParticipantType()), new AbstractC63598b<CheckVcManageCapabilitiesEntity>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62330g.C623311 */

            /* renamed from: a */
            public void onSuccess(CheckVcManageCapabilitiesEntity checkVcManageCapabilitiesEntity) {
                if (checkVcManageCapabilitiesEntity.mCheckResult == CheckVcManageCapabilitiesEntity.CheckResult.SUCCESS) {
                    View$OnClickListenerC62330g.this.f156644c.mo215566d(participant);
                } else if (checkVcManageCapabilitiesEntity.mCheckResult == CheckVcManageCapabilitiesEntity.CheckResult.NEED_NOTICE) {
                    View$OnClickListenerC62330g.this.mo215574a(participant, checkVcManageCapabilitiesEntity.mI18nKeys);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("InMeetingParticipantControlPopViewHolder", "[hostTransfer]", "cancel transfer host cause checkVCManageCapabilities failed: " + eVar);
            }
        });
    }

    /* renamed from: b */
    private void m243489b(final Participant participant) {
        ParticipantUtil.m248709a(this.f156659r.mo212055d(), participant.getId(), participant.getParticipantType(), new AbstractC63488d() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62330g.C623344 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m243521a(DialogInterface dialogInterface, int i) {
            }

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215583a() {
                C60700b.m235864f("InMeetingParticipantControlPopViewHolder", "[removeParticipant]", "Can not get user info by lobby participant" + participant);
            }

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215584a(String str) {
                if (participant.isGuest()) {
                    str = str + UIHelper.getString(R.string.View_M_GuestParentheses);
                }
                VCDialogUtils.m236184a((Context) ((Activity) View$OnClickListenerC62330g.this.f156642a.getContext()), UIHelper.mustacheFormat((int) R.string.View_M_RemoveParticipant, "name", str), 3, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$g$4$5Jtk3EPV7HP01dEvJlPMSOZodA.INSTANCE, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(participant) {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$g$4$dRkRBrXaC_SZJ17fxrpG5J3hXpw */
                    public final /* synthetic */ Participant f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        View$OnClickListenerC62330g.C623344.this.m243522a(this.f$1, dialogInterface, i);
                    }
                }, false);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m243522a(Participant participant, DialogInterface dialogInterface, int i) {
                View$OnClickListenerC62330g.this.f156644c.mo215565c(participant);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243488a(boolean z) {
        if (z) {
            return;
        }
        if (this.f156658q.equals(InMeetingParticipantControlPopWindow.GridType.GALLERY)) {
            String a = ParticipantUtil.m248706a(this.f156643b);
            this.f156659r.ax().mo214332b(a);
            this.f156659r.ax().mo214356e(a);
            return;
        }
        this.f156659r.aw().mo216153h();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.participant_mute_camera) {
            this.f156644c.mo215563a(this.f156643b);
        } else if (view.getId() == R.id.participant_mute_microphone) {
            this.f156644c.mo215564b(this.f156643b);
        } else if (view.getId() == R.id.participant_remove_one) {
            m243489b(this.f156643b);
        } else if (view.getId() == R.id.participant_host_one) {
            m243487a(this.f156643b);
        } else if (view.getId() == R.id.participant_handle_speak_request) {
            this.f156644c.mo215567e(this.f156643b);
        } else if (view.getId() == R.id.participant_co_host_one) {
            this.f156644c.mo215568f(this.f156643b);
        } else if (view.getId() == R.id.participant_reclaim_host) {
            this.f156644c.mo215569g(this.f156643b);
        } else if (view.getId() == R.id.participant_stop_share) {
            this.f156644c.mo215570h(this.f156643b);
        } else if (view.getId() == R.id.participant_pass_on_sharing) {
            this.f156644c.mo215571i(this.f156643b);
        } else if (view.getId() == R.id.participant_handle_fullscreen_request) {
            if (this.f156659r.az().mo216034a()) {
                this.f156659r.az().mo216036b();
            } else {
                this.f156659r.az().mo216031a(this.f156643b, new AbstractC62492f() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$g$LJ5y1CMFdYZcILAxcAxjhRsd5Vs */

                    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62492f
                    public final void onFullScreenShowChanged(boolean z) {
                        View$OnClickListenerC62330g.this.m243488a((View$OnClickListenerC62330g) z);
                    }
                });
            }
        } else if (view.getId() == R.id.participant_handle_flip_camera_request) {
            DataAdapterUtil.f154006a.mo212860f(this.f156659r);
            C63742at.m250116w(this.f156659r.mo212056e());
        } else if (view.getId() == R.id.participant_cancel_call) {
            this.f156659r.aw().mo216138a(this.f156643b);
        } else if (view.getId() == R.id.participant_show_dial) {
            this.f156644c.mo215572j(this.f156643b);
        }
        this.f156662u.dismiss();
    }

    /* renamed from: a */
    public void mo215574a(final Participant participant, final List<String> list) {
        ParticipantUtil.m248709a(this.f156659r.mo212055d(), participant.getId(), participant.getParticipantType(), new AbstractC63488d() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62330g.C623322 */

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215583a() {
                C60700b.m235864f("InMeetingParticipantControlPopViewHolder", "[noticeParticipantLackingOfAbility]", "Can not get user info by participant" + participant);
            }

            @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
            /* renamed from: a */
            public void mo215584a(String str) {
                View$OnClickListenerC62330g.this.mo215575a(str, list);
            }
        });
    }

    /* renamed from: a */
    public void mo215575a(String str, List<String> list) {
        final String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_M_MakeHostQuestion, "name", str);
        final String string = UIHelper.getString(R.string.View_M_MeetingManagementFeaturesNotSupported);
        final Activity activity = (Activity) this.f156647f.getContext();
        VcBizService.requestI18nTemplate(list, null, new AbstractC63598b<List<String>>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62330g.C623333 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ void m243519b(DialogInterface dialogInterface, int i) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("InMeetingParticipantControlPopViewHolder", "[confirmTransfer]", "requestI18nTemplate failed");
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
                VCDialogUtils.m236216b((Context) activity, mustacheFormat, 2, sb.toString().trim(), (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$g$3$OwB09LDbV3YCKe4e3FXjrRxLCI.INSTANCE, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$g$3$jaznLxQbv7qgNVNrMLUJOsO0SA */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        View$OnClickListenerC62330g.C623333.this.m243518a(dialogInterface, i);
                    }
                }, false);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m243518a(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC62330g.this.f156644c.mo215566d(View$OnClickListenerC62330g.this.f156643b);
            }
        });
    }

    public View$OnClickListenerC62330g(Activity activity, C61303k kVar, InMeetingParticipantControlPopWindow.GridType gridType, Participant participant, PopupWindow popupWindow) {
        this.f156659r = kVar;
        this.f156660s = activity;
        this.f156658q = gridType;
        this.f156643b = participant;
        this.f156644c = C62335h.m243525a(activity, kVar);
        this.f156662u = popupWindow;
        View a = mo215573a();
        this.f156661t = a;
        m243491h();
        a.measure(0, 0);
    }
}
