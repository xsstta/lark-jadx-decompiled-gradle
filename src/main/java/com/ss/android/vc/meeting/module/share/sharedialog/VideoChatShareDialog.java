package com.ss.android.vc.meeting.module.share.sharedialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.C62955c;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.meeting.module.share.VideoChatSharePresenter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u0010J\b\u0010 \u001a\u00020!H\u0014J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001cH\u0014J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\nH\u0014J\b\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\nH\u0016J\u0006\u0010-\u001a\u00020!J\b\u0010.\u001a\u00020!H\u0002J\b\u0010/\u001a\u00020!H\u0016R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/sharedialog/VideoChatShareDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "shareVideoChatData", "Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;", "isRightInOutAnim", "", "isAuth", "selectedItems", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;ZZLjava/util/List;)V", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;Z)V", "()Z", "mActivity", "mPresenter", "Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter;", "getMPresenter", "()Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter;", "setMPresenter", "(Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter;)V", "mRootView", "Landroid/view/View;", "mStatusBarColor", "", "originSoftInputMode", "getShareVideoChatData", "()Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;", "beforeDialogDismiss", "", "couldDialogInterceptTouchEvent", "gravity", "y", "createContentView", "customDialogHeight", "isLandscape", "getContentAddedParams", "Landroid/widget/LinearLayout$LayoutParams;", "onDismiss", "onOrientationChanged", "isLanscape", "resetAll", "setStatusBarWhenShow", "show", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.d.b */
public final class VideoChatShareDialog extends AbstractView$OnAttachStateChangeListenerC61215b implements AbstractC61222a.AbstractC61223a {

    /* renamed from: d */
    public VideoChatSharePresenter f158634d;

    /* renamed from: e */
    private int f158635e;

    /* renamed from: f */
    private Activity f158636f;

    /* renamed from: g */
    private View f158637g;

    /* renamed from: h */
    private boolean f158638h;

    /* renamed from: i */
    private List<VideoChatShareItem> f158639i;

    /* renamed from: j */
    private int f158640j;

    /* renamed from: k */
    private final C62955c f158641k;

    /* renamed from: l */
    private final boolean f158642l;

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a.AbstractC61223a
    public void bY_() {
        mo215092k();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        mo215092k();
    }

    /* renamed from: l */
    private final void m246549l() {
        if (bL_() != null) {
            Activity bL_ = bL_();
            Intrinsics.checkExpressionValueIsNotNull(bL_, "activity");
            Window window = bL_.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            this.f158635e = window.getStatusBarColor();
            bM_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    public final void mo215092k() {
        mo211633b(this.f158635e);
        mo211637c(this.f158640j);
        VideoChatSharePresenter gVar = this.f158634d;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        if (gVar != null) {
            VideoChatSharePresenter gVar2 = this.f158634d;
            if (gVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            gVar2.mo217643h();
            VideoChatSharePresenter gVar3 = this.f158634d;
            if (gVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            gVar3.mo217644i();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        Activity bL_ = bL_();
        Intrinsics.checkExpressionValueIsNotNull(bL_, "activity");
        VideoChatShareDialog bVar = this;
        View view = this.f158637g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        C61303k kVar = this.f153299a;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
        VideoChatSharePresenter gVar = new VideoChatSharePresenter(bL_, bVar, view, kVar, this.f158641k, this.f158642l, this.f158638h, this.f158639i);
        this.f158634d = gVar;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        gVar.create();
        super.mo211606a();
        m246549l();
        mo211609a(this);
        this.f158640j = mo211639f();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
        VideoChatSharePresenter gVar = this.f158634d;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        gVar.mo217635a(mo211640g());
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f158636f = activity;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_video_chat_share, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mAct…g_video_chat_share, null)");
        this.f158637g = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoChatShareDialog(Activity activity, C61303k kVar, C62955c cVar, boolean z) {
        super(activity, kVar, z);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(cVar, "shareVideoChatData");
        this.f158641k = cVar;
        this.f158642l = z;
        this.f158635e = -1;
        this.f158640j = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoChatShareDialog(Activity activity, C61303k kVar, C62955c cVar, boolean z, boolean z2, List<VideoChatShareItem> list) {
        this(activity, kVar, cVar, z);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(cVar, "shareVideoChatData");
        this.f158638h = z2;
        this.f158639i = list;
    }
}
