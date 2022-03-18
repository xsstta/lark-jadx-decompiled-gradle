package com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.C63529q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u000fH\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/MeetingPstnInvitationDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "context", "Landroid/app/Activity;", "mMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "meetingNumber", "", "adminSettings", "Lcom/ss/android/vc/entity/AdminSettings;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Ljava/lang/String;Lcom/ss/android/vc/entity/AdminSettings;)V", "getAdminSettings", "()Lcom/ss/android/vc/entity/AdminSettings;", "beforeDialogDismissCallback", "Lkotlin/Function0;", "", "getBeforeDialogDismissCallback", "()Lkotlin/jvm/functions/Function0;", "setBeforeDialogDismissCallback", "(Lkotlin/jvm/functions/Function0;)V", "mStatusBarColor", "", "getMeetingNumber", "()Ljava/lang/String;", "viewHolder", "Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/MeetingPstnInvitationViewHolder;", "beforeDialogDismiss", "createContentView", "Landroid/view/View;", "activity", "onOrientationChanged", "isLandscape", "", "setStatusBarWhenShow", "show", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.b */
public final class MeetingPstnInvitationDialog extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    public MeetingPstnInvitationViewHolder f156577d;

    /* renamed from: e */
    private int f156578e;

    /* renamed from: f */
    private Function0<Unit> f156579f;

    /* renamed from: g */
    private final String f156580g;

    /* renamed from: h */
    private final AdminSettings f156581h;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m243422k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/MeetingPstnInvitationDialog$createContentView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.b$a */
    static final class C62313a extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingPstnInvitationDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62313a(MeetingPstnInvitationDialog bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        mo211633b(this.f156578e);
        Function0<Unit> function0 = this.f156579f;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    private final void m243422k() {
        if (bL_() != null) {
            Activity bL_ = bL_();
            Intrinsics.checkExpressionValueIsNotNull(bL_, "activity");
            Window window = bL_.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            this.f156578e = window.getStatusBarColor();
            bM_();
        }
    }

    /* renamed from: a */
    public final void mo215491a(Function0<Unit> function0) {
        this.f156579f = function0;
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
        if (this.f156577d != null) {
            MeetingPstnInvitationViewHolder cVar = this.f156577d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            cVar.mo215495a(z);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        MeetingPstnInvitationViewHolder cVar = new MeetingPstnInvitationViewHolder(activity, this.f153299a, null, null, this.f156580g, this.f156581h);
        this.f156577d = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        View b = cVar.mo215496b();
        MeetingPstnInvitationViewHolder cVar2 = this.f156577d;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        C63529q.m248970a(cVar2.mo215492a(), new C62313a(this));
        return b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingPstnInvitationDialog(Activity activity, C61303k kVar, String str, AdminSettings adminSettings) {
        super(activity, false, kVar);
        Intrinsics.checkParameterIsNotNull(activity, "context");
        this.f156580g = str;
        this.f156581h = adminSettings;
    }
}
