package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.n */
public class C62377n extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    private View$OnClickListenerC62379p f156854d;

    /* renamed from: e */
    private int f156855e;

    /* renamed from: f */
    private int f156856f = -1;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    public View$OnClickListenerC62379p mo215092k() {
        return this.f156854d;
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        this.f156854d.mo215669b();
    }

    /* renamed from: n */
    private boolean m243751n() {
        return this.f153299a.mo212091I().mo212490a().mo212476h();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m243750m();
        m243749l();
        this.f156856f = mo211639f();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        mo211633b(this.f156855e);
        mo211637c(this.f156856f);
    }

    /* renamed from: l */
    private void m243749l() {
        if (bL_() != null) {
            this.f156855e = bL_().getWindow().getStatusBarColor();
            bM_();
        }
    }

    /* renamed from: m */
    private void m243750m() {
        if (m243751n()) {
            this.f153299a.mo212114a((Boolean) false, (Boolean) false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: h */
    public boolean mo211641h() {
        if (this.f156854d.f156874r || this.f156854d.f156867k.getVisibility() != 0) {
            return false;
        }
        this.f156854d.f156873q.mo217407b();
        return true;
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        View$OnClickListenerC62379p pVar = new View$OnClickListenerC62379p((FragmentActivity) activity, this.f153299a, this);
        this.f156854d = pVar;
        return pVar.mo215670c();
    }

    public C62377n(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
