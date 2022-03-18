package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.BasePopupWindow;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantMeetingRole;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.c */
public class C62320c extends BasePopupWindow {

    /* renamed from: a */
    public Participant f156625a;

    /* renamed from: b */
    public AbstractC62329f f156626b;

    /* renamed from: c */
    public View f156627c;

    /* renamed from: d */
    public TextView f156628d;

    /* renamed from: e */
    public View f156629e;

    /* renamed from: f */
    public View f156630f;

    /* renamed from: g */
    public AbstractC62326a f156631g;

    /* renamed from: h */
    private View f156632h;

    /* renamed from: i */
    private Activity f156633i;

    /* renamed from: j */
    private TextView f156634j;

    /* renamed from: k */
    private View f156635k;

    /* renamed from: l */
    private C61303k f156636l;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.c$a */
    public interface AbstractC62326a {
        /* renamed from: a */
        void mo215551a();

        /* renamed from: b */
        void mo215552b();
    }

    /* renamed from: a */
    private void m243459a() {
        this.f156632h.setFocusable(true);
        this.f156632h.setFocusableInTouchMode(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setFocusable(true);
        this.f156627c = this.f156632h.findViewById(R.id.desktop_host_handle_makehost);
        if (this.f156625a.getCapabilities() == null || !this.f156625a.getCapabilities().isCanBeHost()) {
            this.f156627c.setVisibility(8);
        } else {
            this.f156627c.setVisibility(0);
            this.f156627c.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62320c.View$OnClickListenerC623222 */

                public void onClick(View view) {
                    C62320c.this.f156626b.mo215566d(C62320c.this.f156625a);
                    C62320c.this.f156627c.setSelected(true);
                    C62320c.this.f156629e.setSelected(false);
                    C62320c.this.f156628d.setSelected(false);
                    C62320c.this.dismiss();
                }
            });
        }
        this.f156629e = this.f156632h.findViewById(R.id.desktop_host_handle_remove);
        this.f156628d = (TextView) this.f156632h.findViewById(R.id.desktop_host_handle_makecohost);
        this.f156630f = this.f156632h.findViewById(R.id.desktop_reclaim_host);
        this.f156634j = (TextView) this.f156632h.findViewById(R.id.desktop_handle_speak_request);
        this.f156635k = this.f156632h.findViewById(R.id.desktop_host_handle_stop_share);
        this.f156629e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62320c.View$OnClickListenerC623233 */

