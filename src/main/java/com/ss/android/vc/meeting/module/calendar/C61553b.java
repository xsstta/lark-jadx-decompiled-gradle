package com.ss.android.vc.meeting.module.calendar;

import android.app.Activity;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.event.C63742at;

/* renamed from: com.ss.android.vc.meeting.module.calendar.b */
public class C61553b extends MeetingDrawerDialog {

    /* renamed from: e */
    View$OnClickListenerC61555d f154404e;

    /* renamed from: f */
    C61303k f154405f;

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog
    /* renamed from: d */
    public void mo211615d() {
        this.f154404e.mo213339b();
    }

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog
    /* renamed from: e */
    public String mo211617e() {
        return UIHelper.getString(R.string.View_M_Event);
    }

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        C61303k kVar = this.f154405f;
        if (kVar != null) {
            C63742at.m250114u(kVar.mo212056e());
        }
    }

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog
    /* renamed from: b */
    public View mo211611b(Activity activity) {
        View$OnClickListenerC61555d dVar = new View$OnClickListenerC61555d();
        this.f154404e = dVar;
        return dVar.mo213334a(this.f154405f, activity, this, this);
    }

    public C61553b(Activity activity, C61303k kVar) {
        super(activity);
        this.f154405f = kVar;
        mo211607a(activity);
    }
}
