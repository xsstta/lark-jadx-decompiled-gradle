package com.ss.android.vc.meeting.module.localshare;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareUssLoadingDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog;", "activity", "Landroid/app/Activity;", "view", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "onUssRecvCallback", "Lkotlin/Function2;", "", "", "", "getView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "viewHolder", "Lcom/ss/android/vc/meeting/module/localshare/UssLoadingPageViewHolder;", "getViewHolder", "()Lcom/ss/android/vc/meeting/module/localshare/UssLoadingPageViewHolder;", "contentView", "Landroid/view/View;", "dismiss", "onDialogDismiss", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.localshare.i */
public final class LocalShareUssLoadingDesktopDialog extends MeetingBaseDesktopDialog {

    /* renamed from: a */
    private final Function2<Boolean, String, Unit> f156184a;

    /* renamed from: b */
    private final UssLoadingPageViewHolder f156185b;

    /* renamed from: c */
    private final ILocalSharePrepareContract.IView f156186c;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
    }

    /* renamed from: k */
    public final ILocalSharePrepareContract.IView mo215090k() {
        return this.f156186c;
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        return this.f156185b.mo215094a(mo211718i());
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        super.dismiss();
        this.f156185b.mo215095a();
        ILocalSharePrepareContract.IView bVar = this.f156186c;
        if (bVar != null) {
            bVar.mo217797a((Function2<? super Boolean, ? super String, Unit>) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.i$a */
    static final class C62179a extends Lambda implements Function2<Boolean, String, Unit> {
        final /* synthetic */ LocalShareUssLoadingDesktopDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62179a(LocalShareUssLoadingDesktopDialog iVar) {
            super(2);
            this.this$0 = iVar;
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
            ILocalSharePrepareContract.IView k = this.this$0.mo215090k();
            if (k != null) {
                k.mo217806j();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalShareUssLoadingDesktopDialog(Activity activity, ILocalSharePrepareContract.IView bVar) {
        super(activity, new C61303k(new VideoChat()), false);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f156186c = bVar;
        C62179a aVar = new C62179a(this);
        this.f156184a = aVar;
        if (bVar != null) {
            bVar.mo217797a(aVar);
        }
        bK_();
        this.f156185b = new UssLoadingPageViewHolder(this);
    }
}
