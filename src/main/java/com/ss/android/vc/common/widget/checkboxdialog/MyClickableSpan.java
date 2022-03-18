package com.ss.android.vc.common.widget.checkboxdialog;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.vc.common.widget.checkboxdialog.LKUICheckBoxDialogController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B9\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/common/widget/checkboxdialog/MyClickableSpan;", "Landroid/text/style/ClickableSpan;", "url", "", "listener", "Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnJumpListener;", "(Ljava/lang/String;Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnJumpListener;)V", "eventName", "eventActionName", "envID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/vc/common/widget/checkboxdialog/LKUICheckBoxDialogController$OnJumpListener;)V", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.b.c */
public final class MyClickableSpan extends ClickableSpan {

    /* renamed from: a */
    private String f152319a;

    /* renamed from: b */
    private LKUICheckBoxDialogController.OnJumpListener f152320b;

    /* renamed from: c */
    private String f152321c;

    /* renamed from: d */
    private String f152322d;

    /* renamed from: e */
    private String f152323e;

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        LKUICheckBoxDialogController.OnJumpListener bVar = this.f152320b;
        if (bVar != null) {
            if (bVar != null) {
                bVar.mo208651a(this.f152319a);
            }
            LKUICheckBoxDialogController.OnJumpListener bVar2 = this.f152320b;
            if (bVar2 != null) {
                bVar2.mo208652a(this.f152321c, this.f152322d, this.f152323e);
            }
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        textPaint.setColor(Color.parseColor("#4e83fd"));
        textPaint.setUnderlineText(false);
    }

    public MyClickableSpan(String str, String str2, String str3, String str4, LKUICheckBoxDialogController.OnJumpListener bVar) {
        this.f152319a = str;
        this.f152321c = str2;
        this.f152322d = str3;
        this.f152323e = str4;
        this.f152320b = bVar;
    }
}
