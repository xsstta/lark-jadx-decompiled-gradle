package com.ss.android.vc.meeting.module.meetingdialog.search;

import android.app.Activity;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62341i;
import com.ss.android.vc.meeting.module.searchInvite.C62927f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/search/SearchUserInMeetingDialog;", "Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ParticipantControlDialog;", "activity", "Landroid/app/Activity;", "participant", "Lcom/ss/android/vc/entity/Participant;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "clickAction", "Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/IParticipantClickAction;", "mCallback", "Lcom/ss/android/vc/meeting/module/searchInvite/VCInviteView$ISearchViewInteractCallback;", "(Landroid/app/Activity;Lcom/ss/android/vc/entity/Participant;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/IParticipantClickAction;Lcom/ss/android/vc/meeting/module/searchInvite/VCInviteView$ISearchViewInteractCallback;)V", "beforeDialogDismiss", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.c.d */
public final class SearchUserInMeetingDialog extends C62341i {

    /* renamed from: j */
    private final C62927f.AbstractC62932a f156263j;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62341i
    /* renamed from: i */
    public void mo211680i() {
        super.mo211680i();
        this.f156263j.mo217444b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchUserInMeetingDialog(Activity activity, Participant participant, C61303k kVar, AbstractC62329f fVar, C62927f.AbstractC62932a aVar) {
        super(activity, participant, kVar, fVar, true);
        Intrinsics.checkParameterIsNotNull(participant, "participant");
        Intrinsics.checkParameterIsNotNull(aVar, "mCallback");
        this.f156263j = aVar;
    }
}
