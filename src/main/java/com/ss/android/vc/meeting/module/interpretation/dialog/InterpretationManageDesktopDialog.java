package com.ss.android.vc.meeting.module.interpretation.dialog;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61963e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/meeting/module/interpretation/dialog/InterpretationManageDesktopDialog;", "Lcom/ss/android/vc/meeting/module/interpretation/dialog/InterpretationMeetingBaseDesktopDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "toOpen", "", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Z)V", "viewHolder", "Lcom/ss/android/vc/meeting/module/interpretation/InterpretationManageViewHolder;", "getViewHolder", "()Lcom/ss/android/vc/meeting/module/interpretation/InterpretationManageViewHolder;", "setViewHolder", "(Lcom/ss/android/vc/meeting/module/interpretation/InterpretationManageViewHolder;)V", "contentView", "Landroid/view/View;", "onDialogDismiss", "", "setParentDialog", "parentDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.b */
public final class InterpretationManageDesktopDialog extends InterpretationMeetingBaseDesktopDialog {

    /* renamed from: a */
    private View$OnClickListenerC61963e f155584a;

    @Override // com.ss.android.vc.meeting.module.interpretation.dialog.InterpretationMeetingBaseDesktopDialog
    /* renamed from: c */
    public void mo214481c() {
        View$OnClickListenerC61963e eVar = this.f155584a;
        if (eVar != null) {
            eVar.mo214520b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.dialog.InterpretationMeetingBaseDesktopDialog
    /* renamed from: d */
    public View mo214482d() {
        View$OnClickListenerC61963e eVar = new View$OnClickListenerC61963e(mo214486g(), mo214487h(), this, Boolean.valueOf(mo214488i()));
        this.f155584a = eVar;
        if (eVar != null) {
            return eVar.mo214521c();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo214480a(AbstractC61222a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "parentDialog");
        View$OnClickListenerC61963e eVar = this.f155584a;
        if (eVar != null) {
            eVar.mo214517a(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterpretationManageDesktopDialog(Activity activity, C61303k kVar, boolean z) {
        super(activity, kVar, z);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
