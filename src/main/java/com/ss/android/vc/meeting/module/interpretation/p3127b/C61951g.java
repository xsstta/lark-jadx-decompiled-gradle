package com.ss.android.vc.meeting.module.interpretation.p3127b;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61976g;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.g */
public class C61951g extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    private View$OnClickListenerC61976g f155595d;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        this.f155595d.bY_();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        View$OnClickListenerC61976g gVar = new View$OnClickListenerC61976g(activity, this.f153299a, this, this.f153300b);
        this.f155595d = gVar;
        return gVar.mo214544c();
    }

    public C61951g(Activity activity, C61303k kVar, Boolean bool) {
        super(activity, kVar, bool, true);
    }
}
