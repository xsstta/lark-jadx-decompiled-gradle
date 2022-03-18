package com.ss.android.vc.meeting.module.meetingdialog.meetinginfo;

import android.app.Activity;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.a */
public class C62303a extends MeetingDrawerDialog {

    /* renamed from: e */
    C62305c f156541e;

    /* renamed from: f */
    C61303k f156542f;

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog
    /* renamed from: d */
    public void mo211615d() {
    }

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog
    /* renamed from: e */
    public String mo211617e() {
        return UIHelper.getString(R.string.View_N_MeetingInfo);
    }

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog
    /* renamed from: b */
    public View mo211611b(Activity activity) {
        C62305c cVar = new C62305c();
        this.f156541e = cVar;
        return cVar.mo215473a(this.f156542f, activity, this, this);
    }

    public C62303a(Activity activity, C61303k kVar) {
        super(activity);
        this.f156542f = kVar;
        mo211607a(activity);
    }
}
