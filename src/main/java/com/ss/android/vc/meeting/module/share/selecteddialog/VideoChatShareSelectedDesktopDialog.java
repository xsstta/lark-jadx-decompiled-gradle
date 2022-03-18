package com.ss.android.vc.meeting.module.share.selecteddialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.meeting.module.share.selected.VideoChatShareSelectedPresenter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\n\u0010!\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selecteddialog/VideoChatShareSelectedDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "mSelectedData", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "mSelectedFromInvite", "", "mSelectedGroupCount", "", "mOnSaveListener", "Lcom/ss/android/vc/meeting/module/share/selecteddialog/OnSaveListener;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Ljava/util/ArrayList;ZILcom/ss/android/vc/meeting/module/share/selecteddialog/OnSaveListener;)V", "getMOnSaveListener", "()Lcom/ss/android/vc/meeting/module/share/selecteddialog/OnSaveListener;", "mPresenter", "Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter;", "getMPresenter", "()Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter;", "setMPresenter", "(Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter;)V", "mRootView", "Landroid/view/View;", "getMSelectedData", "()Ljava/util/ArrayList;", "getMSelectedFromInvite", "()Z", "getMSelectedGroupCount", "()I", "contentView", "onDialogDismiss", "", "show", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.b.b */
public final class VideoChatShareSelectedDesktopDialog extends MeetingBaseDesktopDialog {

    /* renamed from: a */
    public VideoChatShareSelectedPresenter f158601a;

    /* renamed from: b */
    private View f158602b;

    /* renamed from: c */
    private final ArrayList<VideoChatShareItem> f158603c;

    /* renamed from: d */
    private final boolean f158604d;

    /* renamed from: e */
    private final int f158605e;

    /* renamed from: f */
    private final OnSaveListener f158606f;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        VideoChatShareSelectedDesktopDialog bVar = this;
        View view = this.f158602b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        VideoChatShareSelectedPresenter fVar = new VideoChatShareSelectedPresenter(bVar, view, this.f158603c, this.f158604d, this.f158605e, this.f158606f);
        this.f158601a = fVar;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        fVar.create();
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        View inflate = LayoutInflater.from(mo211718i()).inflate(R.layout.dialog_video_chat_share_selected, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(acti…hat_share_selected, null)");
        this.f158602b = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoChatShareSelectedDesktopDialog(Activity activity, C61303k kVar, ArrayList<VideoChatShareItem> arrayList, boolean z, int i, OnSaveListener aVar) {
        super(activity, kVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(arrayList, "mSelectedData");
        Intrinsics.checkParameterIsNotNull(aVar, "mOnSaveListener");
        this.f158603c = arrayList;
        this.f158604d = z;
        this.f158605e = i;
        this.f158606f = aVar;
    }
}
