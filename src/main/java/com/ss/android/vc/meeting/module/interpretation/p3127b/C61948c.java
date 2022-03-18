package com.ss.android.vc.meeting.module.interpretation.p3127b;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61963e;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.c */
public class C61948c extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    private View$OnClickListenerC61963e f155585d;

    /* renamed from: e */
    private int f155586e;

    /* renamed from: f */
    private int f155587f = -1;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        this.f155585d.mo214520b();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m242012k();
        this.f155587f = mo211639f();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        mo211633b(this.f155586e);
        mo211637c(this.f155587f);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    private void m242012k() {
        if (bL_() != null) {
            this.f155586e = bL_().getWindow().getStatusBarColor();
            bM_();
        }
    }

    /* renamed from: a */
    public void mo214483a(AbstractC61222a aVar) {
        View$OnClickListenerC61963e eVar = this.f155585d;
        if (eVar != null) {
            eVar.mo214517a(aVar);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        View$OnClickListenerC61963e eVar = new View$OnClickListenerC61963e(activity, this.f153299a, this, this.f153300b);
        this.f155585d = eVar;
        return eVar.mo214521c();
    }

    public C61948c(Activity activity, C61303k kVar, Boolean bool, boolean z) {
        super(activity, kVar, bool, z);
    }
}
