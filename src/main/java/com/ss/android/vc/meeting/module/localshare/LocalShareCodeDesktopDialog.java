package com.ss.android.vc.meeting.module.localshare;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ui.DialogC57584b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeDesktopDialog;", "Lcom/ss/android/vc/meeting/basedialog/MeetingBaseDesktopDialog;", "activity", "Landroid/app/Activity;", ShareHitPoint.f121868c, "", "localSharePrepareView", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "localShareCodeViewHolder", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder;", "getLocalShareCodeViewHolder", "()Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder;", "setLocalShareCodeViewHolder", "(Lcom/ss/android/vc/meeting/module/localshare/LocalShareCodeViewHolder;)V", "getLocalSharePrepareView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "getSource", "()Ljava/lang/String;", "contentView", "Landroid/view/View;", "dismiss", "", "onDialogDismiss", "setLayoutparams", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.localshare.b */
public final class LocalShareCodeDesktopDialog extends MeetingBaseDesktopDialog {

    /* renamed from: a */
    private LocalShareCodeViewHolder f156120a;

    /* renamed from: b */
    private final String f156121b;

    /* renamed from: c */
    private final ILocalSharePrepareContract.IView f156122c;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        LocalShareCodeViewHolder eVar = new LocalShareCodeViewHolder(this.f156122c);
        this.f156120a = eVar;
        if (eVar != null) {
            return eVar.mo215028a(mo211719j(), mo211718i(), this);
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        IBinder iBinder;
        View b;
        super.dismiss();
        Object systemService = mo211718i().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null) {
                LocalShareCodeViewHolder eVar = this.f156120a;
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

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: f */
    public void mo211715f() {
        if (bJ_() != null) {
            DialogC57584b bJ_ = bJ_();
            if (bJ_ == null) {
                Intrinsics.throwNpe();
            }
            if (bJ_.getWindow() != null) {
                DialogC57584b bJ_2 = bJ_();
                if (bJ_2 == null) {
                    Intrinsics.throwNpe();
                }
                Window window = bJ_2.getWindow();
                if (window == null) {
                    Intrinsics.throwNpe();
                }
                window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.height = UIHelper.dp2px(640.0f);
                attributes.width = UIHelper.dp2px(540.0f);
                window.setAttributes(attributes);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalShareCodeDesktopDialog(Activity activity, String str, ILocalSharePrepareContract.IView bVar) {
        super(activity, new C61303k(new VideoChat()), false);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f156121b = str;
        this.f156122c = bVar;
        bK_();
        LocalShareCodeViewHolder eVar = this.f156120a;
        if (eVar != null) {
            eVar.mo215031a(str);
        }
    }
}
