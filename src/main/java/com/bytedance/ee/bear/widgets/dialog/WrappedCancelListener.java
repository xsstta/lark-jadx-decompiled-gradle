package com.bytedance.ee.bear.widgets.dialog;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/WrappedCancelListener;", "Landroid/content/DialogInterface$OnCancelListener;", "delegate", "(Landroid/content/DialogInterface$OnCancelListener;)V", "weakRef", "Ljava/lang/ref/WeakReference;", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.dialog.b */
public final class WrappedCancelListener implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private WeakReference<DialogInterface.OnCancelListener> f31930a;

    public WrappedCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.f31930a = new WeakReference<>(onCancelListener);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f31930a.get();
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
