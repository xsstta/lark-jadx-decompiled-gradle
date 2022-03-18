package com.ss.android.lark.widget.light.span;

import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.light.listener.ISpanClickListener;
import com.ss.android.lark.widget.span.IntentionInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/widget/light/span/IntentionClickSpan;", "Landroid/text/style/ClickableSpan;", "intentionInfo", "Lcom/ss/android/lark/widget/span/IntentionInfo;", "(Lcom/ss/android/lark/widget/span/IntentionInfo;)V", "equals", "", "other", "", "hashCode", "", "onClick", "", "widget", "Landroid/view/View;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.span.e */
public final class IntentionClickSpan extends ClickableSpan {

    /* renamed from: a */
    private final IntentionInfo f144213a;

    public int hashCode() {
        return this.f144213a.hashCode();
    }

    public IntentionClickSpan(IntentionInfo intentionInfo) {
        Intrinsics.checkParameterIsNotNull(intentionInfo, "intentionInfo");
        this.f144213a = intentionInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IntentionClickSpan) && !(!Intrinsics.areEqual(this.f144213a, ((IntentionClickSpan) obj).f144213a))) {
            return true;
        }
        return false;
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        if ((view instanceof ISpanClickListener) && view.getTag(R.id.tag_long_press) == null) {
            ((ISpanClickListener) view).mo122884a(view, this.f144213a);
        }
    }
}
