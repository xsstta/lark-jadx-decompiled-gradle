package com.ss.android.vc.meeting.module.share.selecteddialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.meeting.module.share.selected.VideoChatShareSelectedPresenter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0002\u0010\u0012J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\rH\u0014J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u000bH\u0014J\b\u0010+\u001a\u00020,H\u0014J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0006\u00100\u001a\u00020.J\u0006\u00101\u001a\u00020.J\b\u00102\u001a\u00020.H\u0016R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selecteddialog/VideoChatShareSelectedDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "mSelectedData", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "mSelectedFromInvite", "", "mSelectedGroupCount", "", "mOnSaveListener", "Lcom/ss/android/vc/meeting/module/share/selecteddialog/OnSaveListener;", "isRightInOutAnim", "isAuth", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Ljava/util/ArrayList;ZILcom/ss/android/vc/meeting/module/share/selecteddialog/OnSaveListener;ZZ)V", "()Z", "mActivity", "getMOnSaveListener", "()Lcom/ss/android/vc/meeting/module/share/selecteddialog/OnSaveListener;", "mPresenter", "Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter;", "getMPresenter", "()Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter;", "setMPresenter", "(Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter;)V", "mRootView", "Landroid/view/View;", "getMSelectedData", "()Ljava/util/ArrayList;", "getMSelectedFromInvite", "getMSelectedGroupCount", "()I", "mStatusBarColor", "couldDialogInterceptTouchEvent", "gravity", "y", "createContentView", "customDialogHeight", "isLandscape", "getContentAddedParams", "Landroid/widget/LinearLayout$LayoutParams;", "onOrientationChanged", "", "islandscape", "resetStatusBarWhenDismiss", "setStatusBarWhenShow", "show", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.b.c */
public final class VideoChatShareSelectedDialog extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    public VideoChatShareSelectedPresenter f158607d;

    /* renamed from: e */
    private int f158608e = -1;

    /* renamed from: f */
    private Activity f158609f;

    /* renamed from: g */
    private View f158610g;

    /* renamed from: h */
    private final ArrayList<VideoChatShareItem> f158611h;

    /* renamed from: i */
    private final boolean f158612i;

    /* renamed from: j */
    private final int f158613j;

    /* renamed from: k */
    private final OnSaveListener f158614k;

    /* renamed from: l */
    private final boolean f158615l;

    /* renamed from: m */
    private final boolean f158616m;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        VideoChatShareSelectedDialog cVar = this;
        View view = this.f158610g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        VideoChatShareSelectedPresenter fVar = new VideoChatShareSelectedPresenter(cVar, view, this.f158611h, this.f158612i, this.f158613j, this.f158614k);
        this.f158607d = fVar;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        fVar.create();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f158609f = activity;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_video_chat_share_selected, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mAct…hat_share_selected, null)");
        this.f158610g = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoChatShareSelectedDialog(Activity activity, C61303k kVar, ArrayList<VideoChatShareItem> arrayList, boolean z, int i, OnSaveListener aVar, boolean z2, boolean z3) {
        super(activity, kVar, z2);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(arrayList, "mSelectedData");
        Intrinsics.checkParameterIsNotNull(aVar, "mOnSaveListener");
        this.f158611h = arrayList;
        this.f158612i = z;
        this.f158613j = i;
        this.f158614k = aVar;
        this.f158615l = z2;
        this.f158616m = z3;
    }
}
