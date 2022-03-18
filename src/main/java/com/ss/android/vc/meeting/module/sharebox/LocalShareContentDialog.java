package com.ss.android.vc.meeting.module.sharebox;

import android.app.Activity;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareContentDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalShareContentDialog;", "activity", "Landroid/app/Activity;", ShareHitPoint.f121868c, "", "view", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "getSource", "()Ljava/lang/String;", "getView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "viewHolder", "Lcom/ss/android/vc/meeting/module/sharebox/LocalShareContentViewHolder;", "changeViewExitSearchFileMode", "", "changeViewToSearchFileMode", "createContentView", "Landroid/view/View;", "onBackPressed", "", "onOrientationChanged", "isLandscape", "setFollowEnable", "enable", "setStatusBarWhenShow", "show", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.f */
public final class LocalShareContentDialog extends AbstractView$OnAttachStateChangeListenerC61215b implements ILocalShareContentDialog {

    /* renamed from: d */
    public static final Companion f158839d = new Companion(null);

    /* renamed from: e */
    private LocalShareContentViewHolder f158840e;

    /* renamed from: f */
    private final String f158841f;

    /* renamed from: g */
    private final ILocalSharePrepareContract.IView f158842g;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareContentDialog$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        m246794k();
        super.mo211606a();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        Activity bL_ = bL_();
        if (bL_ == null) {
            return true;
        }
        bL_.finish();
        return true;
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    private final void m246794k() {
        if (bL_() != null) {
            mo211630a(C60773o.m236126d(R.color.bg_float_base));
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.IShareContentDialog
    /* renamed from: d */
    public void mo214137d() {
        mo211630a(C60773o.m236126d(R.color.bg_body));
        LocalShareContentViewHolder hVar = this.f158840e;
        if (hVar == null) {
            Intrinsics.throwNpe();
        }
        hVar.mo214179f();
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.IShareContentDialog
    /* renamed from: e */
    public void mo214138e() {
        mo211630a(C60773o.m236126d(R.color.bg_float_base));
        LocalShareContentViewHolder hVar = this.f158840e;
        if (hVar == null) {
            Intrinsics.throwNpe();
        }
        hVar.mo214180g();
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalShareContentDialog
    /* renamed from: a */
    public void mo217763a(boolean z) {
        LocalShareContentViewHolder hVar = this.f158840e;
        if (hVar != null) {
            hVar.mo217829a(z);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        LocalShareContentViewHolder hVar = new LocalShareContentViewHolder(this.f158842g);
        this.f158840e = hVar;
        if (hVar != null) {
            return hVar.mo214173a(null, activity, this);
        }
        return null;
    }

    public LocalShareContentDialog(Activity activity, String str, ILocalSharePrepareContract.IView bVar) {
        super(activity, false, (C61303k) null);
        this.f158841f = str;
        this.f158842g = bVar;
        mo211628a(activity);
    }
}
