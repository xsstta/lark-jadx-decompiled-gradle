package com.ss.android.vc.meeting.module.searchInvite.addcontact;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ss/android/vc/meeting/module/searchInvite/addcontact/AddContactDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "userId", "", "userName", "mActivity", "Landroid/app/Activity;", "mMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "addContactViewHolder", "Lcom/ss/android/vc/meeting/module/searchInvite/addcontact/AddContactViewHolder;", "getMActivity", "()Landroid/app/Activity;", "getMMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "mStatusBarColor", "", "originSoftInputMode", "getUserId", "()Ljava/lang/String;", "getUserName", "beforeDialogDismiss", "", "createContentView", "Landroid/view/View;", "activity", "onOrientationChanged", "isLandscape", "", "setStatusBarWhenShow", "show", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.searchInvite.addcontact.a */
public final class AddContactDialog extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    private AddContactViewHolder f158468d;

    /* renamed from: e */
    private int f158469e;

    /* renamed from: f */
    private int f158470f = -1;

    /* renamed from: g */
    private final String f158471g;

    /* renamed from: h */
    private final String f158472h;

    /* renamed from: i */
    private final Activity f158473i;

    /* renamed from: j */
    private final C61303k f158474j;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m246340k();
        this.f158470f = mo211639f();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        mo211633b(this.f158469e);
        mo211637c(this.f158470f);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    private final void m246340k() {
        if (bL_() != null) {
            Activity bL_ = bL_();
            Intrinsics.checkExpressionValueIsNotNull(bL_, "activity");
            Window window = bL_.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            this.f158469e = window.getStatusBarColor();
            bM_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        C60700b.m235864f("AddContactDialog", "[createContentView]", String.valueOf(this.f158471g));
        if (this.f158468d == null) {
            C61303k kVar = this.f153299a;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            this.f158468d = new AddContactViewHolder(activity, kVar, this);
        }
        AddContactViewHolder bVar = this.f158468d;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        return bVar.mo217415b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddContactDialog(String str, String str2, Activity activity, C61303k kVar) {
        super(activity, kVar);
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "userName");
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(kVar, "mMeeting");
        this.f158471g = str;
        this.f158472h = str2;
        this.f158473i = activity;
        this.f158474j = kVar;
        C60700b.m235864f("AddContactDialog", "[init]", "AddContactDialog init userId: " + str);
        AddContactViewHolder bVar = this.f158468d;
        if (bVar != null) {
            bVar.mo217414a(str);
        }
    }
}
