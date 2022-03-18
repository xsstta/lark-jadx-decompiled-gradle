package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.tag.HostTag;
import com.ss.android.vc.common.widget.tag.InterpretationTag;
import com.ss.android.vc.dependency.AbstractC60882ag;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.C61957c;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62320c;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62341i;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62347k;
import com.ss.android.vc.meeting.utils.C63496i;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.statistics.event.ap;
import com.ss.android.vc.statistics.event.ax;
import com.ss.android.vc.statistics.event.bh;
import com.ss.android.vc.statistics.event.bi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.c */
public class C62359c extends C62352a {

    /* renamed from: c */
    public AbstractC62329f f156785c;

    /* renamed from: d */
    public ConstraintLayout f156786d;

    /* renamed from: e */
    public IconFontView f156787e;

    /* renamed from: f */
    public InterpretationTag f156788f;

    /* renamed from: g */
    private C62347k f156789g;

    /* renamed from: h */
    private LottieAnimationView f156790h;

    /* renamed from: i */
    private LKUIRoundedImageView f156791i;

    /* renamed from: j */
    private View f156792j;

    /* renamed from: k */
    private ConstraintLayout f156793k;

    /* renamed from: l */
    private TextView f156794l;

    /* renamed from: m */
    private TextView f156795m;

    /* renamed from: n */
    private HostTag f156796n;

    /* renamed from: o */
    private TextView f156797o;

    /* renamed from: p */
    private ImageView f156798p;

    /* renamed from: q */
    private ImageView f156799q;

    /* renamed from: r */
    private TextView f156800r;

    /* renamed from: s */
    private ImageView f156801s;

    /* renamed from: t */
    private ImageView f156802t;

    /* renamed from: u */
    private ImageView f156803u;

    /* renamed from: v */
    private ImageView f156804v;

    /* renamed from: w */
    private View f156805w;

    /* renamed from: x */
    private View f156806x;

    /* renamed from: b */
    public LottieAnimationView mo215660b() {
        return this.f156790h;
    }

