package com.ss.android.vc.meeting.module.chat;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.chat.d */
public class C61582d extends MeetingBaseDesktopDialog {

    /* renamed from: a */
    C61586h f154495a;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        C61586h hVar = new C61586h();
        this.f154495a = hVar;
        return hVar.mo213426a(mo211718i(), mo211719j(), this);
    }

    public C61582d(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
