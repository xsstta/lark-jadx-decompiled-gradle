package com.ss.android.vc.meeting.module.share.sharedialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.C62955c;
import com.ss.android.vc.meeting.module.share.VideoChatSharePresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\n\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/sharedialog/VideoChatShareDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "shareVideoChatData", "Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;", "isAuth", "", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;Z)V", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;)V", "mActivity", "mPresenter", "Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter;", "getMPresenter", "()Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter;", "setMPresenter", "(Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter;)V", "mRootView", "Landroid/view/View;", "getShareVideoChatData", "()Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;", "contentView", "onDialogDismiss", "", "show", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.d.a */
public final class VideoChatShareDesktopDialog extends MeetingBaseDesktopDialog {

    /* renamed from: a */
    public VideoChatSharePresenter f158629a;

    /* renamed from: b */
    private Activity f158630b;

    /* renamed from: c */
    private View f158631c;

    /* renamed from: d */
    private boolean f158632d;

    /* renamed from: e */
    private final C62955c f158633e;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        VideoChatSharePresenter gVar = this.f158629a;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        if (gVar != null) {
            gVar.mo217644i();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        Activity i = mo211718i();
        VideoChatShareDesktopDialog aVar = this;
        View view = this.f158631c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        VideoChatSharePresenter gVar = new VideoChatSharePresenter(i, aVar, view, mo211719j(), this.f158633e, false, this.f158632d, null, 160, null);
        this.f158629a = gVar;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        gVar.create();
        super.mo211606a();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        Activity i = mo211718i();
        this.f158630b = i;
        if (i == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        View inflate = LayoutInflater.from(i).inflate(R.layout.dialog_video_chat_share, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mAct…g_video_chat_share, null)");
        this.f158631c = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoChatShareDesktopDialog(Activity activity, C61303k kVar, C62955c cVar) {
        super(activity, kVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(cVar, "shareVideoChatData");
        this.f158633e = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoChatShareDesktopDialog(Activity activity, C61303k kVar, C62955c cVar, boolean z) {
        this(activity, kVar, cVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(cVar, "shareVideoChatData");
        this.f158632d = z;
    }
}
