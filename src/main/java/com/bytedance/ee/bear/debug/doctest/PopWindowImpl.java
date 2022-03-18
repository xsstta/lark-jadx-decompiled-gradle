package com.bytedance.ee.bear.debug.doctest;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl;", "Lcom/bytedance/ee/bear/debug/doctest/IPopWindow;", "mContext", "Landroid/content/Context;", "dialogListener", "Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl$DialogDismiss;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl$DialogDismiss;)V", "getDialogListener", "()Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl$DialogDismiss;", "mDialog", "Landroid/app/Dialog;", "mPopView", "Landroid/view/View;", "buildPopWindow", "getReadedView", "Landroid/widget/TextView;", "getTotalView", "hide", "", "show", "DialogDismiss", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.doctest.h */
public final class PopWindowImpl implements IPopWindow {

    /* renamed from: a */
    private View f15124a;

    /* renamed from: b */
    private Dialog f15125b;

    /* renamed from: c */
    private final Context f15126c;

    /* renamed from: d */
    private final DialogDismiss f15127d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl$DialogDismiss;", "", "dismiss", "", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.h$a */
    public interface DialogDismiss {
        void dismiss();
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IPopWindow
    /* renamed from: b */
    public void mo21252b() {
    }

    /* renamed from: e */
    public final DialogDismiss mo21257e() {
        return this.f15127d;
    }

    /* renamed from: f */
    private final View m21608f() {
        View inflate = LayoutInflater.from(this.f15126c).inflate(R.layout.auto_run_dialog_view, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…to_run_dialog_view, null)");
        return inflate;
    }

    /* renamed from: c */
    public final TextView mo21255c() {
        View view = this.f15124a;
        if (view == null) {
            Intrinsics.throwNpe();
        }
        View findViewById = view.findViewById(R.id.total);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mPopView!!.findViewById(R.id.total)");
        return (TextView) findViewById;
    }

    /* renamed from: d */
    public final TextView mo21256d() {
        View view = this.f15124a;
        if (view == null) {
            Intrinsics.throwNpe();
        }
        View findViewById = view.findViewById(R.id.readed);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mPopView!!.findViewById(R.id.readed)");
        return (TextView) findViewById;
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IPopWindow
    /* renamed from: a */
    public void mo21251a() {
        if (this.f15124a == null) {
            this.f15124a = m21608f();
        }
        if (this.f15125b == null) {
            Dialog dialog = new Dialog(this.f15126c, R.style.loading_dialog);
            this.f15125b = dialog;
            if (dialog == null) {
                Intrinsics.throwNpe();
            }
            View view = this.f15124a;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            dialog.setContentView(view, new ViewGroup.LayoutParams(-1, -1));
        }
        Dialog dialog2 = this.f15125b;
        if (dialog2 == null) {
            Intrinsics.throwNpe();
        }
        dialog2.show();
        Dialog dialog3 = this.f15125b;
        if (dialog3 == null) {
            Intrinsics.throwNpe();
        }
        dialog3.setOnCancelListener(new DialogInterface$OnCancelListenerC5283b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/doctest/PopWindowImpl$show$1", "Landroid/content/DialogInterface$OnCancelListener;", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.h$b */
    public static final class DialogInterface$OnCancelListenerC5283b implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ PopWindowImpl f15128a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        DialogInterface$OnCancelListenerC5283b(PopWindowImpl hVar) {
            this.f15128a = hVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f15128a.mo21257e().dismiss();
        }
    }

    public PopWindowImpl(Context context, DialogDismiss aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "dialogListener");
        this.f15126c = context;
        this.f15127d = aVar;
    }
}
