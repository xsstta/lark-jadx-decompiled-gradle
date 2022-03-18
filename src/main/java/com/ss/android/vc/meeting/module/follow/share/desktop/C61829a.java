package com.ss.android.vc.meeting.module.follow.share.desktop;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.share.IShareContentDialog;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.desktop.a */
public class C61829a extends MeetingBaseDesktopDialog implements IShareContentDialog {

    /* renamed from: a */
    ShareContentViewHolder f155200a;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.IShareContentDialog
    /* renamed from: d */
    public void mo214137d() {
        this.f155200a.mo214179f();
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.IShareContentDialog
    /* renamed from: e */
    public void mo214138e() {
        this.f155200a.mo214180g();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        super.dismiss();
        ShareContentViewHolder shareContentViewHolder = this.f155200a;
        if (shareContentViewHolder != null) {
            shareContentViewHolder.mo214182i();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        ShareContentViewHolder shareContentViewHolder = new ShareContentViewHolder();
        this.f155200a = shareContentViewHolder;
        return shareContentViewHolder.mo214173a(mo211719j(), mo211718i(), this);
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: f */
    public void mo211715f() {
        if (bJ_() != null && bJ_().getWindow() != null) {
            Window window = bJ_().getWindow();
            window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = UIHelper.dp2px(640.0f);
            attributes.width = UIHelper.dp2px(540.0f);
            window.setAttributes(attributes);
        }
    }

    public C61829a(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }
}
