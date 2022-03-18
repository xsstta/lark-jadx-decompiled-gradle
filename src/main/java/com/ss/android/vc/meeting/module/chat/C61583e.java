package com.ss.android.vc.meeting.module.chat;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.chat.e */
public class C61583e extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    private C61586h f154496d;

    /* renamed from: e */
    private int f154497e = -1;

    /* renamed from: f */
    private int f154498f = -1;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: h */
    public boolean mo211641h() {
        this.f154496d.mo213431b();
        return false;
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        m240409k();
        this.f154498f = mo211639f();
        super.mo211606a();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    private void m240409k() {
        if (bL_() != null) {
            this.f154497e = bL_().getWindow().getStatusBarColor();
            bM_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        this.f153299a.mo212105W().mo212840s().mo213372b(this.f154496d);
        this.f154496d.mo213432c();
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        C61586h hVar = this.f154496d;
        if (hVar != null) {
            hVar.mo213427a();
        }
        mo211633b(this.f154497e);
        mo211637c(this.f154498f);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: f */
    public int mo211639f() {
        if (bL_() == null || bL_().getWindow() == null) {
            return 0;
        }
        int i = bL_().getWindow().getAttributes().softInputMode;
        bL_().getWindow().setSoftInputMode(19);
        return i;
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        C61586h hVar = new C61586h();
        this.f154496d = hVar;
        return hVar.mo213426a(activity, this.f153299a, this);
    }

    public C61583e(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
