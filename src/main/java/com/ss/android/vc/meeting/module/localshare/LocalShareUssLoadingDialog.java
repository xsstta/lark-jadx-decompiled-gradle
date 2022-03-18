package com.ss.android.vc.meeting.module.localshare;

import android.app.Activity;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u000bH\u0014J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0016R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareUssLoadingDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "activity", "Landroid/app/Activity;", "view", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "onUssRecvCallback", "Lkotlin/Function2;", "", "", "", "getView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "viewHolder", "Lcom/ss/android/vc/meeting/module/localshare/UssLoadingPageViewHolder;", "beforeDialogDismiss", "createContentView", "Landroid/view/View;", "onOrientationChanged", "isLandscape", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.localshare.j */
public final class LocalShareUssLoadingDialog extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    private UssLoadingPageViewHolder f156187d = new UssLoadingPageViewHolder(this);

    /* renamed from: e */
    private final Function2<Boolean, String, Unit> f156188e;

    /* renamed from: f */
    private final ILocalSharePrepareContract.IView f156189f;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    public final ILocalSharePrepareContract.IView mo215092k() {
        return this.f156189f;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        this.f156187d.mo215095a();
        ILocalSharePrepareContract.IView bVar = this.f156189f;
        if (bVar != null) {
            bVar.mo217797a((Function2<? super Boolean, ? super String, Unit>) null);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        return this.f156187d.mo215094a(activity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "success", "", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.j$a */
    static final class C62180a extends Lambda implements Function2<Boolean, String, Unit> {
        final /* synthetic */ LocalShareUssLoadingDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62180a(LocalShareUssLoadingDialog jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Boolean bool, String str) {
            invoke(bool.booleanValue(), str);
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, String str) {
            this.this$0.dismiss();
            ILocalSharePrepareContract.IView k = this.this$0.mo215092k();
            if (k != null) {
                k.mo217807k();
            }
            if (!z) {
                C60738ac.m236024a(R.drawable.icon_toast_info, R.string.View_G_ShareScreen_UnableAutoConnectEnterCodeID_Toast, 3000);
            }
        }
    }

    public LocalShareUssLoadingDialog(Activity activity, ILocalSharePrepareContract.IView bVar) {
        super(activity, false, (C61303k) null);
        this.f156189f = bVar;
        C62180a aVar = new C62180a(this);
        this.f156188e = aVar;
        if (bVar != null) {
            bVar.mo217797a(aVar);
        }
        mo211628a(activity);
    }
}
