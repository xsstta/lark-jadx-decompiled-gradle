package com.ss.android.vc.meeting.module.meetingdialog.sip;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.sip.b */
public class C62438b extends AbstractView$OnAttachStateChangeListenerC61215b implements AbstractC10549e, SIPInviteView.AbstractC62436a {

    /* renamed from: d */
    private SIPInviteView f157041d;

    /* renamed from: e */
    private int f157042e = -1;

    /* renamed from: f */
    private int f157043f = -1;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView.AbstractC62436a
    /* renamed from: k */
    public void mo215092k() {
        dismiss();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView.AbstractC62436a
    /* renamed from: l */
    public void mo215850l() {
        dismiss();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    public void bM_() {
        super.mo211630a(C60773o.m236126d(R.color.bg_base));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        super.mo211643j();
        SIPInviteView sIPInviteView = this.f157041d;
        if (sIPInviteView != null) {
            sIPInviteView.mo215836a();
        }
    }

    /* renamed from: m */
    private void m244010m() {
        if (bL_() != null) {
            this.f157042e = bL_().getWindow().getStatusBarColor();
            bM_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m244010m();
        this.f157043f = mo211639f();
        if (bL_() != null) {
            AbstractC10550f.AbstractC10551a.m43717b(bL_()).mo39924a(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        mo211637c(this.f157043f);
        if (bL_() != null) {
            AbstractC10550f.AbstractC10551a.m43717b(bL_()).mo39928b(this);
        } else {
            C60700b.m235864f("SIPInviteDialog", "[beforeDialogDismiss]", "activity==null");
        }
        mo211633b(this.f157042e);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        SIPInviteView sIPInviteView = new SIPInviteView(activity);
        this.f157041d = sIPInviteView;
        sIPInviteView.mo215838a(this.f153299a);
        this.f157041d.setActionListener(this);
        return this.f157041d;
    }

    public C62438b(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        SIPInviteView sIPInviteView = this.f157041d;
        if (sIPInviteView != null) {
            sIPInviteView.mo215837a(i, i2);
        }
    }
}
