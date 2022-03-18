package com.ss.android.vc.meeting.module.meetingdialog.pstn;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.b */
public class C62397b extends AbstractView$OnAttachStateChangeListenerC61215b implements AbstractC10549e, PhoneInviteView.AbstractC62395a {

    /* renamed from: d */
    private PhoneInviteView f156945d;

    /* renamed from: e */
    private int f156946e = -1;

    /* renamed from: f */
    private int f156947f = -1;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.AbstractC62395a
    /* renamed from: k */
    public void mo215092k() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.AbstractC62395a
    /* renamed from: l */
    public void mo215727l() {
        dismiss();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        super.mo211643j();
        PhoneInviteView phoneInviteView = this.f156945d;
        if (phoneInviteView != null) {
            phoneInviteView.mo215717b();
        }
    }

    /* renamed from: m */
    private void m243866m() {
        if (bL_() != null) {
            this.f156946e = bL_().getWindow().getStatusBarColor();
            bM_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m243866m();
        this.f156947f = mo211639f();
        if (bL_() != null) {
            AbstractC10550f.AbstractC10551a.m43717b(bL_()).mo39924a(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        mo211637c(this.f156947f);
        if (bL_() != null) {
            AbstractC10550f.AbstractC10551a.m43717b(bL_()).mo39928b(this);
        } else {
            C60700b.m235864f("PhoneInviteDialog", "[beforeDialogDismiss]", "activity==null");
        }
        mo211633b(this.f156946e);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        PhoneInviteView phoneInviteView = new PhoneInviteView(activity);
        this.f156945d = phoneInviteView;
        phoneInviteView.mo215714a(this.f153299a);
        this.f156945d.setActionListener(this);
        return this.f156945d;
    }

    public C62397b(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        PhoneInviteView phoneInviteView = this.f156945d;
        if (phoneInviteView != null) {
            phoneInviteView.mo215713a(i, i2);
        }
    }
}
