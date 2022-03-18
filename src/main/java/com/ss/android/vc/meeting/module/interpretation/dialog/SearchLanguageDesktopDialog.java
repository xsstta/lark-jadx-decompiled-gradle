package com.ss.android.vc.meeting.module.interpretation.dialog;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61981i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/ss/android/vc/meeting/module/interpretation/dialog/SearchLanguageDesktopDialog;", "Lcom/ss/android/vc/meeting/module/interpretation/dialog/LanguageMeetingBaseDesktopDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "isLeftArrow", "", "toOpen", "maskLanguage", "", "Lcom/ss/android/vc/entity/LanguageType;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;ZZLjava/util/List;)V", "viewHolder", "Lcom/ss/android/vc/meeting/module/interpretation/SearchLanguageViewHolder;", "getViewHolder", "()Lcom/ss/android/vc/meeting/module/interpretation/SearchLanguageViewHolder;", "setViewHolder", "(Lcom/ss/android/vc/meeting/module/interpretation/SearchLanguageViewHolder;)V", "contentView", "Landroid/view/View;", "onDialogDismiss", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.j */
public final class SearchLanguageDesktopDialog extends LanguageMeetingBaseDesktopDialog {

    /* renamed from: a */
    private View$OnClickListenerC61981i f155604a;

    @Override // com.ss.android.vc.meeting.module.interpretation.dialog.LanguageMeetingBaseDesktopDialog
    /* renamed from: e */
    public void mo214492e() {
        View$OnClickListenerC61981i iVar = this.f155604a;
        if (iVar != null) {
            iVar.mo214559b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.dialog.LanguageMeetingBaseDesktopDialog
    /* renamed from: f */
    public View mo214493f() {
        View$OnClickListenerC61981i iVar = new View$OnClickListenerC61981i(mo214494g(), mo214495h(), this, Boolean.valueOf(mo214496i()), Boolean.valueOf(mo214497j()), mo214498k());
        this.f155604a = iVar;
        if (iVar != null) {
            return iVar.mo214557a((Boolean) true);
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchLanguageDesktopDialog(Activity activity, C61303k kVar, boolean z, boolean z2, List<? extends LanguageType> list) {
        super(activity, kVar, z, z2, list);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(list, "maskLanguage");
    }
}
