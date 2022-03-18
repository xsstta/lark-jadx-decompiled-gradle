package com.ss.android.vc.meeting.module.localshare;

import android.app.Activity;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0014H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "activity", "Landroid/app/Activity;", ShareHitPoint.f121868c, "", "localSharePrepareView", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "localShareCodeViewHolder", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder;", "getLocalSharePrepareView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "mStatusBarColor", "", "getSource", "()Ljava/lang/String;", "beforeDialogDismiss", "", "couldDialogInterceptTouchEvent", "", "gravity", "y", "createContentView", "Landroid/view/View;", "customDialogHeight", "isLandscape", "dismiss", "onBackPressed", "onOrientationChanged", "setStatusBarWhenShow", "show", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.localshare.c */
public final class LocalShareCodeDialog extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    private LocalShareCodeViewHolder f156123d;

    /* renamed from: e */
    private int f156124e = -1;

    /* renamed from: f */
    private final String f156125f;

    /* renamed from: g */
    private final ILocalSharePrepareContract.IView f156126g;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        LocalShareCodeViewHolder eVar = this.f156123d;
        if (eVar != null) {
            return eVar.mo215040j();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        mo211633b(this.f156124e);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    private final void m242732k() {
        if (bL_() != null) {
            Activity bL_ = bL_();
            Intrinsics.checkExpressionValueIsNotNull(bL_, "activity");
            Window window = bL_.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            this.f156124e = window.getStatusBarColor();
            bM_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        ViewParent viewParent;
        View b;
        m242732k();
        super.mo211606a();
        LocalShareCodeViewHolder eVar = this.f156123d;
        View view = null;
        if (eVar == null || (b = eVar.mo215032b()) == null) {
            viewParent = null;
        } else {
            viewParent = b.getParent();
        }
        if (viewParent instanceof View) {
            view = viewParent;
        }
        View view2 = view;
        if (view2 != null) {
            view2.setOnKeyListener(new View$OnKeyListenerC62150a(this));
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        IBinder iBinder;
        View b;
        super.dismiss();
        Object systemService = bL_().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null) {
                LocalShareCodeViewHolder eVar = this.f156123d;
                if (eVar == null || (b = eVar.mo215032b()) == null) {
                    iBinder = null;
                } else {
                    iBinder = b.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        LocalShareCodeViewHolder eVar = new LocalShareCodeViewHolder(this.f156126g);
        this.f156123d = eVar;
        if (eVar != null) {
            return eVar.mo215028a(this.f153299a, activity, this);
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "keyCode", "", "keyEvent", "Landroid/view/KeyEvent;", "onKey"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.c$a */
    static final class View$OnKeyListenerC62150a implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ LocalShareCodeDialog f156127a;

        View$OnKeyListenerC62150a(LocalShareCodeDialog cVar) {
            this.f156127a = cVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f156127a.dismiss();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalShareCodeDialog(Activity activity, String str, ILocalSharePrepareContract.IView bVar) {
        super(activity, false, (C61303k) null);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f156125f = str;
        this.f156126g = bVar;
        LocalShareCodeViewHolder eVar = this.f156123d;
        if (eVar != null) {
            eVar.mo215031a(str);
        }
        mo211628a(activity);
    }
}
