package com.ss.android.vc.meeting.module.follow.share.desktop;

import android.app.Activity;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.share.IShareContentDialog;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.desktop.b */
public class C61830b extends AbstractView$OnAttachStateChangeListenerC61215b implements IShareContentDialog {

    /* renamed from: d */
    private ShareContentViewHolder f155201d;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        m241554k();
        super.mo211606a();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        super.dismiss();
        ShareContentViewHolder shareContentViewHolder = this.f155201d;
        if (shareContentViewHolder != null) {
            shareContentViewHolder.mo214182i();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    private void m241554k() {
        if (bL_() != null) {
            mo211630a(C60773o.m236126d(R.color.bg_float_base));
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.IShareContentDialog
    /* renamed from: d */
    public void mo214137d() {
        C60700b.m235843a("FollowLog_ShareContentDialog", "[changeViewToSearchFileMode]", "");
        mo211630a(C60773o.m236126d(R.color.bg_body));
        this.f155201d.mo214179f();
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.IShareContentDialog
    /* renamed from: e */
    public void mo214138e() {
        C60700b.m235843a("FollowLog_ShareContentDialog", "[changeViewExitSearchFileMode]", "");
        mo211630a(C60773o.m236126d(R.color.bg_float_base));
        this.f155201d.mo214180g();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        ShareContentViewHolder shareContentViewHolder = new ShareContentViewHolder();
        this.f155201d = shareContentViewHolder;
        return shareContentViewHolder.mo214173a(this.f153299a, activity, this);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
        C60700b.m235851b("FollowLog_ShareContentDialog", "[onOrientationChanged]", "isLandscape = " + z);
    }

    public C61830b(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
