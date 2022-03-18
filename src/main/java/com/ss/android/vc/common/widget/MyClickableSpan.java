package com.ss.android.vc.common.widget;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.vc.common.widget.LKVCJumpDialogController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/common/widget/MyClickableSpan;", "Landroid/text/style/ClickableSpan;", "listener", "Lcom/ss/android/vc/common/widget/LKVCJumpDialogController$OnJumpListener;", "(Lcom/ss/android/vc/common/widget/LKVCJumpDialogController$OnJumpListener;)V", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.e */
public final class MyClickableSpan extends ClickableSpan {

    /* renamed from: a */
    private final LKVCJumpDialogController.OnJumpListener f152354a;

    public MyClickableSpan(LKVCJumpDialogController.OnJumpListener aVar) {
        this.f152354a = aVar;
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        LKVCJumpDialogController.OnJumpListener aVar = this.f152354a;
        if (aVar != null) {
            aVar.onJump();
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        textPaint.setColor(Color.parseColor("#4e83fd"));
        textPaint.setUnderlineText(false);
    }
}
