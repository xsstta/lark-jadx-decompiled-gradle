package com.ss.android.vc.meeting.module.follow.p3122c;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.follow.c.b */
public class C61797b extends MeetingBaseDesktopDialog {

    /* renamed from: a */
    private C61800e f155104a;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        super.dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        C61800e eVar = new C61800e();
        this.f155104a = eVar;
        return eVar.mo214075a(mo211718i(), mo211719j(), this);
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: f */
    public void mo211715f() {
        if (bJ_() != null && bJ_().getWindow() != null) {
            Window window = bJ_().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = UIHelper.dp2px(620.0f);
            attributes.width = UIHelper.dp2px(540.0f);
            window.setAttributes(attributes);
        }
    }

    public C61797b(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
