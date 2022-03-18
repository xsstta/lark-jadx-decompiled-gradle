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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/widget/light/span/MentionClickSpan;", "Landroid/text/style/ClickableSpan;", "context", "Landroid/content/Context;", "id", "", "name", "isAuthorized", "", "url", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "equals", "other", "", "hashCode", "", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.span.g */
public final class MentionClickSpan extends ClickableSpan {

    /* renamed from: a */
    private final Context f144215a;

    /* renamed from: b */
    private final String f144216b;

    /* renamed from: c */
    private final String f144217c;

    /* renamed from: d */
    private final boolean f144218d;

    /* renamed from: e */
    private final String f144219e;

    public int hashCode() {
        int i;
        int hashCode = ((((this.f144216b.hashCode() * 31) + this.f144217c.hashCode()) * 31) + Boolean.valueOf(this.f144218d).hashCode()) * 31;
        String str = this.f144219e;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionClickSpan)) {
            return false;
        }
        MentionClickSpan gVar = (MentionClickSpan) obj;
        if (!(!Intrinsics.areEqual(this.f144216b, gVar.f144216b)) && !(!Intrinsics.areEqual(this.f144217c, gVar.f144217c)) && this.f144218d == gVar.f144218d && !(!Intrinsics.areEqual(this.f144219e, gVar.f144219e))) {
            return true;
        }
        return false;
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        if (view instanceof ISpanClickListener) {
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                ((ISpanClickListener) view).mo122873a(view, this.f144216b, this.f144217c, this.f144218d);
                return;
            }
            ((ISpanClickListener) view).mo122872a(view, this.f144216b, this.f144217c, this.f144218d, this.f144219e);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        super.updateDrawState(textPaint);
        if (this.f144218d) {
            textPaint.setColor(UIUtils.getColor(this.f144215a, R.color.text_link_hover));
        } else {
            textPaint.setColor(UIUtils.getColor(this.f144215a, R.color.ud_N650));
        }
        textPaint.setUnderlineText(false);
    }

    public MentionClickSpan(Context context, String str, String str2, boolean z, String str3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        this.f144215a = context;
        this.f144216b = str;
        this.f144217c = str2;
        this.f144218d = z;
        this.f144219e = str3;
    }
}
