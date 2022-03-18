package com.ss.android.vc.meeting.module.setting.settingdialog;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0014J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000eH\u0014J\b\u0010\u0018\u001a\u00020\fH\u0014J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/vc/meeting/module/setting/settingdialog/OtherSettingsDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "mHolder", "Lcom/ss/android/vc/meeting/module/setting/settingdialog/OtherSettingsViewHolder;", "mStatusBarColor", "", "beforeDialogDismiss", "", "couldDialogInterceptTouchEvent", "", "gravity", "y", "createContentView", "Landroid/view/View;", "customDialogHeight", "isLandscape", "getContentAddedParams", "Landroid/widget/LinearLayout$LayoutParams;", "isFullScreenMode", "onDialogDismiss", "onOrientationChanged", "show", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.o.a.k */
public final class OtherSettingsDialog extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    private int f157559d = -1;

    /* renamed from: e */
    private OtherSettingsViewHolder f157560e;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        mo211633b(this.f157559d);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        OtherSettingsViewHolder mVar = this.f157560e;
        if (mVar != null) {
            mVar.bY_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        if (bL_() != null) {
            Activity bL_ = bL_();
            Intrinsics.checkExpressionValueIsNotNull(bL_, "activity");
            Window window = bL_.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            this.f157559d = window.getStatusBarColor();
            mo211630a(C60773o.m236126d(R.color.bg_base));
            super.mo211606a();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        C61303k kVar = this.f153299a;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
        OtherSettingsViewHolder mVar = new OtherSettingsViewHolder(activity, kVar, this);
        this.f157560e = mVar;
        if (mVar != null) {
            return mVar.mo216361c();
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtherSettingsDialog(Activity activity, C61303k kVar) {
        super(activity, kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
