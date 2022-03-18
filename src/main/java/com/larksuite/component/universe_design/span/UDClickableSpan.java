package com.larksuite.component.universe_design.span;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/universe_design/span/UDClickableSpan;", "Landroid/text/style/ClickableSpan;", "mTextColor", "", "clickListener", "Landroid/view/View$OnClickListener;", "(ILandroid/view/View$OnClickListener;)V", "mHasUnderLine", "", "hasUnderLine", "onClick", "", "widget", "Landroid/view/View;", "setHasUnderLine", "updateDrawState", "ds", "Landroid/text/TextPaint;", "universe-ui-span_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.e.a */
public class UDClickableSpan extends ClickableSpan {

    /* renamed from: a */
    private boolean f63361a;

    /* renamed from: b */
    private int f63362b;

    /* renamed from: c */
    private View.OnClickListener f63363c;

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        this.f63363c.onClick(view);
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        textPaint.setColor(this.f63362b);
        textPaint.setUnderlineText(this.f63361a);
    }

    public UDClickableSpan(int i, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        this.f63362b = i;
        this.f63363c = onClickListener;
    }
}
