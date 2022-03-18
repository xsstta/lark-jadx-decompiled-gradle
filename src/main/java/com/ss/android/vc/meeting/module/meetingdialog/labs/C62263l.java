package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.app.Activity;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.l */
public class C62263l extends AbstractView$OnAttachStateChangeListenerC61215b implements AbstractC62216c.AbstractC62218b.AbstractC62219a {

    /* renamed from: d */
    protected LabsView f156432d;

    /* renamed from: e */
    private int f156433e = -1;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62218b.AbstractC62219a
    public void bN_() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        mo215417m();
    }

    /* renamed from: l */
    public void mo215358l() {
        LabsView labsView = this.f156432d;
        if (labsView != null) {
            labsView.mo215224p();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        t_(true);
        mo211633b(this.f156433e);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        super.mo211643j();
        LabsView labsView = this.f156432d;
        if (labsView != null) {
            labsView.mo215220m();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    public void mo215092k() {
        LabsView labsView = this.f156432d;
        if (labsView != null) {
            labsView.mo215202a(this.f153299a, bL_());
        }
        mo211606a();
    }

    /* renamed from: m */
    private void mo215417m() {
        if (bL_() != null) {
            this.f156433e = bL_().getWindow().getStatusBarColor();
            mo211630a(C60773o.m236126d(R.color.transparent));
            t_(false);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
        this.f156432d.mo215207a(z, true);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        LabsView labsView = new LabsView(activity);
        this.f156432d = labsView;
        labsView.setActionListener(this);
        this.f156432d.mo215201a(this.f153299a);
        return this.f156432d;
    }

    public C62263l(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
