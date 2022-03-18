package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.topbar.AbstractC63441a;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.meeting.utils.C63496i;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;
import com.ss.android.vc.statistics.event.C63752c;
import com.ss.android.vc.statistics.event2.MeetingBreakoutRoomsPopupEvent;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.a */
public class View$OnClickListenerC62383a extends AbstractC63524a<View$OnClickListenerC62383a> implements View.OnClickListener {

    /* renamed from: a */
    private final Context f156889a;

    /* renamed from: b */
    private final C61303k f156890b;

    /* renamed from: c */
    private final Activity f156891c;

    /* renamed from: d */
    private final View f156892d;

    /* renamed from: p */
    private final AbstractC63441a.AbstractC63442a f156893p;

    /* renamed from: q */
    private TextView f156894q;

    /* renamed from: r */
    private TextView f156895r;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m243799b(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: d */
    private void m243800d() {
        C60700b.m235841a(this.f156890b.mo212056e(), "UI", "StateEngine", "clickLeftMeeting", "HangupActionPopup", "clickLeftMeetingButton");
        this.f156890b.ah().mo219482b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219686a(R.layout.popup_window_hangup);
        mo219688a(true);
        mo219695b(true);
        mo219685a(0.5f);
    }

    /* renamed from: m */
    private void m243802m() {
        VCDialogUtils.m236215b((Context) this.f156891c, C60773o.m236119a((int) R.string.View_M_EndMeetingInfo), 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$a$JS9sh0ZSOioYyw9eXZcucHUcFvo.INSTANCE, (int) R.string.View_M_EndMeetingButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.$$Lambda$a$SMvTrnECjvF_RcHEstNnutTGWA */

            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC62383a.this.m243798a((View$OnClickListenerC62383a) dialogInterface, (DialogInterface) i);
            }
        }, false);
        MeetingOnTheCallEvent2.m249823a().mo220302a(this.f156890b, "end_meeting", "vc_meeting_popup");
    }

    /* renamed from: b */
    public void mo211397b() {
        if (this.f156891c != null) {
            C60700b.m235851b("HangupActionPopup", "[show]", "PopupWindow is shown");
            mo219702j();
            mo219691a(this.f156892d, this.f156892d.getWidth() - mo219703k().getMeasuredWidth(), C60773o.m236115a(4.0d), 8388611);
        }
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: c */
    public void mo211398c() {
        C60700b.m235851b("HangupActionPopup", "[dismiss]", "PopupWindow is dismissed");
        if ((this.f156889a instanceof Activity) && mo219704l() && UIUtils.isActivityRunning((Activity) this.f156889a)) {
            super.mo211398c();
        }
    }

    /* renamed from: e */
    private void m243801e() {
        C60700b.m235851b("HangupActionPopup", "[leaveRoomClicked]", "clickLeaveRoom");
        this.f156890b.al().mo213169b();
        C63752c.m250240c(this.f156890b.mo212056e());
        MeetingBreakoutRoomsPopupEvent.m249771a().mo220266a("leave", "leave_rooms", "none", "mobile_leaveroom", Boolean.valueOf(this.f156890b.al().mo213181h()), Boolean.valueOf(this.f156890b.al().mo213182i()), this.f156890b.mo212056e());
    }

    /* renamed from: n */
    private void m243803n() {
        C60700b.m235841a(this.f156890b.mo212056e(), "UI", "StateEngine", "clickEndMeeting", "HangupActionPopup", "clickEndMeetingButton");
        if (this.f156890b.mo212091I().mo212494b().mo212599d() > 1) {
            C63492g.m248824b(false, Boolean.valueOf(this.f156890b.mo212092J().mo212512I()));
        }
        C60738ac.m236025a((int) R.string.View_M_YouEndedMeeting, 1000);
        if (this.f156890b != null) {
            this.f156890b.mo212051a(C61344j.m239002a().mo212329a(99).mo212331a(EventSource.EVENT_DIALOG));
            AbstractC63441a.AbstractC63442a aVar = this.f156893p;
            if (aVar != null) {
                aVar.mo219489a();
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.tv_end_meeting) {
            mo211398c();
            m243802m();
        } else if (view.getId() == R.id.tv_leave_meeting) {
            mo211398c();
            if (!this.f156890b.al().mo213182i() || !ParticipantUtil.m248733c(this.f156890b) || this.f156890b.al().mo213185l() != VCBreakoutRoomInfo.Status.COUNT_DOWN) {
                m243800d();
            } else {
                m243801e();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243798a(DialogInterface dialogInterface, int i) {
        m243803n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, View$OnClickListenerC62383a aVar) {
        this.f156894q = (TextView) mo219693b(R.id.tv_end_meeting);
        this.f156895r = (TextView) mo219693b(R.id.tv_leave_meeting);
        if (C63496i.m248846b(this.f156890b)) {
            this.f156894q.setVisibility(0);
        } else {
            this.f156894q.setVisibility(8);
        }
        if (!this.f156890b.al().mo213182i() || !ParticipantUtil.m248733c(this.f156890b) || this.f156890b.al().mo213185l() != VCBreakoutRoomInfo.Status.COUNT_DOWN) {
            this.f156895r.setText(R.string.View_M_LeaveMeetingButton);
        } else {
            this.f156895r.setText(UIHelper.getString(R.string.View_G_LeaveRoom));
            this.f156894q.setVisibility(8);
        }
        this.f156894q.setOnClickListener(this);
        this.f156895r.setOnClickListener(this);
    }

    /* renamed from: a */
    public static View$OnClickListenerC62383a m243797a(Activity activity, View view, C61303k kVar, AbstractC63441a.AbstractC63442a aVar) {
        return new View$OnClickListenerC62383a(activity, view, kVar, aVar);
    }

    public View$OnClickListenerC62383a(Activity activity, View view, C61303k kVar, AbstractC63441a.AbstractC63442a aVar) {
        this.f156889a = activity;
        this.f156890b = kVar;
        this.f156891c = activity;
        this.f156892d = view;
        this.f156893p = aVar;
        mo219694b((Context) activity);
    }
}
