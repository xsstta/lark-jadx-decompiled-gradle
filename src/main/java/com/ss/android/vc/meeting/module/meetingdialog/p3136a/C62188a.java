package com.ss.android.vc.meeting.module.meetingdialog.p3136a;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.a.a */
public class C62188a extends AbstractView$OnAttachStateChangeListenerC61219a {

    /* renamed from: h */
    private int f156209h = -10;

    /* renamed from: i */
    private C62189b f156210i;

    /* renamed from: p */
    private void m242835p() {
    }

    /* renamed from: q */
    private void m242836q() {
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public void mo211671a(boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: k */
    public int mo211682k() {
        return 0;
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: i */
    public void mo211680i() {
        m242836q();
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m242835p();
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: j */
    public void mo211681j() {
        this.f156210i.mo215110b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C62189b mo215108o() {
        return new C62189b((FragmentActivity) this.f153318a, this.f153319b, this);
    }

    public C62188a(Activity activity) {
        super(activity, null);
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public View mo211669a(Activity activity) {
        C62189b o = mo215108o();
        this.f156210i = o;
        return o.mo215109a();
    }
}
