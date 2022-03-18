package com.ss.android.lark.widget.light.span;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.light.listener.ISpanClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/widget/light/span/AtClickSpan;", "Landroid/text/style/ClickableSpan;", "mUserName", "", "mUserId", "mAtColor", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "equals", "", "other", "", "hashCode", "onClick", "", "widget", "Landroid/view/View;", "setAtColor", "color", "updateDrawState", "ds", "Landroid/text/TextPaint;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.span.b */
public final class AtClickSpan extends ClickableSpan {

    /* renamed from: a */
    private final String f144207a;

    /* renamed from: b */
    private final String f144208b;

    /* renamed from: c */
    private int f144209c;

    public int hashCode() {
        return (((this.f144207a.hashCode() * 31) + this.f144208b.hashCode()) * 31) + this.f144209c;
    }

    /* renamed from: a */
    public final void mo198172a(int i) {
        this.f144209c = i;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f144209c);
        textPaint.setUnderlineText(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtClickSpan)) {
            return false;
        }
        AtClickSpan bVar = (AtClickSpan) obj;
        if (!(!Intrinsics.areEqual(this.f144207a, bVar.f144207a)) && !(!Intrinsics.areEqual(this.f144208b, bVar.f144208b)) && this.f144209c == bVar.f144209c) {
            return true;
        }
        return false;
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        if (view instanceof ISpanClickListener) {
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                if (((ISpanClickListener) view).mo122871b(view, this.f144207a, this.f144208b)) {
                    view.performHapticFeedback(0);
                    return;
                }
                return;
            }
            ((ISpanClickListener) view).mo122870a(view, this.f144207a, this.f144208b);
        }
    }

    public AtClickSpan(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "mUserName");
        Intrinsics.checkParameterIsNotNull(str2, "mUserId");
        this.f144207a = str;
        this.f144208b = str2;
        this.f144209c = i;
    }
}
