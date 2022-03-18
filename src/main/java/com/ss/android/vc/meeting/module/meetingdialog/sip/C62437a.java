package com.ss.android.vc.meeting.module.meetingdialog.sip;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.sip.a */
public class C62437a extends MeetingBaseDesktopDialog implements SIPInviteView.AbstractC62436a {

    /* renamed from: a */
    private SIPInviteView f157040a;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView.AbstractC62436a
    /* renamed from: k */
    public void mo215849k() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView.AbstractC62436a
    /* renamed from: l */
    public void mo215850l() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        SIPInviteView sIPInviteView = this.f157040a;
        if (sIPInviteView != null) {
            sIPInviteView.mo215836a();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        SIPInviteView sIPInviteView = new SIPInviteView(mo211718i());
        this.f157040a = sIPInviteView;
        sIPInviteView.mo215838a(mo211719j());
        this.f157040a.setActionListener(this);
        return this.f157040a;
    }

    public C62437a(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
