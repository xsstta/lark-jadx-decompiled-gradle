package com.ss.android.vc.meeting.module.joinmeetingauth;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0007H\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0014J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0012\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "initImmediately", "", "isFromParticipantManager", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;ZZ)V", "(Landroid/app/Activity;ZLcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "mStatusBarColor", "", "viewHolder", "Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingViewHolder;", "beforeDialogDismiss", "", "couldDialogInterceptTouchEvent", "gravity", "y", "createContentView", "Landroid/view/View;", "customDialogHeight", "isLandscape", "getContentAddedParams", "Landroid/widget/LinearLayout$LayoutParams;", "isFullScreenMode", "onDialogDismiss", "onOrientationChanged", "onViewAttachedToWindow", "v", "show", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.g.c */
public final class SecuritySettingDialog extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    public static final Companion f155353d = new Companion(null);

    /* renamed from: e */
    private SecuritySettingViewHolder f155354e;

    /* renamed from: f */
    private int f155355f;

    /* renamed from: g */
    private boolean f155356g;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingDialog$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        mo211633b(this.f155355f);
        SecuritySettingViewHolder gVar = this.f155354e;
        if (gVar != null) {
            gVar.mo214284d();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        super.mo211643j();
        SecuritySettingViewHolder gVar = this.f155354e;
        if (gVar != null) {
            gVar.mo214285e();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        if (bL_() != null) {
            Activity bL_ = bL_();
            Intrinsics.checkExpressionValueIsNotNull(bL_, "activity");
            Window window = bL_.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            this.f155355f = window.getStatusBarColor();
            mo211630a(C60773o.m236126d(R.color.bg_base));
            super.mo211606a();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        SecuritySettingViewHolder gVar = this.f155354e;
        if (gVar != null) {
            gVar.mo214287g();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        C61303k kVar = this.f153299a;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
        SecuritySettingViewHolder gVar = new SecuritySettingViewHolder(activity, kVar, this, this.f155356g);
        this.f155354e = gVar;
        if (gVar == null) {
            Intrinsics.throwNpe();
        }
        return gVar.mo214282a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecuritySettingDialog(Activity activity, boolean z, C61303k kVar) {
        super(activity, z, kVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f155355f = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SecuritySettingDialog(Activity activity, C61303k kVar, boolean z, boolean z2) {
        this(activity, z, kVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f155356g = z2;
        if (!z) {
            mo211628a(activity);
        }
    }
}
