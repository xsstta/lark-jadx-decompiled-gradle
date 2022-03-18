package com.ss.android.lark.widget.light.span;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.listener.ISpanClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/widget/light/span/HashTagClickSpan;", "Landroid/text/style/ClickableSpan;", "id", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getId", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.span.c */
public final class HashTagClickSpan extends ClickableSpan {

    /* renamed from: a */
    private final String f144210a;

    /* renamed from: b */
    private final String f144211b;

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        textPaint.setColor(UIHelper.getColor(R.color.text_link_normal));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        if (view instanceof ISpanClickListener) {
            ISpanClickListener iVar = (ISpanClickListener) view;
            iVar.a_(view, this.f144210a, this.f144211b);
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                iVar.a_(view, this.f144210a, this.f144211b);
                return;
            }
            iVar.b_(view, this.f144210a, this.f144211b);
        }
    }

    public HashTagClickSpan(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        this.f144210a = str;
        this.f144211b = str2;
    }
}
