package com.ss.android.vc.meeting.module.setting.settingdialog;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/meeting/module/setting/settingdialog/HostAdvancedOptionsDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "viewHolder", "Lcom/ss/android/vc/meeting/module/setting/settingdialog/HostAdvancedOptionsViewHolder;", "getViewHolder", "()Lcom/ss/android/vc/meeting/module/setting/settingdialog/HostAdvancedOptionsViewHolder;", "setViewHolder", "(Lcom/ss/android/vc/meeting/module/setting/settingdialog/HostAdvancedOptionsViewHolder;)V", "contentView", "Landroid/view/View;", "onDialogDismiss", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.o.a.c */
public final class HostAdvancedOptionsDesktopDialog extends MeetingBaseDesktopDialog implements AbstractC61222a {

    /* renamed from: a */
    private HostAdvancedOptionsViewHolder f157477a;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        HostAdvancedOptionsViewHolder fVar = this.f157477a;
        if (fVar != null) {
            fVar.bY_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        HostAdvancedOptionsViewHolder fVar = new HostAdvancedOptionsViewHolder(mo211718i(), mo211719j(), this);
        this.f157477a = fVar;
        if (fVar != null) {
            return fVar.mo216331d();
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HostAdvancedOptionsDesktopDialog(Activity activity, C61303k kVar) {
        super(activity, kVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
