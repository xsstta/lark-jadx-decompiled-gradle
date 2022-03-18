package com.ss.android.vc.meeting.module.sharebox;

import android.app.Activity;
import android.view.View;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareContentDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalShareContentDialog;", "activity", "Landroid/app/Activity;", ShareHitPoint.f121868c, "", "view", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "getSource", "()Ljava/lang/String;", "getView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "viewHolder", "Lcom/ss/android/vc/meeting/module/sharebox/LocalShareContentViewHolder;", "changeViewExitSearchFileMode", "", "changeViewToSearchFileMode", "contentView", "Landroid/view/View;", "onDialogDismiss", "setFollowEnable", "enable", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.e */
public final class LocalShareContentDesktopDialog extends MeetingBaseDesktopDialog implements ILocalShareContentDialog {

    /* renamed from: a */
    public static final Companion f158835a = new Companion(null);

    /* renamed from: b */
    private LocalShareContentViewHolder f158836b;

    /* renamed from: c */
    private final String f158837c;

    /* renamed from: d */
    private final ILocalSharePrepareContract.IView f158838d;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareContentDesktopDialog$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.IShareContentDialog
    /* renamed from: d */
    public void mo214137d() {
        C60700b.m235843a("LocalShareContentDesktopDialog@", "[changeViewToSearchFileMode]", "");
        LocalShareContentViewHolder hVar = this.f158836b;
        if (hVar != null) {
            hVar.mo214179f();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.IShareContentDialog
    /* renamed from: e */
    public void mo214138e() {
        C60700b.m235843a("LocalShareContentDesktopDialog@", "[changeViewExitSearchFileMode]", "");
        LocalShareContentViewHolder hVar = this.f158836b;
        if (hVar != null) {
            hVar.mo214180g();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        LocalShareContentViewHolder hVar = new LocalShareContentViewHolder(this.f158838d);
        this.f158836b = hVar;
        if (hVar != null) {
            return hVar.mo214173a(null, mo211718i(), this);
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalShareContentDialog
    /* renamed from: a */
    public void mo217763a(boolean z) {
        LocalShareContentViewHolder hVar = this.f158836b;
        if (hVar != null) {
            hVar.mo217829a(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalShareContentDesktopDialog(Activity activity, String str, ILocalSharePrepareContract.IView bVar) {
        super(activity, new C61303k(new VideoChat()), false);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f158837c = str;
        this.f158838d = bVar;
        bK_();
    }
}
