package com.ss.android.lark.widget.light.span;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.light.listener.ISpanClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/widget/light/span/PhoneClickSpan;", "Landroid/text/style/ClickableSpan;", "mContext", "Landroid/content/Context;", "mPhoneNum", "", "(Landroid/content/Context;Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.span.h */
public final class PhoneClickSpan extends ClickableSpan {

    /* renamed from: a */
    private final Context f144220a;

    /* renamed from: b */
    private final String f144221b;

    public int hashCode() {
        return this.f144221b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PhoneClickSpan) && !(!Intrinsics.areEqual(this.f144221b, ((PhoneClickSpan) obj).f144221b))) {
            return true;
        }
        return false;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setColor(UIUtils.getColor(this.f144220a, R.color.text_link_normal));
        textPaint.setUnderlineText(false);
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        if (view instanceof ISpanClickListener) {
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                ((ISpanClickListener) view).mo122867b(view, this.f144221b);
                return;
            }
            ((ISpanClickListener) view).mo122866a(view, this.f144221b);
        }
    }

    public PhoneClickSpan(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(str, "mPhoneNum");
        this.f144220a = context;
        this.f144221b = str;
    }
}
