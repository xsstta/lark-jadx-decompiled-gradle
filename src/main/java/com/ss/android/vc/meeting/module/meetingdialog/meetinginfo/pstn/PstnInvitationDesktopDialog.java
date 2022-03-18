package com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn;

import android.app.Activity;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/PstnInvitationDesktopDialog;", "Lcom/ss/android/vc/meeting/drawerdialog/MeetingDrawerDialog;", "activity", "Landroid/app/Activity;", "meetingNumber", "", "adminSettings", "Lcom/ss/android/vc/entity/AdminSettings;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/vc/entity/AdminSettings;)V", "getAdminSettings", "()Lcom/ss/android/vc/entity/AdminSettings;", "getMeetingNumber", "()Ljava/lang/String;", "viewHolder", "Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/MeetingPstnInvitationViewHolder;", "createContentView", "Landroid/view/View;", "headerTitle", "onDialogDismiss", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.d */
public final class PstnInvitationDesktopDialog extends MeetingDrawerDialog {

    /* renamed from: e */
    private MeetingPstnInvitationViewHolder f156600e;

    /* renamed from: f */
    private final String f156601f;

    /* renamed from: g */
    private final AdminSettings f156602g;

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog
    /* renamed from: d */
    public void mo211615d() {
    }

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog
    /* renamed from: e */
    public String mo211617e() {
        String string = UIHelper.getString(R.string.View_M_DialIn);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(string.View_M_DialIn)");
        return string;
    }

    @Override // com.ss.android.vc.meeting.drawerdialog.MeetingDrawerDialog
    /* renamed from: b */
    public View mo211611b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        MeetingPstnInvitationViewHolder cVar = new MeetingPstnInvitationViewHolder(activity, null, this, null, this.f156601f, this.f156602g);
        this.f156600e = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        return cVar.mo215496b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PstnInvitationDesktopDialog(Activity activity, String str, AdminSettings adminSettings) {
        super(activity);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f156601f = str;
        this.f156602g = adminSettings;
        mo211607a(activity);
    }
}
