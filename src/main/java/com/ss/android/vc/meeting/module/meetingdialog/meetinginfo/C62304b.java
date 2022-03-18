package com.ss.android.vc.meeting.module.meetingdialog.meetinginfo;

import android.app.Activity;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.event.C63742at;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.b */
public class C62304b extends AbstractView$OnAttachStateChangeListenerC61219a {

    /* renamed from: h */
    C62305c f156543h;

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public void mo211671a(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        this.f153319b.ah().mo219486c();
        super.dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        mo211670a(R.color.ud_N00);
        if (this.f153319b != null) {
            C63742at.m250114u(this.f153319b.mo212056e());
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public View mo211669a(Activity activity) {
        C62305c cVar = new C62305c();
        this.f156543h = cVar;
        return cVar.mo215473a(mo211675d(), mo211677f(), this, null);
    }

    public C62304b(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
