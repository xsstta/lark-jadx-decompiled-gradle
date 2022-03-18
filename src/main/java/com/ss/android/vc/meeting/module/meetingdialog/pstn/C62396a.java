package com.ss.android.vc.meeting.module.meetingdialog.pstn;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.a */
public class C62396a extends MeetingBaseDesktopDialog implements PhoneInviteView.AbstractC62395a {

    /* renamed from: a */
    private PhoneInviteView f156944a;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.AbstractC62395a
    /* renamed from: k */
    public void mo215726k() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.AbstractC62395a
    /* renamed from: l */
    public void mo215727l() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        PhoneInviteView phoneInviteView = this.f156944a;
        if (phoneInviteView != null) {
            phoneInviteView.mo215717b();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        PhoneInviteView phoneInviteView = new PhoneInviteView(mo211718i());
        this.f156944a = phoneInviteView;
        phoneInviteView.mo215714a(mo211719j());
        this.f156944a.setActionListener(this);
        return this.f156944a;
    }

    public C62396a(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
