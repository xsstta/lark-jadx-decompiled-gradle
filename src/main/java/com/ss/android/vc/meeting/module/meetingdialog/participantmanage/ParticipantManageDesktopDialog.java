package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ParticipantManageDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "viewHolder", "Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ParticipantManageViewHolder;", "getViewHolder", "()Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ParticipantManageViewHolder;", "setViewHolder", "(Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ParticipantManageViewHolder;)V", "contentView", "Landroid/view/View;", "onDialogDismiss", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.m */
public final class ParticipantManageDesktopDialog extends MeetingBaseDesktopDialog {

    /* renamed from: a */
    private View$OnClickListenerC62379p f156853a;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        View$OnClickListenerC62379p pVar = this.f156853a;
        if (pVar != null) {
            pVar.mo215669b();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        Activity i = mo211718i();
        if (i != null) {
            View$OnClickListenerC62379p pVar = new View$OnClickListenerC62379p((FragmentActivity) i, mo211719j(), this);
            this.f156853a = pVar;
            if (pVar != null) {
                return pVar.mo215670c();
            }
            return null;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParticipantManageDesktopDialog(Activity activity, C61303k kVar) {
        super(activity, kVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
