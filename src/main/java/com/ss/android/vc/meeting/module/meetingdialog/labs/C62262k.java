package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.k */
public class C62262k extends MeetingBaseDesktopDialog implements AbstractC62216c.AbstractC62218b.AbstractC62219a {

    /* renamed from: a */
    protected LabsView f156431a;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62218b.AbstractC62219a
    public void bN_() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        LabsView labsView = this.f156431a;
        if (labsView != null) {
            labsView.mo215220m();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        LabsView labsView = new LabsView(mo211718i());
        this.f156431a = labsView;
        labsView.setActionListener(this);
        this.f156431a.mo215201a(mo211719j());
        return this.f156431a;
    }

    public C62262k(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