            public void onClick(View view) {
                C62320c.this.f156626b.mo215565c(C62320c.this.f156625a);
                C62320c.this.f156629e.setSelected(true);
                C62320c.this.f156627c.setSelected(false);
                C62320c.this.f156628d.setSelected(false);
                C62320c.this.dismiss();
            }
        });
        this.f156628d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62320c.View$OnClickListenerC623244 */

            public void onClick(View view) {
                C62320c.this.f156626b.mo215568f(C62320c.this.f156625a);
                C62320c.this.f156628d.setSelected(true);
                C62320c.this.f156629e.setSelected(false);
                C62320c.this.f156627c.setSelected(false);
                C62320c.this.dismiss();
            }
        });
        this.f156630f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62320c.View$OnClickListenerC623255 */

            public void onClick(View view) {
                C62320c.this.f156626b.mo215569g(C62320c.this.f156625a);
                C62320c.this.f156630f.setSelected(true);
                C62320c.this.dismiss();
            }
        });
        this.f156634j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$c$hzgz8zJk0oSMRw4nVGCr1aHR4DU */

            public final void onClick(View view) {
                C62320c.lambda$hzgz8zJk0oSMRw4nVGCr1aHR4DU(C62320c.this, view);
            }
        });
        this.f156635k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$c$4b3hKEc6pUiaANQDJRzj0u3ArRs */

            public final void onClick(View view) {
                C62320c.lambda$4b3hKEc6pUiaANQDJRzj0u3ArRs(C62320c.this, view);
            }
        });
        m243460b();
    }

    /* renamed from: b */
    private void m243460b() {
        Participant j = this.f156636l.mo212091I().mo212494b().mo212605j();
        VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
        int i = 8;
        if (this.f156636l.mo212056e().getMeetingOwner() == null || !this.f156636l.mo212056e().getMeetingOwner().getUserId().equals(currentUser.getId()) || ParticipantUtil.m248732c(this.f156625a) || !this.f156625a.is_host()) {
            this.f156630f.setVisibility(8);
        } else {
            this.f156630f.setVisibility(0);
        }
        if (j.isCoHost()) {
            this.f156627c.setVisibility(8);
            this.f156628d.setVisibility(8);
        } else if (this.f156625a.getCapabilities() == null || !this.f156625a.getCapabilities().isCanBeCoHost() || (this.f156636l.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && this.f156625a.getParticipantRole() == ParticipantRole.INTERVIEWEE)) {
            this.f156628d.setVisibility(8);
            return;
        } else {
            ParticipantMeetingRole participantMeetingRole = this.f156625a.getParticipantMeetingRole();
            if (participantMeetingRole == null || participantMeetingRole != ParticipantMeetingRole.CO_HOST) {
                this.f156628d.setText(R.string.View_M_MakeCoHost);
            } else {
                this.f156628d.setText(R.string.View_M_WithdrawCoHostPermission);
            }
        }
        if (ParticipantUtil.m248732c(this.f156625a)) {
            this.f156634j.setText(R.string.View_M_LowerHand);
            TextView textView = this.f156634j;
            if (this.f156625a.getParticipantSettings().getHandsStatus() == ParticipantSettings.HandsStatus.PUT_UP && !this.f156625a.isHostOrCoHost()) {
                i = 0;
            }
            textView.setVisibility(i);
        } else if (!j.isHostOrCoHost() || this.f156625a.getParticipantSettings().getHandsStatus() != ParticipantSettings.HandsStatus.PUT_UP) {
            this.f156634j.setVisibility(8);
        } else {
            this.f156634j.setText(R.string.View_M_DeclineRequest);
            this.f156634j.setVisibility(0);
        }
        if (j.isHostOrCoHost() && !ParticipantUtil.m248732c(this.f156625a)) {
            if (ParticipantUtil.m248717a(this.f156625a, this.f156636l.mo212092J().mo212558n(), this.f156636l.mo212092J().mo212556m(), this.f156636l.mo212092J().mo212560o()) || (this.f156636l.ab().mo213882h() != null && ParticipantUtil.m248717a(this.f156625a, this.f156636l.ab().mo213882h().getUserId(), this.f156636l.ab().mo213882h().getDeviceId(), this.f156636l.ab().mo213882h().getUserType()))) {
                this.f156635k.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public void mo215545a(AbstractC62326a aVar) {
        this.f156631g = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m243461b(View view) {
        this.f156626b.mo215570h(this.f156625a);
        this.f156635k.setSelected(true);
        dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m243462c(View view) {
        this.f156626b.mo215567e(this.f156625a);
        this.f156634j.setSelected(true);
        dismiss();
    }

    /* renamed from: a */
    public void mo147656a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, 51, iArr[0] - UIHelper.dp2px(76.0f), iArr[1] + view.getHeight() + UIHelper.dp2px(5.0f));
        AbstractC62326a aVar = this.f156631g;
        if (aVar != null) {
            aVar.mo215551a();
        }
    }

    public C62320c(Activity activity, Participant participant, C61303k kVar, AbstractC62329f fVar) {
        super(-2, -2);
        this.f156633i = activity;
        this.f156626b = fVar;
        this.f156625a = participant;
        this.f156636l = kVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.desktop_host_handle_window, (ViewGroup) null);
        this.f156632h = inflate;
        setContentView(inflate);
        m243459a();
        setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62320c.C623211 */

            public void onDismiss() {
                if (C62320c.this.f156631g != null) {
                    C62320c.this.f156631g.mo215552b();
                }
            }
        });
    }
}
