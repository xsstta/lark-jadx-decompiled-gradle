package com.bytedance.ee.bear.widgets.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/BaseDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "mOnCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "mOnDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "mOnShowListener", "Landroid/content/DialogInterface$OnShowListener;", "setOnCancelListener", "", "listener", "setOnDismissListener", "setOnShowListener", "show", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.dialog.a */
public class BaseDialog extends Dialog {

    /* renamed from: a */
    private DialogInterface.OnDismissListener f31915a;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f31916b;

    /* renamed from: c */
    private DialogInterface.OnShowListener f31917c;

    public void show() {
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null || !activity.isFinishing()) {
            super.show();
        } else {
            C13479a.m54758a("BaseDialog", "activity already finish");
        }
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.f31916b = onCancelListener;
        super.setOnCancelListener(new WrappedCancelListener(onCancelListener));
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f31915a = onDismissListener;
        super.setOnDismissListener(new WrappedDismissDialogListener(onDismissListener));
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f31917c = onShowListener;
        super.setOnShowListener(new WrappedShowListener(onShowListener));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
