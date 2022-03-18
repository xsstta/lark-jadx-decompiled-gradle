package com.ss.android.vc.meeting.module.meetingdialog.search;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/search/SearchUserInvitingDialog;", "Lcom/ss/android/vc/meeting/basedialog/HalfScreen/MeetingHalfScreenDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "item", "Lcom/ss/android/vc/dto/SearchParticipantInfo;", "clickAction", "Lcom/ss/android/vc/meeting/module/meetingdialog/search/ISearchUserClickAction;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/dto/SearchParticipantInfo;Lcom/ss/android/vc/meeting/module/meetingdialog/search/ISearchUserClickAction;)V", "viewHolder", "Lcom/ss/android/vc/meeting/module/meetingdialog/search/SearchUserInvitingViewHolder;", "createContentView", "Landroid/view/View;", "getDialogHorizontalMargin", "", "onOrientationChanged", "", "isLandscape", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.c.e */
public final class SearchUserInvitingDialog extends AbstractView$OnAttachStateChangeListenerC61219a {

    /* renamed from: h */
    private SearchUserInvitingViewHolder f156264h;

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public void mo211671a(boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: k */
    public int mo211682k() {
        return 0;
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public View mo211669a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        C61303k kVar = this.f153319b;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
        SearchUserInvitingViewHolder fVar = new SearchUserInvitingViewHolder(activity, kVar, this);
        this.f156264h = fVar;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        return fVar.mo215144b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchUserInvitingDialog(Activity activity, C61303k kVar, SearchParticipantInfo searchParticipantInfo, AbstractC62201a aVar) {
        super(activity, kVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        SearchUserInvitingViewHolder fVar = this.f156264h;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        fVar.mo215143a(searchParticipantInfo, aVar);
    }
}