    /* renamed from: a */
    public void mo215659a(ParticipantItem participantItem, VideoChatUser videoChatUser, HashMap<String, Integer> hashMap) {
        super.mo215644c(participantItem);
        if (VideoChatUserService.getCurrentUser() != null) {
            Participant participant = participantItem.f156729a;
            m243705b(videoChatUser, participant);
            m243719l(participant);
            m243714g(participant);
            m243701a(videoChatUser, participant);
            m243717j(participant);
            m243718k(participant);
            m243715h(participant);
            m243713f(participant);
            m243698a(participant, hashMap);
            m243711e(participant);
            m243709d(participant);
            m243707c(participant);
            m243712e(participantItem);
            m243716i(participant);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m243706c() {
        this.f156790h.playAnimation();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243699a(C62347k kVar) {
        kVar.notifyItemChanged(getAdapterPosition());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m243703b(C62347k kVar) {
        kVar.notifyItemChanged(getAdapterPosition());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m243710d(C62347k kVar) {
        kVar.notifyItemChanged(getAdapterPosition());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m243708c(C62347k kVar) {
        kVar.notifyItemChanged(getAdapterPosition());
    }

    /* renamed from: e */
    private void m243711e(Participant participant) {
        if (participant.getStatus() == Participant.Status.ON_THE_CALL || !VideoChatModuleDependency.m236634g().mo196512b()) {
            this.f156804v.setVisibility(8);
            return;
        }
        this.f156804v.setVisibility(0);
        VideoChatModuleDependency.m236634g().mo196510a(participant.getId(), new AbstractC60882ag.AbstractC60883a() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$c$Lb9cvfil7RD1cUhx3uCiXpjSMQ */

            @Override // com.ss.android.vc.dependency.AbstractC60882ag.AbstractC60883a
            public final void onStatus(String str) {
                C62359c.this.m243702a((C62359c) str);
            }
        });
    }

    /* renamed from: g */
    private void m243714g(Participant participant) {
        boolean z;
        boolean z2;
        if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
            z2 = C63496i.m248845b(participant, this.f156764a);
            z = participant.isCoHost();
        } else {
            z = false;
            z2 = false;
        }
        if (z2) {
            this.f156796n.setVisibility(0);
            this.f156796n.setText(R.string.View_M_Host);
        } else if (z) {
            this.f156796n.setVisibility(0);
            this.f156796n.setText(R.string.View_M_CoHost);
        } else {
            this.f156796n.setVisibility(8);
        }
    }

    /* renamed from: h */
    private void m243715h(Participant participant) {
        Participant.Status status = participant.getStatus();
        int i = 8;
        if (status == Participant.Status.ON_THE_CALL || status == Participant.Status.RINGING) {
            View view = this.f156806x;
            if (ParticipantUtil.m248735d(participant)) {
                i = 0;
            }
            view.setVisibility(i);
            return;
        }
        this.f156806x.setVisibility(8);
    }

    /* renamed from: i */
    private void m243716i(Participant participant) {
        if (participant.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156788f.setVisibility(8);
        } else if (C60938g.m237062b(participant)) {
            VcBizSender.m249235b(participant.getParticipantSettings().getInterpreterSetting().interpretingLanguage.despI18nKey, (Map<String, String>) null).mo219889a(new AbstractC63598b<String>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623645 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("NormalUserViewHolder", "[bindInterpretationView2]", "getViewI18nTemplate onError:" + eVar);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    C60700b.m235851b("NormalUserViewHolder", "[bindInterpretationView1] ", "getViewI18nTemplate onSuccess:" + str);
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_InterpreterLanguage_Status, "interpreter_language", str);
                    C62359c.this.f156788f.setVisibility(0);
                    C62359c.this.f156788f.setText(mustacheFormat);
                }
            });
        } else {
            this.f156788f.setVisibility(8);
        }
    }

    /* renamed from: j */
    private void m243717j(Participant participant) {
        if (participant.getStatus() == Participant.Status.RINGING) {
            this.f156790h.setVisibility(0);
            if (!this.f156790h.isAnimating()) {
                this.f156790h.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$c$C97k9aHkitnovBTodHeaqP5Iv58 */

                    public final void run() {
                        C62359c.this.m243706c();
                    }
                });
                return;
            }
            return;
        }
        this.f156790h.setVisibility(8);
        if (this.f156790h.isAnimating()) {
            this.f156790h.cancelAnimation();
        }
    }

    /* renamed from: l */
    private void m243719l(Participant participant) {
        String str;
        if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
            if (ParticipantUtil.m248732c(participant)) {
                str = UIHelper.getString(R.string.View_M_MeParentheses);
            } else if (participant.isGuest()) {
                str = UIHelper.getString(R.string.View_M_GuestParentheses);
            }
            this.f156795m.setText(str);
        }
        str = "";
        this.f156795m.setText(str);
    }

    /* renamed from: m */
    private void m243720m(final Participant participant) {
        C623678 r3;
        ConstraintLayout constraintLayout = this.f156786d;
        if (C63496i.m248843a(participant, this.f156764a) || this.f156764a.ab().mo213889o()) {
            r3 = new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623678 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    new C62341i(C62359c.this.f156765b, participant, C62359c.this.f156764a, C62359c.this.f156785c, true).mo211606a();
                }
            };
        } else {
            r3 = null;
        }
        constraintLayout.setOnClickListener(r3);
    }

    /* renamed from: c */
    private void m243707c(Participant participant) {
        if (participant.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156797o.setVisibility(8);
            this.f156792j.setVisibility(8);
        } else if (participant.getParticipantSettings().getHandsStatus() == ParticipantSettings.HandsStatus.PUT_UP) {
            this.f156797o.setVisibility(0);
            if (mo215641a()) {
                this.f156792j.setVisibility(0);
            } else {
                this.f156792j.setVisibility(8);
            }
        } else {
            this.f156797o.setVisibility(8);
            this.f156792j.setVisibility(8);
        }
    }

    /* renamed from: e */
    private void m243712e(ParticipantItem participantItem) {
        int i;
        ConstraintLayout constraintLayout = this.f156786d;
        if (mo215643b(participantItem) || mo215642a(participantItem)) {
            i = R.drawable.participant_list_item_selector;
        } else {
            i = R.color.vc_transparent;
        }
        constraintLayout.setBackground(C60773o.m236128f(i));
        this.f156787e.setVisibility(8);
        if (DesktopUtil.m144307b()) {
            m243721n(participantItem.f156729a);
        } else {
            m243720m(participantItem.f156729a);
        }
    }

    /* renamed from: b */
    public void mo215661b(Participant participant) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ByteviewUser(participant.getId(), participant.getDeviceId(), participant.getParticipantType()));
        C60700b.m235851b("NormalUserViewHolder", "[cancelInviteVideoChat]", "user_id = " + participant.getId());
        bi.m250175b(participant.getId(), this.f156764a.mo212056e());
        VcBizSender.m249240b(arrayList, this.f156764a.mo212091I().mo212490a().mo212475g()).mo219893b(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623623 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("NormalUserViewHolder", "[cancelInviteVideoChat2]", "success");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("NormalUserViewHolder", "[cancelInviteVideoChat3]", "error: " + eVar.toString());
                if (eVar.f160600c) {
                    return;
                }
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                } else {
                    C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(eVar.mo219899a())));
                }
            }
        });
    }

    /* renamed from: f */
    private void m243713f(Participant participant) {
        if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
            InMeetingData.ScreenSharedData f = this.f156764a.mo212091I().mo212490a().mo212474f();
            if (f != null && ParticipantUtil.m248717a(participant, f.getParticipantId(), f.getParticipantDeviceId(), f.getParticipantType())) {
                this.f156801s.setVisibility(0);
            } else if (this.f156764a.ab().mo213882h() == null || !ParticipantUtil.m248717a(participant, this.f156764a.ab().mo213882h().getUserId(), this.f156764a.ab().mo213882h().getDeviceId(), this.f156764a.ab().mo213882h().getUserType())) {
                this.f156801s.setVisibility(8);
            } else {
                this.f156801s.setVisibility(0);
            }
        } else {
            this.f156801s.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m243718k(final Participant participant) {
        Participant.Status status = participant.getStatus();
        if (status == Participant.Status.ON_THE_CALL) {
            this.f156800r.setVisibility(8);
        } else if (status == Participant.Status.RINGING) {
            if (C63496i.m248844a(this.f156764a) || ParticipantUtil.m248722a(participant.getInviterId(), participant.getInviterType(), participant.getInviterDeviceId())) {
                this.f156800r.setVisibility(0);
                this.f156800r.setText(R.string.View_G_CancelButton);
                this.f156800r.setBackgroundResource(R.drawable.vc_bg_participant_list_button_selector);
                mo215640a(this.f156800r, this.f156786d);
            } else {
                this.f156800r.setVisibility(8);
            }
            this.f156800r.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623656 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C62359c.this.mo215661b(participant);
                }
            });
        } else {
            this.f156800r.setVisibility(0);
            this.f156800r.setText(R.string.View_VM_CallButton);
            this.f156800r.setBackgroundResource(R.drawable.vc_bg_participant_list_button_selector);
            mo215640a(this.f156800r, this.f156786d);
            this.f156800r.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623667 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C62359c.this.mo215656a(participant);
                }
            });
        }
    }

    /* renamed from: n */
    private void m243721n(final Participant participant) {
        if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
            if (C63496i.m248843a(participant, this.f156764a)) {
                mo215640a(this.f156787e, this.f156786d);
                this.f156787e.setVisibility(0);
                this.f156787e.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623689 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        C62320c cVar = new C62320c(C62359c.this.f156765b, participant, C62359c.this.f156764a, C62359c.this.f156785c);
                        cVar.mo215545a(new C62320c.AbstractC62326a() {
                            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623689.C623691 */

                            @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62320c.AbstractC62326a
                            /* renamed from: a */
                            public void mo215551a() {
                                C62359c.this.f156786d.setSelected(true);
                                C62359c.this.f156787e.setHovered(true);
                                C62359c.this.f156787e.setBackground(C60773o.m236128f(R.drawable.desktop_more_bg_hovered));
                                C62359c.this.f156787e.setOnHoverListener(null);
                            }

                            @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62320c.AbstractC62326a
                            /* renamed from: b */
                            public void mo215552b() {
                                C62359c.this.f156786d.setSelected(false);
                                C62359c.this.f156787e.setHovered(false);
                                C62359c.this.f156787e.setBackground(C60773o.m236128f(R.drawable.desktop_participant_btn_bg));
                                C62359c.this.mo215640a(C62359c.this.f156787e, C62359c.this.f156786d);
                            }
                        });
                        cVar.mo147656a((View) C62359c.this.f156787e);
                    }
                });
            } else {
                this.f156787e.setVisibility(8);
            }
            if (C63496i.m248843a(participant, this.f156764a)) {
                mo215640a(this.f156798p, this.f156786d);
                mo215640a(this.f156799q, this.f156786d);
                this.f156798p.setBackground(C60773o.m236128f(R.drawable.desktop_participant_btn_bg));
                this.f156799q.setBackground(C60773o.m236128f(R.drawable.desktop_participant_btn_bg));
                this.f156798p.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.AnonymousClass10 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        C62359c.this.f156785c.mo215563a(participant);
                    }
                });
                this.f156799q.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.AnonymousClass11 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        C62359c.this.f156785c.mo215564b(participant);
                    }
                });
                return;
            }
            this.f156798p.setBackground(C60773o.m236128f(R.color.lkui_transparent));
            this.f156799q.setBackground(C60773o.m236128f(R.color.lkui_transparent));
            this.f156798p.setOnClickListener(null);
            this.f156799q.setOnClickListener(null);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243702a(String str) {
        if (str == null || str.length() <= 0) {
            this.f156804v.setVisibility(8);
        } else {
            C52977a.m205190a().mo180995a(this.f156804v, str);
        }
    }

    /* renamed from: d */
    private void m243709d(Participant participant) {
        if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
            ParticipantSettings participantSettings = participant.getParticipantSettings();
            ParticipantSettings.EquipmentStatus cameraStatus = participantSettings.getCameraStatus();
            ParticipantSettings.EquipmentStatus microphoneStatus = participantSettings.getMicrophoneStatus();
            this.f156798p.setVisibility(0);
            this.f156799q.setVisibility(0);
            if (cameraStatus == ParticipantSettings.EquipmentStatus.NOT_EXIST || cameraStatus == ParticipantSettings.EquipmentStatus.UNAVAILABLE || cameraStatus == ParticipantSettings.EquipmentStatus.NO_PERMISSION) {
                if (ParticipantUtil.m248732c(participant)) {
                    this.f156798p.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_off_filled));
                    this.f156798p.setImageTintList(C60773o.m236127e(R.color.icon_disable));
                } else {
                    this.f156798p.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_off_filled));
                    this.f156798p.setImageTintList(C60773o.m236127e(R.color.ud_R400));
                }
            } else if (participantSettings.isCameraMuted()) {
                this.f156798p.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_off_filled));
                this.f156798p.setImageTintList(C60773o.m236127e(R.color.ud_R400));
            } else {
                this.f156798p.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_filled));
                this.f156798p.setImageTintList(C60773o.m236127e(R.color.icon_n3));
            }
            if (microphoneStatus == ParticipantSettings.EquipmentStatus.NOT_EXIST || microphoneStatus == ParticipantSettings.EquipmentStatus.UNAVAILABLE || microphoneStatus == ParticipantSettings.EquipmentStatus.NO_PERMISSION) {
                if (ParticipantUtil.m248732c(participant)) {
                    this.f156799q.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_mic_off_filled));
                    this.f156799q.setImageTintList(C60773o.m236127e(R.color.icon_disable));
                    return;
                }
                this.f156799q.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_mic_off_filled));
                this.f156799q.setImageTintList(C60773o.m236127e(R.color.ud_R400));
            } else if (participantSettings.isMicrophoneMuted()) {
                this.f156799q.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_mic_off_filled));
                this.f156799q.setImageTintList(C60773o.m236127e(R.color.ud_R400));
            } else {
                this.f156799q.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_mic_filled));
                this.f156799q.setImageTintList(C60773o.m236127e(R.color.icon_n3));
            }
        } else {
            this.f156798p.setVisibility(8);
            this.f156799q.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo215656a(Participant participant) {
        VideoChatSettings c;
        List<Participant> e = this.f156764a.mo212091I().mo212494b().mo212600e();
        if (C60742af.m236059a(e) || (c = this.f156764a.mo212091I().mo212496c().mo212429c()) == null) {
            return;
        }
        if (e.size() >= c.getMaxParticipantNum()) {
            C60700b.m235851b("NormalUserViewHolder", "[onInviteClicked]", "participants reach to limit max count braces");
            C60738ac.m236037c((int) R.string.View_M_CapacityReached);
            ap.m250030c(this.f156764a.mo212056e());
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (participant.getParticipantType() == ParticipantType.LARK_USER) {
            arrayList.add(participant.getId());
        } else if (participant.getParticipantType() == ParticipantType.ROOM) {
            arrayList2.add(participant.getId());
        }
        C60700b.m235851b("NormalUserViewHolder", "[onInviteClicked2]", "inviteVideoChat user_id = " + participant.getId());
        bi.m250168a(participant.getId(), this.f156764a.mo212056e());
        bh.m250164a(participant.getId(), this.f156764a.mo212056e());
        VcBizSender.m249202a(arrayList, arrayList2, this.f156764a.mo212091I().mo212490a().mo212475g()).mo219893b(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623612 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("NormalUserViewHolder", "[onInviteClicked3]", "inviteVideoChat success");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("NormalUserViewHolder", "[onInviteClicked4]", "inviteVideoChat error: " + eVar.toString());
                if (eVar.f160600c) {
                    return;
                }
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                } else {
                    C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(eVar.mo219899a())));
                }
            }
        });
    }

    /* renamed from: a */
    private void m243698a(Participant participant, HashMap<String, Integer> hashMap) {
        String id = participant.getId();
        Participant.DeviceType deviceType = participant.getDeviceType();
        if (participant.getStatus() != Participant.Status.ON_THE_CALL) {
            this.f156803u.setVisibility(8);
        } else if (deviceType == null) {
            this.f156803u.setVisibility(8);
        } else if (deviceType == Participant.DeviceType.MOBILE) {
            if (hashMap.get(id) == null || hashMap.get(id).intValue() < 2) {
                this.f156803u.setVisibility(8);
                return;
            }
            this.f156803u.setVisibility(0);
            this.f156803u.setImageResource(R.drawable.ud_icon_cellphone_outlined);
        } else if (deviceType != Participant.DeviceType.WEB) {
            this.f156803u.setVisibility(8);
        } else if (hashMap.get(id) == null || hashMap.get(id).intValue() < 2) {
            this.f156803u.setVisibility(8);
        } else {
            this.f156803u.setVisibility(0);
            this.f156803u.setImageResource(R.drawable.ud_icon_mac_filled);
        }
    }

    /* renamed from: a */
    private void m243701a(VideoChatUser videoChatUser, final Participant participant) {
        if (C63496i.m248847c(participant, this.f156764a)) {
            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, this.f156791i);
        } else {
            this.f156791i.setBackgroundResource(0);
            C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), this.f156791i, 48, 48);
        }
        this.f156791i.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623634 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C63497j.m248860d(C62359c.this.f156764a, new ByteviewUser(participant))) {
                    ax.m250129b(C62359c.this.f156764a.mo212056e(), participant.getId(), participant.getDeviceId());
                    C63497j.m248853a(C62359c.this.f156765b, C62359c.this.f156764a, new ByteviewUser(participant));
                }
            }
        });
    }

    /* renamed from: b */
    private void m243705b(VideoChatUser videoChatUser, Participant participant) {
        String str;
        if (!(participant == null || participant.getParticipantSettings() == null || (videoChatUser.getType() != ParticipantType.NEO_USER && !videoChatUser.getType().isNewType() && !videoChatUser.getType().isUnknownType()))) {
            videoChatUser.setNickname(participant.getParticipantSettings().getNickname());
        }
        if (C63496i.m248847c(participant, this.f156764a)) {
            this.f156794l.setText(R.string.View_M_Interviewer);
        } else if (videoChatUser.getType() == ParticipantType.NEO_USER || videoChatUser.getType().isNewType() || videoChatUser.getType().isUnknownType()) {
            TextView textView = this.f156794l;
            if (participant.getParticipantSettings() == null || TextUtils.isEmpty(videoChatUser.getNickname())) {
                str = videoChatUser.getName();
            } else {
                str = videoChatUser.getNickname();
            }
            textView.setText(str);
        } else {
            this.f156794l.setText(videoChatUser.getName());
        }
    }

    /* renamed from: a */
    public static C62359c m243697a(ViewGroup viewGroup, C61303k kVar, Activity activity) {
        return new C62359c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dialog_participant_list_item, viewGroup, false), kVar, activity);
    }

    public C62359c(View view, C61303k kVar, Activity activity) {
        super(view, kVar, activity);
        this.f156786d = (ConstraintLayout) view.findViewById(R.id.participant_list_item);
        this.f156790h = (LottieAnimationView) view.findViewById(R.id.participant_lottie);
        this.f156791i = (LKUIRoundedImageView) view.findViewById(R.id.participant_thumbnail);
        this.f156793k = (ConstraintLayout) view.findViewById(R.id.participant_name_area);
        this.f156794l = (TextView) view.findViewById(R.id.participant_name);
        this.f156795m = (TextView) view.findViewById(R.id.participant_name_ext);
        this.f156796n = (HostTag) view.findViewById(R.id.description);
        this.f156798p = (ImageView) view.findViewById(R.id.participant_camera);
        this.f156799q = (ImageView) view.findViewById(R.id.participant_microphone);
        this.f156800r = (TextView) view.findViewById(R.id.participant_call_cancel);
        this.f156787e = (IconFontView) view.findViewById(R.id.desktop_participant_more);
        this.f156792j = view.findViewById(R.id.thumbnail_red_dot);
        this.f156797o = (TextView) view.findViewById(R.id.speak_request);
        this.f156801s = (ImageView) view.findViewById(R.id.participant_share_screen);
        this.f156802t = (ImageView) view.findViewById(R.id.participant_signal_weak);
        this.f156803u = (ImageView) view.findViewById(R.id.participant_type_mobile);
        this.f156804v = (ImageView) view.findViewById(R.id.status);
        this.f156805w = view.findViewById(R.id.divide_line);
        this.f156806x = view.findViewById(R.id.externalTag);
        this.f156788f = (InterpretationTag) view.findViewById(R.id.interpretation_label);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243700a(ParticipantItem participantItem, HashMap hashMap, C62347k kVar, VideoChatUser videoChatUser) {
        if (videoChatUser != null && videoChatUser.getId().equals(participantItem.f156729a.getId())) {
            mo215659a(participantItem, videoChatUser, hashMap);
            C60735ab.m236011b(new Runnable(kVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$c$J23grFt9X9cihOzaJN9XV0UQrY0 */
                public final /* synthetic */ C62347k f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C62359c.this.m243703b((C62359c) this.f$1);
                }
            });
            C60735ab.m236002a(new Runnable(kVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$c$bJ84rqR4HHkDH04X5It1_89Eo2g */
                public final /* synthetic */ C62347k f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C62359c.this.m243699a((C62359c) this.f$1);
                }
            }, 20);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m243704b(ParticipantItem participantItem, HashMap hashMap, C62347k kVar, VideoChatUser videoChatUser) {
        if (videoChatUser != null && videoChatUser.getId().equals(participantItem.f156729a.getId())) {
            mo215659a(participantItem, videoChatUser, hashMap);
            C60735ab.m236011b(new Runnable(kVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$c$zu6Bh8jNxQaJL8P6_sQbO41dU */
                public final /* synthetic */ C62347k f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C62359c.this.m243710d((C62359c) this.f$1);
                }
            });
            C60735ab.m236002a(new Runnable(kVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$c$tKh9z1xECdFMWn30K2Lh_wye3Vo */
                public final /* synthetic */ C62347k f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C62359c.this.m243708c((C62359c) this.f$1);
                }
            }, 20);
        }
    }

    /* renamed from: a */
    public void mo215658a(C62347k kVar, ParticipantItem participantItem, HashMap<String, Integer> hashMap, AbstractC62329f fVar) {
        VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(participantItem.f156729a.getId(), participantItem.f156729a.getParticipantType());
        this.f156785c = fVar;
        this.f156789g = kVar;
        if (userInfoInCache != null) {
            mo215659a(participantItem, userInfoInCache, hashMap);
        } else if (kVar.mo215606a()) {
            UserInfoService.getUserInfoById(this.f156764a.mo212055d(), participantItem.f156729a.getId(), participantItem.f156729a.getParticipantType(), new GetUserInfoListener(participantItem, hashMap, kVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$c$8l_tzf_GnwpZPCCz9RmLEGTKIg */
                public final /* synthetic */ ParticipantItem f$1;
                public final /* synthetic */ HashMap f$2;
                public final /* synthetic */ C62347k f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    C62359c.this.m243700a((C62359c) this.f$1, (ParticipantItem) this.f$2, (HashMap) this.f$3, (C62347k) videoChatUser);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo215657a(C62347k kVar, final ParticipantItem participantItem, HashMap<String, Integer> hashMap, final AbstractC61222a aVar, boolean z) {
        final VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(participantItem.f156729a.getId(), participantItem.f156729a.getParticipantType());
        this.f156789g = kVar;
        if (userInfoInCache != null) {
            mo215659a(participantItem, userInfoInCache, hashMap);
        } else if (kVar.mo215606a()) {
            UserInfoService.getUserInfoById(this.f156764a.mo212055d(), participantItem.f156729a.getId(), participantItem.f156729a.getParticipantType(), new GetUserInfoListener(participantItem, hashMap, kVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$c$sPJ5dfzx_rYPMYnyK45EunyIo */
                public final /* synthetic */ ParticipantItem f$1;
                public final /* synthetic */ HashMap f$2;
                public final /* synthetic */ C62347k f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    C62359c.this.m243704b(this.f$1, this.f$2, this.f$3, videoChatUser);
                }
            });
        }
        this.f156798p.setVisibility(8);
        this.f156799q.setVisibility(8);
        this.f156790h.setVisibility(8);
        this.f156787e.setVisibility(8);
        this.f156800r.setVisibility(8);
        this.f156786d.setClickable(true);
        this.f156786d.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c.C623601 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C61957c e = C62359c.this.f156764a.mo212105W().mo212845x().mo214449e();
                boolean a = e.mo214501a(participantItem.f156729a);
                boolean b = e.mo214503b(participantItem.f156729a);
                if (participantItem.f156729a != null && participantItem.f156729a.getCapabilities() != null && !participantItem.f156729a.getCapabilities().isBecomeInterpreter()) {
                    C60738ac.m236037c((int) R.string.View_G_UserVersionNoInterpretation);
                } else if (participantItem.f156729a != null && participantItem.f156729a.isGuest()) {
                    C60738ac.m236037c((int) R.string.View_G_UserVersionNoInterpretation);
                } else if (userInfoInCache.isRoom()) {
                    C60738ac.m236037c((int) R.string.View_G_UserAppNoInterpretation);
                } else if (a || b) {
                    C62359c.this.f156764a.mo212105W().mo212845x().mo214443b(participantItem.f156729a);
                    aVar.dismiss();
                } else {
                    C60738ac.m236037c((int) R.string.View_G_AlreadyInterpreter);
                }
            }
        });
    }
}
