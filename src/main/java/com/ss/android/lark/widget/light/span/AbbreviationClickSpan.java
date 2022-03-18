package com.ss.android.lark.widget.light.span;

import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.light.listener.ISpanClickListener;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/widget/light/span/AbbreviationClickSpan;", "Landroid/text/style/ClickableSpan;", "mAbbreviationInfo", "Lcom/ss/android/lark/widget/span/AbbreviationInfo;", "(Lcom/ss/android/lark/widget/span/AbbreviationInfo;)V", "equals", "", "other", "", "hashCode", "", "onClick", "", "widget", "Landroid/view/View;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.span.a */
public final class AbbreviationClickSpan extends ClickableSpan {

    /* renamed from: a */
    private final AbbreviationInfo f144206a;

    public int hashCode() {
        return this.f144206a.hashCode();
    }

    public AbbreviationClickSpan(AbbreviationInfo abbreviationInfo) {
        Intrinsics.checkParameterIsNotNull(abbreviationInfo, "mAbbreviationInfo");
        this.f144206a = abbreviationInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AbbreviationClickSpan) && !(!Intrinsics.areEqual(this.f144206a, ((AbbreviationClickSpan) obj).f144206a))) {
            return true;
        }
        return false;
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        if (view instanceof ISpanClickListener) {
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                return;
            }
            ISpanClickListener iVar = (ISpanClickListener) view;
            iVar.onAbbreviationClick(view, this.f144206a, (float) iVar.getAcitonUpX(), (float) iVar.getActionUpY());
        }
    }
}
