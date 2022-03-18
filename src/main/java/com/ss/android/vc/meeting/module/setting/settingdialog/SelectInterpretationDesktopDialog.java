package com.ss.android.vc.meeting.module.setting.settingdialog;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/setting/settingdialog/SelectInterpretationDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "viewHolder", "Lcom/ss/android/vc/meeting/module/setting/settingdialog/SelectInterpretationViewHolder;", "contentView", "Landroid/view/View;", "onDialogDismiss", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.o.a.n */
public final class SelectInterpretationDesktopDialog extends MeetingBaseDesktopDialog {

    /* renamed from: a */
    private SelectInterpretationViewHolder f157579a;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        SelectInterpretationViewHolder pVar = this.f157579a;
        if (pVar != null) {
            pVar.bY_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        Activity i = mo211718i();
        if (i == null) {
            Intrinsics.throwNpe();
        }
        SelectInterpretationViewHolder pVar = new SelectInterpretationViewHolder(i, mo211719j(), this);
        this.f157579a = pVar;
        if (pVar == null) {
            Intrinsics.throwNpe();
        }
        return pVar.mo216368c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectInterpretationDesktopDialog(Activity activity, C61303k kVar) {
        super(activity, kVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
